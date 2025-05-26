package v90;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class n1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n1[] $VALUES;
    public static final n1 SELECT = new n1("SELECT", 0);
    public static final n1 REFINE = new n1("REFINE", 1);

    private static final /* synthetic */ n1[] $values() {
        return new n1[]{SELECT, REFINE};
    }

    static {
        n1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private n1(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) $VALUES.clone();
    }
}
