package uv1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.oneBarLibrary.modals.model.BodyTypeFilterBottomSheetModel;
import com.pinterest.oneBarLibrary.modals.views.BodyTypeFilterEducationView;
import com.pinterest.ui.grid.PinterestRecyclerView;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.Iterator;
import java.util.List;
import kh2.s0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.n0;
import m60.w;
import nx.d0;
import pk.a0;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Luv1/l;", "Lyq0/b0;", "", "Lvv1/g;", "<init>", "()V", "g4/u", "oneBarLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"FragmentsInLibraryDFM"})
/* loaded from: classes2.dex */
public final class l extends g<Object> implements vv1.g {
    public static final /* synthetic */ int R0 = 0;
    public lb0.q A0;
    public Function0 B0;
    public List C0;
    public List D0;
    public FrameLayout E0;
    public GestaltText F0;
    public GestaltText G0;
    public GestaltButton H0;
    public LinearLayout I0;
    public PinterestLoadingLayout J0;
    public BodyTypeFilterEducationView K0;
    public List L0;
    public tv1.f M0;
    public boolean N0;
    public final xk2.k O0;
    public final d4 P0;
    public final a4 Q0;

    /* renamed from: z0, reason: collision with root package name */
    public uk1.e f123215z0;

    public l() {
        this.Y = true;
        this.O0 = xk2.m.a(xk2.n.NONE, new k(this, 1));
        this.P0 = d4.SEARCH;
        this.Q0 = a4.SEARCH_PINS;
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(1, new k(this, 2));
        adapter.G(2, new k(this, 3));
        adapter.G(3, new k(this, 4));
        adapter.G(4, new k(this, 5));
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        Object i03 = navigation != null ? navigation.i0("com.pinterest.EXTRA_HAIR_PATTERN_FILTER") : null;
        vv1.e eVar = i03 instanceof vv1.e ? (vv1.e) i03 : null;
        if (eVar != null) {
            this.B0 = eVar.o0();
            this.C0 = eVar.n0();
        }
        Object i04 = navigation != null ? navigation.i0("com.pinterest.EXTRA_SKIN_TONE_FILTER") : null;
        vv1.j jVar = i04 instanceof vv1.j ? (vv1.j) i04 : null;
        if (jVar != null) {
            this.B0 = jVar.o0();
            this.D0 = jVar.n0();
        }
        Parcelable b23 = navigation != null ? navigation.b2("com.pinterest.EXTRA_BODY_TYPE_FILTER") : null;
        BodyTypeFilterBottomSheetModel bodyTypeFilterBottomSheetModel = b23 instanceof BodyTypeFilterBottomSheetModel ? (BodyTypeFilterBottomSheetModel) b23 : null;
        vv1.a V0 = bodyTypeFilterBottomSheetModel != null ? s0.V0(bodyTypeFilterBottomSheetModel) : null;
        if (V0 != null) {
            this.B0 = V0.o0();
            this.L0 = V0.n0();
        }
    }

