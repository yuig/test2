package androidx.media3.exoplayer.mediacodec;

import androidx.media3.decoder.DecoderException;

/* loaded from: classes3.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* renamed from: a, reason: collision with root package name */
    public final int f18824a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MediaCodecDecoderException(java.lang.IllegalStateException r4, x7.n r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Decoder failed: "
            r0.<init>(r1)
            r1 = 0
            if (r5 != 0) goto Lc
            r5 = r1
            goto Le
        Lc:
            java.lang.String r5 = r5.f134049a
        Le:
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r3.<init>(r5, r4)
            boolean r5 = r4 instanceof android.media.MediaCodec.CodecException
            if (r5 == 0) goto L23
            r0 = r4
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            java.lang.String r1 = r0.getDiagnosticInfo()
        L23:
            int r0 = d7.n0.f53866a
            r2 = 23
            if (r0 < r2) goto L34
            if (r5 == 0) goto L32
            android.media.MediaCodec$CodecException r4 = (android.media.MediaCodec.CodecException) r4
            int r4 = r4.getErrorCode()
            goto L38
        L32:
            r4 = 0
            goto L38
        L34:
            int r4 = d7.n0.A(r1)
        L38:
            r3.f18824a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException.<init>(java.lang.IllegalStateException, x7.n):void");
    }
}
