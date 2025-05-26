package x7;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import d7.n0;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class w implements l {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f134107a;

    /* renamed from: b, reason: collision with root package name */
    public final j f134108b;

    public w(MediaCodec mediaCodec, j jVar) {
        this.f134107a = mediaCodec;
        this.f134108b = jVar;
        if (n0.f53866a < 35 || jVar == null) {
            return;
        }
        jVar.a(mediaCodec);
    }

    @Override // x7.l
    public final void a() {
        j jVar = this.f134108b;
        MediaCodec mediaCodec = this.f134107a;
        try {
            int i13 = n0.f53866a;
            if (i13 >= 30 && i13 < 33) {
                mediaCodec.stop();
            }
            if (i13 >= 35 && jVar != null) {
                jVar.c(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th3) {
            if (n0.f53866a >= 35 && jVar != null) {
                jVar.c(mediaCodec);
            }
            mediaCodec.release();
            throw th3;
        }
    }

    @Override // x7.l
    public final void b(int i13, k7.c cVar, long j13, int i14) {
        this.f134107a.queueSecureInputBuffer(i13, 0, cVar.f78450i, j13, i14);
    }

    @Override // x7.l
    public final void c(Bundle bundle) {
        this.f134107a.setParameters(bundle);
    }

    @Override // x7.l
    public final void d(int i13, int i14, int i15, long j13) {
        this.f134107a.queueInputBuffer(i13, 0, i14, j13, i15);
    }

    @Override // x7.l
    public final void e(n8.h hVar, Handler handler) {
        this.f134107a.setOnFrameRenderedListener(new a(this, hVar, 1), handler);
    }

    @Override // x7.l
    public final MediaFormat f() {
        return this.f134107a.getOutputFormat();
    }

    @Override // x7.l
    public final void flush() {
        this.f134107a.flush();
    }

    @Override // x7.l
    public final void g() {
        this.f134107a.detachOutputSurface();
    }

    @Override // x7.l
    public final void h(int i13) {
        this.f134107a.setVideoScalingMode(i13);
    }

    @Override // x7.l
    public final ByteBuffer i(int i13) {
        return this.f134107a.getInputBuffer(i13);
    }

    @Override // x7.l
    public final void j(Surface surface) {
        this.f134107a.setOutputSurface(surface);
    }

    @Override // x7.l
    public final void l(int i13) {
        this.f134107a.releaseOutputBuffer(i13, false);
    }

    @Override // x7.l
    public final void m(int i13, long j13) {
        this.f134107a.releaseOutputBuffer(i13, j13);
    }

    @Override // x7.l
    public final int n() {
        return this.f134107a.dequeueInputBuffer(0L);
    }

    @Override // x7.l
    public final int o(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f134107a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // x7.l
    public final ByteBuffer p(int i13) {
        return this.f134107a.getOutputBuffer(i13);
    }
}
