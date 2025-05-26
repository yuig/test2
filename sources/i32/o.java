package i32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;

    @NotNull
    public static final m Companion;
    public static final o ACTION_UPSELL_NO_IMAGE = new o("ACTION_UPSELL_NO_IMAGE", 0);
    public static final o ACTION_UPSELL_MULTI_IMAGE = new o("ACTION_UPSELL_MULTI_IMAGE", 1);
    public static final o ACTION_UPSELL_ROUND_IMAGE = new o("ACTION_UPSELL_ROUND_IMAGE", 2);
    public static final o ACTION_UPSELL_SQARE_IMAGE = new o("ACTION_UPSELL_SQARE_IMAGE", 3);
    public static final o ACTION_UPSELL_RECTANGULAR_IMAGE = new o("ACTION_UPSELL_RECTANGULAR_IMAGE", 4);

    private static final /* synthetic */ o[] $values() {
        return new o[]{ACTION_UPSELL_NO_IMAGE, ACTION_UPSELL_MULTI_IMAGE, ACTION_UPSELL_ROUND_IMAGE, ACTION_UPSELL_SQARE_IMAGE, ACTION_UPSELL_RECTANGULAR_IMAGE};
    }

    static {
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new m();
    }

    private o(String str, int i13) {
    }

    public static final o findByValue(int i13) {
        Companion.getClass();
        return m.a(i13);
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
        int i13 = n.f71487a[ordinal()];
        int i14 = 1;
        if (i13 != 1) {
            i14 = 2;
            if (i13 != 2) {
                i14 = 3;
                if (i13 != 3) {
                    i14 = 4;
                    if (i13 != 4) {
                        i14 = 5;
                        if (i13 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
        }
        return i14;
    }
}
