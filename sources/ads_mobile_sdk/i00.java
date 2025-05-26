package ads_mobile_sdk;

import android.content.Context;
import ao2.j0;

/* loaded from: classes2.dex */
public final class i00 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f6157a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f6158b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f6159c;

    public i00(xv0 xv0Var, a.o8 o8Var, a.o8 o8Var2) {
        this.f6157a = xv0Var;
        this.f6158b = o8Var;
        this.f6159c = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        return new e00((Context) this.f6157a.get(), (j0) this.f6158b.get(), (sb2) this.f6159c.get());
    }
}
