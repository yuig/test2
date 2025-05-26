package de1;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class a extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a APPLY = new a("APPLY", 0);
    public static final a CLEAR = new a("CLEAR", 1);

    private static final /* synthetic */ a[] $values() {
        return new a[]{APPLY, CLEAR};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private a(String str, int i13) {
        super(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
