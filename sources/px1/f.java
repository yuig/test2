package px1;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.partnerAnalytics.feature.filter.FilterDateRangeView;
import com.pinterest.partnerAnalytics.feature.filter.FilterSelectionView;
import h32.d4;
import i32.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import so.e1;
import so.v0;
import so.x0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpx1/f;", "Lyk1/k;", "Lpx1/k;", "<init>", "()V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class f extends u implements k {
    public static final /* synthetic */ int E0 = 0;
    public final xk2.v A0;
    public final xk2.v B0;
    public j C0;
    public yx.d D0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f101648j0;

    /* renamed from: k0, reason: collision with root package name */
    public e1 f101649k0;

    /* renamed from: l0, reason: collision with root package name */
    public xw1.b f101650l0;

    /* renamed from: m0, reason: collision with root package name */
    public x0 f101651m0;

    /* renamed from: n0, reason: collision with root package name */
    public fo1.a f101652n0;

    /* renamed from: o0, reason: collision with root package name */
    public FilterDateRangeView f101653o0;

    /* renamed from: p0, reason: collision with root package name */
    public ConstraintLayout f101654p0;

    /* renamed from: q0, reason: collision with root package name */
    public ConstraintLayout f101655q0;

    /* renamed from: r0, reason: collision with root package name */
    public GestaltSwitchWithLabel f101656r0;

    /* renamed from: s0, reason: collision with root package name */
    public FilterSelectionView f101657s0;

    /* renamed from: t0, reason: collision with root package name */
    public FilterSelectionView f101658t0;

    /* renamed from: u0, reason: collision with root package name */
    public FilterSelectionView f101659u0;

    /* renamed from: v0, reason: collision with root package name */
    public GestaltButton.SmallPrimaryButton f101660v0;

    /* renamed from: w0, reason: collision with root package name */
    public FilterSelectionView f101661w0;

    /* renamed from: x0, reason: collision with root package name */
    public FilterSelectionView f101662x0;

    /* renamed from: y0, reason: collision with root package name */
    public FilterSelectionView f101663y0;

    /* renamed from: z0, reason: collision with root package name */
    public GestaltButton f101664z0;

    public f() {
        this.E = com.pinterest.partnerAnalytics.e.analytics_filter_view;
        this.A0 = xk2.m.b(new c(this, 1));
        this.B0 = xk2.m.b(new c(this, 0));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        e1 e1Var = this.f101649k0;
        if (e1Var == null) {
            Intrinsics.r("analyticsFilterPresenterFactory");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        uk1.e eVar = this.f101648j0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        yx.d dVar = this.D0;
        if (dVar != null) {
            return e1Var.a(requireContext, g13, dVar.c());
        }
        Intrinsics.r("filterViewAdapter");
        throw null;
    }

    public final void b8(zx.l filterParams) {
        Intrinsics.checkNotNullParameter(filterParams, "filterParams");
        fo1.a aVar = this.f101652n0;
        if (aVar == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        Context context = getContext();
        ((GestaltToolbarImpl) aVar).b0(context != null ? context.getString(com.pinterest.partnerAnalytics.g.title_filter_screen, Integer.valueOf(filterParams.c())) : null);
        FilterDateRangeView filterDateRangeView = this.f101653o0;
        if (filterDateRangeView == null) {
            Intrinsics.r("dateRangeSelection");
            throw null;
        }
        filterDateRangeView.b(filterParams.h());
        FilterSelectionView filterSelectionView = this.f101657s0;
        if (filterSelectionView == null) {
            Intrinsics.r("contentType");
            throw null;
        }
        filterSelectionView.h(filterParams.e().ordinal());
        if (filterParams.e() == zx.d.ORGANIC) {
            FilterSelectionView filterSelectionView2 = this.f101657s0;
            if (filterSelectionView2 == null) {
                Intrinsics.r("contentType");
                throw null;
            }
            filterSelectionView2.g(filterParams.f().ordinal());
        } else if (filterParams.e() == zx.d.PAID_AND_EARNED) {
            FilterSelectionView filterSelectionView3 = this.f101657s0;
            if (filterSelectionView3 == null) {
                Intrinsics.r("contentType");
                throw null;
            }
            filterSelectionView3.g(filterParams.d().ordinal());
        }
        FilterSelectionView filterSelectionView4 = this.f101658t0;
        if (filterSelectionView4 == null) {
            Intrinsics.r("fsContentTypeFormat");
            throw null;
        }
        filterSelectionView4.h(filterParams.f().ordinal());
        FilterSelectionView filterSelectionView5 = this.f101662x0;
        if (filterSelectionView5 == null) {
            Intrinsics.r("device");
            throw null;
        }
        filterSelectionView5.h(filterParams.i().ordinal());
        FilterSelectionView filterSelectionView6 = this.f101663y0;
        if (filterSelectionView6 == null) {
            Intrinsics.r("source");
            throw null;
        }
        filterSelectionView6.h(filterParams.k().ordinal());
        FilterSelectionView filterSelectionView7 = this.f101661w0;
        if (filterSelectionView7 == null) {
            Intrinsics.r("format");
            throw null;
        }
        filterSelectionView7.h(filterParams.j().ordinal());
        GestaltSwitchWithLabel gestaltSwitchWithLabel = this.f101656r0;
        if (gestaltSwitchWithLabel != null) {
            gestaltSwitchWithLabel.T(new ex1.n(filterParams, 5));
        } else {
            Intrinsics.r("includeSavedPins");
            throw null;
        }
    }

    public final void c8() {
        rm1.q qVar = rm1.q.CANCEL;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
        ConstraintLayout constraintLayout = this.f101654p0;
        if (constraintLayout == null) {
            Intrinsics.r("filtersContainer");
            throw null;
        }
        constraintLayout.setVisibility(0);
        GestaltButton.SmallPrimaryButton smallPrimaryButton = this.f101660v0;
        if (smallPrimaryButton == null) {
            Intrinsics.r("doneButton");
            throw null;
        }
        a0.v1(smallPrimaryButton);
        fo1.a aVar = this.f101652n0;
        if (aVar == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        ((GestaltToolbarImpl) aVar).P(drawableRes, eo1.b.color_themed_text_default);
        fo1.a aVar2 = this.f101652n0;
        if (aVar2 == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        ((GestaltToolbarImpl) aVar2).m();
        fo1.a aVar3 = this.f101652n0;
        if (aVar3 == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        ((GestaltToolbarImpl) aVar3).U(new a(this, 1));
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF75509a1() {
        return d4.ANALYTICS_OVERVIEW;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        yx.d a13;
        if (((Boolean) this.A0.getValue()).booleanValue()) {
            x0 x0Var = this.f101651m0;
            if (x0Var == null) {
                Intrinsics.r("filterViewAdapterForPinStatsFactory");
                throw null;
            }
            a13 = x0Var.a(((Boolean) this.B0.getValue()).booleanValue());
        } else {
            xw1.b bVar = this.f101650l0;
            if (bVar == null) {
                Intrinsics.r("filterViewAdapterForOverviewFactory");
                throw null;
            }
            a13 = ((v0) bVar).a();
        }
        this.D0 = a13;
        super.onCreate(bundle);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        KeyEvent.Callback findViewById = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f101652n0 = (fo1.a) findViewById;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int i13 = 6;
        GestaltButton.SmallPrimaryButton smallPrimaryButton = new GestaltButton.SmallPrimaryButton(6, requireContext, (AttributeSet) null);
        this.f101660v0 = smallPrimaryButton;
        fo1.a aVar = this.f101652n0;
        if (aVar == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        ((GestaltToolbarImpl) aVar).c(smallPrimaryButton);
        View findViewById2 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.lbReset);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f101664z0 = (GestaltButton) findViewById2;
        View findViewById3 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.clFiltersContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f101654p0 = (ConstraintLayout) findViewById3;
        View findViewById4 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.fDateRange);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f101653o0 = (FilterDateRangeView) findViewById4;
        View findViewById5 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.analytics_filter_content_type);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f101657s0 = (FilterSelectionView) findViewById5;
        View findViewById6 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.fsContentTypeFormat);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f101658t0 = (FilterSelectionView) findViewById6;
        View findViewById7 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.fsClaimedAccount);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f101659u0 = (FilterSelectionView) findViewById7;
        View findViewById8 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.fsDevice);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f101662x0 = (FilterSelectionView) findViewById8;
        View findViewById9 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.fsSource);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f101663y0 = (FilterSelectionView) findViewById9;
        View findViewById10 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.fsFormat);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f101661w0 = (FilterSelectionView) findViewById10;
        View findViewById11 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.includeSavedPinsContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f101655q0 = (ConstraintLayout) findViewById11;
        View findViewById12 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.mscIncludeSavedPins);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f101656r0 = (GestaltSwitchWithLabel) findViewById12;
        FilterSelectionView filterSelectionView = this.f101657s0;
        if (filterSelectionView == null) {
            Intrinsics.r("contentType");
            throw null;
        }
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        filterSelectionView.c(ig1.b.O(resources));
        FilterDateRangeView filterDateRangeView = this.f101653o0;
        if (filterDateRangeView == null) {
            Intrinsics.r("dateRangeSelection");
            throw null;
        }
        final int i14 = 0;
        filterDateRangeView.setOnClickListener(new a(this, i14));
        FilterDateRangeView filterDateRangeView2 = this.f101653o0;
        if (filterDateRangeView2 == null) {
            Intrinsics.r("dateRangeSelection");
            throw null;
        }
        filterDateRangeView2.f(new d(this, 5));
        FilterDateRangeView filterDateRangeView3 = this.f101653o0;
        if (filterDateRangeView3 == null) {
            Intrinsics.r("dateRangeSelection");
            throw null;
        }
        filterDateRangeView3.h(new d(this, i13));
        FilterDateRangeView filterDateRangeView4 = this.f101653o0;
        if (filterDateRangeView4 == null) {
            Intrinsics.r("dateRangeSelection");
            throw null;
        }
        filterDateRangeView4.j(new d(this, 7));
        FilterDateRangeView filterDateRangeView5 = this.f101653o0;
        if (filterDateRangeView5 == null) {
            Intrinsics.r("dateRangeSelection");
            throw null;
        }
        filterDateRangeView5.g(new d(this, 8));
        FilterDateRangeView filterDateRangeView6 = this.f101653o0;
        if (filterDateRangeView6 == null) {
            Intrinsics.r("dateRangeSelection");
            throw null;
        }
        filterDateRangeView6.i(new d(this, 9));
        FilterSelectionView filterSelectionView2 = this.f101657s0;
        if (filterSelectionView2 == null) {
            Intrinsics.r("contentType");
            throw null;
        }
        filterSelectionView2.e(new d(this, 10));
        FilterSelectionView filterSelectionView3 = this.f101657s0;
        if (filterSelectionView3 == null) {
            Intrinsics.r("contentType");
            throw null;
        }
        filterSelectionView3.f(new d(this, 11));
        FilterSelectionView filterSelectionView4 = this.f101658t0;
        if (filterSelectionView4 == null) {
            Intrinsics.r("fsContentTypeFormat");
            throw null;
        }
        filterSelectionView4.e(new d(this, 12));
        FilterSelectionView filterSelectionView5 = this.f101659u0;
        if (filterSelectionView5 == null) {
            Intrinsics.r("claimedAccount");
            throw null;
        }
        filterSelectionView5.e(new d(this, i14));
        FilterSelectionView filterSelectionView6 = this.f101662x0;
        if (filterSelectionView6 == null) {
            Intrinsics.r("device");
            throw null;
        }
        final int i15 = 1;
        filterSelectionView6.e(new d(this, i15));
        FilterSelectionView filterSelectionView7 = this.f101663y0;
        if (filterSelectionView7 == null) {
            Intrinsics.r("source");
            throw null;
        }
        filterSelectionView7.e(new d(this, 2));
        FilterSelectionView filterSelectionView8 = this.f101661w0;
        if (filterSelectionView8 == null) {
            Intrinsics.r("format");
            throw null;
        }
        filterSelectionView8.e(new d(this, 3));
        GestaltSwitchWithLabel gestaltSwitchWithLabel = this.f101656r0;
        if (gestaltSwitchWithLabel == null) {
            Intrinsics.r("includeSavedPins");
            throw null;
        }
        pe.i.j(gestaltSwitchWithLabel, new d(this, 4));
        GestaltButton gestaltButton = this.f101664z0;
        if (gestaltButton == null) {
            Intrinsics.r("lbReset");
            throw null;
        }
        gestaltButton.e(new gm1.a(this) { // from class: px1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f101626b;

            {
                this.f101626b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i16 = i14;
                f this$0 = this.f101626b;
                switch (i16) {
                    case 0:
                        int i17 = f.E0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        j jVar = this$0.C0;
                        if (jVar == null) {
                            Intrinsics.r("listener");
                            throw null;
                        }
                        ((i) jVar).u3();
                        this$0.f7().d(new l());
                        ((ku1.j) this$0.o7()).f();
                        return;
                    default:
                        int i18 = f.E0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        j jVar2 = this$0.C0;
                        if (jVar2 == null) {
                            Intrinsics.r("listener");
                            throw null;
                        }
                        ((i) jVar2).t3();
                        this$0.f7().d(new l());
                        ((ku1.j) this$0.o7()).f();
                        return;
                }
            }
        });
        GestaltButton.SmallPrimaryButton smallPrimaryButton2 = this.f101660v0;
        if (smallPrimaryButton2 == null) {
            Intrinsics.r("doneButton");
            throw null;
        }
        smallPrimaryButton2.d(e.f101631j).e(new gm1.a(this) { // from class: px1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f101626b;

            {
                this.f101626b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i16 = i15;
                f this$0 = this.f101626b;
                switch (i16) {
                    case 0:
                        int i17 = f.E0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        j jVar = this$0.C0;
                        if (jVar == null) {
                            Intrinsics.r("listener");
                            throw null;
                        }
                        ((i) jVar).u3();
                        this$0.f7().d(new l());
                        ((ku1.j) this$0.o7()).f();
                        return;
                    default:
                        int i18 = f.E0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        j jVar2 = this$0.C0;
                        if (jVar2 == null) {
                            Intrinsics.r("listener");
                            throw null;
                        }
                        ((i) jVar2).t3();
                        this$0.f7().d(new l());
                        ((ku1.j) this$0.o7()).f();
                        return;
                }
            }
        });
        FilterSelectionView filterSelectionView9 = this.f101657s0;
        if (filterSelectionView9 == null) {
            Intrinsics.r("contentType");
            throw null;
        }
        yx.d dVar = this.D0;
        if (dVar == null) {
            Intrinsics.r("filterViewAdapter");
            throw null;
        }
        filterSelectionView9.setVisibility(dVar.d() ? 0 : 8);
        FilterSelectionView filterSelectionView10 = this.f101657s0;
        if (filterSelectionView10 == null) {
            Intrinsics.r("contentType");
            throw null;
        }
        yx.d dVar2 = this.D0;
        if (dVar2 == null) {
            Intrinsics.r("filterViewAdapter");
            throw null;
        }
        filterSelectionView10.d(dVar2.i());
        FilterSelectionView filterSelectionView11 = this.f101658t0;
        if (filterSelectionView11 == null) {
            Intrinsics.r("fsContentTypeFormat");
            throw null;
        }
        yx.d dVar3 = this.D0;
        if (dVar3 == null) {
            Intrinsics.r("filterViewAdapter");
            throw null;
        }
        filterSelectionView11.setVisibility(dVar3.j() ? 0 : 8);
        FilterSelectionView filterSelectionView12 = this.f101657s0;
        if (filterSelectionView12 == null) {
            Intrinsics.r("contentType");
            throw null;
        }
        yx.d dVar4 = this.D0;
        if (dVar4 == null) {
            Intrinsics.r("filterViewAdapter");
            throw null;
        }
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        filterSelectionView12.b(dVar4.h(resources2));
        FilterSelectionView filterSelectionView13 = this.f101662x0;
        if (filterSelectionView13 == null) {
            Intrinsics.r("device");
            throw null;
        }
        if (this.D0 == null) {
            Intrinsics.r("filterViewAdapter");
            throw null;
        }
        filterSelectionView13.setVisibility(0);
        FilterSelectionView filterSelectionView14 = this.f101663y0;
        if (filterSelectionView14 == null) {
            Intrinsics.r("source");
            throw null;
        }
        yx.d dVar5 = this.D0;
        if (dVar5 == null) {
            Intrinsics.r("filterViewAdapter");
            throw null;
        }
        filterSelectionView14.setVisibility(dVar5.g() ? 0 : 8);
        ConstraintLayout constraintLayout = this.f101655q0;
        if (constraintLayout == null) {
            Intrinsics.r("includeSavedPinsContainer");
            throw null;
        }
        yx.d dVar6 = this.D0;
        if (dVar6 == null) {
            Intrinsics.r("filterViewAdapter");
            throw null;
        }
        constraintLayout.setVisibility(dVar6.b() ? 0 : 8);
        FilterDateRangeView filterDateRangeView7 = this.f101653o0;
        if (filterDateRangeView7 == null) {
            Intrinsics.r("dateRangeSelection");
            throw null;
        }
        yx.d dVar7 = this.D0;
        if (dVar7 == null) {
            Intrinsics.r("filterViewAdapter");
            throw null;
        }
        filterDateRangeView7.c(dVar7.e());
        FilterDateRangeView filterDateRangeView8 = this.f101653o0;
        if (filterDateRangeView8 == null) {
            Intrinsics.r("dateRangeSelection");
            throw null;
        }
        yx.d dVar8 = this.D0;
        if (dVar8 == null) {
            Intrinsics.r("filterViewAdapter");
            throw null;
        }
        filterDateRangeView8.e(dVar8.a());
        if (!((Boolean) this.A0.getValue()).booleanValue()) {
            y0 y0Var = y0.ANDROID_ANALYTICS_CONTENT_TYPE_FILTER;
            FilterSelectionView filterSelectionView15 = this.f101657s0;
            if (filterSelectionView15 == null) {
                Intrinsics.r("contentType");
                throw null;
            }
            ur0.g.d(y0Var, this, filterSelectionView15.getF50185a());
        }
        c8();
        fo1.a aVar2 = this.f101652n0;
        if (aVar2 != null) {
            ((GestaltToolbarImpl) aVar2).b0(requireContext().getString(com.pinterest.partnerAnalytics.g.title_filter_screen, 0));
            return onCreateView;
        }
        Intrinsics.r("toolbar");
        throw null;
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return null;
    }
}
