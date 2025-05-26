package ads_mobile_sdk;

import android.content.Context;

/* loaded from: classes2.dex */
public final class kd implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f7228a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f7229b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f7230c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f7231d;

    public kd(a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3, a.o8 o8Var4) {
        this.f7228a = o8Var;
        this.f7229b = o8Var2;
        this.f7230c = o8Var3;
        this.f7231d = o8Var4;
    }

    @Override // a.v7
    public final Object get() {
        return new jd((Context) this.f7228a.get(), (i4) this.f7230c.get(), (bt2) this.f7229b.get(), (com.google.common.util.concurrent.d0) this.f7231d.get());
    }
}
