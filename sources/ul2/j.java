package ul2;

import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j extends so.a {

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f122532b;

    public j(Constructor constructor) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        this.f122532b = constructor;
    }

    @Override // so.a
    public final String a() {
        Class<?>[] parameterTypes = this.f122532b.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        return kotlin.collections.c0.M(parameterTypes, "", "<init>(", ")V", 0, null, h.f122523k, 24);
    }
}
