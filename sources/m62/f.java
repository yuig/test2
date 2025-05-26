package m62;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f OPACITY = new f("OPACITY", 0);
    public static final f FILTER = new f("FILTER", 1);
    public static final f BORDER = new f("BORDER", 2);
    public static final f MOTION = new f("MOTION", 3);
    public static final f TRANSFORM = new f("TRANSFORM", 4);
    public static final f SHAPE = new f("SHAPE", 5);
    public static final f LAYER = new f("LAYER", 6);
    public static final f ALIGN = new f("ALIGN", 7);
    public static final f COLOR = new f("COLOR", 8);
    public static final f BORDER_COLOR = new f("BORDER_COLOR", 9);
    public static final f FONT = new f("FONT", 10);

    private static final /* synthetic */ f[] $values() {
        return new f[]{OPACITY, FILTER, BORDER, MOTION, TRANSFORM, SHAPE, LAYER, ALIGN, COLOR, BORDER_COLOR, FONT};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private f(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
