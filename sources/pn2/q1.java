package pn2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q1 {

    /* renamed from: b */
    public static final q1 f100833b = e(l1.f100816a);

    /* renamed from: a */
    public final l1 f100834a;

    public q1(l1 l1Var) {
        if (l1Var != null) {
            this.f100834a = l1Var;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0021 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pn2.q1.a(int):void");
    }

    public static w1 b(w1 w1Var, w1 w1Var2) {
        if (w1Var == null) {
            a(38);
            throw null;
        }
        if (w1Var2 == null) {
            a(39);
            throw null;
        }
        w1 w1Var3 = w1.INVARIANT;
        if (w1Var == w1Var3) {
            if (w1Var2 != null) {
                return w1Var2;
            }
            a(40);
            throw null;
        }
        if (w1Var2 == w1Var3) {
            if (w1Var != null) {
                return w1Var;
            }
            a(41);
            throw null;
        }
        if (w1Var == w1Var2) {
            if (w1Var2 != null) {
                return w1Var2;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + w1Var + "' and projection kind '" + w1Var2 + "' cannot be combined");
    }

    public static p1 c(w1 w1Var, w1 w1Var2) {
        w1 w1Var3 = w1.IN_VARIANCE;
        return (w1Var == w1Var3 && w1Var2 == w1.OUT_VARIANCE) ? p1.OUT_IN_IN_POSITION : (w1Var == w1.OUT_VARIANCE && w1Var2 == w1Var3) ? p1.IN_IN_OUT_POSITION : p1.NO_CONFLICT;
    }

    public static q1 d(b0 b0Var) {
        if (b0Var == null) {
            a(6);
            throw null;
        }
        return e(d1.f100781b.Z(b0Var.w0(), b0Var.u0()));
    }

    public static q1 e(l1 l1Var) {
        if (l1Var != null) {
            return new q1(l1Var);
        }
        a(0);
        throw null;
    }

    public static q1 f(l1 first, l1 second) {
        if (first == null) {
            a(3);
            throw null;
        }
        if (second == null) {
            a(4);
            throw null;
        }
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first.f()) {
            first = second;
        } else if (!second.f()) {
            first = new u(first, second);
        }
        return e(first);
    }

    public static bm2.i g(bm2.i iVar) {
        if (iVar != null) {
            return !iVar.Q(xl2.q.f135319y) ? iVar : new bm2.m(iVar, new m1());
        }
        a(33);
        throw null;
    }

    public static String k(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th3) {
            if (l3.c.F0(th3)) {
                throw th3;
            }
            return "[Exception while computing toString(): " + th3 + "]";
        }
    }

    public final l1 h() {
        l1 l1Var = this.f100834a;
        if (l1Var != null) {
            return l1Var;
        }
        a(8);
        throw null;
    }

    public final q1 i() {
        l1 l1Var = this.f100834a;
        return ((l1Var instanceof y) && l1Var.b()) ? new q1(new y(((y) l1Var).f100856b, ((y) l1Var).f100857c, false)) : this;
    }

    public final b0 j(b0 b0Var, w1 w1Var) {
        if (b0Var == null) {
            a(9);
            throw null;
        }
        if (w1Var == null) {
            a(10);
            throw null;
        }
        if (this.f100834a.f()) {
            if (b0Var != null) {
                return b0Var;
            }
            a(11);
            throw null;
        }
        try {
            b0 type = m(new i1(b0Var, w1Var), null, 0).getType();
            if (type != null) {
                return type;
            }
            a(12);
            throw null;
        } catch (o1 e13) {
            return rn2.m.d(rn2.l.UNABLE_TO_SUBSTITUTE_TYPE, e13.getMessage());
        }
    }

    public final b0 l(b0 b0Var, w1 w1Var) {
        if (b0Var == null) {
            a(14);
            throw null;
        }
        if (w1Var == null) {
            a(15);
            throw null;
        }
        g1 i1Var = new i1(h().g(b0Var, w1Var), w1Var);
        l1 l1Var = this.f100834a;
        if (!l1Var.f()) {
            try {
                i1Var = m(i1Var, null, 0);
            } catch (o1 unused) {
                i1Var = null;
            }
        }
        if (l1Var.a() || l1Var.b()) {
            boolean b13 = l1Var.b();
            if (i1Var != null) {
                if (!i1Var.b()) {
                    b0 type = i1Var.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    if (t1.d(type, un2.c.f122918i, null)) {
                        w1 c13 = i1Var.c();
                        Intrinsics.checkNotNullExpressionValue(c13, "getProjectionKind(...)");
                        if (c13 == w1.OUT_VARIANCE) {
                            i1Var = new i1((b0) dl2.b.r(type).f122916b, c13);
                        } else if (b13) {
                            i1Var = new i1((b0) dl2.b.r(type).f122915a, c13);
                        } else {
                            q1 e13 = e(new un2.d());
                            Intrinsics.checkNotNullExpressionValue(e13, "create(...)");
                            if (!e13.f100834a.f()) {
                                try {
                                    i1Var = e13.m(i1Var, null, 0);
                                } catch (o1 unused2) {
                                }
                            }
                        }
                    }
                }
            }
            i1Var = null;
        }
        if (i1Var == null) {
            return null;
        }
        return i1Var.getType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g1 m(g1 g1Var, am2.c1 c1Var, int i13) {
        q1 q1Var = this;
        int i14 = 0;
        r6 = null;
        p pVar = null;
        if (g1Var == null) {
            a(18);
            throw null;
        }
        l1 l1Var = q1Var.f100834a;
        if (i13 > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + k(g1Var) + "; substitution: " + k(l1Var));
        }
        if (g1Var.b()) {
            return g1Var;
        }
        b0 type = g1Var.getType();
        if (type instanceof u1) {
            u1 u1Var = (u1) type;
            v1 r03 = u1Var.r0();
            b0 X = u1Var.X();
            g1 m13 = q1Var.m(new i1(r03, g1Var.c()), c1Var, i13 + 1);
            return m13.b() ? m13 : new i1(com.bumptech.glide.c.w1(m13.getType().z0(), q1Var.l(X, g1Var.c())), m13.c());
        }
        Intrinsics.checkNotNullParameter(type, "<this>");
        type.z0();
        if (type.z0() instanceof g0) {
            return g1Var;
        }
        g1 e13 = l1Var.e(type);
        if (e13 == null) {
            e13 = null;
        } else if (type.getAnnotations().Q(xl2.q.f135319y)) {
            b1 w03 = e13.getType().w0();
            if (w03 instanceof qn2.l) {
                g1 a13 = ((qn2.l) w03).a();
                w1 c13 = a13.c();
                p1 c14 = c(g1Var.c(), c13);
                p1 p1Var = p1.OUT_IN_IN_POSITION;
                if (c14 == p1Var) {
                    e13 = new i1(a13.getType());
                } else if (c1Var != null && c(c1Var.r(), c13) == p1Var) {
                    e13 = new i1(a13.getType());
                }
            }
        }
        w1 c15 = g1Var.c();
        if (e13 == null && dl2.b.J1(type)) {
            Intrinsics.checkNotNullParameter(type, "<this>");
            v1 z03 = type.z0();
            p pVar2 = z03 instanceof p ? (p) z03 : null;
            if (pVar2 == null || !pVar2.o0()) {
                Intrinsics.checkNotNullParameter(type, "<this>");
                v vVar = (v) type.z0();
                h0 h0Var = vVar.f100850b;
                int i15 = i13 + 1;
                g1 m14 = q1Var.m(new i1(h0Var, c15), c1Var, i15);
                h0 h0Var2 = vVar.f100851c;
                g1 m15 = q1Var.m(new i1(h0Var2, c15), c1Var, i15);
                return (m14.getType() == h0Var && m15.getType() == h0Var2) ? g1Var : new i1(g.i(lb.l0.x(m14.getType()), lb.l0.x(m15.getType())), m14.c());
            }
        }
        if (xl2.l.G(type) || ao2.m0.U(type)) {
            return g1Var;
        }
        if (e13 != null) {
            p1 c16 = c(c15, e13.c());
            Intrinsics.checkNotNullParameter(type, "<this>");
            if (!(type.w0() instanceof cn2.b)) {
                int i16 = n1.f100823a[c16.ordinal()];
                if (i16 == 1) {
                    throw new o1();
                }
                if (i16 == 2) {
                    return new i1(type.w0().f().p(), w1.OUT_VARIANCE);
                }
            }
            Intrinsics.checkNotNullParameter(type, "<this>");
            v1 z04 = type.z0();
            p pVar3 = z04 instanceof p ? (p) z04 : null;
            if (pVar3 != null && pVar3.o0()) {
                pVar = pVar3;
            }
            if (e13.b()) {
                return e13;
            }
            b0 a03 = pVar != null ? pVar.a0(e13.getType()) : t1.l(e13.getType(), type.x0());
            if (!type.getAnnotations().isEmpty()) {
                a03 = kotlin.jvm.internal.j.E(a03, new bm2.j(new bm2.i[]{a03.getAnnotations(), g(l1Var.d(type.getAnnotations()))}));
            }
            if (c16 == p1.NO_CONFLICT) {
                c15 = b(c15, e13.c());
            }
            return new i1(a03, c15);
        }
        b0 type2 = g1Var.getType();
        w1 c17 = g1Var.c();
        if (type2.w0().b() instanceof am2.c1) {
            return g1Var;
        }
        Intrinsics.checkNotNullParameter(type2, "<this>");
        Intrinsics.checkNotNullParameter(type2, "<this>");
        v1 z05 = type2.z0();
        a aVar = z05 instanceof a ? (a) z05 : null;
        h0 h0Var3 = aVar != null ? aVar.f100759c : null;
        b0 l13 = h0Var3 != null ? i().l(h0Var3, w1.INVARIANT) : null;
        List parameters = type2.w0().getParameters();
        List newArguments = type2.u0();
        ArrayList arrayList = new ArrayList(parameters.size());
        boolean z13 = false;
        while (i14 < parameters.size()) {
            am2.c1 c1Var2 = (am2.c1) parameters.get(i14);
            g1 g1Var2 = (g1) newArguments.get(i14);
            g1 m16 = q1Var.m(g1Var2, c1Var2, i13 + 1);
            int i17 = n1.f100823a[c(c1Var2.r(), m16.c()).ordinal()];
            if (i17 == 1 || i17 == 2) {
                m16 = t1.n(c1Var2);
            } else if (i17 == 3) {
                w1 r13 = c1Var2.r();
                w1 w1Var = w1.INVARIANT;
                if (r13 != w1Var && !m16.b()) {
                    m16 = new i1(m16.getType(), w1Var);
                }
            }
            if (m16 != g1Var2) {
                z13 = true;
            }
            arrayList.add(m16);
            i14++;
            q1Var = this;
        }
        if (z13) {
            newArguments = arrayList;
        }
        bm2.i newAnnotations = l1Var.d(type2.getAnnotations());
        Intrinsics.checkNotNullParameter(type2, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        b0 Y0 = lb.l0.Y0(type2, newArguments, newAnnotations, 4);
        if ((Y0 instanceof h0) && (l13 instanceof h0)) {
            Y0 = lb.l0.D1((h0) Y0, (h0) l13);
        }
        return new i1(Y0, c17);
    }
}
