package ads_mobile_sdk;

import android.content.Context;

/* loaded from: classes2.dex */
public final class z80 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f14676a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f14677b;

    public z80(a.o8 o8Var, a.o8 o8Var2) {
        this.f14676a = o8Var;
        this.f14677b = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        return new y80((Context) this.f14676a.get(), (a.j3) this.f14677b.get());
    }
}
