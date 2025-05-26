package sm;

import a.cb;
import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kh2.k3;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final so.a f113229a;

    static {
        so.a aVar;
        try {
            aVar = new b();
        } catch (ReflectiveOperationException unused) {
            aVar = new a();
        }
        f113229a = aVar;
    }

    public static void a(AccessibleObject accessibleObject, StringBuilder sb3) {
        sb3.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i13 = 0; i13 < parameterTypes.length; i13++) {
            if (i13 > 0) {
                sb3.append(", ");
            }
            sb3.append(parameterTypes[i13].getSimpleName());
        }
        sb3.append(')');
    }

    public static String b(Constructor constructor) {
        StringBuilder sb3 = new StringBuilder(constructor.getDeclaringClass().getName());
        a(constructor, sb3);
        return sb3.toString();
    }

    public static void c(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String d(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String e(AccessibleObject accessibleObject, boolean z13) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + d((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb3 = new StringBuilder(method.getName());
            a(method, sb3);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb3.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + b((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z13 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static Method f(Class cls, Field field) {
        return f113229a.d(cls, field);
    }

    public static String g(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        return "\nSee " + k3.L((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson");
    }

    public static void h(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e13) {
            StringBuilder o13 = cb.o("Failed making ", e(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            o13.append(g(e13));
            throw new JsonIOException(o13.toString(), e13);
        }
    }
}
