package en2;

import lb.l0;

/* loaded from: classes4.dex */
public final class a extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a WARNING = new a("WARNING", 0);
    public static final a ERROR = new a("ERROR", 1);
    public static final a HIDDEN = new a("HIDDEN", 2);

    private static final /* synthetic */ a[] $values() {
        return new a[]{WARNING, ERROR, HIDDEN};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13) {
        super(str, i13);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
