package nx;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i CENTER = new i("CENTER", 0);
    public static final i CENTER_RIGHT = new i("CENTER_RIGHT", 1);
    public static final i CENTER_LEFT = new i("CENTER_LEFT", 2);
    public static final i TOP = new i("TOP", 3);
    public static final i TOP_RIGHT = new i("TOP_RIGHT", 4);
    public static final i TOP_LEFT = new i("TOP_LEFT", 5);
    public static final i BOTTOM = new i("BOTTOM", 6);
    public static final i BOTTOM_RIGHT = new i("BOTTOM_RIGHT", 7);
    public static final i BOTTOM_LEFT = new i("BOTTOM_LEFT", 8);
    public static final i UNKNOWN = new i("UNKNOWN", 9);

    private static final /* synthetic */ i[] $values() {
        return new i[]{CENTER, CENTER_RIGHT, CENTER_LEFT, TOP, TOP_RIGHT, TOP_LEFT, BOTTOM, BOTTOM_RIGHT, BOTTOM_LEFT, UNKNOWN};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
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
