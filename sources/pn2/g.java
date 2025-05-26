package pn2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f100796a = new g();

    public static final boolean a(sn2.k kVar, sn2.g gVar) {
        b1 f13 = kVar.f(gVar);
        if (f13 instanceof a0) {
            Collection B = kVar.B(f13);
            if (!(B instanceof Collection) || !B.isEmpty()) {
                Iterator it = B.iterator();
                while (it.hasNext()) {
                    h0 n13 = kVar.n((sn2.f) it.next());
                    if (n13 != null && kVar.g(n13)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean b(sn2.k kVar, sn2.g gVar) {
        if (!kVar.g(gVar)) {
            if (gVar instanceof sn2.c) {
                g1 h03 = kVar.h0(kVar.M((sn2.c) gVar));
                if (kVar.C(h03) || !kVar.g(kVar.c(kVar.m(h03)))) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean c(sn2.k kVar, a1 a1Var, sn2.g gVar, sn2.g gVar2, boolean z13) {
        Collection<sn2.f> j13 = kVar.j(gVar);
        if ((j13 instanceof Collection) && j13.isEmpty()) {
            return false;
        }
        for (sn2.f fVar : j13) {
            if (Intrinsics.d(kVar.W(fVar), kVar.f(gVar2)) || (z13 && n(f100796a, a1Var, gVar2, fVar))) {
                return true;
            }
        }
        return false;
    }

    public static List d(a1 a1Var, sn2.g gVar, sn2.i iVar) {
        c G;
        sn2.k kVar = a1Var.f100765c;
        kVar.V(gVar, iVar);
        if (!kVar.b0(iVar) && kVar.O(gVar)) {
            return kotlin.collections.q0.f80391a;
        }
        if (kVar.d0(iVar)) {
            if (!kVar.T(kVar.f(gVar), iVar)) {
                return kotlin.collections.q0.f80391a;
            }
            h0 e03 = kVar.e0(gVar, sn2.b.FOR_SUBTYPING);
            if (e03 != null) {
                gVar = e03;
            }
            return kotlin.collections.e0.b(gVar);
        }
        wn2.f fVar = new wn2.f();
        a1Var.e();
        ArrayDeque arrayDeque = a1Var.f100769g;
        Intrinsics.f(arrayDeque);
        wn2.i iVar2 = a1Var.f100770h;
        Intrinsics.f(iVar2);
        arrayDeque.push(gVar);
        while (!arrayDeque.isEmpty()) {
            if (iVar2.f130607b > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + gVar + ". Supertypes = " + CollectionsKt.Z(iVar2, null, null, null, 0, null, null, 63)).toString());
            }
            sn2.g gVar2 = (sn2.g) arrayDeque.pop();
            Intrinsics.f(gVar2);
            if (iVar2.add(gVar2)) {
                h0 e04 = kVar.e0(gVar2, sn2.b.FOR_SUBTYPING);
                if (e04 == null) {
                    e04 = gVar2;
                }
                boolean T = kVar.T(kVar.f(e04), iVar);
                y0 y0Var = y0.f100859a;
                sn2.k kVar2 = a1Var.f100765c;
                if (T) {
                    fVar.add(e04);
                    G = y0Var;
                } else {
                    G = kVar.I(e04) == 0 ? x0.f100855a : kVar2.G(e04);
                }
                if (!(!Intrinsics.d(G, y0Var))) {
                    G = null;
                }
                if (G != null) {
                    Iterator it = kVar2.B(kVar2.f(gVar2)).iterator();
                    while (it.hasNext()) {
                        arrayDeque.add(G.f(a1Var, (sn2.f) it.next()));
                    }
                }
            }
        }
        a1Var.b();
        return fVar;
    }

    public static List e(a1 a1Var, sn2.g gVar, sn2.i iVar) {
        int i13;
        List d2 = d(a1Var, gVar, iVar);
        if (d2.size() < 2) {
            return d2;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : d2) {
            sn2.k kVar = a1Var.f100765c;
            sn2.h E = kVar.E((sn2.g) obj);
            int i14 = kVar.i(E);
            while (true) {
                if (i13 >= i14) {
                    arrayList.add(obj);
                    break;
                }
                i13 = kVar.r(kVar.m(kVar.Z(E, i13))) == null ? i13 + 1 : 0;
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : d2;
    }

    public static final h0 f(am2.b1 b1Var, List arguments) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        o0 o0Var = new o0();
        p0 e13 = rm2.i0.e(null, b1Var, arguments);
        u0.f100848b.getClass();
        return o0Var.b(e13, u0.f100849c);
    }

    public static boolean g(a1 state, sn2.f a13, sn2.f b13) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(a13, "a");
        Intrinsics.checkNotNullParameter(b13, "b");
        sn2.k kVar = state.f100765c;
        if (a13 == b13) {
            return true;
        }
        g gVar = f100796a;
        if (l(kVar, a13) && l(kVar, b13)) {
            v1 f13 = state.f(state.g(a13));
            v1 f14 = state.f(state.g(b13));
            h0 i03 = kVar.i0(f13);
            if (!kVar.T(kVar.W(f13), kVar.W(f14))) {
                return false;
            }
            if (kVar.I(i03) == 0) {
                return kVar.p(f13) || kVar.p(f14) || kVar.e(i03) == kVar.e(kVar.i0(f14));
            }
        }
        return n(gVar, state, a13, b13) && n(gVar, state, b13, a13);
    }

    public static List h(a1 state, sn2.g subType, sn2.i superConstructor) {
        c cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superConstructor, "superConstructor");
        sn2.k kVar = state.f100765c;
        if (kVar.O(subType)) {
            return e(state, subType, superConstructor);
        }
        if (!kVar.b0(superConstructor) && !kVar.k(superConstructor)) {
            return d(state, subType, superConstructor);
        }
        wn2.f fVar = new wn2.f();
        state.e();
        ArrayDeque arrayDeque = state.f100769g;
        Intrinsics.f(arrayDeque);
        wn2.i iVar = state.f100770h;
        Intrinsics.f(iVar);
        arrayDeque.push(subType);
        while (!arrayDeque.isEmpty()) {
            if (iVar.f130607b > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + subType + ". Supertypes = " + CollectionsKt.Z(iVar, null, null, null, 0, null, null, 63)).toString());
            }
            sn2.g gVar = (sn2.g) arrayDeque.pop();
            Intrinsics.f(gVar);
            if (iVar.add(gVar)) {
                boolean O = kVar.O(gVar);
                y0 y0Var = y0.f100859a;
                if (O) {
                    fVar.add(gVar);
                    cVar = y0Var;
                } else {
                    cVar = x0.f100855a;
                }
                if (!(!Intrinsics.d(cVar, y0Var))) {
                    cVar = null;
                }
                if (cVar != null) {
                    sn2.k kVar2 = state.f100765c;
                    Iterator it = kVar2.B(kVar2.f(gVar)).iterator();
                    while (it.hasNext()) {
                        arrayDeque.add(cVar.f(state, (sn2.f) it.next()));
                    }
                }
            }
        }
        state.b();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = fVar.iterator();
        while (it2.hasNext()) {
            sn2.g gVar2 = (sn2.g) it2.next();
            Intrinsics.f(gVar2);
            kotlin.collections.k0.u(e(state, gVar2, superConstructor), arrayList);
        }
        return arrayList;
    }

    public static final v1 i(h0 lowerBound, h0 upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        return Intrinsics.d(lowerBound, upperBound) ? lowerBound : new w(lowerBound, upperBound);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        return r7.w(r7.W(r8), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static sn2.j j(sn2.k r7, sn2.f r8, sn2.g r9) {
        /*
            int r0 = r7.I(r8)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L67
            pn2.g1 r4 = r7.j0(r8, r2)
            boolean r5 = r7.C(r4)
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L16
            r3 = r4
        L16:
            if (r3 == 0) goto L64
            pn2.v1 r3 = r7.m(r3)
            if (r3 != 0) goto L1f
            goto L64
        L1f:
            pn2.h0 r4 = r7.i0(r3)
            sn2.g r4 = r7.J(r4)
            boolean r4 = r7.n0(r4)
            if (r4 == 0) goto L3c
            pn2.h0 r4 = r7.i0(r9)
            sn2.g r4 = r7.J(r4)
            boolean r4 = r7.n0(r4)
            if (r4 == 0) goto L3c
            goto L3d
        L3c:
            r6 = r1
        L3d:
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r3, r9)
            if (r4 != 0) goto L5b
            if (r6 == 0) goto L54
            pn2.b1 r4 = r7.W(r3)
            pn2.b1 r5 = r7.W(r9)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r5)
            if (r4 == 0) goto L54
            goto L5b
        L54:
            sn2.j r3 = j(r7, r3, r9)
            if (r3 == 0) goto L64
            return r3
        L5b:
            pn2.b1 r8 = r7.W(r8)
            sn2.j r7 = r7.w(r8, r2)
            return r7
        L64:
            int r2 = r2 + 1
            goto L6
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pn2.g.j(sn2.k, sn2.f, sn2.g):sn2.j");
    }

    public static boolean k(a1 a1Var, sn2.g gVar) {
        sn2.k kVar = a1Var.f100765c;
        b1 f13 = kVar.f(gVar);
        if (kVar.b0(f13)) {
            return kVar.U(f13);
        }
        if (kVar.U(kVar.f(gVar))) {
            return true;
        }
        a1Var.e();
        ArrayDeque arrayDeque = a1Var.f100769g;
        Intrinsics.f(arrayDeque);
        wn2.i iVar = a1Var.f100770h;
        Intrinsics.f(iVar);
        arrayDeque.push(gVar);
        while (!arrayDeque.isEmpty()) {
            if (iVar.f130607b > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + gVar + ". Supertypes = " + CollectionsKt.Z(iVar, null, null, null, 0, null, null, 63)).toString());
            }
            sn2.g gVar2 = (sn2.g) arrayDeque.pop();
            Intrinsics.f(gVar2);
            if (iVar.add(gVar2)) {
                c cVar = kVar.O(gVar2) ? y0.f100859a : x0.f100855a;
                if (!(!Intrinsics.d(cVar, r6))) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    sn2.k kVar2 = a1Var.f100765c;
                    Iterator it = kVar2.B(kVar2.f(gVar2)).iterator();
                    while (it.hasNext()) {
                        sn2.g f14 = cVar.f(a1Var, (sn2.f) it.next());
                        if (kVar.U(kVar.f(f14))) {
                            a1Var.b();
                            return true;
                        }
                        arrayDeque.add(f14);
                    }
                }
            }
        }
        a1Var.b();
        return false;
    }

    public static boolean l(sn2.k kVar, sn2.f fVar) {
        if (kVar.L(kVar.W(fVar))) {
            kVar.D(fVar);
            if (!kVar.o(fVar) && !kVar.l(fVar) && Intrinsics.d(kVar.f(kVar.i0(fVar)), kVar.f(kVar.c(fVar)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(a1 a1Var, sn2.h capturedSubArguments, sn2.g superType) {
        boolean g13;
        Intrinsics.checkNotNullParameter(a1Var, "<this>");
        Intrinsics.checkNotNullParameter(capturedSubArguments, "capturedSubArguments");
        Intrinsics.checkNotNullParameter(superType, "superType");
        sn2.k kVar = a1Var.f100765c;
        b1 f13 = kVar.f(superType);
        int i13 = kVar.i(capturedSubArguments);
        int X = kVar.X(f13);
        if (i13 != X || i13 != kVar.I(superType)) {
            return false;
        }
        for (int i14 = 0; i14 < X; i14++) {
            g1 j03 = kVar.j0(superType, i14);
            if (!kVar.C(j03)) {
                v1 m13 = kVar.m(j03);
                g1 Z = kVar.Z(capturedSubArguments, i14);
                kVar.t(Z);
                sn2.m mVar = sn2.m.INV;
                v1 m14 = kVar.m(Z);
                sn2.m declared = kVar.d(kVar.w(f13, i14));
                sn2.m useSite = kVar.t(j03);
                Intrinsics.checkNotNullParameter(declared, "declared");
                Intrinsics.checkNotNullParameter(useSite, "useSite");
                if (declared == mVar) {
                    declared = useSite;
                } else if (useSite != mVar && declared != useSite) {
                    declared = null;
                }
                if (declared == null) {
                    return a1Var.f100763a;
                }
                g gVar = f100796a;
                if (declared == mVar) {
                    o(kVar, m14, m13);
                    o(kVar, m13, m14);
                }
                int i15 = a1Var.f100768f;
                if (i15 > 100) {
                    throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + m14).toString());
                }
                a1Var.f100768f = i15 + 1;
                int i16 = d.f100776a[declared.ordinal()];
                if (i16 == 1) {
                    g13 = g(a1Var, m14, m13);
                } else if (i16 == 2) {
                    g13 = n(gVar, a1Var, m14, m13);
                } else {
                    if (i16 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g13 = n(gVar, a1Var, m13, m14);
                }
                a1Var.f100768f--;
                if (!g13) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean n(pn2.g r17, pn2.a1 r18, sn2.f r19, sn2.f r20) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pn2.g.n(pn2.g, pn2.a1, sn2.f, sn2.f):boolean");
    }

    public static void o(sn2.k kVar, sn2.f fVar, sn2.f fVar2) {
        sn2.h n13 = kVar.n(fVar);
        if (n13 instanceof sn2.c) {
            sn2.c cVar = (sn2.c) n13;
            if (!kVar.N(cVar) && kVar.C(kVar.h0(kVar.M(cVar))) && kVar.F(cVar) == sn2.b.FOR_SUBTYPING) {
                kVar.W(fVar2);
            }
        }
    }

    public static final h0 p(u0 attributes, am2.g descriptor, List arguments) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        b1 e13 = descriptor.e();
        Intrinsics.checkNotNullExpressionValue(e13, "getTypeConstructor(...)");
        return q(attributes, e13, arguments, false);
    }

    public static h0 q(u0 attributes, b1 constructor, List arguments, boolean z13) {
        in2.n e13;
        dm2.f0 f0Var;
        in2.n X;
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (attributes.isEmpty() && arguments.isEmpty() && !z13 && constructor.b() != null) {
            am2.j b13 = constructor.b();
            Intrinsics.f(b13);
            h0 j13 = b13.j();
            Intrinsics.checkNotNullExpressionValue(j13, "getDefaultType(...)");
            return j13;
        }
        am2.j b14 = constructor.b();
        if (b14 instanceof am2.c1) {
            e13 = ((am2.c1) b14).j().w();
        } else if (b14 instanceof am2.g) {
            fn2.d.i(fn2.d.j(b14));
            qn2.h kotlinTypeRefiner = qn2.h.f104498a;
            if (arguments.isEmpty()) {
                am2.g gVar = (am2.g) b14;
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                f0Var = gVar instanceof dm2.f0 ? (dm2.f0) gVar : null;
                if (f0Var == null || (X = f0Var.a0(kotlinTypeRefiner)) == null) {
                    e13 = gVar.L();
                    Intrinsics.checkNotNullExpressionValue(e13, "getUnsubstitutedMemberScope(...)");
                }
                e13 = X;
            } else {
                am2.g gVar2 = (am2.g) b14;
                l1 typeSubstitution = d1.f100781b.Z(constructor, arguments);
                Intrinsics.checkNotNullParameter(gVar2, "<this>");
                Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                Intrinsics.checkNotNullParameter(gVar2, "<this>");
                Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                f0Var = gVar2 instanceof dm2.f0 ? (dm2.f0) gVar2 : null;
                if (f0Var == null || (X = f0Var.X(typeSubstitution, kotlinTypeRefiner)) == null) {
                    e13 = gVar2.G(typeSubstitution);
                    Intrinsics.checkNotNullExpressionValue(e13, "getMemberScope(...)");
                }
                e13 = X;
            }
        } else if (b14 instanceof am2.b1) {
            rn2.i iVar = rn2.i.SCOPE_FOR_ABBREVIATION_TYPE;
            String str = ((dm2.o) ((am2.b1) b14)).getName().f139478a;
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
            e13 = rn2.m.a(iVar, true, str);
        } else {
            if (!(constructor instanceof a0)) {
                throw new IllegalStateException("Unsupported classifier: " + b14 + " for constructor: " + constructor);
            }
            e13 = ((a0) constructor).e();
        }
        return s(attributes, constructor, arguments, z13, e13, new lb.y0(arguments, attributes, constructor, z13));
    }

    public static final h0 r(List arguments, in2.n memberScope, u0 attributes, b1 constructor, boolean z13) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        i0 i0Var = new i0(constructor, arguments, z13, memberScope, new c0(arguments, memberScope, attributes, constructor, z13));
        return attributes.isEmpty() ? i0Var : new j0(i0Var, attributes);
    }

    public static final h0 s(u0 attributes, b1 constructor, List arguments, boolean z13, in2.n memberScope, Function1 refinedTypeFactory) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(refinedTypeFactory, "refinedTypeFactory");
        i0 i0Var = new i0(constructor, arguments, z13, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? i0Var : new j0(i0Var, attributes);
    }
}
