package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class bf1 {

    /* renamed from: b, reason: collision with root package name */
    public static final bf1 f2867b = new bf1();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f2868a = new AtomicReference(g12.a().a());

    public final synchronized void a(a.i5 i5Var) {
        try {
            e12 e12Var = new e12((g12) this.f2868a.get());
            Class b13 = i5Var.b();
            if (e12Var.f4574b.containsKey(b13)) {
                a.i5 i5Var2 = (a.i5) e12Var.f4574b.get(b13);
                if (!i5Var2.equals(i5Var) || !i5Var.equals(i5Var2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + b13);
                }
            } else {
                e12Var.f4574b.put(b13, i5Var);
            }
            this.f2868a.set(new g12(e12Var));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void a(a12 a12Var) {
        try {
            e12 e12Var = new e12((g12) this.f2868a.get());
            if (a12Var != null) {
                f12 f12Var = new f12(a12Var.f3701a, a12Var.f3702b);
                if (e12Var.f4573a.containsKey(f12Var)) {
                    c12 c12Var = (c12) e12Var.f4573a.get(f12Var);
                    if (!c12Var.equals(a12Var) || !a12Var.equals(c12Var)) {
                        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + f12Var);
                    }
                } else {
                    e12Var.f4573a.put(f12Var, a12Var);
                }
                this.f2868a.set(new g12(e12Var));
            } else {
                throw new NullPointerException("primitive constructor must be non-null");
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
