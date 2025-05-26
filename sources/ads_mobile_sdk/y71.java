package ads_mobile_sdk;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class y71 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f14119a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f14120b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f14121c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f14122d;

    /* renamed from: e, reason: collision with root package name */
    public final a.o8 f14123e;

    public y71(a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3, a.o8 o8Var4, a.o8 o8Var5) {
        this.f14119a = o8Var;
        this.f14120b = o8Var2;
        this.f14121c = o8Var3;
        this.f14122d = o8Var4;
        this.f14123e = o8Var5;
    }

    @Override // a.v7
    public final Object get() {
        Context context = (Context) this.f14119a.get();
        com.google.common.util.concurrent.e0 e0Var = (com.google.common.util.concurrent.e0) this.f14120b.get();
        ExecutorService executorService = (ExecutorService) this.f14121c.get();
        xp0 xp0Var = (xp0) this.f14122d.get();
        i4 i4Var = (i4) this.f14123e.get();
        return new x71(context, e0Var, executorService, xp0Var, new Random(), i4Var.D().v(), i4Var.D().s(), i4Var.D().t(), i4Var.D().u(), i4Var.A());
    }
}
