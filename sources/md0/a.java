package md0;

import h32.a4;
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
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ANALYTICS_TOOL_TAPPED;
    public static final a BRANDED_CONTENT_ENROLLMENT_TAPPED;
    public static final a BRANDED_CONTENT_UNENROLLMENT_TAPPED;
    public static final a CREATOR_BRANDED_CONTENT_TAPPED;
    public static final a CREATOR_HUB_TAB_TAPPED;
    public static final a CREATOR_NEWS_ITEM_VIEWED;
    public static final a CREATOR_NEWS_MODULE_VIEWED;
    public static final a CREATOR_RECENT_PINS_EMPTY_STATE_VIEWED;
    public static final a CREATOR_RECENT_PINS_MODULE_VIEWED;
    public static final a CREATOR_RECENT_PINS_ROW_VIEWED;
    public static final a CREATOR_STATS_MODULE_VIEWED;
    public static final a CREATOR_TOOLS_MODULE_VIEWED;
    public static final a DRAFT_TOOL_TAPPED;
    public static final a ENGAGEMENT_TOOL_TAPPED;
    public static final a NEWS_ITEM_COMPLETED_TAPPED;
    public static final a NEWS_ITEM_DISMISSED_TAPPED;
    public static final a RECENT_PINS_EMPTY_STATE_TAPPED;
    public static final a RECENT_PINS_IDEA_STREAM_TAPPED;
    public static final a RECENT_PIN_STATS_TAPPED;
    public static final a STATS_SEE_MORE_TAPPED;
    private HashMap<String, String> auxData;
    private final g0 componentType;
    private final u0 elementType;

    @NotNull
    private final f1 eventType;
    private final a4 viewParameterType;

    private static final /* synthetic */ a[] $values() {
        return new a[]{CREATOR_HUB_TAB_TAPPED, ENGAGEMENT_TOOL_TAPPED, DRAFT_TOOL_TAPPED, ANALYTICS_TOOL_TAPPED, CREATOR_BRANDED_CONTENT_TAPPED, BRANDED_CONTENT_ENROLLMENT_TAPPED, BRANDED_CONTENT_UNENROLLMENT_TAPPED, STATS_SEE_MORE_TAPPED, NEWS_ITEM_DISMISSED_TAPPED, NEWS_ITEM_COMPLETED_TAPPED, RECENT_PIN_STATS_TAPPED, RECENT_PINS_IDEA_STREAM_TAPPED, RECENT_PINS_EMPTY_STATE_TAPPED, CREATOR_TOOLS_MODULE_VIEWED, CREATOR_STATS_MODULE_VIEWED, CREATOR_NEWS_MODULE_VIEWED, CREATOR_NEWS_ITEM_VIEWED, CREATOR_RECENT_PINS_MODULE_VIEWED, CREATOR_RECENT_PINS_ROW_VIEWED, CREATOR_RECENT_PINS_EMPTY_STATE_VIEWED};
    }

    static {
        f1 f1Var = f1.TAP;
        HashMap hashMap = null;
        g0 g0Var = null;
        DefaultConstructorMarker defaultConstructorMarker = null;
        CREATOR_HUB_TAB_TAPPED = new a("CREATOR_HUB_TAB_TAPPED", 0, f1Var, g0Var, u0.CREATOR_HUB_TAB_DEFAULT, null, hashMap, 26, defaultConstructorMarker);
        u0 u0Var = u0.CREATOR_TOOL_ENGAGEMENT;
        a4 a4Var = a4.CREATOR_HUB_TOOLS;
        int i13 = 18;
        ENGAGEMENT_TOOL_TAPPED = new a("ENGAGEMENT_TOOL_TAPPED", 1, f1Var, g0Var, u0Var, a4Var, hashMap, i13, defaultConstructorMarker);
        DRAFT_TOOL_TAPPED = new a("DRAFT_TOOL_TAPPED", 2, f1Var, g0Var, u0.CREATOR_TOOL_DRAFTS, a4Var, hashMap, i13, defaultConstructorMarker);
        ANALYTICS_TOOL_TAPPED = new a("ANALYTICS_TOOL_TAPPED", 3, f1Var, g0Var, u0.CREATOR_TOOL_ANALYTICS, a4Var, hashMap, i13, defaultConstructorMarker);
        CREATOR_BRANDED_CONTENT_TAPPED = new a("CREATOR_BRANDED_CONTENT_TAPPED", 4, f1Var, g0Var, u0.CREATOR_TOOL_BRANDED_CONTENT, a4Var, hashMap, i13, defaultConstructorMarker);
        BRANDED_CONTENT_ENROLLMENT_TAPPED = new a("BRANDED_CONTENT_ENROLLMENT_TAPPED", 5, f1Var, g0Var, u0.BRANDED_CONTENT_ENROLLMENT, a4Var, hashMap, i13, defaultConstructorMarker);
        BRANDED_CONTENT_UNENROLLMENT_TAPPED = new a("BRANDED_CONTENT_UNENROLLMENT_TAPPED", 6, f1Var, g0Var, u0.BRANDED_CONTENT_UNENROLLMENT, a4Var, hashMap, i13, defaultConstructorMarker);
        u0 u0Var2 = u0.SEE_MORE_BUTTON;
        a4 a4Var2 = a4.CREATOR_HUB_PERFORMANCE;
        STATS_SEE_MORE_TAPPED = new a("STATS_SEE_MORE_TAPPED", 7, f1Var, g0Var, u0Var2, a4Var2, hashMap, i13, defaultConstructorMarker);
        g0 g0Var2 = g0.CREATOR_HUB_NEWS_ITEM;
        u0 u0Var3 = u0.DISMISS_BUTTON;
        a4 a4Var3 = a4.CREATOR_HUB_NEWS;
        int i14 = 16;
        NEWS_ITEM_DISMISSED_TAPPED = new a("NEWS_ITEM_DISMISSED_TAPPED", 8, f1Var, g0Var2, u0Var3, a4Var3, hashMap, i14, defaultConstructorMarker);
        String str = "NEWS_ITEM_COMPLETED_TAPPED";
        NEWS_ITEM_COMPLETED_TAPPED = new a(str, 9, f1Var, g0Var2, u0.COMPLETE_BUTTON, a4Var3, hashMap, i14, defaultConstructorMarker);
        g0 g0Var3 = g0.CREATOR_HUB_PIN;
        String str2 = "RECENT_PIN_STATS_TAPPED";
        RECENT_PIN_STATS_TAPPED = new a(str2, 10, f1Var, g0Var3, u0.SEE_PIN_STATS_BUTTON, a4Var3, hashMap, i14, defaultConstructorMarker);
        u0 u0Var4 = u0.PIN_STORY_PIN_IMAGE;
        a4 a4Var4 = a4.CREATOR_HUB_PINS;
        RECENT_PINS_IDEA_STREAM_TAPPED = new a("RECENT_PINS_IDEA_STREAM_TAPPED", 11, f1Var, g0Var3, u0Var4, a4Var4, hashMap, i14, defaultConstructorMarker);
        g0 g0Var4 = g0.CREATOR_HUB_RECENT_PINS_EMPTY_STATE;
        String str3 = "RECENT_PINS_EMPTY_STATE_TAPPED";
        RECENT_PINS_EMPTY_STATE_TAPPED = new a(str3, 12, f1Var, g0Var4, u0.CREATOR_HUB_RECENT_PINS_EMPTY_STATE_BUTTON, a4Var4, hashMap, i14, defaultConstructorMarker);
        f1 f1Var2 = f1.VIEW;
        CREATOR_TOOLS_MODULE_VIEWED = new a("CREATOR_TOOLS_MODULE_VIEWED", 13, f1Var2, null, null, a4Var, null, 22, null);
        CREATOR_STATS_MODULE_VIEWED = new a("CREATOR_STATS_MODULE_VIEWED", 14, f1Var2, null, null, a4Var2, null, 22, null);
        u0 u0Var5 = null;
        HashMap hashMap2 = null;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        CREATOR_NEWS_MODULE_VIEWED = new a("CREATOR_NEWS_MODULE_VIEWED", 15, f1Var2, null, u0Var5, a4Var3, hashMap2, 22, defaultConstructorMarker2);
        u0 u0Var6 = null;
        int i15 = 20;
        CREATOR_NEWS_ITEM_VIEWED = new a("CREATOR_NEWS_ITEM_VIEWED", 16, f1Var2, g0Var2, u0Var6, a4Var3, hashMap, i15, defaultConstructorMarker);
        CREATOR_RECENT_PINS_MODULE_VIEWED = new a("CREATOR_RECENT_PINS_MODULE_VIEWED", 17, f1Var2, g0Var3, u0Var6, a4Var4, hashMap, i15, defaultConstructorMarker);
        CREATOR_RECENT_PINS_ROW_VIEWED = new a("CREATOR_RECENT_PINS_ROW_VIEWED", 18, f1Var2, g0Var3, u0Var6, a4Var4, hashMap, i15, defaultConstructorMarker);
        CREATOR_RECENT_PINS_EMPTY_STATE_VIEWED = new a("CREATOR_RECENT_PINS_EMPTY_STATE_VIEWED", 19, f1Var2, g0Var4, u0Var5, a4Var4, hashMap2, 20, defaultConstructorMarker2);
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ a(String str, int i13, f1 f1Var, g0 g0Var, u0 u0Var, a4 a4Var, HashMap hashMap, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, f1Var, (i14 & 2) != 0 ? null : g0Var, (i14 & 4) != 0 ? null : u0Var, (i14 & 8) != 0 ? null : a4Var, (i14 & 16) != 0 ? null : hashMap);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
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

    public final void setAuxData(HashMap<String, String> hashMap) {
        this.auxData = hashMap;
    }

    private a(String str, int i13, f1 f1Var, g0 g0Var, u0 u0Var, a4 a4Var, HashMap hashMap) {
        this.eventType = f1Var;
        this.componentType = g0Var;
        this.elementType = u0Var;
        this.viewParameterType = a4Var;
        this.auxData = hashMap;
    }
}
