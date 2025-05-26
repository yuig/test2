package nx;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;

    @NotNull
    private final String type;
    public static final n0 TYPE_PINS = new n0("TYPE_PINS", 0, "pin");
    public static final n0 TYPE_BOARDS = new n0("TYPE_BOARDS", 1, "board");
    public static final n0 TYPE_RELATED_PINS_FILTER = new n0("TYPE_RELATED_PINS_FILTER", 2, "relatedfiltertab");
    public static final n0 TYPE_USERS = new n0("TYPE_USERS", 3, "user");

    private static final /* synthetic */ n0[] $values() {
        return new n0[]{TYPE_PINS, TYPE_BOARDS, TYPE_RELATED_PINS_FILTER, TYPE_USERS};
    }

    static {
        n0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private n0(String str, int i13, String str2) {
        this.type = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
