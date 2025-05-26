package s80;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g DefaultActionBar = new g("DefaultActionBar", 0);
    public static final g ColorPicker = new g("ColorPicker", 1);
    public static final g DrawingTool = new g("DrawingTool", 2);
    public static final g DragBar = new g("DragBar", 3);
    public static final g Empty = new g("Empty", 4);

    private static final /* synthetic */ g[] $values() {
        return new g[]{DefaultActionBar, ColorPicker, DrawingTool, DragBar, Empty};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private g(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
