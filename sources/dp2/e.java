package dp2;

import android.util.Log;
import java.util.Locale;
import org.chromium.build.annotations.DoNotInline;

/* loaded from: classes2.dex */
public abstract class e {
    @DoNotInline
    public static void a(String str, String str2, Object obj) {
        Object[] objArr = {obj};
        Throwable d2 = d(objArr);
        String c13 = c(str2, d2, objArr);
        String j13 = a.a.j("cr_", str);
        if (d2 != null) {
            Log.e(j13, c13, d2);
        } else {
            Log.e(j13, c13);
        }
    }

    @DoNotInline
    public static void b(String str, String str2, Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        Throwable d2 = d(objArr);
        String c13 = c(str2, d2, objArr);
        String j13 = a.a.j("cr_", str);
        if (d2 != null) {
            Log.e(j13, c13, d2);
        } else {
            Log.e(j13, c13);
        }
    }

    public static String c(String str, Throwable th3, Object... objArr) {
        return ((th3 != null || objArr.length <= 0) && objArr.length <= 1) ? str : String.format(Locale.US, str, objArr);
    }

    public static Throwable d(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    @DoNotInline
    public static void e(String str, String str2, Object obj) {
        Object[] objArr = {obj};
        Throwable d2 = d(objArr);
        String c13 = c(str2, d2, objArr);
        String j13 = a.a.j("cr_", str);
        if (d2 != null) {
            Log.i(j13, c13, d2);
        } else {
            Log.i(j13, c13);
        }
    }

    @DoNotInline
    public static void f(String str, String str2, Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        Throwable d2 = d(objArr);
        String c13 = c(str2, d2, objArr);
        String j13 = a.a.j("cr_", str);
        if (d2 != null) {
            Log.i(j13, c13, d2);
        } else {
            Log.i(j13, c13);
        }
    }

    @DoNotInline
    public static void g(String str, String str2, Object obj) {
        i(str, str2, obj);
    }

    @DoNotInline
    public static void h(String str, String str2, Object obj, Object obj2) {
        i(str, str2, obj, obj2);
    }

    public static void i(String str, String str2, Object... objArr) {
        Throwable d2 = d(objArr);
        String c13 = c(str2, d2, objArr);
        String j13 = a.a.j("cr_", str);
        if (d2 != null) {
            Log.w(j13, c13, d2);
        } else {
            Log.w(j13, c13);
        }
    }
}
