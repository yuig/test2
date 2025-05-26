package ads_mobile_sdk;

import a.zb;

/* loaded from: classes2.dex */
public final class h22 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f5812a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f5813b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f5814c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f5815d;

    public h22(a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3, xv0 xv0Var) {
        this.f5812a = o8Var;
        this.f5813b = o8Var2;
        this.f5814c = o8Var3;
        this.f5815d = xv0Var;
    }

    @Override // a.v7
    public final Object get() {
        return new j90(u90.a(this.f5812a), (bt2) this.f5813b.get(), (zb) this.f5814c.get(), ((i4) this.f5815d.get()).G().t());
    }
}
