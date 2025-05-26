package yb0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d EXPLICIT_DIRECTIVE = new d("EXPLICIT_DIRECTIVE", 0);
    public static final d BACK_BUTTON_CLICK = new d("BACK_BUTTON_CLICK", 1);
    public static final d CANCEL_BUTTON_CLICK = new d("CANCEL_BUTTON_CLICK", 2);
    public static final d CONFIRM_BUTTON_CLICK = new d("CONFIRM_BUTTON_CLICK", 3);
    public static final d SHOWING_ANOTHER = new d("SHOWING_ANOTHER", 4);
    public static final d OUTSIDE_TOUCH = new d("OUTSIDE_TOUCH", 5);

    private static final /* synthetic */ d[] $values() {
        return new d[]{EXPLICIT_DIRECTIVE, BACK_BUTTON_CLICK, CANCEL_BUTTON_CLICK, CONFIRM_BUTTON_CLICK, SHOWING_ANOTHER, OUTSIDE_TOUCH};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
