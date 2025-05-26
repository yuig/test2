package com.pinterest.feature.home.mainfeed;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.s0;
import androidx.recyclerview.widget.v0;
import androidx.recyclerview.widget.y2;
import ar0.i;
import b20.c;
import c02.u;
import com.pinterest.api.model.PinFeed;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import com.pinterest.feature.home.model.f;
import com.pinterest.feature.home.view.InitialLoadSwipeRefreshLayout;
import com.pinterest.framework.screens.k;
import com.pinterest.ui.grid.GridPlaceholderLoadingLayout;
import com.pinterest.ui.grid.PinterestRecyclerView;
import com.pinterest.ui.tabs.TabBarPlaceholderLoadingLayout;
import es.h;
import ey.b0;
import ey.j3;
import ey.x4;
import h32.a4;
import h32.d4;
import i32.y0;
import is1.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import kh2.k3;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kt0.d;
import lh0.g1;
import lh0.p1;
import lh0.q1;
import lh0.w0;
import lh0.z0;
import lh0.z3;
import m60.f0;
import m60.h0;
import m60.t0;
import nx.d0;
import ny.t;
import oi.o6;
import org.chromium.net.y;
import os0.b;
import pr0.g;
import ps0.a;
import ps0.e;
import ps0.n;
import ps0.o;
import ps0.p;
import ps0.r0;
import ps0.x;
import rg0.s;
import so.oa;
import so.r7;
import so.r8;
import so.s8;
import sq0.i0;
import x02.i2;
import x02.x0;
import xk2.m;
import xk2.v;
import yk1.j;
import yq0.z;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\t\nB\t\b\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/home/mainfeed/HomeFeedFragment;", "Lsq0/n;", "Lps0/e;", "Lcom/pinterest/framework/screens/k;", "", "Lkt0/d;", "Lwk1/d;", "<init>", "()V", "ps0/m", "LayoutManagerException", "homeFeed_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class HomeFeedFragment extends a implements e, k, d, wk1.d {
    public static final /* synthetic */ int U1 = 0;
    public final b A1 = b.f97497a;
    public final v B1 = m.b(new n(this, 3));
    public View C1;
    public ns0.a D1;
    public ur0.e E1;
    public GridPlaceholderLoadingLayout F1;
    public TabBarPlaceholderLoadingLayout G1;
    public RelativeLayout H1;
    public final boolean I1;
    public boolean J1;
    public final xk2.k K1;
    public final p L1;
    public final int M1;
    public final xk2.k N1;
    public se2.a O0;
    public final xk2.k O1;
    public se2.a P0;
    public final v P1;
    public x0 Q0;
    public int Q1;
    public f R0;
    public final i0 R1;
    public h0 S0;
    public final d4 S1;
    public i2 T0;
    public final a4 T1;
    public pb0.a U0;
    public j V0;
    public uk1.e W0;
    public se2.a X0;
    public se2.a Y0;
    public nr0.m Z0;

    /* renamed from: a1, reason: collision with root package name */
    public se2.a f45745a1;

    /* renamed from: b1, reason: collision with root package name */
    public se2.a f45746b1;

    /* renamed from: c1, reason: collision with root package name */
    public bv1.a f45747c1;

    /* renamed from: d1, reason: collision with root package name */
    public se2.a f45748d1;

    /* renamed from: e1, reason: collision with root package name */
    public p1 f45749e1;

    /* renamed from: f1, reason: collision with root package name */
    public q1 f45750f1;

    /* renamed from: g1, reason: collision with root package name */
    public k0 f45751g1;

    /* renamed from: h1, reason: collision with root package name */
    public c f45752h1;

    /* renamed from: i1, reason: collision with root package name */
    public d21.a f45753i1;

    /* renamed from: j1, reason: collision with root package name */
    public lh0.j f45754j1;

    /* renamed from: k1, reason: collision with root package name */
    public se2.a f45755k1;

    /* renamed from: l1, reason: collision with root package name */
    public ac2.p1 f45756l1;

    /* renamed from: m1, reason: collision with root package name */
    public w0 f45757m1;

    /* renamed from: n1, reason: collision with root package name */
    public bc2.e f45758n1;

    /* renamed from: o1, reason: collision with root package name */
    public h f45759o1;

    /* renamed from: p1, reason: collision with root package name */
    public es.a f45760p1;

    /* renamed from: q1, reason: collision with root package name */
    public cz.e f45761q1;

    /* renamed from: r1, reason: collision with root package name */
    public dz.a f45762r1;

    /* renamed from: s1, reason: collision with root package name */
    public r7 f45763s1;

    /* renamed from: t1, reason: collision with root package name */
    public kv.a f45764t1;

    /* renamed from: u1, reason: collision with root package name */
    public kv.c f45765u1;

    /* renamed from: v1, reason: collision with root package name */
    public fs1.a f45766v1;

    /* renamed from: w1, reason: collision with root package name */
    public kt0.c f45767w1;

    /* renamed from: x1, reason: collision with root package name */
    public ps0.c f45768x1;

    /* renamed from: y1, reason: collision with root package name */
    public ps0.d f45769y1;

    /* renamed from: z1, reason: collision with root package name */
    public ps0.b f45770z1;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/home/mainfeed/HomeFeedFragment$LayoutManagerException;", "Landroidx/recyclerview/widget/LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException;", "homeFeed_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class LayoutManagerException extends LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutManagerException(String debugTag, Exception originalException) {
            super(debugTag, originalException);
            Intrinsics.checkNotNullParameter(debugTag, "debugTag");
            Intrinsics.checkNotNullParameter(originalException, "originalException");
        }
    }

    public HomeFeedFragment() {
        int i13 = 0;
        int i14 = 1;
        this.I1 = Build.VERSION.SDK_INT >= 33;
        xk2.n nVar = xk2.n.NONE;
        this.K1 = m.a(nVar, new n(this, i13));
        this.L1 = new p(this);
        this.M1 = t0.p_recycler_view_home;
        this.N1 = m.a(nVar, new n(this, i14));
        this.O1 = m.a(nVar, new n(this, 2));
        this.P1 = m.b(new n(this, 4));
        this.Q1 = -1;
        m.a(nVar, o.f101287i);
        this.R1 = new i0();
        this.Y = true;
        new ny.e(8, 0).i();
        this.S1 = d4.FEED;
        this.T1 = a4.FEED_HOME;
    }

    @Override // nl1.d, fo1.i
    public final void I3() {
        ps0.b bVar = this.f45770z1;
        if (bVar != null) {
            ((r0) bVar).f4(false);
        }
    }

    @Override // sq0.e, np0.f
    public final void I4(String pinUid, PinFeed pinFeed, int i13, int i14, String str) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        String obj = a4.FEED_HOME.toString();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = obj.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        v4(pinUid, pinFeed, i13, i14, new i01.d(str, lowerCase, new ArrayList(e0.b(pinUid))));
        this.Q1 = i14;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void K7() {
        PinterestRecyclerView pinterestRecyclerView;
        super.K7();
        p1 j93 = j9();
        z3 z3Var = lh0.a4.f83297a;
        g1 g1Var = (g1) j93.f83456a;
        int i13 = 0;
        if (g1Var.o("android_traffic_rum_decider", "enabled", z3Var) || g1Var.l("android_traffic_rum_decider")) {
            if (this.f45745a1 == null) {
                Intrinsics.r("baseExperimentsHelper");
                throw null;
            }
            float h10 = ((lh0.o) ((bf2.b) r0).get()).h(0, "android_traffic_rum_decider") / 100.0f;
            ol2.f.f96454a.getClass();
            if (ol2.f.f96455b.h().nextFloat() < h10) {
                new x4(48, 0L, b0.TAG_RUM_REPORTING, (Runnable) new ps0.h(this, i13), false, true).c();
            }
        }
        g1 g1Var2 = (g1) j9().f83456a;
        if (g1Var2.o("android_defer_cedexis_sampling_after_cold_start", "enabled", z3Var) || g1Var2.l("android_defer_cedexis_sampling_after_cold_start")) {
            boolean a13 = j9().a("run_on_hf_render");
            boolean a14 = j9().a("workerthread");
            if (a13) {
                if (a14) {
                    tk2.e.f118017c.b(new ps0.h(this, 1));
                } else {
                    s9();
                }
            }
        } else {
            s9();
        }
        int i14 = this.Q1;
        if (i14 != -1 && (pinterestRecyclerView = this.f139736j0) != null) {
            pinterestRecyclerView.i(i14, 0);
        }
        this.Q1 = -1;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void L7() {
        this.A1.getClass();
        new ny.d(s92.o.ABORTED, null, null, 0, null, false, 62).i();
        super.L7();
    }

    @Override // nl1.d
    public final void O7() {
        ps0.b bVar = this.f45770z1;
        if (bVar != null) {
            ((r0) bVar).f4(false);
        }
    }

    @Override // com.pinterest.framework.screens.k
    public final void P4(Bundle bundle) {
        ps0.b bVar = this.f45770z1;
        if (bVar != null) {
            ((r0) bVar).f4(false);
        }
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE, new l5.a(requireContext, 2));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW, new ps0.v(requireContext, this, 0));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN, new ps0.v(requireContext, this, 1));
    }

    @Override // sq0.e
    public final tq0.b[] S8() {
        tq0.b[] bVarArr = new tq0.b[1];
        pb0.a aVar = this.U0;
        if (aVar != null) {
            bVarArr[0] = new tq0.m(aVar, s7());
            return bVarArr;
        }
        Intrinsics.r("clock");
        throw null;
    }

    @Override // yq0.w
    public final void T0(long j13) {
        ps0.b bVar = this.f45770z1;
        if (bVar != null) {
            RecyclerView g83 = g8();
            if (g83 != null) {
                g83.computeVerticalScrollOffset();
            }
            PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f139734h0;
            boolean z13 = pinterestSwipeRefreshLayout != null ? pinterestSwipeRefreshLayout.f44879m : false;
            r0 r0Var = (r0) bVar;
            if (r0Var.P || !r0Var.isBound() || z13 || r0Var.f109906r.size() <= 0 || j13 <= 300000) {
                return;
            }
            r0Var.f4(false);
        }
    }

    @Override // sq0.e
    public final qa2.n T8(nr0.b pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        d0 s73 = s7();
        y32.f fVar = y32.f.HOMEFEED_LONGPRESS;
        b60.b activeUserManager = getActiveUserManager();
        q1 q1Var = this.f45750f1;
        if (q1Var != null) {
            return new com.pinterest.feature.home.view.b(s73, fVar, pinActionHandler, activeUserManager, q1Var).a(new yk1.a(getResources(), requireContext().getTheme()));
        }
        Intrinsics.r("homeFeedLibraryExperiments");
        throw null;
    }

    @Override // yq0.t, se0.k
    public final void V1() {
        RecyclerView recyclerView = g8();
        if (recyclerView != null) {
            g gVar = (g) this.N1.getValue();
            gVar.getClass();
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            gVar.s(recyclerView);
        }
        super.V1();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        h0 h0Var = this.S0;
        if (h0Var == null) {
            Intrinsics.r("pageSizeProvider");
            throw null;
        }
        se2.a aVar = this.f45745a1;
        if (aVar == null) {
            Intrinsics.r("baseExperimentsHelper");
            throw null;
        }
        Object obj = ((bf2.b) aVar).get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        x xVar = new x(h0Var, (lh0.o) obj);
        f fVar = this.R0;
        if (fVar == null) {
            Intrinsics.r("homeFeedRepository");
            throw null;
        }
        or0.c cVar = new or0.c(xVar, fVar);
        Context requireContext = requireContext();
        nr0.m mVar = this.Z0;
        if (mVar == null) {
            Intrinsics.r("dynamicGridViewBinderDelegateFactory");
            throw null;
        }
        rr0.h hVar = new rr0.h(requireContext, mVar);
        uk1.e eVar = this.W0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        hVar.f109912a = ((uk1.a) eVar).g();
        hVar.f109913b = cVar;
        hVar.f109914c = W8();
        hVar.f109919h = (ky.e) this.B1.getValue();
        x0 x0Var = this.Q0;
        if (x0Var == null) {
            Intrinsics.r("boardRepository");
            throw null;
        }
        hVar.f109925n = x0Var;
        j jVar = this.V0;
        if (jVar == null) {
            Intrinsics.r("mvpBinder");
            throw null;
        }
        hVar.f109926o = jVar;
        i2 i2Var = this.T0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        hVar.f109927p = i2Var;
        hVar.f109929r = com.bumptech.glide.d.G(this, "EXTRA_FROM_BROWSE_TAB", false);
        hVar.f109916e = z7();
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        w0 w0Var = this.f45757m1;
        if (w0Var == null) {
            Intrinsics.r("dynamicFeedLibraryExperiments");
            throw null;
        }
        bc2.e eVar2 = this.f45758n1;
        if (eVar2 == null) {
            Intrinsics.r("mp4TrackSelector");
            throw null;
        }
        ac2.m B7 = B7();
        ac2.p1 p1Var = this.f45756l1;
        if (p1Var == null) {
            Intrinsics.r("videoManagerUtil");
            throw null;
        }
        lh0.j jVar2 = this.f45754j1;
        if (jVar2 == null) {
            Intrinsics.r("adsExperiments");
            throw null;
        }
        es.a aVar2 = this.f45760p1;
        if (aVar2 == null) {
            Intrinsics.r("adFormats");
            throw null;
        }
        kv.a aVar3 = this.f45764t1;
        if (aVar3 == null) {
            Intrinsics.r("adsAudioOverlayPowerscoreExperimentManager");
            throw null;
        }
        kv.c cVar2 = this.f45765u1;
        if (cVar2 == null) {
            Intrinsics.r("organicAudioOverlayPowerscoreExperimentManager");
            throw null;
        }
        h hVar2 = this.f45759o1;
        if (hVar2 == null) {
            Intrinsics.r("adsCommonDisplay");
            throw null;
        }
        c cVar3 = this.f45752h1;
        if (cVar3 == null) {
            Intrinsics.r("prefetchConfig");
            throw null;
        }
        hVar.f109924m = new sq0.m(requireContext2, w0Var, eVar2, B7, p1Var, jVar2, aVar2, aVar3, cVar2, hVar2, cVar3, this.R1.f115002a, sq0.j.UNKNOWN);
        hVar.f109930s = B7();
        rr0.h a13 = hVar.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        r7 r7Var = this.f45763s1;
        if (r7Var == null) {
            Intrinsics.r("homeFeedPresenterFactory");
            throw null;
        }
        ol1.d dVar = new ol1.d(f7());
        r8 r8Var = r7Var.f114089a;
        i2 i2Var2 = (i2) r8Var.f114090a.F3.get();
        s8 s8Var = r8Var.f114091b;
        gs1.a aVar4 = (gs1.a) s8Var.f114230b4.get();
        p1 E5 = s8Var.E5();
        oa oaVar = r8Var.f114090a;
        return new r0(a13, this, dVar, i2Var2, aVar4, E5, (h0) oaVar.f113806m9.get(), (m60.e) oaVar.f113920t0.get(), (zf0.f) oaVar.f113723hd.get(), (mr1.a) oaVar.B6.get(), (tb0.h) oaVar.f113797m0.get(), (s) oaVar.Q5.get(), (b60.b) oaVar.f113850p0.get(), (z0) oaVar.D0.get(), (cz.e) oaVar.V9.get(), (i) s8Var.f114213a2.get(), (nm.o) oaVar.f113833o0.get(), (yk1.v) s8Var.C.get(), (qs.g) oaVar.Qe.get());
    }

    @Override // sq0.e
    public final int Y8() {
        return 0;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        RecyclerView g83 = g8();
        if (g83 == null || g83.computeVerticalScrollOffset() <= 1000) {
            nl1.d.J7();
            return false;
        }
        ps0.b bVar = this.f45770z1;
        if (bVar == null) {
            return true;
        }
        ((r0) bVar).f4(false);
        return true;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF140468f0() {
        return this.T1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF140467e0() {
        return this.S1;
    }

    public final ir.c h9() {
        return (ir.c) this.K1.getValue();
    }

    public final String i9(rg0.f fVar) {
        se2.a aVar = this.f45748d1;
        if (aVar == null) {
            Intrinsics.r("experimentsActivator");
            throw null;
        }
        String g13 = ((g1) ((z0) ((bf2.b) aVar).get())).g("android_biz_creator_metrics_toast", lh0.a4.f83297a);
        if (g13 == null) {
            return null;
        }
        boolean z13 = fVar.e() >= 150;
        boolean z14 = fVar.c() >= 30;
        boolean z15 = fVar.g() >= 1;
        String str = "impressions";
        if (!kotlin.text.z.h(g13, "impressions", false) || !z13) {
            str = "clicks";
            if (!kotlin.text.z.h(g13, "clicks", false) || !z14) {
                str = "saves";
                if (!kotlin.text.z.h(g13, "saves", false) || !z15) {
                    return null;
                }
            }
        }
        return str;
    }

    public final p1 j9() {
        p1 p1Var = this.f45749e1;
        if (p1Var != null) {
            return p1Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    @Override // sq0.e, np0.f
    public final i01.e k0() {
        return new y();
    }

    @Override // yq0.t, ml1.q
    public final void k5() {
        super.k5();
        ps0.c cVar = this.f45768x1;
        if (cVar != null) {
            ((r0) cVar).e4();
        }
    }

    public final int k9() {
        RecyclerView g83;
        RecyclerView g84 = g8();
        if (g84 == null || g84.getChildCount() == 0 || (g83 = g8()) == null) {
            return -1;
        }
        Iterator it = d7.b.O(g83).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int r13 = g8() != null ? RecyclerView.r1((View) it.next()) : -1;
        while (it.hasNext()) {
            int r14 = g8() != null ? RecyclerView.r1((View) it.next()) : -1;
            if (r13 > r14) {
                r13 = r14;
            }
        }
        return r13;
    }

    @Override // sq0.e, yq0.t
    public final g2 l8() {
        return new u(new c02.h(), new f0(), new c02.f(), new c02.g(), c02.i.f24442e);
    }

    public final int l9() {
        l2 l2Var = n8().f19650a;
        PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = l2Var instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) l2Var : null;
        if (pinterestStaggeredGridLayoutManager == null) {
            return k9();
        }
        int[] iArr = new int[2];
        k3.X(pinterestStaggeredGridLayoutManager, iArr, new int[pinterestStaggeredGridLayoutManager.getF19177u()]);
        int i13 = iArr[0];
        return i13 == -1 ? k9() : i13;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(wp1.e.fragment_home_feed_bottom_nav_parallax, this.M1);
        eVar.f979c = wp1.d.empty_state_container;
        eVar.c(wp1.d.homefeed_swipe_container);
        return eVar;
    }

    public final se2.a m9() {
        se2.a aVar = this.O0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("locationUtils");
        throw null;
    }

    @Override // sq0.e, yq0.t
    public final v0 n8() {
        v0 n83 = super.n8();
        l2 l2Var = n83.f19650a;
        PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = l2Var instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) l2Var : null;
        if (pinterestStaggeredGridLayoutManager != null) {
            pinterestStaggeredGridLayoutManager.a1();
        }
        return n83;
    }

    public final se2.a n9() {
        se2.a aVar = this.f45755k1;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("widgetUpsellLibraryExperiments");
        throw null;
    }

    @Override // yq0.t
    public final ar0.f o8() {
        ps0.d dVar = this.f45769y1;
        if (dVar != null) {
            ar0.h hVar = ((r0) dVar).O;
            hVar.getClass();
            if (!hf0.b.q() && hVar.f20383a) {
                return new ps0.j(this);
            }
        }
        return new bk.f();
    }

    public final void o9(int i13) {
        View view;
        View view2 = this.C1;
        if (view2 == null || bs1.c.o1(view2)) {
            View view3 = this.C1;
            if (Intrinsics.c(view3 != null ? Float.valueOf(view3.getAlpha()) : null, 1.0f) && (view = this.C1) != null) {
                view.animate().alpha(0.0f).translationY(bs1.c.b0(view, eo1.c.space_600) * (-1.0f)).setDuration(bs1.c.a1(view, i13)).withEndAction(new q5.z(view, 5)).start();
            }
        }
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        new t(10, 0).i();
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(wp1.d.home_feed_animation_overlay);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.H1 = (RelativeLayout) findViewById;
        f7().h(this.L1);
        return onCreateView;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.C1 = null;
        super.onDestroy();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.J1 = false;
        ns0.a aVar = this.D1;
        if (aVar != null) {
            A8(aVar);
            this.D1 = null;
        }
        C8(this.R1);
        v vVar = this.P1;
        ps0.u listener = (ps0.u) vVar.getValue();
        Intrinsics.checkNotNullParameter(listener, "listener");
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null && (arrayList2 = pinterestRecyclerView.f52531a.C) != null) {
            arrayList2.remove(listener);
        }
        if (this.F1 != null) {
            ps0.u listener2 = (ps0.u) vVar.getValue();
            Intrinsics.checkNotNullParameter(listener2, "listener");
            PinterestRecyclerView pinterestRecyclerView2 = this.f139736j0;
            if (pinterestRecyclerView2 != null && (arrayList = pinterestRecyclerView2.f52531a.C) != null) {
                arrayList.remove(listener2);
            }
        }
        f7().j(this.L1);
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        bv1.a aVar = this.f45747c1;
        if (aVar == null) {
            Intrinsics.r("newsHubBadgeInteractor");
            throw null;
        }
        ek2.f i13 = new fk2.c(1, aVar.a(), ck2.i.f27926f).i(new vy.c(5), new ug0.d(20, ps0.s.f101311l));
        Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
        R6(i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.home.mainfeed.HomeFeedFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void p9() {
        GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout = this.F1;
        if (gridPlaceholderLoadingLayout != null) {
            bs1.c.X0(gridPlaceholderLoadingLayout);
        }
        TabBarPlaceholderLoadingLayout tabBarPlaceholderLoadingLayout = this.G1;
        if (tabBarPlaceholderLoadingLayout != null) {
            bs1.c.X0(tabBarPlaceholderLoadingLayout);
        }
        View findViewById = requireActivity().findViewById(t0.home_feed_view_pager_tab_layout_container);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(0);
    }

    public final void q9() {
        GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout = this.F1;
        if (gridPlaceholderLoadingLayout != null) {
            bs1.c.U1(gridPlaceholderLoadingLayout);
            Z7((ps0.u) this.P1.getValue());
        }
        TabBarPlaceholderLoadingLayout tabBarPlaceholderLoadingLayout = this.G1;
        if (tabBarPlaceholderLoadingLayout != null) {
            bs1.c.U1(tabBarPlaceholderLoadingLayout);
        }
        View findViewById = requireActivity().findViewById(t0.home_feed_view_pager_tab_layout_container);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(4);
    }

    @Override // yq0.t
    public final androidx.recyclerview.widget.t0 r8() {
        return new s0() { // from class: ps0.i
            @Override // androidx.recyclerview.widget.s0
            public final LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException a(Exception originalException) {
                int i13 = HomeFeedFragment.U1;
                HomeFeedFragment this$0 = HomeFeedFragment.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(originalException, "originalException");
                return new HomeFeedFragment.LayoutManagerException(this$0.h8(), originalException);
            }
        };
    }

    public final void r9(y0 placement) {
        ur0.e g13;
        Intrinsics.checkNotNullParameter(placement, "placement");
        g13 = ur0.g.g(placement, this, null);
        this.E1 = g13;
    }

    public final void s9() {
        fs1.a aVar;
        p1 j93 = j9();
        z3 z3Var = lh0.a4.f83297a;
        g1 g1Var = (g1) j93.f83456a;
        if (g1Var.o("android_disable_cedexis_sampling", "enabled", z3Var) || g1Var.l("android_disable_cedexis_sampling") || (aVar = this.f45766v1) == null) {
            return;
        }
        aVar.a();
    }

    public final void t9(View view) {
        RecyclerView g83 = g8();
        if (g83 != null) {
            g83.setPaddingRelative(g83.getPaddingStart(), getResources().getDimensionPixelOffset(eo1.c.space_100), g83.getPaddingEnd(), g83.getPaddingBottom());
        }
        this.F1 = (GridPlaceholderLoadingLayout) view.findViewById(t0.grid_placeholder_loading_layout);
        this.G1 = (TabBarPlaceholderLoadingLayout) requireActivity().findViewById(t0.home_feed_tabs_placeholder_loading_layout);
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f139734h0;
        InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout = pinterestSwipeRefreshLayout instanceof InitialLoadSwipeRefreshLayout ? (InitialLoadSwipeRefreshLayout) pinterestSwipeRefreshLayout : null;
        if (initialLoadSwipeRefreshLayout != null) {
            initialLoadSwipeRefreshLayout.removeView(initialLoadSwipeRefreshLayout.I);
        }
        if (j3.f60517h) {
            q9();
            GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout = this.F1;
            if (gridPlaceholderLoadingLayout != null) {
                q5.x.a(gridPlaceholderLoadingLayout, new o6(gridPlaceholderLoadingLayout, this, 11));
                return;
            }
            return;
        }
        if (j3.f60516g) {
            q9();
            GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout2 = this.F1;
            if (gridPlaceholderLoadingLayout2 != null) {
                gridPlaceholderLoadingLayout2.i();
            }
            TabBarPlaceholderLoadingLayout tabBarPlaceholderLoadingLayout = this.G1;
            if (tabBarPlaceholderLoadingLayout != null) {
                tabBarPlaceholderLoadingLayout.i();
            }
        }
    }

    public final void u9() {
    }

    @Override // nl1.d
    public final y32.f v7() {
        return y32.f.HOMEFEED_LONGPRESS;
    }

    public final void v9() {
        tq.s sVar = new tq.s(getContext(), 1);
        sVar.f19651a = 0;
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.f52531a.f19242n.X0(sVar);
        }
    }

    @Override // wk1.d
    public final y2 x(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView g83 = g8();
        if (g83 != null) {
            return g83.t1(view);
        }
        return null;
    }
}
