package zg1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @NotNull
    private final String ratio;
    public static final a NATURAL = new a("NATURAL", 0, "1:1");
    public static final a GRID = new a("GRID", 1, "9:16");
    public static final a TALL = new a("TALL", 2, "3:4");
    public static final a WIDE = new a("WIDE", 3, "4:3");

    private static final /* synthetic */ a[] $values() {
        return new a[]{NATURAL, GRID, TALL, WIDE};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, String str2) {
        this.ratio = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @NotNull
    public final String getRatio() {
        return this.ratio;
    }
}
