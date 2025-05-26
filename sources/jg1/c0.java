package jg1;

import a.cb;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.util.Size;
import android.view.Surface;
import et1.j0;
import et1.m0;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* loaded from: classes5.dex */
public final class c0 implements g {
    public boolean A;
    public boolean B;
    public volatile boolean C;
    public boolean D;
    public boolean E;
    public long F;
    public final ConcurrentLinkedQueue G;
    public final ConcurrentLinkedQueue H;
    public Thread I;

    /* renamed from: J, reason: collision with root package name */
    public Throwable f75928J;
    public final ReentrantLock K;

    /* renamed from: a, reason: collision with root package name */
    public final tb0.h f75929a;

    /* renamed from: b, reason: collision with root package name */
    public final et1.j f75930b;

    /* renamed from: c, reason: collision with root package name */
    public final int f75931c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaFormat f75932d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f75933e;

    /* renamed from: f, reason: collision with root package name */
    public final String f75934f;

    /* renamed from: g, reason: collision with root package name */
    public final String f75935g;

    /* renamed from: h, reason: collision with root package name */
    public final List f75936h;

    /* renamed from: i, reason: collision with root package name */
    public final Size f75937i;

    /* renamed from: j, reason: collision with root package name */
    public final m0 f75938j;

    /* renamed from: k, reason: collision with root package name */
    public final long f75939k;

    /* renamed from: l, reason: collision with root package name */
    public final long f75940l;

    /* renamed from: m, reason: collision with root package name */
    public final long f75941m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f75942n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f75943o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f75944p;

    /* renamed from: q, reason: collision with root package name */
    public final vt1.a f75945q;

    /* renamed from: r, reason: collision with root package name */
    public final EGLContext f75946r;

    /* renamed from: s, reason: collision with root package name */
    public final int f75947s;

    /* renamed from: t, reason: collision with root package name */
    public final MediaCodec.BufferInfo f75948t;

    /* renamed from: u, reason: collision with root package name */
    public MediaCodec f75949u;

    /* renamed from: v, reason: collision with root package name */
    public MediaCodec f75950v;

    /* renamed from: w, reason: collision with root package name */
    public MediaFormat f75951w;

    /* renamed from: x, reason: collision with root package name */
    public e f75952x;

    /* renamed from: y, reason: collision with root package name */
    public f f75953y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f75954z;

    public c0(tb0.h crashReporting, et1.j mediaExtractor, int i13, MediaFormat outputFormat, Size outputResolution, String encoderName, String str, List bitmapConfigs, Size inputResolution, m0 muxRender, long j13, long j14, long j15, float[] exportMatrix, boolean z13, boolean z14, vt1.a decoderSurfaceFactory, EGLContext eGLContext, int i14) {
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(mediaExtractor, "mediaExtractor");
        Intrinsics.checkNotNullParameter(outputFormat, "outputFormat");
        Intrinsics.checkNotNullParameter(outputResolution, "outputResolution");
        Intrinsics.checkNotNullParameter(encoderName, "encoderName");
        Intrinsics.checkNotNullParameter(bitmapConfigs, "bitmapConfigs");
        Intrinsics.checkNotNullParameter(inputResolution, "inputResolution");
        Intrinsics.checkNotNullParameter(muxRender, "muxRender");
        Intrinsics.checkNotNullParameter(exportMatrix, "exportMatrix");
        Intrinsics.checkNotNullParameter(decoderSurfaceFactory, "decoderSurfaceFactory");
        this.f75929a = crashReporting;
        this.f75930b = mediaExtractor;
        this.f75931c = i13;
        this.f75932d = outputFormat;
        this.f75933e = outputResolution;
        this.f75934f = encoderName;
        this.f75935g = str;
        this.f75936h = bitmapConfigs;
        this.f75937i = inputResolution;
        this.f75938j = muxRender;
        this.f75939k = j13;
        this.f75940l = j14;
        this.f75941m = j15;
        this.f75942n = exportMatrix;
        this.f75943o = z13;
        this.f75944p = z14;
        this.f75945q = decoderSurfaceFactory;
        this.f75946r = eGLContext;
        this.f75947s = i14;
        this.f75948t = new MediaCodec.BufferInfo();
        this.G = new ConcurrentLinkedQueue();
        this.H = new ConcurrentLinkedQueue();
        this.K = new ReentrantLock();
    }

