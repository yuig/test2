package cu0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f PAGE_BACKGROUND_COLOR = new f("PAGE_BACKGROUND_COLOR", 0);
    public static final f TEXT_COLOR = new f("TEXT_COLOR", 1);
    public static final f OVERLAY_TAG = new f("OVERLAY_TAG", 2);
    public static final f DRAWING_STROKE_COLOR = new f("DRAWING_STROKE_COLOR", 3);

    private static final /* synthetic */ f[] $values() {
        return new f[]{PAGE_BACKGROUND_COLOR, TEXT_COLOR, OVERLAY_TAG, DRAWING_STROKE_COLOR};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
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
