package z2;

import k1.v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import s3.a2;
import s3.j1;
import s3.k0;
import s3.q1;
import s3.u1;

/* loaded from: classes.dex */
public final class z extends u2.p implements s3.l, u1, r3.f {

    /* renamed from: n, reason: collision with root package name */
    public boolean f140654n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f140655o;

    /* renamed from: p, reason: collision with root package name */
    public x f140656p;

    public static final boolean O0(z zVar) {
        u2.p pVar = zVar.f120042a;
        if (!pVar.f120054m) {
            jk.r.y("visitSubtreeIf called on an unattached node");
            throw null;
        }
        k2.e eVar = new k2.e(new u2.p[16]);
        u2.p pVar2 = pVar.f120047f;
        if (pVar2 == null) {
            com.bumptech.glide.c.e(eVar, pVar);
        } else {
            eVar.b(pVar2);
        }
        while (eVar.m()) {
            u2.p pVar3 = (u2.p) eVar.o(eVar.f78184c - 1);
            if ((pVar3.f120045d & 1024) != 0) {
                for (u2.p pVar4 = pVar3; pVar4 != null; pVar4 = pVar4.f120047f) {
                    if ((pVar4.f120044c & 1024) != 0) {
                        k2.e eVar2 = null;
                        u2.p pVar5 = pVar4;
                        while (pVar5 != null) {
                            if (pVar5 instanceof z) {
                                z zVar2 = (z) pVar5;
                                if (zVar2.f140656p != null) {
                                    int i13 = y.f140653a[zVar2.N0().ordinal()];
                                    if (i13 == 1 || i13 == 2 || i13 == 3) {
                                        return true;
                                    }
                                    if (i13 == 4) {
                                        return false;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if ((pVar5.f120044c & 1024) != 0 && (pVar5 instanceof s3.n)) {
                                int i14 = 0;
                                for (u2.p pVar6 = ((s3.n) pVar5).f110843o; pVar6 != null; pVar6 = pVar6.f120047f) {
                                    if ((pVar6.f120044c & 1024) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            pVar5 = pVar6;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new k2.e(new u2.p[16]);
                                            }
                                            if (pVar5 != null) {
                                                eVar2.b(pVar5);
                                                pVar5 = null;
                                            }
                                            eVar2.b(pVar6);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                            pVar5 = com.bumptech.glide.c.g(eVar2);
                        }
                    }
                }
            }
            com.bumptech.glide.c.e(eVar, pVar3);
        }
        return false;
    }

    public static final boolean P0(z zVar) {
        j1 j1Var;
        u2.p pVar = zVar.f120042a;
        if (!pVar.f120054m) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        u2.p pVar2 = pVar.f120046e;
        k0 U0 = com.bumptech.glide.c.U0(zVar);
        while (U0 != null) {
            if ((U0.f110837y.f110808e.f120045d & 1024) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f120044c & 1024) != 0) {
                        u2.p pVar3 = pVar2;
                        k2.e eVar = null;
                        while (pVar3 != null) {
                            if (pVar3 instanceof z) {
                                z zVar2 = (z) pVar3;
                                if (zVar2.f140656p != null) {
                                    int i13 = y.f140653a[zVar2.N0().ordinal()];
                                    if (i13 == 1 || i13 == 2) {
                                        return false;
                                    }
                                    if (i13 == 3) {
                                        return true;
                                    }
                                    if (i13 == 4) {
                                        return false;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if ((pVar3.f120044c & 1024) != 0 && (pVar3 instanceof s3.n)) {
                                int i14 = 0;
                                for (u2.p pVar4 = ((s3.n) pVar3).f110843o; pVar4 != null; pVar4 = pVar4.f120047f) {
                                    if ((pVar4.f120044c & 1024) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            pVar3 = pVar4;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new k2.e(new u2.p[16]);
                                            }
                                            if (pVar3 != null) {
                                                eVar.b(pVar3);
                                                pVar3 = null;
                                            }
                                            eVar.b(pVar4);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                            pVar3 = com.bumptech.glide.c.g(eVar);
                        }
                    }
                    pVar2 = pVar2.f120046e;
                }
            }
            U0 = U0.v();
            pVar2 = (U0 == null || (j1Var = U0.f110837y) == null) ? null : j1Var.f110807d;
        }
        return false;
    }

    @Override // u2.p
    public final boolean A0() {
        return false;
    }

    @Override // u2.p
    public final void E0() {
        int i13 = y.f140653a[N0().ordinal()];
        if (i13 == 1 || i13 == 2) {
            ((t3.c0) com.bumptech.glide.c.V0(this)).f115877e.b(8, true, false);
            nl.b.g(this);
        } else if (i13 == 3) {
            a0 i14 = nl.b.i(this);
            try {
                if (i14.f140603c) {
                    a0.a(i14);
                }
                i14.f140603c = true;
                R0(x.Inactive);
                Unit unit = Unit.f80348a;
                a0.b(i14);
            } catch (Throwable th3) {
                a0.b(i14);
                throw th3;
            }
        }
        this.f140656p = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [k2.e] */
    public final o M0() {
        j1 j1Var;
        o oVar = new o();
        u2.p pVar = this.f120042a;
        if (!pVar.f120054m) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        k0 U0 = com.bumptech.glide.c.U0(this);
        u2.p pVar2 = pVar;
        loop0: while (U0 != null) {
            if ((U0.f110837y.f110808e.f120045d & 3072) != 0) {
                while (pVar2 != null) {
                    int i13 = pVar2.f120044c;
                    if ((i13 & 3072) != 0) {
                        if (pVar2 != pVar && (i13 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i13 & 2048) != 0) {
                            s3.n nVar = pVar2;
                            ?? r63 = 0;
                            while (nVar != 0) {
                                if (nVar instanceof q) {
                                    ((q) nVar).Z(oVar);
                                } else if ((nVar.f120044c & 2048) != 0 && (nVar instanceof s3.n)) {
                                    u2.p pVar3 = nVar.f110843o;
                                    int i14 = 0;
                                    nVar = nVar;
                                    r63 = r63;
                                    while (pVar3 != null) {
                                        if ((pVar3.f120044c & 2048) != 0) {
                                            i14++;
                                            r63 = r63;
                                            if (i14 == 1) {
                                                nVar = pVar3;
                                            } else {
                                                if (r63 == 0) {
                                                    r63 = new k2.e(new u2.p[16]);
                                                }
                                                if (nVar != 0) {
                                                    r63.b(nVar);
                                                    nVar = 0;
                                                }
                                                r63.b(pVar3);
                                            }
                                        }
                                        pVar3 = pVar3.f120047f;
                                        nVar = nVar;
                                        r63 = r63;
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                nVar = com.bumptech.glide.c.g(r63);
                            }
                        }
                    }
                    pVar2 = pVar2.f120046e;
                }
            }
            U0 = U0.v();
            pVar2 = (U0 == null || (j1Var = U0.f110837y) == null) ? null : j1Var.f110807d;
        }
        return oVar;
    }

    public final x N0() {
        x xVar;
        k0 k0Var;
        a2 a2Var;
        androidx.compose.ui.focus.b bVar;
        q1 q1Var = this.f120042a.f120049h;
        a0 a0Var = (q1Var == null || (k0Var = q1Var.f110898l) == null || (a2Var = k0Var.f110821i) == null || (bVar = ((t3.c0) a2Var).f115877e) == null) ? null : bVar.f17411h;
        if (a0Var != null && (xVar = (x) a0Var.f140601a.g(this)) != null) {
            return xVar;
        }
        x xVar2 = this.f140656p;
        return xVar2 == null ? x.Inactive : xVar2;
    }

    @Override // s3.u1
    public final void P() {
        x N0 = N0();
        Q0();
        if (N0 != N0()) {
            androidx.compose.ui.focus.a.D(this);
        }
    }

    public final void Q0() {
        x xVar = this.f140656p;
        if (xVar == null) {
            if (!(!(xVar != null))) {
                throw new IllegalStateException("Re-initializing focus target node.".toString());
            }
            a0 i13 = nl.b.i(this);
            try {
                if (i13.f140603c) {
                    a0.a(i13);
                }
                i13.f140603c = true;
                R0((P0(this) && O0(this)) ? x.ActiveParent : x.Inactive);
                Unit unit = Unit.f80348a;
                a0.b(i13);
            } catch (Throwable th3) {
                a0.b(i13);
                throw th3;
            }
        }
        int i14 = y.f140653a[N0().ordinal()];
        if (i14 == 1 || i14 == 2) {
            j0 j0Var = new j0();
            com.bumptech.glide.c.L0(this, new v0(10, j0Var, this));
            Object obj = j0Var.f80434a;
            if (obj == null) {
                Intrinsics.r("focusProperties");
                throw null;
            }
            if (((n) obj).c()) {
                return;
            }
            ((t3.c0) com.bumptech.glide.c.V0(this)).f115877e.a(true);
        }
    }

    public final void R0(x xVar) {
        a0 i13 = nl.b.i(this);
        if (xVar != null) {
            i13.f140601a.l(this, xVar);
        } else {
            i13.getClass();
            jk.r.z("requires a non-null focus state");
            throw null;
        }
    }
}
