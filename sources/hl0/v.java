package hl0;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.LinearLayout;
import androidx.appcompat.widget.c2;
import androidx.recyclerview.widget.b2;
import com.google.android.gms.internal.measurement.x;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.api.model.b60;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hh0;
import com.pinterest.api.model.la;
import com.pinterest.api.model.ph0;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.board.common.filter.view.BoardPinsFilter;
import com.pinterest.feature.board.detail.view.BoardRefreshToastView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.f1;
import h32.i0;
import h32.u0;
import ha2.c0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import jk2.g0;
import jk2.l1;
import kl0.z;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import m60.w;
import nx.b0;
import nx.d0;
import so.n6;
import x02.a2;
import x02.t0;
import x02.x0;
import x40.m7;

/* loaded from: classes5.dex */
public final class v extends wk1.n implements com.pinterest.feature.board.detail.b, oj0.i, com.pinterest.feature.board.b {
    public final gi2.b A;
    public final x B;
    public final an0.h C;
    public final qz.k D;
    public final c2 E;
    public final b0 F;
    public final rk0.j G;
    public final e02.a H;
    public final il1.a I;

    /* renamed from: J, reason: collision with root package name */
    public final g70.h f69508J;
    public v7 K;
    public List L;
    public final xj2.b M;
    public final lk0.d N;
    public int O;
    public final w P;
    public final bl0.a Q;
    public final xu1.f R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final String f69509a;

    /* renamed from: a0, reason: collision with root package name */
    public final bm0.b f69510a0;

    /* renamed from: b, reason: collision with root package name */
    public final String f69511b;

    /* renamed from: b0, reason: collision with root package name */
    public i91.b f69512b0;

    /* renamed from: c, reason: collision with root package name */
    public final wk1.c f69513c;

    /* renamed from: c0, reason: collision with root package name */
    public zo.c f69514c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f69515d;

    /* renamed from: d0, reason: collision with root package name */
    public final xk2.v f69516d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f69517e;

    /* renamed from: e0, reason: collision with root package name */
    public final k11.b f69518e0;

    /* renamed from: f, reason: collision with root package name */
    public final long f69519f;

    /* renamed from: f0, reason: collision with root package name */
    public final u60.x f69520f0;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f69521g;

    /* renamed from: g0, reason: collision with root package name */
    public final u60.f f69522g0;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f69523h;

    /* renamed from: h0, reason: collision with root package name */
    public final u60.e f69524h0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f69525i;

    /* renamed from: i0, reason: collision with root package name */
    public final u60.s f69526i0;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f69527j;

    /* renamed from: j0, reason: collision with root package name */
    public final u60.s f69528j0;

    /* renamed from: k, reason: collision with root package name */
    public final se2.a f69529k;

    /* renamed from: k0, reason: collision with root package name */
    public final xk2.v f69530k0;

    /* renamed from: l, reason: collision with root package name */
    public final e12.d f69531l;

    /* renamed from: l0, reason: collision with root package name */
    public final qk0.c f69532l0;

    /* renamed from: m, reason: collision with root package name */
    public final x0 f69533m;

    /* renamed from: m0, reason: collision with root package name */
    public final com.pinterest.framework.multisection.datasource.pagedlist.f f69534m0;

    /* renamed from: n, reason: collision with root package name */
    public final b60.b f69535n;

    /* renamed from: n0, reason: collision with root package name */
    public final xk2.v f69536n0;

    /* renamed from: o, reason: collision with root package name */
    public final jl0.b f69537o;

    /* renamed from: o0, reason: collision with root package name */
    public final u60.m f69538o0;

    /* renamed from: p, reason: collision with root package name */
    public final tb0.h f69539p;

    /* renamed from: p0, reason: collision with root package name */
    public final h f69540p0;

    /* renamed from: q, reason: collision with root package name */
    public final i92.k f69541q;

    /* renamed from: q0, reason: collision with root package name */
    public final g f69542q0;

    /* renamed from: r, reason: collision with root package name */
    public final lh0.r f69543r;

    /* renamed from: s, reason: collision with root package name */
    public final rg0.s f69544s;

    /* renamed from: t, reason: collision with root package name */
    public final zf0.f f69545t;

    /* renamed from: u, reason: collision with root package name */
    public final yk1.v f69546u;

    /* renamed from: v, reason: collision with root package name */
    public final wj0.a f69547v;

    /* renamed from: w, reason: collision with root package name */
    public final nr0.m f69548w;

    /* renamed from: x, reason: collision with root package name */
    public final oc.c f69549x;

    /* renamed from: y, reason: collision with root package name */
    public final no1.e f69550y;

    /* renamed from: z, reason: collision with root package name */
    public final lb0.r f69551z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x030e, code lost:
    
