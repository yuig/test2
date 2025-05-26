package com.pinterest.feature.search.results.view;

import a.cb;
import a.z0;
import ac2.p1;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.v0;
import androidx.recyclerview.widget.y2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.o00;
import com.pinterest.api.model.px0;
import com.pinterest.design.brio.widget.IconView;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.results.hairpattern.view.HairPatternEducationView;
import com.pinterest.feature.shopping.shoppingcomponents.productfilters.ProductFilterIcon;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.oneBarLibrary.container.view.OneBarContainer;
import com.pinterest.ui.grid.GridPlaceholderLoadingLayout;
import com.pinterest.ui.grid.PinterestRecyclerView;
import com.pinterest.ui.view.AnimatedContainer;
import df.j1;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.u0;
import i32.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jk2.a1;
import kh2.k3;
import kh2.m2;
import kh2.p2;
import kh2.u2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.c4;
import lh0.f3;
import lh0.g3;
import lh0.i3;
import lh0.k2;
import lh0.w0;
import lh0.z3;
import m60.r0;
import net.quikkly.android.utils.BitmapUtils;
import nx.o0;
import so.l3;
import so.l6;
import so.oa;
import sw0.q0;
import t3.s1;
import x02.i2;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/search/results/view/SearchGridMultiSectionFragment;", "Lwk1/k;", "Ldl1/s;", "Lh61/k;", "Lnr0/j;", "Lcom/pinterest/feature/search/results/view/f0;", "Lwk1/d;", "Lde1/f;", "Lta2/a;", "<init>", "()V", "LayoutManagerException", "results_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SearchGridMultiSectionFragment extends g<dl1.s> implements h61.k, f0, wk1.d, de1.f, ta2.a {
    public static final /* synthetic */ int O2 = 0;
    public String A1;
    public final uk2.f A2;
    public PinterestRecyclerView B1;
    public boolean B2;
    public OneBarContainer C1;
    public final a1 C2;
    public ViewGroup D1;
    public zd1.e0 D2;
    public qv1.f E1;
    public final String E2;
    public GridPlaceholderLoadingLayout F1;
    public String F2;
    public AnimatedContainer G1;
    public final xk2.v G2;
    public AnimatedContainer H1;
    public final sq0.i0 H2;
    public g71.f I1;
    public final u I2;
    public x61.j J1;
    public String J2;
    public HairPatternEducationView K1;
    public final t K2;
    public final s L2;
    public FrameLayout M1;
    public final w M2;
    public lc1.o N1;
    public c71.z N2;
    public final xk2.v O1;
    public c71.b0 P1;
    public g3 R0;
    public String R1;
    public k2 S0;
    public String S1;
    public f3 T0;
    public String T1;
    public c4 U0;
    public h61.j U1;
    public lh0.j V0;
    public Integer V1;
    public p1 W0;
    public final p W1;
    public l3 X0;
    public Integer X1;
    public nx.f0 Y0;
    public final androidx.appcompat.widget.q Y1;
    public i2 Z0;
    public boolean Z1;

    /* renamed from: a1, reason: collision with root package name */
    public m60.g0 f47696a1;

    /* renamed from: b1, reason: collision with root package name */
    public dz0.d f47698b1;

    /* renamed from: b2, reason: collision with root package name */
    public final l11.f f47699b2;

    /* renamed from: c1, reason: collision with root package name */
    public c91.e f47700c1;

    /* renamed from: c2, reason: collision with root package name */
    public final z61.b f47701c2;

    /* renamed from: d1, reason: collision with root package name */
    public rg0.s f47702d1;
    public pv1.e d2;

    /* renamed from: e1, reason: collision with root package name */
    public zf0.f f47703e1;

    /* renamed from: e2, reason: collision with root package name */
    public i01.a f47704e2;

    /* renamed from: f1, reason: collision with root package name */
    public yk1.j f47705f1;

    /* renamed from: f2, reason: collision with root package name */
    public h61.i f47706f2;

    /* renamed from: g1, reason: collision with root package name */
    public yk1.v f47707g1;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f47708g2;

    /* renamed from: h1, reason: collision with root package name */
    public pb0.a f47709h1;

    /* renamed from: h2, reason: collision with root package name */
    public int f47710h2;

    /* renamed from: i1, reason: collision with root package name */
    public o0 f47711i1;

    /* renamed from: i2, reason: collision with root package name */
    public List f47712i2;

    /* renamed from: j1, reason: collision with root package name */
    public b20.c f47713j1;

    /* renamed from: j2, reason: collision with root package name */
    public List f47714j2;

    /* renamed from: k1, reason: collision with root package name */
    public i3 f47715k1;

    /* renamed from: k2, reason: collision with root package name */
    public de1.d f47716k2;

    /* renamed from: l1, reason: collision with root package name */
    public dz.a f47717l1;

    /* renamed from: l2, reason: collision with root package name */
    public zd1.d0 f47718l2;

    /* renamed from: m1, reason: collision with root package name */
    public cz.e f47719m1;

    /* renamed from: m2, reason: collision with root package name */
    public final xk2.v f47720m2;

    /* renamed from: n1, reason: collision with root package name */
    public vy.m f47721n1;

    /* renamed from: n2, reason: collision with root package name */
    public eq0.m f47722n2;

    /* renamed from: o1, reason: collision with root package name */
    public i92.k f47723o1;

    /* renamed from: o2, reason: collision with root package name */
    public String f47724o2;

    /* renamed from: p1, reason: collision with root package name */
    public lb0.q f47725p1;

    /* renamed from: p2, reason: collision with root package name */
    public eq0.n f47726p2;

    /* renamed from: q1, reason: collision with root package name */
    public l6 f47727q1;

    /* renamed from: q2, reason: collision with root package name */
    public d4 f47728q2;

    /* renamed from: r1, reason: collision with root package name */
    public w0 f47729r1;

    /* renamed from: r2, reason: collision with root package name */
    public a4 f47730r2;

    /* renamed from: s1, reason: collision with root package name */
    public bc2.e f47731s1;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f47732s2;

    /* renamed from: t1, reason: collision with root package name */
    public es.a f47733t1;

    /* renamed from: t2, reason: collision with root package name */
    public final xk2.v f47734t2;

    /* renamed from: u1, reason: collision with root package name */
    public kv.a f47735u1;

    /* renamed from: u2, reason: collision with root package name */
    public Runnable f47736u2;

    /* renamed from: v1, reason: collision with root package name */
    public kv.c f47737v1;

    /* renamed from: v2, reason: collision with root package name */
    public final xk2.v f47738v2;

    /* renamed from: w1, reason: collision with root package name */
    public es.h f47739w1;

    /* renamed from: w2, reason: collision with root package name */
    public final xk2.v f47740w2;

    /* renamed from: x1, reason: collision with root package name */
    public long f47741x1;

    /* renamed from: x2, reason: collision with root package name */
    public final b f47742x2;

    /* renamed from: y1, reason: collision with root package name */
    public ViewGroup f47743y1;

    /* renamed from: y2, reason: collision with root package name */
    public int f47744y2;

    /* renamed from: z1, reason: collision with root package name */
    public ProductFilterIcon f47745z1;

    /* renamed from: z2, reason: collision with root package name */
    public final k81.k f47746z2;
    public final int L1 = (int) (hf0.b.f69003c / 2);
    public String Q1 = "";

    /* renamed from: a2, reason: collision with root package name */
    public Boolean f47697a2 = Boolean.FALSE;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/search/results/view/SearchGridMultiSectionFragment$LayoutManagerException;", "Landroidx/recyclerview/widget/LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException;", "results_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class LayoutManagerException extends LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutManagerException(String debugTag, Exception originalException) {
            super(debugTag, originalException);
            Intrinsics.checkNotNullParameter(debugTag, "debugTag");
            Intrinsics.checkNotNullParameter(originalException, "originalException");
        }
    }

    public SearchGridMultiSectionFragment() {
        int i13 = 1;
        this.O1 = xk2.m.b(new r(this, i13));
        l11.f fVar = new l11.f();
        this.f47699b2 = fVar;
        this.f47701c2 = new z61.b(fVar);
        this.f47720m2 = xk2.m.b(new r(this, 4));
        this.f47728q2 = d4.SEARCH;
        this.f47730r2 = a4.SEARCH_PINS;
        this.f47734t2 = xk2.m.b(v.f47830i);
        this.f47738v2 = xk2.m.b(new r(this, 5));
        this.f47740w2 = xk2.m.b(new r(this, 2));
        this.f47742x2 = new b(this, i13);
        this.f47744y2 = -1;
        this.f47746z2 = new k81.k();
        uk2.f r13 = cb.r("create(...)");
        this.A2 = r13;
        a1 a1Var = new a1(r13);
        Intrinsics.checkNotNullExpressionValue(a1Var, "hide(...)");
        this.C2 = a1Var;
        this.E2 = "search";
        this.G2 = xk2.m.b(new r(this, 17));
        this.H2 = new sq0.i0();
        this.I2 = new u(this);
        this.K2 = new t(this);
        this.L2 = new s(this);
        this.M2 = new w(this);
        this.Y = true;
        this.M = false;
        this.W1 = new p(this);
        this.Y1 = new androidx.appcompat.widget.q(this, 0);
    }

    public static final void j9(SearchGridMultiSectionFragment searchGridMultiSectionFragment, y0 y0Var, Map map) {
        rg0.s sVar = searchGridMultiSectionFragment.f47702d1;
        if (sVar == null) {
            Intrinsics.r("experiences");
            throw null;
        }
        nl.b.s(s1.f(new jk2.v(((dh0.d) sVar).g(y0Var, map, new tg0.c(false, false)), new u51.b(16, new y(searchGridMultiSectionFragment)), ck2.i.f27923c, 1).H(tk2.e.f118017c), "observeOn(...)"), new y11.c(25, y0Var, searchGridMultiSectionFragment), null, null, 6);
    }

    @Override // h61.k
    public final void A0() {
        this.M = true;
    }

    @Override // h61.k
    public final void A3(n0 searchBarListener) {
        Intrinsics.checkNotNullParameter(searchBarListener, "searchBarListener");
        ViewGroup viewGroup = this.f47743y1;
        StaticSearchBarView staticSearchBarView = viewGroup instanceof StaticSearchBarView ? (StaticSearchBarView) viewGroup : null;
        if (staticSearchBarView != null) {
            staticSearchBarView.d(searchBarListener);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (pe.i.P0(r11, r2, r3.i(), r10.f47708g2) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r11 = i7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r11 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        ((com.pinterest.gestalt.toolbar.GestaltToolbarImpl) r11).H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        r0 = s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.VIEW, (r18 & 2) != 0 ? null : h32.u0.FILTER_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r11.k(), "personal_boutique") != false) goto L20;
     */
    @Override // de1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B4(boolean r11) {
        /*
            r10 = this;
            com.pinterest.feature.shopping.shoppingcomponents.productfilters.ProductFilterIcon r0 = r10.f47745z1
            boolean r0 = bs1.c.o1(r0)
            if (r0 != r11) goto L9
            return
        L9:
            com.pinterest.feature.shopping.shoppingcomponents.productfilters.ProductFilterIcon r0 = r10.f47745z1
            bs1.c.R1(r0, r11)
            if (r11 == 0) goto L6a
            c71.b0 r11 = r10.P1
            r0 = 0
            java.lang.String r1 = "searchParameters"
            if (r11 == 0) goto L37
            b60.b r11 = com.bumptech.glide.d.E()
            com.pinterest.feature.search.results.view.r r2 = new com.pinterest.feature.search.results.view.r
            r3 = 3
            r2.<init>(r10, r3)
            c71.b0 r3 = r10.P1
            if (r3 == 0) goto L33
            h61.h r3 = r3.i()
            boolean r4 = r10.f47708g2
            boolean r11 = pe.i.P0(r11, r2, r3, r4)
            if (r11 != 0) goto L47
            goto L37
        L33:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r0
        L37:
            c71.b0 r11 = r10.P1
            if (r11 == 0) goto L66
            java.lang.String r11 = r11.k()
            java.lang.String r0 = "personal_boutique"
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r0)
            if (r11 == 0) goto L52
        L47:
            fo1.a r11 = r10.i7()
            if (r11 == 0) goto L52
            com.pinterest.gestalt.toolbar.GestaltToolbarImpl r11 = (com.pinterest.gestalt.toolbar.GestaltToolbarImpl) r11
            r11.H()
        L52:
            nx.d0 r0 = r10.s7()
            h32.f1 r1 = h32.f1.VIEW
            h32.u0 r2 = h32.u0.FILTER_BUTTON
            r7 = 0
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = 508(0x1fc, float:7.12E-43)
            nx.d0.D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L6a
        L66:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r0
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment.B4(boolean):void");
    }

    @Override // h61.k
    public final void B6(ov1.d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        pv1.e eVar = this.d2;
        if (eVar == null) {
            return;
        }
        eVar.M3(listener);
    }

    @Override // h61.k
    public final void C3() {
        k9().p();
        FragmentActivity E4 = E4();
        if (E4 != null) {
            pk.a0.d1(E4);
        }
        FrameLayout frameLayout = this.M1;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        HairPatternEducationView hairPatternEducationView = this.K1;
        if (hairPatternEducationView != null) {
            hairPatternEducationView.g().scrollTo(0, 0);
        }
        f7().d(new r70.h(true, false));
    }

    @Override // ta2.a
    public final ta2.b D() {
        c71.z zVar = this.N2;
        if (zVar != null) {
            return zVar.D();
        }
        return null;
    }

    @Override // h61.k
    public final void E3(boolean z13) {
        ViewGroup viewGroup = this.f47743y1;
        StaticSearchBarView staticSearchBarView = viewGroup instanceof StaticSearchBarView ? (StaticSearchBarView) viewGroup : null;
        if (staticSearchBarView != null) {
            bs1.c.R1(staticSearchBarView, z13);
        }
        ViewGroup viewGroup2 = this.f47743y1;
        GestaltStaticSearchBar gestaltStaticSearchBar = viewGroup2 instanceof GestaltStaticSearchBar ? (GestaltStaticSearchBar) viewGroup2 : null;
        if (gestaltStaticSearchBar != null) {
            oe.f.n(gestaltStaticSearchBar, new i31.a(z13, 19));
        }
    }

    @Override // h61.k
    public final void G4(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ViewGroup viewGroup = this.f47743y1;
        StaticSearchBarView staticSearchBarView = viewGroup instanceof StaticSearchBarView ? (StaticSearchBarView) viewGroup : null;
        if (staticSearchBarView != null) {
            staticSearchBarView.e(text);
        }
        ViewGroup viewGroup2 = this.f47743y1;
        GestaltStaticSearchBar gestaltStaticSearchBar = viewGroup2 instanceof GestaltStaticSearchBar ? (GestaltStaticSearchBar) viewGroup2 : null;
        if (gestaltStaticSearchBar != null) {
            oe.f.n(gestaltStaticSearchBar, new b31.f(text, 15));
        }
    }

    @Override // de1.f
    public final void H2(c71.p listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        nx.f0 f0Var = this.Y0;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        de1.m0 m0Var = new de1.m0(new n70.o(this, f0Var, 6), p7(), "", new yk1.a(getResources(), requireContext().getTheme()), listener, this.Q1, ((Boolean) this.f47720m2.getValue()).booleanValue(), 48);
        m0Var.j(zd1.p.PRODUCT_FILTER_SOURCE_SEARCH);
        this.f47718l2 = m0Var;
    }

    @Override // h61.k
    public final void I2(v61.a hairPattern, lb0.o preferencesManager) {
        Intrinsics.checkNotNullParameter(hairPattern, "hairPattern");
        Intrinsics.checkNotNullParameter(preferencesManager, "preferencesManager");
        String a13 = hairPattern.a();
        x61.j jVar = this.J1;
        if (jVar != null) {
            String str = this.Q1;
            c71.b0 b0Var = this.P1;
            if (b0Var == null) {
                Intrinsics.r("searchParameters");
                throw null;
            }
            h61.h i13 = b0Var.i();
            p2.a1(jVar, s7(), f7(), m9(), i13, str, a13);
        }
    }

    @Override // sq0.e, np0.f
    public final void I4(String pinUid, PinFeed pinFeed, int i13, int i14, String str) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        super.I4(pinUid, pinFeed, i13, i14, str);
        i01.a aVar = this.f47704e2;
        if (aVar != null) {
            aVar.onPinClicked(i14);
        }
    }

    @Override // h61.k
    public final void J0(ca2.b bVar) {
        k9().q(bVar);
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void K7() {
        PinterestRecyclerView pinterestRecyclerView;
        super.K7();
        int i13 = this.f47744y2;
        int i14 = 0;
        if (i13 != -1 && (pinterestRecyclerView = this.f139736j0) != null) {
            pinterestRecyclerView.i(i13, 0);
        }
        this.f47744y2 = -1;
        requireActivity().getWindow().addFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        ((Handler) this.f47734t2.getValue()).postDelayed(new n(this, i14), 300000L);
        OneBarContainer oneBarContainer = this.C1;
        if (oneBarContainer != null) {
            oneBarContainer.onActivated();
        } else {
            Intrinsics.r("oneBarContainerView");
            throw null;
        }
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void L7() {
        OneBarContainer oneBarContainer = this.C1;
        if (oneBarContainer == null) {
            Intrinsics.r("oneBarContainerView");
            throw null;
        }
        oneBarContainer.onDeactivated();
        requireActivity().getWindow().clearFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        ((Handler) this.f47734t2.getValue()).removeCallbacksAndMessages(null);
        super.L7();
    }

    @Override // h61.k
    public final void M(h61.j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.U1 = listener;
    }

    @Override // yq0.t
    public final void M8(boolean z13) {
        if (!l9().e()) {
            super.M8(z13);
            return;
        }
        if (!z13) {
            RecyclerView g83 = g8();
            if (g83 != null) {
                g83.setBackgroundColor(bs1.c.C(this, eo1.b.color_themed_background_default));
            }
            GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout = this.F1;
            if (gridPlaceholderLoadingLayout != null) {
                bs1.c.X0(gridPlaceholderLoadingLayout);
            }
            qv1.f fVar = this.E1;
            if (fVar != null) {
                bs1.c.X0(fVar);
            }
            se0.c f83 = f8();
            if (f83 != null) {
                f83.showLoadingSpinner(false);
                return;
            }
            return;
        }
        RecyclerView g84 = g8();
        if (g84 != null) {
            g84.setBackgroundColor(bs1.c.C(this, eo1.b.color_themed_transparent));
        }
        GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout2 = this.F1;
        if (gridPlaceholderLoadingLayout2 != null) {
            bs1.c.U1(gridPlaceholderLoadingLayout2);
        }
        GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout3 = this.F1;
        if (gridPlaceholderLoadingLayout3 != null) {
            gridPlaceholderLoadingLayout3.i();
        }
        qv1.f fVar2 = this.E1;
        if (fVar2 != null) {
            bs1.c.U1(fVar2);
        }
        qv1.f fVar3 = this.E1;
        if (fVar3 != null) {
            fVar3.d();
        }
    }

    @Override // h61.k
    public final void N(String bodyType) {
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        View requireView = requireView();
        Intrinsics.checkNotNullExpressionValue(requireView, "requireView(...)");
        m2.M1(requireView, this.Q1, bodyType, f7(), s7(), m9());
    }

    @Override // h61.k
    public final void N0(h61.i backButtonListener) {
        Intrinsics.checkNotNullParameter(backButtonListener, "backButtonListener");
        this.f47706f2 = backButtonListener;
    }

    @Override // h61.k
    public final void N1(List skinToneFilters, e71.a aVar) {
        Integer num;
        Intrinsics.checkNotNullParameter(skinToneFilters, "skinToneFilters");
        if (skinToneFilters.isEmpty() || getContext() == null) {
            return;
        }
        this.f47714j2 = skinToneFilters;
        Object obj = aVar == null ? this.R1 : aVar;
        if (obj != null) {
            Intrinsics.checkNotNullParameter(skinToneFilters, "<this>");
            num = Integer.valueOf(skinToneFilters.indexOf(obj));
        } else {
            num = null;
        }
        this.V1 = num;
        AnimatedContainer animatedContainer = this.H1;
        if (animatedContainer != null) {
            ViewGroup viewGroup = this.D1;
            if (viewGroup == null) {
                Intrinsics.r("searchContentContainer");
                throw null;
            }
            viewGroup.removeView(animatedContainer);
        }
        Context context = getContext();
        if (context != null) {
            AnimatedContainer animatedContainer2 = new AnimatedContainer((ye2.m) context);
            animatedContainer2.setGravity(1);
            d71.b bVar = d71.b.SEARCH;
            c4 c4Var = this.U0;
            if (c4Var == null) {
                Intrinsics.r("skinToneLibraryExperiments");
                throw null;
            }
            g71.f fVar = new g71.f(context, bVar, c4Var);
            this.I1 = fVar;
            e71.b bVar2 = e71.b.ROUNDED_RECT;
            yk1.v n93 = n9();
            Integer num2 = this.V1;
            a4 a4Var = this.f47730r2;
            c4 c4Var2 = this.U0;
            if (c4Var2 == null) {
                Intrinsics.r("skinToneLibraryExperiments");
                throw null;
            }
            f71.a listener = new f71.a(bVar2, this.W1, n93, num2, skinToneFilters, a4Var, null, null, c4Var2, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
            listener.bind(fVar);
            fVar.i(getResources().getString(l42.e.search_results_skin_tone_title));
            Intrinsics.checkNotNullParameter(listener, "listener");
            fVar.f63897b = listener;
            fVar.setPaddingRelative(fVar.getPaddingStart(), fVar.getPaddingTop(), fVar.getPaddingEnd(), getResources().getDimensionPixelSize(eo1.c.space_300));
            a4 a4Var2 = this.f47730r2;
            h32.g0 g0Var = h32.g0.SKIN_TONE_FILTERS;
            d4 viewType = d4.SEARCH;
            Intrinsics.checkNotNullParameter(viewType, "viewType");
            nx.d0 a13 = sh.f.a();
            HashMap o13 = ep.b.o("story_type", "skin_tone_filters");
            h32.i0 i0Var = new h32.i0(viewType, a4Var2, null, g0Var, null, null);
            f1 f1Var = f1.VIEW;
            Intrinsics.f(a13);
            a13.U(i0Var, f1Var, null, null, o13, false);
            animatedContainer2.addView(fVar);
            this.H1 = animatedContainer2;
            ViewGroup viewGroup2 = this.D1;
            if (viewGroup2 == null) {
                Intrinsics.r("searchContentContainer");
                throw null;
            }
            int indexOfChild = viewGroup2.indexOfChild(this.G1) + 1;
            ViewGroup viewGroup3 = this.D1;
            if (viewGroup3 != null) {
                viewGroup3.addView(this.H1, indexOfChild);
            } else {
                Intrinsics.r("searchContentContainer");
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01cb, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r7 == null ? r7.G2() : null, "US") == false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c6  */
    @Override // jl1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N6(java.lang.String r34, android.os.Bundle r35) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment.N6(java.lang.String, android.os.Bundle):void");
    }

    @Override // h61.k
    public final void O0() {
        int i13 = 1;
        if (this.K1 == null) {
            View view = getView();
            CoordinatorLayout coordinatorLayout = view instanceof CoordinatorLayout ? (CoordinatorLayout) view : null;
            if (coordinatorLayout != null) {
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                FrameLayout frameLayout = new FrameLayout(requireContext);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setOnClickListener(new o(this, i13));
                Context context = frameLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                frameLayout.setBackgroundColor(dl2.b.x0(context, eo1.a.sema_color_background_wash_dark));
                frameLayout.setVisibility(8);
                this.M1 = frameLayout;
                coordinatorLayout.addView(frameLayout);
                Context requireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                HairPatternEducationView hairPatternEducationView = new HairPatternEducationView(requireContext2);
                coordinatorLayout.addView(hairPatternEducationView);
                hairPatternEducationView.f47652d = new r(this, 18);
                ViewGroup.LayoutParams layoutParams = hairPatternEducationView.getLayoutParams();
                androidx.coordinatorlayout.widget.c cVar = layoutParams instanceof androidx.coordinatorlayout.widget.c ? (androidx.coordinatorlayout.widget.c) layoutParams : null;
                if (cVar != null) {
                    cVar.d(new BottomSheetBehavior());
                }
                k9().m(hairPatternEducationView);
                this.K1 = hairPatternEducationView;
            }
        }
        HairPatternEducationView hairPatternEducationView2 = this.K1;
        if (hairPatternEducationView2 != null) {
            hairPatternEducationView2.post(new n(this, i13));
        }
    }

    @Override // h61.k
    public final void P(p42.c inclusiveFilterType) {
        Intrinsics.checkNotNullParameter(inclusiveFilterType, "inclusiveFilterType");
        HashMap hashMap = new HashMap();
        hashMap.put(rg0.o.CONTEXT_SEARCH_QUERY.getValue(), this.Q1);
        String value = rg0.o.ELIGIBLE_REFINEMENT_FILTER_IDS.getValue();
        int i13 = q.f47824a[inclusiveFilterType.ordinal()];
        hashMap.put(value, kotlin.collections.e0.b(i13 != 1 ? i13 != 2 ? "body_type_range" : "skin_color_bucket_id" : "hair_pattern_id"));
        p9(hashMap);
    }

    @Override // h61.k
    public final void P3(e71.a skinToneFilter) {
        g71.f fVar;
        Intrinsics.checkNotNullParameter(skinToneFilter, "skinToneFilter");
        String term = skinToneFilter.getTerm();
        if (term == null || (fVar = this.I1) == null) {
            return;
        }
        lb0.q m93 = m9();
        String str = this.Q1;
        c71.b0 b0Var = this.P1;
        if (b0Var == null) {
            Intrinsics.r("searchParameters");
            throw null;
        }
        u2.W0(fVar, s7(), f7(), m93, b0Var.i(), str, term);
    }

    @Override // h61.k
    public final void Q0(int i13, String query, String bodyType, List items) {
        o00 v13;
        String t13;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(query, "query");
        PinterestRecyclerView pinterestRecyclerView = this.B1;
        if (pinterestRecyclerView == null) {
            Intrinsics.r("searchHeaderRecyclerView");
            throw null;
        }
        boolean z13 = false;
        pinterestRecyclerView.setVisibility(0);
        pv1.e eVar = this.d2;
        if (eVar != null) {
            eVar.x3(items);
            if (bodyType != null && bodyType.length() != 0) {
                Intrinsics.checkNotNullParameter(bodyType, "bodyType");
                xv1.k kVar = eVar.f101486p;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(bodyType, "bodyType");
                kVar.f136076g = bodyType;
            }
            List y03 = CollectionsKt.y0(items, getResources().getInteger(l42.c.search_header_first_page));
            if (!(y03 instanceof Collection) || !y03.isEmpty()) {
                Iterator it = y03.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if ((next instanceof g00) && (v13 = ((g00) next).v()) != null && (t13 = v13.t()) != null && (!kotlin.text.z.j(t13))) {
                        z13 = true;
                        break;
                    }
                }
            }
            OneBarContainer oneBarContainer = this.C1;
            if (oneBarContainer == null) {
                Intrinsics.r("oneBarContainerView");
                throw null;
            }
            pr0.g gVar = oneBarContainer.f49982f;
            if (gVar != null) {
                gVar.r(z13);
            }
            eVar.f101482l = this.f47712i2;
            eVar.f101483m = this.f47714j2;
            eVar.K3();
        }
        if (i13 != 0) {
            addScrollListener(new x(this, i13));
            return;
        }
        AnimatedContainer animatedContainer = this.G1;
        if (animatedContainer != null) {
            ValueAnimator valueAnimator = animatedContainer.f52664a;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            ValueAnimator valueAnimator2 = animatedContainer.f52665b;
            if (valueAnimator2 != null) {
                valueAnimator2.end();
            }
            int i14 = animatedContainer.f52668e;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(animatedContainer.getLayoutParams());
            layoutParams.height = i14;
            animatedContainer.setLayoutParams(layoutParams);
            animatedContainer.setAlpha(1.0f);
            animatedContainer.f52667d = true;
        }
    }

    @Override // h61.k
    public final void Q1(String emptyErrorMessage) {
        Intrinsics.checkNotNullParameter(emptyErrorMessage, "emptyErrorMessage");
        yq0.z zVar = (yq0.z) this.f139732f0;
        if (zVar == null || zVar.f139759e.a() != 0) {
            return;
        }
        F8(emptyErrorMessage);
    }

    @Override // h61.k
    public final void Q2(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        ViewGroup viewGroup = this.D1;
        if (viewGroup == null) {
            Intrinsics.r("searchContentContainer");
            throw null;
        }
        viewGroup.setContentDescription(viewGroup.getResources().getString(l42.e.content_description_search_results, query));
        viewGroup.sendAccessibilityEvent(8);
        viewGroup.requestFocus();
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int i13 = 24;
        adapter.G(59, new q0(requireContext, i13));
        adapter.G(60, new r(this, 16));
        adapter.G(56, new b01.c(i13, requireContext, this));
        adapter.G(57, new q0(requireContext, 25));
        adapter.H(new int[]{RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE, RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY}, new q0(requireContext, 26));
        adapter.G(45, new q0(requireContext, 27));
        adapter.G(46, new q0(requireContext, 28));
        adapter.G(47, new q0(requireContext, 29));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN, new b0(requireContext, 0));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SEARCH_BOARD_CELL, new r(this, 6));
        adapter.G(61, new r(this, 7));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION, new r(this, 8));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN, new r(this, 9));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW, new r(this, 10));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_GRID, new r(this, 11));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_CARD, new r(this, 12));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_THUMBNAIL, new r(this, 13));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE, new r(this, 14));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF, new r(this, 15));
        dz0.d dVar = this.f47698b1;
        if (dVar != null) {
            dVar.a(adapter, requireContext, s7(), W8(), p7(), i91.u.SEARCH_FEED);
        } else {
            Intrinsics.r("oneTapUtils");
            throw null;
        }
    }

    @Override // h61.k
    public final void R5(String pinImageUrl, String displayText) {
        Intrinsics.checkNotNullParameter(pinImageUrl, "pinImageUrl");
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        lc1.o oVar = this.N1;
        if (oVar != null) {
            oVar.a(pinImageUrl);
        }
        lc1.o oVar2 = this.N1;
        if (oVar2 != null) {
            oVar2.b(displayText);
        }
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        String A;
        super.R7(navigation);
        if (navigation != null) {
            c71.b0 D = pe.i.D(navigation);
            String l13 = Intrinsics.d(D.h(), "guide") ? null : D.l();
            if (l13 == null && (A = pe.i.A(m9())) != null) {
                l13 = l9().g() ? A : null;
            }
            D.p(l13);
            this.P1 = D;
            this.Q1 = D.g();
            c71.b0 b0Var = this.P1;
            if (b0Var == null) {
                Intrinsics.r("searchParameters");
                throw null;
            }
            String m13 = b0Var.m();
            this.f47708g2 = !(m13 == null || kotlin.text.z.j(m13));
            c71.b0 b0Var2 = this.P1;
            if (b0Var2 == null) {
                Intrinsics.r("searchParameters");
                throw null;
            }
            this.R1 = b0Var2.l();
            c71.b0 b0Var3 = this.P1;
            if (b0Var3 == null) {
                Intrinsics.r("searchParameters");
                throw null;
            }
            this.S1 = b0Var3.f();
            c71.b0 b0Var4 = this.P1;
            if (b0Var4 == null) {
                Intrinsics.r("searchParameters");
                throw null;
            }
            this.T1 = b0Var4.d();
            c71.b0 b0Var5 = this.P1;
            if (b0Var5 == null) {
                Intrinsics.r("searchParameters");
                throw null;
            }
            Boolean o13 = b0Var5.o();
            if (o13 == null) {
                o13 = Boolean.FALSE;
            }
            this.f47697a2 = o13;
            this.Z1 = navigation.S("com.pinterest.EXTRA_CONVERSATION_SEND_A_PIN_SEARCH", false);
            this.f47710h2 = navigation.J1("com.pinterest.EXTRA_APPLIED_FILTER_COUNT");
            Object i03 = navigation.i0("com.pinterest.EXTRA_CONVO_ID");
            this.f47724o2 = i03 instanceof String ? (String) i03 : null;
            Object i04 = navigation.i0("com.pinterest.EXTRA_CONVO_THREAD_ANCHOR_ID");
            String str = i04 instanceof String ? (String) i04 : null;
            Object i05 = navigation.i0("com.pinterest.EXTRA_CONVO_THREAD_ID");
            this.f47726p2 = str != null ? new eq0.n(i05 instanceof String ? (String) i05 : null, str, null, null, false) : null;
            Object i06 = navigation.i0("com.pinterest.EXTRA_SEARCH_INLINE_FILTER_MANAGER");
            zd1.e0 e0Var = i06 instanceof zd1.e0 ? (zd1.e0) i06 : null;
            if (e0Var == null) {
                e0Var = new zd1.e0();
            }
            this.D2 = e0Var;
            c71.b0 b0Var6 = this.P1;
            if (b0Var6 == null) {
                Intrinsics.r("searchParameters");
                throw null;
            }
            if (Intrinsics.d(b0Var6.h(), "style_summary")) {
                this.F2 = navigation.g2("com.pinterest.EXTRA_INSIGHT_ID", "");
            }
            this.B2 = navigation.S("com.pinterest.EXTRA_IS_DEEPLINK", false);
        }
    }

    @Override // h61.k
    public final void S1(List hairPatternFilters, v61.a aVar) {
        Object obj;
        Integer num;
        Intrinsics.checkNotNullParameter(hairPatternFilters, "hairPatternFilters");
        if (hairPatternFilters.isEmpty() || getContext() == null) {
            return;
        }
        this.f47712i2 = hairPatternFilters;
        Iterator it = hairPatternFilters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            v61.a aVar2 = (v61.a) obj;
            if (aVar != null && aVar2.b() == aVar.b()) {
                break;
            }
        }
        v61.a aVar3 = (v61.a) obj;
        String str = this.S1;
        int i13 = -1;
        if (str != null && str.length() != 0) {
            Iterator it2 = hairPatternFilters.iterator();
            int i14 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.d(((v61.a) it2.next()).a(), this.S1)) {
                    i13 = i14;
                    break;
                }
                i14++;
            }
            num = Integer.valueOf(i13);
        } else if (aVar3 != null) {
            Iterator it3 = hairPatternFilters.iterator();
            int i15 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (((v61.a) it3.next()).b() == aVar3.b()) {
                    i13 = i15;
                    break;
                }
                i15++;
            }
            num = Integer.valueOf(i13);
        } else {
            num = null;
        }
        this.X1 = num;
        AnimatedContainer animatedContainer = this.H1;
        if (animatedContainer != null) {
            View childAt = animatedContainer.getChildAt(0);
            x61.j jVar = childAt instanceof x61.j ? (x61.j) childAt : null;
            r3 = jVar != null ? jVar.b() : 0;
            ViewGroup viewGroup = this.D1;
            if (viewGroup == null) {
                Intrinsics.r("searchContentContainer");
                throw null;
            }
            viewGroup.removeView(this.H1);
        }
        int i16 = r3;
        Context context = getContext();
        if (context != null) {
            AnimatedContainer animatedContainer2 = new AnimatedContainer((ye2.m) context);
            animatedContainer2.setGravity(1);
            i3 i3Var = this.f47715k1;
            if (i3Var == null) {
                Intrinsics.r("searchResultsLibraryExperiments");
                throw null;
            }
            x61.j jVar2 = new x61.j(context, i16, null, i3Var, 12);
            this.J1 = jVar2;
            yk1.v n93 = n9();
            m60.w f73 = f7();
            Integer num2 = this.X1;
            a4 a4Var = this.f47730r2;
            nx.d0 s73 = s7();
            i3 i3Var2 = this.f47715k1;
            if (i3Var2 == null) {
                Intrinsics.r("searchResultsLibraryExperiments");
                throw null;
            }
            w61.a aVar4 = new w61.a(this.Y1, hairPatternFilters, n93, f73, num2, a4Var, s73, null, i3Var2, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            aVar4.bind(jVar2);
            jVar2.g(aVar4);
            jVar2.setPaddingRelative(jVar2.getPaddingStart(), jVar2.getPaddingTop(), jVar2.getPaddingEnd(), getResources().getDimensionPixelSize(eo1.c.space_300));
            d71.d.d(a4.SEARCH_AUTOCOMPLETE, h32.g0.HAIR_PATTERN_FILTERS);
            animatedContainer2.addView(jVar2);
            if (i16 == 0 && aVar3 != null) {
                jVar2.e(hairPatternFilters, aVar3);
            }
            this.H1 = animatedContainer2;
            ViewGroup viewGroup2 = this.D1;
            if (viewGroup2 == null) {
                Intrinsics.r("searchContentContainer");
                throw null;
            }
            int indexOfChild = viewGroup2.indexOfChild(this.G1) + 1;
            ViewGroup viewGroup3 = this.D1;
            if (viewGroup3 != null) {
                viewGroup3.addView(this.H1, indexOfChild);
            } else {
                Intrinsics.r("searchContentContainer");
                throw null;
            }
        }
    }

    @Override // h61.k
    public final void S4(boolean z13) {
        if (z13) {
            AnimatedContainer animatedContainer = this.G1;
            if (animatedContainer != null) {
                animatedContainer.setVisibility(8);
            }
        } else {
            AnimatedContainer animatedContainer2 = this.G1;
            if (animatedContainer2 != null) {
                animatedContainer2.a();
            }
        }
        PinterestRecyclerView pinterestRecyclerView = this.B1;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.setVisibility(8);
        } else {
            Intrinsics.r("searchHeaderRecyclerView");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, com.pinterest.feature.search.results.view.StaticSearchBarView] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, com.pinterest.gestalt.searchField.GestaltStaticSearchBar] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.pinterest.gestalt.toolbar.GestaltToolbarImpl] */
    /* JADX WARN: Type inference failed for: r5v23, types: [com.pinterest.gestalt.toolbar.GestaltToolbarImpl] */
    @Override // sq0.e, nl1.d
    public final void S7(fo1.a toolbar) {
        ?? staticSearchBarView;
        IconView w13;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.S7(toolbar);
        fo1.a i73 = i7();
        if (i73 != null && (w13 = ((GestaltToolbarImpl) i73).w()) != null) {
            w13.setColorFilter(bs1.c.C(this, eo1.b.color_themed_text_default));
        }
        c71.b0 b0Var = this.P1;
        if (b0Var == null) {
            Intrinsics.r("searchParameters");
            throw null;
        }
        if (Intrinsics.d(b0Var.h(), "hs")) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            lc1.o oVar = new lc1.o(requireContext);
            this.N1 = oVar;
            fo1.a i74 = i7();
            if (i74 != null) {
                ((GestaltToolbarImpl) i74).e(oVar);
            }
            fo1.a i75 = i7();
            if (i75 != null) {
                ((GestaltToolbarImpl) i75).Q(rm1.q.CANCEL.drawableRes(requireContext, dl2.b.f1(requireContext)), eo1.b.color_themed_text_default, le0.h.content_description_cancel);
                return;
            }
            return;
        }
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        Context requireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
        if (dl2.b.T1(requireContext3)) {
            staticSearchBarView = new GestaltStaticSearchBar(6, requireContext2, (AttributeSet) r0);
            fo1.a i76 = i7();
            if (i76 != null) {
                ((GestaltToolbarImpl) i76).d(staticSearchBarView);
            }
            ViewGroup.LayoutParams layoutParams = staticSearchBarView.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
                fo1.a i77 = i7();
                if (i77 != null) {
                    int id3 = ((GestaltToolbarImpl) i77).w().getId();
                    layoutParams2.addRule(6, id3);
                    layoutParams2.addRule(8, id3);
                }
            }
            staticSearchBarView.d0(d.f47770k);
        } else {
            staticSearchBarView = new StaticSearchBarView(requireContext2);
            staticSearchBarView.c(this.Z1);
            fo1.a i78 = i7();
            if (i78 != null) {
                ((GestaltToolbarImpl) i78).d(staticSearchBarView);
                ViewGroup.LayoutParams layoutParams3 = ((GestaltToolbarImpl) i78).getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = staticSearchBarView.getResources().getDimensionPixelSize(r0.search_toolbar_height);
                }
            }
            ViewGroup.LayoutParams layoutParams4 = staticSearchBarView.getLayoutParams();
            r0 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : 0;
            if (r0 != 0) {
                ((ViewGroup.MarginLayoutParams) r0).bottomMargin = bs1.c.W(staticSearchBarView, eo1.c.space_200);
            }
        }
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        staticSearchBarView.setLayoutTransition(layoutTransition);
        this.f47743y1 = staticSearchBarView;
    }

    @Override // sq0.e
    public final tq0.b[] S8() {
        tq0.b[] bVarArr = new tq0.b[2];
        pb0.a aVar = this.f47709h1;
        if (aVar == null) {
            Intrinsics.r("clock");
            throw null;
        }
        bVarArr[0] = new tq0.m(aVar, s7());
        pb0.a aVar2 = this.f47709h1;
        if (aVar2 == null) {
            Intrinsics.r("clock");
            throw null;
        }
        nx.d0 s73 = s7();
        o0 o0Var = this.f47711i1;
        if (o0Var != null) {
            bVarArr[1] = new tq0.c(aVar2, s73, o0Var, null, null, 24);
            return bVarArr;
        }
        Intrinsics.r("pinalyticsManager");
        throw null;
    }

    @Override // yq0.t, androidx.fragment.app.Fragment, oc2.j
    public final View T() {
        return getView();
    }

    @Override // sq0.e
    public final qa2.n T8(nr0.b pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        return this.Z1 ? new eq0.d(s7(), y32.f.EXPLORE, new z0(this, 9)).a(new yk1.a(getResources(), requireContext().getTheme())) : new m(s7(), y32.f.EXPLORE, pinActionHandler, l9().d()).a(new yk1.a(getResources(), requireContext().getTheme()));
    }

    @Override // h61.k
    public final void V2(i01.a pinCloseupPinClickListener) {
        Intrinsics.checkNotNullParameter(pinCloseupPinClickListener, "pinCloseupPinClickListener");
        this.f47704e2 = pinCloseupPinClickListener;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.g((i61.a) this.G2.getValue());
        bVar.d(W8());
        bVar.e((ky.e) this.f47738v2.getValue());
        i2 i2Var = this.Z0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        bVar.c(f7());
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        w0 w0Var = this.f47729r1;
        if (w0Var == null) {
            Intrinsics.r("dynamicFeedLibraryExperiments");
            throw null;
        }
        bc2.e eVar = this.f47731s1;
        if (eVar == null) {
            Intrinsics.r("mp4TrackSelector");
            throw null;
        }
        ac2.m B7 = B7();
        p1 p1Var = this.W0;
        if (p1Var == null) {
            Intrinsics.r("videoManagerUtil");
            throw null;
        }
        lh0.j jVar = this.V0;
        if (jVar == null) {
            Intrinsics.r("adsExperiments");
            throw null;
        }
        es.a b13 = bVar.b();
        kv.a aVar = this.f47735u1;
        if (aVar == null) {
            Intrinsics.r("adsAudioOverlayPowerscoreExperimentManager");
            throw null;
        }
        kv.c cVar = this.f47737v1;
        if (cVar == null) {
            Intrinsics.r("organicAudioOverlayPowerscoreExperimentManager");
            throw null;
        }
        es.h hVar = this.f47739w1;
        if (hVar == null) {
            Intrinsics.r("adsCommonDisplay");
            throw null;
        }
        b20.c cVar2 = this.f47713j1;
        if (cVar2 == null) {
            Intrinsics.r("prefetchConfig");
            throw null;
        }
        bVar.h(new sq0.m(requireContext2, w0Var, eVar, B7, p1Var, jVar, b13, aVar, cVar, hVar, cVar2, this.H2.f115002a, sq0.j.SEARCH));
        wk1.c a13 = bVar.a();
        l3 l3Var = this.X0;
        if (l3Var == null) {
            Intrinsics.r("searchGridMultiSectionPresenterFactory");
            throw null;
        }
        c71.b0 b0Var = this.P1;
        if (b0Var == null) {
            Intrinsics.r("searchParameters");
            throw null;
        }
        c91.e eVar2 = this.f47700c1;
        if (eVar2 == null) {
            Intrinsics.r("onDemandModuleControllerFactory");
            throw null;
        }
        c91.f a14 = eVar2.a(E4(), s7());
        pr0.g gVar = (pr0.g) this.f47740w2.getValue();
        zd1.e0 e0Var = this.D2;
        String str = this.f47724o2;
        eq0.n nVar = this.f47726p2;
        boolean z13 = this.Z1;
        hs1.q a15 = hs1.t.a();
        hf0.b bVar2 = new hf0.b();
        m60.g0 g0Var = this.f47696a1;
        if (g0Var == null) {
            Intrinsics.r("pageSizeProvider");
            throw null;
        }
        xq0.d[] dVarArr = new xq0.d[2];
        boolean z14 = false;
        dVarArr[0] = new qx0.b(1);
        es.a aVar2 = this.f47733t1;
        if (aVar2 == null) {
            Intrinsics.r("adFormats");
            throw null;
        }
        es.h hVar2 = this.f47739w1;
        if (hVar2 == null) {
            Intrinsics.r("adsCommonDisplay");
            throw null;
        }
        dVarArr[1] = new xq0.b(aVar2, hVar2);
        sq0.f fVar = new sq0.f(a15, bVar2, g0Var, kotlin.collections.f0.j(dVarArr), 8);
        int hashCode = hashCode();
        if (ve.h.V()) {
            f3 f3Var = this.T0;
            if (f3Var == null) {
                Intrinsics.r("searchLibraryExperiments");
                throw null;
            }
            Context requireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
            if (ve.h.W(f3Var, requireContext3) && l9().m()) {
                z14 = true;
            }
        }
        c71.z a16 = l3Var.a(b0Var, a14, this.f47701c2, gVar, e0Var, this.A2, str, nVar, z13, a13, fVar, this.f47746z2, hashCode, this, z14, this.B2);
        this.N2 = a16;
        return a16;
    }

    @Override // de1.f
    public final void X4(boolean z13, ArrayList productFilterList) {
        Intrinsics.checkNotNullParameter(productFilterList, "productFilterList");
        zd1.d0 d0Var = this.f47718l2;
        if (d0Var != null) {
            if (z13) {
                f7().f(new jc0.v(d0Var, false, 0L, 30));
            }
            de1.m0 m0Var = (de1.m0) d0Var;
            m0Var.i(productFilterList);
            String string = getResources().getString(mz1.g.unified_filter_by_header_text);
            zd1.e0 e0Var = this.D2;
            m0Var.b(string, true, null, null, e0Var != null ? ph.a.E(e0Var) : null, true);
        }
    }

    @Override // sq0.e
    public final int Y8() {
        return 0;
    }

    @Override // sq0.e
    /* renamed from: a9, reason: from getter */
    public final String getE2() {
        return this.E2;
    }

    @Override // h61.k
    public final void b0(d4 viewType, a4 viewParameterType) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(viewParameterType, "viewParameterType");
        this.f47728q2 = viewType;
        this.f47730r2 = viewParameterType;
    }

    @Override // h61.k
    public final void b4() {
        RecyclerView recyclerView = g8();
        if (recyclerView != null) {
            pr0.g gVar = (pr0.g) this.f47740w2.getValue();
            gVar.getClass();
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            gVar.s(recyclerView);
        }
    }

    @Override // h61.k
    public final void c4(int i13) {
        Context context = getContext();
        if (context != null) {
            jn0.f fVar = new jn0.f((ye2.m) context, this, i13);
            i92.k kVar = this.f47723o1;
            if (kVar != null) {
                kVar.c(fVar);
            } else {
                Intrinsics.r("toastUtils");
                throw null;
            }
        }
    }

    @Override // h61.k
    public final void c6() {
        J8(n8().f19650a);
        P8();
    }

    @Override // sq0.e
    public final boolean c9() {
        return true;
    }

    @Override // h61.k
    public final void e2() {
        h32.i0 p13 = s7().p();
        if (p13 == null) {
            return;
        }
        uj2.b0.j(p13).r(wj2.c.a()).k(new d51.a(7, new z(this, 2))).l(tk2.e.f118017c).o(new u51.b(17, new z(this, 3)), new u51.b(18, d.f47771l));
    }

    @Override // h61.k
    public final void e5() {
        F8("");
    }

    @Override // de1.f
    public final void f4(int i13, boolean z13) {
        this.f47710h2 = i13;
        if (bs1.c.o1(this.f47745z1)) {
            if (z13) {
                nx.d0 s73 = s7();
                f1 f1Var = f1.VIEW;
                u0 u0Var = u0.FILTER_BUTTON_COUNT_BADGE;
                HashMap hashMap = new HashMap();
                hashMap.put("applied_filter_count", String.valueOf(this.f47710h2));
                Unit unit = Unit.f80348a;
                s73.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            }
            ProductFilterIcon productFilterIcon = this.f47745z1;
            if (productFilterIcon != null) {
                productFilterIcon.b(i13);
            }
        }
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        c71.b0 b0Var = this.P1;
        if (b0Var == null) {
            b0Var = null;
        }
        l9().k();
        if (!k9().j()) {
            o9("navigation");
            return true;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f47741x1;
        c71.b0 b0Var2 = this.P1;
        if (b0Var2 != null && !Intrinsics.d(b0Var2.h(), "blended_module") && uptimeMillis > 5000) {
            f7().f(new pg0.e0());
        }
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.feature.search.results.logging.EXTRA_SEARCH_RESULTS_BACK_BUTTON_CODE", String.valueOf(b0Var != null ? b0Var.i() : null));
        Unit unit = Unit.f80348a;
        P6("com.pinterest.feature.search.results.logging.SEARCH_RESULTS_BACK_BUTTON_CODE", bundle);
        nl1.d.J7();
        return false;
    }

    @Override // h61.k
    public final void g1(boolean z13) {
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f139734h0;
        if (pinterestSwipeRefreshLayout != null) {
            pinterestSwipeRefreshLayout.setEnabled(z13);
        }
    }

    @Override // de1.f
    public final void g2() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ProductFilterIcon productFilterIcon = this.f47745z1;
        if (productFilterIcon == null) {
            productFilterIcon = new ProductFilterIcon(requireContext);
            if (l9().i()) {
                int i13 = eo1.b.color_themed_background_default;
                Object obj = d5.a.f53679a;
                productFilterIcon.setBackgroundColor(requireContext.getColor(i13));
            }
            if (l9().b(z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
                productFilterIcon.setLayoutParams(new FrameLayout.LayoutParams(-2, productFilterIcon.getResources().getDimensionPixelSize(mz1.c.search_filter_icon_background_size)));
            }
            productFilterIcon.setOnClickListener(new o(this, 0));
            productFilterIcon.a(false);
        }
        this.f47745z1 = productFilterIcon;
        fo1.a i73 = i7();
        if (i73 != null) {
            String string = requireContext().getString(le0.h.content_description_product_filter);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ((GestaltToolbarImpl) i73).f(productFilterIcon, string);
        }
    }

    @Override // de1.e0
    public final void g4(de1.h0 unifiedInlineFilterDataModel) {
        Intrinsics.checkNotNullParameter(unifiedInlineFilterDataModel, "unifiedInlineFilterDataModel");
        zd1.d0 d0Var = this.f47718l2;
        if (d0Var != null) {
            f7().f(new jc0.v(d0Var, false, 0L, 30));
            ArrayList d2 = unifiedInlineFilterDataModel.d();
            if (d2 != null) {
                ((de1.m0) d0Var).i(d2);
            }
            String f13 = unifiedInlineFilterDataModel.f();
            if (f13.length() <= 0) {
                f13 = null;
            }
            if (f13 == null) {
                px0 g13 = unifiedInlineFilterDataModel.g();
                f13 = ph.a.S((g13 != null ? g13.o() : -1).intValue(), n9());
            }
            ((de1.m0) d0Var).b(f13, true, unifiedInlineFilterDataModel.e(), unifiedInlineFilterDataModel.c(), unifiedInlineFilterDataModel.b(), false);
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getQ0() {
        return this.f47730r2;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getP0() {
        return this.f47728q2;
    }

    @Override // h61.k
    public final void h0(uk1.d presenterPinalytics, ee1.f listener, List list) {
        PinterestEmptyStateLayout pinterestEmptyStateLayout;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = getContext();
        zd1.e0 e0Var = this.D2;
        if (context == null || e0Var == null || (pinterestEmptyStateLayout = this.f139733g0) == null) {
            return;
        }
        gi2.b.U(pinterestEmptyStateLayout, context, e0Var, presenterPinalytics, p7(), n9(), listener, s7(), list, BitmapUtils.BITMAP_TO_JPEG_SIZE);
    }

    @Override // de1.f
    public final void i2(de1.d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f47716k2 = listener;
        pv1.e eVar = this.d2;
        if (eVar == null) {
            return;
        }
        eVar.L3(listener);
    }

    @Override // h61.k
    public final void i6() {
        PinterestRecyclerView pinterestRecyclerView = this.B1;
        if (pinterestRecyclerView == null) {
            Intrinsics.r("searchHeaderRecyclerView");
            throw null;
        }
        pinterestRecyclerView.setVisibility(8);
        PinterestRecyclerView pinterestRecyclerView2 = this.B1;
        if (pinterestRecyclerView2 != null) {
            pinterestRecyclerView2.h(0, false);
        } else {
            Intrinsics.r("searchHeaderRecyclerView");
            throw null;
        }
    }

    @Override // h61.k
    public final void k3(gm1.a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        ViewGroup viewGroup = this.f47743y1;
        GestaltStaticSearchBar gestaltStaticSearchBar = viewGroup instanceof GestaltStaticSearchBar ? (GestaltStaticSearchBar) viewGroup : null;
        if (gestaltStaticSearchBar != null) {
            gestaltStaticSearchBar.k0(eventHandler);
        }
    }

    public final ca2.e k9() {
        return (ca2.e) this.O1.getValue();
    }

    @Override // h61.k
    public final void l3() {
        ViewGroup viewGroup = this.D1;
        if (viewGroup != null) {
            viewGroup.removeView(this.H1);
        } else {
            Intrinsics.r("searchContentContainer");
            throw null;
        }
    }

    public final g3 l9() {
        g3 g3Var = this.R0;
        if (g3Var != null) {
            return g3Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    @Override // h61.k
    public final void m4() {
        HashMap hashMap = new HashMap();
        hashMap.put(rg0.o.CONTEXT_SEARCH_QUERY.getValue(), this.Q1);
        String value = rg0.o.CONTEXT_SEARCH_QUERY_ENCODED.getValue();
        String encode = Uri.encode(this.Q1);
        Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
        hashMap.put(value, encode);
        c71.b0 b0Var = this.P1;
        if (b0Var == null) {
            Intrinsics.r("searchParameters");
            throw null;
        }
        hashMap.put(rg0.o.CONTEXT_SEARCH_REFERRER_SOURCE.getValue(), b0Var.h());
        c71.b0 b0Var2 = this.P1;
        if (b0Var2 == null) {
            Intrinsics.r("searchParameters");
            throw null;
        }
        String e13 = b0Var2.e();
        if (e13 != null) {
            hashMap.put(rg0.o.REFINEMENT_FILTER_ID.getValue(), e13);
        }
        p9(hashMap);
        c71.b0 b0Var3 = this.P1;
        if (b0Var3 == null) {
            Intrinsics.r("searchParameters");
            throw null;
        }
        if (Intrinsics.d(b0Var3.h(), "hs")) {
            kotlin.jvm.internal.j.z(bf.b.S(this), null, null, new a0(this, null), 3);
        }
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(l42.d.fragment_search_grid, l42.b.fragment_search_recycler_view);
        eVar.f979c = l42.b.fragment_search_empty_state_container;
        eVar.c(l42.b.fragment_search_swipe_container);
        return eVar;
    }

    public final lb0.q m9() {
        lb0.q qVar = this.f47725p1;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.r("prefsManagerPersisted");
        throw null;
    }

    @Override // h61.k
    public final void n2(xd1.a observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f47746z2.a(observer);
    }

    @Override // sq0.e, yq0.t
    public final v0 n8() {
        if (l9().c() && this.Q1.length() > 0) {
            c71.b0 b0Var = this.P1;
            if (b0Var == null) {
                Intrinsics.r("searchParameters");
                throw null;
            }
            if (b0Var.i() == h61.h.BOARDS) {
                g41.a aVar = new g41.a(this, 3);
                requireContext();
                PinterestGridLayoutManager pinterestGridLayoutManager = new PinterestGridLayoutManager(aVar, hf0.b.f69004d);
                pinterestGridLayoutManager.K = new kx0.c(this, 4);
                return new v0(pinterestGridLayoutManager);
            }
        }
        return super.n8();
    }

    public final yk1.v n9() {
        yk1.v vVar = this.f47707g1;
        if (vVar != null) {
            return vVar;
        }
        Intrinsics.r("viewResources");
        throw null;
    }

    public final void o9(String str) {
        k9().p();
        FragmentActivity E4 = E4();
        if (E4 != null) {
            pk.a0.d1(E4);
        }
        FrameLayout frameLayout = this.M1;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ca2.e.i(k9(), str, 0.0f, null, 6);
        HairPatternEducationView hairPatternEducationView = this.K1;
        if (hairPatternEducationView != null) {
            hairPatternEducationView.k();
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f47741x1 = SystemClock.uptimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0136  */
    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        f7().j(this.I2);
        f7().j(this.K2);
        f7().j(this.L2);
        f7().j(this.M2);
        this.f47704e2 = null;
        this.d2 = null;
        if (this.f47703e1 == null) {
            Intrinsics.r("educationHelper");
            throw null;
        }
        zf0.f.a(this.f47736u2);
        k9().l();
        C8(this.H2);
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        FragmentActivity E4 = E4();
        if (E4 != null && (window = E4.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        c71.b0 b0Var = this.P1;
        if (b0Var == null) {
            b0Var = null;
        }
        kg.o.F(s7(), this.A1, b0Var != null ? b0Var.i() : null);
        this.A1 = null;
        FragmentActivity E4 = E4();
        if (E4 == null || (window = E4.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        OneBarContainer oneBarContainer = this.C1;
        if (oneBarContainer == null) {
            Intrinsics.r("oneBarContainerView");
            throw null;
        }
        oneBarContainer.setPinalytics(s7());
        xk2.v vVar = this.G2;
        nx.d0 d0Var = ((i61.a) vVar.getValue()).f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        setPinalytics(d0Var);
        OneBarContainer oneBarContainer2 = this.C1;
        if (oneBarContainer2 == null) {
            Intrinsics.r("oneBarContainerView");
            throw null;
        }
        Y7(oneBarContainer2);
        PinterestRecyclerView pinterestRecyclerView = this.B1;
        if (pinterestRecyclerView == null) {
            Intrinsics.r("searchHeaderRecyclerView");
            throw null;
        }
        Y7(pinterestRecyclerView);
        Context requireContext = requireContext();
        i61.a aVar = (i61.a) vVar.getValue();
        uj2.q p73 = p7();
        m60.w f73 = f7();
        int hashCode = hashCode();
        k2 k2Var = this.S0;
        if (k2Var == null) {
            Intrinsics.r("oneBarLibraryExperiments");
            throw null;
        }
        vy.m mVar = this.f47721n1;
        if (mVar == null) {
            Intrinsics.r("analyticsApi");
            throw null;
        }
        b60.b activeUserManager = getActiveUserManager();
        yk1.v n93 = n9();
        lb0.q m93 = m9();
        c71.b0 b0Var = this.P1;
        if (b0Var == null) {
            Intrinsics.r("searchParameters");
            throw null;
        }
        ov1.e eVar = Intrinsics.d(b0Var.h(), "hs") ? ov1.e.SINGLE_SELECTABLE_ONLY : ov1.e.NOT_SELECTABLE;
        de1.r0 r0Var = de1.r0.SEARCH;
        Intrinsics.f(requireContext);
        pv1.e eVar2 = new pv1.e(requireContext, aVar, p73, this.f47701c2, this.C2, f73, hashCode, k2Var, mVar, activeUserManager, n93, m93, eVar, r0Var, false, false, null, null, 229376);
        yk1.j jVar = this.f47705f1;
        if (jVar == null) {
            Intrinsics.r("mvpBinder");
            throw null;
        }
        OneBarContainer oneBarContainer3 = this.C1;
        if (oneBarContainer3 == null) {
            Intrinsics.r("oneBarContainerView");
            throw null;
        }
        jVar.d(oneBarContainer3, eVar2);
        if (l9().n(z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
            OneBarContainer oneBarContainer4 = this.C1;
            if (oneBarContainer4 == null) {
                Intrinsics.r("oneBarContainerView");
                throw null;
            }
            vt1.a aVar2 = new vt1.a();
            ky.k kVar = new ky.k(f7());
            m60.w f74 = f7();
            c71.b0 b0Var2 = this.P1;
            if (b0Var2 == null) {
                Intrinsics.r("searchParameters");
                throw null;
            }
            oneBarContainer4.b(new pr0.g(aVar2, kVar, null, f74, null, ey.z.class, b0Var2.i(), null, null, 404));
        }
        this.d2 = eVar2;
        if (this.Z1) {
            OneBarContainer oneBarContainer5 = this.C1;
            if (oneBarContainer5 == null) {
                Intrinsics.r("oneBarContainerView");
                throw null;
            }
            k3.R1(oneBarContainer5, false);
            f7().d(new r70.h(false, false));
        }
        super.onViewCreated(v13, bundle);
        addRecyclerViewEventListener(new x(this));
        addRecyclerViewEventListener((pr0.g) this.f47740w2.getValue());
        addScrollListener(this.H2);
        b9(getResources().getDimensionPixelOffset(eo1.c.bottom_nav_height));
        if (j1.E1()) {
            c71.b0 b0Var3 = this.P1;
            if (b0Var3 == null) {
                Intrinsics.r("searchParameters");
                throw null;
            }
            if (b0Var3.i() == h61.h.USERS) {
                int X8 = X8() / 2;
                H8(X8, 0, X8, getResources().getDimensionPixelOffset(eo1.c.space_1600));
            }
        }
        f7().h(this.I2);
        f7().h(this.K2);
        f7().h(this.L2);
        if (!f7().b(jc0.t.class)) {
            f7().h(this.M2);
        }
        h61.j jVar2 = this.U1;
        if (jVar2 == null || !Intrinsics.d(this.f47697a2, Boolean.TRUE)) {
            return;
        }
        jVar2.d1(false);
    }

    @Override // h61.k
    public final void p4() {
        PinterestEmptyStateLayout pinterestEmptyStateLayout = this.f139733g0;
        if (pinterestEmptyStateLayout != null) {
            pinterestEmptyStateLayout.removeView(this.E1);
        }
        GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout = this.F1;
        ViewGroup.LayoutParams layoutParams = gridPlaceholderLoadingLayout != null ? gridPlaceholderLoadingLayout.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int marginStart = marginLayoutParams.getMarginStart();
            int marginEnd = marginLayoutParams.getMarginEnd();
            int i13 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(marginStart);
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = i13;
        }
        this.E1 = null;
    }

    @Override // h61.k
    public final void p6(Function0 searchParametersProvider) {
        Intrinsics.checkNotNullParameter(searchParametersProvider, "searchParametersProvider");
        OneBarContainer oneBarContainer = this.C1;
        if (oneBarContainer == null) {
            Intrinsics.r("oneBarContainerView");
            throw null;
        }
        oneBarContainer.e(searchParametersProvider);
        pv1.e eVar = this.d2;
        if (eVar == null) {
            return;
        }
        eVar.N3(searchParametersProvider);
    }

    public final void p9(HashMap hashMap) {
        rg0.s sVar = this.f47702d1;
        if (sVar == null) {
            Intrinsics.r("experiences");
            throw null;
        }
        R6(nl.b.s(s1.f(((dh0.d) sVar).g(y0.ANDROID_SEARCH_PIN_RESULTS_TAKEOVER, hashMap, new tg0.c(false, false)).H(tk2.e.f118017c), "observeOn(...)"), new z(this, 1), null, null, 6));
    }

    @Override // h61.k
    public final void q4(long j13) {
        int b13;
        PinterestRecyclerView pinterestRecyclerView = this.B1;
        if (pinterestRecyclerView == null) {
            Intrinsics.r("searchHeaderRecyclerView");
            throw null;
        }
        zd1.e0 e0Var = this.D2;
        int i13 = 0;
        int i14 = (e0Var == null || (b13 = e0Var.b()) <= 1) ? 0 : b13 - 1;
        c71.b0 b0Var = this.P1;
        if (b0Var == null) {
            Intrinsics.r("searchParameters");
            throw null;
        }
        List j14 = b0Var.j();
        if (j14 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : j14) {
                if (kotlin.text.z.p((String) obj, "selected", false)) {
                    arrayList.add(obj);
                }
            }
            i13 = arrayList.size();
        }
        pinterestRecyclerView.postDelayed(new l0.p(pinterestRecyclerView, i13, i14, 2), j13);
    }

    @Override // h61.k
    public final void r(eq0.m listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f47722n2 = listener;
    }

    @Override // de1.f
    public final void r3(boolean z13) {
        ProductFilterIcon productFilterIcon;
        if (bs1.c.o1(this.f47745z1) && (productFilterIcon = this.f47745z1) != null) {
            productFilterIcon.a(z13);
        }
    }

    @Override // yq0.t
    public final t0 r8() {
        return new b11.o(this, 2);
    }

    @Override // nl1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        HashMap hashMap = new HashMap();
        String str = this.T1;
        if (str != null && str.length() > 0) {
            hashMap.put("story_id", str);
        }
        return hashMap;
    }

    @Override // ta2.a
    public final HashMap t6() {
        c71.z zVar = this.N2;
        if (zVar != null) {
            return zVar.t6();
        }
        return null;
    }

    @Override // h61.k
    public final void v1() {
        ViewGroup viewGroup = this.f47743y1;
        GestaltStaticSearchBar gestaltStaticSearchBar = viewGroup instanceof GestaltStaticSearchBar ? (GestaltStaticSearchBar) viewGroup : null;
        if (gestaltStaticSearchBar != null) {
            oe.f.n(gestaltStaticSearchBar, new i31.a(true, 20));
        }
    }

    @Override // nl1.d
    public final y32.f v7() {
        return y32.f.EXPLORE;
    }

    @Override // de1.e0
    public final void w2(ArrayList filterList) {
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        zd1.d0 d0Var = this.f47718l2;
        if (d0Var != null) {
            ((de1.m0) d0Var).g(filterList);
        }
    }

    @Override // h61.k
    public final void w4() {
        AnimatedContainer animatedContainer = this.G1;
        if (animatedContainer == null) {
            return;
        }
        animatedContainer.setVisibility(0);
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

    @Override // h61.k
    public final void x6(String str) {
        this.A1 = str;
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        KeyEvent.Callback findViewById = mainView.findViewById(m60.t0.toolbar);
        ((GestaltToolbarImpl) findViewById).g0();
        return (nc0.f) findViewById;
    }

    @Override // h61.k
    public final void y3(String clientTrackingParam) {
        Intrinsics.checkNotNullParameter(clientTrackingParam, "clientTrackingParam");
        bz.g gVar = w7().f24184b;
        if (gVar != null) {
            gVar.f24167b = clientTrackingParam;
        }
    }
}
