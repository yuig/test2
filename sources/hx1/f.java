package hx1;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.partnerAnalytics.components.barchart.BasicBarChartList;
import com.pinterest.partnerAnalytics.components.donutchart.DonutChartView;
import com.pinterest.partnerAnalytics.components.feedback.InfoAboutDataView;
import com.pinterest.partnerAnalytics.feature.audience.metadata.AudienceMetadataCard;
import com.pinterest.partnerAnalytics.feature.audience.top.categories.AudienceTopCategoriesView;
import com.pinterest.partnerAnalytics.feature.audience.top.locations.TopLocationsView;
import h32.d4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import so.c1;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lhx1/f;", "Lyk1/k;", "Lhx1/a;", "<init>", "()V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class f extends k implements a {

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f70530j0;

    /* renamed from: k0, reason: collision with root package name */
    public c1 f70531k0;

    /* renamed from: l0, reason: collision with root package name */
    public GestaltSpinner f70532l0;

    /* renamed from: m0, reason: collision with root package name */
    public AudienceMetadataCard f70533m0;

    /* renamed from: n0, reason: collision with root package name */
    public BasicBarChartList f70534n0;

    /* renamed from: o0, reason: collision with root package name */
    public DonutChartView f70535o0;

    /* renamed from: p0, reason: collision with root package name */
    public BasicBarChartList f70536p0;

    /* renamed from: q0, reason: collision with root package name */
    public AudienceTopCategoriesView f70537q0;

    /* renamed from: r0, reason: collision with root package name */
    public TopLocationsView f70538r0;

    /* renamed from: s0, reason: collision with root package name */
    public final v f70539s0 = m.b(new d(this));

    /* renamed from: t0, reason: collision with root package name */
    public j f70540t0;

    /* renamed from: u0, reason: collision with root package name */
    public final d4 f70541u0;

    public f() {
        this.E = com.pinterest.partnerAnalytics.e.audience_insights_fragment;
        this.f70541u0 = d4.INSIGHTS_AUDIENCE;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        c1 c1Var = this.f70531k0;
        if (c1Var == null) {
            Intrinsics.r("presenter");
            throw null;
        }
        uk1.d dVar = (uk1.d) this.f70539s0.getValue();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return c1Var.a(dVar, resources);
    }

    public final void b8(r viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        if (Intrinsics.d(viewState, gx1.g.f66303g)) {
            GestaltSpinner gestaltSpinner = this.f70532l0;
            if (gestaltSpinner != null) {
                dl2.b.X2(gestaltSpinner, ln1.e.LOADING);
                return;
            } else {
                Intrinsics.r("loadingView");
                throw null;
            }
        }
        if (!(viewState instanceof gx1.h)) {
            if (Intrinsics.d(viewState, gx1.g.f66302f)) {
                GestaltSpinner gestaltSpinner2 = this.f70532l0;
                if (gestaltSpinner2 != null) {
                    dl2.b.X2(gestaltSpinner2, ln1.e.NONE);
                    return;
                } else {
                    Intrinsics.r("loadingView");
                    throw null;
                }
            }
            return;
        }
        gx1.e A0 = ((gx1.h) viewState).A0();
        AudienceMetadataCard audienceMetadataCard = this.f70533m0;
        if (audienceMetadataCard == null) {
            Intrinsics.r("audienceMetadata");
            throw null;
        }
        audienceMetadataCard.f(A0.a().g());
        AudienceMetadataCard audienceMetadataCard2 = this.f70533m0;
        if (audienceMetadataCard2 == null) {
            Intrinsics.r("audienceMetadata");
            throw null;
        }
        audienceMetadataCard2.e(A0.a().f());
        AudienceMetadataCard audienceMetadataCard3 = this.f70533m0;
        if (audienceMetadataCard3 == null) {
            Intrinsics.r("audienceMetadata");
            throw null;
        }
        audienceMetadataCard3.g(A0.d(), A0.f());
        AudienceMetadataCard audienceMetadataCard4 = this.f70533m0;
        if (audienceMetadataCard4 == null) {
            Intrinsics.r("audienceMetadata");
            throw null;
        }
        audienceMetadataCard4.b(A0.b(), A0.e());
        AudienceMetadataCard audienceMetadataCard5 = this.f70533m0;
        if (audienceMetadataCard5 == null) {
            Intrinsics.r("audienceMetadata");
            throw null;
        }
        audienceMetadataCard5.c(A0.a().e());
        if (A0.a().b() == null || A0.a().b().floatValue() <= 0.0f) {
            BasicBarChartList basicBarChartList = this.f70534n0;
            if (basicBarChartList == null) {
                Intrinsics.r("audienceAgeCard");
                throw null;
            }
            bs1.c.X0(basicBarChartList);
            DonutChartView donutChartView = this.f70535o0;
            if (donutChartView == null) {
                Intrinsics.r("audienceGenderCard");
                throw null;
            }
            bs1.c.X0(donutChartView);
            BasicBarChartList basicBarChartList2 = this.f70536p0;
            if (basicBarChartList2 == null) {
                Intrinsics.r("audienceDeviceCard");
                throw null;
            }
            bs1.c.X0(basicBarChartList2);
            AudienceTopCategoriesView audienceTopCategoriesView = this.f70537q0;
            if (audienceTopCategoriesView == null) {
                Intrinsics.r("topCategoriesCard");
                throw null;
            }
            bs1.c.X0(audienceTopCategoriesView);
            TopLocationsView topLocationsView = this.f70538r0;
            if (topLocationsView == null) {
                Intrinsics.r("topLocationsCard");
                throw null;
            }
            bs1.c.X0(topLocationsView);
        } else {
            BasicBarChartList basicBarChartList3 = this.f70534n0;
            if (basicBarChartList3 == null) {
                Intrinsics.r("audienceAgeCard");
                throw null;
            }
            bs1.c.U1(basicBarChartList3);
            BasicBarChartList basicBarChartList4 = this.f70534n0;
            if (basicBarChartList4 == null) {
                Intrinsics.r("audienceAgeCard");
                throw null;
            }
            basicBarChartList4.a(A0.a().a());
            DonutChartView donutChartView2 = this.f70535o0;
            if (donutChartView2 == null) {
                Intrinsics.r("audienceGenderCard");
                throw null;
            }
            bs1.c.U1(donutChartView2);
            DonutChartView donutChartView3 = this.f70535o0;
            if (donutChartView3 == null) {
                Intrinsics.r("audienceGenderCard");
                throw null;
            }
            String string = getString(com.pinterest.partnerAnalytics.g.audience_insights_gender_label);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            List<mw1.e> d2 = A0.a().d();
            ArrayList arrayList = new ArrayList(g0.q(d2, 10));
            for (mw1.e eVar : d2) {
                Context requireContext = requireContext();
                int b13 = eVar.b();
                Object obj = d5.a.f53679a;
                arrayList.add(mw1.e.a(eVar, requireContext.getColor(b13)));
            }
            donutChartView3.a(string, getString(com.pinterest.partnerAnalytics.g.audience_insights_gender_disclaimer), arrayList);
            BasicBarChartList basicBarChartList5 = this.f70536p0;
            if (basicBarChartList5 == null) {
                Intrinsics.r("audienceDeviceCard");
                throw null;
            }
            bs1.c.U1(basicBarChartList5);
            BasicBarChartList basicBarChartList6 = this.f70536p0;
            if (basicBarChartList6 == null) {
                Intrinsics.r("audienceDeviceCard");
                throw null;
            }
            basicBarChartList6.a(A0.a().c());
            AudienceTopCategoriesView audienceTopCategoriesView2 = this.f70537q0;
            if (audienceTopCategoriesView2 == null) {
                Intrinsics.r("topCategoriesCard");
                throw null;
            }
            int i13 = 0;
            audienceTopCategoriesView2.setVisibility(A0.c() ? 0 : 8);
            AudienceTopCategoriesView audienceTopCategoriesView3 = this.f70537q0;
            if (audienceTopCategoriesView3 == null) {
                Intrinsics.r("topCategoriesCard");
                throw null;
            }
            audienceTopCategoriesView3.a(A0.a().h().a());
            AudienceTopCategoriesView audienceTopCategoriesView4 = this.f70537q0;
            if (audienceTopCategoriesView4 == null) {
                Intrinsics.r("topCategoriesCard");
                throw null;
            }
            audienceTopCategoriesView4.b(new e(this, A0, i13));
            TopLocationsView topLocationsView2 = this.f70538r0;
            if (topLocationsView2 == null) {
                Intrinsics.r("topLocationsCard");
                throw null;
            }
            bs1.c.U1(topLocationsView2);
            TopLocationsView topLocationsView3 = this.f70538r0;
            if (topLocationsView3 == null) {
                Intrinsics.r("topLocationsCard");
                throw null;
            }
            topLocationsView3.b();
            TopLocationsView topLocationsView4 = this.f70538r0;
            if (topLocationsView4 == null) {
                Intrinsics.r("topLocationsCard");
                throw null;
            }
            topLocationsView4.d(new e(this, A0, 1));
            TopLocationsView topLocationsView5 = this.f70538r0;
            if (topLocationsView5 == null) {
                Intrinsics.r("topLocationsCard");
                throw null;
            }
            topLocationsView5.a(A0.a().i());
        }
        GestaltSpinner gestaltSpinner3 = this.f70532l0;
        if (gestaltSpinner3 == null) {
            Intrinsics.r("loadingView");
            throw null;
        }
        dl2.b.X2(gestaltSpinner3, ln1.e.LOADED);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getB0() {
        return this.f70541u0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(com.pinterest.partnerAnalytics.d.loadingView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f70532l0 = (GestaltSpinner) findViewById;
        View findViewById2 = v13.findViewById(com.pinterest.partnerAnalytics.d.audienceMetadata);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f70533m0 = (AudienceMetadataCard) findViewById2;
        View findViewById3 = v13.findViewById(com.pinterest.partnerAnalytics.d.audienceAgeCard);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f70534n0 = (BasicBarChartList) findViewById3;
        View findViewById4 = v13.findViewById(com.pinterest.partnerAnalytics.d.audienceGenderCard);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f70535o0 = (DonutChartView) findViewById4;
        View findViewById5 = v13.findViewById(com.pinterest.partnerAnalytics.d.audienceDeviceCard);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f70536p0 = (BasicBarChartList) findViewById5;
        View findViewById6 = v13.findViewById(com.pinterest.partnerAnalytics.d.topCategoriesCard);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f70537q0 = (AudienceTopCategoriesView) findViewById6;
        View findViewById7 = v13.findViewById(com.pinterest.partnerAnalytics.d.topLocationsCard);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f70538r0 = (TopLocationsView) findViewById7;
        View findViewById8 = v13.findViewById(com.pinterest.partnerAnalytics.d.infoAboutDataView);
        ((InfoAboutDataView) findViewById8).setPinalytics(s7());
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
        TopLocationsView topLocationsView = this.f70538r0;
        if (topLocationsView == null) {
            Intrinsics.r("topLocationsCard");
            throw null;
        }
        topLocationsView.c(new b(this, 0));
        AudienceMetadataCard audienceMetadataCard = this.f70533m0;
        if (audienceMetadataCard == null) {
            Intrinsics.r("audienceMetadata");
            throw null;
        }
        audienceMetadataCard.d(new c(this));
        AudienceMetadataCard audienceMetadataCard2 = this.f70533m0;
        if (audienceMetadataCard2 != null) {
            audienceMetadataCard2.a(gx1.d.TOTAL_AUDIENCE);
        } else {
            Intrinsics.r("audienceMetadata");
            throw null;
        }
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return null;
    }
}
