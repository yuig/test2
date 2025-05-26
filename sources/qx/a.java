package qx;

import com.pinterest.hairball.network.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105309a;

    /* renamed from: b, reason: collision with root package name */
    public final d20.a f105310b;

    public a(d20.a analyticsService, int i13) {
        this.f105309a = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(analyticsService, "analyticsService");
            this.f105310b = analyticsService;
            return;
        }
        if (i13 == 2) {
            Intrinsics.checkNotNullParameter(analyticsService, "analyticsService");
            this.f105310b = analyticsService;
        } else if (i13 == 3) {
            Intrinsics.checkNotNullParameter(analyticsService, "analyticsService");
            this.f105310b = analyticsService;
        } else if (i13 != 4) {
            Intrinsics.checkNotNullParameter(analyticsService, "analyticsService");
            this.f105310b = analyticsService;
        } else {
            Intrinsics.checkNotNullParameter(analyticsService, "analyticsService");
            this.f105310b = analyticsService;
        }
    }

    @Override // com.pinterest.hairball.network.g
    public final com.pinterest.hairball.network.f a(Object[] params) {
        switch (this.f105309a) {
            case 0:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj = params[0];
                Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.analytics.data.remote.datasource.requests.parameters.MetricsRequestParameters");
                return new ar.a(this, (rx.b) obj);
            case 1:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj2 = params[0];
                Intrinsics.g(obj2, "null cannot be cast to non-null type com.pinterest.analytics.data.remote.datasource.requests.parameters.AudienceInsightsRequestParameters");
                return new ar.a(this, (rx.a) obj2);
            case 2:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj3 = params[0];
                Intrinsics.g(obj3, "null cannot be cast to non-null type com.pinterest.analytics.data.remote.datasource.requests.parameters.PinMetricsRequestParameters");
                return new ar.a(this, (rx.c) obj3);
            case 3:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj4 = params[0];
                Intrinsics.g(obj4, "null cannot be cast to non-null type com.pinterest.analytics.data.remote.datasource.requests.parameters.ProductTagsRequestParameters");
                return new ar.a(this, (rx.d) obj4);
            default:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj5 = params[0];
                Intrinsics.g(obj5, "null cannot be cast to non-null type com.pinterest.analytics.data.remote.datasource.requests.parameters.TopPinFeedRequestParameters");
                return new ar.a(this, (rx.f) obj5);
        }
    }
}
