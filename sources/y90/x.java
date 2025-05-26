package y90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements i1, o1, t1, a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f138265a;

    public /* synthetic */ x(d0 d0Var) {
        this.f138265a = d0Var;
    }

    @Override // y90.t1
    public void f(m62.h1 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        p pVar = new p(new m62.n0(item));
        int i13 = d0.f138146w0;
        this.f138265a.a8(pVar);
    }

    @Override // y90.o1
    public void g(m62.i item) {
        Intrinsics.checkNotNullParameter(item, "item");
        p pVar = new p(new m62.l0(item));
        int i13 = d0.f138146w0;
        this.f138265a.a8(pVar);
    }

    @Override // y90.a2
    public void i(m62.k1 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        p pVar = new p(new m62.x0(item));
        int i13 = d0.f138146w0;
        this.f138265a.a8(pVar);
    }

    @Override // y90.i1
    public void k(m62.k model) {
        Intrinsics.checkNotNullParameter(model, "model");
        p pVar = new p(new m62.m0(model));
        int i13 = d0.f138146w0;
        this.f138265a.a8(pVar);
    }

    @Override // y90.i1
    public void n() {
        p pVar = new p(m62.s0.f86056a);
        int i13 = d0.f138146w0;
        this.f138265a.a8(pVar);
    }
}
