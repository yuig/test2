package ua2;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b1[] $VALUES;
    public static final b1 VERTICAL = new b1("VERTICAL", 0);
    public static final b1 FIXED = new b1("FIXED", 1);

    private static final /* synthetic */ b1[] $values() {
        return new b1[]{VERTICAL, FIXED};
    }

    static {
        b1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private b1(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) $VALUES.clone();
    }
}
