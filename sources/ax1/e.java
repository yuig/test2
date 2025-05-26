package ax1;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import bx1.j;
import bx1.s;
import com.pinterest.feature.home.view.InitialLoadSwipeRefreshLayout;
import com.pinterest.partnerAnalytics.components.toplinemetrics.ToplineMetricsCard;
import com.pinterest.partnerAnalytics.feature.analytics.toppins.overview.TopPinsView;
import ea1.t0;
import ea1.u0;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import xk2.k;
import xk2.m;
import xk2.n;
import yq1.u1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lax1/e;", "Lnl1/d;", "<init>", "()V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e extends g {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f20647h0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final m1 f20648c0;

    /* renamed from: d0, reason: collision with root package name */
    public ToplineMetricsCard f20649d0;

    /* renamed from: e0, reason: collision with root package name */
    public TopPinsView f20650e0;

    /* renamed from: f0, reason: collision with root package name */
    public InitialLoadSwipeRefreshLayout f20651f0;

    /* renamed from: g0, reason: collision with root package name */
    public final d4 f20652g0;

    public e() {
        k a13 = m.a(n.NONE, new a(0, new t0(this, 23)));
        int i13 = 21;
        this.f20648c0 = a1.s(this, k0.f80436a.b(s.class), new u0(a13, 20), new ca1.m(a13, i13), new ca1.n(this, a13, i13));
        this.f20652g0 = d4.ANALYTICS_OVERVIEW;
    }

    public final s Y7() {
        return (s) this.f20648c0.getValue();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getO1() {
        return this.f20652g0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = com.pinterest.partnerAnalytics.e.fragment_analytics_graph_overview;
        ((l82.c) Y7().c()).a(j.f24108a);
        Y7().h();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("SHOULD_CLEAN_FILTER", false);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        if (bundle == null || bundle.getBoolean("SHOULD_CLEAN_FILTER")) {
            Y7().f24120g.e().a(bx1.e.f24103a);
        }
        View findViewById = v13.findViewById(com.pinterest.partnerAnalytics.d.aboutDataView);
        setPinalytics(s7());
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = v13.findViewById(com.pinterest.partnerAnalytics.d.swipeRefreshLayout);
        InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout = (InitialLoadSwipeRefreshLayout) findViewById2;
        initialLoadSwipeRefreshLayout.f44880n = new a41.c(this, 3);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f20651f0 = initialLoadSwipeRefreshLayout;
        View findViewById3 = v13.findViewById(com.pinterest.partnerAnalytics.d.toplineMetrics);
        ToplineMetricsCard toplineMetricsCard = (ToplineMetricsCard) findViewById3;
        toplineMetricsCard.b(new u1(this, 28));
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f20649d0 = toplineMetricsCard;
        View findViewById4 = v13.findViewById(com.pinterest.partnerAnalytics.d.topPinsOverview);
        TopPinsView topPinsView = (TopPinsView) findViewById4;
        topPinsView.setPinalytics(s7());
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f20650e0 = topPinsView;
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new d(this, null), 3);
    }
}
