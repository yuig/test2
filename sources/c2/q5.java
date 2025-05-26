package c2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract class q5 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f25107a = bs1.c.a(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final float f25108b = 16;

    /* renamed from: c, reason: collision with root package name */
    public static final float f25109c = 12;

    /* renamed from: d, reason: collision with root package name */
    public static final u2.q f25110d;

    static {
        float f13 = 48;
        f25110d = androidx.compose.foundation.layout.e.a(u2.n.f120041b, f13, f13);
    }

    public static final void a(y5 y5Var, String str, Function2 function2, h4.p0 p0Var, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z13, boolean z14, boolean z15, o1.k kVar, p1.x0 x0Var, b3.x0 x0Var2, m1 m1Var, Function2 function26, i2.o oVar, int i13, int i14) {
        int i15;
        int i16;
        boolean z16;
        boolean z17;
        i2.s sVar;
        i2.s sVar2 = (i2.s) oVar;
        sVar2.Y(341783750);
        if ((i13 & 6) == 0) {
            i15 = (sVar2.h(y5Var) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= sVar2.h(str) ? 32 : 16;
        }
        int i17 = i13 & 384;
        int i18 = RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i17 == 0) {
            i15 |= sVar2.j(function2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= sVar2.h(p0Var) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= sVar2.j(function22) ? 16384 : 8192;
        }
        if ((i13 & 196608) == 0) {
            i15 |= sVar2.j(function23) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= sVar2.j(function24) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= sVar2.j(function25) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= sVar2.i(z13) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= sVar2.i(z14) ? 536870912 : 268435456;
        }
        if ((i14 & 6) == 0) {
            i16 = i14 | (sVar2.i(z15) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= sVar2.h(kVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            if (sVar2.h(x0Var)) {
                i18 = 256;
            }
            i16 |= i18;
        }
        if ((i14 & 3072) == 0) {
            i16 |= sVar2.h(x0Var2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= sVar2.h(m1Var) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= sVar2.j(function26) ? 131072 : 65536;
        }
        if ((i15 & 306783379) == 306783378 && (i16 & 74899) == 74898 && sVar2.z()) {
            sVar2.Q();
            sVar = sVar2;
        } else {
            boolean z18 = ((i15 & 7168) == 2048) | ((i15 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 32);
            Object J2 = sVar2.J();
            if (z18 || J2 == i2.n.f71185a) {
                b4.g gVar = new b4.g(str, null, 6);
                ((a.e) p0Var).getClass();
                J2 = new h4.n0(gVar, h4.x.f67612a);
                sVar2.g0(J2);
            }
            String str2 = ((h4.n0) J2).f67595a.f21571a;
            v2 v2Var = ((Boolean) kotlin.jvm.internal.r.o(kVar, sVar2, (i16 >> 3) & 14).getValue()).booleanValue() ? v2.Focused : str2.length() == 0 ? v2.UnfocusedEmpty : v2.UnfocusedNotEmpty;
            o5 o5Var = new o5(m1Var, z14, z15, kVar);
            i2.w3 w3Var = f6.f24738b;
            e6 e6Var = (e6) sVar2.m(w3Var);
            b4.q0 q0Var = e6Var.f24708g;
            long b13 = q0Var.b();
            long j13 = b3.w.f21390n;
            boolean c13 = b3.w.c(b13, j13);
            b4.q0 q0Var2 = e6Var.f24713l;
            boolean z19 = (c13 && !b3.w.c(q0Var2.b(), j13)) || (!b3.w.c(q0Var.b(), j13) && b3.w.c(q0Var2.b(), j13));
            x5 x5Var = x5.f25384a;
            sVar2.W(1578865765);
            long b14 = ((e6) sVar2.m(w3Var)).f24713l.b();
            if (z19) {
                sVar2.W(-1572851052);
                if (b14 != 16) {
                    z16 = false;
                } else {
                    z16 = false;
                    b14 = ((b3.w) o5Var.invoke(v2Var, sVar2, 0)).f21392a;
                }
            } else {
                z16 = false;
                sVar2.W(780548205);
            }
            sVar2.r(z16);
            long j14 = b14;
            sVar2.r(z16);
            sVar2.W(1578871879);
            long b15 = ((e6) sVar2.m(w3Var)).f24708g.b();
            if (z19) {
                sVar2.W(-1572659596);
                if (b15 != 16) {
                    z17 = false;
                } else {
                    z17 = false;
                    b15 = ((b3.w) o5Var.invoke(v2Var, sVar2, 0)).f21392a;
                }
            } else {
                z17 = false;
                sVar2.W(780554381);
            }
            sVar2.r(z17);
            long j15 = b15;
            sVar2.r(z17);
            if (function22 != null) {
                z17 = true;
            }
            sVar = sVar2;
            x5Var.a(v2Var, j14, j15, o5Var, z17, q2.i.c(225557475, new m5(function22, function23, str2, m1Var, z14, z15, kVar, function24, function25, x0Var2, y5Var, function2, z13, x0Var, z19, function26), sVar), sVar, 1769472);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new n5(y5Var, str, function2, p0Var, function22, function23, function24, function25, z13, z14, z15, kVar, x0Var, x0Var2, m1Var, function26, i13, i14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(long r15, b4.q0 r17, java.lang.Float r18, kotlin.jvm.functions.Function2 r19, i2.o r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.q5.b(long, b4.q0, java.lang.Float, kotlin.jvm.functions.Function2, i2.o, int, int):void");
    }

    public static final Object c(q3.r rVar) {
        Object a13 = rVar.a();
        q3.z zVar = a13 instanceof q3.z ? (q3.z) a13 : null;
        if (zVar != null) {
            return ((q3.y) zVar).f102275n;
        }
        return null;
    }

    public static final int d(q3.c1 c1Var) {
        if (c1Var != null) {
            return c1Var.f102179b;
        }
        return 0;
    }

    public static final int e(q3.c1 c1Var) {
        if (c1Var != null) {
            return c1Var.f102178a;
        }
        return 0;
    }
}
