package el;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f59451b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f59452a = new HashMap();

    static {
        vk.h hVar = new vk.h(8);
        a0 a0Var = new a0();
        try {
            a0Var.a(hVar, u.class);
            f59451b = a0Var;
        } catch (GeneralSecurityException e13) {
            throw new IllegalStateException("unexpected error.", e13);
        }
    }

    public final synchronized void a(z zVar, Class cls) {
        try {
            z zVar2 = (z) this.f59452a.get(cls);
            if (zVar2 != null && !zVar2.equals(zVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls + " already inserted");
            }
            this.f59452a.put(cls, zVar);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final se.l b(uk.q qVar, Integer num) {
        se.l a13;
        synchronized (this) {
            z zVar = (z) this.f59452a.get(qVar.getClass());
            if (zVar == null) {
                throw new GeneralSecurityException("Cannot create a new key for parameters " + qVar + ": no key creator for this class was registered.");
            }
            a13 = zVar.a(qVar, num);
        }
        return a13;
    }
}
