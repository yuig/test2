package d71;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b SEARCH = new b("SEARCH", 0);
    public static final b VIRTUAL_TRY_ON = new b("VIRTUAL_TRY_ON", 1);
    public static final b SEARCH_TYPEAHEAD = new b("SEARCH_TYPEAHEAD", 2);
    public static final b PIN_CLOSEUP_SEARCH_FILTER_QUERIES_MODULE = new b("PIN_CLOSEUP_SEARCH_FILTER_QUERIES_MODULE", 3);

    private static final /* synthetic */ b[] $values() {
        return new b[]{SEARCH, VIRTUAL_TRY_ON, SEARCH_TYPEAHEAD, PIN_CLOSEUP_SEARCH_FILTER_QUERIES_MODULE};
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
