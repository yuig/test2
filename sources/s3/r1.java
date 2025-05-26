package s3;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g1.z f110915a;

    static {
        g1.z zVar = g1.h0.f63270a;
        f110915a = new g1.z();
    }

    public static final void a(u2.p pVar) {
        if (pVar.f120054m) {
            b(pVar, -1, 1);
        } else {
            jk.r.y("autoInvalidateInsertedNode called on unattached node");
            throw null;
        }
    }

    public static final void b(u2.p pVar, int i13, int i14) {
        if (!(pVar instanceof n)) {
            c(pVar, i13 & pVar.f120044c, i14);
            return;
        }
        n nVar = (n) pVar;
        c(pVar, nVar.f110842n & i13, i14);
        int i15 = (~nVar.f110842n) & i13;
        for (u2.p pVar2 = nVar.f110843o; pVar2 != null; pVar2 = pVar2.f120047f) {
            b(pVar2, i15, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(u2.p pVar, int i13, int i14) {
        if (i14 != 0 || pVar.A0()) {
            if ((i13 & 2) != 0 && (pVar instanceof c0)) {
                com.bumptech.glide.c.l0((c0) pVar);
                if (i14 == 2) {
                    q1 S0 = com.bumptech.glide.c.S0(pVar, 2);
                    S0.f110902p = true;
                    S0.C.invoke();
                    if (S0.E != null) {
                        if (S0.F != null) {
                            S0.F = null;
                        }
                        S0.t1(null, false);
                        S0.f110898l.W(false);
                    }
                }
            }
            if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 && (pVar instanceof a0) && i14 != 2) {
                com.bumptech.glide.c.U0(pVar).D();
            }
            if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 && (pVar instanceof s) && i14 != 2) {
                k0 U0 = com.bumptech.glide.c.U0(pVar);
                v0 v0Var = U0.f110838z;
                if (!v0Var.f110971e && !v0Var.f110970d && !U0.H) {
                    t3.c0 c0Var = (t3.c0) n0.a(U0);
                    c0Var.G.f110761e.f110998a.b(U0);
                    U0.H = true;
                    c0Var.F(null);
                }
            }
            if ((i13 & 4) != 0 && (pVar instanceof r)) {
                com.bumptech.glide.c.k0((r) pVar);
            }
            if ((i13 & 8) != 0 && (pVar instanceof g2)) {
                com.bumptech.glide.c.m0((g2) pVar);
            }
            if ((i13 & 64) != 0 && (pVar instanceof d2)) {
                v0 v0Var2 = com.bumptech.glide.c.U0((d2) pVar).f110838z;
                v0Var2.f110984r.f110946q = true;
                q0 q0Var = v0Var2.f110985s;
                if (q0Var != null) {
                    q0Var.D0();
                }
            }
            if ((i13 & 1024) != 0 && (pVar instanceof z2.z) && i14 != 2) {
                nl.b.g((z2.z) pVar);
            }
            if ((i13 & 2048) != 0 && (pVar instanceof z2.q)) {
                z2.q qVar = (z2.q) pVar;
                g.f110775b = null;
                qVar.Z(g.f110774a);
                if (g.f110775b != null) {
                    if (i14 == 2) {
                        i(qVar);
                    } else {
                        z2.h hVar = ((t3.c0) com.bumptech.glide.c.V0(qVar)).f115877e.f17410g;
                        hVar.b(hVar.f140623e, qVar);
                    }
                }
            }
            if ((i13 & 4096) == 0 || !(pVar instanceof z2.d)) {
                return;
            }
            z2.d dVar = (z2.d) pVar;
            z2.h hVar2 = ((t3.c0) com.bumptech.glide.c.V0(dVar)).f115877e.f17410g;
            hVar2.b(hVar2.f140622d, dVar);
        }
    }

    public static final void d(u2.p pVar) {
        if (pVar.f120054m) {
            b(pVar, -1, 0);
        } else {
            jk.r.y("autoInvalidateUpdatedNode called on unattached node");
            throw null;
        }
    }

    public static final int e(u2.o oVar) {
        int i13 = oVar instanceof q3.a0 ? 3 : 1;
        if (oVar instanceof y2.f) {
            i13 |= 4;
        }
        if (oVar instanceof z3.k) {
            i13 |= 8;
        }
        if (oVar instanceof n3.v) {
            i13 |= 16;
        }
        if ((oVar instanceof r3.d) || (oVar instanceof r3.g)) {
            i13 |= 32;
        }
        if (oVar instanceof q3.w0) {
            i13 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
        }
        return oVar instanceof q3.z0 ? i13 | 64 : i13;
    }

    public static final int f(u2.p pVar) {
        int i13 = pVar.f120044c;
        if (i13 != 0) {
            return i13;
        }
        Class<?> cls = pVar.getClass();
        g1.z zVar = f110915a;
        int e13 = zVar.e(cls);
        if (e13 >= 0) {
            return zVar.f63355c[e13];
        }
        int i14 = pVar instanceof c0 ? 3 : 1;
        if (pVar instanceof r) {
            i14 |= 4;
        }
        if (pVar instanceof g2) {
            i14 |= 8;
        }
        if (pVar instanceof f2) {
            i14 |= 16;
        }
        if (pVar instanceof r3.f) {
            i14 |= 32;
        }
        if (pVar instanceof d2) {
            i14 |= 64;
        }
        if (pVar instanceof a0) {
            i14 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if (pVar instanceof s) {
            i14 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
        }
        if (pVar instanceof z2.z) {
            i14 |= 1024;
        }
        if (pVar instanceof z2.q) {
            i14 |= 2048;
        }
        if (pVar instanceof z2.d) {
            i14 |= 4096;
        }
        if (pVar instanceof l3.d) {
            i14 |= 8192;
        }
        if (pVar instanceof p3.a) {
            i14 |= 16384;
        }
        if (pVar instanceof l) {
            i14 |= 32768;
        }
        int i15 = pVar instanceof j2 ? 262144 | i14 : i14;
        zVar.i(i15, cls);
        return i15;
    }

    public static final int g(u2.p pVar) {
        if (!(pVar instanceof n)) {
            return f(pVar);
        }
        n nVar = (n) pVar;
        int i13 = nVar.f110842n;
        for (u2.p pVar2 = nVar.f110843o; pVar2 != null; pVar2 = pVar2.f120047f) {
            i13 |= g(pVar2);
        }
        return i13;
    }

    public static final boolean h(int i13) {
        return (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(z2.q qVar) {
        u2.p pVar = ((u2.p) qVar).f120042a;
        if (!pVar.f120054m) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
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
            if ((pVar3.f120045d & 1024) == 0) {
                com.bumptech.glide.c.e(eVar, pVar3);
            } else {
                while (true) {
                    if (pVar3 == null) {
                        break;
                    }
                    if ((pVar3.f120044c & 1024) != 0) {
                        k2.e eVar2 = null;
                        while (pVar3 != null) {
                            if (pVar3 instanceof z2.z) {
                                nl.b.g((z2.z) pVar3);
                            } else if ((pVar3.f120044c & 1024) != 0 && (pVar3 instanceof n)) {
                                int i13 = 0;
                                for (u2.p pVar4 = ((n) pVar3).f110843o; pVar4 != null; pVar4 = pVar4.f120047f) {
                                    if ((pVar4.f120044c & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            pVar3 = pVar4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new k2.e(new u2.p[16]);
                                            }
                                            if (pVar3 != null) {
                                                eVar2.b(pVar3);
                                                pVar3 = null;
                                            }
                                            eVar2.b(pVar4);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            pVar3 = com.bumptech.glide.c.g(eVar2);
                        }
                    } else {
                        pVar3 = pVar3.f120047f;
                    }
                }
            }
        }
    }
}
