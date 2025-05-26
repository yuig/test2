package z32;

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
    public static final o BUTTON = new o("BUTTON", 0);
    public static final o AVATAR_STACK_CARD = new o("AVATAR_STACK_CARD", 1);
    public static final o TEXT_OVERLAY = new o("TEXT_OVERLAY", 2);
    public static final o ARROW_INDICATOR_ICON = new o("ARROW_INDICATOR_ICON", 3);
    public static final o BLURRED_END_ITEM = new o("BLURRED_END_ITEM", 4);
    public static final o SEARCH_ICON = new o("SEARCH_ICON", 5);

    private static final /* synthetic */ o[] $values() {
        return new o[]{BUTTON, AVATAR_STACK_CARD, TEXT_OVERLAY, ARROW_INDICATOR_ICON, BLURRED_END_ITEM, SEARCH_ICON};
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
        if (i13 == 0) {
            return BUTTON;
        }
        if (i13 == 1) {
            return AVATAR_STACK_CARD;
        }
        if (i13 == 2) {
            return TEXT_OVERLAY;
        }
        if (i13 == 3) {
            return ARROW_INDICATOR_ICON;
        }
        if (i13 == 4) {
            return BLURRED_END_ITEM;
        }
        if (i13 != 5) {
            return null;
        }
        return SEARCH_ICON;
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
        switch (n.f140825a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
