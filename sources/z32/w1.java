package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class w1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ w1[] $VALUES;

    @NotNull
    public static final u1 Companion;
    public static final w1 LIST_ITEM_CARDS = new w1("LIST_ITEM_CARDS", 0);
    public static final w1 LIST_ITEM = new w1("LIST_ITEM", 1);
    public static final w1 LIST_ITEM_CARDS_SQUARE = new w1("LIST_ITEM_CARDS_SQUARE", 2);
    public static final w1 LIST_ITEM_CARDS_FEED = new w1("LIST_ITEM_CARDS_FEED", 3);

    private static final /* synthetic */ w1[] $values() {
        return new w1[]{LIST_ITEM_CARDS, LIST_ITEM, LIST_ITEM_CARDS_SQUARE, LIST_ITEM_CARDS_FEED};
    }

    static {
        w1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new u1();
    }

    private w1(String str, int i13) {
    }

    public static final w1 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 1) {
            return LIST_ITEM_CARDS;
        }
        if (i13 == 2) {
            return LIST_ITEM;
        }
        if (i13 == 3) {
            return LIST_ITEM_CARDS_SQUARE;
        }
        if (i13 != 4) {
            return null;
        }
        return LIST_ITEM_CARDS_FEED;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static w1 valueOf(String str) {
        return (w1) Enum.valueOf(w1.class, str);
    }

    public static w1[] values() {
        return (w1[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = v1.f140836a[ordinal()];
        int i14 = 1;
        if (i13 != 1) {
            i14 = 2;
            if (i13 != 2) {
                i14 = 3;
                if (i13 != 3) {
                    i14 = 4;
                    if (i13 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return i14;
    }
}