    @Override // jg1.g
    public final void a() {
        this.f75954z = true;
        this.A = true;
        this.B = true;
        this.C = true;
        Thread thread = this.I;
        if (thread != null) {
            thread.join(10000L);
        }
    }

    @Override // jg1.g
    public final boolean b() {
        return this.C;
    }

    @Override // jg1.g
    public final boolean c() {
        ReentrantLock reentrantLock = this.K;
        reentrantLock.lock();
        try {
            boolean z13 = false;
            if (this.C) {
                reentrantLock.unlock();
                return false;
            }
            Throwable th3 = this.f75928J;
            if (th3 != null) {
                this.f75928J = null;
                throw th3;
            }
            while (h() != 0) {
                z13 = true;
            }
            while (i() != 0) {
                z13 = true;
            }
            Throwable th4 = this.f75928J;
            if (th4 == null) {
                reentrantLock.unlock();
                return z13;
            }
            this.f75928J = null;
            throw th4;
        } catch (Throwable th5) {
            reentrantLock.unlock();
            throw th5;
        }
    }

    @Override // jg1.g
    public final void cancel() {
        this.C = true;
        e eVar = this.f75952x;
        if (eVar != null) {
            eVar.b();
        }
    }

    public final void d(MediaFormat mediaFormat) {
        this.f75950v = mg1.b.d(this.f75934f);
        String str = "VideoComposer::setUp|outputFormat=" + this.f75932d;
        tb0.h hVar = this.f75929a;
        hVar.h(str);
        MediaCodec b13 = mg1.b.b(this.f75929a, "VideoComposer encoder", this.f75950v, this.f75932d, null, true);
        this.f75950v = b13;
        Intrinsics.f(b13);
        Surface createInputSurface = b13.createInputSurface();
        Intrinsics.checkNotNullExpressionValue(createInputSurface, "createInputSurface(...)");
        f fVar = new f(createInputSurface, this.f75946r);
        this.f75953y = fVar;
        EGLDisplay eGLDisplay = fVar.f75994b;
        EGLSurface eGLSurface = fVar.f75996d;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, fVar.f75995c)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
        MediaCodec mediaCodec = this.f75950v;
        if (mediaCodec != null) {
            mediaCodec.start();
        }
        this.E = true;
        Pair X = this.f75944p ? ig1.b.X() : null;
        this.f75945q.getClass();
        Size outputResolution = this.f75933e;
        Intrinsics.checkNotNullParameter(outputResolution, "outputResolution");
        Size inputResolution = this.f75937i;
        Intrinsics.checkNotNullParameter(inputResolution, "inputResolution");
        float[] exportMatrix = this.f75942n;
        Intrinsics.checkNotNullParameter(exportMatrix, "exportMatrix");
        List bitmapConfigs = this.f75936h;
        Intrinsics.checkNotNullParameter(bitmapConfigs, "bitmapConfigs");
        e eVar = new e(outputResolution, inputResolution, this.f75935g, exportMatrix, bitmapConfigs, X);
        this.f75952x = eVar;
        hVar.h("VideoComposer::setUp|inputFormat=" + mediaFormat);
        eVar.f75991y = this.f75947s;
        String string = mediaFormat.getString("mime");
        if (string == null) {
            string = "";
        }
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(string);
        this.f75949u = createDecoderByType;
        MediaCodec b14 = mg1.b.b(this.f75929a, "VideoComposer decoder", createDecoderByType, mediaFormat, eVar.f75977k, false);
        this.f75949u = b14;
        if (b14 != null) {
            b14.start();
        }
        this.D = true;
    }

    public final int e(long j13) {
        boolean z13 = false;
        if (this.A) {
            return 0;
        }
        MediaCodec mediaCodec = this.f75949u;
        Intrinsics.f(mediaCodec);
        MediaCodec.BufferInfo bufferInfo = this.f75948t;
        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j13);
        if (dequeueOutputBuffer == -3 || dequeueOutputBuffer == -2) {
            return 1;
        }
        if (dequeueOutputBuffer == -1) {
            return 0;
        }
        if ((bufferInfo.flags & 4) != 0) {
            MediaCodec mediaCodec2 = this.f75950v;
            Intrinsics.f(mediaCodec2);
            mediaCodec2.signalEndOfInputStream();
            this.A = true;
            bufferInfo.size = 0;
        }
        int i13 = bufferInfo.size;
        long j14 = this.f75939k;
        if (i13 > 0) {
            long j15 = bufferInfo.presentationTimeUs;
            if (j15 >= j14) {
                long j16 = this.f75940l;
                if (j15 <= j16 || j16 == -1) {
                    z13 = true;
                }
            }
        }
        MediaCodec mediaCodec3 = this.f75949u;
        if (mediaCodec3 != null) {
            mediaCodec3.releaseOutputBuffer(dequeueOutputBuffer, z13);
        }
        if (!z13) {
            long j17 = bufferInfo.presentationTimeUs;
            if (j17 == 0) {
                return 2;
            }
            this.F = j17;
            return 2;
        }
        e eVar = this.f75952x;
        if (eVar != null) {
            eVar.a();
        }
        long j18 = (this.f75941m + bufferInfo.presentationTimeUs) - j14;
        e eVar2 = this.f75952x;
        if (eVar2 != null) {
            eVar2.c(j18);
        }
        f fVar = this.f75953y;
        if (fVar != null) {
            EGLExt.eglPresentationTimeANDROID(fVar.f75994b, fVar.f75996d, j18 * 1000);
        }
        f fVar2 = this.f75953y;
        if (fVar2 == null) {
            return 2;
        }
        EGL14.eglSwapBuffers(fVar2.f75994b, fVar2.f75996d);
        return 2;
    }

    @Override // jg1.g
    public final void f() {
        et1.j jVar = this.f75930b;
        int i13 = this.f75931c;
        jVar.c(i13);
        MediaFormat a13 = jVar.a(i13);
        if (a13.containsKey("rotation-degrees")) {
            a13.setInteger("rotation-degrees", 0);
        }
        CompletableFuture completableFuture = new CompletableFuture();
        Thread thread = new Thread(new ja.y(this, a13, completableFuture, 26));
        this.I = thread;
        thread.setUncaughtExceptionHandler(new uv.d(this, 4));
        Thread thread2 = this.I;
        Intrinsics.f(thread2);
        thread2.start();
        completableFuture.get(10L, TimeUnit.SECONDS);
    }

    public final int g() {
        if (this.B) {
            return 0;
        }
        MediaCodec mediaCodec = this.f75950v;
        Intrinsics.f(mediaCodec);
        MediaCodec.BufferInfo bufferInfo = this.f75948t;
        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
        if (dequeueOutputBuffer != -3) {
            if (dequeueOutputBuffer != -2) {
                if (dequeueOutputBuffer == -1) {
                    return 0;
                }
                if (this.f75951w == null) {
                    MediaCodec mediaCodec2 = this.f75950v;
                    Intrinsics.f(mediaCodec2);
                    this.f75951w = mediaCodec2.getOutputFormat();
                }
                MediaCodec mediaCodec3 = this.f75950v;
                Intrinsics.f(mediaCodec3);
                ByteBuffer outputBuffer = mediaCodec3.getOutputBuffer(dequeueOutputBuffer);
                Intrinsics.f(outputBuffer);
                int i13 = bufferInfo.flags;
                int i14 = i13 & 4;
                ConcurrentLinkedQueue concurrentLinkedQueue = this.H;
                if (i14 != 0) {
                    this.B = true;
                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                    bufferInfo2.set(0, 0, 0L, 4);
                    concurrentLinkedQueue.add(new w(dequeueOutputBuffer, bufferInfo2, outputBuffer));
                    return 2;
                }
                if ((i13 & 2) != 0) {
                    MediaCodec mediaCodec4 = this.f75950v;
                    Intrinsics.f(mediaCodec4);
                    mediaCodec4.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return 1;
                }
                MediaCodec.BufferInfo bufferInfo3 = new MediaCodec.BufferInfo();
                w wVar = new w(dequeueOutputBuffer, bufferInfo3, outputBuffer);
                bufferInfo3.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                concurrentLinkedQueue.add(wVar);
                this.F = bufferInfo3.presentationTimeUs;
                return 2;
            }
            MediaFormat mediaFormat = this.f75951w;
            if (mediaFormat != null) {
                MediaCodec mediaCodec5 = this.f75950v;
                Intrinsics.f(mediaCodec5);
                if (!Intrinsics.d(mediaFormat, mediaCodec5.getOutputFormat())) {
                    throw new RuntimeException("Video output format changed twice.");
                }
            }
            MediaCodec mediaCodec6 = this.f75950v;
            Intrinsics.f(mediaCodec6);
            this.f75951w = mediaCodec6.getOutputFormat();
        }
        return 1;
    }

    public final int h() {
        if (!this.f75954z) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.G;
            if (!concurrentLinkedQueue.isEmpty()) {
                et1.j jVar = this.f75930b;
                int sampleTrackIndex = jVar.f60034a.getSampleTrackIndex();
                if (sampleTrackIndex < 0) {
                    h hVar = (h) concurrentLinkedQueue.remove();
                    this.f75954z = true;
                    MediaCodec mediaCodec = this.f75949u;
                    Intrinsics.f(mediaCodec);
                    mediaCodec.queueInputBuffer(hVar.f75998b, 0, 0, 0L, 4);
                    return 2;
                }
                if (sampleTrackIndex != this.f75931c) {
                    return 0;
                }
                h hVar2 = (h) concurrentLinkedQueue.remove();
                ByteBuffer byteBuf = hVar2.f75997a;
                Intrinsics.checkNotNullParameter(byteBuf, "byteBuf");
                int readSampleData = jVar.f60034a.readSampleData(byteBuf, 0);
                int i13 = (jVar.f60034a.getSampleFlags() & 1) != 0 ? 1 : 0;
                MediaCodec mediaCodec2 = this.f75949u;
                Intrinsics.f(mediaCodec2);
                mediaCodec2.queueInputBuffer(hVar2.f75998b, 0, readSampleData, jVar.f60034a.getSampleTime(), i13);
                jVar.f60034a.advance();
                return 2;
            }
        }
        return 0;
    }

    public final int i() {
        MediaFormat mediaFormat;
        MediaFormat mediaFormat2;
        if (this.H.isEmpty()) {
            return 0;
        }
        while (!this.H.isEmpty()) {
            w wVar = (w) this.H.remove();
            if ((wVar.f76074a.flags & 4) != 0) {
                this.f75930b.e(this.f75931c);
                this.f75954z = true;
                this.C = true;
                v vVar = this.f75938j.f60047b;
                switch (vVar.f76065a) {
                    case 0:
                        mediaFormat2 = (MediaFormat) vVar.f76066b;
                        break;
                    default:
                        mediaFormat2 = (MediaFormat) vVar.f76066b;
                        break;
                }
                if (mediaFormat2 != null && this.f75943o) {
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    bufferInfo.set(0, 0, 0L, 4);
                    m0 m0Var = this.f75938j;
                    j0 j0Var = j0.VIDEO;
                    ByteBuffer allocate = ByteBuffer.allocate(0);
                    Intrinsics.checkNotNullExpressionValue(allocate, "allocate(...)");
                    m0Var.b(j0Var, allocate, bufferInfo);
                }
            } else {
                m0 m0Var2 = this.f75938j;
                v vVar2 = m0Var2.f60047b;
                switch (vVar2.f76065a) {
                    case 0:
                        mediaFormat = (MediaFormat) vVar2.f76066b;
                        break;
                    default:
                        mediaFormat = (MediaFormat) vVar2.f76066b;
                        break;
                }
                if (mediaFormat == null) {
                    j0 j0Var2 = j0.VIDEO;
                    MediaFormat mediaFormat3 = this.f75951w;
                    Intrinsics.f(mediaFormat3);
                    m0Var2.a(j0Var2, mediaFormat3);
                }
                m0Var2.b(j0.VIDEO, wVar.f76075b, wVar.f76074a);
            }
            MediaCodec mediaCodec = this.f75950v;
            Intrinsics.f(mediaCodec);
            mediaCodec.releaseOutputBuffer(wVar.f76076c, false);
        }
        return 2;
    }

    public final void j() {
        e eVar = this.f75952x;
        if (eVar != null) {
            eVar.e();
        }
        this.f75952x = null;
        f fVar = this.f75953y;
        if (fVar != null) {
            fVar.a();
        }
        this.f75953y = null;
        boolean z13 = this.D;
        tb0.h hVar = this.f75929a;
        if (z13) {
            try {
                MediaCodec mediaCodec = this.f75949u;
                if (mediaCodec != null) {
                    mediaCodec.stop();
                }
            } catch (IllegalStateException unused) {
                hVar.h("Decoder could not be stopped: invalid state");
            }
        }
        MediaCodec mediaCodec2 = this.f75949u;
        if (mediaCodec2 != null) {
            mediaCodec2.release();
        }
        this.f75949u = null;
        if (this.E) {
            try {
                MediaCodec mediaCodec3 = this.f75950v;
                if (mediaCodec3 != null) {
                    mediaCodec3.stop();
                }
            } catch (IllegalStateException unused2) {
                hVar.h("Encoder could not be stopped: invalid state");
            }
        }
        MediaCodec mediaCodec4 = this.f75950v;
        if (mediaCodec4 != null) {
            mediaCodec4.release();
        }
        this.f75950v = null;
    }

    public final String toString() {
        MediaCodec mediaCodec = this.f75949u;
        MediaCodec mediaCodec2 = this.f75950v;
        e eVar = this.f75952x;
        f fVar = this.f75953y;
        boolean z13 = this.f75954z;
        boolean z14 = this.C;
        boolean z15 = this.D;
        boolean z16 = this.A;
        boolean z17 = this.B;
        boolean z18 = this.E;
        long j13 = this.F;
        MediaFormat mediaFormat = this.f75932d;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.G;
        ConcurrentLinkedQueue concurrentLinkedQueue2 = this.H;
        Size size = this.f75933e;
        Size size2 = this.f75937i;
        MediaFormat mediaFormat2 = this.f75951w;
        int i13 = this.f75931c;
        long j14 = this.f75939k;
        long j15 = this.f75940l;
        long j16 = this.f75941m;
        boolean z19 = this.f75943o;
        et1.j jVar = this.f75930b;
        boolean z23 = this.f75944p;
        MediaCodec.BufferInfo bufferInfo = this.f75948t;
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        int i14 = bufferInfo.size;
        int i15 = bufferInfo.offset;
        String num = Integer.toString(bufferInfo.flags, CharsKt.checkRadix(2));
        Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        long j17 = bufferInfo.presentationTimeUs;
        StringBuilder t13 = a.a.t("size [", i14, "] offset [", i15, "] flag bits [");
        t13.append(num);
        t13.append("] presentationTimeUs [");
        t13.append(j17);
        t13.append("]");
        String sb3 = t13.toString();
        String str = this.f75934f;
        StringBuilder sb4 = new StringBuilder("ThreadedVideoComposer decoder [");
        sb4.append(mediaCodec);
        sb4.append("] encoder [");
        sb4.append(mediaCodec2);
        sb4.append("] decoder surface [");
        sb4.append(eVar);
        sb4.append("] encoder surface [");
        sb4.append(fVar);
        sb4.append("] extractor EOS [");
        a.c.v(sb4, z13, "] finished [", z14, "] decoder started [");
        a.c.v(sb4, z15, "] decoder EOS? [", z16, "] encoder EOS? [");
        a.c.v(sb4, z17, "] encoder started [", z18, "] time [");
        sb4.append(j13);
        sb4.append("] requested output format [");
        sb4.append(mediaFormat);
        sb4.append("] decoder input buffers [");
        sb4.append(concurrentLinkedQueue);
        sb4.append("] encoder output buffers [");
        sb4.append(concurrentLinkedQueue2);
        sb4.append("] output resolution [");
        sb4.append(size);
        sb4.append("] input resolution [");
        sb4.append(size2);
        sb4.append("] actual output format [");
        sb4.append(mediaFormat2);
        sb4.append("] track [");
        sb4.append(i13);
        cb.v(sb4, "] trim start [", j14, "] trim end [");
        sb4.append(j15);
        cb.v(sb4, "] presentationTimeOffsetUs [", j16, "] final media item? [");
        sb4.append(z19);
        sb4.append("] extractor [");
        sb4.append(jVar);
        sb4.append("] isFromFrontFacingCamera [");
        sb4.append(z23);
        sb4.append("] buffer info [");
        sb4.append(sb3);
        sb4.append("] encoder name [");
        return a.a.p(sb4, str, "]");
    }
}
