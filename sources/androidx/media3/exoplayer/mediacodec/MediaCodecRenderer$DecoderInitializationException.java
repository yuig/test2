package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.common.b;
import x7.n;

/* loaded from: classes.dex */
public class MediaCodecRenderer$DecoderInitializationException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f18825a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18826b;

    /* renamed from: c, reason: collision with root package name */
    public final n f18827c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18828d;

    public MediaCodecRenderer$DecoderInitializationException(int i13, b bVar, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z13) {
        this("Decoder init failed: [" + i13 + "], " + bVar, mediaCodecUtil$DecoderQueryException, bVar.f18765o, z13, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i13 < 0 ? "neg_" : "") + Math.abs(i13));
    }

    public static MediaCodecRenderer$DecoderInitializationException a(MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException) {
        return new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException.getMessage(), mediaCodecRenderer$DecoderInitializationException.getCause(), mediaCodecRenderer$DecoderInitializationException.f18825a, mediaCodecRenderer$DecoderInitializationException.f18826b, mediaCodecRenderer$DecoderInitializationException.f18827c, mediaCodecRenderer$DecoderInitializationException.f18828d);
    }

    public MediaCodecRenderer$DecoderInitializationException(b bVar, Exception exc, boolean z13, n nVar) {
        this("Decoder init failed: " + nVar.f134049a + ", " + bVar, exc, bVar.f18765o, z13, nVar, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : null);
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th3, String str2, boolean z13, n nVar, String str3) {
        super(str, th3);
        this.f18825a = str2;
        this.f18826b = z13;
        this.f18827c = nVar;
        this.f18828d = str3;
    }
}
