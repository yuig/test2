package ads_mobile_sdk;

import ao2.j0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ft2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ft2 f5279a = new ft2();

    public static void a(Exception exc) {
        List list = c0.d.f(exc, exc).f6994p;
        String message = exc.getMessage();
        if (message == null) {
            message = exc.getClass().getName();
        }
        list.add(message);
    }

    public static void b(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        a(true, null, exception);
    }

    public static void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        a(true, message, null);
    }

    public static void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        cs2 a13 = qs2.a();
        a13.f().f6988j = false;
        a13.f().f6994p.add(message);
    }

    public static void a(j0 j0Var, Function2 block) {
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    public static void a(jk0 error) {
        String c13;
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof nk0) {
            c13 = ((nk0) error).c();
        } else if (error instanceof kk0) {
            kk0 kk0Var = (kk0) error;
            String d2 = kk0Var.d();
            c13 = d2 == null ? kk0Var.c().getClass().getName() : d2;
        } else if (error instanceof sk0) {
            c13 = "WebView destroyed when method invoked.";
        } else if (error instanceof rk0) {
            rk0 rk0Var = (rk0) error;
            c13 = rk0Var.d() + ": " + rk0Var.c() + " on url: " + rk0Var.e();
        } else if (error instanceof mk0) {
            mk0 mk0Var = (mk0) error;
            c13 = Integer.valueOf(mk0Var.c().f129984a) + ": " + mk0Var.c().f129985b;
        } else if (error instanceof lk0) {
            lk0 lk0Var = (lk0) error;
            c13 = "Code: " + lk0Var.c().f95723d + ", Message: " + lk0Var.c().f95722c;
        } else if (error instanceof ok0) {
            c13 = ((ok0) error).c();
        } else {
            if (!(error instanceof qk0)) {
                throw new NoWhenBranchMatchedException();
            }
            c13 = ((qk0) error).c();
        }
        a(false, c13, error.b());
    }

    public static void a(String message, Exception exc) {
        Intrinsics.checkNotNullParameter(message, "message");
        a(true, message, exc);
    }

    public static void a(boolean z13, String str, Throwable th3) {
        cs2 a13 = qs2.a();
        if (str != null) {
            a13.f().f6994p.add(str);
        }
        a13.f().f6988j = false;
        if (th3 != null) {
            if (z13) {
                a13.a(th3);
            } else {
                a13.b(th3);
            }
        }
    }
}
