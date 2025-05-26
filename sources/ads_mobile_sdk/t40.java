package ads_mobile_sdk;

import a.m5;

/* loaded from: classes2.dex */
public final class t40 implements m5 {

    /* renamed from: a, reason: collision with root package name */
    public final n20 f11392a;

    /* renamed from: b, reason: collision with root package name */
    public xv0 f11393b;

    /* renamed from: c, reason: collision with root package name */
    public a.o8 f11394c;

    /* renamed from: d, reason: collision with root package name */
    public a.o8 f11395d;

    /* renamed from: e, reason: collision with root package name */
    public xv0 f11396e;

    /* renamed from: f, reason: collision with root package name */
    public xv0 f11397f;

    /* renamed from: g, reason: collision with root package name */
    public e40 f11398g;

    /* renamed from: h, reason: collision with root package name */
    public a.o8 f11399h;

    /* renamed from: i, reason: collision with root package name */
    public a.o8 f11400i;

    public t40(n20 n20Var, wi.k kVar, h92 h92Var, Boolean bool, Boolean bool2, bj.m mVar, Integer num) {
        this.f11392a = n20Var;
        a(kVar, h92Var, bool, bool2, mVar, num);
    }

    public final void a(wi.k kVar, h92 h92Var, Boolean bool, Boolean bool2, bj.m mVar, Integer num) {
        this.f11393b = xv0.a(mVar);
        xv0 xv0Var = a.p8.f142a;
        a.o8 n52Var = new n52(xv0Var, xv0Var, xv0Var);
        Object obj = u90.f11887c;
        if (!(n52Var instanceof u90)) {
            n52Var = new u90(n52Var);
        }
        this.f11394c = n52Var;
        a.o8 m52Var = new m52(this.f11392a.f8516c0);
        if (!(m52Var instanceof u90)) {
            m52Var = new u90(m52Var);
        }
        this.f11395d = m52Var;
        this.f11396e = xv0.a(h92Var);
        this.f11397f = xv0.a(bool2);
        this.f11398g = new e40(xv0.a(kVar));
        xv0 a13 = xv0.a(bool);
        n20 n20Var = this.f11392a;
        a.o8 xs0Var = new xs0(n20Var.C0, this.f11396e, this.f11398g, this.f11395d, a13, n20Var.f8530g);
        if (!(xs0Var instanceof u90)) {
            xs0Var = new u90(xs0Var);
        }
        this.f11399h = xs0Var;
        xv0 a14 = xv0.a(num);
        n20 n20Var2 = this.f11392a;
        a.o8 e52Var = new e52(n20Var2.f8556m1, n20Var2.f8566p, this.f11393b, this.f11394c, n20Var2.f8550l, n20Var2.C, this.f11395d, this.f11396e, n20Var2.f8602y, this.f11397f, this.f11399h, n20Var2.f8576r1, a14);
        if (!(e52Var instanceof u90)) {
            e52Var = new u90(e52Var);
        }
        this.f11400i = e52Var;
    }

    @Override // a.v6
    public final r32 b() {
        return (r32) this.f11400i.get();
    }

    @Override // a.v6
    public final ws0 a() {
        return (ws0) this.f11399h.get();
    }
}
