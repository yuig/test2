package pn2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class w0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ w0[] $VALUES;
    public static final w0 CHECK_ONLY_LOWER = new w0("CHECK_ONLY_LOWER", 0);
    public static final w0 CHECK_SUBTYPE_AND_LOWER = new w0("CHECK_SUBTYPE_AND_LOWER", 1);
    public static final w0 SKIP_LOWER = new w0("SKIP_LOWER", 2);

    private static final /* synthetic */ w0[] $values() {
        return new w0[]{CHECK_ONLY_LOWER, CHECK_SUBTYPE_AND_LOWER, SKIP_LOWER};
    }

    static {
        w0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private w0(String str, int i13) {
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) $VALUES.clone();
    }
}
