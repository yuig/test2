package f42;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;

    @NotNull
    public static final m Companion;
    public static final o FILTERS_UNSET = new o("FILTERS_UNSET", 0);
    public static final o FILTERS_SELECTED = new o("FILTERS_SELECTED", 1);
    public static final o CUSTOM_PRODUCT_STATE_CLEARED = new o("CUSTOM_PRODUCT_STATE_CLEARED", 2);

    private static final /* synthetic */ o[] $values() {
        return new o[]{FILTERS_UNSET, FILTERS_SELECTED, CUSTOM_PRODUCT_STATE_CLEARED};
    }

    static {
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new m();
    }

    private o(String str, int i13) {
    }

    public static final o findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return FILTERS_UNSET;
        }
        if (i13 == 1) {
            return FILTERS_SELECTED;
        }
        if (i13 != 2) {
            return null;
        }
        return CUSTOM_PRODUCT_STATE_CLEARED;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = n.f61077a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        if (i13 == 3) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
