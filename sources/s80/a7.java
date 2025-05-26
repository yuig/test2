package s80;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a7 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a7[] $VALUES;
    public static final a7 Top = new a7("Top", 0);
    public static final a7 CanvasBottom = new a7("CanvasBottom", 1);
    public static final a7 Bottom = new a7("Bottom", 2);

    private static final /* synthetic */ a7[] $values() {
        return new a7[]{Top, CanvasBottom, Bottom};
    }

    static {
        a7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private a7(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a7 valueOf(String str) {
        return (a7) Enum.valueOf(a7.class, str);
    }

    public static a7[] values() {
        return (a7[]) $VALUES.clone();
    }
}
