package an2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 RENDER_OVERRIDE = new i0("RENDER_OVERRIDE", 0);
    public static final i0 RENDER_OPEN = new i0("RENDER_OPEN", 1);
    public static final i0 RENDER_OPEN_OVERRIDE = new i0("RENDER_OPEN_OVERRIDE", 2);

    private static final /* synthetic */ i0[] $values() {
        return new i0[]{RENDER_OVERRIDE, RENDER_OPEN, RENDER_OPEN_OVERRIDE};
    }

    static {
        i0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private i0(String str, int i13) {
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }
}
