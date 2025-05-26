package ra0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class t0 extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ t0[] $VALUES;
    public static final t0 StartOnTop = new t0("StartOnTop", 0);
    public static final t0 EndOnTop = new t0("EndOnTop", 1);

    private static final /* synthetic */ t0[] $values() {
        return new t0[]{StartOnTop, EndOnTop};
    }

    static {
        t0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private t0(String str, int i13) {
        super(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) $VALUES.clone();
    }
}
