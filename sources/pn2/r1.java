package pn2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class r1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ r1[] $VALUES;
    public static final r1 SUPERTYPE = new r1("SUPERTYPE", 0);
    public static final r1 COMMON = new r1("COMMON", 1);

    private static final /* synthetic */ r1[] $values() {
        return new r1[]{SUPERTYPE, COMMON};
    }

    static {
        r1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private r1(String str, int i13) {
    }

    public static r1 valueOf(String str) {
        return (r1) Enum.valueOf(r1.class, str);
    }

    public static r1[] values() {
        return (r1[]) $VALUES.clone();
    }
}
