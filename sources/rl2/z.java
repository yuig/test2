package rl2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class z {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z INVARIANT = new z("INVARIANT", 0);
    public static final z IN = new z("IN", 1);
    public static final z OUT = new z("OUT", 2);

    private static final /* synthetic */ z[] $values() {
        return new z[]{INVARIANT, IN, OUT};
    }

    static {
        z[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private z(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
