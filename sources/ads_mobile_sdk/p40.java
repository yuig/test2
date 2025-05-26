package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class p40 implements a.c6 {

    /* renamed from: a, reason: collision with root package name */
    public final n20 f9534a;

    /* renamed from: b, reason: collision with root package name */
    public wi.h f9535b;

    /* renamed from: c, reason: collision with root package name */
    public wi.k f9536c;

    /* renamed from: d, reason: collision with root package name */
    public h92 f9537d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f9538e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f9539f;

    public p40(n20 n20Var) {
        this.f9534a = n20Var;
    }

    @Override // a.c6
    public final Object a(h92 h92Var) {
        throw null;
    }

    public final q40 b() {
        kh2.a1.k(wi.h.class, this.f9535b);
        kh2.a1.k(wi.k.class, this.f9536c);
        kh2.a1.k(h92.class, this.f9537d);
        kh2.a1.k(Boolean.class, this.f9538e);
        kh2.a1.k(Boolean.class, this.f9539f);
        return new q40(this.f9534a, this.f9535b, this.f9536c, this.f9537d, this.f9538e, this.f9539f);
    }

    @Override // a.c6
    public final Object a(wi.h hVar) {
        hVar.getClass();
        this.f9535b = hVar;
        return this;
    }

    @Override // a.c6
    public final Object a(wi.k kVar) {
        kVar.getClass();
        this.f9536c = kVar;
        return this;
    }

    @Override // a.c6
    public final Object a(boolean z13) {
        this.f9539f = Boolean.valueOf(z13);
        return this;
    }

    @Override // a.c6
    public final Object b(boolean z13) {
        this.f9538e = Boolean.valueOf(z13);
        return this;
    }
}
