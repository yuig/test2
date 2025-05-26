package m7;

/* loaded from: classes.dex */
public final class s1 extends g8.t {

    /* renamed from: c, reason: collision with root package name */
    public final a7.a1 f86386c;

    public s1(a7.b1 b1Var) {
        super(b1Var);
        this.f86386c = new a7.a1();
    }

    @Override // g8.t, a7.b1
    public final a7.z0 g(int i13, a7.z0 z0Var, boolean z13) {
        a7.b1 b1Var = this.f64402b;
        a7.z0 g13 = b1Var.g(i13, z0Var, z13);
        if (b1Var.n(g13.f1253c, this.f86386c, 0L).b()) {
            g13.o(z0Var.f1251a, z0Var.f1252b, z0Var.f1253c, z0Var.f1254d, z0Var.f1255e, a7.b.f945g, true);
        } else {
            g13.f1256f = true;
        }
        return g13;
    }
}
