package uj2;

import gk2.m1;
import gk2.o1;
import gk2.q1;
import gk2.s1;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import jk2.h0;
import jk2.h1;
import jk2.i1;
import jk2.i2;
import jk2.j1;
import jk2.k0;
import jk2.k2;
import jk2.l1;
import jk2.n0;
import jk2.o2;
import jk2.t1;
import jk2.u2;
import jk2.w2;
import jk2.y2;
import lb.l0;

/* loaded from: classes2.dex */
public abstract class q<T> implements t {
    public static q D(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.d("count >= 0 required but it was ", i13));
        }
        if (i13 == 0) {
            return h0.f76488a;
        }
        if (i13 == 1) {
            return y(1);
        }
        if (1 + (i13 - 1) <= 2147483647L) {
            return new t1(i13);
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    public static w2 M(long j13, TimeUnit timeUnit, a0 a0Var) {
        ck2.i.b(timeUnit, "unit is null");
        ck2.i.b(a0Var, "scheduler is null");
        return new w2(Math.max(j13, 0L), timeUnit, a0Var);
    }

    public static q P(t tVar, q qVar, ak2.c cVar) {
        ck2.i.b(tVar, "source1 is null");
        ck2.i.b(qVar, "source2 is null");
        ck2.a aVar = new ck2.a(cVar, 0);
        int i13 = h.f122339a;
        t[] tVarArr = {tVar, qVar};
        ck2.i.c(i13, "bufferSize");
        return new jk2.h(tVarArr, null, aVar, i13, 1);
    }

    public static jk2.h g(ArrayList arrayList, ak2.f fVar) {
        int i13 = h.f122339a;
        ck2.i.c(i13, "bufferSize");
        return new jk2.h(null, arrayList, fVar, i13 << 1, 0);
    }

    public static jk2.h h(q qVar, q qVar2, ak2.c cVar) {
        ck2.i.b(qVar, "source1 is null");
        ck2.i.b(qVar2, "source2 is null");
        ck2.a aVar = new ck2.a(cVar, 0);
        int i13 = h.f122339a;
        t[] tVarArr = {qVar, qVar2};
        ck2.i.c(i13, "bufferSize");
        return new jk2.h(tVarArr, null, aVar, i13 << 1, 0);
    }

    public static jk2.m j(q qVar, q qVar2) {
        return new jk2.m(v(qVar, qVar2), h.f122339a, pk2.e.BOUNDARY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static q k(ArrayList arrayList) {
        ol1.d w13 = w(arrayList);
        ck2.e eVar = ck2.i.f27921a;
        int i13 = h.f122339a;
        ck2.i.c(i13, "prefetch");
        if (!(w13 instanceof dk2.g)) {
            return new jk2.m(w13, i13, pk2.e.BOUNDARY);
        }
        Object call = ((dk2.g) w13).call();
        return call == null ? h0.f76488a : new ik2.b(3, call, eVar);
    }

    public static cl1.e r(Throwable th3) {
        ck2.i.b(th3, "exception is null");
        return new cl1.e(new ck2.f(th3), 2);
    }

    public static q v(Object... objArr) {
        return objArr.length == 0 ? h0.f76488a : objArr.length == 1 ? y(objArr[0]) : new ol1.d(objArr, 4);
    }

    public static ol1.d w(Iterable iterable) {
        ck2.i.b(iterable, "source is null");
        return new ol1.d(iterable, 5);
    }

    public static h1 x(long j13, long j14, TimeUnit timeUnit, a0 a0Var) {
        ck2.i.b(timeUnit, "unit is null");
        ck2.i.b(a0Var, "scheduler is null");
        return new h1(Math.max(0L, j13), Math.max(0L, j14), timeUnit, a0Var);
    }

    public static i1 y(Object obj) {
        ck2.i.b(obj, "item is null");
        return new i1(obj);
    }

    public static q z(t tVar, i2 i2Var) {
        ck2.i.b(tVar, "source1 is null");
        return v(tVar, i2Var).u(ck2.i.f27921a, true, 2, h.f122339a);
    }

    public final l1 A(a0 a0Var) {
        int i13 = h.f122339a;
        ck2.i.b(a0Var, "scheduler is null");
        ck2.i.c(i13, "bufferSize");
        return new l1(this, a0Var, i13);
    }

    public final j1 B(Class cls) {
        return new j1(new jk2.x(this, new ck2.a(cls), 2), new ck2.a(cls, 1), 0);
    }

    public final n0 C(q qVar) {
        return new n0(this, new ck2.f(qVar), false, 3);
    }

    public final xj2.c E(ak2.e eVar, ak2.e eVar2) {
        return F(eVar, eVar2, ck2.i.f27923c, ck2.i.f27924d);
    }

    public final xj2.c F(ak2.e eVar, ak2.e eVar2, ak2.a aVar, ak2.e eVar3) {
        ck2.i.b(eVar, "onNext is null");
        ek2.j jVar = new ek2.j(eVar, eVar2, aVar, eVar3);
        d(jVar);
        return jVar;
    }

    public abstract void G(v vVar);

    public final jk2.x H(a0 a0Var) {
        ck2.i.b(a0Var, "scheduler is null");
        return new jk2.x(this, a0Var, 3);
    }

    public final k2 I(long j13) {
        if (j13 >= 0) {
            return new k2(this, j13);
        }
        throw new IllegalArgumentException(a.a.g("count >= 0 required but it was ", j13));
    }

    public final i2 J(t tVar) {
        ck2.i.b(tVar, "other is null");
        return new i2(this, tVar, 1);
    }

    public final o2 K(long j13, TimeUnit timeUnit) {
        a0 a0Var = tk2.e.f118016b;
        ck2.i.b(timeUnit, "unit is null");
        ck2.i.b(a0Var, "scheduler is null");
        return new o2(j13, this, a0Var, timeUnit);
    }

    public final u2 L(long j13, TimeUnit timeUnit, a0 a0Var) {
        ck2.i.b(timeUnit, "timeUnit is null");
        ck2.i.b(a0Var, "scheduler is null");
        return new u2(this, j13, timeUnit, a0Var);
    }

    public final h N(a aVar) {
        fk2.d0 d0Var = new fk2.d0(this, 1);
        int i13 = p.f122342a[aVar.ordinal()];
        if (i13 == 1) {
            return new o1(d0Var);
        }
        if (i13 == 2) {
            return new s1(d0Var);
        }
        if (i13 == 3) {
            return d0Var;
        }
        if (i13 == 4) {
            return new q1(d0Var);
        }
        int i14 = h.f122339a;
        ck2.i.c(i14, "capacity");
        return new m1(d0Var, i14);
    }

    public final y2 O() {
        ck2.i.c(16, "capacityHint");
        return new y2(this);
    }

    @Override // uj2.t
    public final void d(v vVar) {
        ck2.i.b(vVar, "observer is null");
        try {
            G(vVar);
        } catch (NullPointerException e13) {
            throw e13;
        } catch (Throwable th3) {
            bp1.h.H(th3);
            l0.R0(th3);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th3);
            throw nullPointerException;
        }
    }

    public final Object f() {
        ek2.d dVar = new ek2.d(1);
        d(dVar);
        Object d2 = dVar.d();
        if (d2 != null) {
            return d2;
        }
        throw new NoSuchElementException();
    }

    public final q i(u uVar) {
        ck2.i.b(uVar, "composer is null");
        t b13 = uVar.b(this);
        ck2.i.b(b13, "source is null");
        return b13 instanceof q ? (q) b13 : new cl1.e(b13, 4);
    }

    public final jk2.p l(long j13, TimeUnit timeUnit, a0 a0Var) {
        ck2.i.b(timeUnit, "unit is null");
        ck2.i.b(a0Var, "scheduler is null");
        return new jk2.p(j13, this, a0Var, timeUnit);
    }

    public final jk2.r m(long j13, TimeUnit timeUnit, a0 a0Var) {
        ck2.i.b(timeUnit, "unit is null");
        ck2.i.b(a0Var, "scheduler is null");
        return new jk2.r(this, j13, timeUnit, a0Var);
    }

    public final jk2.c n() {
        ck2.d dVar = ck2.d.INSTANCE;
        ck2.i.b(dVar, "collectionSupplier is null");
        return new jk2.c(this, dVar);
    }

    public final jk2.v o() {
        return new jk2.v(this, ck2.i.f27921a, ck2.i.f27927g, 0);
    }

    public final jk2.a0 p(ak2.e eVar) {
        int i13 = 0;
        return new jk2.a0(this, new ck2.h(eVar, 1), new ck2.h(eVar, i13), new ck2.g(eVar, i13));
    }

    public final jk2.a0 q(ak2.e eVar) {
        return new jk2.a0(this, ck2.i.f27924d, eVar, ck2.i.f27923c);
    }

    public final jk2.g0 s() {
        return new jk2.g0(this, null);
    }

    public final q t(ak2.f fVar) {
        return u(fVar, false, Integer.MAX_VALUE, h.f122339a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q u(ak2.f fVar, boolean z13, int i13, int i14) {
        ck2.i.c(i13, "maxConcurrency");
        ck2.i.c(i14, "bufferSize");
        if (!(this instanceof dk2.g)) {
            return new k0(this, fVar, z13, i13, i14);
        }
        Object call = ((dk2.g) this).call();
        return call == null ? h0.f76488a : new ik2.b(3, call, fVar);
    }
}
