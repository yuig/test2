package dn1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e DEFAULT = new e("DEFAULT", 0);
    public static final e LEADING_ICON_BUTTON = new e("LEADING_ICON_BUTTON", 1);
    public static final e TRAILING_BUTTON = new e("TRAILING_BUTTON", 2);
    public static final e END_ACTION_BUTTONS_DEFAULT = new e("END_ACTION_BUTTONS_DEFAULT", 3);
    public static final e END_ACTION_BUTTONS_CUSTOM = new e("END_ACTION_BUTTONS_CUSTOM", 4);

    private static final /* synthetic */ e[] $values() {
        return new e[]{DEFAULT, LEADING_ICON_BUTTON, TRAILING_BUTTON, END_ACTION_BUTTONS_DEFAULT, END_ACTION_BUTTONS_CUSTOM};
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
