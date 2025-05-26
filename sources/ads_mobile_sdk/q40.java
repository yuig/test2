package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class q40 implements a.v6 {

    /* renamed from: a, reason: collision with root package name */
    public final n20 f9933a;

    /* renamed from: b, reason: collision with root package name */
    public xv0 f9934b;

    /* renamed from: c, reason: collision with root package name */
    public a.o8 f9935c;

    /* renamed from: d, reason: collision with root package name */
    public a.o8 f9936d;

    /* renamed from: e, reason: collision with root package name */
    public xv0 f9937e;

    /* renamed from: f, reason: collision with root package name */
    public xv0 f9938f;

    /* renamed from: g, reason: collision with root package name */
    public e40 f9939g;

    /* renamed from: h, reason: collision with root package name */
    public a.o8 f9940h;

    /* renamed from: i, reason: collision with root package name */
    public a.o8 f9941i;

    public q40(n20 n20Var, wi.h hVar, wi.k kVar, h92 h92Var, Boolean bool, Boolean bool2) {
        this.f9933a = n20Var;
        a(hVar, kVar, h92Var, bool, bool2);
    }

    public final void a(wi.h hVar, wi.k kVar, h92 h92Var, Boolean bool, Boolean bool2) {
        this.f9934b = xv0.a(hVar);
        xv0 xv0Var = a.p8.f142a;
        a.o8 n52Var = new n52(xv0Var, xv0Var, xv0Var);
        Object obj = u90.f11887c;
        if (!(n52Var instanceof u90)) {
            n52Var = new u90(n52Var);
        }
        this.f9935c = n52Var;
        a.o8 m52Var = new m52(this.f9933a.f8516c0);
        if (!(m52Var instanceof u90)) {
            m52Var = new u90(m52Var);
        }
        this.f9936d = m52Var;
        this.f9937e = xv0.a(h92Var);
        this.f9938f = xv0.a(bool2);
        this.f9939g = new e40(xv0.a(kVar));
        xv0 a13 = xv0.a(bool);
        n20 n20Var = this.f9933a;
        a.o8 xs0Var = new xs0(n20Var.C0, this.f9937e, this.f9939g, this.f9936d, a13, n20Var.f8530g);
        a.o8 u90Var = xs0Var instanceof u90 ? xs0Var : new u90(xs0Var);
        this.f9940h = u90Var;
        n20 n20Var2 = this.f9933a;
        a.o8 z42Var = new z42(n20Var2.f8556m1, n20Var2.f8566p, this.f9934b, this.f9935c, n20Var2.f8550l, n20Var2.C, this.f9936d, this.f9937e, n20Var2.f8602y, this.f9938f, u90Var, n20Var2.f8572q1);
        if (!(z42Var instanceof u90)) {
            z42Var = new u90(z42Var);
        }
        this.f9941i = z42Var;
    }

    @Override // a.v6
    public final r32 b() {
        return (y42) this.f9941i.get();
    }

    @Override // a.v6
    public final ws0 a() {
        return (ws0) this.f9940h.get();
    }
}
