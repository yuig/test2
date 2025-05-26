package bm2;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class n {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n RUNTIME = new n("RUNTIME", 0);
    public static final n BINARY = new n("BINARY", 1);
    public static final n SOURCE = new n("SOURCE", 2);

    private static final /* synthetic */ n[] $values() {
        return new n[]{RUNTIME, BINARY, SOURCE};
    }

    static {
        n[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private n(String str, int i13) {
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
