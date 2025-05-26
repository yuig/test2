package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class h40 implements a.v6 {

    /* renamed from: a, reason: collision with root package name */
    public final n20 f5832a;

    /* renamed from: b, reason: collision with root package name */
    public a.o8 f5833b;

    /* renamed from: c, reason: collision with root package name */
    public a.o8 f5834c;

    /* renamed from: d, reason: collision with root package name */
    public xv0 f5835d;

    /* renamed from: e, reason: collision with root package name */
    public xv0 f5836e;

    /* renamed from: f, reason: collision with root package name */
    public e40 f5837f;

    /* renamed from: g, reason: collision with root package name */
    public a.o8 f5838g;

    /* renamed from: h, reason: collision with root package name */
    public a.o8 f5839h;

    public h40(n20 n20Var, wi.h hVar, wi.k kVar, h92 h92Var, Boolean bool, Boolean bool2) {
        this.f5832a = n20Var;
        a(hVar, kVar, h92Var, bool, bool2);
    }

    public final void a(wi.h hVar, wi.k kVar, h92 h92Var, Boolean bool, Boolean bool2) {
        xv0 xv0Var = a.p8.f142a;
        a.o8 n52Var = new n52(xv0Var, xv0Var, xv0Var);
        Object obj = u90.f11887c;
        if (!(n52Var instanceof u90)) {
            n52Var = new u90(n52Var);
        }
        this.f5833b = n52Var;
        a.o8 m52Var = new m52(this.f5832a.f8516c0);
        if (!(m52Var instanceof u90)) {
            m52Var = new u90(m52Var);
        }
        this.f5834c = m52Var;
        this.f5835d = xv0.a(h92Var);
        this.f5836e = xv0.a(bool2);
        this.f5837f = new e40(xv0.a(kVar));
        xv0 a13 = xv0.a(bool);
        n20 n20Var = this.f5832a;
        a.o8 xs0Var = new xs0(n20Var.C0, this.f5835d, this.f5837f, this.f5834c, a13, n20Var.f8530g);
        if (!(xs0Var instanceof u90)) {
            xs0Var = new u90(xs0Var);
        }
        this.f5838g = xs0Var;
        xv0 a14 = xv0.a(hVar);
        n20 n20Var2 = this.f5832a;
        a.o8 y32Var = new y32(n20Var2.f8556m1, n20Var2.f8566p, this.f5833b, n20Var2.f8550l, n20Var2.C, this.f5834c, this.f5835d, n20Var2.f8602y, this.f5836e, this.f5838g, a14, n20Var2.f8560n1);
        if (!(y32Var instanceof u90)) {
            y32Var = new u90(y32Var);
        }
        this.f5839h = y32Var;
    }

    @Override // a.v6
    public final r32 b() {
        return (x32) this.f5839h.get();
    }

    @Override // a.v6
    public final ws0 a() {
        return (ws0) this.f5838g.get();
    }
}
