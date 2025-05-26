package is0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c SEARCH_PIN = new c("SEARCH_PIN", 0);
    public static final c RELATED_PIN = new c("RELATED_PIN", 1);
    public static final c UNFOLLOW_INTEREST = new c("UNFOLLOW_INTEREST", 2);
    public static final c UNFOLLOW_BOARD = new c("UNFOLLOW_BOARD", 3);
    public static final c UNFOLLOW_USER = new c("UNFOLLOW_USER", 4);
    public static final c PFY = new c("PFY", 5);
    public static final c FILTER_PIN = new c("FILTER_PIN", 6);
    public static final c FILTER_BOARD_PINS = new c("FILTER_BOARD_PINS", 7);

    private static final /* synthetic */ c[] $values() {
        return new c[]{SEARCH_PIN, RELATED_PIN, UNFOLLOW_INTEREST, UNFOLLOW_BOARD, UNFOLLOW_USER, PFY, FILTER_PIN, FILTER_BOARD_PINS};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
