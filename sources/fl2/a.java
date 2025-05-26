package fl2;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f62547a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Method f62548b;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        Intrinsics.f(methods);
        int length = methods.length;
        int i13 = 0;
        while (true) {
            method = null;
            if (i13 >= length) {
                break;
            }
            Method method2 = methods[i13];
            if (Intrinsics.d(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                Intrinsics.checkNotNullParameter(parameterTypes, "<this>");
                if (Intrinsics.d(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i13++;
        }
        f62548b = method;
        int length2 = methods.length;
        for (int i14 = 0; i14 < length2 && !Intrinsics.d(methods[i14].getName(), "getSuppressed"); i14++) {
        }
    }
}
