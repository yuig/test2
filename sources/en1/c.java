package en1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c MD = new c("MD", 0, rl1.r.MD);
    public static final c SM = new c("SM", 1, rl1.r.SM);

    @NotNull
    private final rl1.r value;

    private static final /* synthetic */ c[] $values() {
        return new c[]{MD, SM};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private c(String str, int i13, rl1.r rVar) {
        this.value = rVar;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @NotNull
    public final rl1.r getValue() {
        return this.value;
    }
}
