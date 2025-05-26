package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class n1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n1[] $VALUES;

    @NotNull
    public static final l1 Companion;
    public static final n1 NONE = new n1("NONE", 0);
    public static final n1 IMAGE_SHOP_BAG = new n1("IMAGE_SHOP_BAG", 1);
    public static final n1 IMAGE_SHOP_TAG = new n1("IMAGE_SHOP_TAG", 2);
    public static final n1 PB_CATEGORY = new n1("PB_CATEGORY", 3);
    public static final n1 PB_BRAND = new n1("PB_BRAND", 4);
    public static final n1 PB_SHOPPING_LIST = new n1("PB_SHOPPING_LIST", 5);
    public static final n1 TRENDING_FLAME = new n1("TRENDING_FLAME", 6);
    public static final n1 TRENDING_METRIC = new n1("TRENDING_METRIC", 7);
    public static final n1 SEARCH = new n1("SEARCH", 8);
    public static final n1 EMPTY_STATE = new n1("EMPTY_STATE", 9);
    public static final n1 HISTORY = new n1("HISTORY", 10);

    private static final /* synthetic */ n1[] $values() {
        return new n1[]{NONE, IMAGE_SHOP_BAG, IMAGE_SHOP_TAG, PB_CATEGORY, PB_BRAND, PB_SHOPPING_LIST, TRENDING_FLAME, TRENDING_METRIC, SEARCH, EMPTY_STATE, HISTORY};
    }

    static {
        n1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new l1();
    }

    private n1(String str, int i13) {
    }

    public static final n1 findByValue(int i13) {
        Companion.getClass();
        return l1.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (m1.f140824a[ordinal()]) {
            case 1:
                return -1;
            case 2:
                return 0;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 4;
            case 7:
                return 5;
            case 8:
                return 6;
            case 9:
                return 7;
            case 10:
                return 8;
            case 11:
                return 9;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
