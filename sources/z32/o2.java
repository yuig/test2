package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o2[] $VALUES;

    @NotNull
    public static final m2 Companion;
    public static final o2 NONE = new o2("NONE", 0);
    public static final o2 SMALL = new o2("SMALL", 1);
    public static final o2 MEDIUM = new o2("MEDIUM", 2);

    private static final /* synthetic */ o2[] $values() {
        return new o2[]{NONE, SMALL, MEDIUM};
    }

    static {
        o2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new m2();
    }

    private o2(String str, int i13) {
    }

    public static final o2 findByValue(int i13) {
        Companion.getClass();
        return m2.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static o2 valueOf(String str) {
        return (o2) Enum.valueOf(o2.class, str);
    }

    public static o2[] values() {
        return (o2[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = n2.f140826a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        if (i13 == 3) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
