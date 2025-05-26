package ye1;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import h32.g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import nx.d0;
import nx.f0;
import pk.a0;

/* loaded from: classes5.dex */
public final class j extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final ze1.c f138862a;

    /* renamed from: b, reason: collision with root package name */
    public vh f138863b;

    /* renamed from: c, reason: collision with root package name */
    public final ll.j f138864c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f138865d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f138866e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f138867f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(uk1.d presenterPinalytics, uj2.q networkStateStream, ze1.c apiParams, Function0 commerceAuxData, f0 pinalyticsFactory) {
        super(presenterPinalytics, networkStateStream);
        ll.j storyImpressionHelper = new ll.j(16, 0);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(apiParams, "apiParams");
        Intrinsics.checkNotNullParameter(storyImpressionHelper, "storyImpressionHelper");
        Intrinsics.checkNotNullParameter(commerceAuxData, "commerceAuxData");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        this.f138862a = apiParams;
        this.f138863b = null;
        this.f138864c = storyImpressionHelper;
        this.f138865d = commerceAuxData;
        this.f138866e = pinalyticsFactory;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        d view = (d) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        vh vhVar = this.f138863b;
        if (vhVar != null) {
            a aVar = (a) view;
            aVar.removeAllViews();
            aVar.f138845f = null;
            aVar.f138844e = null;
            aVar.f138846g = null;
            q3(vhVar, this.f138867f);
        }
    }

    public final void q3(vh story, Integer num) {
        String actionDeeplink;
        ze1.c cVar;
        String str;
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(story, "story");
        if (isBound()) {
            a aVar = (a) ((d) getView());
            aVar.removeAllViews();
            aVar.f138845f = null;
            aVar.f138844e = null;
            aVar.f138846g = null;
        }
        this.f138863b = story;
        this.f138867f = num;
        if (isBound()) {
            a aVar2 = (a) ((d) getView());
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(this, "storyImpressionListener");
            aVar2.f138848i = this;
            kj kjVar = story.f42855m;
            String title = kjVar != null ? kjVar.a() : null;
            kj kjVar2 = story.f42856n;
            String subtitle = kjVar2 != null ? kjVar2.a() : null;
            if (title != null) {
                a aVar3 = (a) ((d) getView());
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(title, "title");
                if (aVar3.f138845f == null) {
                    Context context = aVar3.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    h hVar = new h(context);
                    int length = title.length();
                    GestaltText gestaltText = hVar.f138859a;
                    if (length != 0) {
                        Intrinsics.checkNotNullParameter(title, "title");
                        a0.p(gestaltText, title);
                        a0.w1(gestaltText);
                    }
                    if (subtitle != null && subtitle.length() != 0) {
                        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                        GestaltText gestaltText2 = hVar.f138860b;
                        a0.p(gestaltText2, subtitle);
                        a0.w1(gestaltText2);
                        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
                        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        com.bumptech.glide.c.a1((LinearLayout.LayoutParams) layoutParams, 0, 0, 0, hVar.getResources().getDimensionPixelSize(eo1.c.space_300));
                    }
                    aVar3.f138845f = hVar;
                    aVar3.addView(hVar);
                }
            }
            HashMap auxData = oe1.c.a(story, this.f138865d);
            uk1.d presenterPinalytics = getPresenterPinalytics();
            g0 g0Var = g0.PIN_CLOSEUP_RELATED_MODULE;
            String uid = story.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            uk1.d presenterPinalytics2 = oe1.c.c(presenterPinalytics, g0Var, auxData, uid, this.f138866e);
            boolean z13 = ((d) getView()) instanceof c;
            ze1.c apiParams = this.f138862a;
            if (z13) {
                List list = story.f42865w;
                Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof f30) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.size() > 6) {
                    List list2 = story.f42865w;
                    Intrinsics.checkNotNullExpressionValue(list2, "getObjects(...)");
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : list2) {
                        if (obj4 instanceof f30) {
                            arrayList2.add(obj4);
                        }
                    }
                    story.f42865w = arrayList2.subList(0, 6);
                }
                yk1.n view = getView();
                Intrinsics.g(view, "null cannot be cast to non-null type com.pinterest.feature.shopping.shoppingstories.views.RelatedModuleStoryContract.RelateModuleCarouselView");
                uj2.q<Boolean> networkStateStream = getNetworkStateStream();
                a aVar4 = (a) ((c) view);
                Intrinsics.checkNotNullParameter(story, "story");
                Intrinsics.checkNotNullParameter(presenterPinalytics2, "presenterPinalytics");
                Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
                Intrinsics.checkNotNullParameter(apiParams, "apiParams");
                Intrinsics.checkNotNullParameter(auxData, "auxData");
                if (aVar4.f138844e != null) {
                    cVar = apiParams;
                    str = "auxData";
                    obj = "source";
                    obj2 = "search_query";
                } else {
                    aVar4.setVisibility(0);
                    i21.c cVar2 = aVar4.f138843d;
                    if (cVar2 == null) {
                        Intrinsics.r("pinCarouselPresenterFactory");
                        throw null;
                    }
                    g21.e eVar = new g21.e(null, null, null);
                    int j13 = hf0.b.j(aVar4.getContext());
                    int i13 = aVar4.f138847h;
                    h21.f fVar = new h21.f(ph.a.a0(j13, i13, i13), RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL, 6);
                    np0.e eVar2 = new np0.e(aVar4.f138842c);
                    String str2 = apiParams.f141808a;
                    cVar = apiParams;
                    str = "auxData";
                    obj = "source";
                    obj2 = "search_query";
                    i21.b a13 = i21.c.a(cVar2, eVar, fVar, eVar2, str2 == null ? "unknown" : str2, new g21.b(z0.f(new Pair("source", str2), new Pair("search_query", apiParams.f141809b)), 1), presenterPinalytics2, null, auxData, 0, 0, 3648);
                    Context context2 = aVar4.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    j21.f fVar2 = new j21.f(context2, presenterPinalytics2.f122379a, networkStateStream, new j21.b(0, 0, 0, 0), "medium", null, eo1.c.space_200, false, 352);
                    fVar2.setPaddingRelative(i13, 0, i13, 0);
                    yk1.j.a().d(fVar2, a13);
                    a13.F3(story, 0);
                    aVar4.addView(fVar2);
                    aVar4.f138844e = fVar2;
                }
                actionDeeplink = null;
            } else {
                actionDeeplink = null;
                cVar = apiParams;
                str = "auxData";
                obj = "source";
                obj2 = "search_query";
            }
            ih ihVar = story.f42857o;
            String buttonText = ihVar != null ? ihVar.g() : actionDeeplink;
            if (ihVar != null) {
                actionDeeplink = ihVar.e();
            }
            if (actionDeeplink == null || actionDeeplink.length() == 0) {
                a aVar5 = (a) ((d) getView());
                if (aVar5.f138846g != null) {
                    return;
                }
                Context context3 = aVar5.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                e eVar3 = new e(context3, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
                a0.l0(eVar3.f138853g);
                a0.k1(eVar3, eVar3.getResources().getDimensionPixelOffset(eo1.c.space_800));
                aVar5.f138846g = eVar3;
                aVar5.addView(eVar3);
                return;
            }
            d dVar = (d) getView();
            HashMap navigationParams = new HashMap();
            String str3 = cVar.f141808a;
            if (str3 != null) {
                navigationParams.put(obj, str3);
            }
            String str4 = cVar.f141809b;
            if (str4 != null) {
                navigationParams.put(obj2, str4);
            }
            String l13 = ihVar.l();
            if (l13 == null) {
                l13 = "";
            }
            navigationParams.put("com.pinterest.STRUCTURED_FEED_TITLE", l13);
            String s13 = ihVar.s();
            if (s13 != null) {
                navigationParams.put("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", s13);
            }
            Integer q13 = ihVar.q();
            if (q13 != null) {
                navigationParams.put("com.pinterest.STRUCTURED_FEED_PINS_DISPLAY", String.valueOf(q13.intValue()));
            }
            Integer v13 = ihVar.v();
            if (v13 != null) {
                navigationParams.put("com.pinterest.STRUCTURED_FEED_VIEW_PARAMETER", String.valueOf(v13.intValue()));
            }
            d0 pinalytics = presenterPinalytics2.f122379a;
            Intrinsics.checkNotNullExpressionValue(pinalytics, "getPinalytics(...)");
            a aVar6 = (a) dVar;
            aVar6.getClass();
            Intrinsics.checkNotNullParameter(actionDeeplink, "actionDeeplink");
            Intrinsics.checkNotNullParameter(navigationParams, "navigationParams");
            Intrinsics.checkNotNullParameter(auxData, str);
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            if (aVar6.f138846g != null) {
                return;
            }
            Context context4 = aVar6.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            e eVar4 = new e(context4, actionDeeplink, navigationParams, auxData, pinalytics, 96);
            if (buttonText == null) {
                buttonText = eVar4.getResources().getString(x0.see_more);
                Intrinsics.checkNotNullExpressionValue(buttonText, "getString(...)");
            }
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            if (buttonText.length() > 0) {
                eVar4.f138853g.d(new d91.l(buttonText, 27));
            }
            aVar6.f138846g = eVar4;
            aVar6.addView(eVar4);
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        d view = (d) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        vh vhVar = this.f138863b;
        if (vhVar != null) {
            a aVar = (a) view;
            aVar.removeAllViews();
            aVar.f138845f = null;
            aVar.f138844e = null;
            aVar.f138846g = null;
            q3(vhVar, this.f138867f);
        }
    }
}
