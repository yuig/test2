package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class j40 implements a.c6 {

    /* renamed from: a, reason: collision with root package name */
    public final n20 f6669a;

    /* renamed from: b, reason: collision with root package name */
    public wi.h f6670b;

    /* renamed from: c, reason: collision with root package name */
    public wi.k f6671c;

    /* renamed from: d, reason: collision with root package name */
    public h92 f6672d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f6673e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f6674f;

    /* renamed from: g, reason: collision with root package name */
    public vi.d f6675g;

    /* renamed from: h, reason: collision with root package name */
    public vi.c f6676h;

    public j40(n20 n20Var) {
        this.f6669a = n20Var;
    }

    @Override // a.c6
    public final Object a(h92 h92Var) {
        throw null;
    }

    public final k40 b() {
        kh2.a1.k(wi.h.class, this.f6670b);
        kh2.a1.k(wi.k.class, this.f6671c);
        kh2.a1.k(h92.class, this.f6672d);
        kh2.a1.k(Boolean.class, this.f6673e);
        kh2.a1.k(Boolean.class, this.f6674f);
        kh2.a1.k(vi.d.class, this.f6675g);
        kh2.a1.k(vi.c.class, this.f6676h);
        return new k40(this.f6669a, this.f6671c, this.f6672d, this.f6673e, this.f6674f, this.f6676h);
    }

    @Override // a.c6
    public final Object a(wi.h hVar) {
        hVar.getClass();
        this.f6670b = hVar;
        return this;
    }

    @Override // a.c6
    public final Object a(wi.k kVar) {
        kVar.getClass();
        this.f6671c = kVar;
        return this;
    }

    @Override // a.c6
    public final Object a(boolean z13) {
        this.f6674f = Boolean.valueOf(z13);
        return this;
    }

    @Override // a.c6
    public final Object b(boolean z13) {
        this.f6673e = Boolean.valueOf(z13);
        return this;
    }
}
