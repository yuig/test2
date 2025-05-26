package ads_mobile_sdk;

import a.p9;
import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class u12 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f11788a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f11789b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f11790c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f11791d;

    /* renamed from: e, reason: collision with root package name */
    public final a.o8 f11792e;

    /* renamed from: f, reason: collision with root package name */
    public final a.o8 f11793f;

    /* renamed from: g, reason: collision with root package name */
    public final a.o8 f11794g;

    public u12(xv0 xv0Var, a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3, xv0 xv0Var2, a.o8 o8Var4, a.o8 o8Var5) {
        this.f11788a = xv0Var;
        this.f11789b = o8Var;
        this.f11790c = o8Var2;
        this.f11791d = o8Var3;
        this.f11792e = xv0Var2;
        this.f11793f = o8Var4;
        this.f11794g = o8Var5;
    }

    @Override // a.v7
    public final Object get() {
        return new t12((Context) this.f11788a.get(), u90.a(this.f11789b), (p9) this.f11790c.get(), (bt2) this.f11791d.get(), (ExecutorService) this.f11792e.get(), (d22) this.f11793f.get(), (a.se) this.f11794g.get());
    }
}
