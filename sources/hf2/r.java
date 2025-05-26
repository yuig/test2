package hf2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class r extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r OK = new r("OK", 0);
    public static final r ERROR = new r("ERROR", 1);

    private static final /* synthetic */ r[] $values() {
        return new r[]{OK, ERROR};
    }

    static {
        r[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private r(String str, int i13) {
        super(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
