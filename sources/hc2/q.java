package hc2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class q {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;

    @NotNull
    private final String stringValue;
    public static final q CLOSEUP_ADJACENT_UI_PAGE_PREFETCH = new q("CLOSEUP_ADJACENT_UI_PAGE_PREFETCH", 0, "closeup_adjacent_ui_page_prefetch");
    public static final q PLAYER_AHEAD_OF_UI_CREATION_PREFETCH = new q("PLAYER_AHEAD_OF_UI_CREATION_PREFETCH", 1, "player_ahead_of_ui_creation_prefetch");
    public static final q GRID_PREFETCH = new q("GRID_PREFETCH", 2, "grid_prefetch");
    public static final q GRID_TO_CLOSEUP_PLAYER_REUSE = new q("GRID_TO_CLOSEUP_PLAYER_REUSE", 3, "grid_to_closeup_player_reuse");

    private static final /* synthetic */ q[] $values() {
        return new q[]{CLOSEUP_ADJACENT_UI_PAGE_PREFETCH, PLAYER_AHEAD_OF_UI_CREATION_PREFETCH, GRID_PREFETCH, GRID_TO_CLOSEUP_PLAYER_REUSE};
    }

    static {
        q[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private q(String str, int i13, String str2) {
        this.stringValue = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    @NotNull
    public final String getStringValue() {
        return this.stringValue;
    }
}
