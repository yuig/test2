package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class w40 implements a.v6 {

    /* renamed from: a, reason: collision with root package name */
    public final n20 f12856a;

    /* renamed from: b, reason: collision with root package name */
    public a.o8 f12857b;

    /* renamed from: c, reason: collision with root package name */
    public a.o8 f12858c;

    /* renamed from: d, reason: collision with root package name */
    public xv0 f12859d;

    /* renamed from: e, reason: collision with root package name */
    public xv0 f12860e;

    /* renamed from: f, reason: collision with root package name */
    public e40 f12861f;

    /* renamed from: g, reason: collision with root package name */
    public a.o8 f12862g;

    /* renamed from: h, reason: collision with root package name */
    public a.o8 f12863h;

    public w40(n20 n20Var, wi.h hVar, wi.k kVar, h92 h92Var, Boolean bool, Boolean bool2) {
        this.f12856a = n20Var;
        a(hVar, kVar, h92Var, bool, bool2);
    }

    public final void a(wi.h hVar, wi.k kVar, h92 h92Var, Boolean bool, Boolean bool2) {
        xv0 xv0Var = a.p8.f142a;
        a.o8 n52Var = new n52(xv0Var, xv0Var, xv0Var);
        Object obj = u90.f11887c;
        if (!(n52Var instanceof u90)) {
            n52Var = new u90(n52Var);
        }
        this.f12857b = n52Var;
        a.o8 m52Var = new m52(this.f12856a.f8516c0);
        if (!(m52Var instanceof u90)) {
            m52Var = new u90(m52Var);
        }
        this.f12858c = m52Var;
        this.f12859d = xv0.a(h92Var);
        this.f12860e = xv0.a(bool2);
        this.f12861f = new e40(xv0.a(kVar));
        xv0 a13 = xv0.a(bool);
        n20 n20Var = this.f12856a;
        a.o8 xs0Var = new xs0(n20Var.C0, this.f12859d, this.f12861f, this.f12858c, a13, n20Var.f8530g);
        if (!(xs0Var instanceof u90)) {
            xs0Var = new u90(xs0Var);
        }
        this.f12862g = xs0Var;
        xv0 a14 = xv0.a(hVar);
        n20 n20Var2 = this.f12856a;
        a.o8 q52Var = new q52(n20Var2.f8556m1, n20Var2.f8566p, this.f12857b, n20Var2.f8550l, n20Var2.C, this.f12858c, this.f12859d, n20Var2.f8602y, this.f12860e, this.f12862g, a14, n20Var2.f8580s1);
        if (!(q52Var instanceof u90)) {
            q52Var = new u90(q52Var);
        }
        this.f12863h = q52Var;
    }

    @Override // a.v6
    public final r32 b() {
        return (p52) this.f12863h.get();
    }

    @Override // a.v6
    public final ws0 a() {
        return (ws0) this.f12862g.get();
    }
}
