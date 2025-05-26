package ads_mobile_sdk;

import android.content.Context;
import ao2.j0;

/* loaded from: classes2.dex */
public final class bu2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f3604a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f3605b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f3606c;

    public bu2(a.o8 o8Var, xv0 xv0Var, q70 q70Var) {
        this.f3604a = o8Var;
        this.f3605b = xv0Var;
        this.f3606c = q70Var;
    }

    @Override // a.v7
    public final Object get() {
        return new au2((j0) this.f3604a.get(), (Context) this.f3605b.get(), (a.j3) this.f3606c.get());
    }
}
