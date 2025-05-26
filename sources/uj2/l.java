package uj2;

/* loaded from: classes2.dex */
public abstract class l<T> implements n {
    public static hk2.v d(Object obj) {
        ck2.i.b(obj, "item is null");
        return new hk2.v(obj);
    }

    public final l b(b22.f fVar) {
        n c13 = fVar.c(this);
        if (c13 instanceof l) {
            return (l) c13;
        }
        ck2.i.b(c13, "onSubscribe is null");
        return new hk2.t(c13, 1);
    }

    public final hk2.k e(a0 a0Var) {
        ck2.i.b(a0Var, "scheduler is null");
        return new hk2.k(this, a0Var, 2);
    }

    public final void f(m mVar) {
        ck2.i.b(mVar, "observer is null");
        try {
            g(mVar);
        } catch (NullPointerException e13) {
            throw e13;
        } catch (Throwable th3) {
            throw n60.o.g(th3, "subscribeActual failed", th3);
        }
    }

    public abstract void g(m mVar);

    public final hk2.h h(a0 a0Var) {
        ck2.i.b(a0Var, "scheduler is null");
        return new hk2.h(this, a0Var, 2);
    }

    public final hk2.k i(l lVar) {
        return new hk2.k(this, lVar, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q j() {
        return this instanceof dk2.c ? ((dk2.c) this).a() : new ol1.d(this, 1);
    }

    public final b0 k() {
        return new hk2.b0(this, null, 1);
    }
}
