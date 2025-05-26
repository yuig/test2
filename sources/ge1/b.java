package ge1;

import h32.a4;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import t32.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BRAND_FILTER_APPLY_BUTTON_TAPPED;
    public static final b BRAND_FILTER_BOTTOM_SHEET_CLOSED;
    public static final b BRAND_FILTER_BOTTOM_SHEET_DISMISSED;
    public static final b BRAND_FILTER_OPTION_SELECTED;
    public static final b BRAND_FILTER_OPTION_UNSELECTED;
    public static final b BRAND_FILTER_OPTION_VIEWED;
    public static final b BRAND_FILTER_RESET_BUTTON_TAPPED;
    private HashMap<String, String> auxData;
    private final g0 componentType;
    private final u0 elementType;

    @NotNull
    private final f1 eventType;
    private final a4 viewParameterType;

    private static final /* synthetic */ b[] $values() {
        return new b[]{BRAND_FILTER_BOTTOM_SHEET_DISMISSED, BRAND_FILTER_BOTTOM_SHEET_CLOSED, BRAND_FILTER_OPTION_VIEWED, BRAND_FILTER_OPTION_SELECTED, BRAND_FILTER_OPTION_UNSELECTED, BRAND_FILTER_APPLY_BUTTON_TAPPED, BRAND_FILTER_RESET_BUTTON_TAPPED};
    }

    static {
        f1 f1Var = f1.DISMISS;
        g0 g0Var = g0.ONEBAR_DRAWER;
        u0 u0Var = u0.SHOPPING_BRAND_FILTER;
        BRAND_FILTER_BOTTOM_SHEET_DISMISSED = new b("BRAND_FILTER_BOTTOM_SHEET_DISMISSED", 0, f1Var, g0Var, null, null, u0Var, 12, null);
        f1 f1Var2 = f1.TAP;
        String str = "BRAND_FILTER_BOTTOM_SHEET_CLOSED";
        int i13 = 1;
        BRAND_FILTER_BOTTOM_SHEET_CLOSED = new b(str, i13, f1Var2, g0Var, null, null, u0.CLOSE_BUTTON, 12, null);
        HashMap hashMap = null;
        DefaultConstructorMarker defaultConstructorMarker = null;
        BRAND_FILTER_OPTION_VIEWED = new b("BRAND_FILTER_OPTION_VIEWED", 2, f1.VIEW, 0 == true ? 1 : 0, 0 == true ? 1 : 0, hashMap, null, 30, defaultConstructorMarker);
        HashMap hashMap2 = new HashMap();
        f fVar = f.PRODUCT_BRAND;
        hashMap2.put("filter_type", pp2.a.x(fVar));
        hashMap2.put("is_selecting", "true");
        a4 a4Var = null;
        int i14 = 6;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        BRAND_FILTER_OPTION_SELECTED = new b("BRAND_FILTER_OPTION_SELECTED", 3, f1Var2, 0 == true ? 1 : 0, a4Var, hashMap2, u0Var, i14, defaultConstructorMarker2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("filter_type", pp2.a.x(fVar));
        hashMap3.put("is_selecting", "false");
        BRAND_FILTER_OPTION_UNSELECTED = new b("BRAND_FILTER_OPTION_UNSELECTED", 4, f1Var2, 0 == true ? 1 : 0, a4Var, hashMap3, u0Var, i14, defaultConstructorMarker2);
        int i15 = 14;
        BRAND_FILTER_APPLY_BUTTON_TAPPED = new b("BRAND_FILTER_APPLY_BUTTON_TAPPED", 5, f1Var2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, hashMap, u0.FILTER_SUBMIT_BUTTON, i15, defaultConstructorMarker);
        BRAND_FILTER_RESET_BUTTON_TAPPED = new b("BRAND_FILTER_RESET_BUTTON_TAPPED", 6, f1Var2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, hashMap, u0.FILTER_CLEAR_BUTTON, i15, defaultConstructorMarker);
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ b(java.lang.String r10, int r11, h32.f1 r12, h32.g0 r13, h32.a4 r14, java.util.HashMap r15, h32.u0 r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r17 & 2
            if (r0 == 0) goto L8
            h32.g0 r0 = h32.g0.BRAND_MULTI_SELECT
            r5 = r0
            goto L9
        L8:
            r5 = r13
        L9:
            r0 = r17 & 4
            if (r0 == 0) goto L11
            h32.a4 r0 = h32.a4.ONEBAR_DRAWER
            r6 = r0
            goto L12
        L11:
            r6 = r14
        L12:
            r0 = r17 & 8
            if (r0 == 0) goto L28
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            t32.f r1 = t32.f.PRODUCT_BRAND
            java.lang.String r1 = pp2.a.x(r1)
            java.lang.String r2 = "filter_type"
            r0.put(r2, r1)
            r7 = r0
            goto L29
        L28:
            r7 = r15
        L29:
            r0 = r17 & 16
            if (r0 == 0) goto L30
            r0 = 0
            r8 = r0
            goto L32
        L30:
            r8 = r16
        L32:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ge1.b.<init>(java.lang.String, int, h32.f1, h32.g0, h32.a4, java.util.HashMap, h32.u0, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
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

    private b(String str, int i13, f1 f1Var, g0 g0Var, a4 a4Var, HashMap hashMap, u0 u0Var) {
        this.eventType = f1Var;
        this.componentType = g0Var;
        this.viewParameterType = a4Var;
        this.auxData = hashMap;
        this.elementType = u0Var;
    }
}
