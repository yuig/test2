package v;

import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes2.dex */
public final class m0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final n f123535a;

    /* renamed from: b, reason: collision with root package name */
    public final n3.b f123536b;

    /* renamed from: c, reason: collision with root package name */
    public final int f123537c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f123538d = false;

    public m0(n nVar, int i13, n3.b bVar) {
        this.f123535a = nVar;
        this.f123537c = i13;
        this.f123536b = bVar;
    }

    @Override // v.t0
    public final com.google.common.util.concurrent.c0 a(TotalCaptureResult totalCaptureResult) {
        if (!c1.i(this.f123537c, totalCaptureResult)) {
            return g0.m.e(Boolean.FALSE);
        }
        kh2.m0.p("Camera2CapturePipeline", "Trigger AE");
        this.f123538d = true;
        g0.d a13 = g0.d.a(com.bumptech.glide.d.L(new a.z0(this, 4)));
        l0 l0Var = new l0(0);
        f0.d s13 = l3.c.s();
        a13.getClass();
        return g0.m.j(a13, new g0.l(l0Var), s13);
    }

    @Override // v.t0
    public final boolean b() {
        return this.f123537c == 0;
    }

    @Override // v.t0
    public final void c() {
        if (this.f123538d) {
            kh2.m0.p("Camera2CapturePipeline", "cancel TriggerAePreCapture");
            this.f123535a.f123552h.a(false, true);
            this.f123536b.f89034b = false;
        }
    }
}
