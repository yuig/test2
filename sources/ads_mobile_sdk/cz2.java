package ads_mobile_sdk;

import a.zb;
import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class cz2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4075a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f4076b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f4077c;

    public cz2(a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3) {
        this.f4075a = o8Var;
        this.f4076b = o8Var2;
        this.f4077c = o8Var3;
    }

    @Override // a.v7
    public final Object get() {
        return new bz2((Context) this.f4075a.get(), (zb) this.f4076b.get(), (ExecutorService) this.f4077c.get(), bz2.f3659f);
    }
}
