package k2;

import g1.c0;
import g1.g0;
import g1.k0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f78194a = k0.d();

    public final void a(Object obj, Object obj2) {
        c0 c0Var = this.f78194a;
        int f13 = c0Var.f(obj);
        boolean z13 = f13 < 0;
        Object obj3 = z13 ? null : c0Var.f63240c[f13];
        if (obj3 != null) {
            if (obj3 instanceof g0) {
                ((g0) obj3).d(obj2);
            } else if (obj3 != obj2) {
                g0 g0Var = new g0();
                g0Var.d(obj3);
                g0Var.d(obj2);
                obj2 = g0Var;
            }
            obj2 = obj3;
        }
        if (!z13) {
            c0Var.f63240c[f13] = obj2;
            return;
        }
        int i13 = ~f13;
        c0Var.f63239b[i13] = obj;
        c0Var.f63240c[i13] = obj2;
    }

    public final boolean b(Object obj, Object obj2) {
        c0 c0Var = this.f78194a;
        Object g13 = c0Var.g(obj);
        if (g13 == null) {
            return false;
        }
        if (!(g13 instanceof g0)) {
            if (!Intrinsics.d(g13, obj2)) {
                return false;
            }
            c0Var.j(obj);
            return true;
        }
        g0 g0Var = (g0) g13;
        boolean l13 = g0Var.l(obj2);
        if (l13 && g0Var.b()) {
            c0Var.j(obj);
        }
        return l13;
    }

    public final void c(Object obj) {
        c0 c0Var = this.f78194a;
        long[] jArr = c0Var.f63238a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        int i16 = (i13 << 3) + i15;
                        Object obj2 = c0Var.f63239b[i16];
                        Object obj3 = c0Var.f63240c[i16];
                        if (obj3 instanceof g0) {
                            Intrinsics.g(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            g0 g0Var = (g0) obj3;
                            g0Var.l(obj);
                            if (!g0Var.b()) {
                            }
                            c0Var.k(i16);
                        } else {
                            if (obj3 != obj) {
                            }
                            c0Var.k(i16);
                        }
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }
}
