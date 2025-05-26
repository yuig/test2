package s3;

import android.os.SystemClock;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends u2.p implements c0, r, g2, f2, r3.f, r3.h, d2, a0, s, z2.d, z2.q, z2.t, b2, y2.a {

    /* renamed from: n, reason: collision with root package name */
    public u2.o f110754n;

    /* renamed from: o, reason: collision with root package name */
    public r3.a f110755o;

    /* renamed from: p, reason: collision with root package name */
    public HashSet f110756p;

    @Override // s3.f2
    public final void D() {
        u2.o oVar = this.f110754n;
        Intrinsics.g(oVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((n3.a0) ((n3.v) oVar)).f89032e.getClass();
    }

    @Override // u2.p
    public final void D0() {
        M0(true);
    }

    @Override // s3.s
    public final void E(q1 q1Var) {
        u2.o oVar = this.f110754n;
        Intrinsics.g(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((androidx.compose.foundation.lazy.layout.c) ((q3.w0) oVar)).l();
    }

    @Override // u2.p
    public final void E0() {
        O0();
    }

    @Override // r3.f
    public final ig1.b F() {
        r3.a aVar = this.f110755o;
        return aVar != null ? aVar : r3.b.f106069b;
    }

    @Override // s3.d2
    public final Object J(n4.b bVar, Object obj) {
        u2.o oVar = this.f110754n;
        Intrinsics.g(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((q3.z0) oVar).k();
    }

    public final void M0(boolean z13) {
        if (!this.f120054m) {
            jk.r.y("initializeModifier called on unattached node");
            throw null;
        }
        u2.o oVar = this.f110754n;
        if ((this.f120044c & 32) != 0) {
            if (oVar instanceof r3.d) {
                K0(new c(this, 0));
            }
            if (oVar instanceof r3.g) {
                Q0((r3.g) oVar);
            }
        }
        if ((this.f120044c & 4) != 0 && !z13) {
            com.bumptech.glide.c.S0(this, 2).d1();
        }
        if ((this.f120044c & 2) != 0) {
            if (f.a(this)) {
                q1 q1Var = this.f120049h;
                Intrinsics.f(q1Var);
                ((d0) q1Var).w1(this);
                q1Var.g1();
            }
            if (!z13) {
                com.bumptech.glide.c.S0(this, 2).d1();
                com.bumptech.glide.c.U0(this).D();
            }
        }
        if (oVar instanceof q3.g1) {
            k0 U0 = com.bumptech.glide.c.U0(this);
            q1.c0 c0Var = (q1.c0) ((q3.g1) oVar);
            int i13 = c0Var.f101879b;
            m1.h2 h2Var = c0Var.f101880c;
            switch (i13) {
                case 0:
                    ((q1.h0) h2Var).f101917j = U0;
                    break;
                case 1:
                    ((r1.p0) h2Var).f105961h = U0;
                    break;
                default:
                    ((s1.o0) h2Var).f110513w.setValue(U0);
                    break;
            }
        }
        if ((this.f120044c & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 && (oVar instanceof q3.w0) && f.a(this)) {
            com.bumptech.glide.c.U0(this).D();
        }
        int i14 = this.f120044c;
        if ((i14 & 16) != 0 && (oVar instanceof n3.v)) {
            ((n3.a0) ((n3.v) oVar)).f89032e.f89143a = this.f120049h;
        }
        if ((i14 & 8) != 0) {
            ((t3.c0) com.bumptech.glide.c.V0(this)).C();
        }
    }

    @Override // s3.a0
    public final void N(q1 q1Var) {
    }

    public final void N0(u2.o oVar) {
        if (this.f120054m) {
            O0();
        }
        this.f110754n = oVar;
        this.f120044c = r1.e(oVar);
        if (this.f120054m) {
            M0(false);
        }
    }

    public final void O0() {
        if (!this.f120054m) {
            jk.r.y("unInitializeModifier called on unattached node");
            throw null;
        }
        u2.o oVar = this.f110754n;
        if ((this.f120044c & 32) != 0) {
            if (oVar instanceof r3.g) {
                t3.c0 c0Var = (t3.c0) com.bumptech.glide.c.V0(this);
                r3.i key = ((r3.g) oVar).getKey();
                r3.e eVar = c0Var.f115890k0;
                eVar.f106074d.b(com.bumptech.glide.c.U0(this));
                eVar.f106075e.b(key);
                eVar.a();
            }
            if (oVar instanceof r3.d) {
                ((r3.d) oVar).g(f.f110773a);
            }
        }
        if ((this.f120044c & 8) != 0) {
            ((t3.c0) com.bumptech.glide.c.V0(this)).C();
        }
    }

    public final void P0() {
        if (this.f120054m) {
            this.f110756p.clear();
            t3.c0 c0Var = (t3.c0) com.bumptech.glide.c.V0(this);
            c0Var.A.b(this, e.f110765j, new c(this, 1));
        }
    }

    public final void Q0(r3.g gVar) {
        r3.a aVar = this.f110755o;
        if (aVar != null && aVar.u(gVar.getKey())) {
            aVar.s1(gVar);
            t3.c0 c0Var = (t3.c0) com.bumptech.glide.c.V0(this);
            r3.i key = gVar.getKey();
            r3.e eVar = c0Var.f115890k0;
            eVar.f106072b.b(this);
            eVar.f106073c.b(key);
            eVar.a();
            return;
        }
        this.f110755o = new r3.a(gVar);
        if (f.a(this)) {
            t3.c0 c0Var2 = (t3.c0) com.bumptech.glide.c.V0(this);
            r3.i key2 = gVar.getKey();
            r3.e eVar2 = c0Var2.f115890k0;
            eVar2.f106072b.b(this);
            eVar2.f106073c.b(key2);
            eVar2.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // s3.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(n3.j r7, n3.k r8, long r9) {
        /*
            r6 = this;
            u2.o r9 = r6.f110754n
            java.lang.String r10 = "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"
            kotlin.jvm.internal.Intrinsics.g(r9, r10)
            n3.v r9 = (n3.v) r9
            n3.a0 r9 = (n3.a0) r9
            n3.z r9 = r9.f89032e
            r9.getClass()
            n3.a0 r10 = r9.f89145c
            boolean r0 = r10.f89031d
            r1 = 0
            java.util.List r2 = r7.f89070a
            if (r0 != 0) goto L38
            int r0 = r2.size()
            r3 = r1
        L1e:
            if (r3 >= r0) goto L36
            java.lang.Object r4 = r2.get(r3)
            n3.q r4 = (n3.q) r4
            boolean r5 = c0.d.s(r4)
            if (r5 != 0) goto L38
            boolean r4 = c0.d.u(r4)
            if (r4 == 0) goto L33
            goto L38
        L33:
            int r3 = r3 + 1
            goto L1e
        L36:
            r0 = r1
            goto L39
        L38:
            r0 = 1
        L39:
            n3.x r3 = r9.f89144b
            n3.x r4 = n3.x.NotDispatching
            if (r3 == r4) goto L51
            n3.k r3 = n3.k.Initial
            if (r8 != r3) goto L48
            if (r0 == 0) goto L48
            r9.a(r7)
        L48:
            n3.k r3 = n3.k.Final
            if (r8 != r3) goto L51
            if (r0 != 0) goto L51
            r9.a(r7)
        L51:
            n3.k r7 = n3.k.Final
            if (r8 != r7) goto L72
            int r7 = r2.size()
            r8 = r1
        L5a:
            if (r8 >= r7) goto L6c
            java.lang.Object r0 = r2.get(r8)
            n3.q r0 = (n3.q) r0
            boolean r0 = c0.d.u(r0)
            if (r0 != 0) goto L69
            goto L72
        L69:
            int r8 = r8 + 1
            goto L5a
        L6c:
            n3.x r7 = n3.x.Unknown
            r9.f89144b = r7
            r10.f89031d = r1
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.d.W(n3.j, n3.k, long):void");
    }

    @Override // s3.b2
    public final boolean X() {
        return this.f120054m;
    }

    @Override // z2.q
    public final void Z(z2.n nVar) {
        jk.r.y("applyFocusProperties called on wrong node");
        throw null;
    }

    @Override // s3.c0
    public final int a(q3.s sVar, q3.r rVar, int i13) {
        u2.o oVar = this.f110754n;
        Intrinsics.g(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((q3.a0) oVar).a(sVar, rVar, i13);
    }

    @Override // y2.a
    public final n4.b b() {
        return com.bumptech.glide.c.U0(this).f110830r;
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
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // r3.f, r3.h
    public final Object c(r3.i iVar) {
        j1 j1Var;
        this.f110756p.add(iVar);
        u2.p pVar = this.f120042a;
        if (!pVar.f120054m) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        u2.p pVar2 = pVar.f120046e;
        k0 U0 = com.bumptech.glide.c.U0(this);
        while (U0 != null) {
            if ((U0.f110837y.f110808e.f120045d & 32) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f120044c & 32) != 0) {
                        n nVar = pVar2;
                        ?? r43 = 0;
                        while (nVar != 0) {
                            if (nVar instanceof r3.f) {
                                r3.f fVar = (r3.f) nVar;
                                if (fVar.F().u(iVar)) {
                                    return fVar.F().J(iVar);
                                }
                            } else if ((nVar.f120044c & 32) != 0 && (nVar instanceof n)) {
                                u2.p pVar3 = nVar.f110843o;
                                int i13 = 0;
                                nVar = nVar;
                                r43 = r43;
                                while (pVar3 != null) {
                                    if ((pVar3.f120044c & 32) != 0) {
                                        i13++;
                                        r43 = r43;
                                        if (i13 == 1) {
                                            nVar = pVar3;
                                        } else {
                                            if (r43 == 0) {
                                                r43 = new k2.e(new u2.p[16]);
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
                                if (i13 == 1) {
                                }
                            }
                            nVar = com.bumptech.glide.c.g(r43);
                        }
                    }
                    pVar2 = pVar2.f120046e;
                }
            }
            U0 = U0.v();
            pVar2 = (U0 == null || (j1Var = U0.f110837y) == null) ? null : j1Var.f110807d;
        }
        return iVar.f106070a.invoke();
    }

    @Override // s3.f2
    public final void c0() {
        u2.o oVar = this.f110754n;
        Intrinsics.g(oVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        n3.z zVar = ((n3.a0) ((n3.v) oVar)).f89032e;
        if (zVar.f89144b == n3.x.Dispatching) {
            long uptimeMillis = SystemClock.uptimeMillis();
            n3.a0 a0Var = zVar.f89145c;
            l3.c.t(uptimeMillis, new n3.y(a0Var, 1));
            zVar.f89144b = n3.x.Unknown;
            a0Var.f89031d = false;
        }
    }

    @Override // s3.c0
    public final int d(q3.s sVar, q3.r rVar, int i13) {
        u2.o oVar = this.f110754n;
        Intrinsics.g(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((q3.a0) oVar).d(sVar, rVar, i13);
    }

    @Override // s3.c0
    public final int e(q3.s sVar, q3.r rVar, int i13) {
        u2.o oVar = this.f110754n;
        Intrinsics.g(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((q3.a0) oVar).e(sVar, rVar, i13);
    }

    @Override // s3.r
    public final void e0() {
        com.bumptech.glide.c.k0(this);
    }

    @Override // s3.r
    public final void f(d3.e eVar) {
        u2.o oVar = this.f110754n;
        Intrinsics.g(oVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((y2.f) oVar).f(eVar);
    }

    @Override // y2.a
    public final long g() {
        return lb.l0.y1(com.bumptech.glide.c.S0(this, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN).f102180c);
    }

    @Override // y2.a
    public final n4.k getLayoutDirection() {
        return com.bumptech.glide.c.U0(this).f110831s;
    }

    @Override // s3.c0
    public final int h(q3.s sVar, q3.r rVar, int i13) {
        u2.o oVar = this.f110754n;
        Intrinsics.g(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((q3.a0) oVar).h(sVar, rVar, i13);
    }

    @Override // s3.c0
    public final q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        u2.o oVar = this.f110754n;
        Intrinsics.g(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((q3.a0) oVar).i(r0Var, o0Var, j13);
    }

    @Override // s3.g2
    public final void m0(z3.j jVar) {
        u2.o oVar = this.f110754n;
        Intrinsics.g(oVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) ((z3.k) oVar);
        z3.j jVar2 = new z3.j();
        jVar2.f140701b = appendedSemanticsElement.f17464b;
        appendedSemanticsElement.f17465c.invoke(jVar2);
        Intrinsics.g(jVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        if (jVar2.f140701b) {
            jVar.f140701b = true;
        }
        if (jVar2.f140702c) {
            jVar.f140702c = true;
        }
        for (Map.Entry entry : jVar2.f140700a.entrySet()) {
            z3.x xVar = (z3.x) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = jVar.f140700a;
            if (!linkedHashMap.containsKey(xVar)) {
                linkedHashMap.put(xVar, value);
            } else if (value instanceof z3.a) {
                Object obj = linkedHashMap.get(xVar);
                Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                z3.a aVar = (z3.a) obj;
                String str = aVar.f140658a;
                if (str == null) {
                    str = ((z3.a) value).f140658a;
                }
                xk2.g gVar = aVar.f140659b;
                if (gVar == null) {
                    gVar = ((z3.a) value).f140659b;
                }
                linkedHashMap.put(xVar, new z3.a(str, gVar));
            }
        }
    }

    @Override // s3.a0
    public final void n(long j13) {
    }

    public final String toString() {
        return this.f110754n.toString();
    }

    @Override // s3.f2
    public final boolean u0() {
        u2.o oVar = this.f110754n;
        Intrinsics.g(oVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((n3.a0) ((n3.v) oVar)).f89032e.getClass();
        return true;
    }

    @Override // z2.d
    public final void x(z2.x xVar) {
        jk.r.y("onFocusEvent called on wrong node");
        throw null;
    }
}
