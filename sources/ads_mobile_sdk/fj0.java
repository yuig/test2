package ads_mobile_sdk;

import android.content.Context;

/* loaded from: classes2.dex */
public final class fj0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f5159a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f5160b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f5161c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f5162d;

    public fj0(xv0 xv0Var, a.o8 o8Var, a.o8 o8Var2, xv0 xv0Var2) {
        this.f5159a = xv0Var;
        this.f5160b = o8Var;
        this.f5161c = o8Var2;
        this.f5162d = xv0Var2;
    }

    @Override // a.v7
    public final Object get() {
        return new ej0((Context) this.f5159a.get(), (i4) this.f5162d.get(), (bt2) this.f5160b.get(), (com.google.common.util.concurrent.d0) this.f5161c.get());
    }
}
