package ads_mobile_sdk;

import a.pd;
import android.content.Context;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i62 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f6265a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f6266b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f6267c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f6268d;

    /* renamed from: e, reason: collision with root package name */
    public final a.o8 f6269e;

    public i62(a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3, xv0 xv0Var, a.o8 o8Var4) {
        this.f6265a = o8Var;
        this.f6266b = o8Var2;
        this.f6267c = o8Var3;
        this.f6268d = xv0Var;
        this.f6269e = o8Var4;
    }

    @Override // a.v7
    public final Object get() {
        return new h62((pd) this.f6265a.get(), (a.m) this.f6266b.get(), (Map) this.f6267c.get(), (Context) this.f6268d.get(), (bt2) this.f6269e.get());
    }
}
