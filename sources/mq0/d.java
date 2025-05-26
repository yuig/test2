package mq0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d TOP = new d("TOP", 0);
    public static final d MIDDLE = new d("MIDDLE", 1);
    public static final d MIDDLE_BELOW_ANCHOR = new d("MIDDLE_BELOW_ANCHOR", 2);
    public static final d BOTTOM = new d("BOTTOM", 3);
    public static final d BOTTOM_BELOW_ANCHOR = new d("BOTTOM_BELOW_ANCHOR", 4);
    public static final d SINGLE = new d("SINGLE", 5);
    public static final d NONE = new d("NONE", 6);

    private static final /* synthetic */ d[] $values() {
        return new d[]{TOP, MIDDLE, MIDDLE_BELOW_ANCHOR, BOTTOM, BOTTOM_BELOW_ANCHOR, SINGLE, NONE};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
