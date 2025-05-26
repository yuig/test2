package j22;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ALL = new a("ALL", 0);
    public static final a TYPEAHEAD = new a("TYPEAHEAD", 1);
    public static final a TYPEAHEAD_MY_BOARD = new a("TYPEAHEAD_MY_BOARD", 2);
    public static final a RECENT_QUERIES = new a("RECENT_QUERIES", 3);
    public static final a RECENT_MY_QUERIES = new a("RECENT_MY_QUERIES", 4);
    public static final a PEOPLE_PICKER = new a("PEOPLE_PICKER", 5);
    public static final a INVITE_FRIENDS = new a("INVITE_FRIENDS", 6);
    public static final a BOARD_COLLABORATORS = new a("BOARD_COLLABORATORS", 7);
    public static final a TYPEAHEAD_COMMERCE = new a("TYPEAHEAD_COMMERCE", 8);
    public static final a TYPEAHEAD_MENTIONS = new a("TYPEAHEAD_MENTIONS", 9);
    public static final a TYPEAHEAD_HASHTAGS = new a("TYPEAHEAD_HASHTAGS", 10);

    private static final /* synthetic */ a[] $values() {
        return new a[]{ALL, TYPEAHEAD, TYPEAHEAD_MY_BOARD, RECENT_QUERIES, RECENT_MY_QUERIES, PEOPLE_PICKER, INVITE_FRIENDS, BOARD_COLLABORATORS, TYPEAHEAD_COMMERCE, TYPEAHEAD_MENTIONS, TYPEAHEAD_HASHTAGS};
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
