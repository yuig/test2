package r72;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i2 implements n72.h {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i2[] $VALUES;
    private final int value;
    public static final i2 LEFT = new i2("LEFT", 0, 0);
    public static final i2 CENTER = new i2("CENTER", 1, 1);
    public static final i2 RIGHT = new i2("RIGHT", 2, 2);
    public static final i2 JUSTIFIED = new i2("JUSTIFIED", 3, 3);
    public static final i2 NATURAL = new i2("NATURAL", 4, 4);

    private static final /* synthetic */ i2[] $values() {
        return new i2[]{LEFT, CENTER, RIGHT, JUSTIFIED, NATURAL};
    }

    static {
        i2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private i2(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i2 valueOf(String str) {
        return (i2) Enum.valueOf(i2.class, str);
    }

    public static i2[] values() {
        return (i2[]) $VALUES.clone();
    }

    @Override // n72.h
    @NotNull
    public Integer getValue() {
        return Integer.valueOf(this.value);
    }
}
