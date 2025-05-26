package nm1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b TITLE_AND_ACTIONS = new b("TITLE_AND_ACTIONS", 0);
    public static final b USER_AND_ACTIONS = new b("USER_AND_ACTIONS", 1);
    public static final b SEARCH = new b("SEARCH", 2);
    public static final b SCROLLING_TABS = new b("SCROLLING_TABS", 3);
    public static final b STATIC_TABS = new b("STATIC_TABS", 4);

    private static final /* synthetic */ b[] $values() {
        return new b[]{TITLE_AND_ACTIONS, USER_AND_ACTIONS, SEARCH, SCROLLING_TABS, STATIC_TABS};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
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
