package ul2;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends so.a {

    /* renamed from: b, reason: collision with root package name */
    public final List f122530b;

    public i(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Method[] declaredMethods = jClass.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        this.f122530b = kotlin.collections.c0.T(new sw0.u(21), declaredMethods);
    }

    @Override // so.a
    public final String a() {
        return CollectionsKt.Z(this.f122530b, "", "<init>(", ")V", 0, null, h.f122522j, 24);
    }
}
