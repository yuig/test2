package ads_mobile_sdk;

import a6.i;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ig0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f6395a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f6396b;

    public ig0(a.o8 o8Var, a.o8 o8Var2) {
        this.f6395a = o8Var;
        this.f6396b = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        Context context = (Context) this.f6395a.get();
        kp concurrencyObjects = (kp) this.f6396b.get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        return i.b(tf0.f11526a, null, dl2.b.b(new ao2.i1(concurrencyObjects.f7427c).plus(ue.c.b())), new gg0(context), 6);
    }
}
