package ads_mobile_sdk;

import java.io.File;

/* loaded from: classes2.dex */
public final class x90 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f13545a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f13546b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f13547c;

    public x90(a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3) {
        this.f13545a = o8Var;
        this.f13546b = o8Var2;
        this.f13547c = o8Var3;
    }

    @Override // a.v7
    public final Object get() {
        return new d22((File) this.f13545a.get(), (wy2) this.f13546b.get(), (bt2) this.f13547c.get());
    }
}
