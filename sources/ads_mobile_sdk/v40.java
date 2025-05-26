package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class v40 implements a.c6 {

    /* renamed from: a, reason: collision with root package name */
    public final n20 f12342a;

    /* renamed from: b, reason: collision with root package name */
    public wi.h f12343b;

    /* renamed from: c, reason: collision with root package name */
    public wi.k f12344c;

    /* renamed from: d, reason: collision with root package name */
    public h92 f12345d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f12346e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f12347f;

    public v40(n20 n20Var) {
        this.f12342a = n20Var;
    }

    @Override // a.c6
    public final Object a(wi.h hVar) {
        hVar.getClass();
        this.f12343b = hVar;
        return this;
    }

    public final w40 b() {
        kh2.a1.k(wi.h.class, this.f12343b);
        kh2.a1.k(wi.k.class, this.f12344c);
        kh2.a1.k(h92.class, this.f12345d);
        kh2.a1.k(Boolean.class, this.f12346e);
        kh2.a1.k(Boolean.class, this.f12347f);
        return new w40(this.f12342a, this.f12343b, this.f12344c, this.f12345d, this.f12346e, this.f12347f);
    }

    @Override // a.c6
    public final Object a(wi.k kVar) {
        kVar.getClass();
        this.f12344c = kVar;
        return this;
    }

    @Override // a.c6
    public final Object a(boolean z13) {
        this.f12347f = Boolean.valueOf(z13);
        return this;
    }

    @Override // a.c6
    public final Object a(h92 h92Var) {
        this.f12345d = h92Var;
        return this;
    }

    @Override // a.c6
    public final Object b(boolean z13) {
        this.f12346e = Boolean.valueOf(z13);
        return this;
    }
}
