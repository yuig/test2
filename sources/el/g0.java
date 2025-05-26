package el;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f59489b = new g0();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f59490a = new AtomicReference(new q0(new g7.s(1)));

    public final Class a(Class cls) {
        HashMap hashMap = ((q0) this.f59490a.get()).f59521b;
        if (hashMap.containsKey(cls)) {
            return ((t0) hashMap.get(cls)).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public final Object b(se.l lVar, Class cls) {
        q0 q0Var = (q0) this.f59490a.get();
        q0Var.getClass();
        p0 p0Var = new p0(lVar.getClass(), cls);
        HashMap hashMap = q0Var.f59520a;
        if (hashMap.containsKey(p0Var)) {
            return ((n0) hashMap.get(p0Var)).f59514c.g(lVar);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + p0Var + " available");
    }

    public final synchronized void c(n0 n0Var) {
        g7.s sVar = new g7.s((q0) this.f59490a.get());
        sVar.c(n0Var);
        this.f59490a.set(new q0(sVar));
    }

    public final synchronized void d(t0 t0Var) {
        g7.s sVar = new g7.s((q0) this.f59490a.get());
        sVar.d(t0Var);
        this.f59490a.set(new q0(sVar));
    }
}
