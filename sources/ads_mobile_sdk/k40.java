package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class k40 implements a.v6 {

    /* renamed from: a, reason: collision with root package name */
    public final n20 f7090a;

    /* renamed from: b, reason: collision with root package name */
    public a.o8 f7091b;

    /* renamed from: c, reason: collision with root package name */
    public xv0 f7092c;

    /* renamed from: d, reason: collision with root package name */
    public a.o8 f7093d;

    /* renamed from: e, reason: collision with root package name */
    public a.o8 f7094e;

    /* renamed from: f, reason: collision with root package name */
    public xv0 f7095f;

    /* renamed from: g, reason: collision with root package name */
    public xv0 f7096g;

    /* renamed from: h, reason: collision with root package name */
    public e40 f7097h;

    /* renamed from: i, reason: collision with root package name */
    public a.o8 f7098i;

    /* renamed from: j, reason: collision with root package name */
    public a.o8 f7099j;

    public k40(n20 n20Var, wi.k kVar, h92 h92Var, Boolean bool, Boolean bool2, vi.c cVar) {
        this.f7090a = n20Var;
        a(kVar, h92Var, bool, bool2, cVar);
    }

    public final void a(wi.k kVar, h92 h92Var, Boolean bool, Boolean bool2, vi.c cVar) {
        n20 n20Var = this.f7090a;
        a.o8 d72Var = new d72(n20Var.f8566p, n20Var.f8530g, n20Var.f8550l);
        Object obj = u90.f11887c;
        if (!(d72Var instanceof u90)) {
            d72Var = new u90(d72Var);
        }
        this.f7091b = d72Var;
        this.f7092c = xv0.a(cVar);
        xv0 xv0Var = a.p8.f142a;
        a.o8 n52Var = new n52(xv0Var, xv0Var, xv0Var);
        if (!(n52Var instanceof u90)) {
            n52Var = new u90(n52Var);
        }
        this.f7093d = n52Var;
        a.o8 m52Var = new m52(this.f7090a.f8516c0);
        if (!(m52Var instanceof u90)) {
            m52Var = new u90(m52Var);
        }
        this.f7094e = m52Var;
        this.f7095f = xv0.a(h92Var);
        this.f7096g = xv0.a(bool2);
        this.f7097h = new e40(xv0.a(kVar));
        xv0 a13 = xv0.a(bool);
        n20 n20Var2 = this.f7090a;
        a.o8 xs0Var = new xs0(n20Var2.C0, this.f7095f, this.f7097h, this.f7094e, a13, n20Var2.f8530g);
        if (!(xs0Var instanceof u90)) {
            xs0Var = new u90(xs0Var);
        }
        this.f7098i = xs0Var;
        n20 n20Var3 = this.f7090a;
        a.o8 p42Var = new p42(n20Var3.f8519d, n20Var3.f8570q, n20Var3.f8552l1, n20Var3.f8556m1, n20Var3.f8566p, n20Var3.f8564o1, this.f7091b, n20Var3.f8568p1, this.f7092c, this.f7093d, n20Var3.f8550l, n20Var3.C, this.f7094e, this.f7095f, n20Var3.f8602y, this.f7096g, xs0Var);
        if (!(p42Var instanceof u90)) {
            p42Var = new u90(p42Var);
        }
        this.f7099j = p42Var;
    }

    @Override // a.v6
    public final r32 b() {
        return (o42) this.f7099j.get();
    }

    @Override // a.v6
    public final ws0 a() {
        return (ws0) this.f7098i.get();
    }
}
