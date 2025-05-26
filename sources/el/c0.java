package el;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f59461b = new c0();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f59462a = new HashMap();

    public final synchronized void a(b0 b0Var, Class cls) {
        try {
            b0 b0Var2 = (b0) this.f59462a.get(cls);
            if (b0Var2 != null && !b0Var2.equals(b0Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f59462a.put(cls, b0Var);
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
