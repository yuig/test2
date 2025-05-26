package bc2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    private final boolean isCloseup;
    public static final m GRID = new m("GRID", 0, false);
    public static final m PIN_CLOSEUP = new m("PIN_CLOSEUP", 1, true);
    public static final m PIN_FULL_SCREEN = new m("PIN_FULL_SCREEN", 2, true);
    public static final m OTHER = new m("OTHER", 3, false);

    private static final /* synthetic */ m[] $values() {
        return new m[]{GRID, PIN_CLOSEUP, PIN_FULL_SCREEN, OTHER};
    }

    static {
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private m(String str, int i13, boolean z13) {
        this.isCloseup = z13;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final boolean isCloseup() {
        return this.isCloseup;
    }
}
