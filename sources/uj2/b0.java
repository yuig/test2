package uj2;

import gk2.d1;
import gk2.h0;
import gk2.i2;
import gk2.p2;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class b0<T> implements f0 {
    public static gk2.j f(b0 b0Var, b0 b0Var2, b0 b0Var3) {
        f0[] f0VarArr = {b0Var, b0Var2, b0Var3};
        int i13 = h.f122339a;
        h0 h0Var = new h0(f0VarArr, 1);
        ck2.i.c(2, "prefetch");
        return new gk2.j(h0Var, kk2.q.INSTANCE, pk2.e.IMMEDIATE);
    }

    public static kk2.k g(Throwable th3) {
        ck2.i.b(th3, "exception is null");
        return new kk2.k(new ck2.f(th3), 0);
    }

    public static hk2.o h(q qVar) {
        return new hk2.o(1, qVar, null);
    }

    public static kk2.b j(Object obj) {
        ck2.i.b(obj, "item is null");
        return new kk2.b(obj, 1);
    }

    public static hk2.o v(b0 b0Var, b0 b0Var2, ak2.c cVar) {
        return new hk2.o(4, new f0[]{b0Var, b0Var2}, new ck2.a(cVar, 0));
    }

    public final Object d() {
        ek2.e eVar = new ek2.e(1);
        p(eVar);
        return eVar.c();
    }

    public final b0 e(g0 g0Var) {
        f0 a13 = g0Var.a(this);
        ck2.i.b(a13, "source is null");
        return a13 instanceof b0 ? (b0) a13 : new kk2.c(a13, 1);
    }

    public final fk2.g i() {
        return new fk2.g(this, 4);
    }

    public final kk2.m k(ak2.f fVar) {
        ck2.i.b(fVar, "mapper is null");
        return new kk2.m(this, fVar, 1);
    }

    public final kk2.t l(a0 a0Var) {
        ck2.i.b(a0Var, "scheduler is null");
        return new kk2.t(this, a0Var, 0);
    }

    public final fk2.f0 m(Serializable serializable) {
        return new fk2.f0(this, null, serializable, 2);
    }

    public final p2 n() {
        return new p2(new i2(s()));
    }

    public final xj2.c o(ak2.e eVar, ak2.e eVar2) {
        ck2.i.b(eVar, "onSuccess is null");
        ck2.i.b(eVar2, "onError is null");
        kk2.l lVar = new kk2.l(2, eVar, eVar2);
        p(lVar);
        return lVar;
    }

    public final void p(d0 d0Var) {
        ck2.i.b(d0Var, "observer is null");
        try {
            q(d0Var);
        } catch (NullPointerException e13) {
            throw e13;
        } catch (Throwable th3) {
            throw n60.o.g(th3, "subscribeActual failed", th3);
        }
    }

    public abstract void q(d0 d0Var);

    public final kk2.t r(a0 a0Var) {
        ck2.i.b(a0Var, "scheduler is null");
        return new kk2.t(this, a0Var, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h s() {
        return this instanceof dk2.b ? ((dk2.b) this).c() : new fk2.d0(this, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l t() {
        return this instanceof hk2.u ? ((hk2.u) this).r() : new d1(this, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q u() {
        return this instanceof dk2.c ? ((dk2.c) this).a() : new ol1.d(this, 6);
    }
}
