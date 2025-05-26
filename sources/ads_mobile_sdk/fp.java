package ads_mobile_sdk;

import ko2.f;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fp implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f5230a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f5231b;

    public fp(a.o8 o8Var, a.o8 o8Var2) {
        this.f5230a = o8Var;
        this.f5231b = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        kp concurrencyObjects = (kp) this.f5230a.get();
        ek0 exceptionHandler = (ek0) this.f5231b.get();
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        f fVar = ao2.v0.f20219a;
        CoroutineContext plus = ho2.q.f69782a.plus(exceptionHandler).plus(new zs2());
        kh2.a1.p(plus);
        return plus;
    }
}
