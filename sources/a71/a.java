package a71;

import h32.f1;
import h32.g0;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FILTER_MODULE_NO_DATA;
    public static final a ONE_BAR_SHOP_FILTER_MODULE_NO_DATA;

    @NotNull
    private final g0 componentType;

    @NotNull
    private final f1 eventType;

    private static final /* synthetic */ a[] $values() {
        return new a[]{FILTER_MODULE_NO_DATA, ONE_BAR_SHOP_FILTER_MODULE_NO_DATA};
    }

    static {
        f1 f1Var = f1.SEARCH_ONE_BAR_FILTER_MODULE_NO_DATA;
        g0 g0Var = g0.ONEBAR_DRAWER;
        FILTER_MODULE_NO_DATA = new a("FILTER_MODULE_NO_DATA", 0, f1Var, g0Var);
        ONE_BAR_SHOP_FILTER_MODULE_NO_DATA = new a("ONE_BAR_SHOP_FILTER_MODULE_NO_DATA", 1, f1.SEARCH_ONE_BAR_FILTER_NO_DATA, g0Var);
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, f1 f1Var, g0 g0Var) {
        this.eventType = f1Var;
        this.componentType = g0Var;
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

    @NotNull
    public final g0 getComponentType() {
        return this.componentType;
    }

    @NotNull
    public final f1 getEventType() {
        return this.eventType;
    }
}
