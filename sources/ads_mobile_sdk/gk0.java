package ads_mobile_sdk;

import android.util.Log;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class gk0 {

    /* renamed from: a */
    public static final ok.e0 f5596a = new ok.e0(new hc.m(4000, 0));

    public static void a(String msg, Throwable th3) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (a(6)) {
            Iterator it = f5596a.b(msg).iterator();
            while (true) {
                ok.c0 c0Var = (ok.c0) it;
                if (!c0Var.hasNext()) {
                    break;
                }
                String str = (String) c0Var.next();
                Log.e("GoogleMobileAds", Thread.currentThread().getName() + ": " + str);
            }
            if (th3 != null) {
                String stackTraceString = Log.getStackTraceString(th3);
                Intrinsics.checkNotNullExpressionValue(stackTraceString, "getStackTraceString(...)");
                Log.e("GoogleMobileAds", stackTraceString);
            }
        }
    }

    public static void b(String msg, Throwable th3) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (a(4)) {
            Iterator it = f5596a.b(msg).iterator();
            while (true) {
                ok.c0 c0Var = (ok.c0) it;
                if (!c0Var.hasNext()) {
                    break;
                }
                String str = (String) c0Var.next();
                Log.i("GoogleMobileAds", Thread.currentThread().getName() + ": " + str);
            }
            if (th3 != null) {
                String stackTraceString = Log.getStackTraceString(th3);
                Intrinsics.checkNotNullExpressionValue(stackTraceString, "getStackTraceString(...)");
                Log.i("GoogleMobileAds", stackTraceString);
            }
        }
    }

    public static void c(String msg, Throwable th3) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (a(2)) {
            Iterator it = f5596a.b(msg).iterator();
            while (true) {
                ok.c0 c0Var = (ok.c0) it;
                if (!c0Var.hasNext()) {
                    break;
                }
                String str = (String) c0Var.next();
                Log.v("GoogleMobileAds", Thread.currentThread().getName() + ": " + str);
            }
            if (th3 != null) {
                String stackTraceString = Log.getStackTraceString(th3);
                Intrinsics.checkNotNullExpressionValue(stackTraceString, "getStackTraceString(...)");
                Log.v("GoogleMobileAds", stackTraceString);
            }
        }
    }

    public static void d(String msg, Throwable th3) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (a(5)) {
            Iterator it = f5596a.b(msg).iterator();
            while (true) {
                ok.c0 c0Var = (ok.c0) it;
                if (!c0Var.hasNext()) {
                    break;
                }
                String str = (String) c0Var.next();
                Log.w("GoogleMobileAds", Thread.currentThread().getName() + ": " + str);
            }
            if (th3 != null) {
                String stackTraceString = Log.getStackTraceString(th3);
                Intrinsics.checkNotNullExpressionValue(stackTraceString, "getStackTraceString(...)");
                Log.w("GoogleMobileAds", stackTraceString);
            }
        }
    }

    public static boolean a(int i13) {
        return i13 >= wk.f13104b || Log.isLoggable("GoogleMobileAds", i13);
    }

    public static void a(Function0 msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (wk.a() == xk.f13700a || !a(2)) {
            return;
        }
        Iterator it = f5596a.b((CharSequence) msg.invoke()).iterator();
        while (true) {
            ok.c0 c0Var = (ok.c0) it;
            if (!c0Var.hasNext()) {
                return;
            }
            String str = (String) c0Var.next();
            Log.v("GoogleMobileAds", Thread.currentThread().getName() + ": " + str);
        }
    }

    public static ok.e0 a() {
        return f5596a;
    }
}
