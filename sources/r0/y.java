package r0;

import android.media.MediaMuxer;
import androidx.camera.video.internal.encoder.EncodeException;

/* loaded from: classes2.dex */
public final class y implements y0.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r4.i f105681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f105682b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f105683c;

    public y(i iVar, j0 j0Var, r4.i iVar2) {
        this.f105683c = j0Var;
        this.f105681a = iVar2;
        this.f105682b = iVar;
    }

    @Override // y0.n
    public final void e() {
        this.f105681a.b(null);
    }

    @Override // y0.n
    public final void l(EncodeException encodeException) {
        this.f105681a.d(encodeException);
    }

    @Override // y0.n
    public final void m(a.z0 z0Var) {
        this.f105683c.F = z0Var;
    }

    @Override // y0.n
    public final void q(y0.i iVar) {
        boolean z13;
        j0 j0Var = this.f105683c;
        MediaMuxer mediaMuxer = j0Var.B;
        i iVar2 = this.f105682b;
        if (mediaMuxer != null) {
            try {
                j0Var.M(iVar, iVar2);
                iVar.close();
                return;
            } catch (Throwable th3) {
                if (iVar != null) {
                    try {
                        iVar.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        if (j0Var.f105576q) {
            kh2.m0.p("Recorder", "Drop video data since recording is stopping.");
            iVar.close();
            return;
        }
        y0.h hVar = j0Var.U;
        if (hVar != null) {
            hVar.close();
            j0Var.U = null;
            z13 = true;
        } else {
            z13 = false;
        }
        if (!iVar.a()) {
            if (z13) {
                kh2.m0.p("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
            }
            kh2.m0.p("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
            y0.c0 c0Var = j0Var.E;
            c0Var.f136284h.execute(new y0.q(c0Var, 5));
            iVar.close();
            return;
        }
        j0Var.U = iVar;
        if (!j0Var.n() || !j0Var.V.h()) {
            kh2.m0.p("Recorder", "Received video keyframe. Starting muxer...");
            j0Var.E(iVar2);
        } else if (z13) {
            kh2.m0.p("Recorder", "Replaced cached video keyframe with newer keyframe.");
        } else {
            kh2.m0.p("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
        }
    }
}
