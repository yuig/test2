package js0;

import com.pinterest.hairball.network.f;
import com.pinterest.hairball.network.g;
import k22.m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77564a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Object f77565b;

    public c(m userService) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        this.f77565b = userService;
    }

    @Override // com.pinterest.hairball.network.g
    public final f a(Object[] params) {
        switch (this.f77564a) {
            case 0:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj = params[0];
                Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.feature.gridactions.pingridhide.remoterequest.UndoHidePfyPinParams");
                return new ar.a(this, (d) obj);
            case 1:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj2 = params[0];
                Intrinsics.g(obj2, "null cannot be cast to non-null type com.pinterest.feature.ideaPinCreation.interesttagging.remote.InterestTagQueryRequestParams");
                return new ar.a(this, (yu0.b) obj2);
            case 2:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj3 = params[0];
                Intrinsics.g(obj3, "null cannot be cast to non-null type com.pinterest.feature.search.typeahead.remoterequest.RecentlyActionedPinsRequestParams");
                return new ar.a(this, (p71.g) obj3);
            case 3:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj4 = params[0];
                Intrinsics.g(obj4, "null cannot be cast to non-null type com.pinterest.feature.search.visual.tryon.remoterequest.MakeupProductsRequestParams");
                return new ar.a(this, (b91.a) obj4);
            default:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj5 = params[0];
                Intrinsics.g(obj5, "null cannot be cast to non-null type com.pinterest.feature.todaytab.articlefeed.relatedarticles.remoterequest.TodayTabArticleRelatedArticlesRequestParams");
                return new ar.a(this, (bh1.b) obj5);
        }
    }

    public c(m20.b interestTaggingService) {
        Intrinsics.checkNotNullParameter(interestTaggingService, "interestTaggingService");
        this.f77565b = interestTaggingService;
    }

    public c(w20.a todayTabService) {
        Intrinsics.checkNotNullParameter(todayTabService, "todayTabService");
        this.f77565b = todayTabService;
    }

    public c(x10.b pinApiService) {
        Intrinsics.checkNotNullParameter(pinApiService, "pinApiService");
        this.f77565b = pinApiService;
    }

    public c(x20.a tryOnService) {
        Intrinsics.checkNotNullParameter(tryOnService, "tryOnService");
        this.f77565b = tryOnService;
    }
}
