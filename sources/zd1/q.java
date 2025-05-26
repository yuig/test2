package zd1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class q {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q FILTER_HEADER = new q("FILTER_HEADER", 0);
    public static final q PRICE_FILTER_ITEM = new q("PRICE_FILTER_ITEM", 1);
    public static final q MULTI_SELECT_FILTER_ITEM = new q("MULTI_SELECT_FILTER_ITEM", 2);
    public static final q CATEGORY_FILTER_ITEM = new q("CATEGORY_FILTER_ITEM", 3);
    public static final q COLOR_FILTER = new q("COLOR_FILTER", 4);
    public static final q COLOR_LIST_FILTER = new q("COLOR_LIST_FILTER", 5);
    public static final q SORT_FILTER = new q("SORT_FILTER", 6);
    public static final q STANDARD_LIST = new q("STANDARD_LIST", 7);
    public static final q FILTER_DIVIDER = new q("FILTER_DIVIDER", 8);

    private static final /* synthetic */ q[] $values() {
        return new q[]{FILTER_HEADER, PRICE_FILTER_ITEM, MULTI_SELECT_FILTER_ITEM, CATEGORY_FILTER_ITEM, COLOR_FILTER, COLOR_LIST_FILTER, SORT_FILTER, STANDARD_LIST, FILTER_DIVIDER};
    }

    static {
        q[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private q(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
