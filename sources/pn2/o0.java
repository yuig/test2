package pn2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o0 {
    static {
        new o0();
    }

    public o0() {
        q0 reportStrategy = q0.f100832a;
        Intrinsics.checkNotNullParameter(reportStrategy, "reportStrategy");
    }

    public final void a(bm2.i iVar, bm2.i iVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = iVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((bm2.c) it.next()).c());
        }
        Iterator it2 = iVar2.iterator();
        while (it2.hasNext()) {
            bm2.c annotation = (bm2.c) it2.next();
            if (hashSet.contains(annotation.c())) {
                Intrinsics.checkNotNullParameter(annotation, "annotation");
            }
        }
    }

    public final h0 b(p0 typeAliasExpansion, u0 attributes) {
        Intrinsics.checkNotNullParameter(typeAliasExpansion, "typeAliasExpansion");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return c(typeAliasExpansion, attributes, false, 0, true);
    }

    public final h0 c(p0 p0Var, u0 u0Var, boolean z13, int i13, boolean z14) {
        u0 a13;
        m mVar;
        m mVar2;
        w1 w1Var = w1.INVARIANT;
        am2.b1 b1Var = p0Var.f100828b;
        g1 d2 = d(new i1(((nn2.u) b1Var).v0(), w1Var), p0Var, null, i13);
        b0 type = d2.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        h0 x13 = lb.l0.x(type);
        if (ao2.m0.U(x13)) {
            return x13;
        }
        d2.c();
        a(x13.getAnnotations(), n.a(u0Var));
        if (!ao2.m0.U(x13)) {
            if (ao2.m0.U(x13)) {
                a13 = x13.v0();
            } else {
                u0 other = x13.v0();
                Intrinsics.checkNotNullParameter(other, "other");
                if (u0Var.isEmpty() && other.isEmpty()) {
                    a13 = u0Var;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection values = u0.f100848b.f100840a.values();
                    Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        r0 r0Var = (r0) u0Var.f126314a.get(intValue);
                        r0 r0Var2 = (r0) other.f126314a.get(intValue);
                        if (r0Var == null) {
                            if (r0Var2 != null) {
                                mVar2 = (m) r0Var2;
                                m mVar3 = (m) r0Var;
                                if (mVar3 != null) {
                                    mVar = new m(dl2.b.L(mVar2.f100817a, mVar3.f100817a));
                                    mVar2 = mVar;
                                }
                            } else {
                                mVar2 = null;
                            }
                            wn2.k.b(mVar2, arrayList);
                        } else {
                            m mVar4 = (m) r0Var;
                            m mVar5 = (m) r0Var2;
                            if (mVar5 == null) {
                                mVar2 = mVar4;
                                wn2.k.b(mVar2, arrayList);
                            } else {
                                mVar = new m(dl2.b.L(mVar4.f100817a, mVar5.f100817a));
                                mVar2 = mVar;
                                wn2.k.b(mVar2, arrayList);
                            }
                        }
                    }
                    a13 = t0.a(arrayList);
                }
            }
            x13 = lb.l0.Z0(x13, null, a13, 1);
        }
        h0 m13 = t1.m(x13, z13);
        Intrinsics.checkNotNullExpressionValue(m13, "let(...)");
        if (!z14) {
            return m13;
        }
        dm2.f fVar = ((dm2.g) b1Var).f55421h;
        Intrinsics.checkNotNullExpressionValue(fVar, "getTypeConstructor(...)");
        return lb.l0.D1(m13, g.r(p0Var.f100829c, in2.m.f72874b, u0Var, fVar, z13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g1 d(g1 g1Var, p0 p0Var, am2.c1 c1Var, int i13) {
        w1 w1Var;
        m mVar;
        m mVar2;
        w1 w1Var2;
        w1 w1Var3;
        g1 i1Var;
        Object typeAlias = p0Var.f100828b;
        if (i13 > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + ((dm2.o) typeAlias).getName());
        }
        if (g1Var.b()) {
            Intrinsics.f(c1Var);
            m0 n13 = t1.n(c1Var);
            Intrinsics.checkNotNullExpressionValue(n13, "makeStarProjection(...)");
            return n13;
        }
        b0 type = g1Var.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        b1 constructor = type.w0();
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        am2.j b13 = constructor.b();
        g1 g1Var2 = b13 instanceof am2.c1 ? (g1) p0Var.f100830d.get(b13) : null;
        if (g1Var2 == null) {
            v1 z03 = g1Var.getType().z0();
            Intrinsics.checkNotNullParameter(z03, "<this>");
            h0 x13 = lb.l0.x(z03);
            if (!ao2.m0.U(x13)) {
                Intrinsics.checkNotNullParameter(x13, "<this>");
                tn2.b predicate = tn2.b.f118627i;
                Intrinsics.checkNotNullParameter(x13, "<this>");
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                if (t1.d(x13, predicate, null)) {
                    b1 w03 = x13.w0();
                    am2.j b14 = w03.b();
                    w03.getParameters().size();
                    x13.u0().size();
                    if (b14 instanceof am2.c1) {
                        i1Var = g1Var;
                    } else {
                        int i14 = 0;
                        if (b14 instanceof am2.b1) {
                            am2.b1 typeAlias2 = (am2.b1) b14;
                            if (p0Var.a(typeAlias2)) {
                                Intrinsics.checkNotNullParameter(typeAlias2, "typeAlias");
                                w1 w1Var4 = w1.INVARIANT;
                                rn2.l lVar = rn2.l.RECURSIVE_TYPE_ALIAS;
                                String str = ((dm2.o) typeAlias2).getName().f139478a;
                                Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
                                return new i1(rn2.m.d(lVar, str), w1Var4);
                            }
                            List u03 = x13.u0();
                            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(u03, 10));
                            for (Object obj : u03) {
                                int i15 = i14 + 1;
                                if (i14 < 0) {
                                    kotlin.collections.f0.p();
                                    throw null;
                                }
                                arrayList.add(d((g1) obj, p0Var, (am2.c1) w03.getParameters().get(i14), i13 + 1));
                                i14 = i15;
                            }
                            h0 c13 = c(rm2.i0.e(p0Var, typeAlias2, arrayList), x13.v0(), x13.x0(), i13 + 1, false);
                            h0 e13 = e(x13, p0Var, i13);
                            Intrinsics.checkNotNullParameter(c13, "<this>");
                            c13.z0();
                            i1Var = new i1(lb.l0.D1(c13, e13), g1Var.c());
                        } else {
                            h0 e14 = e(x13, p0Var, i13);
                            Intrinsics.checkNotNullExpressionValue(q1.d(e14), "create(...)");
                            for (Object obj2 : e14.u0()) {
                                int i16 = i14 + 1;
                                if (i14 < 0) {
                                    kotlin.collections.f0.p();
                                    throw null;
                                }
                                g1 g1Var3 = (g1) obj2;
                                if (!g1Var3.b()) {
                                    b0 type2 = g1Var3.getType();
                                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                                    Intrinsics.checkNotNullParameter(type2, "<this>");
                                    tn2.a predicate2 = tn2.a.f118626i;
                                    Intrinsics.checkNotNullParameter(type2, "<this>");
                                    Intrinsics.checkNotNullParameter(predicate2, "predicate");
                                    if (!t1.d(type2, predicate2, null)) {
                                    }
                                }
                                i14 = i16;
                            }
                            i1Var = new i1(e14, g1Var.c());
                        }
                    }
                    return i1Var;
                }
            }
            return g1Var;
        }
        if (g1Var2.b()) {
            Intrinsics.f(c1Var);
            m0 n14 = t1.n(c1Var);
            Intrinsics.checkNotNullExpressionValue(n14, "makeStarProjection(...)");
            return n14;
        }
        v1 substitutedArgument = g1Var2.getType().z0();
        w1 c14 = g1Var2.c();
        Intrinsics.checkNotNullExpressionValue(c14, "getProjectionKind(...)");
        w1 c15 = g1Var.c();
        Intrinsics.checkNotNullExpressionValue(c15, "getProjectionKind(...)");
        if (c15 != c14 && c15 != (w1Var3 = w1.INVARIANT)) {
            if (c14 == w1Var3) {
                c14 = c15;
            } else {
                Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
                Intrinsics.checkNotNullParameter(substitutedArgument, "substitutedArgument");
            }
        }
        if (c1Var == null || (w1Var = c1Var.r()) == null) {
            w1Var = w1.INVARIANT;
        }
        Intrinsics.f(w1Var);
        if (w1Var != c14 && w1Var != (w1Var2 = w1.INVARIANT)) {
            if (c14 == w1Var2) {
                c14 = w1Var2;
            } else {
                Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
                Intrinsics.checkNotNullParameter(substitutedArgument, "substitutedArgument");
            }
        }
        a(type.getAnnotations(), substitutedArgument.getAnnotations());
        h0 m13 = t1.m(lb.l0.x(substitutedArgument), type.x0());
        Intrinsics.checkNotNullExpressionValue(m13, "makeNullableIfNeeded(...)");
        u0 v03 = type.v0();
        if (!ao2.m0.U(m13)) {
            if (ao2.m0.U(m13)) {
                v03 = m13.v0();
            } else {
                u0 other = m13.v0();
                v03.getClass();
                Intrinsics.checkNotNullParameter(other, "other");
                if (!v03.isEmpty() || !other.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Collection values = u0.f100848b.f100840a.values();
                    Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        r0 r0Var = (r0) v03.f126314a.get(intValue);
                        r0 r0Var2 = (r0) other.f126314a.get(intValue);
                        if (r0Var == null) {
                            if (r0Var2 != null) {
                                mVar2 = (m) r0Var2;
                                m mVar3 = (m) r0Var;
                                if (mVar3 != null) {
                                    mVar = new m(dl2.b.L(mVar2.f100817a, mVar3.f100817a));
                                    mVar2 = mVar;
                                }
                            } else {
                                mVar2 = null;
                            }
                            wn2.k.b(mVar2, arrayList2);
                        } else {
                            m mVar4 = (m) r0Var;
                            m mVar5 = (m) r0Var2;
                            if (mVar5 == null) {
                                mVar2 = mVar4;
                                wn2.k.b(mVar2, arrayList2);
                            } else {
                                mVar = new m(dl2.b.L(mVar4.f100817a, mVar5.f100817a));
                                mVar2 = mVar;
                                wn2.k.b(mVar2, arrayList2);
                            }
                        }
                    }
                    v03 = t0.a(arrayList2);
                }
            }
            m13 = lb.l0.Z0(m13, null, v03, 1);
        }
        return new i1(m13, c14);
    }

    public final h0 e(h0 h0Var, p0 p0Var, int i13) {
        b1 w03 = h0Var.w0();
        List u03 = h0Var.u0();
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(u03, 10));
        int i14 = 0;
        for (Object obj : u03) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            g1 g1Var = (g1) obj;
            g1 d2 = d(g1Var, p0Var, (am2.c1) w03.getParameters().get(i14), i13 + 1);
            if (!d2.b()) {
                d2 = new i1(t1.l(d2.getType(), g1Var.getType().x0()), d2.c());
            }
            arrayList.add(d2);
            i14 = i15;
        }
        return lb.l0.Z0(h0Var, arrayList, null, 2);
    }
}
