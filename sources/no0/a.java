package no0;

import android.content.Context;
import com.pinterest.api.model.deserializer.DynamicStoryDeserializer;
import com.pinterest.hairball.network.f;
import com.pinterest.hairball.network.g;
import com.pinterest.repository.pin.PinService;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.j3;
import lh0.z3;
import m60.g0;
import t82.b;
import u01.y;
import vo0.c;

/* loaded from: classes5.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91654a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f91655b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f91656c;

    public a(Context context, e20.a brandSurveyService) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brandSurveyService, "brandSurveyService");
        this.f91655b = context;
        this.f91656c = brandSurveyService;
    }

    @Override // com.pinterest.hairball.network.g
    public final f a(Object[] params) {
        switch (this.f91654a) {
            case 0:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj = params[0];
                Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.survey.thrift.SurveyResult");
                return new ar.a(this, (b) obj);
            case 1:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj2 = params[0];
                Intrinsics.g(obj2, "null cannot be cast to non-null type com.pinterest.feature.bubbles.model.BubbleContentParams");
                return new ar.a(this, (c) obj2);
            case 2:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj3 = params[0];
                Intrinsics.g(obj3, "null cannot be cast to non-null type com.pinterest.feature.pin.closeup.model.ShoppingModuleRequestParams");
                return new ar.a(this, (y) obj3);
            default:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj4 = params[0];
                Intrinsics.g(obj4, "null cannot be cast to non-null type com.pinterest.feature.search.typeahead.remoterequest.RecentSearchesRequestParams");
                return new ar.a(this, (p71.f) obj4);
        }
    }

    public a(PinService pinService, DynamicStoryDeserializer dynamicStoryDeserializer) {
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        Intrinsics.checkNotNullParameter(dynamicStoryDeserializer, "dynamicStoryDeserializer");
        this.f91655b = pinService;
        this.f91656c = dynamicStoryDeserializer;
    }

    public /* synthetic */ a(j22.b bVar) {
        this(bVar, (j3) null);
    }

    public a(j22.b searchService, j3 j3Var) {
        Intrinsics.checkNotNullParameter(searchService, "searchService");
        this.f91655b = searchService;
        String str = null;
        if (j3Var != null) {
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) j3Var.f83398a;
            if (!g1Var.o("android_search_nux_empty_state_ac_prototype", "enabled", z3Var) && !g1Var.l("android_search_nux_empty_state_ac_prototype") && !g1Var.o("android_search_nux_1tap_autocomplete", "enabled", z3Var) && !g1Var.l("android_search_nux_1tap_autocomplete")) {
                j3Var = null;
            }
            if (j3Var != null) {
                str = n00.b.a(n00.c.EXPLORE_COVER_IMAGE);
            }
        }
        this.f91656c = str;
    }

    public a(g0 pageSizeProvider, l12.b exploreService) {
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(exploreService, "exploreService");
        this.f91655b = pageSizeProvider;
        this.f91656c = exploreService;
    }
}
