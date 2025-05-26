package g7;

import el.n0;
import el.p0;
import el.q0;
import el.t0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f63835a;

    /* renamed from: b, reason: collision with root package name */
    public Map f63836b;

    public s(int i13) {
        if (i13 != 1) {
            this.f63835a = new HashMap();
        } else {
            this.f63835a = new HashMap();
            this.f63836b = new HashMap();
        }
    }

    public final synchronized void a(Map map) {
        this.f63836b = null;
        this.f63835a.clear();
        this.f63835a.putAll(map);
    }

    public final synchronized Map b() {
        try {
            if (this.f63836b == null) {
                this.f63836b = Collections.unmodifiableMap(new HashMap(this.f63835a));
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f63836b;
    }

    public final void c(n0 n0Var) {
        if (n0Var == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        p0 p0Var = new p0(n0Var.f59512a, n0Var.f59513b);
        HashMap hashMap = this.f63835a;
        if (!hashMap.containsKey(p0Var)) {
            hashMap.put(p0Var, n0Var);
            return;
        }
        n0 n0Var2 = (n0) hashMap.get(p0Var);
        if (n0Var2.equals(n0Var) && n0Var.equals(n0Var2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + p0Var);
    }

    public final void d(t0 t0Var) {
        Class b13 = t0Var.b();
        if (!this.f63836b.containsKey(b13)) {
            this.f63836b.put(b13, t0Var);
            return;
        }
        t0 t0Var2 = (t0) this.f63836b.get(b13);
        if (!t0Var2.equals(t0Var) || !t0Var.equals(t0Var2)) {
            throw new GeneralSecurityException(a.a.h("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type", b13));
        }
    }

    public s(q0 q0Var) {
        this.f63835a = new HashMap(q0Var.f59520a);
        this.f63836b = new HashMap(q0Var.f59521b);
    }
}
