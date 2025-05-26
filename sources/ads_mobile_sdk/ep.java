package ads_mobile_sdk;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ep implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4914a;

    public ep(a.o8 o8Var) {
        this.f4914a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        CoroutineContext context = (CoroutineContext) this.f4914a.get();
        Intrinsics.checkNotNullParameter(context, "context");
        return dl2.b.b(context.plus(ue.c.b()));
    }
}
