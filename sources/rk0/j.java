package rk0;

import a.cb;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q0;
import androidx.recyclerview.widget.y2;
import ca0.y;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.iw;
import com.pinterest.api.model.v7;
import com.pinterest.feature.board.detail.floatingtoolbar.FloatingToolbarView;
import com.pinterest.feature.board.selectpins.BoardSelectPinsHeaderView;
import dl1.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import m60.w;
import sk0.x;
import sq0.o;
import tk0.k;
import tk0.l;
import tk0.q;
import u50.r;
import x02.x0;
import x02.z0;
import xa0.m;
import yb0.n;
import zp.u0;

/* loaded from: classes5.dex */
public final class j extends c implements com.pinterest.feature.board.organize.i {
    public v7 A;
    public ba B;
    public long C;
    public s D;
    public final LinkedHashSet E;
    public final LinkedHashSet F;
    public jl0.d G;
    public WeakReference H;
    public final h I;

    /* renamed from: o, reason: collision with root package name */
    public f0 f108466o;

    /* renamed from: p, reason: collision with root package name */
    public FloatingToolbarView f108467p;

    /* renamed from: q, reason: collision with root package name */
    public r f108468q;

    /* renamed from: r, reason: collision with root package name */
    public BoardSelectPinsHeaderView f108469r;

    /* renamed from: s, reason: collision with root package name */
    public com.pinterest.feature.board.organize.h f108470s;

    /* renamed from: t, reason: collision with root package name */
    public com.pinterest.feature.board.organize.g f108471t;

    /* renamed from: u, reason: collision with root package name */
    public final q0 f108472u;

    /* renamed from: v, reason: collision with root package name */
    public long f108473v;

    /* renamed from: w, reason: collision with root package name */
    public final ym0.b f108474w;

    /* renamed from: x, reason: collision with root package name */
    public ym0.c f108475x;

    /* renamed from: y, reason: collision with root package name */
    public ym0.d f108476y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f108477z;

    public j() {
        jl0.d dVar;
        this.f108451k = true;
        ar0.c cVar = new ar0.c();
        cVar.f20370b = this;
        this.f108472u = new q0(cVar);
        this.f108474w = new ym0.b();
        this.E = new LinkedHashSet();
        this.F = new LinkedHashSet();
        jl0.d.Companion.getClass();
        dVar = jl0.d.DEFAULT;
        this.G = dVar;
        this.H = new WeakReference(null);
        this.I = new h(this);
    }

    @Override // y92.e
    public final void D1(int i13) {
        c(false);
    }

    @Override // s42.k
    public final boolean H0(f30 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (this.G.isSelectAllBackendToggled()) {
            LinkedHashSet linkedHashSet = this.F;
            if ((linkedHashSet instanceof Collection) && linkedHashSet.isEmpty()) {
                return true;
            }
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                if (Intrinsics.d(((f30) it.next()).getUid(), model.getUid())) {
                }
            }
            return true;
        }
        LinkedHashSet linkedHashSet2 = this.E;
        if (!(linkedHashSet2 instanceof Collection) || !linkedHashSet2.isEmpty()) {
            Iterator it2 = linkedHashSet2.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.d(((f30) it2.next()).getUid(), model.getUid())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // s42.c
    public final void a(int i13) {
        r(i13, "Invalid adapter position found while trying to handle in-grid pin reorder");
    }

    @Override // y92.e
    public final void c0(int i13, int i14) {
        y2 n53;
        wk1.i iVar = (wk1.i) this.H.get();
        View view = null;
        o r13 = iVar != null ? iVar.r(i13) : null;
        o r14 = iVar != null ? iVar.r(i14) : null;
        ym0.f fVar = (r13 == null || r14 == null) ? ym0.f.f139403e : new ym0.f((wk1.e) r13.f115027a, (wk1.e) r14.f115027a, r13.f115028b, r14.f115028b);
        if (fVar.a()) {
            wk1.e eVar = fVar.f139405b;
            Intrinsics.f(eVar);
            int i15 = fVar.f139407d;
            Object item = eVar.getItem(i15);
            s sVar = item instanceof s ? (s) item : null;
            if (sVar != null) {
                long currentTimeMillis = System.currentTimeMillis();
                String uid = sVar.getUid();
                s sVar2 = this.D;
                boolean z13 = !Intrinsics.d(uid, sVar2 != null ? sVar2.getUid() : null) || currentTimeMillis - this.C > 300;
                if (z13) {
                    this.C = currentTimeMillis;
                    this.D = sVar;
                }
                if (!z13) {
                    return;
                }
            }
            eVar.n3(fVar.f139406c, i15);
            com.pinterest.feature.board.organize.g gVar = this.f108471t;
            if (gVar != null && (n53 = gVar.n5(i13)) != null) {
                view = n53.f19717a;
            }
            ig1.b.T0(view);
        }
    }

    public final void j(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.f19244o.add(new e(this));
        }
    }

