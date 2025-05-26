package oq;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c1[] $VALUES;
    public static final c1 UNKNOWN = new c1("UNKNOWN", 0);
    public static final c1 IN_STOCK = new c1("IN_STOCK", 1);
    public static final c1 OUT_OF_STOCK = new c1("OUT_OF_STOCK", 2);
    public static final c1 STALE = new c1("STALE", 3);

    private static final /* synthetic */ c1[] $values() {
        return new c1[]{UNKNOWN, IN_STOCK, OUT_OF_STOCK, STALE};
    }

    static {
        c1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private c1(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c1 valueOf(String str) {
        return (c1) Enum.valueOf(c1.class, str);
    }

    public static c1[] values() {
        return (c1[]) $VALUES.clone();
    }
}
