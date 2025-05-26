package ads_mobile_sdk;

import java.util.Set;

/* loaded from: classes2.dex */
public final class bs0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f3570a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f3571b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f3572c;

    public bs0(a.o8 o8Var, qf2 qf2Var, a.o8 o8Var2) {
        this.f3570a = o8Var;
        this.f3571b = qf2Var;
        this.f3572c = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        return new as0((Set) this.f3570a.get(), (Set) this.f3571b.get(), (bt2) this.f3572c.get());
    }
}
