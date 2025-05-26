package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b1[] $VALUES;

    @NotNull
    public static final z0 Companion;
    public static final b1 NONE = new b1("NONE", 0);
    public static final b1 MEDIUM = new b1("MEDIUM", 1);
    public static final b1 SMALL = new b1("SMALL", 2);
    public static final b1 LARGE = new b1("LARGE", 3);
    public static final b1 EXTRA_SMALL = new b1("EXTRA_SMALL", 4);

    private static final /* synthetic */ b1[] $values() {
        return new b1[]{NONE, MEDIUM, SMALL, LARGE, EXTRA_SMALL};
    }

    static {
        b1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new z0();
    }

    private b1(String str, int i13) {
    }

    public static final b1 findByValue(int i13) {
        Companion.getClass();
        return z0.a(i13);
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

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = a1.f140807a[ordinal()];
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
