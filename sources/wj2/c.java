package wj2;

import pk2.h;
import uj2.a0;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f130034a;

    static {
        try {
            a0 a0Var = (a0) new a(0).call();
            if (a0Var == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f130034a = a0Var;
        } catch (Throwable th3) {
            throw h.d(th3);
        }
    }

    public static a0 a() {
        a0 a0Var = f130034a;
        if (a0Var != null) {
            return a0Var;
        }
        throw new NullPointerException("scheduler == null");
    }
}
