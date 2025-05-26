package ads_mobile_sdk;

import a6.i;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class gh1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f5568a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f5569b;

    public gh1(xv0 xv0Var, a.o8 o8Var) {
        this.f5568a = xv0Var;
        this.f5569b = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        Context context = (Context) this.f5568a.get();
        kp concurrencyObjects = (kp) this.f5569b.get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        return i.b(hh1.f5974a, null, dl2.b.b(new ao2.i1(concurrencyObjects.f7427c).plus(ue.c.b())), new fh1(context), 6);
    }
}
