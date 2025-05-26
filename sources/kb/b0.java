package kb;

import android.util.Log;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f78967b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile b0 f78968c;

    /* renamed from: a, reason: collision with root package name */
    public final int f78969a;

    public b0(int i13) {
        this.f78969a = i13;
    }

    public static b0 e() {
        b0 b0Var;
        synchronized (f78967b) {
            try {
                if (f78968c == null) {
                    f78968c = new b0(3);
                }
                b0Var = f78968c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return b0Var;
    }

    public static String h(String str) {
        int length = str.length();
        StringBuilder sb3 = new StringBuilder(23);
        sb3.append("WM-");
        if (length >= 20) {
            sb3.append(str.substring(0, 20));
        } else {
            sb3.append(str);
        }
        return sb3.toString();
    }

    public final void a(String str, String str2) {
        if (this.f78969a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2, Throwable th3) {
        if (this.f78969a <= 3) {
            Log.d(str, str2, th3);
        }
    }

    public final void c(String str, String str2) {
        if (this.f78969a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void d(String str, String str2, Throwable th3) {
        if (this.f78969a <= 6) {
            Log.e(str, str2, th3);
        }
    }

    public final void f(String str, String str2) {
        if (this.f78969a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void g(String str, String str2, CancellationException cancellationException) {
        if (this.f78969a <= 4) {
            Log.i(str, str2, cancellationException);
        }
    }

    public final void i(String str, String str2) {
        if (this.f78969a <= 5) {
            Log.w(str, str2);
        }
    }

    public final void j(String str, String str2, RuntimeException runtimeException) {
        if (this.f78969a <= 5) {
            Log.w(str, str2, runtimeException);
        }
    }
}
