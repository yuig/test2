package nm1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class j1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j1[] $VALUES;
    public static final j1 EMPTY = new j1("EMPTY", 0);
    public static final j1 SINGLE_ICON_BUTTON = new j1("SINGLE_ICON_BUTTON", 1);
    public static final j1 DOUBLE_ICON_BUTTON = new j1("DOUBLE_ICON_BUTTON", 2);
    public static final j1 ANIMATED = new j1("ANIMATED", 3);

    private static final /* synthetic */ j1[] $values() {
        return new j1[]{EMPTY, SINGLE_ICON_BUTTON, DOUBLE_ICON_BUTTON, ANIMATED};
    }

    static {
        j1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private j1(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) $VALUES.clone();
    }
}