    public final void k(v7 board, ba baVar) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.A = board;
        this.B = baVar;
        x0 x0Var = this.f108441a;
        Integer num = null;
        if (x0Var == null) {
            Intrinsics.r("boardRepository");
            throw null;
        }
        this.f108475x = new ym0.c(x0Var, board);
        z0 z0Var = this.f108442b;
        if (z0Var == null) {
            Intrinsics.r("boardSectionRepository");
            throw null;
        }
        this.f108476y = new ym0.d(z0Var);
        if (this.B == null) {
            v7 v7Var = this.A;
            if ((v7Var != null ? v7Var.q1() : 0).intValue() > 1) {
                return;
            }
        }
        ba baVar2 = this.B;
        if (baVar2 != null) {
            num = baVar2.x();
        } else {
            v7 v7Var2 = this.A;
            if (v7Var2 != null) {
                num = v7Var2.s1();
            }
        }
        if (num != null && num.intValue() > 0) {
            return;
        }
        u(jl0.d.VIEW);
    }

    public final void l(tk0.e displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        FloatingToolbarView floatingToolbarView = this.f108467p;
        BoardSelectPinsHeaderView boardSelectPinsHeaderView = this.f108469r;
        if (floatingToolbarView == null || boardSelectPinsHeaderView == null) {
            return;
        }
        int i13 = 0;
        int i14 = 1;
        floatingToolbarView.x(displayState.f117955a, new g(this, i13), new g(this, i14));
        xm0.a displayState2 = displayState.f117956b;
        Intrinsics.checkNotNullParameter(displayState2, "displayState");
        boardSelectPinsHeaderView.f45317b.i(new xm0.b(displayState2, i13));
        boardSelectPinsHeaderView.f45318c.i(new x(15, displayState2, boardSelectPinsHeaderView));
        boardSelectPinsHeaderView.f45319d.d(new xm0.b(displayState2, i14));
        Context context = floatingToolbarView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        tk0.a aVar = displayState.f117957c;
        if (aVar.f117939a) {
            n nVar = new n(context);
            nVar.w(aVar.f117941c.a(context));
            nVar.u(aVar.f117942d.a(context));
            nVar.q(aVar.f117943e.a(context).toString());
            nVar.m(aVar.f117944f.a(context).toString());
            nVar.setFocusable(true);
            nVar.setFocusableInTouchMode(true);
            nVar.requestFocus();
            nVar.f138513j = new m(4, this, aVar);
            w wVar = this.f108443c;
            if (wVar == null) {
                Intrinsics.r("eventManager");
                throw null;
            }
            cb.x(nVar, wVar);
            t(tk0.j.f117981a);
        }
        if (displayState.f117958d) {
            com.pinterest.feature.board.organize.h hVar = this.f108470s;
            if (hVar != null) {
                hVar.s0(this.E);
            }
            o();
            u(jl0.d.ORGANIZE);
            t(l.f117983a);
        }
    }

    public final void m(com.pinterest.feature.board.organize.h listener, com.pinterest.feature.board.organize.g fragmentView) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(fragmentView, "fragmentView");
        this.f108470s = listener;
        this.f108471t = fragmentView;
    }

    public final void n() {
        int size;
        int intValue;
        int size2;
        jl0.d dVar = this.G;
        LinkedHashSet linkedHashSet = this.E;
        ArrayList arrayList = new ArrayList(g0.q(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String uid = ((f30) it.next()).getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            arrayList.add(uid);
        }
        LinkedHashSet linkedHashSet2 = this.F;
        ArrayList arrayList2 = new ArrayList(g0.q(linkedHashSet2, 10));
        Iterator it2 = linkedHashSet2.iterator();
        while (it2.hasNext()) {
            String uid2 = ((f30) it2.next()).getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            arrayList2.add(uid2);
        }
        if (this.G.isSelectAllBackendToggled()) {
            ba baVar = this.B;
            if (baVar != null) {
                intValue = baVar.x().intValue();
                size2 = linkedHashSet2.size();
            } else {
                v7 v7Var = this.A;
                intValue = (v7Var != null ? v7Var.s1() : 0).intValue();
                size2 = linkedHashSet2.size();
            }
            size = intValue - size2;
        } else {
            size = linkedHashSet.size();
        }
        t(new tk0.g(dVar, arrayList, arrayList2, size));
    }

    public final void o() {
        this.E.clear();
        this.F.clear();
        com.pinterest.feature.board.organize.h hVar = this.f108470s;
        if (hVar != null) {
            hVar.B1();
        }
    }

    @Override // y92.e
    public final void o3(int i13, int i14) {
        ym0.e eVar;
        c(true);
        wk1.i iVar = (wk1.i) this.H.get();
        o r13 = iVar != null ? iVar.r(i13) : null;
        o r14 = iVar != null ? iVar.r(i14) : null;
        ym0.f fVar = (r13 == null || r14 == null) ? ym0.f.f139403e : new ym0.f((wk1.e) r13.f115027a, (wk1.e) r14.f115027a, r13.f115028b, r14.f115028b);
        if (fVar.a()) {
            wk1.e eVar2 = fVar.f139405b;
            Intrinsics.f(eVar2);
            List d2 = eVar2.d();
            Intrinsics.g(d2, "null cannot be cast to non-null type kotlin.collections.List<com.pinterest.framework.repository.Model>");
            this.f108474w.getClass();
            int i15 = fVar.f139407d;
            ym0.a a13 = ym0.b.a(i15, d2);
            s sVar = (s) eVar2.getItem(i15);
            if (a13 == null || sVar == null) {
                return;
            }
            if (sVar instanceof f30) {
                eVar = this.f108475x;
            } else {
                if (!(sVar instanceof ba)) {
                    HashSet hashSet = tb0.h.f117076w;
                    tb0.g.f117075a.h("Board in-grid reordering unsupported for model: " + sVar);
                    return;
                }
                eVar = this.f108476y;
            }
            if (eVar != null) {
                eVar.a(a13).i(new xo.c(this, sVar, a13, 6), new pj0.f(19, new g(this, 2)));
            }
        }
    }

    public final jl0.d p() {
        return this.G;
    }

    public final h q() {
        return this.I;
    }

    public final void r(int i13, String str) {
        y2 n53;
        if (SystemClock.elapsedRealtime() - this.f108473v >= 200) {
            f0 f0Var = this.f108466o;
            if (f0Var == null) {
                Intrinsics.r("devUtils");
                throw null;
            }
            f0Var.S(i13 != -1, str, new Object[0]);
            com.pinterest.feature.board.organize.g gVar = this.f108471t;
            if (gVar == null || (n53 = gVar.n5(i13)) == null) {
                return;
            }
            this.f108472u.s(n53);
        }
    }

    public final void s() {
        o();
        if (this.G.inOrganize()) {
            u(jl0.d.ORGANIZE);
        }
    }

    public final void t(q qVar) {
        r rVar = this.f108468q;
        if (rVar != null) {
            rVar.a(qVar);
        }
    }

    public final void u(jl0.d state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.G = state;
        int i13 = f.f108458a[state.ordinal()];
        q0 q0Var = this.f108472u;
        if (i13 == 1) {
            FloatingToolbarView toolbar = this.f108447g;
            if (toolbar != null) {
                View view = this.f108450j;
                Intrinsics.checkNotNullParameter(toolbar, "toolbar");
                i(false);
                this.f108449i = toolbar;
                this.f108454n = view;
                i(true);
                com.pinterest.feature.board.organize.g gVar = this.f108471t;
                if (gVar != null) {
                    gVar.c2(q0Var, false);
                }
                com.pinterest.feature.board.organize.g gVar2 = this.f108471t;
                if (gVar2 != null) {
                    gVar2.u5(true);
                }
            }
            com.pinterest.feature.board.organize.g gVar3 = this.f108471t;
            if (gVar3 != null) {
                gVar3.showLoadingSpinner(true);
            }
            t(k.f117982a);
        } else {
            o();
            FloatingToolbarView toolbar2 = this.f108467p;
            if (toolbar2 != null) {
                BoardSelectPinsHeaderView boardSelectPinsHeaderView = this.f108469r;
                Intrinsics.checkNotNullParameter(toolbar2, "toolbar");
                i(false);
                this.f108449i = toolbar2;
                this.f108454n = boardSelectPinsHeaderView;
                i(true);
                com.pinterest.feature.board.organize.g gVar4 = this.f108471t;
                if (gVar4 != null) {
                    gVar4.c2(q0Var, true);
                }
                com.pinterest.feature.board.organize.g gVar5 = this.f108471t;
                if (gVar5 != null) {
                    gVar5.u5(false);
                }
            }
            com.pinterest.feature.board.organize.g gVar6 = this.f108471t;
            if (gVar6 != null) {
                gVar6.showLoadingSpinner(false);
            }
            g(sk0.e.f113053a);
        }
        com.pinterest.feature.board.organize.h hVar = this.f108470s;
        if (hVar != null) {
            hVar.F(state.inOrganize());
        }
        n();
    }

    public final void v(FloatingToolbarView organizeFloatingToolbar, y eventIntake, BoardSelectPinsHeaderView organizeAppBar, String boardId) {
        Intrinsics.checkNotNullParameter(organizeFloatingToolbar, "organizeFloatingToolbar");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        Intrinsics.checkNotNullParameter(organizeAppBar, "organizeAppBar");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f108467p = organizeFloatingToolbar;
        this.f108468q = eventIntake;
        this.f108469r = organizeAppBar;
        Intrinsics.checkNotNullParameter(boardId, "<set-?>");
        this.f108445e = boardId;
        organizeAppBar.setTranslationY(-400.0f);
        bs1.c.U1(organizeAppBar);
        organizeAppBar.T(new i(this, 0), new i(this, 1));
    }

    @Override // s42.k
    public final void z0(f30 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        s42.b bVar = H0(model) ? s42.b.SELECTED : s42.b.UNSELECTED;
        s42.b bVar2 = s42.b.UNSELECTED;
        if (bVar == bVar2) {
            bVar2 = s42.b.SELECTED;
        }
        int i13 = f.f108459b[bVar2.ordinal()];
        LinkedHashSet linkedHashSet = this.E;
        LinkedHashSet linkedHashSet2 = this.F;
        int i14 = 4;
        if (i13 == 1) {
            if (this.G.isSelectAllBackendToggled()) {
                linkedHashSet2.removeIf(new iw(3, new u0(i14, model)));
            }
            linkedHashSet.add(model);
        } else if (i13 == 2) {
            if (this.G.isSelectAllBackendToggled()) {
                linkedHashSet2.add(model);
            }
            linkedHashSet.removeIf(new iw(4, new u0(5, model)));
        }
        com.pinterest.feature.board.organize.h hVar = this.f108470s;
        if (hVar != null) {
            hVar.u0(model);
        }
        n();
    }
}
