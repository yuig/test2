package rt0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    private final String displayString;
    public static final e TEN_SECOND = new e("TEN_SECOND", 0, "10s");
    public static final e THREE_SECOND = new e("THREE_SECOND", 1, "3s");
    public static final e OFF = new e("OFF", 2, "Off");

    private static final /* synthetic */ e[] $values() {
        return new e[]{TEN_SECOND, THREE_SECOND, OFF};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e(String str, int i13, String str2) {
        this.displayString = str2;
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

    @NotNull
    public final String getDisplayString() {
        return this.displayString;
    }
}
