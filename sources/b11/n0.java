package b11;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class n0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 EMBEDDED = new n0("EMBEDDED", 0);
    public static final n0 FLOATING = new n0("FLOATING", 1);

    private static final /* synthetic */ n0[] $values() {
        return new n0[]{EMBEDDED, FLOATING};
    }

    static {
        n0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private n0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }
}
