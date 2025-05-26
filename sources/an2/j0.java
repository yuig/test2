package an2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 ALL = new j0("ALL", 0);
    public static final j0 ONLY_NON_SYNTHESIZED = new j0("ONLY_NON_SYNTHESIZED", 1);
    public static final j0 NONE = new j0("NONE", 2);

    private static final /* synthetic */ j0[] $values() {
        return new j0[]{ALL, ONLY_NON_SYNTHESIZED, NONE};
    }

    static {
        j0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private j0(String str, int i13) {
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}
