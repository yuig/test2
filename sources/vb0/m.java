package vb0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    private final double bytes;
    public static final m KILOBYTE = new m("KILOBYTE", 0, Math.pow(10.0d, 3));
    public static final m MEGABYTE = new m("MEGABYTE", 1, Math.pow(10.0d, 6));
    public static final m GIGABYTE = new m("GIGABYTE", 2, Math.pow(10.0d, 9));

    private static final /* synthetic */ m[] $values() {
        return new m[]{KILOBYTE, MEGABYTE, GIGABYTE};
    }

    static {
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private m(String str, int i13, double d2) {
        this.bytes = d2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final double getBytes$common_release() {
        return this.bytes;
    }
}
