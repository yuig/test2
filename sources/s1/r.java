package s1;

/* loaded from: classes2.dex */
public final class r implements m1.e {

    /* renamed from: b, reason: collision with root package name */
    public final o0 f110526b;

    /* renamed from: c, reason: collision with root package name */
    public final m1.e f110527c;

    /* renamed from: d, reason: collision with root package name */
    public final j1.n f110528d;

    public r(o0 o0Var, m1.e eVar) {
        this.f110526b = o0Var;
        this.f110527c = eVar;
        this.f110528d = eVar.b();
    }

    @Override // m1.e
    public final float a(float f13, float f14, float f15) {
        float a13 = this.f110527c.a(f13, f14, f15);
        o0 o0Var = this.f110526b;
        if (a13 == 0.0f) {
            int i13 = o0Var.f110495e;
            if (i13 == 0) {
                return 0.0f;
            }
            float f16 = i13 * (-1.0f);
            if (o0Var.a()) {
                f16 += o0Var.p();
            }
            return ql2.s.f(f16, -f15, f15);
        }
        float f17 = o0Var.f110495e * (-1);
        while (a13 > 0.0f && f17 < a13) {
            f17 += o0Var.p();
        }
        float f18 = f17;
        while (a13 < 0.0f && f18 > a13) {
            f18 -= o0Var.p();
        }
        return f18;
    }

    @Override // m1.e
    public final j1.n b() {
        return this.f110528d;
    }
}
