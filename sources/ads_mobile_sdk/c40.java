package ads_mobile_sdk;

import a.n7;
import bj.n;

/* loaded from: classes2.dex */
public final class c40 implements a.z6 {

    /* renamed from: a, reason: collision with root package name */
    public final n20 f3730a;

    /* renamed from: b, reason: collision with root package name */
    public dj.e f3731b;

    /* renamed from: c, reason: collision with root package name */
    public wi.k f3732c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f3733d;

    /* renamed from: e, reason: collision with root package name */
    public n f3734e;

    public c40(n20 n20Var) {
        this.f3730a = n20Var;
    }

    @Override // a.z6
    public final n7 a() {
        kh2.a1.k(dj.e.class, this.f3731b);
        kh2.a1.k(wi.k.class, this.f3732c);
        kh2.a1.k(Boolean.class, this.f3733d);
        kh2.a1.k(n.class, this.f3734e);
        return new d40(this.f3730a, this.f3731b, this.f3732c, this.f3733d, this.f3734e);
    }

    @Override // a.z6
    public final a.z6 b() {
        this.f3733d = Boolean.FALSE;
        return this;
    }

    @Override // a.z6
    public final a.z6 a(wi.k kVar) {
        kVar.getClass();
        this.f3732c = kVar;
        return this;
    }

    @Override // a.z6
    public final a.z6 a(dj.e eVar) {
        eVar.getClass();
        this.f3731b = eVar;
        return this;
    }
}