        if (r1.l("android_curation_automagical_board_quick_save") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v(java.lang.String r48, java.lang.String r49, wk1.c r50, boolean r51, boolean r52, long r53, boolean r55, java.lang.String r56, boolean r57, boolean r58, boolean r59, se2.a r60, e12.d r61, x02.x0 r62, b60.b r63, tb0.h r64, i92.k r65, lh0.r r66, rg0.s r67, zf0.f r68, yk1.v r69, wj0.a r70, nr0.m r71, oc.c r72, x02.i2 r73, x02.z0 r74, m60.g0 r75, x12.a r76, no1.e r77, lb0.r r78, gi2.b r79, com.pinterest.feature.pin.j r80, nx.d1 r81, com.pinterest.feature.pin.r r82, lh0.a3 r83, so.o4 r84, com.google.android.gms.internal.measurement.x r85, k22.m r86, an0.h r87, qz.k r88, androidx.appcompat.widget.c2 r89, k11.c r90, androidx.appcompat.widget.c2 r91, nx.b0 r92, rk0.j r93, e02.a r94, il1.a r95, nr0.t r96, zy.q0 r97, ku1.l r98, g70.h r99) {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hl0.v.<init>(java.lang.String, java.lang.String, wk1.c, boolean, boolean, long, boolean, java.lang.String, boolean, boolean, boolean, se2.a, e12.d, x02.x0, b60.b, tb0.h, i92.k, lh0.r, rg0.s, zf0.f, yk1.v, wj0.a, nr0.m, oc.c, x02.i2, x02.z0, m60.g0, x12.a, no1.e, lb0.r, gi2.b, com.pinterest.feature.pin.j, nx.d1, com.pinterest.feature.pin.r, lh0.a3, so.o4, com.google.android.gms.internal.measurement.x, k22.m, an0.h, qz.k, androidx.appcompat.widget.c2, k11.c, androidx.appcompat.widget.c2, nx.b0, rk0.j, e02.a, il1.a, nr0.t, zy.q0, ku1.l, g70.h):void");
    }

    public static final void u3(v vVar) {
        v7 v7Var = vVar.K;
        if (v7Var == null) {
            return;
        }
        wy0 B = kh2.w.B(v7Var);
        int i13 = b.f69457a[kh2.d.s(B != null ? Intrinsics.d(B.s2(), Boolean.TRUE) : false, c0.d.d2(v7Var)).ordinal()];
        xk2.v vVar2 = vVar.f69516d0;
        if (i13 == 1) {
            nk1.b bVar = (nk1.b) vVar2.getValue();
            if (bVar != null) {
                bVar.f();
                return;
            }
            return;
        }
        if (i13 == 2) {
            nk1.b bVar2 = (nk1.b) vVar2.getValue();
            if (bVar2 != null) {
                bVar2.f();
                return;
            }
            return;
        }
        if (i13 != 3) {
            return;
        }
        yk1.v viewResources = vVar.f69546u;
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        i92.k toastUtils = vVar.f69541q;
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        new oh1.u(16, toastUtils, viewResources).invoke(v7Var);
    }

    public static nr0.l x3(v vVar, wa2.i iVar, int i13) {
        if ((i13 & 1) != 0) {
            iVar = vVar.f69513c.f130131b.f103320a;
        }
        qa2.n nVar = vVar.f69513c.f130131b;
        return ((n6) vVar.f69548w).a(vVar.getPresenterPinalytics(), iVar, nVar, vVar.f69546u);
    }

    @Override // com.pinterest.feature.board.organize.h
    public final void B1() {
        u60.s sVar = this.f69526i0;
        int i13 = 0;
        for (Object obj : sVar.d()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            sVar.u1(i13, (dl1.s) obj);
            i13 = i14;
        }
    }

    public final String B3() {
        return this.f69511b;
    }

    public final int D3() {
        return getDataSourceProvider().a();
    }

    @Override // com.pinterest.feature.board.organize.h
    public final void F(boolean z13) {
        boolean z14;
        e4(-1);
        for (wk1.e eVar : getDataSources()) {
            if (eVar instanceof bm0.b) {
                z14 = z13;
            } else {
                z14 = false;
                if ((eVar instanceof u60.x) || (eVar instanceof u60.s)) {
                    if (eVar.s()) {
                    }
                    z14 = true;
                } else if (Intrinsics.d(eVar, (xk1.e) this.f69536n0.getValue())) {
                    if (eVar.s()) {
                    }
                    z14 = true;
                } else {
                    if (z13) {
                    }
                    z14 = true;
                }
            }
            eVar.C2(z14);
        }
        Object adapter = getAdapter();
        if (adapter != null) {
            ((b2) adapter).h();
        }
    }

    public final int F3() {
        v7 v7Var = this.K;
        Integer l13 = v7Var != null ? v7Var.l1() : null;
        if (l13 == null) {
            return 0;
        }
        return l13.intValue();
    }

    public final boolean G3() {
        v7 v7Var = this.K;
        return (v7Var != null ? v7Var.Z0() : null) != null;
    }

    public final boolean H3() {
        v7 v7Var = this.K;
        if (v7Var == null || !v7Var.r1()) {
            return false;
        }
        Integer q13 = v7Var.q1();
        Intrinsics.checkNotNullExpressionValue(q13, "getSectionCount(...)");
        return q13.intValue() > 0;
    }

    public final void I3() {
        v7 v7Var;
        v7 v7Var2 = this.K;
        if (v7Var2 != null) {
            u7 G1 = v7Var2.G1();
            G1.H(Integer.valueOf(v7Var2.s1().intValue() + 1));
            G1.E(Integer.valueOf(v7Var2.l1().intValue() + 1));
            G1.f42441i = new Date();
            boolean[] zArr = G1.f42452n0;
            if (zArr.length > 8) {
                zArr[8] = true;
            }
            v7Var = G1.a();
            this.f69533m.W(v7Var);
        } else {
            v7Var = null;
        }
        this.K = v7Var;
    }

    public final void J3() {
        u60.s sVar = this.f69526i0;
        Iterator it = sVar.d().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (((dl1.s) it.next()) instanceof hh0) {
                break;
            } else {
                i13++;
            }
        }
        boolean z13 = i13 != -1;
        v7 v7Var = this.K;
        boolean z14 = (v7Var != null ? v7Var.s1() : 0).intValue() > 0;
        if (H3() || z14) {
            if (z13) {
                sVar.removeItem(i13);
            }
        } else {
            if (z13) {
                return;
            }
            u60.s sVar2 = this.f69528j0;
            Iterator it2 = sVar2.d().iterator();
            int i14 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i14 = -1;
                    break;
                } else if (((dl1.s) it2.next()) instanceof v31.f) {
                    break;
                } else {
                    i14++;
                }
            }
            if (i14 != -1) {
                sVar2.removeItem(i14);
            }
            sVar.P(0, new hh0(d70.g.empty_board_message, null, null, 6, null));
        }
    }

    public final boolean K3() {
        v7 v7Var = this.K;
        if (v7Var == null || !kh2.w.i0(v7Var)) {
            return false;
        }
        v7 v7Var2 = this.K;
        int intValue = (v7Var2 != null ? v7Var2.l1() : 0).intValue();
        if (intValue <= 0) {
            return false;
        }
        z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        lh0.r rVar = this.f69543r;
        boolean c13 = rVar.c("enabled_20_pins", z3Var);
        boolean c14 = rVar.c("enabled_10_pins", z3Var);
        if (!rVar.c("enabled_all", z3Var)) {
            if (c14) {
                if (intValue > 10) {
                    return false;
                }
            } else if (!c13 || intValue > 20) {
                return false;
            }
        }
        return true;
    }

    public final boolean L3() {
        v7 v7Var;
        if (this.f69525i || (v7Var = this.K) == null || kh2.w.i0(v7Var) || this.L == null) {
            return false;
        }
        lh0.r rVar = this.f69543r;
        rVar.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) rVar.f83466a;
        if (g1Var.o("android_presence_other_board_more_ideas_board_handler", "enabled", z3Var) || g1Var.l("android_presence_other_board_more_ideas_board_handler")) {
            List<dl1.s> q03 = CollectionsKt.q0(this.f69526i0.d());
            if ((q03 instanceof Collection) && q03.isEmpty()) {
                return false;
            }
            for (dl1.s sVar : q03) {
                if (!(sVar instanceof vh) || !Intrinsics.d(((vh) sVar).q(), "board_ideas_feed")) {
                }
            }
            return false;
        }
        List list = this.L;
        if (list == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((la) it.next()).q().intValue() == z22.c.MORE_IDEAS.getValue()) {
            }
        }
        return false;
        return true;
    }

    public final void M3(boolean z13) {
        j jVar = new j(this, 0);
        x0 x0Var = this.f69533m;
        String str = this.f69509a;
        g0 s13 = x0Var.P(str).s();
        if (z13) {
            s13 = x0Var.Q(str).s();
        }
        s13.p(jVar);
        this.M.a(jVar);
    }

    public final void N3() {
        j jVar = new j(this, 0);
        this.f69526i0.X = false;
        this.f69538o0.V = false;
        new kk2.g(this.f69533m.Q(this.f69509a).s(), new zk0.b(16, new e(this, 2)), 0).p(jVar);
        this.M.a(jVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (com.bumptech.glide.d.G(r3, "EXTRA_NAVBAR_HIDE", false) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q3(com.pinterest.api.model.v7 r3) {
        /*
            r2 = this;
            yk1.n r0 = r2.getView()
            com.pinterest.feature.board.detail.a r0 = (com.pinterest.feature.board.detail.a) r0
            jl1.a r0 = (jl1.a) r0
            boolean r0 = r0.f76941e
            if (r0 != 0) goto Ld
            return
        Ld:
            boolean r3 = kh2.w.i0(r3)
            r0 = 0
            if (r3 != 0) goto L2f
            boolean r3 = r2.isBound()
            if (r3 == 0) goto L2d
            yk1.n r3 = r2.getView()
            com.pinterest.feature.board.detail.a r3 = (com.pinterest.feature.board.detail.a) r3
            kl0.z r3 = (kl0.z) r3
            r3.getClass()
            java.lang.String r1 = "EXTRA_NAVBAR_HIDE"
            boolean r3 = com.bumptech.glide.d.G(r3, r1, r0)
            if (r3 != 0) goto L2f
        L2d:
            r3 = 1
            goto L30
        L2f:
            r3 = r0
        L30:
            r70.h r1 = new r70.h
            r1.<init>(r3, r0)
            m60.w r3 = r2.P
            r3.d(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hl0.v.Q3(com.pinterest.api.model.v7):void");
    }

    public final void R3(zo.c boardViewType) {
        Intrinsics.checkNotNullParameter(boardViewType, "boardViewType");
        this.f69514c0 = boardViewType;
        this.f69551z.h("PREF_BOARD_VIEW_TYPE", boardViewType.ordinal());
        int i13 = this.V;
        u60.s sVar = this.f69526i0;
        u60.s sVar2 = this.f69528j0;
        Iterator it = (i13 == 6 ? sVar2 : sVar).d().iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            dl1.s sVar3 = (dl1.s) it.next();
            vh vhVar = sVar3 instanceof vh ? (vh) sVar3 : null;
            if (Intrinsics.d(vhVar != null ? vhVar.q() : null, "recommended_searches")) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 >= 0 && i14 < getDataSourceProvider().a()) {
            if (this.V == 6) {
                sVar = sVar2;
            }
            sVar.removeItem(i14);
        }
        com.pinterest.feature.board.detail.a aVar = (com.pinterest.feature.board.detail.a) getViewIfBound();
        if (aVar != null) {
            z zVar = (z) aVar;
            zVar.A9(boardViewType);
            zVar.u9();
        }
    }

    public final void S3() {
        v7 v7Var = this.K;
        if (v7Var != null) {
            this.E.n(v7Var, -1, this.P, false, 1);
        }
    }

    public final void T3() {
        com.pinterest.feature.board.detail.a aVar;
        getPinalytics().X(u0.ARCHIVE_BOARD_BUTTON);
        v7 v7Var = this.K;
        if (v7Var == null || (aVar = (com.pinterest.feature.board.detail.a) getViewIfBound()) == null) {
            return;
        }
        String boardName = v7Var.j1();
        Intrinsics.checkNotNullExpressionValue(boardName, "getName(...)");
        z zVar = (z) aVar;
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Context requireContext = zVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        String string = zVar.getResources().getString(y60.e.archive_board_message);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannableStringBuilder D = f0.h.D(requireContext, string, boardName);
        String string2 = zVar.getString(y60.e.archive_board_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = zVar.getString(y60.e.archive_confirm);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        yb0.n l93 = zVar.l9(string2, D, string3);
        l93.f138513j = new kl0.d(zVar, 8);
        cb.x(l93, zVar.f7());
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: U3, reason: merged with bridge method [inline-methods] */
    public final void r3(com.pinterest.feature.board.detail.a view) {
        com.pinterest.feature.board.detail.b bVar;
        int i13 = 0;
        int i14 = 2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        initNetworkObserver();
        com.pinterest.feature.board.detail.a aVar = (com.pinterest.feature.board.detail.a) getViewIfBound();
        if (aVar != null) {
            z zVar = (z) aVar;
            Intrinsics.checkNotNullParameter(this, "listener");
            zVar.f80145n1 = this;
            BoardPinsFilter boardPinsFilter = zVar.N1;
            if (boardPinsFilter == null) {
                Intrinsics.r("boardPinsFilter");
                throw null;
            }
            Intrinsics.checkNotNullParameter(this, "toolbarListener");
            boardPinsFilter.f45117a = this;
            String str = zVar.f80146o1;
            if (str != null && (bVar = zVar.f80145n1) != null) {
                ((v) bVar).h4(str);
            }
            zVar.f80146o1 = null;
        }
        yk1.n viewIfBound = getViewIfBound();
        com.pinterest.feature.board.organize.g gVar = viewIfBound instanceof com.pinterest.feature.board.organize.g ? (com.pinterest.feature.board.organize.g) viewIfBound : null;
        rk0.j jVar = this.G;
        if (gVar != null) {
            gVar.z4(jVar);
            gVar.d4(jVar);
        }
        w wVar = this.P;
        wVar.h(this.f69542q0);
        wVar.h(this.f69540p0);
        this.f69518e0.a();
        if (D3() != 0) {
            R3(this.f69514c0);
        }
        com.pinterest.feature.board.detail.a aVar2 = (com.pinterest.feature.board.detail.a) getViewIfBound();
        if (aVar2 != null) {
            ((z) aVar2).A9(this.f69514c0);
        }
        com.pinterest.feature.board.detail.a aVar3 = (com.pinterest.feature.board.detail.a) getViewIfBound();
        if (aVar3 != null) {
            wk1.c gridParams = this.f69513c;
            Intrinsics.checkNotNullParameter(gridParams, "gridParams");
            gridParams.f(((z) aVar3).W8());
        }
        wk1.i dataRegistry = getDataSourceRegistry();
        jVar.getClass();
        Intrinsics.checkNotNullParameter(dataRegistry, "dataRegistry");
        jVar.H = new WeakReference(dataRegistry);
        boolean z13 = this.f69525i;
        if (z13) {
            kotlin.jvm.internal.j.z(getScope(), null, null, new p(this, null), 3);
        }
        u60.s sVar = this.f69526i0;
        uk2.f fVar = sVar.f49129s;
        zk0.b bVar2 = new zk0.b(12, new e(this, 5));
        zk0.b bVar3 = new zk0.b(13, i.f69473r);
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        xj2.c F = fVar.F(bVar2, bVar3, cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        kotlin.jvm.internal.j.z(getScope(), null, null, new q(this, null), 3);
        u60.x xVar = this.f69520f0;
        uk2.f fVar2 = xVar.f49129s;
        uk2.f fVar3 = sVar.f49129s;
        ArrayList l13 = f0.l(fVar2, fVar3);
        lh0.r rVar = this.f69543r;
        boolean d2 = rVar.d();
        u60.f fVar4 = this.f69522g0;
        if (d2) {
            l13.add(fVar4.f49129s);
        }
        ol1.d w13 = uj2.q.w(l13);
        ck2.e eVar = ck2.i.f27921a;
        jk2.x xVar2 = new jk2.x(w13.t(eVar), new bv0.k(i13, i.f69469n), i14);
        int i15 = 6;
        int i16 = 7;
        xj2.c F2 = xVar2.F(new zk0.b(i15, new e(this, 4)), new zk0.b(i16, i.f69470o), cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F2, "subscribe(...)");
        addDisposable(F2);
        int i17 = 8;
        xj2.c F3 = new jk2.x(this.f69533m.E(this.O), new bv0.k(1, new e(this, i15)), 2).F(new zk0.b(i17, new e(this, i16)), new zk0.b(9, new e(this, i17)), cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F3, "subscribe(...)");
        addDisposable(F3);
        if (!rVar.d()) {
            fVar4 = null;
        }
        ArrayList l14 = f0.l(xVar.f49129s, fVar3);
        if (fVar4 != null) {
            l14.add(fVar4.f49129s);
        }
        xj2.c F4 = new jk2.x(uj2.q.w(l14).t(eVar), new com.pinterest.framework.multisection.datasource.pagedlist.h(29, i.f69471p), 2).F(new zk0.b(4, new sk0.x(i15, this, fVar4)), new zk0.b(5, i.f69472q), cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F4, "subscribe(...)");
        addDisposable(F4);
        if (!z13) {
            kotlin.jvm.internal.j.z(getScope(), null, null, new l(this, null), 3);
        }
        t4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    public final void V3(String str, ArrayList arrayList) {
        i91.b bVar = this.f69512b0;
        String str2 = bVar.f71799b;
        if (str == null) {
            str = str2;
        }
        if (arrayList == 0) {
            arrayList = bVar.f71800c;
        }
        this.f69512b0 = i91.b.a(bVar, false, str, arrayList, 1);
        kotlin.jvm.internal.j.z(getScope(), null, null, new n(this, null), 3);
    }

    public final void W3(int i13) {
        zo.c f13 = kg.o.f(i13, zo.c.DEFAULT);
        d0 pinalytics = getPinalytics();
        i0 p13 = getPinalytics().p();
        pinalytics.c0(p13 != null ? com.bumptech.glide.d.z0(p13, i.f69475t) : null, kg.o.j(f13), h32.g0.SHEET, null);
        com.pinterest.feature.board.detail.a aVar = (com.pinterest.feature.board.detail.a) getViewIfBound();
        if (aVar != null) {
            ((z) aVar).x2();
        }
        R3(f13);
    }

    public final void X3() {
        v7 v7Var;
        if (isBound() && (v7Var = this.K) != null) {
            ek2.f i13 = this.f69533m.a0(v7Var).i(new a(this, v7Var, 1), new zk0.b(3, new e(this, 9)));
            Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
            addDisposable(i13);
        }
    }

    public final void Y3() {
        v7 v7Var;
        if (isBound() && (v7Var = this.K) != null) {
            ek2.f i13 = this.f69533m.l0(v7Var).i(new a(this, v7Var, 0), new zk0.b(2, new e(this, 10)));
            Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
            addDisposable(i13);
        }
    }

    public final void Z3() {
        r4(h32.g0.NAVIGATION, u0.BOARD_TOOL_MESSAGE_GROUP);
        v7 v7Var = this.K;
        if (v7Var == null || this.W) {
            return;
        }
        this.W = true;
        String uid = v7Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        kk2.m k13 = com.bumptech.glide.d.u0(this.f69549x.c(new m7(uid))).l(wj2.c.a()).k(new qk0.b(1, i.f69465j));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        addDisposable(nl.b.q(k13, new m(v7Var, this), new e(this, 11)));
    }

    @Override // oj0.i
    public final void a3() {
        com.pinterest.feature.board.detail.a aVar = (com.pinterest.feature.board.detail.a) getViewIfBound();
        if (aVar != null) {
            ((z) aVar).z9(true);
        }
    }

    public final void a4(x22.c cVar) {
        com.pinterest.framework.screens.x xVar = (com.pinterest.feature.board.detail.a) getViewIfBound();
        if (xVar != null) {
            ScreenLocation screenLocation = (ScreenLocation) com.pinterest.screens.q.f51214d.getValue();
            String str = this.f69509a;
            NavigationImpl z03 = Navigation.z0(screenLocation, str);
            z03.m0("com.pinterest.EXTRA_BOARD_ID", str);
            z03.z(cVar.getValue(), "com.pinterest.EXTRA_IDEAS_REFERRER_TYPE");
            v7 v7Var = this.K;
            boolean z13 = false;
            z03.Y1("com.pinterest.EXTRA_HIDE_ONE_TAP_SAVE_BUTTON", !(v7Var != null && kh2.w.i0(v7Var)));
            v7 v7Var2 = this.K;
            if (v7Var2 != null && kh2.w.h0(v7Var2)) {
                z13 = true;
            }
            z03.Y1("EXTRA_NAVBAR_HIDE", z13);
            Intrinsics.checkNotNullExpressionValue(z03, "apply(...)");
            ((nl1.d) xVar).M1(z03);
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        wk1.i iVar = (wk1.i) dataSources;
        iVar.b(this.f69510a0);
        if (this.f69525i) {
            iVar.b(this.f69524h0);
            return;
        }
        if (this.f69543r.d()) {
            iVar.b(this.f69522g0);
        }
        iVar.b(this.f69520f0);
        iVar.b(this.f69526i0);
        iVar.b(this.f69528j0);
        if (this.B.q()) {
            iVar.b(this.f69532l0);
        }
        iVar.b(this.f69538o0);
        iVar.b((xk1.e) this.f69536n0.getValue());
        iVar.b((jj0.c) this.f69530k0.getValue());
        iVar.b(this.f69534m0);
    }

    public final void d4() {
        r4(h32.g0.NAVIGATION, u0.MORE_BUTTON);
        if (this.f69525i) {
            this.P.d(Navigation.v1(com.pinterest.screens.q.b(), e0.t.j(new Pair("com.pinterest.EXTRA_BOARD_VIEW_TYPE", Integer.valueOf(this.f69514c0.ordinal())), new Pair("com.pinterest.EXTRA_BOARD_ID", this.f69509a))));
            return;
        }
        v7 v7Var = this.K;
        if (v7Var != null) {
            dl0.a a13 = jl0.b.f76936a.a(v7Var);
            this.A.getClass();
            List o03 = gi2.b.o0(a13);
            byte b13 = 0;
            e eVar = new e(this, 0);
            v7 v7Var2 = this.K;
            Integer num = null;
            ha2.z a14 = cl0.c.a(o03, eVar, com.bumptech.glide.d.o0(v7Var2 != null ? Boolean.valueOf(kh2.w.h0(v7Var2)) : null));
            ArrayList arrayList = new ArrayList();
            arrayList.add(a14);
            com.pinterest.feature.board.detail.a aVar = (com.pinterest.feature.board.detail.a) getViewIfBound();
            if (aVar != null) {
                ((z) aVar).Y4(new ha2.a((List) arrayList, (boolean) (b13 == true ? 1 : 0), num, 14));
            }
        }
    }

    @Override // com.pinterest.feature.board.organize.h
    public final ArrayList e3() {
        List d2 = this.f69526i0.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d2) {
            if (obj instanceof f30) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void e4(int i13) {
        if (this.K == null || this.V == i13) {
            return;
        }
        this.V = i13;
        this.f69528j0.n();
        this.f69526i0.n();
        onRecyclerRefresh();
        int i14 = this.V;
        getPinalytics().b0(i14 != -1 ? i14 != 6 ? u0.PINS_WITH_NOTES_FILTER : u0.FAVORITE_PINS_FILTER : u0.ALL_PINS_FILTER, h32.g0.SORT_BOARD_PINS_SELECTLIST, this.f69509a, false);
    }

    public final void f4() {
        v7 v7Var = this.K;
        if (v7Var != null) {
            this.f69508J.e(v7Var, g70.b.PUBLIC_BOARD, i.f69476u);
        }
    }

    @Override // kj0.a
    public final void g0() {
        List S0;
        int i13;
        r4(h32.g0.BOARD_PINS_GRID, u0.FILTER_BUTTON);
        ArrayList arrayList = new ArrayList();
        v7 v7Var = this.K;
        Integer num = null;
        boolean z13 = false;
        if (v7Var != null && (S0 = v7Var.S0()) != null && (!S0.isEmpty())) {
            ha2.x xVar = new ha2.x(d70.g.filter_by_type, null, null, null, null, 30);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = S0.iterator();
            while (true) {
                i13 = 5;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((b60) next).e().intValue() != 5) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            int i14 = 0;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i15 = i14 + 1;
                if (i14 < 0) {
                    f0.p();
                    throw null;
                }
                b60 b60Var = (b60) next2;
                arrayList3.add(new c0(0, i14, null, this.V == b60Var.e().intValue(), false, b60Var.f(), null, null, null, null, 4052));
                i14 = i15;
            }
            arrayList.add(new ha2.b0(xVar, arrayList3, new sk0.x(i13, this, S0)));
        }
        if (this.K != null) {
            arrayList.add(w3());
        }
        com.pinterest.feature.board.detail.a aVar = (com.pinterest.feature.board.detail.a) getViewIfBound();
        if (aVar != null) {
            ((z) aVar).Y4(new ha2.a(arrayList, z13, num, 14));
        }
    }

    public final void g4() {
        v7 v7Var;
        v7 v7Var2;
        d0 pinalytics = getPinalytics();
        f1 f1Var = f1.BOARD_SCREENSHOT;
        h32.g0 g0Var = h32.g0.BOARD_PINS_GRID;
        HashMap z33 = z3();
        v7 v7Var3 = this.K;
        bs1.c.G1("board_pin_count", v7Var3 != null ? String.valueOf(v7Var3.l1()) : null, z33);
        Unit unit = Unit.f80348a;
        d0.B(pinalytics, f1Var, g0Var, null, z33, 20);
        v7 v7Var4 = this.K;
        if (v7Var4 != null) {
            Intrinsics.checkNotNullParameter(v7Var4, "<this>");
            if (kotlin.text.z.i(v7Var4.o1(), "protected", true) || (v7Var = this.K) == null || kh2.d.M0(v7Var)) {
                return;
            }
            lh0.r rVar = this.f69543r;
            rVar.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) rVar.f83466a;
            if ((g1Var.o("sg_android_board_screenshot_upsell", "enabled", z3Var) || g1Var.l("sg_android_board_screenshot_upsell")) && (v7Var2 = this.K) != null) {
                ((a11.q) ((bf2.b) this.f69529k).get()).a(v7Var2);
            }
        }
    }

    @Override // com.pinterest.feature.board.b
    public final zo.c h2() {
        return this.f69514c0;
    }

    public final void h4(String sectionId) {
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        this.f69520f0.X(sectionId);
    }

    public final void i4() {
        ph0 u13;
        d0 pinalytics = getPinalytics();
        f1 f1Var = f1.TAP;
        u0 u0Var = u0.CANCEL_BUTTON;
        h32.g0 g0Var = h32.g0.SENSITIVITY_SCREEN;
        HashMap z33 = z3();
        v7 v7Var = this.K;
        bs1.c.G1("reason", (v7Var == null || (u13 = v7Var.u1()) == null) ? null : u13.e(), z33);
        Unit unit = Unit.f80348a;
        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : z33, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        com.pinterest.feature.board.detail.a aVar = (com.pinterest.feature.board.detail.a) getViewIfBound();
        if (aVar != null) {
            ((z) aVar).P7();
        }
    }

    @Override // yk1.p
    public final void initNetworkObserver() {
        addDisposable(getNetworkStateStream().o().F(new zk0.b(10, new e(this, 1)), new zk0.b(11, i.f69466k), ck2.i.f27923c, ck2.i.f27924d));
    }

    public final void j4() {
        r4(h32.g0.NAVIGATION, u0.SHARE_BUTTON);
        kotlin.jvm.internal.j.z(getScope(), null, null, new n(this, null), 3);
    }

    public final void k4() {
        com.pinterest.feature.board.detail.a aVar = (com.pinterest.feature.board.detail.a) getViewIfBound();
        if (aVar != null) {
            z zVar = (z) aVar;
            zVar.E8(0, false);
            AppBarLayout appBarLayout = zVar.L1;
            if (appBarLayout != null) {
                appBarLayout.m(true, true);
            } else {
                Intrinsics.r("boardHeaderContainer");
                throw null;
            }
        }
    }

    public final void l4() {
        ph0 u13;
        wj0.a aVar = this.f69547v;
        aVar.getClass();
        String boardId = this.f69509a;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        aVar.f130018a.add(boardId);
        com.pinterest.feature.board.detail.a aVar2 = (com.pinterest.feature.board.detail.a) getViewIfBound();
        String str = null;
        if (aVar2 != null) {
            LinearLayout linearLayout = ((z) aVar2).O1;
            if (linearLayout == null) {
                Intrinsics.r("sensitiveContentWarningView");
                throw null;
            }
            bs1.c.R1(linearLayout, false);
        }
        d0 pinalytics = getPinalytics();
        f1 f1Var = f1.TAP;
        u0 u0Var = u0.VIEW_ANYWAY_BUTTON;
        h32.g0 g0Var = h32.g0.SENSITIVITY_SCREEN;
        HashMap z33 = z3();
        v7 v7Var = this.K;
        if (v7Var != null && (u13 = v7Var.u1()) != null) {
            str = u13.e();
        }
        bs1.c.G1("reason", str, z33);
        Unit unit = Unit.f80348a;
        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : z33, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        com.pinterest.feature.board.detail.a aVar3 = (com.pinterest.feature.board.detail.a) getViewIfBound();
        if (aVar3 != null) {
            z zVar = (z) aVar3;
            Bundle bundle = new Bundle();
            bundle.putString("com.pinterest.EXTRA_BOARD_ID", zVar.n9());
            zVar.P6("com.pinterest.EXTRA_BOARD_SENSITIVITY_SCREEN_RESULT_CODE", bundle);
        }
    }

    @Override // wk1.q, sq0.w
    public final void loadMoreData() {
        if (!this.f69526i0.t0()) {
            this.B.f(this.K);
        }
        super.loadMoreData();
    }

    @Override // oj0.i
    public final void n1() {
        com.pinterest.feature.board.detail.a aVar = (com.pinterest.feature.board.detail.a) getViewIfBound();
        if (aVar != null) {
            BoardRefreshToastView boardRefreshToastView = ((z) aVar).U1;
            if (boardRefreshToastView != null) {
                bs1.c.X0(boardRefreshToastView);
            } else {
                Intrinsics.r("refreshFeedPromptView");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n4() {
        /*
            r7 = this;
            boolean r0 = r7.f69525i
            if (r0 == 0) goto L5
            return
        L5:
            yk1.n r0 = r7.getViewIfBound()
            com.pinterest.feature.board.detail.a r0 = (com.pinterest.feature.board.detail.a) r0
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L23
            kl0.z r0 = (kl0.z) r0
            com.pinterest.gestalt.iconbutton.GestaltIconButton r0 = r0.F1
            if (r0 == 0) goto L1d
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L23
            r0 = 1
            goto L24
        L1d:
            java.lang.String r0 = "shareButton"
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r2
        L23:
            r0 = r1
        L24:
            rg0.o r3 = rg0.o.CONTEXT_BOARD_ID
            java.lang.String r3 = r3.getValue()
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r5 = r7.f69509a
            r4.<init>(r3, r5)
            rg0.o r3 = rg0.o.CONTEXT_IS_BOARD_SHAREABLE
            java.lang.String r3 = r3.getValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            kotlin.Pair r6 = new kotlin.Pair
            r6.<init>(r3, r0)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r4, r6}
            java.util.LinkedHashMap r0 = kotlin.collections.z0.h(r0)
            boolean r3 = r7.f69523h
            if (r3 == 0) goto L55
            rg0.o r3 = rg0.o.CONTEXT_SHARE_BOARD_LINK_ID
            java.lang.String r3 = r3.getValue()
            r0.put(r3, r5)
        L55:
            i32.y0 r3 = i32.y0.ANDROID_BOARD_TAKEOVER
            tg0.c r4 = new tg0.c
            r4.<init>(r1, r1)
            rg0.s r1 = r7.f69544s
            dh0.d r1 = (dh0.d) r1
            uj2.q r0 = r1.g(r3, r0, r4)
            uj2.a0 r1 = tk2.e.f118017c
            jk2.x r0 = r0.H(r1)
            java.lang.String r1 = "observeOn(...)"
            jk2.l1 r0 = t3.s1.f(r0, r1)
            hl0.e r1 = new hl0.e
            r3 = 12
            r1.<init>(r7, r3)
            r3 = 6
            xj2.c r0 = nl.b.s(r0, r1, r2, r2, r3)
            r7.addDisposable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hl0.v.n4():void");
    }

    @Override // wk1.q, yk1.b
    public final void onActivate() {
        p3();
        if (D3() == 0) {
            N3();
        } else if (!this.f69525i) {
            M3(false);
            n4();
        }
        v7 v7Var = this.K;
        if (v7Var != null) {
            Q3(v7Var);
        }
    }

    @Override // wk1.q, yk1.b
    public final void onCreate() {
        super.onCreate();
        x0 x0Var = this.f69533m;
        x0Var.getClass();
        String boardId = this.f69509a;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        b22.f fVar = new b22.f(11, new kw1.c(boardId, 7));
        uk2.f fVar2 = x0Var.Q;
        fVar2.getClass();
        uj2.q i13 = new jk2.x(fVar2, fVar, 2).i(new b22.f(19, new t0(x0Var.f131526y, 2)));
        Intrinsics.checkNotNullExpressionValue(i13, "compose(...)");
        l1 A = i13.A(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(A, "observeOn(...)");
        this.M.a(nl.b.m(A, "BoardHostPresenter:observerBoardMergeEvents", new e(this, 3)));
    }

    @Override // wk1.n, yk1.b
    public final void onDeactivate() {
        rk0.j jVar = this.G;
        xj2.c cVar = jVar.f108452l;
        if (cVar != null) {
            cVar.dispose();
        }
        if (jVar.f108477z) {
            x0 x0Var = jVar.f108441a;
            if (x0Var == null) {
                Intrinsics.r("boardRepository");
                throw null;
            }
            String boardId = jVar.e();
            Intrinsics.checkNotNullParameter(boardId, "boardId");
            x0Var.O.c(new Pair(boardId, ""));
        }
        super.onDeactivate();
    }

    @Override // wk1.q, yk1.b
    public final void onDestroy() {
        this.M.dispose();
        u60.x xVar = this.f69520f0;
        xVar.Z.dispose();
        if (xVar.f0()) {
            LinkedHashMap linkedHashMap = jj0.a.f76305a;
            String boardId = xVar.L;
            Intrinsics.checkNotNullParameter(boardId, "boardId");
            jj0.a.f76305a.remove(boardId);
        }
        u60.s sVar = this.f69526i0;
        sVar.Z.dispose();
        if (sVar.h0()) {
            LinkedHashMap linkedHashMap2 = jj0.a.f76305a;
            String boardId2 = sVar.L;
            Intrinsics.checkNotNullParameter(boardId2, "boardId");
            jj0.a.f76305a.remove(boardId2);
        }
        sVar.T.j(sVar.f120807f0);
        u60.m mVar = this.f69538o0;
        mVar.X.dispose();
        if (mVar.S != null) {
            LinkedHashMap linkedHashMap3 = jj0.a.f76305a;
            String boardId3 = mVar.L;
            Intrinsics.checkNotNullParameter(boardId3, "boardId");
            jj0.a.f76305a.remove(boardId3);
        }
        u60.s sVar2 = this.f69528j0;
        sVar2.Z.dispose();
        if (sVar2.h0()) {
            LinkedHashMap linkedHashMap4 = jj0.a.f76305a;
            String boardId4 = sVar2.L;
            Intrinsics.checkNotNullParameter(boardId4, "boardId");
            jj0.a.f76305a.remove(boardId4);
        }
        sVar2.T.j(sVar2.f120807f0);
        this.f69524h0.P.dispose();
        super.onDestroy();
    }

    @Override // wk1.n, nr0.d
    public final void onPinClicked(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        rk0.j jVar = this.G;
        if (jVar.G.inOrganize()) {
            jVar.z0(pin);
        } else {
            super.onPinClicked(pin);
        }
    }

    @Override // wk1.q, sq0.a0
    public final void onRecyclerRefresh() {
        if (this.f69543r.f()) {
            BoardRefreshToastView boardRefreshToastView = ((z) ((com.pinterest.feature.board.detail.a) getView())).U1;
            if (boardRefreshToastView == null) {
                Intrinsics.r("refreshFeedPromptView");
                throw null;
            }
            bs1.c.X0(boardRefreshToastView);
            this.Z = false;
        }
        super.onRecyclerRefresh();
    }

    @Override // yk1.b
    public final void onRestore() {
        super.onRestore();
        this.T = false;
        this.U = false;
    }

    @Override // wk1.n, wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        g gVar = this.f69542q0;
        w wVar = this.P;
        wVar.j(gVar);
        wVar.j(this.f69540p0);
        this.f69518e0.c();
        super.onUnbind();
    }

    public final void r4(h32.g0 g0Var, u0 u0Var) {
        v7 v7Var = this.K;
        if (v7Var != null) {
            d0 pinalytics = getPinalytics();
            HashMap hashMap = new HashMap();
            hashMap.put("board_id", v7Var.getUid());
            hashMap.put("board_session_id", this.f69511b);
            hashMap.put("board_pin_count", String.valueOf(v7Var.l1().intValue()));
            pinalytics.f0(u0Var, g0Var, v7Var.getUid(), hashMap, false);
        }
    }

    @Override // com.pinterest.feature.board.organize.h
    public final void s0(LinkedHashSet selectedPins) {
        Intrinsics.checkNotNullParameter(selectedPins, "selectedPins");
        Iterator it = selectedPins.iterator();
        while (it.hasNext()) {
            String uid = ((f30) it.next()).getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            this.f69526i0.X(uid);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x01e6, code lost:
    
        if (r2.l("android_curation_automagical_board_shopping_metadata_quick_save") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b6, code lost:
    
        if (r2.l("android_presence_shopping_affordances_in_grid") == false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s4(com.pinterest.api.model.v7 r30) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hl0.v.s4(com.pinterest.api.model.v7):void");
    }

    public final void t4() {
        v7 v7Var;
        com.pinterest.feature.board.detail.a aVar = (com.pinterest.feature.board.detail.a) getViewIfBound();
        if (aVar != null) {
            boolean z13 = (this.f69525i || (v7Var = this.K) == null || kh2.d.K(v7Var)) ? false : true;
            BoardPinsFilter boardPinsFilter = ((z) aVar).N1;
            if (boardPinsFilter != null) {
                bs1.c.R1(boardPinsFilter, z13);
            } else {
                Intrinsics.r("boardPinsFilter");
                throw null;
            }
        }
    }

    @Override // com.pinterest.feature.board.organize.h
    public final void u0(dl1.s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        u60.s sVar = this.f69526i0;
        sVar.u1(sVar.d().indexOf(model), model);
    }

    public final void u4() {
        List S0;
        if (this.V != 6) {
            return;
        }
        u60.s sVar = this.f69528j0;
        Iterator it = sVar.d().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (((dl1.s) it.next()) instanceof v31.f) {
                break;
            } else {
                i13++;
            }
        }
        boolean z13 = i13 != -1;
        v7 v7Var = this.K;
        if (v7Var != null && (S0 = v7Var.S0()) != null) {
            List list = S0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((b60) it2.next()).e().intValue() == 6) {
                        if (z13) {
                            sVar.removeItem(i13);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        u60.s sVar2 = this.f69526i0;
        Iterator it3 = sVar2.d().iterator();
        int i14 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i14 = -1;
                break;
            } else if (((dl1.s) it3.next()) instanceof hh0) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 != -1) {
            sVar2.removeItem(i14);
        }
        if (z13) {
            return;
        }
        int i15 = oz1.a.favorites_illustration;
        int i16 = oz1.e.empty_state_title_filter_favorites;
        yk1.a aVar = (yk1.a) this.f69546u;
        sVar.P(0, new v31.f(new v31.b(i15, 0, aVar.f139224a.getString(i16), aVar.f139224a.getString(oz1.e.empty_state_message_filter_favorites), "", s.f69497k, new c(this, 2), 2)));
    }

    public final ha2.b0 w3() {
        ha2.b0 I;
        k41.e eVar = k41.f.Companion;
        zo.c cVar = this.f69514c0;
        eVar.getClass();
        I = kg.o.I(k41.e.a(cVar), new f(1, this, v.class, "onBoardViewTypeSelectionChanged", "onBoardViewTypeSelectionChanged(I)V", 0), d70.g.set_view_as, null, null, null, null);
        return I;
    }

    public final void x4(wa2.i pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        wa2.i pinFeatureConfig2 = wa2.i.a(pinFeatureConfig, false, false, false, true, false, false, false, null, null, null, null, -5242881, -1, 1023);
        u60.s sVar = this.f69526i0;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(pinFeatureConfig2, "pinFeatureConfig");
        sVar.o(66, new yi0.a(pinFeatureConfig2, sVar.U));
    }

    public final HashMap z3() {
        HashMap hashMap = new HashMap();
        hashMap.put("board_id", this.f69509a);
        hashMap.put("board_session_id", this.f69511b);
        return hashMap;
    }
}
