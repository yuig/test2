package h32;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h4 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h4[] $VALUES;

    @NotNull
    public static final f4 Companion;
    public static final h4 V_TOP = new h4("V_TOP", 0);
    public static final h4 V_BOTTOM = new h4("V_BOTTOM", 1);
    public static final h4 V_50 = new h4("V_50", 2);
    public static final h4 V_80 = new h4("V_80", 3);
    public static final h4 V_100 = new h4("V_100", 4);
    public static final h4 V_PASSTHROUGH = new h4("V_PASSTHROUGH", 5);
    public static final h4 V_APP_ACTIVE = new h4("V_APP_ACTIVE", 6);
    public static final h4 V_ONE_PIXEL = new h4("V_ONE_PIXEL", 7);

    private static final /* synthetic */ h4[] $values() {
        return new h4[]{V_TOP, V_BOTTOM, V_50, V_80, V_100, V_PASSTHROUGH, V_APP_ACTIVE, V_ONE_PIXEL};
    }

    static {
        h4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new f4();
    }

    private h4(String str, int i13) {
    }

    public static final h4 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 1) {
            return V_TOP;
        }
        if (i13 == 2) {
            return V_BOTTOM;
        }
        if (i13 == 50) {
            return V_50;
        }
        if (i13 == 80) {
            return V_80;
        }
        switch (i13) {
            case 100:
                return V_100;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                return V_PASSTHROUGH;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
                return V_APP_ACTIVE;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
                return V_ONE_PIXEL;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static h4 valueOf(String str) {
        return (h4) Enum.valueOf(h4.class, str);
    }

    public static h4[] values() {
        return (h4[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (g4.f67041a[ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 50;
            case 4:
                return 80;
            case 5:
                return 100;
            case 6:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE;
            case 7:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE;
            case 8:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
