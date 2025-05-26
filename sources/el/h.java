package el;

import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class h extends nm.i0 {
    private h() {
    }

    public static nm.s g(um.a aVar, um.b bVar) {
        int i13 = g.f59488a[bVar.ordinal()];
        if (i13 == 3) {
            String Y0 = aVar.Y0();
            if (j.a(Y0)) {
                return new nm.v(Y0);
            }
            throw new IOException("illegal characters in string");
        }
        if (i13 == 4) {
            return new nm.v(new i(aVar.Y0()));
        }
        if (i13 == 5) {
            return new nm.v(Boolean.valueOf(aVar.R0()));
        }
        if (i13 == 6) {
            aVar.B1();
            return nm.t.f91365a;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    public static nm.s h(um.a aVar, um.b bVar) {
        int i13 = g.f59488a[bVar.ordinal()];
        if (i13 == 1) {
            aVar.a();
            return new nm.q();
        }
        if (i13 != 2) {
            return null;
        }
        aVar.c();
        return new nm.u();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        throw new UnsupportedOperationException("write is not supported");
    }

    @Override // nm.i0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final nm.s c(um.a aVar) {
        String str;
        um.b K = aVar.K();
        nm.s h10 = h(aVar, K);
        if (h10 == null) {
            return g(aVar, K);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.hasNext()) {
                if (h10 instanceof nm.u) {
                    str = aVar.k0();
                    if (!j.a(str)) {
                        throw new IOException("illegal characters in string");
                    }
                } else {
                    str = null;
                }
                um.b K2 = aVar.K();
                nm.s h13 = h(aVar, K2);
                boolean z13 = h13 != null;
                if (h13 == null) {
                    h13 = g(aVar, K2);
                }
                if (h10 instanceof nm.q) {
                    ((nm.q) h10).t(h13);
                } else {
                    nm.u uVar = (nm.u) h10;
                    if (uVar.f91366a.containsKey(str)) {
                        throw new IOException(a.a.j("duplicate key: ", str));
                    }
                    uVar.r(str, h13);
                }
                if (z13) {
                    arrayDeque.addLast(h10);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    h10 = h13;
                } else {
                    continue;
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

    public /* synthetic */ h(int i13) {
        this();
    }
}
