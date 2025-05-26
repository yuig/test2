package ads_mobile_sdk;

import a.zb;
import android.content.Context;
import ao2.j0;

/* loaded from: classes2.dex */
public final class mj implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f8248a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f8249b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f8250c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f8251d;

    public mj(a.o8 o8Var, xv0 xv0Var, a.o8 o8Var2, a.o8 o8Var3) {
        this.f8248a = o8Var;
        this.f8249b = xv0Var;
        this.f8250c = o8Var2;
        this.f8251d = o8Var3;
    }

    @Override // a.v7
    public final Object get() {
        oh0 oh0Var = (oh0) this.f8248a.get();
        return new lj((Context) this.f8249b.get(), oh0Var, (zb) this.f8251d.get(), (j0) this.f8250c.get());
    }
}
