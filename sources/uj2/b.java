package uj2;

import gk2.d1;
import java.util.concurrent.TimeUnit;
import lb.l0;
import x02.a2;

/* loaded from: classes2.dex */
public abstract class b implements f {
    public static fk2.n g(Throwable th3) {
        ck2.i.b(th3, "error is null");
        return new fk2.n(th3, 0);
    }

    public static fk2.c0 n(long j13, TimeUnit timeUnit, a0 a0Var) {
        ck2.i.b(timeUnit, "unit is null");
        ck2.i.b(a0Var, "scheduler is null");
        return new fk2.c0(j13, timeUnit, a0Var);
    }

    public static NullPointerException p(Throwable th3) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th3);
        return nullPointerException;
    }

    public final fk2.c b(b bVar) {
        return new fk2.c(0, this, bVar);
    }

    public final hk2.o c(b0 b0Var) {
        return new hk2.o(2, b0Var, this);
    }

    public final fk2.j d(long j13, TimeUnit timeUnit) {
        a0 a0Var = tk2.e.f118016b;
        ck2.i.b(timeUnit, "unit is null");
        ck2.i.b(a0Var, "scheduler is null");
        return new fk2.j(this, j13, timeUnit, a0Var);
    }

    public final fk2.x e(ak2.a aVar) {
        a2 a2Var = ck2.i.f27924d;
        return new fk2.x(this, a2Var, a2Var, aVar);
    }

    public final fk2.x f(ak2.e eVar) {
        return new fk2.x(this, ck2.i.f27924d, eVar, ck2.i.f27923c);
    }

    public final fk2.l h(a0 a0Var) {
        ck2.i.b(a0Var, "scheduler is null");
        return new fk2.l(this, a0Var, 1);
    }

    public final ek2.f i(ak2.a aVar, ak2.e eVar) {
        ck2.i.b(eVar, "onError is null");
        ek2.f fVar = new ek2.f(aVar, eVar);
        j(fVar);
        return fVar;
    }

    public final void j(d dVar) {
        ck2.i.b(dVar, "observer is null");
        try {
            k(dVar);
        } catch (NullPointerException e13) {
            throw e13;
        } catch (Throwable th3) {
            bp1.h.H(th3);
            l0.R0(th3);
            throw p(th3);
        }
    }

    public abstract void k(d dVar);

    public final fk2.c l(a0 a0Var) {
        ck2.i.b(a0Var, "scheduler is null");
        return new fk2.c(3, this, a0Var);
    }

    public final fk2.a0 m(long j13, TimeUnit timeUnit, a0 a0Var) {
        ck2.i.b(timeUnit, "unit is null");
        ck2.i.b(a0Var, "scheduler is null");
        return new fk2.a0(this, j13, timeUnit, a0Var);
    }

    public final l o() {
        return this instanceof hk2.u ? ((hk2.u) this).r() : new d1(this, 2);
    }

    public final fk2.f0 q(Object obj) {
        ck2.i.b(obj, "completionValue is null");
        return new fk2.f0(this, null, obj, 0);
    }
}
