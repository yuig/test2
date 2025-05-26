package ads_mobile_sdk;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class bp implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f3549a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f3550b;

    public bp(a.o8 o8Var, a.o8 o8Var2) {
        this.f3549a = o8Var;
        this.f3550b = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        kp concurrencyObjects = (kp) this.f3549a.get();
        ek0 exceptionHandler = (ek0) this.f3550b.get();
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        CoroutineContext plus = new ao2.i1(concurrencyObjects.f7426b).plus(exceptionHandler).plus(new zs2());
        kh2.a1.p(plus);
        return plus;
    }
}
