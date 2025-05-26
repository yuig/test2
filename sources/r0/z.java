package r0;

import android.media.MediaMuxer;
import androidx.camera.video.internal.encoder.EncodeException;

/* loaded from: classes2.dex */
public final class z implements y0.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r4.i f105687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.a f105688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f105689c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f105690d;

    public z(j0 j0Var, r4.i iVar, h0.d dVar, i iVar2) {
        this.f105690d = j0Var;
        this.f105687a = iVar;
        this.f105688b = dVar;
        this.f105689c = iVar2;
    }

    @Override // y0.n
    public final void e() {
        this.f105687a.b(null);
    }

    @Override // y0.n
    public final void l(EncodeException encodeException) {
        if (this.f105690d.W == null) {
            this.f105688b.accept(encodeException);
        }
    }

    @Override // y0.n
    public final void m(a.z0 z0Var) {
        this.f105690d.H = z0Var;
    }

    @Override // y0.n
    public final void q(y0.i iVar) {
        j0 j0Var = this.f105690d;
        if (j0Var.I == b0.DISABLED) {
            iVar.close();
            throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
        }
        MediaMuxer mediaMuxer = j0Var.B;
        i iVar2 = this.f105689c;
        if (mediaMuxer == null) {
            if (j0Var.f105576q) {
                kh2.m0.p("Recorder", "Drop audio data since recording is stopping.");
            } else {
                j0Var.V.f(new y0.g(iVar));
                if (j0Var.U != null) {
                    kh2.m0.p("Recorder", "Received audio data. Starting muxer...");
                    j0Var.E(iVar2);
                } else {
                    kh2.m0.p("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                }
            }
            iVar.close();
            return;
        }
        try {
            j0Var.L(iVar, iVar2);
            iVar.close();
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
}
