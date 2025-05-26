package qm;

import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class u extends nm.i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final d f104220c = new d(nm.g0.DOUBLE, 2);

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f104221a;

    /* renamed from: b, reason: collision with root package name */
    public final nm.h0 f104222b;

    public u(nm.o oVar, nm.h0 h0Var) {
        this.f104221a = oVar;
        this.f104222b = h0Var;
    }

    public static Serializable g(um.a aVar, um.b bVar) {
        int i13 = t.f104219a[bVar.ordinal()];
        if (i13 == 1) {
            aVar.a();
            return new ArrayList();
        }
        if (i13 != 2) {
            return null;
        }
        aVar.c();
        return new pm.o(true);
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        um.b K = aVar.K();
        Object g13 = g(aVar, K);
        if (g13 == null) {
            return f(aVar, K);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.hasNext()) {
                String k03 = g13 instanceof Map ? aVar.k0() : null;
                um.b K2 = aVar.K();
                Serializable g14 = g(aVar, K2);
                boolean z13 = g14 != null;
                if (g14 == null) {
                    g14 = f(aVar, K2);
                }
                if (g13 instanceof List) {
                    ((List) g13).add(g14);
                } else {
                    ((Map) g13).put(k03, g14);
                }
                if (z13) {
                    arrayDeque.addLast(g13);
                    g13 = g14;
                }
            } else {
                if (g13 instanceof List) {
                    aVar.f();
                } else {
                    aVar.g();
                }
                if (arrayDeque.isEmpty()) {
                    return g13;
                }
                g13 = arrayDeque.removeLast();
            }
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        if (obj == null) {
            cVar.m();
            return;
        }
        Class<?> cls = obj.getClass();
        nm.o oVar = this.f104221a;
        oVar.getClass();
        nm.i0 g13 = oVar.g(new TypeToken(cls));
        if (!(g13 instanceof u)) {
            g13.e(cVar, obj);
        } else {
            cVar.d();
            cVar.g();
        }
    }

    public final Serializable f(um.a aVar, um.b bVar) {
        int i13 = t.f104219a[bVar.ordinal()];
        if (i13 == 3) {
            return aVar.Y0();
        }
        if (i13 == 4) {
            return this.f104222b.readNumber(aVar);
        }
        if (i13 == 5) {
            return Boolean.valueOf(aVar.R0());
        }
        if (i13 == 6) {
            aVar.B1();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }
}
