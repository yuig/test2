package ads_mobile_sdk;

import a.n7;

/* loaded from: classes2.dex */
public final class b50 implements a.z6 {

    /* renamed from: a, reason: collision with root package name */
    public final n20 f2743a;

    /* renamed from: b, reason: collision with root package name */
    public dj.e f2744b;

    /* renamed from: c, reason: collision with root package name */
    public wi.k f2745c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f2746d;

    public b50(n20 n20Var) {
        this.f2743a = n20Var;
    }

    @Override // a.z6
    public final n7 a() {
        kh2.a1.k(dj.e.class, this.f2744b);
        kh2.a1.k(wi.k.class, this.f2745c);
        kh2.a1.k(Boolean.class, this.f2746d);
        return new c50(this.f2743a, this.f2744b, this.f2745c, this.f2746d);
    }

    @Override // a.z6
    public final a.z6 b() {
        this.f2746d = Boolean.FALSE;
        return this;
    }

    @Override // a.z6
    public final a.z6 a(wi.k kVar) {
        kVar.getClass();
        this.f2745c = kVar;
        return this;
    }

    @Override // a.z6
    public final a.z6 a(dj.e eVar) {
        eVar.getClass();
        this.f2744b = eVar;
        return this;
    }
}
