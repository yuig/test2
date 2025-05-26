package vx1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.feature.home.view.InitialLoadSwipeRefreshLayout;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.partnerAnalytics.components.OverallPerformanceView;
import com.pinterest.partnerAnalytics.components.feedback.InfoAboutDataView;
import com.pinterest.partnerAnalytics.components.productTag.ProductTagCard;
import com.pinterest.partnerAnalytics.components.toplinemetrics.ToplineMetricsCard;
import com.pinterest.partnerAnalytics.e;
import com.pinterest.partnerAnalytics.feature.pinstats.customviews.PinMetadataCard;
import com.pinterest.partnerAnalytics.feature.pinstats.customviews.PinStatsBusinessAccountUpsell;
import com.pinterest.partnerAnalytics.feature.pinstats.customviews.PinVideoMetricsEmptyCard;
import com.pinterest.partnerAnalytics.feature.pinstats.customviews.SaveToBoardCard;
import com.pinterest.partnerAnalytics.g;
import g70.h;
import gw1.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nl1.d;
import nx.d0;
import rm1.q;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvx1/c;", "Lnl1/d;", "<init>", "()V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class c extends d {

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ int f126828o0 = 0;
    public a11.d X;
    public f Y;
    public f Z;

    /* renamed from: a0, reason: collision with root package name */
    public h f126829a0;

    /* renamed from: d0, reason: collision with root package name */
    public InitialLoadSwipeRefreshLayout f126832d0;

    /* renamed from: e0, reason: collision with root package name */
    public PinMetadataCard f126833e0;

    /* renamed from: f0, reason: collision with root package name */
    public ToplineMetricsCard f126834f0;

    /* renamed from: g0, reason: collision with root package name */
    public ToplineMetricsCard f126835g0;

    /* renamed from: h0, reason: collision with root package name */
    public ProductTagCard f126836h0;

    /* renamed from: i0, reason: collision with root package name */
    public PinVideoMetricsEmptyCard f126837i0;

    /* renamed from: j0, reason: collision with root package name */
    public SaveToBoardCard f126838j0;

    /* renamed from: k0, reason: collision with root package name */
    public OverallPerformanceView f126839k0;

    /* renamed from: l0, reason: collision with root package name */
    public InfoAboutDataView f126840l0;

    /* renamed from: m0, reason: collision with root package name */
    public PinStatsBusinessAccountUpsell f126841m0;

    /* renamed from: b0, reason: collision with root package name */
    public final v f126830b0 = m.b(new a(this, 2));

    /* renamed from: c0, reason: collision with root package name */
    public final v f126831c0 = m.b(new a(this, 1));

    /* renamed from: n0, reason: collision with root package name */
    public final v f126842n0 = m.b(new a(this, 0));

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        q qVar = q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.b0(requireContext().getString(g.pin_stats_title));
        gestaltToolbarImpl.P(drawableRes, eo1.b.color_themed_text_default);
        gestaltToolbarImpl.m();
        gestaltToolbarImpl.U(new wq1.a(this, 16));
    }

    public abstract void V7(cy1.a aVar, ww1.c cVar);

    public final SaveToBoardCard W7() {
        SaveToBoardCard saveToBoardCard = this.f126838j0;
        if (saveToBoardCard != null) {
            return saveToBoardCard;
        }
        Intrinsics.r("pinSaveToBoard");
        throw null;
    }

    public final ProductTagCard X7() {
        ProductTagCard productTagCard = this.f126836h0;
        if (productTagCard != null) {
            return productTagCard;
        }
        Intrinsics.r("productTags");
        throw null;
    }

    public final ToplineMetricsCard Y7() {
        ToplineMetricsCard toplineMetricsCard = this.f126835g0;
        if (toplineMetricsCard != null) {
            return toplineMetricsCard;
        }
        Intrinsics.r("videoMetrics");
        throw null;
    }

    public final PinVideoMetricsEmptyCard Z7() {
        PinVideoMetricsEmptyCard pinVideoMetricsEmptyCard = this.f126837i0;
        if (pinVideoMetricsEmptyCard != null) {
            return pinVideoMetricsEmptyCard;
        }
        Intrinsics.r("videoMetricsEmptyView");
        throw null;
    }

    public abstract void a8(cy1.f fVar, ww1.c cVar);

    public abstract void b8(ww1.c cVar);

    public final String getPinId() {
        return (String) this.f126830b0.getValue();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = e.pin_stats_fragment;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(com.pinterest.partnerAnalytics.d.swipeRefreshLayout);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f126832d0 = (InitialLoadSwipeRefreshLayout) findViewById;
        View findViewById2 = v13.findViewById(com.pinterest.partnerAnalytics.d.pinMetadata);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        PinMetadataCard pinMetadataCard = (PinMetadataCard) findViewById2;
        Intrinsics.checkNotNullParameter(pinMetadataCard, "<set-?>");
        this.f126833e0 = pinMetadataCard;
        View findViewById3 = v13.findViewById(com.pinterest.partnerAnalytics.d.pinMetrics);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        ToplineMetricsCard toplineMetricsCard = (ToplineMetricsCard) findViewById3;
        Intrinsics.checkNotNullParameter(toplineMetricsCard, "<set-?>");
        this.f126834f0 = toplineMetricsCard;
        View findViewById4 = v13.findViewById(com.pinterest.partnerAnalytics.d.videoMetrics);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        ToplineMetricsCard toplineMetricsCard2 = (ToplineMetricsCard) findViewById4;
        Intrinsics.checkNotNullParameter(toplineMetricsCard2, "<set-?>");
        this.f126835g0 = toplineMetricsCard2;
        View findViewById5 = v13.findViewById(com.pinterest.partnerAnalytics.d.productTags);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        ProductTagCard productTagCard = (ProductTagCard) findViewById5;
        Intrinsics.checkNotNullParameter(productTagCard, "<set-?>");
        this.f126836h0 = productTagCard;
        View findViewById6 = v13.findViewById(com.pinterest.partnerAnalytics.d.pinVideoMetricsEmptyCard);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        PinVideoMetricsEmptyCard pinVideoMetricsEmptyCard = (PinVideoMetricsEmptyCard) findViewById6;
        Intrinsics.checkNotNullParameter(pinVideoMetricsEmptyCard, "<set-?>");
        this.f126837i0 = pinVideoMetricsEmptyCard;
        View findViewById7 = v13.findViewById(com.pinterest.partnerAnalytics.d.pinSaveToBoard);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        SaveToBoardCard saveToBoardCard = (SaveToBoardCard) findViewById7;
        Intrinsics.checkNotNullParameter(saveToBoardCard, "<set-?>");
        this.f126838j0 = saveToBoardCard;
        View findViewById8 = v13.findViewById(com.pinterest.partnerAnalytics.d.overallPerformance);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f126839k0 = (OverallPerformanceView) findViewById8;
        View findViewById9 = v13.findViewById(com.pinterest.partnerAnalytics.d.aboutDataView);
        InfoAboutDataView infoAboutDataView = (InfoAboutDataView) findViewById9;
        infoAboutDataView.setPinalytics(s7());
        Intrinsics.checkNotNullExpressionValue(findViewById9, "apply(...)");
        this.f126840l0 = infoAboutDataView;
        View findViewById10 = v13.findViewById(com.pinterest.partnerAnalytics.d.pinStatsBizAccountUpsell);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f126841m0 = (PinStatsBusinessAccountUpsell) findViewById10;
        OverallPerformanceView overallPerformanceView = this.f126839k0;
        if (overallPerformanceView == null) {
            Intrinsics.r("overallPerformance");
            throw null;
        }
        v vVar = this.f126831c0;
        int i13 = 0;
        overallPerformanceView.setVisibility(((Boolean) vVar.getValue()).booleanValue() ? 0 : 8);
        ToplineMetricsCard toplineMetricsCard3 = this.f126834f0;
        if (toplineMetricsCard3 == null) {
            Intrinsics.r("pinMetrics");
            throw null;
        }
        b bVar = new b(this, i13);
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        toplineMetricsCard3.f50115i = bVar;
        ToplineMetricsCard Y7 = Y7();
        b bVar2 = new b(this, 1);
        Intrinsics.checkNotNullParameter(bVar2, "<set-?>");
        Y7.f50115i = bVar2;
        d0 s73 = s7();
        OverallPerformanceView overallPerformanceView2 = this.f126839k0;
        if (overallPerformanceView2 == null) {
            Intrinsics.r("overallPerformance");
            throw null;
        }
        overallPerformanceView2.f50055a = s73;
        PinMetadataCard pinMetadataCard2 = this.f126833e0;
        if (pinMetadataCard2 == null) {
            Intrinsics.r("pinMetadata");
            throw null;
        }
        pinMetadataCard2.f50201d = s73;
        W7().f50224a = s73;
        X7().f50085a = s73;
        SaveToBoardCard W7 = W7();
        h hVar = this.f126829a0;
        if (hVar == null) {
            Intrinsics.r("boardNavigator");
            throw null;
        }
        W7.f50225b = hVar;
        if (getPinId() != null) {
            V7(cy1.a.FETCH_PIN, null);
        }
        InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout = this.f126832d0;
        if (initialLoadSwipeRefreshLayout == null) {
            Intrinsics.r("swipeRefresh");
            throw null;
        }
        initialLoadSwipeRefreshLayout.f44880n = new a41.c(this, 5);
        if (!((Boolean) vVar.getValue()).booleanValue()) {
            InfoAboutDataView infoAboutDataView2 = this.f126840l0;
            if (infoAboutDataView2 == null) {
                Intrinsics.r("aboutChartData");
                throw null;
            }
            bs1.c.X0(infoAboutDataView2);
            ToplineMetricsCard toplineMetricsCard4 = this.f126834f0;
            if (toplineMetricsCard4 == null) {
                Intrinsics.r("pinMetrics");
                throw null;
            }
            bs1.c.X0(toplineMetricsCard4);
            PinStatsBusinessAccountUpsell pinStatsBusinessAccountUpsell = this.f126841m0;
            if (pinStatsBusinessAccountUpsell == null) {
                Intrinsics.r("pinStatsBusinessAccountUpsell");
                throw null;
            }
            pinStatsBusinessAccountUpsell.L(new a(this, 3));
            bs1.c.U1(pinStatsBusinessAccountUpsell);
        }
        a8(cy1.f.FETCH_METRICS, null);
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (nc0.f) mainView.findViewById(com.pinterest.partnerAnalytics.d.brio_toolbar);
    }
}
