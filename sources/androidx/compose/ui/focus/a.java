package androidx.compose.ui.focus;

import androidx.compose.foundation.lazy.layout.i;
import androidx.compose.foundation.lazy.layout.l;
import androidx.compose.foundation.lazy.layout.m;
import com.bumptech.glide.c;
import e.f;
import java.util.Arrays;
import k2.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import kotlin.ranges.IntRange;
import n4.k;
import q3.h;
import q3.j;
import s3.j1;
import s3.k0;
import s3.n;
import s3.q1;
import t3.c0;
import u2.p;
import u2.q;
import w1.z0;
import z2.a0;
import z2.b0;
import z2.d;
import z2.d0;
import z2.e0;
import z2.f0;
import z2.g0;
import z2.o;
import z2.s;
import z2.x;
import z2.z;

/* loaded from: classes2.dex */
public abstract class a {
    public static final boolean A(z zVar) {
        p pVar;
        j1 j1Var;
        int i13 = b0.f140607b[zVar.N0().ordinal()];
        boolean z13 = true;
        if (i13 != 1 && i13 != 2) {
            if (i13 == 3) {
                z p13 = p(zVar);
                if (p13 != null ? d(p13, false, true) : true) {
                    r(zVar);
                }
                z13 = false;
            } else {
                if (i13 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                p pVar2 = zVar.f120042a;
                if (!pVar2.f120054m) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                p pVar3 = pVar2.f120046e;
                k0 U0 = c.U0(zVar);
                loop0: while (true) {
                    if (U0 == null) {
                        pVar = null;
                        break;
                    }
                    if ((U0.f110837y.f110808e.f120045d & 1024) != 0) {
                        while (pVar3 != null) {
                            if ((pVar3.f120044c & 1024) != 0) {
                                pVar = pVar3;
                                e eVar = null;
                                while (pVar != null) {
                                    if (pVar instanceof z) {
                                        break loop0;
                                    }
                                    if ((pVar.f120044c & 1024) != 0 && (pVar instanceof n)) {
                                        int i14 = 0;
                                        for (p pVar4 = ((n) pVar).f110843o; pVar4 != null; pVar4 = pVar4.f120047f) {
                                            if ((pVar4.f120044c & 1024) != 0) {
                                                i14++;
                                                if (i14 == 1) {
                                                    pVar = pVar4;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new e(new p[16]);
                                                    }
                                                    if (pVar != null) {
                                                        eVar.b(pVar);
                                                        pVar = null;
                                                    }
                                                    eVar.b(pVar4);
                                                }
                                            }
                                        }
                                        if (i14 == 1) {
                                        }
                                    }
                                    pVar = c.g(eVar);
                                }
                            }
                            pVar3 = pVar3.f120046e;
                        }
                    }
                    U0 = U0.v();
                    pVar3 = (U0 == null || (j1Var = U0.f110837y) == null) ? null : j1Var.f110807d;
                }
                z zVar2 = (z) pVar;
                if (zVar2 != null) {
                    x N0 = zVar2.N0();
                    z13 = G(zVar2, zVar);
                    if (z13 && N0 != zVar2.N0()) {
                        D(zVar2);
                    }
                } else {
                    if (((Boolean) ((c0) c.V0(zVar)).f115877e.f17404a.invoke(null, null)).booleanValue()) {
                        r(zVar);
                    }
                    z13 = false;
                }
            }
        }
        if (z13) {
            D(zVar);
        }
        return z13;
    }

