package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class q41 {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f9942c = Logger.getLogger(q41.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final q41 f9943d = new q41();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f9944a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f9945b = new ConcurrentHashMap();

    public final synchronized void a(l61 l61Var, int i13, boolean z13) {
        if (!(i13 != 1 ? l3.c.o() : l3.c.k())) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        a(l61Var, z13);
    }

    public final a.w9 a(Class cls, String str) {
        a.w9 w9Var;
        synchronized (this) {
            if (this.f9944a.containsKey(str)) {
                w9Var = (a.w9) this.f9944a.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
            }
        }
        if (((l61) w9Var).f7696b.equals(cls)) {
            return w9Var;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + w9Var.getClass() + ", which only supports: " + ((l61) w9Var).f7696b);
    }

    public final synchronized void a(l61 l61Var, boolean z13) {
        try {
            String str = l61Var.f7695a;
            if (z13 && this.f9945b.containsKey(str) && !((Boolean) this.f9945b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
            }
            a.w9 w9Var = (a.w9) this.f9944a.get(str);
            if (w9Var != null && !w9Var.getClass().equals(l61.class)) {
                f9942c.warning("Attempted overwrite of a registered key manager for key type " + str);
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + w9Var.getClass().getName() + ", cannot be re-registered with " + l61.class.getName());
            }
            this.f9944a.putIfAbsent(str, l61Var);
            this.f9945b.put(str, Boolean.valueOf(z13));
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
