package ads_mobile_sdk;

import a.pd;
import android.content.Context;

/* loaded from: classes2.dex */
public final class ea0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4769a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f4770b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f4771c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f4772d;

    public ea0(xv0 xv0Var, a.o8 o8Var, xv0 xv0Var2, a.o8 o8Var2) {
        this.f4769a = xv0Var;
        this.f4770b = o8Var;
        this.f4771c = xv0Var2;
        this.f4772d = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        return new da0((pd) this.f4769a.get(), (a.m) this.f4770b.get(), (Context) this.f4771c.get(), (bt2) this.f4772d.get());
    }
}
