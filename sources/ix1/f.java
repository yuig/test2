package ix1;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.partnerAnalytics.components.barchart.BasicBarChartList;
import com.pinterest.partnerAnalytics.components.donutchart.DonutChartView;
import com.pinterest.partnerAnalytics.components.feedback.InfoAboutDataView;
import com.pinterest.partnerAnalytics.feature.audience.metadata.AudienceMetadataCard;
import com.pinterest.partnerAnalytics.feature.audience.top.categories.AudienceTopCategoriesView;
import com.pinterest.partnerAnalytics.feature.audience.top.locations.TopLocationsView;
import ea1.t0;
import ea1.u0;
import h32.d4;
import jx1.t;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k0;
import xk2.k;
import xk2.m;
import xk2.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lix1/f;", "Lnl1/d;", "<init>", "()V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class f extends h {

    /* renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ int f73801m0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final m1 f73802c0;

    /* renamed from: d0, reason: collision with root package name */
    public GestaltSpinner f73803d0;

    /* renamed from: e0, reason: collision with root package name */
    public AudienceMetadataCard f73804e0;

    /* renamed from: f0, reason: collision with root package name */
    public BasicBarChartList f73805f0;

    /* renamed from: g0, reason: collision with root package name */
    public DonutChartView f73806g0;

    /* renamed from: h0, reason: collision with root package name */
    public BasicBarChartList f73807h0;

    /* renamed from: i0, reason: collision with root package name */
    public AudienceTopCategoriesView f73808i0;

    /* renamed from: j0, reason: collision with root package name */
    public TopLocationsView f73809j0;

    /* renamed from: k0, reason: collision with root package name */
    public final int f73810k0;

    /* renamed from: l0, reason: collision with root package name */
    public final d4 f73811l0;

    public f() {
        k a13 = m.a(n.NONE, new ax1.a(1, new t0(this, 24)));
        int i13 = 22;
        this.f73802c0 = a1.s(this, k0.f80436a.b(t.class), new u0(a13, 21), new ca1.m(a13, i13), new ca1.n(this, a13, i13));
        this.f73810k0 = 6;
        this.f73811l0 = d4.PIN_ANALYTICS;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF0() {
        return this.f73811l0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = com.pinterest.partnerAnalytics.e.audience_insights_fragment;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(com.pinterest.partnerAnalytics.d.loadingView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f73803d0 = (GestaltSpinner) findViewById;
        View findViewById2 = v13.findViewById(com.pinterest.partnerAnalytics.d.audienceMetadata);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f73804e0 = (AudienceMetadataCard) findViewById2;
        View findViewById3 = v13.findViewById(com.pinterest.partnerAnalytics.d.audienceAgeCard);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f73805f0 = (BasicBarChartList) findViewById3;
        View findViewById4 = v13.findViewById(com.pinterest.partnerAnalytics.d.audienceGenderCard);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f73806g0 = (DonutChartView) findViewById4;
        View findViewById5 = v13.findViewById(com.pinterest.partnerAnalytics.d.audienceDeviceCard);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f73807h0 = (BasicBarChartList) findViewById5;
        View findViewById6 = v13.findViewById(com.pinterest.partnerAnalytics.d.topCategoriesCard);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f73808i0 = (AudienceTopCategoriesView) findViewById6;
        View findViewById7 = v13.findViewById(com.pinterest.partnerAnalytics.d.topLocationsCard);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f73809j0 = (TopLocationsView) findViewById7;
        View findViewById8 = v13.findViewById(com.pinterest.partnerAnalytics.d.infoAboutDataView);
        ((InfoAboutDataView) findViewById8).setPinalytics(s7());
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
        TopLocationsView topLocationsView = this.f73809j0;
        if (topLocationsView == null) {
            Intrinsics.r("topLocationsCard");
            throw null;
        }
        topLocationsView.c(new ex1.n(this, 1));
        AudienceMetadataCard audienceMetadataCard = this.f73804e0;
        if (audienceMetadataCard == null) {
            Intrinsics.r("audienceMetadata");
            throw null;
        }
        audienceMetadataCard.d(new a(this));
        AudienceMetadataCard audienceMetadataCard2 = this.f73804e0;
        if (audienceMetadataCard2 == null) {
            Intrinsics.r("audienceMetadata");
            throw null;
        }
        audienceMetadataCard2.a(gx1.d.TOTAL_AUDIENCE);
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        j.z(bf.b.S(viewLifecycleOwner), null, null, new d(this, null), 3);
    }
}
