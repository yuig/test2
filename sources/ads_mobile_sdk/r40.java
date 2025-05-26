package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class r40 {

    /* renamed from: a, reason: collision with root package name */
    public final n20 f10494a;

    /* renamed from: b, reason: collision with root package name */
    public xv0 f10495b;

    /* renamed from: c, reason: collision with root package name */
    public a.o8 f10496c;

    /* renamed from: d, reason: collision with root package name */
    public a.o8 f10497d;

    /* renamed from: e, reason: collision with root package name */
    public xv0 f10498e;

    /* renamed from: f, reason: collision with root package name */
    public xv0 f10499f;

    /* renamed from: g, reason: collision with root package name */
    public a.o8 f10500g;

    public r40(n20 n20Var, h92 h92Var, String str, Boolean bool) {
        this.f10494a = n20Var;
        a(h92Var, str, bool);
    }

    public final void a(h92 h92Var, String str, Boolean bool) {
        this.f10495b = xv0.a(str);
        xv0 xv0Var = a.p8.f142a;
        a.o8 n52Var = new n52(xv0Var, xv0Var, xv0Var);
        Object obj = u90.f11887c;
        if (!(n52Var instanceof u90)) {
            n52Var = new u90(n52Var);
        }
        this.f10496c = n52Var;
        a.o8 m52Var = new m52(this.f10494a.f8516c0);
        if (!(m52Var instanceof u90)) {
            m52Var = new u90(m52Var);
        }
        this.f10497d = m52Var;
        this.f10498e = xv0.a(h92Var);
        this.f10499f = xv0Var;
        xv0 a13 = xv0.a(bool);
        n20 n20Var = this.f10494a;
        a.o8 xs0Var = new xs0(n20Var.C0, this.f10498e, this.f10499f, this.f10497d, a13, n20Var.f8530g);
        a.o8 u90Var = xs0Var instanceof u90 ? xs0Var : new u90(xs0Var);
        n20 n20Var2 = this.f10494a;
        a.o8 g52Var = new g52(n20Var2.U1, n20Var2.f8588u1, n20Var2.M0, this.f10495b, n20Var2.f8556m1, n20Var2.f8566p, this.f10496c, n20Var2.f8550l, n20Var2.C, this.f10497d, this.f10498e, n20Var2.f8602y, u90Var);
        if (!(g52Var instanceof u90)) {
            g52Var = new u90(g52Var);
        }
        this.f10500g = g52Var;
    }
}
