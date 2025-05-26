package net.quikkly.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import net.quikkly.android.render.RenderSvg;
import net.quikkly.android.scan.ConcurrentHolder;
import net.quikkly.android.scan.CpuCores;
import net.quikkly.android.scan.PipelineThread;
import net.quikkly.android.utils.AssetsUtils;
import net.quikkly.android.utils.BitmapUtils;
import net.quikkly.core.Pipeline;
import net.quikkly.core.QuikklyCore;
import net.quikkly.core.QuikklyException;
import net.quikkly.core.ScanResult;
import net.quikkly.core.Skin;

/* loaded from: classes4.dex */
public class Quikkly {
    public static final int CAMERA_IMAGE_FORMAT = 17;
    public static final String TAG = "quikkly";
    private static Quikkly instance;
    private long frameDelayMillis;
    private PipelineThreadListener listener;
    private ConcurrentHolder<byte[]> nextFrameWaitingForScan;
    private int numScannerThreads;
    private ArrayList<Pipeline> scannerPipelines;
    private ArrayList<PipelineThread> scannerThreads;
    private Pipeline singlePipeline;

    private Quikkly(String str, int i13, long j13) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Quikkly blueprint must be provided");
        }
        if (i13 < 1) {
            throw new IllegalArgumentException("NumScannerThreads must be positive");
        }
        this.numScannerThreads = i13;
        this.frameDelayMillis = j13;
        this.scannerPipelines = new ArrayList<>();
        try {
            Pipeline buildPipeline = QuikklyCore.buildPipeline(str);
            this.singlePipeline = buildPipeline;
            if (buildPipeline == null) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("Failed to build pipeline from provided blueprint (" + str.length() + " characters)");
            }
            for (int i14 = 0; i14 < i13; i14++) {
                Pipeline buildPipeline2 = QuikklyCore.buildPipeline(str);
                if (buildPipeline2 == null) {
                    Locale locale2 = Locale.US;
                    throw new IllegalArgumentException("Failed to build pipeline from provided blueprint (" + str.length() + " characters)");
                }
                this.scannerPipelines.add(buildPipeline2);
            }
            this.listener = null;
            this.nextFrameWaitingForScan = null;
            this.scannerThreads = new ArrayList<>();
        } catch (Exception e13) {
            Iterator<Pipeline> it = this.scannerPipelines.iterator();
            while (it.hasNext()) {
                it.next().release();
            }
            throw e13;
        }
    }

    private byte[] allocateFrame(int i13, int i14) {
        return new byte[((i13 * i14) * ImageFormat.getBitsPerPixel(17)) / 8];
    }

    public static synchronized void configureInstance(Context context, int i13, long j13) {
        synchronized (Quikkly.class) {
            configureInstance(context, "blueprint_default.json", i13, j13);
        }
    }

    public static synchronized Quikkly getInstance() {
        Quikkly quikkly;
        synchronized (Quikkly.class) {
            if (!isConfigured()) {
                throw new IllegalStateException("Quikkly instance has not been configured.");
            }
            quikkly = instance;
        }
        return quikkly;
    }

    public static synchronized boolean isConfigured() {
        boolean z13;
        synchronized (Quikkly.class) {
            z13 = instance != null;
        }
        return z13;
    }

    public static synchronized String versionString() {
        String versionString;
        synchronized (Quikkly.class) {
            versionString = QuikklyCore.versionString();
        }
        return versionString;
    }

    public synchronized void destroyScannerThreads() {
        try {
            pauseScannerThreads();
            if (this.listener != null) {
                this.listener = null;
                this.nextFrameWaitingForScan.terminateTakers();
                this.nextFrameWaitingForScan = null;
                Iterator<PipelineThread> it = this.scannerThreads.iterator();
                while (it.hasNext()) {
                    it.next().requestQuit();
                }
                this.scannerThreads.clear();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public Pair<String, Bitmap> generateBitmap(String str, BigInteger bigInteger, Skin skin, int i13, int i14) {
        String generateSvg = generateSvg(str, bigInteger, skin);
        if (TextUtils.isEmpty(generateSvg)) {
            return null;
        }
        return new Pair<>(generateSvg, RenderSvg.renderSvg(generateSvg, i13, i14));
    }

    public synchronized String generateSvg(String str, BigInteger bigInteger, Skin skin) {
        try {
            return this.singlePipeline.generateSvg(str, bigInteger, skin);
        } catch (IllegalArgumentException | QuikklyException e13) {
            Log.e(TAG, "Error generating tag", e13);
            return null;
        }
    }

    public synchronized String[] getTemplateIdentifiers() {
        try {
            String[] templateIdentifiers = this.singlePipeline.getTemplateIdentifiers();
            if (templateIdentifiers == null) {
                templateIdentifiers = new String[0];
            }
            return templateIdentifiers;
        } catch (IllegalArgumentException | QuikklyException e13) {
            Log.e(TAG, "Error getting template identifiers", e13);
            return new String[0];
        }
    }

    public synchronized BigInteger maxDataValue(String str) {
        return this.singlePipeline.maxDataValue(str);
    }

    public void offerFrame(byte[] bArr) {
        PipelineThreadListener pipelineThreadListener;
        if (bArr == null) {
            throw new IllegalArgumentException("Do not offer null frames.");
        }
        ConcurrentHolder<byte[]> concurrentHolder = this.nextFrameWaitingForScan;
        if (concurrentHolder == null) {
            Log.w(TAG, "Frame offered while next holder is null - scanner threads already stopped?");
            return;
        }
        byte[] offerReplace = concurrentHolder.offerReplace(bArr);
        if (offerReplace == null || (pipelineThreadListener = this.listener) == null) {
            return;
        }
        pipelineThreadListener.onFreeBuffer(offerReplace);
    }

    public synchronized void pauseScannerThreads() {
        ConcurrentHolder<byte[]> concurrentHolder = this.nextFrameWaitingForScan;
        if (concurrentHolder != null) {
            concurrentHolder.pauseOffers();
        }
    }

    public synchronized void prepareScannerThreads(int i13, int i14, PipelineThreadListener pipelineThreadListener) {
        try {
            if (i13 <= 0 || i14 <= 0) {
                throw new IllegalArgumentException("Frame size must be positive");
            }
            if (pipelineThreadListener == null) {
                throw new IllegalArgumentException("ScanResultListener must be provided");
            }
            if (this.listener != null) {
                throw new IllegalStateException("A ScanResultListener is already in place, scanning is ongoing. Destroy first to prepare again.");
            }
            this.listener = pipelineThreadListener;
            for (int i15 = 0; i15 < this.numScannerThreads + 1; i15++) {
                pipelineThreadListener.onFreeBuffer(allocateFrame(i13, i14));
            }
            ConcurrentHolder<byte[]> concurrentHolder = new ConcurrentHolder<>();
            this.nextFrameWaitingForScan = concurrentHolder;
            concurrentHolder.resumeOffers();
            for (int i16 = 0; i16 < this.numScannerThreads; i16++) {
                PipelineThread pipelineThread = new PipelineThread(i16, this.scannerPipelines.get(i16), i13, i14, this.nextFrameWaitingForScan, pipelineThreadListener, this.frameDelayMillis);
                this.scannerThreads.add(pipelineThread);
                pipelineThread.start();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized void resumeScannerThreads() {
        ConcurrentHolder<byte[]> concurrentHolder = this.nextFrameWaitingForScan;
        if (concurrentHolder != null) {
            concurrentHolder.resumeOffers();
        }
    }

    public synchronized ScanResult scanSingleImage(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Pair<byte[], Pair<Integer, Integer>> bitmapToRGBA = BitmapUtils.bitmapToRGBA(bitmap);
        if (bitmapToRGBA == null) {
            return null;
        }
        return this.singlePipeline.scanFrame((byte[]) bitmapToRGBA.first, 2, ((Integer) ((Pair) bitmapToRGBA.second).first).intValue(), ((Integer) ((Pair) bitmapToRGBA.second).second).intValue(), -1, false);
    }

    public static synchronized void configureInstance(Context context, String str, int i13, long j13) {
        synchronized (Quikkly.class) {
            if (isConfigured()) {
                throw new IllegalStateException("Quikkly instance has already been configured, don't configure it again.");
            }
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            if (i13 >= 1) {
                int numCpuCores = CpuCores.getNumCpuCores();
                try {
                    instance = new Quikkly(AssetsUtils.readUtf8FromAssets(context, str), numCpuCores > 0 ? Math.min(numCpuCores, i13) : 1, j13);
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Unable to load blueprint from Android assets file " + str);
                }
            } else {
                throw new IllegalArgumentException("maxScannerThreads must be at least 1.");
            }
        }
    }
}