    public static final boolean B(z zVar, Function1 function1) {
        Object[] objArr = new z[16];
        p pVar = zVar.f120042a;
        if (!pVar.f120054m) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        e eVar = new e(new p[16]);
        p pVar2 = pVar.f120047f;
        if (pVar2 == null) {
            c.e(eVar, pVar);
        } else {
            eVar.b(pVar2);
        }
        int i13 = 0;
        while (eVar.m()) {
            p pVar3 = (p) eVar.o(eVar.f78184c - 1);
            if ((pVar3.f120045d & 1024) == 0) {
                c.e(eVar, pVar3);
            } else {
                while (true) {
                    if (pVar3 == null) {
                        break;
                    }
                    if ((pVar3.f120044c & 1024) != 0) {
                        e eVar2 = null;
                        while (pVar3 != null) {
                            if (pVar3 instanceof z) {
                                z zVar2 = (z) pVar3;
                                int i14 = i13 + 1;
                                if (objArr.length < i14) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i14, objArr.length * 2));
                                    Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i13] = zVar2;
                                i13 = i14;
                            } else if ((pVar3.f120044c & 1024) != 0 && (pVar3 instanceof n)) {
                                int i15 = 0;
                                for (p pVar4 = ((n) pVar3).f110843o; pVar4 != null; pVar4 = pVar4.f120047f) {
                                    if ((pVar4.f120044c & 1024) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            pVar3 = pVar4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new e(new p[16]);
                                            }
                                            if (pVar3 != null) {
                                                eVar2.b(pVar3);
                                                pVar3 = null;
                                            }
                                            eVar2.b(pVar4);
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                            pVar3 = c.g(eVar2);
                        }
                    } else {
                        pVar3 = pVar3.f120047f;
                    }
                }
            }
        }
        e0 comparator = e0.f140614a;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(objArr, 0, i13, comparator);
        if (i13 > 0) {
            int i16 = i13 - 1;
            do {
                z zVar3 = (z) objArr[i16];
                if (v(zVar3) && a(zVar3, function1)) {
                    return true;
                }
                i16--;
            } while (i16 >= 0);
        }
        return false;
    }

    public static final boolean C(z zVar, Function1 function1) {
        Object[] objArr = new z[16];
        p pVar = zVar.f120042a;
        if (!pVar.f120054m) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        e eVar = new e(new p[16]);
        p pVar2 = pVar.f120047f;
        if (pVar2 == null) {
            c.e(eVar, pVar);
        } else {
            eVar.b(pVar2);
        }
        int i13 = 0;
        while (eVar.m()) {
            p pVar3 = (p) eVar.o(eVar.f78184c - 1);
            if ((pVar3.f120045d & 1024) == 0) {
                c.e(eVar, pVar3);
            } else {
                while (true) {
                    if (pVar3 == null) {
                        break;
                    }
                    if ((pVar3.f120044c & 1024) != 0) {
                        e eVar2 = null;
                        while (pVar3 != null) {
                            if (pVar3 instanceof z) {
                                z zVar2 = (z) pVar3;
                                int i14 = i13 + 1;
                                if (objArr.length < i14) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i14, objArr.length * 2));
                                    Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i13] = zVar2;
                                i13 = i14;
                            } else if ((pVar3.f120044c & 1024) != 0 && (pVar3 instanceof n)) {
                                int i15 = 0;
                                for (p pVar4 = ((n) pVar3).f110843o; pVar4 != null; pVar4 = pVar4.f120047f) {
                                    if ((pVar4.f120044c & 1024) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            pVar3 = pVar4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new e(new p[16]);
                                            }
                                            if (pVar3 != null) {
                                                eVar2.b(pVar3);
                                                pVar3 = null;
                                            }
                                            eVar2.b(pVar4);
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                            pVar3 = c.g(eVar2);
                        }
                    } else {
                        pVar3 = pVar3.f120047f;
                    }
                }
            }
        }
        e0 comparator = e0.f140614a;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(objArr, 0, i13, comparator);
        if (i13 <= 0) {
            return false;
        }
        int i16 = 0;
        do {
            z zVar3 = (z) objArr[i16];
            if (v(zVar3) && m(zVar3, function1)) {
                return true;
            }
            i16++;
        } while (i16 < i13);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [k2.e] */
    public static final void D(z zVar) {
        j1 j1Var;
        p pVar = zVar.f120042a;
        if (!pVar.f120054m) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        k0 U0 = c.U0(zVar);
        p pVar2 = pVar;
        while (U0 != null) {
            if ((U0.f110837y.f110808e.f120045d & 5120) != 0) {
                while (pVar2 != null) {
                    int i13 = pVar2.f120044c;
                    if ((i13 & 5120) != 0) {
                        if (pVar2 != pVar && (i13 & 1024) != 0) {
                            return;
                        }
                        if ((i13 & 4096) != 0) {
                            n nVar = pVar2;
                            ?? r43 = 0;
                            while (nVar != 0) {
                                if (nVar instanceof d) {
                                    d dVar = (d) nVar;
                                    dVar.x(q(dVar));
                                } else if ((nVar.f120044c & 4096) != 0 && (nVar instanceof n)) {
                                    p pVar3 = nVar.f110843o;
                                    int i14 = 0;
                                    nVar = nVar;
                                    r43 = r43;
                                    while (pVar3 != null) {
                                        if ((pVar3.f120044c & 4096) != 0) {
                                            i14++;
                                            r43 = r43;
                                            if (i14 == 1) {
                                                nVar = pVar3;
                                            } else {
                                                if (r43 == 0) {
                                                    r43 = new e(new p[16]);
                                                }
                                                if (nVar != 0) {
                                                    r43.b(nVar);
                                                    nVar = 0;
                                                }
                                                r43.b(pVar3);
                                            }
                                        }
                                        pVar3 = pVar3.f120047f;
                                        nVar = nVar;
                                        r43 = r43;
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                nVar = c.g(r43);
                            }
                        }
                    }
                    pVar2 = pVar2.f120046e;
                }
            }
            U0 = U0.v();
            pVar2 = (U0 == null || (j1Var = U0.f110837y) == null) ? null : j1Var.f110807d;
        }
    }

    public static final boolean E(z zVar) {
        Boolean F = F(zVar, 7);
        if (F != null) {
            return F.booleanValue();
        }
        return false;
    }

    public static final Boolean F(z zVar, int i13) {
        Boolean valueOf;
        a0 i14 = nl.b.i(zVar);
        z2.c0 c0Var = new z2.c0(zVar, 1);
        try {
            if (i14.f140603c) {
                a0.a(i14);
            }
            i14.f140603c = true;
            i14.f140602b.b(c0Var);
            int i15 = b0.f140606a[z(zVar, i13).ordinal()];
            if (i15 == 1) {
                valueOf = Boolean.valueOf(A(zVar));
            } else if (i15 != 2) {
                if (i15 != 3 && i15 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                valueOf = null;
            } else {
                valueOf = Boolean.TRUE;
            }
            return valueOf;
        } finally {
            a0.b(i14);
        }
    }

    public static final boolean G(z zVar, z zVar2) {
        p pVar;
        p pVar2;
        j1 j1Var;
        j1 j1Var2;
        p pVar3 = zVar2.f120042a;
        if (!pVar3.f120054m) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        p pVar4 = pVar3.f120046e;
        k0 U0 = c.U0(zVar2);
        loop0: while (true) {
            if (U0 == null) {
                pVar = null;
                break;
            }
            if ((U0.f110837y.f110808e.f120045d & 1024) != 0) {
                while (pVar4 != null) {
                    if ((pVar4.f120044c & 1024) != 0) {
                        pVar = pVar4;
                        e eVar = null;
                        while (pVar != null) {
                            if (pVar instanceof z) {
                                break loop0;
                            }
                            if ((pVar.f120044c & 1024) != 0 && (pVar instanceof n)) {
                                int i13 = 0;
                                for (p pVar5 = ((n) pVar).f110843o; pVar5 != null; pVar5 = pVar5.f120047f) {
                                    if ((pVar5.f120044c & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            pVar = pVar5;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new e(new p[16]);
                                            }
                                            if (pVar != null) {
                                                eVar.b(pVar);
                                                pVar = null;
                                            }
                                            eVar.b(pVar5);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            pVar = c.g(eVar);
                        }
                    }
                    pVar4 = pVar4.f120046e;
                }
            }
            U0 = U0.v();
            pVar4 = (U0 == null || (j1Var2 = U0.f110837y) == null) ? null : j1Var2.f110807d;
        }
        if (!Intrinsics.d(pVar, zVar)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        int i14 = b0.f140607b[zVar.N0().ordinal()];
        if (i14 == 1) {
            r(zVar2);
            zVar.R0(x.ActiveParent);
        } else {
            if (i14 == 2) {
                return false;
            }
            if (i14 != 3) {
                if (i14 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                p pVar6 = zVar.f120042a;
                if (!pVar6.f120054m) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                p pVar7 = pVar6.f120046e;
                k0 U02 = c.U0(zVar);
                loop4: while (true) {
                    if (U02 == null) {
                        pVar2 = null;
                        break;
                    }
                    if ((U02.f110837y.f110808e.f120045d & 1024) != 0) {
                        while (pVar7 != null) {
                            if ((pVar7.f120044c & 1024) != 0) {
                                pVar2 = pVar7;
                                e eVar2 = null;
                                while (pVar2 != null) {
                                    if (pVar2 instanceof z) {
                                        break loop4;
                                    }
                                    if ((pVar2.f120044c & 1024) != 0 && (pVar2 instanceof n)) {
                                        int i15 = 0;
                                        for (p pVar8 = ((n) pVar2).f110843o; pVar8 != null; pVar8 = pVar8.f120047f) {
                                            if ((pVar8.f120044c & 1024) != 0) {
                                                i15++;
                                                if (i15 == 1) {
                                                    pVar2 = pVar8;
                                                } else {
                                                    if (eVar2 == null) {
                                                        eVar2 = new e(new p[16]);
                                                    }
                                                    if (pVar2 != null) {
                                                        eVar2.b(pVar2);
                                                        pVar2 = null;
                                                    }
                                                    eVar2.b(pVar8);
                                                }
                                            }
                                        }
                                        if (i15 == 1) {
                                        }
                                    }
                                    pVar2 = c.g(eVar2);
                                }
                            }
                            pVar7 = pVar7.f120046e;
                        }
                    }
                    U02 = U02.v();
                    pVar7 = (U02 == null || (j1Var = U02.f110837y) == null) ? null : j1Var.f110807d;
                }
                z zVar3 = (z) pVar2;
                if (zVar3 != null || !((Boolean) ((c0) c.V0(zVar)).f115877e.f17404a.invoke(null, null)).booleanValue()) {
                    if (zVar3 == null || !G(zVar3, zVar)) {
                        return false;
                    }
                    boolean G = G(zVar, zVar2);
                    if (zVar.N0() != x.ActiveParent) {
                        throw new IllegalStateException("Deactivated node is focused".toString());
                    }
                    if (!G) {
                        return G;
                    }
                    D(zVar3);
                    return G;
                }
                r(zVar2);
                zVar.R0(x.ActiveParent);
            } else {
                if (p(zVar) == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child".toString());
                }
                z p13 = p(zVar);
                if (p13 != null && !d(p13, false, true)) {
                    return false;
                }
                r(zVar2);
            }
        }
        return true;
    }

    public static final Object H(z zVar, int i13, z0 z0Var) {
        int i14;
        Object obj;
        p pVar;
        h hVar;
        androidx.compose.foundation.lazy.layout.n nVar;
        j1 j1Var;
        p pVar2 = zVar.f120042a;
        if (!pVar2.f120054m) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        p pVar3 = pVar2.f120046e;
        k0 U0 = c.U0(zVar);
        loop0: while (true) {
            i14 = 1;
            obj = null;
            if (U0 == null) {
                pVar = null;
                break;
            }
            if ((U0.f110837y.f110808e.f120045d & 1024) != 0) {
                while (pVar3 != null) {
                    if ((pVar3.f120044c & 1024) != 0) {
                        pVar = pVar3;
                        e eVar = null;
                        while (pVar != null) {
                            if (pVar instanceof z) {
                                break loop0;
                            }
                            if ((pVar.f120044c & 1024) != 0 && (pVar instanceof n)) {
                                int i15 = 0;
                                for (p pVar4 = ((n) pVar).f110843o; pVar4 != null; pVar4 = pVar4.f120047f) {
                                    if ((pVar4.f120044c & 1024) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            pVar = pVar4;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new e(new p[16]);
                                            }
                                            if (pVar != null) {
                                                eVar.b(pVar);
                                                pVar = null;
                                            }
                                            eVar.b(pVar4);
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                            pVar = c.g(eVar);
                        }
                    }
                    pVar3 = pVar3.f120046e;
                }
            }
            U0 = U0.v();
            pVar3 = (U0 == null || (j1Var = U0.f110837y) == null) ? null : j1Var.f110807d;
        }
        z zVar2 = (z) pVar;
        if ((zVar2 != null && Intrinsics.d((h) zVar2.c(j.a()), (h) zVar.c(j.a()))) || (hVar = (h) zVar.c(j.a())) == null) {
            return null;
        }
        int i16 = 5;
        if (!z2.c.b(i13, 5)) {
            i16 = 6;
            if (!z2.c.b(i13, 6)) {
                i16 = 3;
                if (!z2.c.b(i13, 3)) {
                    i16 = 4;
                    if (!z2.c.b(i13, 4)) {
                        if (z2.c.b(i13, 1)) {
                            i14 = 2;
                        } else if (!z2.c.b(i13, 2)) {
                            throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
                        }
                        m mVar = (m) hVar;
                        nVar = mVar.f17265b;
                        if (nVar.a() > 0 || !nVar.c()) {
                            return z0Var.invoke(m.f17264g);
                        }
                        int e13 = mVar.m(i14) ? nVar.e() : nVar.d();
                        j0 j0Var = new j0();
                        i iVar = mVar.f17266c;
                        iVar.getClass();
                        androidx.compose.foundation.lazy.layout.h hVar2 = new androidx.compose.foundation.lazy.layout.h(e13, e13);
                        e eVar2 = iVar.f17252a;
                        eVar2.b(hVar2);
                        j0Var.f80434a = hVar2;
                        while (obj == null && mVar.l((androidx.compose.foundation.lazy.layout.h) j0Var.f80434a, i14)) {
                            androidx.compose.foundation.lazy.layout.h hVar3 = (androidx.compose.foundation.lazy.layout.h) j0Var.f80434a;
                            int i17 = hVar3.f17244a;
                            boolean m13 = mVar.m(i14);
                            int i18 = hVar3.f17245b;
                            if (m13) {
                                i18++;
                            } else {
                                i17--;
                            }
                            androidx.compose.foundation.lazy.layout.h hVar4 = new androidx.compose.foundation.lazy.layout.h(i17, i18);
                            eVar2.b(hVar4);
                            eVar2.n((androidx.compose.foundation.lazy.layout.h) j0Var.f80434a);
                            j0Var.f80434a = hVar4;
                            nVar.b();
                            obj = z0Var.invoke(new l(mVar, j0Var, i14));
                        }
                        eVar2.n((androidx.compose.foundation.lazy.layout.h) j0Var.f80434a);
                        nVar.b();
                        return obj;
                    }
                }
            }
        }
        i14 = i16;
        m mVar2 = (m) hVar;
        nVar = mVar2.f17265b;
        if (nVar.a() > 0) {
        }
        return z0Var.invoke(m.f17264g);
    }

    public static final boolean I(int i13, z zVar, a3.d dVar, Function1 function1) {
        z h10;
        e eVar = new e(new z[16]);
        p pVar = zVar.f120042a;
        if (!pVar.f120054m) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        e eVar2 = new e(new p[16]);
        p pVar2 = pVar.f120047f;
        if (pVar2 == null) {
            c.e(eVar2, pVar);
        } else {
            eVar2.b(pVar2);
        }
        while (eVar2.m()) {
            p pVar3 = (p) eVar2.o(eVar2.f78184c - 1);
            if ((pVar3.f120045d & 1024) == 0) {
                c.e(eVar2, pVar3);
            } else {
                while (true) {
                    if (pVar3 == null) {
                        break;
                    }
                    if ((pVar3.f120044c & 1024) != 0) {
                        e eVar3 = null;
                        while (pVar3 != null) {
                            if (pVar3 instanceof z) {
                                z zVar2 = (z) pVar3;
                                if (zVar2.f120054m) {
                                    eVar.b(zVar2);
                                }
                            } else if ((pVar3.f120044c & 1024) != 0 && (pVar3 instanceof n)) {
                                int i14 = 0;
                                for (p pVar4 = ((n) pVar3).f110843o; pVar4 != null; pVar4 = pVar4.f120047f) {
                                    if ((pVar4.f120044c & 1024) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            pVar3 = pVar4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new e(new p[16]);
                                            }
                                            if (pVar3 != null) {
                                                eVar3.b(pVar3);
                                                pVar3 = null;
                                            }
                                            eVar3.b(pVar4);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                            pVar3 = c.g(eVar3);
                        }
                    } else {
                        pVar3 = pVar3.f120047f;
                    }
                }
            }
        }
        while (eVar.m() && (h10 = h(eVar, dVar, i13)) != null) {
            if (h10.M0().f140635a) {
                return ((Boolean) function1.invoke(h10)).booleanValue();
            }
            if (n(i13, h10, dVar, function1)) {
                return true;
            }
            eVar.n(h10);
        }
        return false;
    }

    public static final boolean J(z zVar, z zVar2, int i13, Function1 function1) {
        p pVar;
        j1 j1Var;
        if (zVar.N0() != x.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        Object[] objArr = new z[16];
        p pVar2 = zVar.f120042a;
        if (!pVar2.f120054m) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        e eVar = new e(new p[16]);
        p pVar3 = pVar2.f120047f;
        if (pVar3 == null) {
            c.e(eVar, pVar2);
        } else {
            eVar.b(pVar3);
        }
        int i14 = 0;
        while (eVar.m()) {
            p pVar4 = (p) eVar.o(eVar.f78184c - 1);
            if ((pVar4.f120045d & 1024) == 0) {
                c.e(eVar, pVar4);
            } else {
                while (true) {
                    if (pVar4 == null) {
                        break;
                    }
                    if ((pVar4.f120044c & 1024) != 0) {
                        e eVar2 = null;
                        while (pVar4 != null) {
                            if (pVar4 instanceof z) {
                                z zVar3 = (z) pVar4;
                                int i15 = i14 + 1;
                                if (objArr.length < i15) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i15, objArr.length * 2));
                                    Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i14] = zVar3;
                                i14 = i15;
                            } else if ((pVar4.f120044c & 1024) != 0 && (pVar4 instanceof n)) {
                                int i16 = 0;
                                for (p pVar5 = ((n) pVar4).f110843o; pVar5 != null; pVar5 = pVar5.f120047f) {
                                    if ((pVar5.f120044c & 1024) != 0) {
                                        i16++;
                                        if (i16 == 1) {
                                            pVar4 = pVar5;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new e(new p[16]);
                                            }
                                            if (pVar4 != null) {
                                                eVar2.b(pVar4);
                                                pVar4 = null;
                                            }
                                            eVar2.b(pVar5);
                                        }
                                    }
                                }
                                if (i16 == 1) {
                                }
                            }
                            pVar4 = c.g(eVar2);
                        }
                    } else {
                        pVar4 = pVar4.f120047f;
                    }
                }
            }
        }
        e0 comparator = e0.f140614a;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(objArr, 0, i14, comparator);
        if (z2.c.b(i13, 1)) {
            int i17 = new IntRange(0, i14 - 1, 1).f80454b;
            if (i17 >= 0) {
                boolean z13 = false;
                int i18 = 0;
                while (true) {
                    if (z13) {
                        z zVar4 = (z) objArr[i18];
                        if (v(zVar4) && m(zVar4, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.d(objArr[i18], zVar2)) {
                        z13 = true;
                    }
                    if (i18 == i17) {
                        break;
                    }
                    i18++;
                }
            }
        } else {
            if (!z2.c.b(i13, 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
            }
            int i19 = new IntRange(0, i14 - 1, 1).f80454b;
            if (i19 >= 0) {
                boolean z14 = false;
                while (true) {
                    if (z14) {
                        z zVar5 = (z) objArr[i19];
                        if (v(zVar5) && a(zVar5, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.d(objArr[i19], zVar2)) {
                        z14 = true;
                    }
                    if (i19 == 0) {
                        break;
                    }
                    i19--;
                }
            }
        }
        if (!z2.c.b(i13, 1) && zVar.M0().f140635a) {
            p pVar6 = zVar.f120042a;
            if (!pVar6.f120054m) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            p pVar7 = pVar6.f120046e;
            k0 U0 = c.U0(zVar);
            loop5: while (true) {
                if (U0 == null) {
                    pVar = null;
                    break;
                }
                if ((U0.f110837y.f110808e.f120045d & 1024) != 0) {
                    while (pVar7 != null) {
                        if ((pVar7.f120044c & 1024) != 0) {
                            p pVar8 = pVar7;
                            e eVar3 = null;
                            while (pVar8 != null) {
                                if (pVar8 instanceof z) {
                                    pVar = pVar8;
                                    break loop5;
                                }
                                if ((pVar8.f120044c & 1024) != 0 && (pVar8 instanceof n)) {
                                    int i23 = 0;
                                    for (p pVar9 = ((n) pVar8).f110843o; pVar9 != null; pVar9 = pVar9.f120047f) {
                                        if ((pVar9.f120044c & 1024) != 0) {
                                            i23++;
                                            if (i23 == 1) {
                                                pVar8 = pVar9;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new e(new p[16]);
                                                }
                                                if (pVar8 != null) {
                                                    eVar3.b(pVar8);
                                                    pVar8 = null;
                                                }
                                                eVar3.b(pVar9);
                                            }
                                        }
                                    }
                                    if (i23 == 1) {
                                    }
                                }
                                pVar8 = c.g(eVar3);
                            }
                        }
                        pVar7 = pVar7.f120046e;
                    }
                }
                U0 = U0.v();
                pVar7 = (U0 == null || (j1Var = U0.f110837y) == null) ? null : j1Var.f110807d;
            }
            if (pVar != null) {
                return ((Boolean) function1.invoke(zVar)).booleanValue();
            }
        }
        return false;
    }

    public static final Boolean K(int i13, z zVar, a3.d dVar, f fVar) {
        x N0 = zVar.N0();
        int[] iArr = g0.f140618a;
        int i14 = iArr[N0.ordinal()];
        if (i14 != 1) {
            if (i14 == 2 || i14 == 3) {
                return Boolean.valueOf(i(zVar, i13, fVar));
            }
            if (i14 == 4) {
                return zVar.M0().f140635a ? (Boolean) fVar.invoke(zVar) : dVar == null ? Boolean.valueOf(i(zVar, i13, fVar)) : Boolean.valueOf(I(i13, zVar, dVar, fVar));
            }
            throw new NoWhenBranchMatchedException();
        }
        z p13 = p(zVar);
        if (p13 == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        int i15 = iArr[p13.N0().ordinal()];
        if (i15 != 1) {
            if (i15 == 2 || i15 == 3) {
                if (dVar == null) {
                    dVar = j(p13);
                }
                return Boolean.valueOf(n(i13, zVar, dVar, fVar));
            }
            if (i15 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        Boolean K = K(i13, p13, dVar, fVar);
        if (!Intrinsics.d(K, Boolean.FALSE)) {
            return K;
        }
        if (dVar == null) {
            if (p13.N0() != x.ActiveParent) {
                throw new IllegalStateException("Searching for active node in inactive hierarchy".toString());
            }
            z g13 = g(p13);
            if (g13 == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            dVar = j(g13);
        }
        return Boolean.valueOf(n(i13, zVar, dVar, fVar));
    }

    public static final boolean a(z zVar, Function1 function1) {
        x N0 = zVar.N0();
        int[] iArr = f0.f140616a;
        int i13 = iArr[N0.ordinal()];
        if (i13 == 1) {
            z p13 = p(zVar);
            if (p13 == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            int i14 = iArr[p13.N0().ordinal()];
            if (i14 != 1) {
                if (i14 == 2 || i14 == 3) {
                    return o(zVar, p13, 2, function1);
                }
                if (i14 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            if (!a(p13, function1) && !o(zVar, p13, 2, function1) && (!p13.M0().f140635a || !((Boolean) function1.invoke(p13)).booleanValue())) {
                return false;
            }
        } else {
            if (i13 == 2 || i13 == 3) {
                return B(zVar, function1);
            }
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!B(zVar, function1) && (!zVar.M0().f140635a || !((Boolean) function1.invoke(zVar)).booleanValue())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (z2.c.b(r19, 3) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (z2.c.b(r19, 4) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (z2.c.b(r19, 3) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        r1 = r0 - r17.f486c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        r1 = java.lang.Math.max(0.0f, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (z2.c.b(r19, 3) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        r0 = r0 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        if (r1 >= java.lang.Math.max(1.0f, r0)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (z2.c.b(r19, 4) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        r0 = r2 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (z2.c.b(r19, 5) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        r0 = r5 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        if (z2.c.b(r19, 6) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        r0 = r13 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (z2.c.b(r19, 4) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r1 = r17.f484a - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (z2.c.b(r19, 5) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        r1 = r5 - r17.f487d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if (z2.c.b(r19, 6) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        r1 = r17.f485b - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x003f, code lost:
    
        if (r7 <= r14) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r5 >= r13) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0055, code lost:
    
        if (r15 <= r12) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r0 >= r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00be, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(a3.d r16, a3.d r17, a3.d r18, int r19) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.a.b(a3.d, a3.d, a3.d, int):boolean");
    }

    public static final boolean c(int i13, a3.d dVar, a3.d dVar2) {
        if (z2.c.b(i13, 3) || z2.c.b(i13, 4)) {
            if (dVar.f487d <= dVar2.f485b || dVar.f485b >= dVar2.f487d) {
                return false;
            }
        } else {
            if (!z2.c.b(i13, 5) && !z2.c.b(i13, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (dVar.f486c <= dVar2.f484a || dVar.f484a >= dVar2.f486c) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(z zVar, boolean z13, boolean z14) {
        int i13 = b0.f140607b[zVar.N0().ordinal()];
        if (i13 == 1) {
            zVar.R0(x.Inactive);
            if (z14) {
                D(zVar);
            }
        } else {
            if (i13 == 2) {
                if (!z13) {
                    return z13;
                }
                zVar.R0(x.Inactive);
                if (!z14) {
                    return z13;
                }
                D(zVar);
                return z13;
            }
            if (i13 == 3) {
                z p13 = p(zVar);
                if (!(p13 != null ? d(p13, z13, z14) : true)) {
                    return false;
                }
                zVar.R0(x.Inactive);
                if (z14) {
                    D(zVar);
                }
            } else if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    public static final void e(s3.m mVar, e eVar) {
        p pVar = ((p) mVar).f120042a;
        if (!pVar.f120054m) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        e eVar2 = new e(new p[16]);
        p pVar2 = pVar.f120047f;
        if (pVar2 == null) {
            c.e(eVar2, pVar);
        } else {
            eVar2.b(pVar2);
        }
        while (eVar2.m()) {
            p pVar3 = (p) eVar2.o(eVar2.f78184c - 1);
            if ((pVar3.f120045d & 1024) == 0) {
                c.e(eVar2, pVar3);
            } else {
                while (true) {
                    if (pVar3 == null) {
                        break;
                    }
                    if ((pVar3.f120044c & 1024) != 0) {
                        e eVar3 = null;
                        while (pVar3 != null) {
                            if (pVar3 instanceof z) {
                                z zVar = (z) pVar3;
                                if (zVar.f120054m && !c.U0(zVar).I) {
                                    if (zVar.M0().f140635a) {
                                        eVar.b(zVar);
                                    } else {
                                        e(zVar, eVar);
                                    }
                                }
                            } else if ((pVar3.f120044c & 1024) != 0 && (pVar3 instanceof n)) {
                                int i13 = 0;
                                for (p pVar4 = ((n) pVar3).f110843o; pVar4 != null; pVar4 = pVar4.f120047f) {
                                    if ((pVar4.f120044c & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            pVar3 = pVar4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new e(new p[16]);
                                            }
                                            if (pVar3 != null) {
                                                eVar3.b(pVar3);
                                                pVar3 = null;
                                            }
                                            eVar3.b(pVar4);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            pVar3 = c.g(eVar3);
                        }
                    } else {
                        pVar3 = pVar3.f120047f;
                    }
                }
            }
        }
    }

    public static final s f(z zVar, int i13, k kVar) {
        s sVar;
        o M0 = zVar.M0();
        if (z2.c.b(i13, 1)) {
            return M0.f140636b;
        }
        if (z2.c.b(i13, 2)) {
            return M0.f140637c;
        }
        if (z2.c.b(i13, 5)) {
            return M0.f140638d;
        }
        if (z2.c.b(i13, 6)) {
            return M0.f140639e;
        }
        if (z2.c.b(i13, 3)) {
            int i14 = d0.f140611a[kVar.ordinal()];
            if (i14 == 1) {
                sVar = M0.f140642h;
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                sVar = M0.f140643i;
            }
            if (sVar == s.f140648b) {
                sVar = null;
            }
            if (sVar == null) {
                return M0.f140640f;
            }
        } else {
            if (!z2.c.b(i13, 4)) {
                if (z2.c.b(i13, 7)) {
                    return (s) M0.f140644j.invoke(new z2.c(i13));
                }
                if (z2.c.b(i13, 8)) {
                    return (s) M0.f140645k.invoke(new z2.c(i13));
                }
                throw new IllegalStateException("invalid FocusDirection".toString());
            }
            int i15 = d0.f140611a[kVar.ordinal()];
            if (i15 == 1) {
                sVar = M0.f140643i;
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                sVar = M0.f140642h;
            }
            if (sVar == s.f140648b) {
                sVar = null;
            }
            if (sVar == null) {
                return M0.f140641g;
            }
        }
        return sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x003a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final z2.z g(z2.z r8) {
        /*
            z2.x r0 = r8.N0()
            int[] r1 = z2.d0.f140612b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto Lb7
            r2 = 2
            r3 = 0
            if (r0 == r2) goto L20
            r1 = 3
            if (r0 == r1) goto Lb7
            r8 = 4
            if (r0 != r8) goto L1a
            return r3
        L1a:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L20:
            u2.p r8 = r8.f120042a
            boolean r0 = r8.f120054m
            if (r0 == 0) goto Laa
            k2.e r0 = new k2.e
            r2 = 16
            u2.p[] r4 = new u2.p[r2]
            r0.<init>(r4)
            u2.p r4 = r8.f120047f
            if (r4 != 0) goto L37
            com.bumptech.glide.c.e(r0, r8)
            goto L3a
        L37:
            r0.b(r4)
        L3a:
            boolean r8 = r0.m()
            if (r8 == 0) goto La9
            int r8 = r0.f78184c
            int r8 = r8 - r1
            java.lang.Object r8 = r0.o(r8)
            u2.p r8 = (u2.p) r8
            int r4 = r8.f120045d
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L53
            com.bumptech.glide.c.e(r0, r8)
            goto L3a
        L53:
            if (r8 == 0) goto L3a
            int r4 = r8.f120044c
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La6
            r4 = r3
        L5c:
            if (r8 == 0) goto L3a
            boolean r5 = r8 instanceof z2.z
            if (r5 == 0) goto L6b
            z2.z r8 = (z2.z) r8
            z2.z r8 = g(r8)
            if (r8 == 0) goto La1
            return r8
        L6b:
            int r5 = r8.f120044c
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto La1
            boolean r5 = r8 instanceof s3.n
            if (r5 == 0) goto La1
            r5 = r8
            s3.n r5 = (s3.n) r5
            u2.p r5 = r5.f110843o
            r6 = 0
        L7b:
            if (r5 == 0) goto L9e
            int r7 = r5.f120044c
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L9b
            int r6 = r6 + 1
            if (r6 != r1) goto L89
            r8 = r5
            goto L9b
        L89:
            if (r4 != 0) goto L92
            k2.e r4 = new k2.e
            u2.p[] r7 = new u2.p[r2]
            r4.<init>(r7)
        L92:
            if (r8 == 0) goto L98
            r4.b(r8)
            r8 = r3
        L98:
            r4.b(r5)
        L9b:
            u2.p r5 = r5.f120047f
            goto L7b
        L9e:
            if (r6 != r1) goto La1
            goto L5c
        La1:
            u2.p r8 = com.bumptech.glide.c.g(r4)
            goto L5c
        La6:
            u2.p r8 = r8.f120047f
            goto L53
        La9:
            return r3
        Laa:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        Lb7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.a.g(z2.z):z2.z");
    }

    public static final z h(e eVar, a3.d dVar, int i13) {
        a3.d g13;
        if (z2.c.b(i13, 3)) {
            g13 = dVar.g(dVar.d() + 1, 0.0f);
        } else if (z2.c.b(i13, 4)) {
            g13 = dVar.g(-(dVar.d() + 1), 0.0f);
        } else if (z2.c.b(i13, 5)) {
            g13 = dVar.g(0.0f, dVar.c() + 1);
        } else {
            if (!z2.c.b(i13, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            g13 = dVar.g(0.0f, -(dVar.c() + 1));
        }
        int i14 = eVar.f78184c;
        z zVar = null;
        if (i14 > 0) {
            Object[] objArr = eVar.f78182a;
            int i15 = 0;
            do {
                z zVar2 = (z) objArr[i15];
                if (v(zVar2)) {
                    a3.d j13 = j(zVar2);
                    if (t(i13, j13, dVar) && (!t(i13, g13, dVar) || b(dVar, j13, g13, i13) || (!b(dVar, g13, j13, i13) && u(i13, dVar, j13) < u(i13, dVar, g13)))) {
                        zVar = zVar2;
                        g13 = j13;
                    }
                }
                i15++;
            } while (i15 < i14);
        }
        return zVar;
    }

    public static final boolean i(z zVar, int i13, Function1 function1) {
        a3.d dVar;
        e eVar = new e(new z[16]);
        e(zVar, eVar);
        if (eVar.f78184c <= 1) {
            z zVar2 = (z) (eVar.l() ? null : eVar.f78182a[0]);
            if (zVar2 != null) {
                return ((Boolean) function1.invoke(zVar2)).booleanValue();
            }
            return false;
        }
        if (z2.c.b(i13, 7)) {
            i13 = 4;
        }
        if (z2.c.b(i13, 4) || z2.c.b(i13, 6)) {
            a3.d j13 = j(zVar);
            float f13 = j13.f485b;
            float f14 = j13.f484a;
            dVar = new a3.d(f14, f13, f14, f13);
        } else {
            if (!z2.c.b(i13, 3) && !z2.c.b(i13, 5)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            a3.d j14 = j(zVar);
            float f15 = j14.f487d;
            float f16 = j14.f486c;
            dVar = new a3.d(f16, f15, f16, f15);
        }
        z h10 = h(eVar, dVar, i13);
        if (h10 != null) {
            return ((Boolean) function1.invoke(h10)).booleanValue();
        }
        return false;
    }

    public static final a3.d j(z zVar) {
        q1 q1Var = zVar.f120049h;
        return q1Var != null ? androidx.compose.ui.layout.b.e(q1Var).J(q1Var, false) : a3.d.f483e;
    }

    public static final q k(q qVar, s sVar) {
        return qVar.j(new FocusRequesterElement(sVar));
    }

    public static final Boolean l(z zVar, int i13, k kVar, a3.d dVar, f fVar) {
        boolean a13;
        j1 j1Var;
        if (z2.c.b(i13, 1) || z2.c.b(i13, 2)) {
            if (z2.c.b(i13, 1)) {
                a13 = m(zVar, fVar);
            } else {
                if (!z2.c.b(i13, 2)) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                }
                a13 = a(zVar, fVar);
            }
            return Boolean.valueOf(a13);
        }
        int i14 = 3;
        if (z2.c.b(i13, 3) || z2.c.b(i13, 4) || z2.c.b(i13, 5) || z2.c.b(i13, 6)) {
            return K(i13, zVar, dVar, fVar);
        }
        z zVar2 = null;
        if (z2.c.b(i13, 7)) {
            int i15 = d0.f140611a[kVar.ordinal()];
            if (i15 == 1) {
                i14 = 4;
            } else if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z g13 = g(zVar);
            if (g13 != null) {
                return K(i14, g13, dVar, fVar);
            }
            return null;
        }
        if (!z2.c.b(i13, 8)) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) z2.c.c(i13))).toString());
        }
        z g14 = g(zVar);
        boolean z13 = false;
        if (g14 != null) {
            p pVar = g14.f120042a;
            if (!pVar.f120054m) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            p pVar2 = pVar.f120046e;
            k0 U0 = c.U0(g14);
            loop0: while (true) {
                if (U0 == null) {
                    break;
                }
                if ((U0.f110837y.f110808e.f120045d & 1024) != 0) {
                    while (pVar2 != null) {
                        if ((pVar2.f120044c & 1024) != 0) {
                            p pVar3 = pVar2;
                            e eVar = null;
                            while (pVar3 != null) {
                                if (pVar3 instanceof z) {
                                    z zVar3 = (z) pVar3;
                                    if (zVar3.M0().f140635a) {
                                        zVar2 = zVar3;
                                        break loop0;
                                    }
                                } else if ((pVar3.f120044c & 1024) != 0 && (pVar3 instanceof n)) {
                                    int i16 = 0;
                                    for (p pVar4 = ((n) pVar3).f110843o; pVar4 != null; pVar4 = pVar4.f120047f) {
                                        if ((pVar4.f120044c & 1024) != 0) {
                                            i16++;
                                            if (i16 == 1) {
                                                pVar3 = pVar4;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new e(new p[16]);
                                                }
                                                if (pVar3 != null) {
                                                    eVar.b(pVar3);
                                                    pVar3 = null;
                                                }
                                                eVar.b(pVar4);
                                            }
                                        }
                                    }
                                    if (i16 == 1) {
                                    }
                                }
                                pVar3 = c.g(eVar);
                            }
                        }
                        pVar2 = pVar2.f120046e;
                    }
                }
                U0 = U0.v();
                pVar2 = (U0 == null || (j1Var = U0.f110837y) == null) ? null : j1Var.f110807d;
            }
        }
        if (zVar2 != null && !Intrinsics.d(zVar2, zVar)) {
            z13 = ((Boolean) fVar.invoke(zVar2)).booleanValue();
        }
        return Boolean.valueOf(z13);
    }

    public static final boolean m(z zVar, Function1 function1) {
        int i13 = f0.f140616a[zVar.N0().ordinal()];
        if (i13 == 1) {
            z p13 = p(zVar);
            if (p13 != null) {
                return m(p13, function1) || o(zVar, p13, 1, function1);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        if (i13 == 2 || i13 == 3) {
            return C(zVar, function1);
        }
        if (i13 == 4) {
            return zVar.M0().f140635a ? ((Boolean) function1.invoke(zVar)).booleanValue() : C(zVar, function1);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean n(int i13, z zVar, a3.d dVar, Function1 function1) {
        if (I(i13, zVar, dVar, function1)) {
            return true;
        }
        Boolean bool = (Boolean) H(zVar, i13, new z0(zVar, dVar, i13, function1, 3));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean o(z zVar, z zVar2, int i13, Function1 function1) {
        if (J(zVar, zVar2, i13, function1)) {
            return true;
        }
        Boolean bool = (Boolean) H(zVar, i13, new z0(zVar, zVar2, i13, function1, 2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x001e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final z2.z p(z2.z r8) {
        /*
            u2.p r8 = r8.f120042a
            boolean r0 = r8.f120054m
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r0 == 0) goto La4
            k2.e r0 = new k2.e
            r2 = 16
            u2.p[] r3 = new u2.p[r2]
            r0.<init>(r3)
            u2.p r3 = r8.f120047f
            if (r3 != 0) goto L1b
            com.bumptech.glide.c.e(r0, r8)
            goto L1e
        L1b:
            r0.b(r3)
        L1e:
            boolean r8 = r0.m()
            if (r8 == 0) goto La3
            int r8 = r0.f78184c
            r3 = 1
            int r8 = r8 - r3
            java.lang.Object r8 = r0.o(r8)
            u2.p r8 = (u2.p) r8
            int r4 = r8.f120045d
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L38
            com.bumptech.glide.c.e(r0, r8)
            goto L1e
        L38:
            if (r8 == 0) goto L1e
            int r4 = r8.f120044c
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La0
            r4 = r1
        L41:
            if (r8 == 0) goto L1e
            boolean r5 = r8 instanceof z2.z
            if (r5 == 0) goto L65
            z2.z r8 = (z2.z) r8
            u2.p r5 = r8.f120042a
            boolean r5 = r5.f120054m
            if (r5 == 0) goto L9b
            z2.x r5 = r8.N0()
            int[] r6 = z2.d0.f140612b
            int r5 = r5.ordinal()
            r5 = r6[r5]
            if (r5 == r3) goto L64
            r6 = 2
            if (r5 == r6) goto L64
            r6 = 3
            if (r5 == r6) goto L64
            goto L9b
        L64:
            return r8
        L65:
            int r5 = r8.f120044c
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L9b
            boolean r5 = r8 instanceof s3.n
            if (r5 == 0) goto L9b
            r5 = r8
            s3.n r5 = (s3.n) r5
            u2.p r5 = r5.f110843o
            r6 = 0
        L75:
            if (r5 == 0) goto L98
            int r7 = r5.f120044c
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L95
            int r6 = r6 + 1
            if (r6 != r3) goto L83
            r8 = r5
            goto L95
        L83:
            if (r4 != 0) goto L8c
            k2.e r4 = new k2.e
            u2.p[] r7 = new u2.p[r2]
            r4.<init>(r7)
        L8c:
            if (r8 == 0) goto L92
            r4.b(r8)
            r8 = r1
        L92:
            r4.b(r5)
        L95:
            u2.p r5 = r5.f120047f
            goto L75
        L98:
            if (r6 != r3) goto L9b
            goto L41
        L9b:
            u2.p r8 = com.bumptech.glide.c.g(r4)
            goto L41
        La0:
            u2.p r8 = r8.f120047f
            goto L38
        La3:
            return r1
        La4:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.a.p(z2.z):z2.z");
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x007a, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final z2.x q(z2.d r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.a.q(z2.d):z2.x");
    }

    public static final void r(z zVar) {
        c.L0(zVar, new z2.c0(zVar, 0));
        int i13 = b0.f140607b[zVar.N0().ordinal()];
        if (i13 == 3 || i13 == 4) {
            zVar.R0(x.Active);
        }
    }

    public static final boolean s(int i13) {
        if (z2.c.b(i13, 1)) {
            return true;
        }
        return z2.c.b(i13, 2);
    }

    public static final boolean t(int i13, a3.d dVar, a3.d dVar2) {
        boolean b13 = z2.c.b(i13, 3);
        float f13 = dVar.f484a;
        float f14 = dVar.f486c;
        if (b13) {
            float f15 = dVar2.f486c;
            float f16 = dVar2.f484a;
            if ((f15 <= f14 && f16 < f14) || f16 <= f13) {
                return false;
            }
        } else if (z2.c.b(i13, 4)) {
            float f17 = dVar2.f484a;
            float f18 = dVar2.f486c;
            if ((f17 >= f13 && f18 > f13) || f18 >= f14) {
                return false;
            }
        } else {
            boolean b14 = z2.c.b(i13, 5);
            float f19 = dVar.f485b;
            float f23 = dVar.f487d;
            if (b14) {
                float f24 = dVar2.f487d;
                float f25 = dVar2.f485b;
                if ((f24 <= f23 && f25 < f23) || f25 <= f19) {
                    return false;
                }
            } else {
                if (!z2.c.b(i13, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                float f26 = dVar2.f485b;
                float f27 = dVar2.f487d;
                if ((f26 >= f19 && f27 > f19) || f27 >= f23) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final long u(int i13, a3.d dVar, a3.d dVar2) {
        float f13;
        float f14;
        float f15;
        float c13;
        float c14;
        boolean b13 = z2.c.b(i13, 3);
        float f16 = dVar2.f485b;
        float f17 = dVar2.f484a;
        if (!b13) {
            if (z2.c.b(i13, 4)) {
                f13 = f17 - dVar.f486c;
            } else if (z2.c.b(i13, 5)) {
                f14 = dVar.f485b;
                f15 = dVar2.f487d;
            } else {
                if (!z2.c.b(i13, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                f13 = f16 - dVar.f487d;
            }
            long abs = (long) Math.abs(Math.max(0.0f, f13));
            if (z2.c.b(i13, 3) || z2.c.b(i13, 4)) {
                float f18 = 2;
                c13 = (dVar.c() / f18) + dVar.f485b;
                c14 = (dVar2.c() / f18) + f16;
            } else {
                if (!z2.c.b(i13, 5) && !z2.c.b(i13, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                float f19 = 2;
                c13 = (dVar.d() / f19) + dVar.f484a;
                c14 = (dVar2.d() / f19) + f17;
            }
            long abs2 = (long) Math.abs(c13 - c14);
            return (abs2 * abs2) + (13 * abs * abs);
        }
        f14 = dVar.f484a;
        f15 = dVar2.f486c;
        f13 = f14 - f15;
        long abs3 = (long) Math.abs(Math.max(0.0f, f13));
        if (z2.c.b(i13, 3)) {
            if (!z2.c.b(i13, 5)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            float f192 = 2;
            c13 = (dVar.d() / f192) + dVar.f484a;
            c14 = (dVar2.d() / f192) + f17;
            long abs22 = (long) Math.abs(c13 - c14);
            return (abs22 * abs22) + (13 * abs3 * abs3);
        }
        float f182 = 2;
        c13 = (dVar.c() / f182) + dVar.f485b;
        c14 = (dVar2.c() / f182) + f16;
        long abs222 = (long) Math.abs(c13 - c14);
        return (abs222 * abs222) + (13 * abs3 * abs3);
    }

    public static final boolean v(z zVar) {
        k0 k0Var;
        q1 q1Var;
        k0 k0Var2;
        q1 q1Var2 = zVar.f120049h;
        return (q1Var2 == null || (k0Var = q1Var2.f110898l) == null || !k0Var.H() || (q1Var = zVar.f120049h) == null || (k0Var2 = q1Var.f110898l) == null || !k0Var2.G()) ? false : true;
    }

    public static final q w(q qVar, Function1 function1) {
        return qVar.j(new FocusChangedElement(function1));
    }

    public static final z2.a x(z zVar, int i13) {
        int i14 = b0.f140607b[zVar.N0().ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                return z2.a.Cancelled;
            }
            if (i14 == 3) {
                z p13 = p(zVar);
                if (p13 == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child".toString());
                }
                z2.a x13 = x(p13, i13);
                z2.a aVar = z2.a.None;
                if (x13 == aVar) {
                    x13 = null;
                }
                if (x13 != null) {
                    return x13;
                }
                if (!zVar.f140654n) {
                    zVar.f140654n = true;
                    try {
                        s sVar = (s) zVar.M0().f140645k.invoke(new z2.c(i13));
                        if (sVar != s.f140648b) {
                            if (sVar == s.f140649c) {
                                aVar = z2.a.Cancelled;
                            } else {
                                aVar = sVar.a(z2.m.f140632l) ? z2.a.Redirected : z2.a.RedirectCancelled;
                            }
                        }
                    } finally {
                        zVar.f140654n = false;
                    }
                }
                return aVar;
            }
            if (i14 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return z2.a.None;
    }

    public static final z2.a y(z zVar, int i13) {
        if (!zVar.f140655o) {
            zVar.f140655o = true;
            try {
                s sVar = (s) zVar.M0().f140644j.invoke(new z2.c(i13));
                if (sVar != s.f140648b) {
                    if (sVar == s.f140649c) {
                        return z2.a.Cancelled;
                    }
                    return sVar.a(z2.m.f140632l) ? z2.a.Redirected : z2.a.RedirectCancelled;
                }
            } finally {
                zVar.f140655o = false;
            }
        }
        return z2.a.None;
    }

    public static final z2.a z(z zVar, int i13) {
        p pVar;
        j1 j1Var;
        int i14 = b0.f140607b[zVar.N0().ordinal()];
        if (i14 == 1 || i14 == 2) {
            return z2.a.None;
        }
        if (i14 == 3) {
            z p13 = p(zVar);
            if (p13 != null) {
                return x(p13, i13);
            }
            throw new IllegalArgumentException("ActiveParent with no focused child".toString());
        }
        if (i14 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        p pVar2 = zVar.f120042a;
        if (!pVar2.f120054m) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        p pVar3 = pVar2.f120046e;
        k0 U0 = c.U0(zVar);
        loop0: while (true) {
            if (U0 == null) {
                pVar = null;
                break;
            }
            if ((U0.f110837y.f110808e.f120045d & 1024) != 0) {
                while (pVar3 != null) {
                    if ((pVar3.f120044c & 1024) != 0) {
                        pVar = pVar3;
                        e eVar = null;
                        while (pVar != null) {
                            if (pVar instanceof z) {
                                break loop0;
                            }
                            if ((pVar.f120044c & 1024) != 0 && (pVar instanceof n)) {
                                int i15 = 0;
                                for (p pVar4 = ((n) pVar).f110843o; pVar4 != null; pVar4 = pVar4.f120047f) {
                                    if ((pVar4.f120044c & 1024) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            pVar = pVar4;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new e(new p[16]);
                                            }
                                            if (pVar != null) {
                                                eVar.b(pVar);
                                                pVar = null;
                                            }
                                            eVar.b(pVar4);
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                            pVar = c.g(eVar);
                        }
                    }
                    pVar3 = pVar3.f120046e;
                }
            }
            U0 = U0.v();
            pVar3 = (U0 == null || (j1Var = U0.f110837y) == null) ? null : j1Var.f110807d;
        }
        z zVar2 = (z) pVar;
        if (zVar2 == null) {
            return z2.a.None;
        }
        int i16 = b0.f140607b[zVar2.N0().ordinal()];
        if (i16 == 1) {
            return y(zVar2, i13);
        }
        if (i16 == 2) {
            return z2.a.Cancelled;
        }
        if (i16 == 3) {
            return z(zVar2, i13);
        }
        if (i16 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        z2.a z13 = z(zVar2, i13);
        z2.a aVar = z13 != z2.a.None ? z13 : null;
        return aVar == null ? y(zVar2, i13) : aVar;
    }
}
