package uj2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import gk2.b1;
import gk2.k1;
import gk2.k2;
import gk2.m0;
import gk2.r2;
import gk2.x0;
import lb.l0;

/* loaded from: classes2.dex */
public abstract class h implements xp2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f122339a = Math.max(1, Integer.getInteger("rx2.buffer-size", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN).intValue());

    public static b1 h(Object obj) {
        ck2.i.b(obj, "item is null");
        return new b1(obj);
    }

    @Override // xp2.a
    public final void b(xp2.b bVar) {
        if (bVar instanceof k) {
            l((k) bVar);
        } else {
            ck2.i.b(bVar, "s is null");
            l(new nk2.e(bVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h g(ak2.f fVar) {
        h m0Var;
        int i13 = f122339a;
        ck2.i.c(i13, "maxConcurrency");
        ck2.i.c(i13, "bufferSize");
        if (this instanceof dk2.g) {
            Object call = ((dk2.g) this).call();
            if (call == null) {
                return gk2.g0.f65416b;
            }
            m0Var = new k2(fVar, call);
        } else {
            m0Var = new m0(this, fVar, i13, i13);
        }
        return m0Var;
    }

    public final k1 i(a0 a0Var) {
        ck2.i.b(a0Var, "scheduler is null");
        int i13 = f122339a;
        ck2.i.c(i13, "bufferSize");
        return new k1(this, a0Var, i13);
    }

    public final xj2.c j(ak2.e eVar, ak2.e eVar2) {
        return k(eVar, eVar2, ck2.i.f27923c, x0.INSTANCE);
    }

    public final xj2.c k(ak2.e eVar, ak2.e eVar2, ak2.a aVar, ak2.e eVar3) {
        ck2.i.b(eVar, "onNext is null");
        ck2.i.b(eVar2, "onError is null");
        ck2.i.b(aVar, "onComplete is null");
        ck2.i.b(eVar3, "onSubscribe is null");
        nk2.d dVar = new nk2.d(eVar, eVar2, aVar, (x0) eVar3);
        l(dVar);
        return dVar;
    }

    public final void l(k kVar) {
        ck2.i.b(kVar, "s is null");
        try {
            m(kVar);
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

    public abstract void m(xp2.b bVar);

    public final r2 n(a0 a0Var) {
        ck2.i.b(a0Var, "scheduler is null");
        return new r2(this, a0Var, !(this instanceof gk2.r));
    }
}
