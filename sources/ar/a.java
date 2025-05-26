package ar;

import a.k1;
import com.pinterest.api.model.fs0;
import com.pinterest.api.model.vr0;
import com.pinterest.hairball.network.f;
import com.pinterest.hairball.network.g;
import com.pinterest.repository.pin.PinService;
import fk2.f0;
import java.util.Date;
import java.util.TimeZone;
import js0.d;
import kh2.j;
import kk2.m;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import qx.e;
import tq.a0;
import u01.y;
import uj2.b0;
import wr0.l;

/* loaded from: classes3.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20363a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f20365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String boardId) {
        super(bVar, boardId);
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f20365c = bVar;
        this.f20364b = boardId;
    }

    @Override // com.pinterest.hairball.network.c
    public final /* bridge */ /* synthetic */ Object buildRequest() {
        switch (this.f20363a) {
        }
        return buildRequest();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b30.a aVar, String key) {
        super(aVar, key);
        Intrinsics.checkNotNullParameter(key, "key");
        this.f20365c = aVar;
        this.f20364b = key;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(js0.c cVar, b91.a makeupProductsRequestParams) {
        super(cVar, makeupProductsRequestParams);
        Intrinsics.checkNotNullParameter(makeupProductsRequestParams, "makeupProductsRequestParams");
        this.f20365c = cVar;
        this.f20364b = makeupProductsRequestParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(js0.c cVar, bh1.b requestParams) {
        super(cVar, requestParams);
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        this.f20365c = cVar;
        this.f20364b = requestParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(js0.c cVar, d undoHidePfyPinParams) {
        super(cVar, undoHidePfyPinParams);
        Intrinsics.checkNotNullParameter(undoHidePfyPinParams, "undoHidePfyPinParams");
        this.f20365c = cVar;
        this.f20364b = undoHidePfyPinParams;
    }

    @Override // com.pinterest.hairball.network.c
    public final b0 buildRequest() {
        String str;
        b0 F;
        String str2;
        String str3;
        int i13 = this.f20363a;
        int i14 = 21;
        int i15 = 19;
        int i16 = 1;
        Object obj = this.f20364b;
        g gVar = this.f20365c;
        switch (i13) {
            case 0:
                b bVar = (b) gVar;
                m k13 = bVar.f20367b.z((String) obj, n00.b.a(n00.c.BOARD_PIN_FEED), String.valueOf(5)).k(new ep.a(7, new a0(bVar, i16)));
                Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
                return k13;
            case 1:
                rx.b bVar2 = (rx.b) obj;
                return ((qx.a) gVar).f105310b.e(bVar2.f110124a, bVar2.f110125b, bVar2.f110126c, bVar2.f110131h, bVar2.f110132i, bVar2.f110127d, bVar2.f110128e, bVar2.f110129f, bVar2.f110133j, bVar2.f110134k, bVar2.f110130g, bVar2.f110135l, bVar2.f110136m, bVar2.f110137n, bVar2.f110139p, bVar2.f110138o, bVar2.f110140q, bVar2.f110141r);
            case 2:
                rx.a aVar = (rx.a) obj;
                return ((qx.a) gVar).f105310b.g(aVar.f110122a, aVar.f110123b);
            case 3:
                rx.c cVar = (rx.c) obj;
                return ((qx.a) gVar).f105310b.c(cVar.f110142a, cVar.f110143b, cVar.f110144c, cVar.f110145d, cVar.f110146e, cVar.f110150i, cVar.f110149h, cVar.f110148g, cVar.f110147f, false, true, true);
            case 4:
                e eVar = (e) gVar;
                m k14 = eVar.f105317a.b((String) obj, CollectionsKt.Z(eVar.f105319c, ",", null, null, 0, null, qx.d.f105316i, 30)).k(new ep.a(20, new wt.c(eVar, i15)));
                Intrinsics.checkNotNullExpressionValue(k14, "map(...)");
                return k14;
            case 5:
                qx.a aVar2 = (qx.a) gVar;
                rx.d dVar = (rx.d) obj;
                m k15 = aVar2.f105310b.a(dVar.f110151a, dVar.f110152b, dVar.f110153c, dVar.f110154d.name(), "PRODUCT_TAG", dVar.f110156f, dVar.f110157g).k(new ep.a(21, new hs.a(18, aVar2, this)));
                Intrinsics.checkNotNullExpressionValue(k15, "map(...)");
                return k15;
            case 6:
                rx.f fVar = (rx.f) obj;
                return ((qx.a) gVar).f105310b.f(fVar.f110158a, fVar.f110159b, fVar.f110160c, fVar.f110165h, fVar.f110166i, fVar.f110167j, fVar.f110168k, fVar.f110171n, fVar.f110161d, fVar.f110162e, fVar.f110163f, fVar.f110164g, fVar.f110174q, fVar.f110169l, fVar.f110170m, fVar.f110175r, fVar.f110176s, fVar.f110172o, fVar.f110173p);
            case 7:
                return ((b30.a) gVar).f21415a.a((String) obj);
            case 8:
                no0.a aVar3 = (no0.a) gVar;
                e20.a aVar4 = (e20.a) aVar3.f91656c;
                t82.b bVar3 = (t82.b) obj;
                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                long currentTimeMillis = System.currentTimeMillis();
                Long l13 = bVar3.f116762a;
                h32.m mVar = bVar3.f116767f;
                Integer valueOf = mVar != null ? Integer.valueOf(mVar.getValue()) : null;
                t82.a aVar5 = bVar3.f116771j;
                uj2.b a13 = aVar4.a(new fs0(currentTimeMillis, l13, bVar3.f116763b, bVar3.f116765d, bVar3.f116766e, valueOf, bVar3.f116768g, bVar3.f116770i, bVar3.f116769h, bVar3.f116772k, new vr0(aVar5 != null ? aVar5.f116755d : null, aVar5 != null ? aVar5.f116754c : null, aVar5 != null ? aVar5.f116757f : null, aVar5 != null ? aVar5.f116758g : null, aVar5 != null ? aVar5.f116760i : null, aVar5 != null ? aVar5.f116756e : null, aVar5 != null ? aVar5.f116752a : null, aVar5 != null ? aVar5.f116753b : null, aVar5 != null ? aVar5.f116759h : null, aVar5 != null ? aVar5.f116761j : null)));
                k1 k1Var = new k1(aVar3, 8);
                a13.getClass();
                f0 f0Var = new f0(a13, k1Var, null, 0);
                Intrinsics.checkNotNullExpressionValue(f0Var, "toSingle(...)");
                return f0Var;
            case 9:
                no0.a aVar6 = (no0.a) gVar;
                l12.b bVar4 = (l12.b) aVar6.f91656c;
                vo0.c cVar2 = (vo0.c) obj;
                String str4 = cVar2.f126389a;
                Date date = new Date();
                Intrinsics.checkNotNullParameter(date, "date");
                return bVar4.b(str4, TimeZone.getDefault().getOffset(date.getTime()) / 60000, n00.b.a(n00.c.CONTEXTUAL_EXPLORE), n00.b.a(n00.c.EXPLORE_COVER_IMAGE), 5, ((g0) aVar6.f91655b).a(), 6, cVar2.f126390b, cVar2.f126391c);
            case 10:
                d dVar2 = (d) obj;
                f0 q13 = ((x10.b) ((js0.c) gVar).f77565b).e(dVar2.f77566a, dVar2.f77567b, dVar2.f77568c, dVar2.f77569d, dVar2.f77570e).q(Unit.f80348a);
                Intrinsics.checkNotNullExpressionValue(q13, "toSingleDefault(...)");
                return q13;
            case 11:
                yu0.b bVar5 = (yu0.b) obj;
                m k16 = ((m20.b) ((js0.c) gVar).f77565b).a(bVar5.f140157a, bVar5.f140158b, bVar5.f140159c, bVar5.f140160d, bVar5.f140161e).k(new l(i14, yu0.a.f140156i));
                Intrinsics.checkNotNullExpressionValue(k16, "map(...)");
                return k16;
            case 12:
                no0.a aVar7 = (no0.a) gVar;
                y yVar = (y) obj;
                m k17 = ((PinService) aVar7.f91655b).loadCloseupShoppingModule(yVar.f119974a, n00.b.a(n00.c.PIN_CLOSEUP), yVar.f119975b, yVar.f119976c).k(new wv0.a(19, new dx0.d(aVar7, 27)));
                Intrinsics.checkNotNullExpressionValue(k17, "map(...)");
                return k17;
            case 13:
                j22.b bVar6 = ((p71.c) gVar).f99083b;
                p71.a aVar8 = (p71.a) obj;
                String query = aVar8.f99075a;
                Intrinsics.checkNotNullParameter(bVar6, "<this>");
                Intrinsics.checkNotNullParameter(query, "query");
                boolean z13 = aVar8.f99076b;
                m k18 = bVar6.g(query, Boolean.FALSE, "0", j22.g.f74524c, "0", "0", "0", z13 ? "recent_personal_searches" : "recent_board_searches", Boolean.valueOf(z13), "board.owner(),board.pin_count,board.section_count,board.image_cover_url,board.images[236x]", null, null).k(new d51.a(12, p71.b.f99077j));
                Intrinsics.checkNotNullExpressionValue(k18, "map(...)");
                return k18;
            case 14:
                j22.b bVar7 = ((p71.c) gVar).f99083b;
                p71.d dVar3 = (p71.d) obj;
                String str5 = dVar3.f99084a;
                String valueOf2 = String.valueOf(dVar3.f99085b);
                Boolean bool = Boolean.FALSE;
                m k19 = bVar7.g(str5, bool, valueOf2, "0", "0", "0", "0", null, bool, null, null, null).k(new d51.a(13, p71.b.f99078k));
                Intrinsics.checkNotNullExpressionValue(k19, "map(...)");
                return k19;
            case 15:
                p71.e eVar2 = (p71.e) obj;
                boolean z14 = eVar2.f99087b;
                boolean z15 = eVar2.f99088c;
                String str6 = eVar2.f99086a;
                if (z14) {
                    j22.b bVar8 = ((p71.c) gVar).f99083b;
                    if (z15) {
                        str2 = j22.g.f74531j;
                    } else {
                        str2 = j22.g.f74530i;
                    }
                    F = j.F(bVar8, str6, str2, true);
                } else {
                    j22.b bVar9 = ((p71.c) gVar).f99083b;
                    if (z15) {
                        str = j22.g.f74534m;
                    } else {
                        str = j22.g.f74533l;
                    }
                    F = j.F(bVar9, str6, str, false);
                }
                m k23 = F.k(new d51.a(14, p71.b.f99079l));
                Intrinsics.checkNotNullExpressionValue(k23, "map(...)");
                return k23;
            case 16:
                String numRecentQueries = j22.g.f74526e;
                p71.f fVar2 = (p71.f) obj;
                if (fVar2.f99090b) {
                    str3 = j22.g.f74531j;
                } else {
                    str3 = j22.g.f74529h;
                }
                boolean z16 = fVar2.f99089a;
                if (z16) {
                    numRecentQueries = str3;
                }
                no0.a aVar9 = (no0.a) gVar;
                j22.b bVar10 = (j22.b) aVar9.f91655b;
                String str7 = (String) aVar9.f91656c;
                Intrinsics.checkNotNullParameter(bVar10, "<this>");
                Intrinsics.checkNotNullParameter(numRecentQueries, "numRecentQueries");
                m k24 = bVar10.g("", Boolean.FALSE, "0", "0", "0", "0", numRecentQueries, z16 ? "recent_personal_searches" : "recent_pin_searches,recent_user_searches,recent_board_searches", Boolean.valueOf(z16), str7, null, null).k(new d51.a(15, p71.b.f99080m));
                Intrinsics.checkNotNullExpressionValue(k24, "map(...)");
                return k24;
            case 17:
                return ((k22.m) ((js0.c) gVar).f77565b).G(((p71.g) obj).f99091a, n00.b.a(n00.c.PIN_STATS_PIN_FEED));
            case 18:
                b91.a aVar10 = (b91.a) obj;
                return ((x20.a) ((js0.c) gVar).f77565b).b(aVar10.f22236a, aVar10.f22237b, Boolean.FALSE, aVar10.f22238c, aVar10.f22239d, aVar10.f22240e, aVar10.f22241f, aVar10.f22242g, aVar10.f22243h, aVar10.f22244i, n00.b.a(n00.c.VIRTUAL_TRY_ON));
            default:
                bh1.b bVar11 = (bh1.b) obj;
                return ((w20.a) ((js0.c) gVar).f77565b).a(bVar11.f22806a, bVar11.f22807b, bVar11.f22808c, n00.b.a(n00.c.TODAY_ARTICLE_DEFAULT));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(js0.c cVar, p71.g parameters) {
        super(cVar, parameters);
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f20365c = cVar;
        this.f20364b = parameters;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(js0.c cVar, yu0.b interestTagsRequestParam) {
        super(cVar, interestTagsRequestParam);
        Intrinsics.checkNotNullParameter(interestTagsRequestParam, "interestTagsRequestParam");
        this.f20365c = cVar;
        this.f20364b = interestTagsRequestParam;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(no0.a aVar, p71.f recentSearchesRequestParams) {
        super(aVar, recentSearchesRequestParams);
        Intrinsics.checkNotNullParameter(recentSearchesRequestParams, "recentSearchesRequestParams");
        this.f20365c = aVar;
        this.f20364b = recentSearchesRequestParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(no0.a aVar, t82.b surveyResult) {
        super(aVar, surveyResult);
        Intrinsics.checkNotNullParameter(surveyResult, "surveyResult");
        this.f20365c = aVar;
        this.f20364b = surveyResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(no0.a aVar, y shoppingModuleRequestParams) {
        super(aVar, shoppingModuleRequestParams);
        Intrinsics.checkNotNullParameter(shoppingModuleRequestParams, "shoppingModuleRequestParams");
        this.f20365c = aVar;
        this.f20364b = shoppingModuleRequestParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(no0.a aVar, vo0.c bubbleContentParams) {
        super(aVar, bubbleContentParams);
        Intrinsics.checkNotNullParameter(bubbleContentParams, "bubbleContentParams");
        this.f20365c = aVar;
        this.f20364b = bubbleContentParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p71.c cVar, p71.a boardRequestParams) {
        super(cVar, boardRequestParams);
        Intrinsics.checkNotNullParameter(boardRequestParams, "boardRequestParams");
        this.f20365c = cVar;
        this.f20364b = boardRequestParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p71.c cVar, p71.d autocompleteRequestParams) {
        super(cVar, autocompleteRequestParams);
        Intrinsics.checkNotNullParameter(autocompleteRequestParams, "autocompleteRequestParams");
        this.f20365c = cVar;
        this.f20364b = autocompleteRequestParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p71.c cVar, p71.e pinAutocompleteRequestParams) {
        super(cVar, pinAutocompleteRequestParams);
        Intrinsics.checkNotNullParameter(pinAutocompleteRequestParams, "pinAutocompleteRequestParams");
        this.f20365c = cVar;
        this.f20364b = pinAutocompleteRequestParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qx.a aVar, rx.a audienceInsightsRequestParameters) {
        super(aVar, audienceInsightsRequestParameters);
        Intrinsics.checkNotNullParameter(audienceInsightsRequestParameters, "audienceInsightsRequestParameters");
        this.f20365c = aVar;
        this.f20364b = audienceInsightsRequestParameters;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qx.a aVar, rx.b analyticsRequestParams) {
        super(aVar, analyticsRequestParams);
        Intrinsics.checkNotNullParameter(analyticsRequestParams, "analyticsRequestParams");
        this.f20365c = aVar;
        this.f20364b = analyticsRequestParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qx.a aVar, rx.c topPinsRequestParameters) {
        super(aVar, topPinsRequestParameters);
        Intrinsics.checkNotNullParameter(topPinsRequestParameters, "topPinsRequestParameters");
        this.f20365c = aVar;
        this.f20364b = topPinsRequestParameters;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qx.a aVar, rx.d productTagsRemoteRequest) {
        super(aVar, productTagsRemoteRequest);
        Intrinsics.checkNotNullParameter(productTagsRemoteRequest, "productTagsRemoteRequest");
        this.f20365c = aVar;
        this.f20364b = productTagsRemoteRequest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qx.a aVar, rx.f topPinsRequestParameters) {
        super(aVar, topPinsRequestParameters);
        Intrinsics.checkNotNullParameter(topPinsRequestParameters, "topPinsRequestParameters");
        this.f20365c = aVar;
        this.f20364b = topPinsRequestParameters;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, String pinId) {
        super(eVar, pinId);
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f20365c = eVar;
        this.f20364b = pinId;
    }
}
