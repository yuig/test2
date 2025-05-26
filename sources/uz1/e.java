package uz1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e COLLAPSED_NOTIF = new e("COLLAPSED_NOTIF", 0);
    public static final e EXPANDED_NOTIF = new e("EXPANDED_NOTIF", 1);
    public static final e DEFAULT_NOTIF = new e("DEFAULT_NOTIF", 2);
    public static final e ACTION_BUTTON = new e("ACTION_BUTTON", 3);

    private static final /* synthetic */ e[] $values() {
        return new e[]{COLLAPSED_NOTIF, EXPANDED_NOTIF, DEFAULT_NOTIF, ACTION_BUTTON};
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
