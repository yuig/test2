package nn2;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k STABLE = new k("STABLE", 0);
    public static final k FIR_UNSTABLE = new k("FIR_UNSTABLE", 1);
    public static final k IR_UNSTABLE = new k("IR_UNSTABLE", 2);

    private static final /* synthetic */ k[] $values() {
        return new k[]{STABLE, FIR_UNSTABLE, IR_UNSTABLE};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private k(String str, int i13) {
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
