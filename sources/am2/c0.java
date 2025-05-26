package am2;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;

    @NotNull
    public static final b0 Companion;
    public static final c0 FINAL = new c0("FINAL", 0);
    public static final c0 SEALED = new c0("SEALED", 1);
    public static final c0 OPEN = new c0("OPEN", 2);
    public static final c0 ABSTRACT = new c0("ABSTRACT", 3);

    private static final /* synthetic */ c0[] $values() {
        return new c0[]{FINAL, SEALED, OPEN, ABSTRACT};
    }

    static {
        c0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new b0();
    }

    private c0(String str, int i13) {
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
