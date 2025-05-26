package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e1[] $VALUES;

    @NotNull
    public static final c1 Companion;
    public static final e1 NONE = new e1("NONE", 0);
    public static final e1 DEFAULT = new e1("DEFAULT", 1);
    public static final e1 LARGE = new e1("LARGE", 2);
    public static final e1 MEDIUM = new e1("MEDIUM", 3);
    public static final e1 SMALL = new e1("SMALL", 4);

    private static final /* synthetic */ e1[] $values() {
        return new e1[]{NONE, DEFAULT, LARGE, MEDIUM, SMALL};
    }

    static {
        e1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new c1();
    }

    private e1(String str, int i13) {
    }

    public static final e1 findByValue(int i13) {
        Companion.getClass();
        return c1.a(i13);
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

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = d1.f140812a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        int i14 = 2;
        if (i13 == 2) {
            return 1;
        }
        if (i13 != 3) {
            i14 = 4;
            if (i13 == 4) {
                return 3;
            }
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i14;
    }
}
