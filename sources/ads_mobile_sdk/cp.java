package ads_mobile_sdk;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class cp implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f3992a;

    public cp(a.o8 o8Var) {
        this.f3992a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        CoroutineContext context = (CoroutineContext) this.f3992a.get();
        Intrinsics.checkNotNullParameter(context, "context");
        return dl2.b.b(context.plus(ue.c.b()));
    }
}
