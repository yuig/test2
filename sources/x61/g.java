package x61;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g AUTOCOMPLETE_TYPEAHEAD = new g("AUTOCOMPLETE_TYPEAHEAD", 0);
    public static final g CLOSEUP_STYLE = new g("CLOSEUP_STYLE", 1);
    public static final g SEARCH_RESULTS = new g("SEARCH_RESULTS", 2);

    private static final /* synthetic */ g[] $values() {
        return new g[]{AUTOCOMPLETE_TYPEAHEAD, CLOSEUP_STYLE, SEARCH_RESULTS};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private g(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
