package ads_mobile_sdk;

import a.pd;
import android.content.Context;

/* loaded from: classes2.dex */
public final class k12 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f7059a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f7060b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f7061c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f7062d;

    public k12(a.o8 o8Var, a.o8 o8Var2, xv0 xv0Var, a.o8 o8Var3) {
        this.f7059a = o8Var;
        this.f7060b = o8Var2;
        this.f7061c = xv0Var;
        this.f7062d = o8Var3;
    }

    @Override // a.v7
    public final Object get() {
        return new j12((pd) this.f7059a.get(), (a.m) this.f7060b.get(), (Context) this.f7061c.get(), (bt2) this.f7062d.get());
    }
}
