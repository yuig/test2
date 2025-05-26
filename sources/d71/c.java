package d71;

import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BOTTOM_SHEET_RENDERED_FROM_ONE_BAR;
    public static final c CLEAR_FILTER_FROM_ONE_BAR;
    public static final c FILTER_RENDER_ON_ONE_BAR;
    public static final c FILTER_SELECTED_FROM_ONE_BAR;
    public static final c FILTER_UNSELECTED_FROM_ONE_BAR;
    public static final c TAP_FILTER_FROM_ONE_BAR;
    private HashMap<String, String> auxData;
    private g0 componentType;
    private final u0 elementType;

    @NotNull
    private final f1 eventType;
    private final a4 viewParameterType;
    private final d4 viewType;

    private static final /* synthetic */ c[] $values() {
        return new c[]{FILTER_RENDER_ON_ONE_BAR, TAP_FILTER_FROM_ONE_BAR, BOTTOM_SHEET_RENDERED_FROM_ONE_BAR, FILTER_SELECTED_FROM_ONE_BAR, FILTER_UNSELECTED_FROM_ONE_BAR, CLEAR_FILTER_FROM_ONE_BAR};
    }

    static {
        f1 f1Var = f1.ONEBAR_IMPRESSION_ONE_PIXEL;
        d4 d4Var = d4.SEARCH;
        g0 g0Var = g0.ONEBAR_MODULE;
        a4 a4Var = a4.SEARCH_PINS;
        FILTER_RENDER_ON_ONE_BAR = new c("FILTER_RENDER_ON_ONE_BAR", 0, f1Var, d4Var, g0Var, null, a4Var, null, 40, null);
        HashMap hashMap = null;
        u0 u0Var = null;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TAP_FILTER_FROM_ONE_BAR = new c("TAP_FILTER_FROM_ONE_BAR", 1, f1.TAP, d4Var, null, u0Var, null, hashMap, 60, defaultConstructorMarker);
        f1 f1Var2 = f1.RENDER;
        g0 g0Var2 = g0.ONEBAR_DRAWER;
        int i13 = 40;
        BOTTOM_SHEET_RENDERED_FROM_ONE_BAR = new c("BOTTOM_SHEET_RENDERED_FROM_ONE_BAR", 2, f1Var2, d4Var, g0Var2, u0Var, a4Var, hashMap, i13, defaultConstructorMarker);
        FILTER_SELECTED_FROM_ONE_BAR = new c("FILTER_SELECTED_FROM_ONE_BAR", 3, f1.SELECT, d4Var, g0Var2, u0Var, a4Var, hashMap, i13, defaultConstructorMarker);
        FILTER_UNSELECTED_FROM_ONE_BAR = new c("FILTER_UNSELECTED_FROM_ONE_BAR", 4, f1.UNSELECT, null, g0Var2, u0Var, a4Var, hashMap, 42, defaultConstructorMarker);
        String str = "CLEAR_FILTER_FROM_ONE_BAR";
        CLEAR_FILTER_FROM_ONE_BAR = new c(str, 5, f1.CLICK, d4Var, g0Var2, u0.CLEAR_BUTTON, a4Var, hashMap, 32, defaultConstructorMarker);
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ c(String str, int i13, f1 f1Var, d4 d4Var, g0 g0Var, u0 u0Var, a4 a4Var, HashMap hashMap, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, f1Var, (i14 & 2) != 0 ? null : d4Var, (i14 & 4) != 0 ? null : g0Var, (i14 & 8) != 0 ? null : u0Var, (i14 & 16) != 0 ? null : a4Var, (i14 & 32) != 0 ? null : hashMap);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final HashMap<String, String> getAuxData() {
        return this.auxData;
    }

    public final g0 getComponentType() {
        return this.componentType;
    }

    public final u0 getElementType() {
        return this.elementType;
    }

    @NotNull
    public final f1 getEventType() {
        return this.eventType;
    }

    public final a4 getViewParameterType() {
        return this.viewParameterType;
    }

    public final d4 getViewType() {
        return this.viewType;
    }

    public final void setAuxData(HashMap<String, String> hashMap) {
        this.auxData = hashMap;
    }

    public final void setComponentType(g0 g0Var) {
        this.componentType = g0Var;
    }

    private c(String str, int i13, f1 f1Var, d4 d4Var, g0 g0Var, u0 u0Var, a4 a4Var, HashMap hashMap) {
        this.eventType = f1Var;
        this.viewType = d4Var;
        this.componentType = g0Var;
        this.elementType = u0Var;
        this.viewParameterType = a4Var;
        this.auxData = hashMap;
    }
}
