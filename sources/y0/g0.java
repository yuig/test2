package y0;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import android.util.Range;
import androidx.appcompat.app.j0;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;
import java.util.Objects;
import v.l0;

/* loaded from: classes2.dex */
public final class g0 extends j0 implements f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final l0 f136340d = new l0(8);

    /* renamed from: c, reason: collision with root package name */
    public final MediaCodecInfo.VideoCapabilities f136341c;

    public g0(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodecInfo.CodecCapabilities) this.f16057b).getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f136341c = videoCapabilities;
    }

    public static g0 B(e eVar) {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodec;
        LruCache lruCache = z0.a.f140507a;
        String str = eVar.f136320a;
        LruCache lruCache2 = z0.a.f140507a;
        synchronized (lruCache2) {
            mediaCodecInfo = (MediaCodecInfo) lruCache2.get(str);
        }
        try {
            if (mediaCodecInfo == null) {
                try {
                    mediaCodec = MediaCodec.createEncoderByType(str);
                    try {
                        MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
                        synchronized (lruCache2) {
                            lruCache2.put(str, codecInfo);
                        }
                        mediaCodec.release();
                        mediaCodecInfo = codecInfo;
                    } catch (Throwable th3) {
                        th = th3;
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw th;
                    }
                } catch (IOException | IllegalArgumentException e13) {
                    throw new InvalidConfigException(e13);
                }
            }
            return new g0(mediaCodecInfo, eVar.f136320a);
        } catch (Throwable th4) {
            th = th4;
            mediaCodec = null;
        }
    }

    @Override // y0.f0
    public final boolean a() {
        return true;
    }

    @Override // y0.f0
    public final Range b(int i13) {
        try {
            return this.f136341c.getSupportedWidthsFor(i13);
        } catch (Throwable th3) {
            if (th3 instanceof IllegalArgumentException) {
                throw th3;
            }
            throw new IllegalArgumentException(th3);
        }
    }

    @Override // y0.f0
    public final int c() {
        return this.f136341c.getHeightAlignment();
    }

    @Override // y0.f0
    public final boolean d(int i13, int i14) {
        return this.f136341c.isSizeSupported(i13, i14);
    }

    @Override // y0.f0
    public final int f() {
        return this.f136341c.getWidthAlignment();
    }

    @Override // y0.f0
    public final Range g() {
        return this.f136341c.getBitrateRange();
    }

    @Override // y0.f0
    public final Range h(int i13) {
        try {
            return this.f136341c.getSupportedHeightsFor(i13);
        } catch (Throwable th3) {
            if (th3 instanceof IllegalArgumentException) {
                throw th3;
            }
            throw new IllegalArgumentException(th3);
        }
    }

    @Override // y0.f0
    public final Range i() {
        return this.f136341c.getSupportedWidths();
    }

    @Override // y0.f0
    public final Range j() {
        return this.f136341c.getSupportedHeights();
    }
}
