package ads_mobile_sdk;

import android.content.Context;
import ao2.j0;

/* loaded from: classes2.dex */
public final class vb1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f12428a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f12429b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f12430c;

    public vb1(xv0 xv0Var, a.o8 o8Var, a.o8 o8Var2) {
        this.f12428a = xv0Var;
        this.f12429b = o8Var;
        this.f12430c = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        return new ub1((Context) this.f12428a.get(), (j0) this.f12429b.get(), (x) this.f12430c.get());
    }
}
