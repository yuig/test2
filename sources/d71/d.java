package d71;

import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.i0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class d {
    public static void a(d0 d0Var, c cVar) {
        d0Var.U(new i0(cVar.getViewType(), cVar.getViewParameterType(), null, cVar.getComponentType(), null, cVar.getElementType()), cVar.getEventType(), null, null, cVar.getAuxData(), false);
    }

    public static void b(d0 pinalytics, String filterValue, String storyType) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(filterValue, "filterValue");
        Intrinsics.checkNotNullParameter(storyType, "storyType");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("filter_value", filterValue);
        hashMap.put("story_type", storyType);
        c cVar = c.FILTER_SELECTED_FROM_ONE_BAR;
        cVar.setAuxData(hashMap);
        Unit unit = Unit.f80348a;
        a(pinalytics, cVar);
    }

    public static void c(d0 pinalytics, String filterValue, String storyType) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(filterValue, "filterValue");
        Intrinsics.checkNotNullParameter(storyType, "storyType");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("filter_value", filterValue);
        hashMap.put("story_type", storyType);
        c cVar = c.FILTER_UNSELECTED_FROM_ONE_BAR;
        cVar.setAuxData(hashMap);
        Unit unit = Unit.f80348a;
        a(pinalytics, cVar);
    }

    public static void d(a4 a4Var, g0 g0Var) {
        d4 viewType = d4.SEARCH;
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        d0 a13 = sh.f.a();
        HashMap o13 = ep.b.o("story_type", "hair_pattern_filters");
        i0 i0Var = new i0(viewType, a4Var, null, g0Var, null, null);
        f1 f1Var = f1.VIEW;
        Intrinsics.f(a13);
        a13.U(i0Var, f1Var, null, null, o13, false);
    }

    public static void e(d0 pinalytics, g0 componentType, String storyType) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(storyType, "storyType");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("story_type", storyType);
        c cVar = c.TAP_FILTER_FROM_ONE_BAR;
        cVar.setAuxData(hashMap);
        cVar.setComponentType(componentType);
        Unit unit = Unit.f80348a;
        a(pinalytics, cVar);
    }
}
