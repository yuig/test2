package zw1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.feature.home.view.InitialLoadSwipeRefreshLayout;
import com.pinterest.partnerAnalytics.components.feedback.InfoAboutDataView;
import com.pinterest.partnerAnalytics.components.toplinemetrics.ToplineMetricsCard;
import com.pinterest.partnerAnalytics.feature.analytics.toppins.overview.TopPinsView;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.z0;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzw1/c;", "Lyk1/k;", "Lzw1/f;", "<init>", "()V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class c extends e implements f {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f142942r0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public z0 f142943j0;

    /* renamed from: k0, reason: collision with root package name */
    public uk1.e f142944k0;

    /* renamed from: l0, reason: collision with root package name */
    public final v f142945l0 = m.b(new b(this, 0));

    /* renamed from: m0, reason: collision with root package name */
    public InitialLoadSwipeRefreshLayout f142946m0;

    /* renamed from: n0, reason: collision with root package name */
    public ToplineMetricsCard f142947n0;

    /* renamed from: o0, reason: collision with root package name */
    public TopPinsView f142948o0;

    /* renamed from: p0, reason: collision with root package name */
    public i f142949p0;

    /* renamed from: q0, reason: collision with root package name */
    public final d4 f142950q0;

    public c() {
        this.E = com.pinterest.partnerAnalytics.e.fragment_analytics_graph_overview;
        this.f142950q0 = d4.ANALYTICS_OVERVIEW;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        z0 z0Var = this.f142943j0;
        if (z0Var == null) {
            Intrinsics.r("overviewPresenterFactory");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return z0Var.a(requireContext, (uk1.d) this.f142945l0.getValue());
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF99380v0() {
        return this.f142950q0;
    }

    @Override // yk1.k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("SHOULD_CLEAN_FILTER", false);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        if (bundle == null || bundle.getBoolean("SHOULD_CLEAN_FILTER")) {
            i iVar = this.f142949p0;
            if (iVar == null) {
                Intrinsics.r("listener");
                throw null;
            }
            iVar.p3();
        }
        View findViewById = v13.findViewById(com.pinterest.partnerAnalytics.d.aboutDataView);
        ((InfoAboutDataView) findViewById).setPinalytics(s7());
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = v13.findViewById(com.pinterest.partnerAnalytics.d.swipeRefreshLayout);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout = (InitialLoadSwipeRefreshLayout) findViewById2;
        this.f142946m0 = initialLoadSwipeRefreshLayout;
        if (initialLoadSwipeRefreshLayout == null) {
            Intrinsics.r("swipeRefresh");
            throw null;
        }
        initialLoadSwipeRefreshLayout.f44880n = new a41.c(this, 2);
        View findViewById3 = v13.findViewById(com.pinterest.partnerAnalytics.d.toplineMetrics);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        ToplineMetricsCard toplineMetricsCard = (ToplineMetricsCard) findViewById3;
        this.f142947n0 = toplineMetricsCard;
        if (toplineMetricsCard == null) {
            Intrinsics.r("topLineMetricsView");
            throw null;
        }
        toplineMetricsCard.b(new a(this, 0));
        View findViewById4 = v13.findViewById(com.pinterest.partnerAnalytics.d.topPinsOverview);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        TopPinsView topPinsView = (TopPinsView) findViewById4;
        this.f142948o0 = topPinsView;
        if (topPinsView != null) {
            topPinsView.setPinalytics(s7());
        } else {
            Intrinsics.r("topPinsOverview");
            throw null;
        }
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return null;
    }
}
