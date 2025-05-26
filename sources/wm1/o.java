package wm1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o BUTTON = new o("BUTTON", 0);
    public static final o CHECKBOX = new o("CHECKBOX", 1);
    public static final o SWITCH = new o("SWITCH", 2);
    public static final o ICON = new o("ICON", 3);
    public static final o TEXT = new o("TEXT", 4);
    public static final o TEXTICON = new o("TEXTICON", 5);
    public static final o BUTTONTOGGLE = new o("BUTTONTOGGLE", 6);
    public static final o SELECTED = new o("SELECTED", 7);
    public static final o NONE = new o("NONE", 8);

    private static final /* synthetic */ o[] $values() {
        return new o[]{BUTTON, CHECKBOX, SWITCH, ICON, TEXT, TEXTICON, BUTTONTOGGLE, SELECTED, NONE};
    }

    static {
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private o(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
