package ul2;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends so.a {

    /* renamed from: b, reason: collision with root package name */
    public final Method f122537b;

    public k(Method method) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.f122537b = method;
    }

    @Override // so.a
    public final String a() {
        return bs1.c.f(this.f122537b);
    }
}