    public final void U8() {
        if (!this.N0) {
            V8("navigation");
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), n0.anim_slide_close_out_left);
        Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(...)");
        BodyTypeFilterEducationView bodyTypeFilterEducationView = this.K0;
        if (bodyTypeFilterEducationView != null) {
            bodyTypeFilterEducationView.startAnimation(loadAnimation);
        }
        BodyTypeFilterEducationView bodyTypeFilterEducationView2 = this.K0;
        if (bodyTypeFilterEducationView2 != null) {
            bs1.c.X0(bodyTypeFilterEducationView2);
        }
        LinearLayout linearLayout = this.I0;
        if (linearLayout == null) {
            Intrinsics.r("bottomSheetContainerView");
            throw null;
        }
        linearLayout.removeView(this.K0);
        FrameLayout frameLayout = this.E0;
        if (frameLayout == null) {
            Intrinsics.r("headerView");
            throw null;
        }
        bs1.c.U1(frameLayout);
        GestaltText gestaltText = this.G0;
        if (gestaltText == null) {
            Intrinsics.r("subtitleView");
            throw null;
        }
        a0.w1(gestaltText);
        PinterestLoadingLayout pinterestLoadingLayout = this.J0;
        if (pinterestLoadingLayout == null) {
            Intrinsics.r("bottomSheetLoadingLayout");
            throw null;
        }
        bs1.c.U1(pinterestLoadingLayout);
        this.N0 = false;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.f123215z0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        uj2.q p73 = p7();
        w f73 = f7();
        lb0.q qVar = this.A0;
        if (qVar == null) {
            Intrinsics.r("prefsManagerPersisted");
            throw null;
        }
        Navigation navigation = this.I;
        Object i03 = navigation != null ? navigation.i0("com.pinterest.EXTRA_HAIR_PATTERN_FILTER") : null;
        vv1.e eVar2 = i03 instanceof vv1.e ? (vv1.e) i03 : null;
        Navigation navigation2 = this.I;
        Object i04 = navigation2 != null ? navigation2.i0("com.pinterest.EXTRA_SKIN_TONE_FILTER") : null;
        vv1.j jVar = i04 instanceof vv1.j ? (vv1.j) i04 : null;
        Navigation navigation3 = this.I;
        Parcelable b23 = navigation3 != null ? navigation3.b2("com.pinterest.EXTRA_BODY_TYPE_FILTER") : null;
        BodyTypeFilterBottomSheetModel bodyTypeFilterBottomSheetModel = b23 instanceof BodyTypeFilterBottomSheetModel ? (BodyTypeFilterBottomSheetModel) b23 : null;
        vv1.a V0 = bodyTypeFilterBottomSheetModel != null ? s0.V0(bodyTypeFilterBottomSheetModel) : null;
        Navigation navigation4 = this.I;
        Object i05 = navigation4 != null ? navigation4.i0("com.pinterest.EXTRA_COLOR_PALETTE_FILTER_BOTTOM_SHEET") : null;
        return new tv1.f(g13, p73, f73, qVar, eVar2, jVar, V0, i05 instanceof vv1.c ? (vv1.c) i05 : null);
    }

    public final void V8(String actionSource) {
        Intrinsics.checkNotNullParameter(actionSource, "actionSource");
        ca2.e.i((ca2.e) this.O0.getValue(), actionSource, 0.0f, null, 6);
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        U8();
        return true;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getY0() {
        return this.Q0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getX0() {
        return this.P0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(nv1.e.fragment_inclusive_filters_bottom_sheet, nv1.d.bottom_sheet_recycler_view);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        onCreateView.setOnClickListener(new wq1.a(this, 9));
        View findViewById = onCreateView.findViewById(nv1.d.bottom_sheet_with_grid);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.I0 = (LinearLayout) findViewById;
        xk2.k kVar = this.O0;
        ca2.e eVar = (ca2.e) kVar.getValue();
        LinearLayout linearLayout = this.I0;
        if (linearLayout == null) {
            Intrinsics.r("bottomSheetContainerView");
            throw null;
        }
        eVar.m(linearLayout);
        View findViewById2 = onCreateView.findViewById(nv1.d.bottom_sheet_header);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.E0 = (FrameLayout) findViewById2;
        View findViewById3 = onCreateView.findViewById(nv1.d.bottom_sheet_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.F0 = (GestaltText) findViewById3;
        View findViewById4 = onCreateView.findViewById(nv1.d.bottom_sheet_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.G0 = (GestaltText) findViewById4;
        View findViewById5 = onCreateView.findViewById(nv1.d.bottom_sheet_loading_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.J0 = (PinterestLoadingLayout) findViewById5;
        GestaltText gestaltText = this.G0;
        if (gestaltText == null) {
            Intrinsics.r("subtitleView");
            throw null;
        }
        final int i13 = 0;
        gestaltText.j(new gm1.a(this) { // from class: uv1.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f123212b;

            {
                this.f123212b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                l this$0 = this.f123212b;
                Unit unit = null;
                switch (i14) {
                    case 0:
                        int i15 = l.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (this$0.K0 == null) {
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            BodyTypeFilterEducationView bodyTypeFilterEducationView = new BodyTypeFilterEducationView(requireContext);
                            this$0.K0 = bodyTypeFilterEducationView;
                            bodyTypeFilterEducationView.f49997d = new k(this$0, 6);
                        }
                        BodyTypeFilterEducationView bodyTypeFilterEducationView2 = this$0.K0;
                        if (bodyTypeFilterEducationView2 != null) {
                            bodyTypeFilterEducationView2.w();
                        }
                        LinearLayout linearLayout2 = this$0.I0;
                        if (linearLayout2 == null) {
                            Intrinsics.r("bottomSheetContainerView");
                            throw null;
                        }
                        linearLayout2.addView(this$0.K0);
                        BodyTypeFilterEducationView bodyTypeFilterEducationView3 = this$0.K0;
                        if (bodyTypeFilterEducationView3 != null) {
                            bs1.c.U1(bodyTypeFilterEducationView3);
                        }
                        Animation loadAnimation = AnimationUtils.loadAnimation(this$0.getContext(), nv1.a.slide_in_right);
                        Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(...)");
                        BodyTypeFilterEducationView bodyTypeFilterEducationView4 = this$0.K0;
                        if (bodyTypeFilterEducationView4 != null) {
                            bodyTypeFilterEducationView4.startAnimation(loadAnimation);
                        }
                        this$0.N0 = true;
                        FrameLayout frameLayout = this$0.E0;
                        if (frameLayout == null) {
                            Intrinsics.r("headerView");
                            throw null;
                        }
                        bs1.c.X0(frameLayout);
                        GestaltText gestaltText2 = this$0.G0;
                        if (gestaltText2 == null) {
                            Intrinsics.r("subtitleView");
                            throw null;
                        }
                        a0.k0(gestaltText2);
                        PinterestLoadingLayout pinterestLoadingLayout = this$0.J0;
                        if (pinterestLoadingLayout != null) {
                            bs1.c.X0(pinterestLoadingLayout);
                            return;
                        } else {
                            Intrinsics.r("bottomSheetLoadingLayout");
                            throw null;
                        }
                    case 1:
                        int i16 = l.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.V8("close_button_tapped");
                            return;
                        }
                        return;
                    default:
                        int i17 = l.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        tv1.f fVar = this$0.M0;
                        if (fVar != null) {
                            Integer num = fVar.f119578k;
                            if (num != null && num.intValue() == 1) {
                                tv1.e eVar2 = fVar.f119574g;
                                if (eVar2 != null) {
                                    eVar2.v();
                                }
                                tv1.e eVar3 = fVar.f119574g;
                                if (eVar3 != null) {
                                    eVar3.u(null);
                                }
                            } else if (num != null && num.intValue() == 2) {
                                tv1.h hVar = fVar.f119575h;
                                if (hVar != null) {
                                    Iterator it2 = hVar.d().iterator();
                                    int i18 = 0;
                                    while (true) {
                                        if (it2.hasNext()) {
                                            Object next = it2.next();
                                            int i19 = i18 + 1;
                                            if (i18 < 0) {
                                                f0.p();
                                                throw null;
                                            }
                                            e71.a aVar = (e71.a) next;
                                            if (Intrinsics.d(aVar.getTerm(), hVar.f119592n)) {
                                                aVar.f57620d = true ^ aVar.f57620d;
                                                Unit unit2 = Unit.f80348a;
                                                hVar.u1(i18, aVar);
                                            } else {
                                                i18 = i19;
                                            }
                                        }
                                    }
                                }
                                tv1.h hVar2 = fVar.f119575h;
                                if (hVar2 != null) {
                                    hVar2.u(null);
                                }
                            } else if (num != null && num.intValue() == 3) {
                                tv1.b bVar = fVar.f119576i;
                                if (bVar != null) {
                                    bVar.w(true);
                                }
                                tv1.b bVar2 = fVar.f119576i;
                                if (bVar2 != null) {
                                    bVar2.v(null);
                                }
                                d0 d0Var = fVar.getPresenterPinalytics().f122379a;
                                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                                d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.CLICK, (r18 & 2) != 0 ? null : u0.CLEAR_BUTTON, (r18 & 4) != 0 ? null : g0.ONEBAR_DRAWER, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                            } else if (num != null && num.intValue() == 4) {
                                rv1.a aVar2 = fVar.f119577j;
                                if (aVar2 != null) {
                                    aVar2.v(null);
                                }
                            } else {
                                yk1.n view = fVar.getView();
                                Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
                                ((l) ((vv1.g) view)).V8("navigation");
                            }
                            unit = Unit.f80348a;
                        }
                        if (unit == null) {
                            this$0.V8("close_button_tapped");
                            return;
                        }
                        return;
                }
            }
        });
        List list = this.L0;
        final int i14 = 1;
        boolean z13 = !(list == null || list.isEmpty());
        View findViewById6 = onCreateView.findViewById(nv1.d.bottom_sheet_recycler_view);
        PinterestRecyclerView pinterestRecyclerView = (PinterestRecyclerView) findViewById6;
        pinterestRecyclerView.setGravity(1);
        if (z13) {
            g41.a aVar = new g41.a(this, 13);
            pinterestRecyclerView.getContext();
            pinterestRecyclerView.l(new PinterestLinearLayoutManager(aVar, 1, false));
            pinterestRecyclerView.setNestedScrollingEnabled(false);
        } else {
            pinterestRecyclerView.getContext();
            pinterestRecyclerView.l(new GridLayoutManager((hf0.b.q() || hf0.b.m()) ? 6 : 4, 1, false));
        }
        final int i15 = 2;
        pinterestRecyclerView.f52531a.setOverScrollMode(2);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        ((GestaltIconButton) onCreateView.findViewById(nv1.d.bottom_sheet_close_button)).u(new gm1.a(this) { // from class: uv1.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f123212b;

            {
                this.f123212b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                l this$0 = this.f123212b;
                Unit unit = null;
                switch (i142) {
                    case 0:
                        int i152 = l.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (this$0.K0 == null) {
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            BodyTypeFilterEducationView bodyTypeFilterEducationView = new BodyTypeFilterEducationView(requireContext);
                            this$0.K0 = bodyTypeFilterEducationView;
                            bodyTypeFilterEducationView.f49997d = new k(this$0, 6);
                        }
                        BodyTypeFilterEducationView bodyTypeFilterEducationView2 = this$0.K0;
                        if (bodyTypeFilterEducationView2 != null) {
                            bodyTypeFilterEducationView2.w();
                        }
                        LinearLayout linearLayout2 = this$0.I0;
                        if (linearLayout2 == null) {
                            Intrinsics.r("bottomSheetContainerView");
                            throw null;
                        }
                        linearLayout2.addView(this$0.K0);
                        BodyTypeFilterEducationView bodyTypeFilterEducationView3 = this$0.K0;
                        if (bodyTypeFilterEducationView3 != null) {
                            bs1.c.U1(bodyTypeFilterEducationView3);
                        }
                        Animation loadAnimation = AnimationUtils.loadAnimation(this$0.getContext(), nv1.a.slide_in_right);
                        Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(...)");
                        BodyTypeFilterEducationView bodyTypeFilterEducationView4 = this$0.K0;
                        if (bodyTypeFilterEducationView4 != null) {
                            bodyTypeFilterEducationView4.startAnimation(loadAnimation);
                        }
                        this$0.N0 = true;
                        FrameLayout frameLayout = this$0.E0;
                        if (frameLayout == null) {
                            Intrinsics.r("headerView");
                            throw null;
                        }
                        bs1.c.X0(frameLayout);
                        GestaltText gestaltText2 = this$0.G0;
                        if (gestaltText2 == null) {
                            Intrinsics.r("subtitleView");
                            throw null;
                        }
                        a0.k0(gestaltText2);
                        PinterestLoadingLayout pinterestLoadingLayout = this$0.J0;
                        if (pinterestLoadingLayout != null) {
                            bs1.c.X0(pinterestLoadingLayout);
                            return;
                        } else {
                            Intrinsics.r("bottomSheetLoadingLayout");
                            throw null;
                        }
                    case 1:
                        int i16 = l.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.V8("close_button_tapped");
                            return;
                        }
                        return;
                    default:
                        int i17 = l.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        tv1.f fVar = this$0.M0;
                        if (fVar != null) {
                            Integer num = fVar.f119578k;
                            if (num != null && num.intValue() == 1) {
                                tv1.e eVar2 = fVar.f119574g;
                                if (eVar2 != null) {
                                    eVar2.v();
                                }
                                tv1.e eVar3 = fVar.f119574g;
                                if (eVar3 != null) {
                                    eVar3.u(null);
                                }
                            } else if (num != null && num.intValue() == 2) {
                                tv1.h hVar = fVar.f119575h;
                                if (hVar != null) {
                                    Iterator it2 = hVar.d().iterator();
                                    int i18 = 0;
                                    while (true) {
                                        if (it2.hasNext()) {
                                            Object next = it2.next();
                                            int i19 = i18 + 1;
                                            if (i18 < 0) {
                                                f0.p();
                                                throw null;
                                            }
                                            e71.a aVar2 = (e71.a) next;
                                            if (Intrinsics.d(aVar2.getTerm(), hVar.f119592n)) {
                                                aVar2.f57620d = true ^ aVar2.f57620d;
                                                Unit unit2 = Unit.f80348a;
                                                hVar.u1(i18, aVar2);
                                            } else {
                                                i18 = i19;
                                            }
                                        }
                                    }
                                }
                                tv1.h hVar2 = fVar.f119575h;
                                if (hVar2 != null) {
                                    hVar2.u(null);
                                }
                            } else if (num != null && num.intValue() == 3) {
                                tv1.b bVar = fVar.f119576i;
                                if (bVar != null) {
                                    bVar.w(true);
                                }
                                tv1.b bVar2 = fVar.f119576i;
                                if (bVar2 != null) {
                                    bVar2.v(null);
                                }
                                d0 d0Var = fVar.getPresenterPinalytics().f122379a;
                                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                                d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.CLICK, (r18 & 2) != 0 ? null : u0.CLEAR_BUTTON, (r18 & 4) != 0 ? null : g0.ONEBAR_DRAWER, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                            } else if (num != null && num.intValue() == 4) {
                                rv1.a aVar22 = fVar.f119577j;
                                if (aVar22 != null) {
                                    aVar22.v(null);
                                }
                            } else {
                                yk1.n view = fVar.getView();
                                Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
                                ((l) ((vv1.g) view)).V8("navigation");
                            }
                            unit = Unit.f80348a;
                        }
                        if (unit == null) {
                            this$0.V8("close_button_tapped");
                            return;
                        }
                        return;
                }
            }
        });
        this.H0 = ((GestaltButton) onCreateView.findViewById(nv1.d.bottom_sheet_clear_button)).e(new gm1.a(this) { // from class: uv1.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f123212b;

            {
                this.f123212b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i15;
                l this$0 = this.f123212b;
                Unit unit = null;
                switch (i142) {
                    case 0:
                        int i152 = l.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (this$0.K0 == null) {
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            BodyTypeFilterEducationView bodyTypeFilterEducationView = new BodyTypeFilterEducationView(requireContext);
                            this$0.K0 = bodyTypeFilterEducationView;
                            bodyTypeFilterEducationView.f49997d = new k(this$0, 6);
                        }
                        BodyTypeFilterEducationView bodyTypeFilterEducationView2 = this$0.K0;
                        if (bodyTypeFilterEducationView2 != null) {
                            bodyTypeFilterEducationView2.w();
                        }
                        LinearLayout linearLayout2 = this$0.I0;
                        if (linearLayout2 == null) {
                            Intrinsics.r("bottomSheetContainerView");
                            throw null;
                        }
                        linearLayout2.addView(this$0.K0);
                        BodyTypeFilterEducationView bodyTypeFilterEducationView3 = this$0.K0;
                        if (bodyTypeFilterEducationView3 != null) {
                            bs1.c.U1(bodyTypeFilterEducationView3);
                        }
                        Animation loadAnimation = AnimationUtils.loadAnimation(this$0.getContext(), nv1.a.slide_in_right);
                        Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(...)");
                        BodyTypeFilterEducationView bodyTypeFilterEducationView4 = this$0.K0;
                        if (bodyTypeFilterEducationView4 != null) {
                            bodyTypeFilterEducationView4.startAnimation(loadAnimation);
                        }
                        this$0.N0 = true;
                        FrameLayout frameLayout = this$0.E0;
                        if (frameLayout == null) {
                            Intrinsics.r("headerView");
                            throw null;
                        }
                        bs1.c.X0(frameLayout);
                        GestaltText gestaltText2 = this$0.G0;
                        if (gestaltText2 == null) {
                            Intrinsics.r("subtitleView");
                            throw null;
                        }
                        a0.k0(gestaltText2);
                        PinterestLoadingLayout pinterestLoadingLayout = this$0.J0;
                        if (pinterestLoadingLayout != null) {
                            bs1.c.X0(pinterestLoadingLayout);
                            return;
                        } else {
                            Intrinsics.r("bottomSheetLoadingLayout");
                            throw null;
                        }
                    case 1:
                        int i16 = l.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.V8("close_button_tapped");
                            return;
                        }
                        return;
                    default:
                        int i17 = l.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        tv1.f fVar = this$0.M0;
                        if (fVar != null) {
                            Integer num = fVar.f119578k;
                            if (num != null && num.intValue() == 1) {
                                tv1.e eVar2 = fVar.f119574g;
                                if (eVar2 != null) {
                                    eVar2.v();
                                }
                                tv1.e eVar3 = fVar.f119574g;
                                if (eVar3 != null) {
                                    eVar3.u(null);
                                }
                            } else if (num != null && num.intValue() == 2) {
                                tv1.h hVar = fVar.f119575h;
                                if (hVar != null) {
                                    Iterator it2 = hVar.d().iterator();
                                    int i18 = 0;
                                    while (true) {
                                        if (it2.hasNext()) {
                                            Object next = it2.next();
                                            int i19 = i18 + 1;
                                            if (i18 < 0) {
                                                f0.p();
                                                throw null;
                                            }
                                            e71.a aVar2 = (e71.a) next;
                                            if (Intrinsics.d(aVar2.getTerm(), hVar.f119592n)) {
                                                aVar2.f57620d = true ^ aVar2.f57620d;
                                                Unit unit2 = Unit.f80348a;
                                                hVar.u1(i18, aVar2);
                                            } else {
                                                i18 = i19;
                                            }
                                        }
                                    }
                                }
                                tv1.h hVar2 = fVar.f119575h;
                                if (hVar2 != null) {
                                    hVar2.u(null);
                                }
                            } else if (num != null && num.intValue() == 3) {
                                tv1.b bVar = fVar.f119576i;
                                if (bVar != null) {
                                    bVar.w(true);
                                }
                                tv1.b bVar2 = fVar.f119576i;
                                if (bVar2 != null) {
                                    bVar2.v(null);
                                }
                                d0 d0Var = fVar.getPresenterPinalytics().f122379a;
                                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                                d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.CLICK, (r18 & 2) != 0 ? null : u0.CLEAR_BUTTON, (r18 & 4) != 0 ? null : g0.ONEBAR_DRAWER, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                            } else if (num != null && num.intValue() == 4) {
                                rv1.a aVar22 = fVar.f119577j;
                                if (aVar22 != null) {
                                    aVar22.v(null);
                                }
                            } else {
                                yk1.n view = fVar.getView();
                                Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
                                ((l) ((vv1.g) view)).V8("navigation");
                            }
                            unit = Unit.f80348a;
                        }
                        if (unit == null) {
                            this$0.V8("close_button_tapped");
                            return;
                        }
                        return;
                }
            }
        });
        if (z13) {
            ((ca2.e) kVar.getValue()).n(hf0.b.f69003c - onCreateView.getResources().getDimensionPixelOffset(eo1.c.space_1600));
            int dimensionPixelOffset = onCreateView.getResources().getDimensionPixelOffset(eo1.c.lego_brick_three_quarters);
            a8(new eb2.k(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
        } else {
            a8(new eb2.k(onCreateView.getResources().getDimensionPixelOffset(eo1.c.space_600), 0));
        }
        return onCreateView;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ((ca2.e) this.O0.getValue()).l();
        super.onDestroyView();
    }
}
