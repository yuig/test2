package bo2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.Intrinsics;
import xk2.q;
import xk2.r;
import xk2.s;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23613a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object m13;
        try {
            q qVar = s.f135225b;
            m13 = new e(a(Looper.getMainLooper()));
        } catch (Throwable th3) {
            q qVar2 = s.f135225b;
            m13 = ue.c.m(th3);
        }
        if (m13 instanceof r) {
            m13 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Intrinsics.g(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }
}
