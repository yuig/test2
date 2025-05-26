package qm2;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p FLEXIBLE_LOWER = new p("FLEXIBLE_LOWER", 0);
    public static final p FLEXIBLE_UPPER = new p("FLEXIBLE_UPPER", 1);
    public static final p INFLEXIBLE = new p("INFLEXIBLE", 2);

    private static final /* synthetic */ p[] $values() {
        return new p[]{FLEXIBLE_LOWER, FLEXIBLE_UPPER, INFLEXIBLE};
    }

    static {
        p[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private p(String str, int i13) {
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
