package ads_mobile_sdk;

import android.content.Context;

/* loaded from: classes2.dex */
public final class m90 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f8138a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f8139b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f8140c;

    public m90(xv0 xv0Var, xv0 xv0Var2, a.o8 o8Var) {
        this.f8138a = xv0Var;
        this.f8139b = xv0Var2;
        this.f8140c = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        return new l90((Context) this.f8138a.get(), (i4) this.f8139b.get(), (bn2) this.f8140c.get());
    }
}
