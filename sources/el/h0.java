package el;

import com.google.crypto.tink.internal.TinkBugException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f59491b;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f59492a = new AtomicReference(new a1(new com.google.firebase.messaging.q(14)));

    static {
        try {
            h0 h0Var = new h0();
            h0Var.d(new n(new wk.a(24), s.class));
            f59491b = h0Var;
        } catch (Exception e13) {
            throw new TinkBugException(e13);
        }
    }

    public final se.l a(u0 u0Var) {
        a1 a1Var = (a1) this.f59492a.get();
        a1Var.getClass();
        y0 y0Var = new y0(u0.class, u0Var.f59538b);
        HashMap hashMap = a1Var.f59454b;
        if (hashMap.containsKey(y0Var)) {
            return ((l) hashMap.get(y0Var)).f59505c.b(u0Var);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + y0Var + " available");
    }

    public final uk.q b(v0 v0Var) {
        a1 a1Var = (a1) this.f59492a.get();
        a1Var.getClass();
        y0 y0Var = new y0(v0.class, v0Var.f59545a);
        HashMap hashMap = a1Var.f59456d;
        if (hashMap.containsKey(y0Var)) {
            return ((j0) hashMap.get(y0Var)).f59498c.o(v0Var);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + y0Var + " available");
    }

    public final synchronized void c(l lVar) {
        com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q((a1) this.f59492a.get());
        qVar.t(lVar);
        this.f59492a.set(new a1(qVar));
    }

    public final synchronized void d(n nVar) {
        com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q((a1) this.f59492a.get());
        qVar.u(nVar);
        this.f59492a.set(new a1(qVar));
    }

    public final synchronized void e(j0 j0Var) {
        com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q((a1) this.f59492a.get());
        qVar.v(j0Var);
        this.f59492a.set(new a1(qVar));
    }

    public final synchronized void f(l0 l0Var) {
        com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q((a1) this.f59492a.get());
        qVar.w(l0Var);
        this.f59492a.set(new a1(qVar));
    }

    public final x0 g(se.l lVar) {
        a1 a1Var = (a1) this.f59492a.get();
        a1Var.getClass();
        z0 z0Var = new z0(lVar.getClass(), u0.class);
        HashMap hashMap = a1Var.f59453a;
        if (hashMap.containsKey(z0Var)) {
            return ((n) hashMap.get(z0Var)).f59511c.d(lVar);
        }
        throw new GeneralSecurityException("No Key serializer for " + z0Var + " available");
    }

    public final x0 h(uk.q qVar) {
        a1 a1Var = (a1) this.f59492a.get();
        a1Var.getClass();
        z0 z0Var = new z0(qVar.getClass(), v0.class);
        HashMap hashMap = a1Var.f59455c;
        if (hashMap.containsKey(z0Var)) {
            return ((l0) hashMap.get(z0Var)).f59508c.l(qVar);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + z0Var + " available");
    }
}
