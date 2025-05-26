package j90;

import a.k1;
import com.pinterest.collage.cutoutcloseup.remoterequest.CollagesCarouselCutoutRelatedModulesPagedRemoteRequest;
import com.pinterest.creatorHub.feature.hub.data.CreatorHubRecentPinsRemoteRequest;
import com.pinterest.feature.conversation.datasource.ThreadMessagesRetrofitPagedRemoteRequest;
import com.pinterest.feature.engagementtab.EngagementTabRetrofitRemoteRequest;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import com.pinterest.feature.newshub.detail.remoterequest.FetchNewsHubDetailRetrofitRemoteRequest;
import com.pinterest.feature.profile.savedtab.remoterequest.ProfileSavedTabBoardsRetrofitPagedRemoteRequest;
import com.pinterest.feature.search.visual.flashlight.datasource.FlashlightRetrofitPagedRemoteRequest;
import com.pinterest.feature.search.visual.lens.remoterequest.LensFirstRetrofitPagedRemoteRequest;
import com.pinterest.hairball.network.d;
import com.pinterest.hairball.network.e;
import fk2.f0;
import j41.i;
import j81.h;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kk2.g;
import kk2.k;
import kk2.m;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import lq0.f1;
import lq0.g1;
import ra0.l0;
import rx0.f;
import sk0.x;
import t80.r;
import uj2.b0;
import wr0.l;
import xj2.c;

