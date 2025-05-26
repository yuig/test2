package dn1;

import cn1.f0;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final int idRes;
    public static final a LEADING_ICON_BUTTON = new a("LEADING_ICON_BUTTON", 0, f0.gestalt_leading_button);
    public static final a END_ACTION_BUTTONS_ONE = new a("END_ACTION_BUTTONS_ONE", 1, f0.gestalt_end_action_one);
    public static final a END_ACTION_BUTTONS_TWO = new a("END_ACTION_BUTTONS_TWO", 2, f0.gestalt_end_action_two);

    private static final /* synthetic */ a[] $values() {
        return new a[]{LEADING_ICON_BUTTON, END_ACTION_BUTTONS_ONE, END_ACTION_BUTTONS_TWO};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, int i14) {
        this.idRes = i14;
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

    public final int getIdRes() {
        return this.idRes;
    }
}
