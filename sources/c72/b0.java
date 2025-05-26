package c72;

import android.util.Log;
import com.pinterest.api.model.dj0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hi0;
import com.pinterest.api.model.pi0;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.vi0;
import com.pinterest.api.model.zi0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import r72.a2;
import r72.c1;
import r72.g2;
import r72.h2;
import r72.i1;
import r72.i2;
import r72.k0;
import r72.k2;
import r72.l1;
import r72.l2;
import r72.n1;
import r72.u1;
import r72.w1;
import r72.x0;
import r72.y0;
import r72.y1;
import r72.z1;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final dv0.q f26892a;

    public b0(dv0.q dataBridge) {
        Intrinsics.checkNotNullParameter(dataBridge, "dataBridge");
        this.f26892a = dataBridge;
    }

    public static k0 a(s sVar, k0 k0Var) {
        r72.n nVar;
        return (sVar == null || (nVar = sVar.f26925d) == null) ? k0Var : k0.a(k0Var, false, false, false, false, 0.0f, null, null, nVar, null, 0.0d, 0.0d, null, 16255);
    }

    public static l1 b(s sVar, pi0 pi0Var) {
        if (sVar != null && sVar.f26922a) {
            return l1.f106534c;
        }
        List B = pi0Var.B();
        if (B == null || B.size() != 2) {
            List B2 = pi0Var.B();
            throw new IllegalArgumentException(("offset must contain 2 items, actual: offset.size=" + (B2 != null ? Integer.valueOf(B2.size()) : null)).toString());
        }
        List B3 = pi0Var.B();
        Object obj = B3 != null ? B3.get(0) : null;
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Double");
        double doubleValue = ((Double) obj).doubleValue();
        List B4 = pi0Var.B();
        Object obj2 = B4 != null ? B4.get(1) : null;
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Double");
        return new l1(doubleValue, ((Double) obj2).doubleValue());
    }

    public static double c(s sVar, pi0 pi0Var) {
        if (sVar == null || !sVar.f26923b) {
            return pi0Var.D().doubleValue();
        }
        return 0.0d;
    }

    public static double d(s sVar, pi0 pi0Var) {
        if (sVar != null) {
            return sVar.f26924c;
        }
        Double E = pi0Var.E();
        Intrinsics.checkNotNullExpressionValue(E, "getScale(...)");
        return E.doubleValue();
    }

    public static x0 e(Map map) {
        if (map == null) {
            return x0.f106703e;
        }
        sr srVar = (sr) map.get("736x");
        y0 f13 = srVar != null ? f(srVar, 736) : null;
        sr srVar2 = (sr) map.get("365x");
        y0 f14 = srVar2 != null ? f(srVar2, 365) : null;
        sr srVar3 = (sr) map.get("70x");
        y0 f15 = srVar3 != null ? f(srVar3, 70) : null;
        sr srVar4 = (sr) map.get("originals");
        return new x0(f13, f14, f15, srVar4 != null ? f(srVar4, (int) srVar4.k().doubleValue()) : null);
    }

    public static y0 f(sr srVar, int i13) {
        String j13 = srVar.j();
        Intrinsics.f(j13);
        return new y0(j13, (int) srVar.k().doubleValue(), (int) srVar.h().doubleValue(), i13);
    }

    public static ArrayList h(b0 b0Var, List from, s sVar, boolean z13, int i13) {
        Object m13;
        if ((i13 & 2) != 0) {
            sVar = null;
        }
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(from, "from");
        ArrayList arrayList = new ArrayList();
        Iterator it = from.iterator();
        while (it.hasNext()) {
            pi0 pi0Var = (pi0) it.next();
            try {
                xk2.q qVar = xk2.s.f135225b;
                m13 = b0Var.g(pi0Var, sVar, z13);
            } catch (Throwable th3) {
                xk2.q qVar2 = xk2.s.f135225b;
                m13 = ue.c.m(th3);
            }
            if (xk2.s.a(m13) != null) {
                Log.w("ShufflesEntityMapper", "mapShuffle(): failed to map item.id=" + pi0Var.getUid());
            }
            if (m13 instanceof xk2.r) {
                m13 = null;
            }
            z1 z1Var = (z1) m13;
            if (z1Var != null) {
                arrayList.add(z1Var);
            }
        }
        return arrayList;
    }

    public static bn0.a i(zi0 zi0Var) {
        List list;
        if (zi0Var == null) {
            return null;
        }
        String value = zi0Var.getUid();
        Intrinsics.checkNotNullExpressionValue(value, "getUid(...)");
        int i13 = h2.f106495a;
        Intrinsics.checkNotNullParameter(value, "value");
        List g13 = zi0Var.g();
        if (g13 == null || (list = CollectionsKt.F0(g13)) == null) {
            list = q0.f80391a;
        }
        return new bn0.a(value, list, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3, types: [r72.i2] */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r5v4, types: [r72.i2[]] */
    /* JADX WARN: Type inference failed for: r9v3, types: [n72.h] */
    public final z1 g(pi0 pi0Var, s sVar, boolean z13) {
        String value;
        String str;
        String value2;
        k2 k2Var;
        pi0.a z14 = pi0Var.z();
        int i13 = z14 == null ? -1 : a0.f26889a[z14.ordinal()];
        String str2 = null;
        String value3 = "none";
        dv0.q qVar = this.f26892a;
        if (i13 == 1) {
            if (pi0Var.y() == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Pair i14 = qVar.i(pi0Var.x(), z13);
            String value4 = pi0Var.getUid();
            Intrinsics.checkNotNullExpressionValue(value4, "getUid(...)");
            int i15 = a2.f106437b;
            Intrinsics.checkNotNullParameter(value4, "value");
            l1 b13 = b(sVar, pi0Var);
            double d2 = d(sVar, pi0Var);
            double c13 = c(sVar, pi0Var);
            k0 a13 = a(sVar, (k0) i14.f80346a);
            x0 e13 = e(pi0Var.y());
            String value5 = pi0Var.A();
            r72.a aVar = (r72.a) i14.f80347b;
            if (value5 != null) {
                int i16 = g2.f106487b;
                Intrinsics.checkNotNullParameter(value5, "value");
                str2 = value5;
            }
            i1 i1Var = new i1(str2, aVar);
            vi0 G = pi0Var.G();
            if (G == null || (value = G.getUid()) == null) {
                int i17 = c1.f106451a;
                value = "-1";
            } else {
                int i18 = c1.f106451a;
                Intrinsics.checkNotNullParameter(value, "value");
            }
            String str3 = value;
            w1 w1Var = w1.UNKNOWN;
            hi0 F = pi0Var.F();
            if (F != null) {
                value3 = F.getUid();
                Intrinsics.checkNotNullExpressionValue(value3, "getUid(...)");
                int i19 = n1.f106581a;
                Intrinsics.checkNotNullParameter(value3, "value");
            } else {
                int i23 = n1.f106581a;
            }
            return new u1(value4, b13, d2, c13, a13, e13, i1Var, null, str3, w1Var, null, null, false, value3, null, i(pi0Var.H()), 114688);
        }
        if (i13 == 2) {
            if (pi0Var.y() == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Pair i24 = qVar.i(pi0Var.x(), z13);
            String value6 = pi0Var.getUid();
            Intrinsics.checkNotNullExpressionValue(value6, "getUid(...)");
            int i25 = a2.f106437b;
            Intrinsics.checkNotNullParameter(value6, "value");
            l1 b14 = b(sVar, pi0Var);
            double d13 = d(sVar, pi0Var);
            double c14 = c(sVar, pi0Var);
            k0 a14 = a(sVar, (k0) i24.f80346a);
            x0 e14 = e(pi0Var.y());
            String value7 = pi0Var.A();
            r72.a aVar2 = (r72.a) i24.f80347b;
            if (value7 != null) {
                int i26 = g2.f106487b;
                Intrinsics.checkNotNullParameter(value7, "value");
            } else {
                value7 = null;
            }
            i1 i1Var2 = new i1(value7, aVar2);
            f30 C = pi0Var.C();
            if (C == null || (value2 = C.getUid()) == null) {
                str = null;
            } else {
                Intrinsics.checkNotNullParameter(value2, "value");
                str = value2;
            }
            int i27 = c1.f106451a;
            w1 w1Var2 = w1.UNKNOWN;
            hi0 F2 = pi0Var.F();
            if (F2 != null) {
                value3 = F2.getUid();
                Intrinsics.checkNotNullExpressionValue(value3, "getUid(...)");
                int i28 = n1.f106581a;
                Intrinsics.checkNotNullParameter(value3, "value");
            } else {
                int i29 = n1.f106581a;
            }
            return new u1(value6, b14, d13, c14, a14, e14, i1Var2, str, "-1", w1Var2, null, null, false, value3, null, i(pi0Var.H()), 114688);
        }
        if (i13 != 3) {
            throw new IllegalStateException(("Unsupported item type " + pi0Var.z()).toString());
        }
        if (pi0Var.I() == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        k0 j13 = qVar.j(pi0Var.x(), z13);
        String value8 = pi0Var.getUid();
        Intrinsics.checkNotNullExpressionValue(value8, "getUid(...)");
        int i33 = a2.f106437b;
        Intrinsics.checkNotNullParameter(value8, "value");
        l1 b15 = b(sVar, pi0Var);
        double d14 = d(sVar, pi0Var);
        double c15 = c(sVar, pi0Var);
        k0 a15 = a(sVar, j13);
        dj0 I = pi0Var.I();
        Intrinsics.f(I);
        String l13 = I.l();
        Intrinsics.f(l13);
        String i34 = I.i();
        Intrinsics.f(i34);
        String h10 = I.h();
        float doubleValue = (float) I.j().doubleValue();
        Integer valueOf = Integer.valueOf((int) I.k().doubleValue());
        int i35 = 0;
        k2 k2Var2 = k2.values()[0];
        k2[] values = k2.values();
        int length = values.length;
        int i36 = 0;
        while (true) {
            if (i36 >= length) {
                k2Var = null;
                break;
            }
            k2Var = values[i36];
            if (Intrinsics.d(k2Var.getValue(), valueOf)) {
                break;
            }
            i36++;
        }
        k2 k2Var3 = k2Var == null ? k2Var2 : k2Var;
        Integer valueOf2 = Integer.valueOf((int) I.g().doubleValue());
        i2 i2Var = i2.values()[0];
        ?? values2 = i2.values();
        int length2 = values2.length;
        while (true) {
            if (i35 >= length2) {
                break;
            }
            ?? r93 = values2[i35];
            if (Intrinsics.d(r93.getValue(), valueOf2)) {
                str2 = r93;
                break;
            }
            i35++;
        }
        return new y1(value8, b15, d14, c15, a15, new l2(l13, i34, h10, doubleValue, k2Var3, str2 == null ? i2Var : str2, false));
    }
}
