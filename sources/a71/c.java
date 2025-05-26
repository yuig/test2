package a71;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import h61.h;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f1259a;

    public c(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f1259a = pinalytics;
    }

    public static HashMap a(ud1.a aVar) {
        HashMap hashMap = new HashMap();
        if (aVar != null) {
            pp2.a.J0(hashMap, "story_type", aVar.f121924a);
            pp2.a.J0(hashMap, "content_ids", aVar.f121925b);
            pp2.a.J0(hashMap, "grid_index", aVar.f121926c);
            pp2.a.J0(hashMap, "story_id", aVar.f121927d);
            pp2.a.J0(hashMap, "story_index", aVar.f121928e);
            pp2.a.J0(hashMap, "advertiser_id", aVar.f121929f);
            pp2.a.J0(hashMap, "total_object_count", aVar.f121930g);
        }
        return hashMap;
    }

    public void b(ge1.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f1259a.h0((r18 & 1) != 0 ? f1.TAP : event.getEventType(), (r18 & 2) != 0 ? null : event.getElementType(), (r18 & 4) != 0 ? null : event.getComponentType(), (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : event.getAuxData(), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    public void c(u0 elementType) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        f1 f1Var = f1.TAP;
        this.f1259a.U(new i0(d4.STORY_PIN_CAMERA, a4.STORY_PIN_CREATE, null, null, null, elementType), f1Var, null, null, null, false);
    }

    public void d(md0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        g0 componentType = event.getComponentType();
        u0 elementType = event.getElementType();
        this.f1259a.t(new i0(d4.CREATOR_HUB, event.getViewParameterType(), null, componentType, null, elementType), null, null, event.getEventType(), null, event.getAuxData(), false);
    }

    public void e(a event, h searchType, String productFilterType, boolean z13) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
        f1 eventType = event.getEventType();
        g0 componentType = event.getComponentType();
        HashMap hashMap = new HashMap();
        hashMap.put("search_type", searchType.toString());
        int i13 = b.f1258a[event.ordinal()];
        if (i13 == 1) {
            hashMap.put("has_onebar_shopping_filters", String.valueOf(z13));
        } else if (i13 == 2) {
            hashMap.put("filter_type", productFilterType);
        }
        d0.B(this.f1259a, eventType, componentType, null, hashMap, 20);
    }

    public void f(ge1.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f1259a.h0((r18 & 1) != 0 ? f1.TAP : event.getEventType(), (r18 & 2) != 0 ? null : event.getElementType(), (r18 & 4) != 0 ? null : event.getComponentType(), (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : event.getAuxData(), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    public c(d0 pinalytics, int i13) {
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            this.f1259a = pinalytics;
        } else if (i13 == 2) {
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            this.f1259a = pinalytics;
        } else if (i13 != 3) {
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            this.f1259a = pinalytics;
        } else {
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            this.f1259a = pinalytics;
        }
    }
}
