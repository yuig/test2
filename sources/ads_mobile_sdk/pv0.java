package ads_mobile_sdk;

import a6.i;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class pv0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f9830a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f9831b;

    public pv0(xv0 xv0Var, a.o8 o8Var) {
        this.f9830a = xv0Var;
        this.f9831b = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        Context context = (Context) this.f9830a.get();
        kp concurrencyObjects = (kp) this.f9831b.get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        return i.b(qv0.f10290a, null, dl2.b.b(new ao2.i1(concurrencyObjects.f7427c).plus(ue.c.b())), new ov0(context), 6);
    }
}
