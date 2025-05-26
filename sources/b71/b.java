package b71;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b SEARCH_MORE_IDEAS_FOR_EMPTY_SEARCH_RESULTS = new b("SEARCH_MORE_IDEAS_FOR_EMPTY_SEARCH_RESULTS", 0);
    public static final b SEARCH_MORE_IDEAS_FOR_EXISTING_SEARCH_RESULTS = new b("SEARCH_MORE_IDEAS_FOR_EXISTING_SEARCH_RESULTS", 1);
    public static final b SEARCH_YOUR_BOARDS = new b("SEARCH_YOUR_BOARDS", 2);

    private static final /* synthetic */ b[] $values() {
        return new b[]{SEARCH_MORE_IDEAS_FOR_EMPTY_SEARCH_RESULTS, SEARCH_MORE_IDEAS_FOR_EXISTING_SEARCH_RESULTS, SEARCH_YOUR_BOARDS};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
