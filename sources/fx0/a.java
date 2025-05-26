package fx0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ITEM_TYPE_SECTION_HEADER = new a("ITEM_TYPE_SECTION_HEADER", 0);
    public static final a ITEM_TYPE_SINGLE_ITEM = new a("ITEM_TYPE_SINGLE_ITEM", 1);
    public static final a ITEM_TYPE_MULTI_ITEM_GRID = new a("ITEM_TYPE_MULTI_ITEM_GRID", 2);
    public static final a ITEM_TYPE_SECTION_CONTENT = new a("ITEM_TYPE_SECTION_CONTENT", 3);

    private static final /* synthetic */ a[] $values() {
        return new a[]{ITEM_TYPE_SECTION_HEADER, ITEM_TYPE_SINGLE_ITEM, ITEM_TYPE_MULTI_ITEM_GRID, ITEM_TYPE_SECTION_CONTENT};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13) {
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
}
