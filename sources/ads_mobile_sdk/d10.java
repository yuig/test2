package ads_mobile_sdk;

import a.n7;

/* loaded from: classes2.dex */
public final class d10 implements a.z6 {

    /* renamed from: a, reason: collision with root package name */
    public final n20 f4090a;

    /* renamed from: b, reason: collision with root package name */
    public dj.e f4091b;

    /* renamed from: c, reason: collision with root package name */
    public wi.k f4092c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f4093d;

    /* renamed from: e, reason: collision with root package name */
    public vi.d f4094e;

    public d10(n20 n20Var) {
        this.f4090a = n20Var;
    }

    @Override // a.z6
    public final n7 a() {
        kh2.a1.k(dj.e.class, this.f4091b);
        kh2.a1.k(wi.k.class, this.f4092c);
        kh2.a1.k(Boolean.class, this.f4093d);
        kh2.a1.k(vi.d.class, this.f4094e);
        return new e10(this.f4090a, this.f4091b, this.f4092c, this.f4093d, this.f4094e);
    }

    @Override // a.z6
    public final a.z6 b() {
        this.f4093d = Boolean.FALSE;
        return this;
    }

    @Override // a.z6
    public final a.z6 a(wi.k kVar) {
        kVar.getClass();
        this.f4092c = kVar;
        return this;
    }

    @Override // a.z6
    public final a.z6 a(dj.e eVar) {
        eVar.getClass();
        this.f4091b = eVar;
        return this;
    }
}
