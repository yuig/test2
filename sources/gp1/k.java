package gp1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k UNKNOWN = new k("UNKNOWN", 0);
    public static final k CLOSEUP = new k("CLOSEUP", 1);
    public static final k HOME_FEED = new k("HOME_FEED", 2);
    public static final k BOARD_FEED = new k("BOARD_FEED", 3);
    public static final k SEARCH_RESULTS = new k("SEARCH_RESULTS", 4);
    public static final k RELATED_PINS = new k("RELATED_PINS", 5);
    public static final k NEWS_HUB_DETAIL = new k("NEWS_HUB_DETAIL", 6);

    private static final /* synthetic */ k[] $values() {
        return new k[]{UNKNOWN, CLOSEUP, HOME_FEED, BOARD_FEED, SEARCH_RESULTS, RELATED_PINS, NEWS_HUB_DETAIL};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private k(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
