package qm;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class z0 extends nm.i0 {
    public static nm.s g(um.a aVar, um.b bVar) {
        int i13 = f1.f104161a[bVar.ordinal()];
        if (i13 == 1) {
            return new nm.v(new pm.j(aVar.Y0()));
        }
        if (i13 == 2) {
            return new nm.v(aVar.Y0());
        }
        if (i13 == 3) {
            return new nm.v(Boolean.valueOf(aVar.R0()));
        }
        if (i13 == 6) {
            aVar.B1();
            return nm.t.f91365a;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    public static nm.s h(um.a aVar, um.b bVar) {
        int i13 = f1.f104161a[bVar.ordinal()];
        if (i13 == 4) {
            aVar.a();
            return new nm.q();
        }
        if (i13 != 5) {
            return null;
        }
        aVar.c();
        return new nm.u();
    }

    @Override // nm.i0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final nm.s c(um.a aVar) {
        if (aVar instanceof m) {
            m mVar = (m) aVar;
            um.b K = mVar.K();
            if (K != um.b.NAME && K != um.b.END_ARRAY && K != um.b.END_OBJECT && K != um.b.END_DOCUMENT) {
                nm.s sVar = (nm.s) mVar.m0();
                mVar.E();
                return sVar;
            }
            throw new IllegalStateException("Unexpected " + K + " when reading a JsonElement.");
        }
        um.b K2 = aVar.K();
        nm.s h10 = h(aVar, K2);
        if (h10 == null) {
            return g(aVar, K2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.hasNext()) {
                String k03 = h10 instanceof nm.u ? aVar.k0() : null;
                um.b K3 = aVar.K();
                nm.s h13 = h(aVar, K3);
                boolean z13 = h13 != null;
                if (h13 == null) {
                    h13 = g(aVar, K3);
                }
                if (h10 instanceof nm.q) {
                    ((nm.q) h10).t(h13);
                } else {
                    ((nm.u) h10).r(k03, h13);
                }
                if (z13) {
                    arrayDeque.addLast(h10);
                    h10 = h13;
                }
            } else {
                if (h10 instanceof nm.q) {
                    aVar.f();
                } else {
                    aVar.g();
                }
                if (arrayDeque.isEmpty()) {
                    return h10;
                }
                h10 = (nm.s) arrayDeque.removeLast();
            }
        }
    }

    @Override // nm.i0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void e(nm.s sVar, um.c cVar) {
        if (sVar == null || (sVar instanceof nm.t)) {
            cVar.m();
            return;
        }
        if (sVar instanceof nm.v) {
            nm.v j13 = sVar.j();
            Serializable serializable = j13.f91367a;
            if (serializable instanceof Number) {
                cVar.L(j13.n());
                return;
            } else if (serializable instanceof Boolean) {
                cVar.O(j13.b());
                return;
            } else {
                cVar.M(j13.p());
                return;
            }
        }
        if (sVar instanceof nm.q) {
            cVar.c();
            Iterator it = sVar.f().f91364a.iterator();
            while (it.hasNext()) {
                e((nm.s) it.next(), cVar);
            }
            cVar.f();
            return;
        }
        if (!(sVar instanceof nm.u)) {
            throw new IllegalArgumentException("Couldn't write " + sVar.getClass());
        }
        cVar.d();
        Iterator it2 = ((pm.l) sVar.i().f91366a.entrySet()).iterator();
        while (((pm.m) it2).hasNext()) {
            Map.Entry entry = (Map.Entry) ((pm.k) it2).next();
            cVar.h((String) entry.getKey());
            e((nm.s) entry.getValue(), cVar);
        }
        cVar.g();
    }
}
