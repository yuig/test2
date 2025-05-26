package qa2;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a UNDEFINED = new a("UNDEFINED", 0);
    public static final a PINNED_BY = new a("PINNED_BY", 1);
    public static final a INTEREST_PIN = new a("INTEREST_PIN", 2);
    public static final a PICK_FOR_YOU = new a("PICK_FOR_YOU", 3);
    public static final a PROMOTED = new a("PROMOTED", 4);
    public static final a ONTO_BOARD = new a("ONTO_BOARD", 5);
    public static final a CREATED_BY = new a("CREATED_BY", 6);
    public static final a CLAIMED_CONTENT = new a("CLAIMED_CONTENT", 7);

    private static final /* synthetic */ a[] $values() {
        return new a[]{UNDEFINED, PINNED_BY, INTEREST_PIN, PICK_FOR_YOU, PROMOTED, ONTO_BOARD, CREATED_BY, CLAIMED_CONTENT};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
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
