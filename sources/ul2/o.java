package ul2;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o extends tb.f {

    /* renamed from: h, reason: collision with root package name */
    public final Method f122563h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f122564i;

    public o(Method getterMethod, Method method) {
        Intrinsics.checkNotNullParameter(getterMethod, "getterMethod");
        this.f122563h = getterMethod;
        this.f122564i = method;
    }

    @Override // tb.f
    public final String v() {
        return bs1.c.f(this.f122563h);
    }
}