/* loaded from: classes5.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75099a = 12;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f75100b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b91.b bVar) {
        super(bVar, new Object[0]);
        this.f75100b = bVar;
    }

    @Override // com.pinterest.hairball.network.c
    public final /* bridge */ /* synthetic */ Object buildRequest() {
        switch (this.f75099a) {
        }
        return buildRequest();
    }

    @Override // com.pinterest.hairball.network.d, com.pinterest.hairball.network.b
    public final /* bridge */ /* synthetic */ Object execute(Object obj, Object obj2) {
        switch (this.f75099a) {
            case 10:
                return execute((ak2.e) obj, (ak2.e) obj2);
            default:
                return super.execute(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CollagesCarouselCutoutRelatedModulesPagedRemoteRequest collagesCarouselCutoutRelatedModulesPagedRemoteRequest, Object[] params) {
        super(collagesCarouselCutoutRelatedModulesPagedRemoteRequest, Arrays.copyOf(params, params.length));
        Intrinsics.checkNotNullParameter(params, "params");
        this.f75100b = collagesCarouselCutoutRelatedModulesPagedRemoteRequest;
    }

    @Override // com.pinterest.hairball.network.d
    public final c execute(ak2.e onSuccess, ak2.e onError) {
        switch (this.f75099a) {
            case 10:
                Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
                Intrinsics.checkNotNullParameter(onError, "onError");
                if (!((FlashlightRetrofitPagedRemoteRequest) this.f75100b).f48044a) {
                    break;
                } else {
                    break;
                }
        }
        return super.execute(onSuccess, onError);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CreatorHubRecentPinsRemoteRequest creatorHubRecentPinsRemoteRequest, Object[] params) {
        super(creatorHubRecentPinsRemoteRequest, Arrays.copyOf(params, params.length));
        Intrinsics.checkNotNullParameter(params, "params");
        this.f75100b = creatorHubRecentPinsRemoteRequest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ThreadMessagesRetrofitPagedRemoteRequest threadMessagesRetrofitPagedRemoteRequest, Object[] params) {
        super(threadMessagesRetrofitPagedRemoteRequest, Arrays.copyOf(params, params.length));
        Intrinsics.checkNotNullParameter(params, "params");
        this.f75100b = threadMessagesRetrofitPagedRemoteRequest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EngagementTabRetrofitRemoteRequest engagementTabRetrofitRemoteRequest, Object[] params) {
        super(engagementTabRetrofitRemoteRequest, Arrays.copyOf(params, params.length));
        Intrinsics.checkNotNullParameter(params, "params");
        this.f75100b = engagementTabRetrofitRemoteRequest;
    }

    @Override // com.pinterest.hairball.network.c
    public final b0 buildRequest() {
        ConcurrentHashMap concurrentHashMap;
        int i13 = this.f75099a;
        int i14 = 5;
        int i15 = 24;
        int i16 = 4;
        int i17 = 27;
        int i18 = 18;
        int i19 = 7;
        int i23 = 6;
        int i24 = 2;
        int i25 = 0;
        int i26 = 3;
        int i27 = 1;
        e eVar = this.f75100b;
        switch (i13) {
            case 0:
                CollagesCarouselCutoutRelatedModulesPagedRemoteRequest collagesCarouselCutoutRelatedModulesPagedRemoteRequest = (CollagesCarouselCutoutRelatedModulesPagedRemoteRequest) eVar;
                g gVar = new g(new m(new k(new k1(this, i14), 1), new ep.a(28, new r(8, collagesCarouselCutoutRelatedModulesPagedRemoteRequest, this)), 0).k(new ep.a(29, new a(collagesCarouselCutoutRelatedModulesPagedRemoteRequest, i25))), new u60.g(29, new a(collagesCarouselCutoutRelatedModulesPagedRemoteRequest, i27)), 0);
                Intrinsics.checkNotNullExpressionValue(gVar, "doAfterSuccess(...)");
                return gVar;
            case 1:
                CreatorHubRecentPinsRemoteRequest creatorHubRecentPinsRemoteRequest = (CreatorHubRecentPinsRemoteRequest) eVar;
                m k13 = new m(new k(new k1(this, i23), 1), new lb0.c(2, new gd0.c(i27, creatorHubRecentPinsRemoteRequest, this)), 0).k(new lb0.c(3, new l0(creatorHubRecentPinsRemoteRequest, 19)));
                Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
                return k13;
            case 2:
                Object C = c0.C(getParams());
                String str = C instanceof String ? (String) C : null;
                if (str == null) {
                    k g13 = b0.g(new IllegalArgumentException("first param must be boardId"));
                    Intrinsics.checkNotNullExpressionValue(g13, "error(...)");
                    return g13;
                }
                Object J2 = c0.J(1, getParams());
                String str2 = J2 instanceof String ? (String) J2 : null;
                if (str2 == null) {
                    k g14 = b0.g(new IllegalArgumentException("second param must be userId"));
                    Intrinsics.checkNotNullExpressionValue(g14, "error(...)");
                    return g14;
                }
                return ((f12.a) ((hj0.a) eVar).f69280b).a(str, str2);
            case 3:
                return ((so0.a) eVar).f114751a.a();
            case 4:
                ThreadMessagesRetrofitPagedRemoteRequest threadMessagesRetrofitPagedRemoteRequest = (ThreadMessagesRetrofitPagedRemoteRequest) eVar;
                g gVar2 = new g(new m(new k(new k1(this, 9), 1), new qk0.b(i18, new x(i15, this, threadMessagesRetrofitPagedRemoteRequest)), 0).k(new qk0.b(19, new bq0.k(threadMessagesRetrofitPagedRemoteRequest, i25))), new op0.a(11, new bq0.k(threadMessagesRetrofitPagedRemoteRequest, i27)), 0);
                Intrinsics.checkNotNullExpressionValue(gVar2, "doAfterSuccess(...)");
                return gVar2;
            case 5:
                EngagementTabRetrofitRemoteRequest engagementTabRetrofitRemoteRequest = (EngagementTabRetrofitRemoteRequest) eVar;
                m k14 = new m(new k(new k1(this, 10), 1), new l(i27, new g1(3, engagementTabRetrofitRemoteRequest, this)), 0).k(new l(i24, new f1(engagementTabRetrofitRemoteRequest, i23)));
                Intrinsics.checkNotNullExpressionValue(k14, "map(...)");
                return k14;
            case 6:
                j22.b bVar = (j22.b) ((hj0.a) eVar).f69280b;
                Object obj = getParams()[0];
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.String");
                f0 q13 = bVar.k((String) obj, (String) getParams()[1], (String) c0.J(2, getParams())).q(Unit.f80348a);
                Intrinsics.checkNotNullExpressionValue(q13, "toSingleDefault(...)");
                return q13;
            case 7:
                FetchNewsHubDetailRetrofitRemoteRequest fetchNewsHubDetailRetrofitRemoteRequest = (FetchNewsHubDetailRetrofitRemoteRequest) eVar;
                m k15 = new m(new k(new k1(this, 13), 1), new wv0.a(i19, new r0(i17, fetchNewsHubDetailRetrofitRemoteRequest, this)), 0).k(new wv0.a(8, new dx0.d(fetchNewsHubDetailRetrofitRemoteRequest, i24)));
                Intrinsics.checkNotNullExpressionValue(k15, "map(...)");
                return k15;
            case 8:
                return ((h51.a) eVar).f67697a.a();
            case 9:
                ProfileSavedTabBoardsRetrofitPagedRemoteRequest profileSavedTabBoardsRetrofitPagedRemoteRequest = (ProfileSavedTabBoardsRetrofitPagedRemoteRequest) eVar;
                g gVar3 = new g(new m(new k(new k1(this, 16), 1), new d51.a(i26, new y11.c(15, profileSavedTabBoardsRetrofitPagedRemoteRequest, this)), 0).k(new d51.a(i16, new i(this, i19))), new g51.g(19, new i(profileSavedTabBoardsRetrofitPagedRemoteRequest, 8)), 0);
                Intrinsics.checkNotNullExpressionValue(gVar3, "doAfterSuccess(...)");
                return gVar3;
            case 10:
                String valueOf = String.valueOf(getParams()[1]);
                qz.f0 f0Var = (qz.f0) getParams()[1];
                String str3 = (f0Var == null || (concurrentHashMap = f0Var.f105397a) == null) ? null : (String) concurrentHashMap.get("page_size");
                FlashlightRetrofitPagedRemoteRequest flashlightRetrofitPagedRemoteRequest = (FlashlightRetrofitPagedRemoteRequest) eVar;
                ConcurrentHashMap concurrentHashMap2 = FlashlightRetrofitPagedRemoteRequest.f48043b;
                concurrentHashMap2.containsKey(valueOf);
                flashlightRetrofitPagedRemoteRequest.getClass();
                boolean z13 = flashlightRetrofitPagedRemoteRequest.f48044a;
                if (!z13) {
                    if (concurrentHashMap2.containsKey(valueOf)) {
                        Object obj2 = concurrentHashMap2.get(valueOf);
                        Intrinsics.f(obj2);
                        g gVar4 = new g(new g(new g(b0.h((uk2.l) obj2), new a81.a(4, new j81.g(flashlightRetrofitPagedRemoteRequest, i25)), 3).k(new d51.a(i15, new j81.g(flashlightRetrofitPagedRemoteRequest, i27))), new a81.a(5, new j81.g(flashlightRetrofitPagedRemoteRequest, i24)), 0), new a81.a(6, h.f74940i), 1);
                        Intrinsics.checkNotNullExpressionValue(gVar4, "doOnError(...)");
                        return gVar4;
                    }
                    concurrentHashMap2.remove(valueOf);
                } else {
                    concurrentHashMap2.clear();
                }
                uk2.l lVar = z13 ? new uk2.l(new uk2.k()) : null;
                int i28 = 17;
                g gVar5 = new g(new g(new m(new k(new k1(this, i28), 1), new d51.a(25, new f(flashlightRetrofitPagedRemoteRequest, str3, this, i28)), 0).k(new d51.a(26, new j81.i(flashlightRetrofitPagedRemoteRequest, lVar, i25))), new a81.a(7, new j81.g(flashlightRetrofitPagedRemoteRequest, i26)), 0), new a81.a(8, new j81.i(flashlightRetrofitPagedRemoteRequest, lVar, i27)), 1);
                Intrinsics.checkNotNullExpressionValue(gVar5, "doOnError(...)");
                if (z13 && lVar != null) {
                    concurrentHashMap2.put(valueOf, lVar);
                }
                return gVar5;
            case 11:
                LensFirstRetrofitPagedRemoteRequest lensFirstRetrofitPagedRemoteRequest = (LensFirstRetrofitPagedRemoteRequest) eVar;
                g gVar6 = new g(new m(new k(new k1(this, i18), 1), new t81.a(i25, new y71.b(i26, lensFirstRetrofitPagedRemoteRequest, this)), 0).k(new t81.a(i27, new t81.b(lensFirstRetrofitPagedRemoteRequest, i25))), new a81.a(27, new t81.b(lensFirstRetrofitPagedRemoteRequest, i27)), 0);
                Intrinsics.checkNotNullExpressionValue(gVar6, "doAfterSuccess(...)");
                return gVar6;
            case 12:
                return ((b91.b) eVar).f22245a.a();
            default:
                return ((h22.f) ((hj0.a) eVar).f69280b).b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FetchNewsHubDetailRetrofitRemoteRequest fetchNewsHubDetailRetrofitRemoteRequest, Object[] params) {
        super(fetchNewsHubDetailRetrofitRemoteRequest, Arrays.copyOf(params, params.length));
        Intrinsics.checkNotNullParameter(params, "params");
        this.f75100b = fetchNewsHubDetailRetrofitRemoteRequest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ProfileSavedTabBoardsRetrofitPagedRemoteRequest profileSavedTabBoardsRetrofitPagedRemoteRequest, Object[] params) {
        super(profileSavedTabBoardsRetrofitPagedRemoteRequest, Arrays.copyOf(params, params.length));
        Intrinsics.checkNotNullParameter(params, "params");
        this.f75100b = profileSavedTabBoardsRetrofitPagedRemoteRequest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FlashlightRetrofitPagedRemoteRequest flashlightRetrofitPagedRemoteRequest, Object[] params) {
        super(flashlightRetrofitPagedRemoteRequest, Arrays.copyOf(params, params.length));
        Intrinsics.checkNotNullParameter(params, "params");
        this.f75100b = flashlightRetrofitPagedRemoteRequest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LensFirstRetrofitPagedRemoteRequest lensFirstRetrofitPagedRemoteRequest, Object[] params) {
        super(lensFirstRetrofitPagedRemoteRequest, Arrays.copyOf(params, params.length));
        Intrinsics.checkNotNullParameter(params, "params");
        this.f75100b = lensFirstRetrofitPagedRemoteRequest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h51.a aVar) {
        super(aVar, new Object[0]);
        this.f75100b = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hj0.a aVar, Object[] params) {
        super(aVar, params);
        Intrinsics.checkNotNullParameter(params, "params");
        this.f75100b = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hj0.a aVar, Object[] params, int i13) {
        super(aVar, Arrays.copyOf(params, params.length));
        Intrinsics.checkNotNullParameter(params, "params");
        this.f75100b = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hj0.a aVar, Object[] params, Object obj) {
        super(aVar, Arrays.copyOf(params, params.length));
        Intrinsics.checkNotNullParameter(params, "params");
        this.f75100b = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(so0.a aVar) {
        super(aVar, new Object[0]);
        this.f75100b = aVar;
    }
}
