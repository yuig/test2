package f11;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    private final int value;
    public static final g TYPE_BOARD = new g("TYPE_BOARD", 0, 0);
    public static final g TYPE_SUGGESTED_BOARD_NAME = new g("TYPE_SUGGESTED_BOARD_NAME", 1, 1);
    public static final g TYPE_HASHTAG_SUGGESTION = new g("TYPE_HASHTAG_SUGGESTION", 2, 2);
    public static final g TYPE_BOARDLESS_SAVE = new g("TYPE_BOARDLESS_SAVE", 3, 3);
    public static final g ADD_TO_COLLAGE = new g("ADD_TO_COLLAGE", 4, 4);

    private static final /* synthetic */ g[] $values() {
        return new g[]{TYPE_BOARD, TYPE_SUGGESTED_BOARD_NAME, TYPE_HASHTAG_SUGGESTION, TYPE_BOARDLESS_SAVE, ADD_TO_COLLAGE};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private g(String str, int i13, int i14) {
        this.value = i14;
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

    public final int getValue() {
        return this.value;
    }
}
