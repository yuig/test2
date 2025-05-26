package dn1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    private final yl1.c value;
    public static final b SMALL = new b("SMALL", 0, yl1.c.SMALL);
    public static final b LARGE = new b("LARGE", 1, yl1.c.LARGE);

    private static final /* synthetic */ b[] $values() {
        return new b[]{SMALL, LARGE};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, yl1.c cVar) {
        this.value = cVar;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @NotNull
    public final yl1.c getValue() {
        return this.value;
    }
}
