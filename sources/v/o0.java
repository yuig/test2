package v;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class o0 implements d0.j {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f123587a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f123588b;

    /* renamed from: c, reason: collision with root package name */
    public final int f123589c;

    public o0(s0 s0Var, Executor executor, int i13) {
        this.f123588b = s0Var;
        this.f123587a = executor;
        this.f123589c = i13;
    }

    @Override // d0.j
    public final com.google.common.util.concurrent.c0 a() {
        kh2.m0.p("Camera2CapturePipeline", "invokePreCapture");
        g0.d a13 = g0.d.a(this.f123588b.a(this.f123589c));
        l0 l0Var = new l0(1);
        a13.getClass();
        return g0.m.j(a13, new g0.l(l0Var), this.f123587a);
    }

    @Override // d0.j
    public final com.google.common.util.concurrent.c0 b() {
        return com.bumptech.glide.d.L(new a.z0(this, 5));
    }
}
