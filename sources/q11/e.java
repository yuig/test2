package q11;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e DELETE_CONFIRMED = new e("DELETE_CONFIRMED", 0);
    public static final e DELETE_CANCELLED = new e("DELETE_CANCELLED", 1);
    public static final e PUBLISH_CONFIRMED = new e("PUBLISH_CONFIRMED", 2);
    public static final e PUBLISH_CANCELLED = new e("PUBLISH_CANCELLED", 3);
    public static final e SAVE_LINK_CONFIRMED = new e("SAVE_LINK_CONFIRMED", 4);
    public static final e SAVE_LINK_CANCELLED = new e("SAVE_LINK_CANCELLED", 5);
    public static final e REMOVE_PAID_PARTNERSHIP_CONFIRM = new e("REMOVE_PAID_PARTNERSHIP_CONFIRM", 6);
    public static final e REMOVE_PAID_PARTNERSHIP_CANCELLED = new e("REMOVE_PAID_PARTNERSHIP_CANCELLED", 7);

    private static final /* synthetic */ e[] $values() {
        return new e[]{DELETE_CONFIRMED, DELETE_CANCELLED, PUBLISH_CONFIRMED, PUBLISH_CANCELLED, SAVE_LINK_CONFIRMED, SAVE_LINK_CANCELLED, REMOVE_PAID_PARTNERSHIP_CONFIRM, REMOVE_PAID_PARTNERSHIP_CANCELLED};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
