package el;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f59499c = Logger.getLogger(k.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final k f59500d;

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f59501a;

    /* renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap f59502b;

    static {
        k kVar = new k();
        kVar.f59501a = new ConcurrentHashMap();
        kVar.f59502b = new ConcurrentHashMap();
        f59500d = kVar;
    }

    public final synchronized uk.h a(String str) {
        if (!this.f59501a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (uk.h) this.f59501a.get(str);
    }

    public final synchronized void b(q qVar, boolean z13) {
        try {
            String str = qVar.f59517a;
            if (z13 && this.f59502b.containsKey(str) && !((Boolean) this.f59502b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
            }
            uk.h hVar = (uk.h) this.f59501a.get(str);
            if (hVar != null && !hVar.getClass().equals(qVar.getClass())) {
                f59499c.warning("Attempted overwrite of a registered key manager for key type " + str);
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + hVar.getClass().getName() + ", cannot be re-registered with " + qVar.getClass().getName());
            }
            this.f59501a.putIfAbsent(str, qVar);
            this.f59502b.put(str, Boolean.valueOf(z13));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void c(q qVar, boolean z13) {
        d(qVar, yk.d.ALGORITHM_NOT_FIPS, z13);
    }

    public final synchronized void d(q qVar, yk.d dVar, boolean z13) {
        if (!dVar.isCompatible()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        b(qVar, z13);
    }
}
