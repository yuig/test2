package ym1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e LEFT_TOP = new e("LEFT_TOP", 0);
    public static final e LEFT_CENTER = new e("LEFT_CENTER", 1);
    public static final e LEFT_BOTTOM = new e("LEFT_BOTTOM", 2);
    public static final e RIGHT_TOP = new e("RIGHT_TOP", 3);
    public static final e RIGHT_CENTER = new e("RIGHT_CENTER", 4);
    public static final e RIGHT_BOTTOM = new e("RIGHT_BOTTOM", 5);
    public static final e TOP_LEFT = new e("TOP_LEFT", 6);
    public static final e TOP_CENTER = new e("TOP_CENTER", 7);
    public static final e TOP_RIGHT = new e("TOP_RIGHT", 8);
    public static final e BOTTOM_LEFT = new e("BOTTOM_LEFT", 9);
    public static final e BOTTOM_CENTER = new e("BOTTOM_CENTER", 10);
    public static final e BOTTOM_RIGHT = new e("BOTTOM_RIGHT", 11);

    private static final /* synthetic */ e[] $values() {
        return new e[]{LEFT_TOP, LEFT_CENTER, LEFT_BOTTOM, RIGHT_TOP, RIGHT_CENTER, RIGHT_BOTTOM, TOP_LEFT, TOP_CENTER, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT};
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
