package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;

/* loaded from: classes2.dex */
public class Intrinsics {
    public static boolean a(float f13, Float f14) {
        return f14 != null && f13 == f14.floatValue();
    }

    public static boolean b(Double d2, double d13) {
        return d2 != null && d2.doubleValue() == d13;
    }

    public static boolean c(Float f13, float f14) {
        return f13 != null && f13.floatValue() == f14;
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(a.a.C(str, " must not be null"));
        l(nullPointerException);
        throw nullPointerException;
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj != null) {
            return;
        }
        q(str);
        throw null;
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        m(Intrinsics.class.getName(), illegalStateException);
        throw illegalStateException;
    }

    public static void f(Object obj) {
        if (obj != null) {
            return;
        }
        o();
        throw null;
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        p(str);
        throw null;
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(k(str));
        m(Intrinsics.class.getName(), illegalArgumentException);
        throw illegalArgumentException;
    }

    public static int i(int i13, int i14) {
        if (i13 < i14) {
            return -1;
        }
        return i13 == i14 ? 0 : 1;
    }

    public static int j(long j13, long j14) {
        if (j13 < j14) {
            return -1;
        }
        return j13 == j14 ? 0 : 1;
    }

    public static String k(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i13 = 0;
        while (!stackTrace[i13].getClassName().equals(name)) {
            i13++;
        }
        while (stackTrace[i13].getClassName().equals(name)) {
            i13++;
        }
        StackTraceElement stackTraceElement = stackTrace[i13];
        StringBuilder w13 = a.a.w("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        w13.append(str);
        return w13.toString();
    }

    public static void l(NullPointerException nullPointerException) {
        m(Intrinsics.class.getName(), nullPointerException);
    }

    public static void m(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i13 = -1;
        for (int i14 = 0; i14 < length; i14++) {
            if (str.equals(stackTrace[i14].getClassName())) {
                i13 = i14;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i13 + 1, length));
    }

    public static String n(Object obj, String str) {
        return str + obj;
    }

    public static void o() {
        NullPointerException nullPointerException = new NullPointerException();
        m(Intrinsics.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void p(String str) {
        NullPointerException nullPointerException = new NullPointerException(str);
        m(Intrinsics.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void q(String str) {
        NullPointerException nullPointerException = new NullPointerException(k(str));
        m(Intrinsics.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void r(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(a.a.k("lateinit property ", str, " has not been initialized"));
        m(Intrinsics.class.getName(), uninitializedPropertyAccessException);
        throw uninitializedPropertyAccessException;
    }
}
