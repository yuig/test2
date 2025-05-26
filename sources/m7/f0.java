package m7;

/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements d7.s, d7.c, d7.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f86151a;

    public /* synthetic */ f0(l0 l0Var) {
        this.f86151a = l0Var;
    }

    @Override // d7.s
    public final void c(Object obj, a7.p pVar) {
        this.f86151a.getClass();
        ((a7.t0) obj).r5(new a7.s0(pVar));
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        ((a7.t0) obj).d0(this.f86151a.Q);
    }

    @Override // d7.c
    public final void j(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        int intValue = num.intValue();
        l0 l0Var = this.f86151a;
        l0Var.L0();
        l0Var.x0(1, num, 10);
        l0Var.x0(2, num, 10);
        l0Var.f86277n.m(21, new e0(intValue, 1));
    }
}
