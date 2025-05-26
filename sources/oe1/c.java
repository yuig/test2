package oe1;

import com.pinterest.api.model.kh;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.xi;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kh2.d;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.f0;
import z32.n1;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f94273a = z0.g(new Pair(n1.PB_BRAND, u0.BRANDS_NAVIGATION_BUTTON), new Pair(n1.PB_CATEGORY, u0.CATEGORY_NAVIGATION_BUTTON), new Pair(n1.PB_SHOPPING_LIST, u0.SHOPPING_LIST_NAVIGATION_BUTTON));

    public static final HashMap a(vh story, Function0 commerceAuxData) {
        String a13;
        String str;
        Intrinsics.checkNotNullParameter(story, "story");
        Intrinsics.checkNotNullParameter(commerceAuxData, "commerceAuxData");
        HashMap E = d.E(story);
        HashMap hashMap = (HashMap) commerceAuxData.invoke();
        if (hashMap != null) {
            E.putAll(hashMap);
        }
        if (!E.containsKey("story_id")) {
            String uid = story.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            E.put("story_id", uid);
        }
        if (!E.containsKey("story_type")) {
            String q13 = story.q();
            Intrinsics.checkNotNullExpressionValue(q13, "getStoryType(...)");
            E.put("story_type", q13);
        }
        if (!E.containsKey("content_ids") && (str = story.f42852j) != null) {
            Intrinsics.checkNotNullExpressionValue(str, "getContentIds(...)");
            E.put("content_ids", str);
        }
        kj kjVar = story.f42855m;
        if (kjVar != null && (a13 = kjVar.a()) != null && a13.length() > 0 && !E.containsKey("story_title")) {
            E.put("story_title", a13);
        }
        if (!E.containsKey("total_object_count")) {
            E.put("total_object_count", String.valueOf(story.f42865w.size()));
        }
        Map a14 = story.a();
        if (a14 != null) {
            for (Map.Entry entry : a14.entrySet()) {
                Object key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
                E.put(key, entry.getValue().toString());
            }
        }
        story.f42859q = E;
        return E;
    }

    public static final b b(vh story, Function0 commerceAuxData, uk1.d presenterPinalytics, f0 pinalyticsFactory, Integer num, ze1.c shoppingNavParams, String str) {
        xi c13;
        Intrinsics.checkNotNullParameter(story, "story");
        Intrinsics.checkNotNullParameter(commerceAuxData, "commerceAuxData");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(shoppingNavParams, "shoppingNavParams");
        HashMap a13 = a(story, commerceAuxData);
        if (num != null) {
            a13.put("story_index", String.valueOf(num.intValue()));
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(a13);
        hashMap.remove("image_signature");
        kh khVar = story.f42858p;
        g0 d2 = (khVar == null || (c13 = khVar.c()) == null) ? null : c13.d();
        String uid = story.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        uk1.d c14 = c(presenterPinalytics, d2, hashMap, uid, pinalyticsFactory);
        g0 g0Var = d2 == null ? g0.DYNAMIC_GRID_STORY : d2;
        d0 d0Var = c14.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        int intValue = num != null ? num.intValue() : 0;
        String uid2 = story.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        return new b(a13, hashMap, shoppingNavParams, g0Var, c14, d0Var, intValue, uid2, story.u(), story.f42865w.size(), story.n(), str);
    }

    public static final uk1.d c(uk1.d presenterPinalytics, g0 g0Var, HashMap auxData, String storyId, f0 pinalyticsFactory) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Intrinsics.checkNotNullParameter(storyId, "storyId");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        e3.a aVar = new e3.a(5);
        aVar.p(presenterPinalytics.j(), presenterPinalytics.i(), g0Var, auxData);
        return new uk1.d(storyId, aVar, pinalyticsFactory);
    }

    public static final void d(b loggingData, LinkedHashMap actionRenderedMap) {
        Intrinsics.checkNotNullParameter(loggingData, "loggingData");
        Intrinsics.checkNotNullParameter(actionRenderedMap, "actionRenderedMap");
        String str = loggingData.f94261h;
        if (actionRenderedMap.containsKey(str)) {
            return;
        }
        loggingData.f94259f.h0((r18 & 1) != 0 ? f1.TAP : f1.RENDER, (r18 & 2) != 0 ? null : u0.SEE_MORE_BUTTON, (r18 & 4) != 0 ? null : loggingData.f94267n, (r18 & 8) != 0 ? null : str, (r18 & 32) != 0 ? null : loggingData.f94255b, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        actionRenderedMap.put(str, Boolean.TRUE);
    }
}
