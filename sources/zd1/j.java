package zd1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class j {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j RANGE_FILTER_HEADER = new j("RANGE_FILTER_HEADER", 0);
    public static final j MULTI_SELECT_FILTER_HEADER = new j("MULTI_SELECT_FILTER_HEADER", 1);
    public static final j CATEGORY_FILTER_HEADER = new j("CATEGORY_FILTER_HEADER", 2);
    public static final j SORT_FILTER_HEADER = new j("SORT_FILTER_HEADER", 3);

    private static final /* synthetic */ j[] $values() {
        return new j[]{RANGE_FILTER_HEADER, MULTI_SELECT_FILTER_HEADER, CATEGORY_FILTER_HEADER, SORT_FILTER_HEADER};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private j(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
