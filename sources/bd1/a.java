package bd1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BOARDS_AUTO_SORT_ACTION = new a("BOARDS_AUTO_SORT_ACTION", 0, 0);
    public static final a BOARDS_REORDER_ACTION = new a("BOARDS_REORDER_ACTION", 1, 1);
    public static final a CLEAR_CACHE_ACTION = new a("CLEAR_CACHE_ACTION", 2, 7);
    public static final a LOG_OUT = new a("LOG_OUT", 3, 12);
    private final int value;

    private static final /* synthetic */ a[] $values() {
        return new a[]{BOARDS_AUTO_SORT_ACTION, BOARDS_REORDER_ACTION, CLEAR_CACHE_ACTION, LOG_OUT};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, int i14) {
        this.value = i14;
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

    public final int getValue() {
        return this.value;
    }
}
