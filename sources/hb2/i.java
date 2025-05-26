package hb2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i NONE = new i("NONE", 0);
    public static final i DRAG = new i("DRAG", 1);
    public static final i RESIZE_TOP_LEFT = new i("RESIZE_TOP_LEFT", 2);
    public static final i RESIZE_TOP_RIGHT = new i("RESIZE_TOP_RIGHT", 3);
    public static final i RESIZE_BOTTOM_LEFT = new i("RESIZE_BOTTOM_LEFT", 4);
    public static final i RESIZE_BOTTOM_RIGHT = new i("RESIZE_BOTTOM_RIGHT", 5);

    private static final /* synthetic */ i[] $values() {
        return new i[]{NONE, DRAG, RESIZE_TOP_LEFT, RESIZE_TOP_RIGHT, RESIZE_BOTTOM_LEFT, RESIZE_BOTTOM_RIGHT};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private i(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
