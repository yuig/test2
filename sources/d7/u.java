package d7;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f53889a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static int f53890b;

    public static String a(String str, Throwable th3) {
        String e13 = e(th3);
        if (TextUtils.isEmpty(e13)) {
            return str;
        }
        StringBuilder D = ep.b.D(str, "\n  ");
        D.append(e13.replace("\n", "\n  "));
        D.append('\n');
        return D.toString();
    }

    public static void b(String str, String str2) {
        synchronized (f53889a) {
            if (f53890b == 0) {
                Log.d(str, a(str2, null));
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f53889a) {
            if (f53890b <= 3) {
                Log.e(str, a(str2, null));
            }
        }
    }

    public static void d(String str, String str2, Throwable th3) {
        synchronized (f53889a) {
            if (f53890b <= 3) {
                Log.e(str, a(str2, th3));
            }
        }
    }

    public static String e(Throwable th3) {
        if (th3 == null) {
            return null;
        }
        synchronized (f53889a) {
            for (Throwable th4 = th3; th4 != null; th4 = th4.getCause()) {
                try {
                    if (th4 instanceof UnknownHostException) {
                        return "UnknownHostException (no network)";
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            return Log.getStackTraceString(th3).trim().replace("\t", "    ");
        }
    }

    public static void f(String str, String str2) {
        synchronized (f53889a) {
            if (f53890b <= 1) {
                Log.i(str, a(str2, null));
            }
        }
    }

    public static void g(String str, String str2) {
        synchronized (f53889a) {
            if (f53890b <= 2) {
                Log.w(str, a(str2, null));
            }
        }
    }

    public static void h(String str, String str2, Throwable th3) {
        synchronized (f53889a) {
            if (f53890b <= 2) {
                Log.w(str, a(str2, th3));
            }
        }
    }
}
