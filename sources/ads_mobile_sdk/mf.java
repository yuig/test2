package ads_mobile_sdk;

import a6.i;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class mf implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f8194a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f8195b;

    public mf(a.o8 o8Var, a.o8 o8Var2) {
        this.f8194a = o8Var;
        this.f8195b = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        Context context = (Context) this.f8194a.get();
        kp concurrencyObjects = (kp) this.f8195b.get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        return i.b(qf.f10061a, null, dl2.b.b(new ao2.i1(concurrencyObjects.f7427c).plus(ue.c.b())), new kf(context), 6);
    }
}
