package m1;

/* loaded from: classes2.dex */
public final class j2 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o2 f85396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l2 f85397b;

    public j2(o2 o2Var, l2 l2Var) {
        this.f85396a = o2Var;
        this.f85397b = l2Var;
    }

    @Override // m1.m1
    public final float a(float f13) {
        o2 o2Var = this.f85396a;
        long d2 = o2Var.d(o2Var.g(f13));
        o2 o2Var2 = this.f85397b.f85439a;
        o2Var2.f85499g = 2;
        k1.e2 e2Var = o2Var2.f85494b;
        return o2Var.c(o2Var.f((e2Var == null || !(o2Var2.f85493a.e() || o2Var2.f85493a.d())) ? o2.a(o2Var2, o2Var2.f85500h, d2, 2) : e2Var.c(d2, o2Var2.f85499g, o2Var2.f85502j)));
    }
}
