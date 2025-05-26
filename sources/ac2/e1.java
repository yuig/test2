package ac2;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e1[] $VALUES;
    public static final e1 FLOOR = new e1("FLOOR", 0);
    public static final e1 ROUND = new e1("ROUND", 1);

    private static final /* synthetic */ e1[] $values() {
        return new e1[]{FLOOR, ROUND};
    }

    static {
        e1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private e1(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) $VALUES.clone();
    }
}
