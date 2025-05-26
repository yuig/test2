package ads_mobile_sdk;

import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class y02 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f13930a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f13931b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f13932c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f13933d;

    public y02(a.o8 o8Var, a.o8 o8Var2, xv0 xv0Var, xv0 xv0Var2) {
        this.f13930a = o8Var;
        this.f13931b = o8Var2;
        this.f13932c = xv0Var;
        this.f13933d = xv0Var2;
    }

    @Override // a.v7
    public final Object get() {
        a.n5 a13 = u90.a(this.f13930a);
        a.n5 a14 = u90.a(this.f13931b);
        ExecutorService executorService = (ExecutorService) this.f13932c.get();
        i4 i4Var = (i4) this.f13933d.get();
        return new x02(a13, a14, executorService, i4Var.G().w(), i4Var.G().u(), i4Var.G().v());
    }
}
