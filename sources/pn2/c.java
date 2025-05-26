package pn2;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class c {
    public static boolean a(a1 a1Var, sn2.g type, c supertypesPolicy) {
        Intrinsics.checkNotNullParameter(a1Var, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(supertypesPolicy, "supertypesPolicy");
        sn2.k kVar = a1Var.f100765c;
        if ((kVar.O(type) && !kVar.e(type)) || kVar.o(type)) {
            return true;
        }
        a1Var.e();
        ArrayDeque arrayDeque = a1Var.f100769g;
        Intrinsics.f(arrayDeque);
        wn2.i iVar = a1Var.f100770h;
        Intrinsics.f(iVar);
        arrayDeque.push(type);
        while (!arrayDeque.isEmpty()) {
            if (iVar.f130607b > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + CollectionsKt.Z(iVar, null, null, null, 0, null, null, 63)).toString());
            }
            sn2.g gVar = (sn2.g) arrayDeque.pop();
            Intrinsics.f(gVar);
            if (iVar.add(gVar)) {
                c cVar = kVar.e(gVar) ? y0.f100859a : supertypesPolicy;
                if (!(!Intrinsics.d(cVar, r6))) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    sn2.k kVar2 = a1Var.f100765c;
                    Iterator it = kVar2.B(kVar2.f(gVar)).iterator();
                    while (it.hasNext()) {
                        sn2.g f13 = cVar.f(a1Var, (sn2.f) it.next());
                        if ((kVar.O(f13) && !kVar.e(f13)) || kVar.o(f13)) {
                            a1Var.b();
                            return true;
                        }
                        arrayDeque.add(f13);
                    }
                }
            }
        }
        a1Var.b();
        return false;
    }

    public static boolean b(a1 state, sn2.g start, sn2.i end) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        sn2.k kVar = state.f100765c;
        if (c(state, start, end)) {
            return true;
        }
        state.e();
        ArrayDeque arrayDeque = state.f100769g;
        Intrinsics.f(arrayDeque);
        wn2.i iVar = state.f100770h;
        Intrinsics.f(iVar);
        arrayDeque.push(start);
        while (!arrayDeque.isEmpty()) {
            if (iVar.f130607b > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + start + ". Supertypes = " + CollectionsKt.Z(iVar, null, null, null, 0, null, null, 63)).toString());
            }
            sn2.g gVar = (sn2.g) arrayDeque.pop();
            Intrinsics.f(gVar);
            if (iVar.add(gVar)) {
                c cVar = kVar.e(gVar) ? y0.f100859a : x0.f100855a;
                if (!(!Intrinsics.d(cVar, r6))) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    sn2.k kVar2 = state.f100765c;
                    Iterator it = kVar2.B(kVar2.f(gVar)).iterator();
                    while (it.hasNext()) {
                        sn2.g f13 = cVar.f(state, (sn2.f) it.next());
                        if (c(state, f13, end)) {
                            state.b();
                            return true;
                        }
                        arrayDeque.add(f13);
                    }
                }
            }
        }
        state.b();
        return false;
    }

    public static boolean c(a1 a1Var, sn2.g gVar, sn2.i iVar) {
        sn2.k kVar = a1Var.f100765c;
        if (kVar.k0(gVar)) {
            return true;
        }
        if (kVar.e(gVar)) {
            return false;
        }
        if (a1Var.f100764b) {
            kVar.K(gVar);
        }
        return kVar.T(kVar.f(gVar), iVar);
    }

    public static boolean d(sn2.k kVar, sn2.g gVar, sn2.g gVar2) {
        if (kVar.I(gVar) == kVar.I(gVar2) && kVar.e(gVar) == kVar.e(gVar2)) {
            if ((kVar.g0(gVar) == null) == (kVar.g0(gVar2) == null) && kVar.T(kVar.f(gVar), kVar.f(gVar2))) {
                if (kVar.Q(gVar, gVar2)) {
                    return true;
                }
                int I = kVar.I(gVar);
                for (int i13 = 0; i13 < I; i13++) {
                    g1 j03 = kVar.j0(gVar, i13);
                    g1 j04 = kVar.j0(gVar2, i13);
                    if (kVar.C(j03) != kVar.C(j04)) {
                        return false;
                    }
                    if (!kVar.C(j03) && (kVar.t(j03) != kVar.t(j04) || !e(kVar, kVar.m(j03), kVar.m(j04)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean e(sn2.k kVar, sn2.f fVar, sn2.f fVar2) {
        if (fVar == fVar2) {
            return true;
        }
        h0 n13 = kVar.n(fVar);
        h0 n14 = kVar.n(fVar2);
        if (n13 != null && n14 != null) {
            return d(kVar, n13, n14);
        }
        v r13 = kVar.r(fVar);
        v r14 = kVar.r(fVar2);
        if (r13 == null || r14 == null) {
            return false;
        }
        return d(kVar, kVar.H(r13), kVar.H(r14)) && d(kVar, kVar.l0(r13), kVar.l0(r14));
    }

    public abstract sn2.g f(a1 a1Var, sn2.f fVar);
}
