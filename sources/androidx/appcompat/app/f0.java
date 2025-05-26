package androidx.appcompat.app;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class f0 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, n0 n0Var) {
        Objects.requireNonNull(n0Var);
        e0 e0Var = new e0(n0Var, 0);
        a.d1.n(obj).registerOnBackInvokedCallback(1000000, e0Var);
        return e0Var;
    }

    public static void c(Object obj, Object obj2) {
        a.d1.n(obj).unregisterOnBackInvokedCallback(a.d1.l(obj2));
    }
}
