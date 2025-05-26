package an2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 PRETTY = new k0("PRETTY", 0);
    public static final k0 DEBUG = new k0("DEBUG", 1);
    public static final k0 NONE = new k0("NONE", 2);

    private static final /* synthetic */ k0[] $values() {
        return new k0[]{PRETTY, DEBUG, NONE};
    }

    static {
        k0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private k0(String str, int i13) {
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}
