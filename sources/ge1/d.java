package ge1;

import h32.a4;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    private HashMap<String, String> auxData;
    private final g0 componentType;
    private final u0 elementType;

    @NotNull
    private final f1 eventType;
    private final a4 viewParameterType;
    public static final d ON_SALE_FILTER_VIEWED = new d("ON_SALE_FILTER_VIEWED", 0, f1.VIEW, null, null, null, null, 30, null);
    public static final d ON_SALE_FILTER_TAPPED = new d("ON_SALE_FILTER_TAPPED", 1, f1.TAP, null, null, null, null, 30, null);

    private static final /* synthetic */ d[] $values() {
        return new d[]{ON_SALE_FILTER_VIEWED, ON_SALE_FILTER_TAPPED};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ d(java.lang.String r10, int r11, h32.f1 r12, h32.u0 r13, h32.g0 r14, h32.a4 r15, java.util.HashMap r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r17 & 2
            if (r0 == 0) goto L8
            h32.u0 r0 = h32.u0.SHOPPING_ON_SALE_FILTER
            r5 = r0
            goto L9
        L8:
            r5 = r13
        L9:
            r0 = r17 & 4
            if (r0 == 0) goto L11
            h32.g0 r0 = h32.g0.ONEBAR_MODULE
            r6 = r0
            goto L12
        L11:
            r6 = r14
        L12:
            r0 = r17 & 8
            if (r0 == 0) goto L1a
            h32.a4 r0 = h32.a4.ONEBAR_DRAWER
            r7 = r0
            goto L1b
        L1a:
            r7 = r15
        L1b:
            r0 = r17 & 16
            if (r0 == 0) goto L31
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            t32.f r1 = t32.f.PRODUCT_ON_SALE
            java.lang.String r1 = pp2.a.x(r1)
            java.lang.String r2 = "filter_type"
            r0.put(r2, r1)
            r8 = r0
            goto L33
        L31:
            r8 = r16
        L33:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ge1.d.<init>(java.lang.String, int, h32.f1, h32.u0, h32.g0, h32.a4, java.util.HashMap, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
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

    private d(String str, int i13, f1 f1Var, u0 u0Var, g0 g0Var, a4 a4Var, HashMap hashMap) {
        this.eventType = f1Var;
        this.elementType = u0Var;
        this.componentType = g0Var;
        this.viewParameterType = a4Var;
        this.auxData = hashMap;
    }
}
