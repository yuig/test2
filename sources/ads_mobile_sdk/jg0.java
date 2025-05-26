package ads_mobile_sdk;

import a6.i;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class jg0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f6800a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f6801b;

    public jg0(a.o8 o8Var, a.o8 o8Var2) {
        this.f6800a = o8Var;
        this.f6801b = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        Context context = (Context) this.f6800a.get();
        kp concurrencyObjects = (kp) this.f6801b.get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        return i.b(be2.f2865a, null, dl2.b.b(new ao2.i1(concurrencyObjects.f7427c).plus(ue.c.b())), new hg0(context), 6);
    }
}
