package ud1;

import h32.f1;
import h32.g0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b SHOPPING_UNIT_TAP;
    public static final b SHOPPING_UNIT_VIEW;
    private final g0 componentType;

    @NotNull
    private final f1 eventType;

    private static final /* synthetic */ b[] $values() {
        return new b[]{SHOPPING_UNIT_TAP, SHOPPING_UNIT_VIEW};
    }

    static {
        String str = "SHOPPING_UNIT_TAP";
        SHOPPING_UNIT_TAP = new b(str, 0, f1.TAP, null, 2, null);
        String str2 = "SHOPPING_UNIT_VIEW";
        SHOPPING_UNIT_VIEW = new b(str2, 1, f1.VIEW, null, 2, null);
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ b(String str, int i13, f1 f1Var, g0 g0Var, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, f1Var, (i14 & 2) != 0 ? g0.RELATED_QUERY_SHOP_UPSELL : g0Var);
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

    public final g0 getComponentType() {
        return this.componentType;
    }

    @NotNull
    public final f1 getEventType() {
        return this.eventType;
    }

    private b(String str, int i13, f1 f1Var, g0 g0Var) {
        this.eventType = f1Var;
        this.componentType = g0Var;
    }
}
