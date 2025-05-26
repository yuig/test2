package px;

import com.pinterest.api.model.deserializer.DynamicStoryDeserializer;
import j1.p0;
import java.util.Date;
import kk2.m;
import kk2.t;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;
import uj2.q;
import x02.i2;

/* loaded from: classes3.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f101546a;

    /* renamed from: b, reason: collision with root package name */
    public final d20.a f101547b;

    /* renamed from: c, reason: collision with root package name */
    public final qx.c f101548c;

    /* renamed from: d, reason: collision with root package name */
    public final qx.a f101549d;

    /* renamed from: e, reason: collision with root package name */
    public final DynamicStoryDeserializer f101550e;

    public c(i2 pinRepository, d20.a analyticsService, qx.c pinSaveToBoardListRequest, qx.a audienceInsightsRemoteRequest, DynamicStoryDeserializer dynamicStoryDeserializer) {
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(analyticsService, "analyticsService");
        Intrinsics.checkNotNullParameter(pinSaveToBoardListRequest, "pinSaveToBoardListRequest");
        Intrinsics.checkNotNullParameter(audienceInsightsRemoteRequest, "audienceInsightsRemoteRequest");
        Intrinsics.checkNotNullParameter(dynamicStoryDeserializer, "dynamicStoryDeserializer");
        this.f101546a = pinRepository;
        this.f101547b = analyticsService;
        this.f101548c = pinSaveToBoardListRequest;
        this.f101549d = audienceInsightsRemoteRequest;
        this.f101550e = dynamicStoryDeserializer;
    }

    public final t a(rx.b params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return pk2.f.k(((b0) new qx.a(this.f101547b, 0).b(params).buildRequest()).r(tk2.e.f118017c), "observeOn(...)");
    }

    public final t b(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return pk2.f.k(((b0) this.f101549d.b(new rx.a(userId, "engagement")).buildRequest()).r(tk2.e.f118017c), "observeOn(...)");
    }

    public final m c(String aggregatePinId) {
        Intrinsics.checkNotNullParameter(aggregatePinId, "aggregatePinId");
        m k13 = ((b0) this.f101548c.prepare(aggregatePinId).buildRequest()).r(tk2.e.f118017c).l(wj2.c.a()).k(new ep.a(17, b.f101542j));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        return k13;
    }

    public final q d(String pinId, Date startDate, Date endDate) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        q t13 = this.f101546a.P(pinId).t(new ep.a(18, new p0(this, startDate, endDate, pinId, 7)));
        Intrinsics.checkNotNullExpressionValue(t13, "flatMap(...)");
        return t13;
    }

    public final t e(rx.d params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return pk2.f.k(((b0) new qx.a(this.f101547b, 3).b(params).buildRequest()).r(tk2.e.f118017c), "observeOn(...)");
    }

    public final t f(String params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return pk2.f.k(((b0) new qx.e(this.f101547b, this.f101550e).b(params).buildRequest()).r(tk2.e.f118017c), "observeOn(...)");
    }

    public final t g(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return pk2.f.k(((b0) this.f101549d.b(new rx.a(userId, "impression_plus_engagement")).buildRequest()).r(tk2.e.f118017c), "observeOn(...)");
    }
}
