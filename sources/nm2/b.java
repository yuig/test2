package nm2;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b INFLEXIBLE = new b("INFLEXIBLE", 0);
    public static final b FLEXIBLE_UPPER_BOUND = new b("FLEXIBLE_UPPER_BOUND", 1);
    public static final b FLEXIBLE_LOWER_BOUND = new b("FLEXIBLE_LOWER_BOUND", 2);

    private static final /* synthetic */ b[] $values() {
        return new b[]{INFLEXIBLE, FLEXIBLE_UPPER_BOUND, FLEXIBLE_LOWER_BOUND};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13) {
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
