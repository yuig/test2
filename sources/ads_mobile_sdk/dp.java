package ads_mobile_sdk;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class dp implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4395a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f4396b;

    public dp(a.o8 o8Var, a.o8 o8Var2) {
        this.f4395a = o8Var;
        this.f4396b = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        kp concurrencyObjects = (kp) this.f4395a.get();
        ek0 exceptionHandler = (ek0) this.f4396b.get();
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        CoroutineContext plus = new ao2.i1(concurrencyObjects.f7429e).plus(exceptionHandler).plus(new zs2());
        kh2.a1.p(plus);
        return plus;
    }
}
