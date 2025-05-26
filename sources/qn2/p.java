package qn2;

import ao2.m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import pk.a0;
import pn2.b1;
import pn2.g1;
import pn2.h0;
import pn2.i1;
import pn2.v1;

/* loaded from: classes2.dex */
public final class p implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final p f104516a = new p();

    @Override // sn2.k
    public final h0 A(sn2.g gVar, boolean z13) {
        return a0.x1(gVar, z13);
    }

    @Override // sn2.k
    public final Collection B(sn2.i iVar) {
        return a0.r1(iVar);
    }

    @Override // sn2.k
    public final boolean C(g1 g1Var) {
        return a0.K0(g1Var);
    }

    @Override // sn2.k
    public final void D(sn2.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        pn2.v j13 = a0.j(fVar);
        if (j13 != null) {
            a0.i(j13);
        }
    }

    @Override // sn2.k
    public final sn2.h E(sn2.g gVar) {
        return a0.f(gVar);
    }

    @Override // sn2.k
    public final sn2.b F(sn2.c cVar) {
        return a0.z(cVar);
    }

    @Override // sn2.k
    public final a G(sn2.g gVar) {
        return a0.q1(this, gVar);
    }

    @Override // sn2.k
    public final h0 H(sn2.e eVar) {
        return a0.O0(eVar);
    }

    @Override // sn2.k
    public final int I(sn2.f fVar) {
        return a0.e(fVar);
    }

    @Override // sn2.k
    public final sn2.g J(sn2.g gVar) {
        h0 T0;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        pn2.r h10 = a0.h(gVar);
        return (h10 == null || (T0 = a0.T0(h10)) == null) ? gVar : T0;
    }

    @Override // sn2.k
    public final void K(sn2.g gVar) {
        a0.L0(gVar);
    }

    @Override // sn2.k
    public final boolean L(sn2.i iVar) {
        return a0.w0(iVar);
    }

    @Override // sn2.k
    public final l M(sn2.c cVar) {
        return a0.t1(cVar);
    }

    @Override // sn2.k
    public final boolean N(sn2.c receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return receiver instanceof cn2.a;
    }

    @Override // sn2.k
    public final boolean O(sn2.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return a0.u0(a0.s1(gVar));
    }

    @Override // sn2.k
    public final void P(sn2.g gVar) {
        a0.M0(gVar);
    }

    @Override // sn2.k
    public final boolean Q(sn2.g gVar, sn2.g gVar2) {
        return a0.p0(gVar, gVar2);
    }

    @Override // sn2.k
    public final i1 R(sn2.f fVar) {
        return a0.l(fVar);
    }

    @Override // sn2.k
    public final List S(sn2.f fVar) {
        return a0.Q(fVar);
    }

    @Override // sn2.k
    public final boolean T(sn2.i iVar, sn2.i iVar2) {
        return a0.d(iVar, iVar2);
    }

    @Override // sn2.k
    public final boolean U(sn2.i iVar) {
        return a0.E0(iVar);
    }

    @Override // sn2.k
    public final void V(sn2.g gVar, sn2.i constructor) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
    }

    @Override // sn2.k
    public final b1 W(sn2.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        h0 k13 = a0.k(fVar);
        if (k13 == null) {
            k13 = i0(fVar);
        }
        return a0.s1(k13);
    }

    @Override // sn2.k
    public final int X(sn2.i iVar) {
        return a0.U0(iVar);
    }

    @Override // sn2.k
    public final boolean Y(sn2.c cVar) {
        return a0.I0(cVar);
    }

    @Override // sn2.k
    public final g1 Z(sn2.h hVar, int i13) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (hVar instanceof sn2.g) {
            return a0.P((sn2.f) hVar, i13);
        }
        if (hVar instanceof sn2.a) {
            E e13 = ((sn2.a) hVar).get(i13);
            Intrinsics.checkNotNullExpressionValue(e13, "get(...)");
            return (g1) e13;
        }
        throw new IllegalStateException(("unknown type argument list type: " + hVar + ", " + k0.f80436a.b(hVar.getClass())).toString());
    }

    @Override // sn2.k
    public final sn2.c a(sn2.g gVar) {
        return a0.g(this, gVar);
    }

    @Override // sn2.k
    public final boolean a0(sn2.j jVar, sn2.i iVar) {
        return a0.n0(jVar, iVar);
    }

    @Override // qn2.b
    public final v1 b(sn2.g gVar, sn2.g gVar2) {
        return a0.H(this, gVar, gVar2);
    }

    @Override // sn2.k
    public final boolean b0(sn2.i iVar) {
        return a0.u0(iVar);
    }

    @Override // sn2.k
    public final h0 c(sn2.f fVar) {
        h0 u13;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        pn2.v j13 = a0.j(fVar);
        if (j13 != null && (u13 = a0.u1(j13)) != null) {
            return u13;
        }
        h0 k13 = a0.k(fVar);
        Intrinsics.f(k13);
        return k13;
    }

    @Override // sn2.k
    public final boolean c0(sn2.f fVar) {
        return a0.J0(fVar);
    }

    @Override // sn2.k
    public final sn2.m d(sn2.j jVar) {
        return a0.i0(jVar);
    }

    @Override // sn2.k
    public final boolean d0(sn2.i iVar) {
        return a0.v0(iVar);
    }

    @Override // sn2.k
    public final boolean e(sn2.g gVar) {
        return a0.C0(gVar);
    }

    @Override // sn2.k
    public final h0 e0(sn2.g gVar, sn2.b bVar) {
        return a0.y(gVar, bVar);
    }

    @Override // sn2.k
    public final b1 f(sn2.g gVar) {
        return a0.s1(gVar);
    }

    @Override // sn2.k
    public final h0 f0(sn2.d dVar) {
        return a0.T0(dVar);
    }

    @Override // sn2.k
    public final boolean g(sn2.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return a0.A0(a0.s1(gVar));
    }

    @Override // sn2.k
    public final pn2.r g0(sn2.g gVar) {
        return a0.h(gVar);
    }

    @Override // sn2.k
    public final v1 h(sn2.f fVar) {
        return a0.Q0(fVar);
    }

    @Override // sn2.k
    public final g1 h0(cn2.b bVar) {
        return a0.X0(bVar);
    }

    @Override // sn2.k
    public final int i(sn2.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (hVar instanceof sn2.g) {
            return a0.e((sn2.f) hVar);
        }
        if (hVar instanceof sn2.a) {
            return ((sn2.a) hVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + hVar + ", " + k0.f80436a.b(hVar.getClass())).toString());
    }

    @Override // sn2.k
    public final h0 i0(sn2.f fVar) {
        h0 O0;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        pn2.v j13 = a0.j(fVar);
        if (j13 != null && (O0 = a0.O0(j13)) != null) {
            return O0;
        }
        h0 k13 = a0.k(fVar);
        Intrinsics.f(k13);
        return k13;
    }

    @Override // sn2.k
    public final Collection j(sn2.g gVar) {
        return a0.W0(this, gVar);
    }

    @Override // sn2.k
    public final g1 j0(sn2.f fVar, int i13) {
        return a0.P(fVar, i13);
    }

    @Override // sn2.k
    public final boolean k(sn2.i iVar) {
        return a0.A0(iVar);
    }

    @Override // sn2.k
    public final boolean k0(sn2.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return a0.E0(W(fVar)) && !a0.F0(fVar);
    }

    @Override // sn2.k
    public final boolean l(sn2.f receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return receiver instanceof qm2.e;
    }

    @Override // sn2.k
    public final h0 l0(sn2.e eVar) {
        return a0.u1(eVar);
    }

    @Override // sn2.k
    public final v1 m(g1 g1Var) {
        return a0.d0(g1Var);
    }

    @Override // sn2.k
    public final g1 m0(sn2.g gVar, int i13) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (i13 < 0 || i13 >= a0.e(gVar)) {
            return null;
        }
        return a0.P(gVar, i13);
    }

    @Override // sn2.k
    public final h0 n(sn2.f fVar) {
        return a0.k(fVar);
    }

    @Override // sn2.k
    public final boolean n0(sn2.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        h0 k13 = a0.k(gVar);
        return (k13 != null ? a0.g(this, k13) : null) != null;
    }

    @Override // sn2.k
    public final boolean o(sn2.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        h0 k13 = a0.k(fVar);
        return (k13 != null ? a0.h(k13) : null) != null;
    }

    public final boolean o0(sn2.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return (fVar instanceof sn2.g) && a0.C0((sn2.g) fVar);
    }

    @Override // sn2.k
    public final boolean p(v1 v1Var) {
        Intrinsics.checkNotNullParameter(v1Var, "<this>");
        return a0.C0(i0(v1Var)) != a0.C0(c(v1Var));
    }

    public final sn2.f p0(sn2.f fVar) {
        h0 x13;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        h0 k13 = a0.k(fVar);
        return (k13 == null || (x13 = a0.x1(k13, true)) == null) ? fVar : x13;
    }

    @Override // sn2.k
    public final boolean q(sn2.g gVar) {
        return a0.y0(gVar);
    }

    @Override // sn2.k
    public final pn2.v r(sn2.f fVar) {
        return a0.j(fVar);
    }

    @Override // sn2.k
    public final List s(sn2.i iVar) {
        return a0.Z(iVar);
    }

    @Override // sn2.k
    public final sn2.m t(g1 g1Var) {
        return a0.h0(g1Var);
    }

    @Override // sn2.k
    public final v1 u(sn2.c cVar) {
        return a0.P0(cVar);
    }

    @Override // sn2.k
    public final boolean v(sn2.i iVar) {
        return a0.B0(iVar);
    }

    @Override // sn2.k
    public final sn2.j w(sn2.i iVar, int i13) {
        return a0.Y(iVar, i13);
    }

    @Override // sn2.k
    public final sn2.f x(sn2.f fVar) {
        return a0.y1(this, fVar);
    }

    @Override // sn2.k
    public final v1 y(ArrayList types) {
        h0 h0Var;
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types".toString());
        }
        if (size == 1) {
            return (v1) CollectionsKt.s0(types);
        }
        ArrayList arrayList = new ArrayList(g0.q(types, 10));
        Iterator it = types.iterator();
        boolean z13 = false;
        boolean z14 = false;
        while (it.hasNext()) {
            v1 v1Var = (v1) it.next();
            z13 = z13 || m0.U(v1Var);
            if (v1Var instanceof h0) {
                h0Var = (h0) v1Var;
            } else {
                if (!(v1Var instanceof pn2.v)) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullParameter(v1Var, "<this>");
                v1Var.z0();
                h0Var = ((pn2.v) v1Var).f100850b;
                z14 = true;
            }
            arrayList.add(h0Var);
        }
        if (z13) {
            return rn2.m.d(rn2.l.INTERSECTION_OF_ERROR_TYPES, types.toString());
        }
        x xVar = x.f104520a;
        if (!z14) {
            return xVar.b(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(g0.q(types, 10));
        Iterator it2 = types.iterator();
        while (it2.hasNext()) {
            arrayList2.add(dl2.b.Y2((v1) it2.next()));
        }
        return pn2.g.i(xVar.b(arrayList), xVar.b(arrayList2));
    }

    @Override // sn2.k
    public final boolean z(sn2.i iVar) {
        return a0.r0(iVar);
    }
}
