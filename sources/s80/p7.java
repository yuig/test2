package s80;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p7 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p7[] $VALUES;
    public static final p7 DefaultActionBar = new p7("DefaultActionBar", 0);
    public static final p7 ColorPickerActionBar = new p7("ColorPickerActionBar", 1);
    public static final p7 DrawingToolActionBar = new p7("DrawingToolActionBar", 2);
    public static final p7 Empty = new p7("Empty", 3);

    private static final /* synthetic */ p7[] $values() {
        return new p7[]{DefaultActionBar, ColorPickerActionBar, DrawingToolActionBar, Empty};
    }

    static {
        p7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private p7(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static p7 valueOf(String str) {
        return (p7) Enum.valueOf(p7.class, str);
    }

    public static p7[] values() {
        return (p7[]) $VALUES.clone();
    }
}
