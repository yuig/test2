package ads_mobile_sdk;

import a.m5;
import bj.n;

/* loaded from: classes2.dex */
public final class s40 implements a.t4 {

    /* renamed from: a, reason: collision with root package name */
    public final n20 f10942a;

    /* renamed from: b, reason: collision with root package name */
    public wi.h f10943b;

    /* renamed from: c, reason: collision with root package name */
    public wi.k f10944c;

    /* renamed from: d, reason: collision with root package name */
    public h92 f10945d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f10946e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f10947f;

    /* renamed from: g, reason: collision with root package name */
    public bj.m f10948g;

    /* renamed from: h, reason: collision with root package name */
    public n f10949h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f10950i;

    public s40(n20 n20Var) {
        this.f10942a = n20Var;
    }

    @Override // a.t4
    public final m5 a() {
        kh2.a1.k(wi.h.class, this.f10943b);
        kh2.a1.k(wi.k.class, this.f10944c);
        kh2.a1.k(h92.class, this.f10945d);
        kh2.a1.k(Boolean.class, this.f10946e);
        kh2.a1.k(Boolean.class, this.f10947f);
        kh2.a1.k(bj.m.class, this.f10948g);
        kh2.a1.k(n.class, this.f10949h);
        kh2.a1.k(Integer.class, this.f10950i);
        return new t40(this.f10942a, this.f10944c, this.f10945d, this.f10946e, this.f10947f, this.f10948g, this.f10950i);
    }

    @Override // a.c6
    public final Object b(boolean z13) {
        this.f10946e = Boolean.valueOf(z13);
        return this;
    }

    @Override // a.c6
    public final Object a(wi.h hVar) {
        hVar.getClass();
        this.f10943b = hVar;
        return this;
    }

    @Override // a.c6
    public final Object a(wi.k kVar) {
        kVar.getClass();
        this.f10944c = kVar;
        return this;
    }

    @Override // a.c6
    public final Object a(boolean z13) {
        this.f10947f = Boolean.valueOf(z13);
        return this;
    }

    @Override // a.t4
    public final a.t4 a(bj.m mVar) {
        mVar.getClass();
        this.f10948g = mVar;
        return this;
    }

    @Override // a.t4
    public final a.t4 a(n nVar) {
        nVar.getClass();
        this.f10949h = nVar;
        return this;
    }

    @Override // a.t4
    public final a.t4 a(int i13) {
        this.f10950i = Integer.valueOf(i13);
        return this;
    }

    @Override // a.c6
    public final Object a(h92 h92Var) {
        this.f10945d = h92Var;
        return this;
    }
}
