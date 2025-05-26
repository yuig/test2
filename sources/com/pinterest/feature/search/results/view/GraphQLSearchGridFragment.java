package com.pinterest.feature.search.results.view;

import a.cb;
import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t0;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.o00;
import com.pinterest.design.brio.widget.IconView;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.shopping.shoppingcomponents.productfilters.ProductFilterIcon;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.oneBarLibrary.container.view.OneBarContainer;
import com.pinterest.ui.grid.GridPlaceholderLoadingLayout;
import com.pinterest.ui.grid.PinterestRecyclerView;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jk2.a1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.g3;
import lh0.k2;
import lh0.z3;
import m60.r0;
import net.quikkly.android.utils.BitmapUtils;
import so.k3;
import so.oa;
import sw0.q0;
import x02.i2;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u00020\u0006:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/search/results/view/GraphQLSearchGridFragment;", "Lwk1/k;", "Lz40/y;", "Luk1/c;", "Lh61/k;", "Lnr0/j;", "Lde1/f;", "<init>", "()V", "LayoutManagerException", "results_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class GraphQLSearchGridFragment extends f<z40.y> implements h61.k, de1.f {
    public static final /* synthetic */ int H1 = 0;
    public a4 A1;
    public final xk2.v B1;
    public final b C1;
    public final xk2.v D1;
    public final xk2.v E1;
    public zd1.e0 F1;
    public String G1;
    public i2 R0;
    public nx.f0 S0;
    public yk1.j T0;
    public pb0.a U0;
    public g3 V0;
    public k2 W0;
    public k3 X0;
    public vy.m Y0;
    public lb0.q Z0;

    /* renamed from: a1, reason: collision with root package name */
    public yk1.v f47656a1;

    /* renamed from: b1, reason: collision with root package name */
    public final uk2.f f47657b1;

    /* renamed from: c1, reason: collision with root package name */
    public final a1 f47658c1;

    /* renamed from: d1, reason: collision with root package name */
    public long f47659d1;

    /* renamed from: e1, reason: collision with root package name */
    public ViewGroup f47660e1;

    /* renamed from: f1, reason: collision with root package name */
    public ProductFilterIcon f47661f1;

    /* renamed from: g1, reason: collision with root package name */
    public int f47662g1;

    /* renamed from: h1, reason: collision with root package name */
    public PinterestRecyclerView f47663h1;

    /* renamed from: i1, reason: collision with root package name */
    public OneBarContainer f47664i1;

    /* renamed from: j1, reason: collision with root package name */
    public ViewGroup f47665j1;

    /* renamed from: k1, reason: collision with root package name */
    public qv1.f f47666k1;

    /* renamed from: l1, reason: collision with root package name */
    public GridPlaceholderLoadingLayout f47667l1;

    /* renamed from: m1, reason: collision with root package name */
    public final int f47668m1;

    /* renamed from: n1, reason: collision with root package name */
    public final xk2.v f47669n1;

    /* renamed from: o1, reason: collision with root package name */
    public c71.b0 f47670o1;

    /* renamed from: p1, reason: collision with root package name */
    public pv1.e f47671p1;

    /* renamed from: q1, reason: collision with root package name */
    public boolean f47672q1;

    /* renamed from: r1, reason: collision with root package name */
    public h61.j f47673r1;

    /* renamed from: s1, reason: collision with root package name */
    public h61.i f47674s1;

    /* renamed from: t1, reason: collision with root package name */
    public final l11.f f47675t1;

    /* renamed from: u1, reason: collision with root package name */
    public final z61.b f47676u1;

    /* renamed from: v1, reason: collision with root package name */
    public boolean f47677v1;

    /* renamed from: w1, reason: collision with root package name */
    public de1.d f47678w1;

    /* renamed from: x1, reason: collision with root package name */
    public zd1.d0 f47679x1;

    /* renamed from: y1, reason: collision with root package name */
    public final xk2.v f47680y1;

    /* renamed from: z1, reason: collision with root package name */
    public d4 f47681z1;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/search/results/view/GraphQLSearchGridFragment$LayoutManagerException;", "Landroidx/recyclerview/widget/LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException;", "results_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class LayoutManagerException extends LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutManagerException(String debugTag, Exception originalException) {
            super(debugTag, originalException);
            Intrinsics.checkNotNullParameter(debugTag, "debugTag");
            Intrinsics.checkNotNullParameter(originalException, "originalException");
        }
    }

    public GraphQLSearchGridFragment() {
        uk2.f r13 = cb.r("create(...)");
        this.f47657b1 = r13;
        a1 a1Var = new a1(r13);
        Intrinsics.checkNotNullExpressionValue(a1Var, "hide(...)");
        this.f47658c1 = a1Var;
        this.f47668m1 = (int) (hf0.b.f69003c / 2);
        this.f47669n1 = xk2.m.b(new a(this, 1));
        l11.f fVar = new l11.f();
        this.f47675t1 = fVar;
        this.f47676u1 = new z61.b(fVar);
        this.f47680y1 = xk2.m.b(new a(this, 4));
        this.f47681z1 = d4.SEARCH;
        this.A1 = a4.SEARCH_PINS;
        this.B1 = xk2.m.b(new a(this, 5));
        this.C1 = new b(this, 0);
        this.D1 = xk2.m.b(new a(this, 2));
        this.E1 = xk2.m.b(new a(this, 7));
        this.Y = true;
        this.M = false;
    }

    @Override // h61.k
    public final void A0() {
        this.M = true;
    }

    @Override // h61.k
    public final void A3(n0 searchBarListener) {
        Intrinsics.checkNotNullParameter(searchBarListener, "searchBarListener");
        ViewGroup viewGroup = this.f47660e1;
        StaticSearchBarView staticSearchBarView = viewGroup instanceof StaticSearchBarView ? (StaticSearchBarView) viewGroup : null;
        if (staticSearchBarView != null) {
            staticSearchBarView.d(searchBarListener);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (pe.i.P0(r11, r2, r3.f26728a, r10.f47677v1) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r11 = i7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r11 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        ((com.pinterest.gestalt.toolbar.GestaltToolbarImpl) r11).H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        r0 = s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.VIEW, (r18 & 2) != 0 ? null : h32.u0.FILTER_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
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
            com.pinterest.feature.shopping.shoppingcomponents.productfilters.ProductFilterIcon r0 = r10.f47661f1
            boolean r0 = bs1.c.o1(r0)
            if (r0 != r11) goto L9
            return
        L9:
            com.pinterest.feature.shopping.shoppingcomponents.productfilters.ProductFilterIcon r0 = r10.f47661f1
            bs1.c.R1(r0, r11)
            if (r11 == 0) goto L68
            c71.b0 r11 = r10.f47670o1
            r0 = 0
            java.lang.String r1 = "searchParameters"
            if (r11 == 0) goto L35
            b60.b r11 = com.bumptech.glide.d.E()
            com.pinterest.feature.search.results.view.a r2 = new com.pinterest.feature.search.results.view.a
            r3 = 3
            r2.<init>(r10, r3)
            c71.b0 r3 = r10.f47670o1
            if (r3 == 0) goto L31
            boolean r4 = r10.f47677v1
            h61.h r3 = r3.f26728a
            boolean r11 = pe.i.P0(r11, r2, r3, r4)
            if (r11 != 0) goto L45
            goto L35
        L31:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r0
        L35:
            c71.b0 r11 = r10.f47670o1
            if (r11 == 0) goto L64
            java.lang.String r11 = r11.k()
            java.lang.String r0 = "personal_boutique"
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r0)
            if (r11 == 0) goto L50
        L45:
            fo1.a r11 = r10.i7()
            if (r11 == 0) goto L50
            com.pinterest.gestalt.toolbar.GestaltToolbarImpl r11 = (com.pinterest.gestalt.toolbar.GestaltToolbarImpl) r11
            r11.H()
        L50:
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
            goto L68
        L64:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r0
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.search.results.view.GraphQLSearchGridFragment.B4(boolean):void");
    }

    @Override // h61.k
    public final void B6(ov1.d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        pv1.e eVar = this.f47671p1;
        if (eVar == null) {
            return;
        }
        eVar.M3(listener);
    }

    @Override // h61.k
    public final void C3() {
    }

    @Override // h61.k
    public final void E3(boolean z13) {
        ViewGroup viewGroup = this.f47660e1;
        StaticSearchBarView staticSearchBarView = viewGroup instanceof StaticSearchBarView ? (StaticSearchBarView) viewGroup : null;
        if (staticSearchBarView != null) {
            bs1.c.R1(staticSearchBarView, z13);
        }
        ViewGroup viewGroup2 = this.f47660e1;
        GestaltStaticSearchBar gestaltStaticSearchBar = viewGroup2 instanceof GestaltStaticSearchBar ? (GestaltStaticSearchBar) viewGroup2 : null;
        if (gestaltStaticSearchBar != null) {
            oe.f.n(gestaltStaticSearchBar, new i31.a(z13, 17));
        }
    }

    @Override // h61.k
    public final void G4(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ViewGroup viewGroup = this.f47660e1;
        StaticSearchBarView staticSearchBarView = viewGroup instanceof StaticSearchBarView ? (StaticSearchBarView) viewGroup : null;
        if (staticSearchBarView != null) {
            staticSearchBarView.e(text);
        }
        ViewGroup viewGroup2 = this.f47660e1;
        GestaltStaticSearchBar gestaltStaticSearchBar = viewGroup2 instanceof GestaltStaticSearchBar ? (GestaltStaticSearchBar) viewGroup2 : null;
        if (gestaltStaticSearchBar != null) {
            oe.f.n(gestaltStaticSearchBar, new b31.f(text, 14));
        }
    }

    @Override // de1.f
    public final void H2(c71.p listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        nx.f0 f0Var = this.S0;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        n70.o oVar = new n70.o(this, f0Var, 5);
        uj2.q p73 = p7();
        yk1.a aVar = new yk1.a(getResources(), requireContext().getTheme());
        c71.b0 b0Var = this.f47670o1;
        if (b0Var == null) {
            Intrinsics.r("searchParameters");
            throw null;
        }
        de1.m0 m0Var = new de1.m0(oVar, p73, "", aVar, listener, b0Var.f26730b, ((Boolean) this.f47680y1.getValue()).booleanValue(), 48);
        m0Var.j(zd1.p.PRODUCT_FILTER_SOURCE_SEARCH);
        this.f47679x1 = m0Var;
    }

    @Override // h61.k
    public final void I2(v61.a hairPattern, lb0.o preferencesManager) {
        Intrinsics.checkNotNullParameter(hairPattern, "hairPattern");
        Intrinsics.checkNotNullParameter(preferencesManager, "preferencesManager");
    }

    @Override // h61.k
    public final void J0(ca2.b bVar) {
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        OneBarContainer oneBarContainer = this.f47664i1;
        if (oneBarContainer != null) {
            oneBarContainer.onActivated();
        } else {
            Intrinsics.r("oneBarContainerView");
            throw null;
        }
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void L7() {
        OneBarContainer oneBarContainer = this.f47664i1;
        if (oneBarContainer == null) {
            Intrinsics.r("oneBarContainerView");
            throw null;
        }
        oneBarContainer.onDeactivated();
        super.L7();
    }

    @Override // h61.k
    public final void M(h61.j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f47673r1 = listener;
    }

    @Override // yq0.t
    public final void M8(boolean z13) {
        if (!j9().e()) {
            super.M8(z13);
            return;
        }
        if (z13) {
            RecyclerView g83 = g8();
            if (g83 != null) {
                g83.setBackgroundColor(bs1.c.C(this, eo1.b.color_themed_transparent));
            }
            GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout = this.f47667l1;
            if (gridPlaceholderLoadingLayout != null) {
                bs1.c.U1(gridPlaceholderLoadingLayout);
            }
            GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout2 = this.f47667l1;
            if (gridPlaceholderLoadingLayout2 != null) {
                gridPlaceholderLoadingLayout2.i();
                return;
            }
            return;
        }
        RecyclerView g84 = g8();
        if (g84 != null) {
            g84.setBackgroundColor(bs1.c.C(this, eo1.b.color_themed_background_default));
        }
        GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout3 = this.f47667l1;
        if (gridPlaceholderLoadingLayout3 != null) {
            bs1.c.X0(gridPlaceholderLoadingLayout3);
        }
        se0.c f83 = f8();
        if (f83 != null) {
            f83.showLoadingSpinner(false);
        }
    }

    @Override // h61.k
    public final void N(String bodyType) {
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
    }

    @Override // h61.k
    public final void N0(h61.i backButtonListener) {
        Intrinsics.checkNotNullParameter(backButtonListener, "backButtonListener");
        this.f47674s1 = backButtonListener;
    }

    @Override // h61.k
    public final void N1(List skinToneFilters, e71.a aVar) {
        Intrinsics.checkNotNullParameter(skinToneFilters, "skinToneFilters");
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        h61.j jVar;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (Intrinsics.d(code, "com.pinterest.feature.search.results.logging.SEARCH_RESULTS_BACK_BUTTON_CODE")) {
            h61.i iVar = this.f47674s1;
            if (iVar != null) {
                iVar.C1(result.getString("com.pinterest.feature.search.results.logging.EXTRA_SEARCH_RESULTS_BACK_BUTTON_CODE"));
                return;
            }
            return;
        }
        if (!Intrinsics.d(code, "com.pinterest.EXTRA_SEARCH_RESUBMITTED_QUERY") || (jVar = this.f47673r1) == null) {
            return;
        }
        jVar.T0();
    }

    @Override // h61.k
    public final void O0() {
    }

    @Override // h61.k
    public final void P(p42.c inclusiveFilterType) {
        Intrinsics.checkNotNullParameter(inclusiveFilterType, "inclusiveFilterType");
    }

    @Override // h61.k
    public final void P3(e71.a skinToneFilter) {
        Intrinsics.checkNotNullParameter(skinToneFilter, "skinToneFilter");
    }

    @Override // h61.k
    public final void Q0(int i13, String query, String bodyType, List items) {
        o00 v13;
        String t13;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(query, "query");
        PinterestRecyclerView pinterestRecyclerView = this.f47663h1;
        if (pinterestRecyclerView == null) {
            Intrinsics.r("searchHeaderRecyclerView");
            throw null;
        }
        boolean z13 = false;
        pinterestRecyclerView.setVisibility(0);
        pv1.e eVar = this.f47671p1;
        if (eVar != null) {
            eVar.x3(items);
            if (bodyType != null) {
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
            OneBarContainer oneBarContainer = this.f47664i1;
            if (oneBarContainer == null) {
                Intrinsics.r("oneBarContainerView");
                throw null;
            }
            pr0.g gVar = oneBarContainer.f49982f;
            if (gVar != null) {
                gVar.r(z13);
            }
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
        ViewGroup viewGroup = this.f47665j1;
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
        adapter.G(59, new q0(requireContext, 20));
        adapter.G(60, new a(this, 6));
        adapter.G(45, new q0(requireContext, 21));
        adapter.G(46, new q0(requireContext, 22));
        adapter.G(47, new q0(requireContext, 23));
    }

    @Override // h61.k
    public final void R5(String pinImageUrl, String displayText) {
        Intrinsics.checkNotNullParameter(pinImageUrl, "pinImageUrl");
        Intrinsics.checkNotNullParameter(displayText, "displayText");
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        if (navigation != null) {
            c71.b0 D = pe.i.D(navigation);
            this.f47670o1 = D;
            String m13 = D.m();
            this.f47677v1 = !(m13 == null || kotlin.text.z.j(m13));
            c71.b0 b0Var = this.f47670o1;
            if (b0Var == null) {
                Intrinsics.r("searchParameters");
                throw null;
            }
            if (b0Var == null) {
                Intrinsics.r("searchParameters");
                throw null;
            }
            if (b0Var == null) {
                Intrinsics.r("searchParameters");
                throw null;
            }
            if (b0Var == null) {
                Intrinsics.r("searchParameters");
                throw null;
            }
            this.f47672q1 = navigation.S("com.pinterest.EXTRA_CONVERSATION_SEND_A_PIN_SEARCH", false);
            this.f47662g1 = navigation.J1("com.pinterest.EXTRA_APPLIED_FILTER_COUNT");
            Object i03 = navigation.i0("com.pinterest.EXTRA_CONVO_ID");
            if (i03 instanceof String) {
            }
            Object i04 = navigation.i0("com.pinterest.EXTRA_SEARCH_INLINE_FILTER_MANAGER");
            zd1.e0 e0Var = i04 instanceof zd1.e0 ? (zd1.e0) i04 : null;
            if (e0Var == null) {
                e0Var = new zd1.e0();
            }
            this.F1 = e0Var;
            c71.b0 b0Var2 = this.f47670o1;
            if (b0Var2 == null) {
                Intrinsics.r("searchParameters");
                throw null;
            }
            if (Intrinsics.d(b0Var2.h(), "style_summary")) {
                this.G1 = navigation.g2("com.pinterest.EXTRA_INSIGHT_ID", "");
            }
        }
    }

    @Override // h61.k
    public final void S1(List hairPatternFilters, v61.a aVar) {
        Intrinsics.checkNotNullParameter(hairPatternFilters, "hairPatternFilters");
    }

    @Override // h61.k
    public final void S4(boolean z13) {
        PinterestRecyclerView pinterestRecyclerView = this.f47663h1;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.setVisibility(8);
        } else {
            Intrinsics.r("searchHeaderRecyclerView");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.util.AttributeSet] */
    @Override // sq0.e, nl1.d
    public final void S7(fo1.a toolbar) {
        IconView v13;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.S7(toolbar);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int i13 = eo1.b.color_themed_text_default;
        Object obj = d5.a.f53679a;
        int color = requireContext.getColor(i13);
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        boolean T1 = dl2.b.T1(requireContext2);
        if (T1) {
            GestaltStaticSearchBar gestaltStaticSearchBar = new GestaltStaticSearchBar(6, requireContext, (AttributeSet) r2);
            fo1.a i73 = i7();
            if (i73 != null) {
                ((GestaltToolbarImpl) i73).d(gestaltStaticSearchBar);
            }
            ViewGroup.LayoutParams layoutParams = gestaltStaticSearchBar.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
                fo1.a i74 = i7();
                if (i74 != null) {
                    int id3 = ((GestaltToolbarImpl) i74).v().getId();
                    layoutParams2.addRule(6, id3);
                    layoutParams2.addRule(8, id3);
                }
            }
            this.f47660e1 = gestaltStaticSearchBar;
        } else {
            StaticSearchBarView staticSearchBarView = new StaticSearchBarView(requireContext);
            fo1.a i75 = i7();
            if (i75 != null) {
                ((GestaltToolbarImpl) i75).d(staticSearchBarView);
                ViewGroup.LayoutParams layoutParams3 = ((GestaltToolbarImpl) i75).getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = getResources().getDimensionPixelSize(r0.search_toolbar_height);
                }
            }
            ViewGroup.LayoutParams layoutParams4 = staticSearchBarView.getLayoutParams();
            r2 = layoutParams4 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams4 : 0;
            if (r2 != 0) {
                r2.bottomMargin = getResources().getDimensionPixelOffset(r0.margin_half);
            }
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.enableTransitionType(4);
            staticSearchBarView.setLayoutTransition(layoutTransition);
            staticSearchBarView.f47757e = this.f47672q1;
            this.f47660e1 = staticSearchBarView;
        }
        fo1.a i76 = i7();
        if (i76 == null || (v13 = ((GestaltToolbarImpl) i76).v()) == null) {
            return;
        }
        v13.setColorFilter(color);
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

    @Override // h61.k
    public final void V2(i01.a pinCloseupPinClickListener) {
        Intrinsics.checkNotNullParameter(pinCloseupPinClickListener, "pinCloseupPinClickListener");
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        bVar.g((i61.a) this.E1.getValue());
        bVar.e((ky.e) this.B1.getValue());
        i2 i2Var = this.R0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        bVar.c(f7());
        wk1.c a13 = bVar.a();
        k3 k3Var = this.X0;
        if (k3Var == null) {
            Intrinsics.r("graphQLSearchGridPresenterFactory");
            throw null;
        }
        c71.b0 b0Var = this.f47670o1;
        if (b0Var == null) {
            Intrinsics.r("searchParameters");
            throw null;
        }
        pr0.g gVar = (pr0.g) this.D1.getValue();
        int hashCode = hashCode();
        zd1.e0 e0Var = this.F1;
        g3 j93 = j9();
        boolean z13 = this.f47672q1;
        return k3Var.a(a13, b0Var, this.f47676u1, gVar, this.f47675t1, hashCode, this.f47657b1, e0Var, j93, z13);
    }

    @Override // de1.f
    public final void X4(boolean z13, ArrayList productFilterList) {
        Intrinsics.checkNotNullParameter(productFilterList, "productFilterList");
        zd1.d0 d0Var = this.f47679x1;
        if (d0Var != null) {
            if (z13) {
                f7().f(new jc0.v(d0Var, false, 0L, 30));
            }
            de1.m0 m0Var = (de1.m0) d0Var;
            m0Var.i(productFilterList);
            String string = getResources().getString(mz1.g.unified_filter_by_header_text);
            zd1.e0 e0Var = this.F1;
            m0Var.b(string, true, null, null, e0Var != null ? ph.a.E(e0Var) : null, true);
        }
    }

    @Override // sq0.e
    public final int Y8() {
        return 0;
    }

    @Override // h61.k
    public final void b0(d4 viewType, a4 viewParameterType) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(viewParameterType, "viewParameterType");
        this.f47681z1 = viewType;
        this.A1 = viewParameterType;
    }

    @Override // h61.k
    public final void b4() {
        RecyclerView recyclerView = g8();
        if (recyclerView != null) {
            pr0.g gVar = (pr0.g) this.D1.getValue();
            gVar.getClass();
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            gVar.s(recyclerView);
        }
    }

    @Override // h61.k
    public final void c4(int i13) {
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
        R6(uj2.b0.j(p13).r(wj2.c.a()).k(new d51.a(6, new c(this, 0))).l(tk2.e.f118017c).o(new u51.b(14, new c(this, 1)), new u51.b(15, d.f47769j)));
    }

    @Override // h61.k
    public final void e5() {
        F8("");
    }

    @Override // de1.f
    public final void f4(int i13, boolean z13) {
        this.f47662g1 = i13;
        if (bs1.c.o1(this.f47661f1)) {
            if (z13) {
                nx.d0 s73 = s7();
                f1 f1Var = f1.VIEW;
                u0 u0Var = u0.FILTER_BUTTON_COUNT_BADGE;
                HashMap hashMap = new HashMap();
                hashMap.put("applied_filter_count", String.valueOf(this.f47662g1));
                Unit unit = Unit.f80348a;
                s73.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            }
            ProductFilterIcon productFilterIcon = this.f47661f1;
            if (productFilterIcon != null) {
                productFilterIcon.b(i13);
            }
        }
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        xk2.v vVar = this.f47669n1;
        if (!((ca2.e) vVar.getValue()).j()) {
            ((ca2.e) vVar.getValue()).f27256o = true;
            FragmentActivity E4 = E4();
            if (E4 != null) {
                pk.a0.d1(E4);
            }
            ca2.e.i((ca2.e) vVar.getValue(), "navigation", 0.0f, null, 6);
            return true;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f47659d1;
        c71.b0 b0Var = this.f47670o1;
        if (b0Var == null) {
            Intrinsics.r("searchParameters");
            throw null;
        }
        if (!Intrinsics.d(b0Var.h(), "blended_module") && uptimeMillis > 5000) {
            f7().f(new pg0.e0());
        }
        Bundle bundle = new Bundle();
        c71.b0 b0Var2 = this.f47670o1;
        if (b0Var2 == null) {
            Intrinsics.r("searchParameters");
            throw null;
        }
        bundle.putString("com.pinterest.feature.search.results.logging.EXTRA_SEARCH_RESULTS_BACK_BUTTON_CODE", b0Var2.i().toString());
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
        ProductFilterIcon productFilterIcon = new ProductFilterIcon(requireContext);
        if (j9().i()) {
            int i13 = eo1.b.color_themed_background_default;
            Object obj = d5.a.f53679a;
            productFilterIcon.setBackgroundColor(requireContext.getColor(i13));
        }
        if (j9().b(z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
            productFilterIcon.setLayoutParams(new FrameLayout.LayoutParams(-2, productFilterIcon.getResources().getDimensionPixelSize(mz1.c.search_filter_icon_background_size)));
        }
        productFilterIcon.setOnClickListener(new x61.e(this, 2));
        productFilterIcon.a(false);
        this.f47661f1 = productFilterIcon;
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
        zd1.d0 d0Var = this.f47679x1;
        if (d0Var != null) {
            f7().f(new jc0.v(d0Var, false, 0L, 30));
            ArrayList d2 = unifiedInlineFilterDataModel.d();
            if (d2 != null) {
                ((de1.m0) d0Var).i(d2);
            }
            ((de1.m0) d0Var).b(unifiedInlineFilterDataModel.f(), Intrinsics.d(unifiedInlineFilterDataModel.e(), String.valueOf(t32.f.PRODUCT_MERCHANT.getValue())) || unifiedInlineFilterDataModel.h(), unifiedInlineFilterDataModel.e(), unifiedInlineFilterDataModel.c(), unifiedInlineFilterDataModel.b(), false);
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF140468f0() {
        return this.A1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF49928r0() {
        return this.f47681z1;
    }

    @Override // h61.k
    public final void h0(uk1.d presenterPinalytics, ee1.f listener, List list) {
        PinterestEmptyStateLayout pinterestEmptyStateLayout;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = getContext();
        zd1.e0 e0Var = this.F1;
        if (context == null || e0Var == null || (pinterestEmptyStateLayout = this.f139733g0) == null) {
            return;
        }
        uj2.q p73 = p7();
        yk1.v vVar = this.f47656a1;
        if (vVar != null) {
            gi2.b.U(pinterestEmptyStateLayout, context, e0Var, presenterPinalytics, p73, vVar, listener, s7(), list, BitmapUtils.BITMAP_TO_JPEG_SIZE);
        } else {
            Intrinsics.r("viewResources");
            throw null;
        }
    }

    @Override // de1.f
    public final void i2(de1.d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f47678w1 = listener;
        pv1.e eVar = this.f47671p1;
        if (eVar == null) {
            return;
        }
        eVar.L3(listener);
    }

    @Override // h61.k
    public final void i6() {
        PinterestRecyclerView pinterestRecyclerView = this.f47663h1;
        if (pinterestRecyclerView == null) {
            Intrinsics.r("searchHeaderRecyclerView");
            throw null;
        }
        pinterestRecyclerView.setVisibility(8);
        PinterestRecyclerView pinterestRecyclerView2 = this.f47663h1;
        if (pinterestRecyclerView2 != null) {
            pinterestRecyclerView2.h(0, false);
        } else {
            Intrinsics.r("searchHeaderRecyclerView");
            throw null;
        }
    }

    public final g3 j9() {
        g3 g3Var = this.V0;
        if (g3Var != null) {
            return g3Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    @Override // h61.k
    public final void k3(gm1.a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        ViewGroup viewGroup = this.f47660e1;
        GestaltStaticSearchBar gestaltStaticSearchBar = viewGroup instanceof GestaltStaticSearchBar ? (GestaltStaticSearchBar) viewGroup : null;
        if (gestaltStaticSearchBar != null) {
            gestaltStaticSearchBar.k0(eventHandler);
        }
    }

    @Override // h61.k
    public final void l3() {
    }

    @Override // h61.k
    public final void m4() {
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(l42.d.fragment_search_grid, l42.b.fragment_search_recycler_view);
        eVar.f979c = l42.b.fragment_search_empty_state_container;
        eVar.c(l42.b.fragment_search_swipe_container);
        return eVar;
    }

    @Override // h61.k
    public final void n2(xd1.a observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f47659d1 = SystemClock.uptimeMillis();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f47671p1 = null;
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
        FragmentActivity E4 = E4();
        if (E4 == null || (window = E4.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(android.view.View r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.search.results.view.GraphQLSearchGridFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // h61.k
    public final void p4() {
        PinterestEmptyStateLayout pinterestEmptyStateLayout = this.f139733g0;
        if (pinterestEmptyStateLayout != null) {
            pinterestEmptyStateLayout.removeView(this.f47666k1);
        }
        GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout = this.f47667l1;
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
        this.f47666k1 = null;
    }

    @Override // h61.k
    public final void p6(Function0 searchParametersProvider) {
        Intrinsics.checkNotNullParameter(searchParametersProvider, "searchParametersProvider");
        OneBarContainer oneBarContainer = this.f47664i1;
        if (oneBarContainer == null) {
            Intrinsics.r("oneBarContainerView");
            throw null;
        }
        oneBarContainer.e(searchParametersProvider);
        pv1.e eVar = this.f47671p1;
        if (eVar == null) {
            return;
        }
        eVar.N3(searchParametersProvider);
    }

    @Override // h61.k
    public final void q4(long j13) {
    }

    @Override // h61.k
    public final void r(eq0.m listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // de1.f
    public final void r3(boolean z13) {
        ProductFilterIcon productFilterIcon;
        if (bs1.c.o1(this.f47661f1) && (productFilterIcon = this.f47661f1) != null) {
            productFilterIcon.a(z13);
        }
    }

    @Override // yq0.t
    public final t0 r8() {
        return new b11.o(this, 1);
    }

    @Override // h61.k
    public final void v1() {
        ViewGroup viewGroup = this.f47660e1;
        GestaltStaticSearchBar gestaltStaticSearchBar = viewGroup instanceof GestaltStaticSearchBar ? (GestaltStaticSearchBar) viewGroup : null;
        if (gestaltStaticSearchBar != null) {
            oe.f.n(gestaltStaticSearchBar, new i31.a(true, 18));
        }
    }

    @Override // de1.e0
    public final void w2(ArrayList filterList) {
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        zd1.d0 d0Var = this.f47679x1;
        if (d0Var != null) {
            ((de1.m0) d0Var).g(filterList);
        }
    }

    @Override // h61.k
    public final void w4() {
    }

    @Override // h61.k
    public final void x6(String str) {
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
