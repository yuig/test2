package jh;

import android.content.Context;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f76158a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static k0 f76159b;

    /* renamed from: c, reason: collision with root package name */
    public static HandlerThread f76160c;

    public static k0 a(Context context) {
        synchronized (f76158a) {
            try {
                if (f76159b == null) {
                    f76159b = new k0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return f76159b;
    }

    public final void b(String str, String str2, f0 f0Var, boolean z13) {
        i0 i0Var = new i0(str, str2, z13);
        k0 k0Var = (k0) this;
        synchronized (k0Var.f76172d) {
            try {
                j0 j0Var = (j0) k0Var.f76172d.get(i0Var);
                if (j0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(i0Var.toString()));
                }
                if (!j0Var.f76165a.containsKey(f0Var)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(i0Var.toString()));
                }
                j0Var.f76165a.remove(f0Var);
                if (j0Var.f76165a.isEmpty()) {
                    k0Var.f76174f.sendMessageDelayed(k0Var.f76174f.obtainMessage(0, i0Var), k0Var.f76176h);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public abstract boolean c(i0 i0Var, f0 f0Var, String str, Executor executor);
}
