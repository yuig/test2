package i32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class w1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ w1[] $VALUES;

    @NotNull
    public static final u1 Companion;
    public static final w1 PULSER = new w1("PULSER", 0);
    public static final w1 IMMEDIATE = new w1("IMMEDIATE", 1);
    public static final w1 PULSER_ONLY = new w1("PULSER_ONLY", 2);

    private static final /* synthetic */ w1[] $values() {
        return new w1[]{PULSER, IMMEDIATE, PULSER_ONLY};
    }

    static {
        w1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new u1();
    }

    private w1(String str, int i13) {
    }

    public static final w1 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 1) {
            return PULSER;
        }
        if (i13 == 2) {
            return IMMEDIATE;
        }
        if (i13 != 3) {
            return null;
        }
        return PULSER_ONLY;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static w1 valueOf(String str) {
        return (w1) Enum.valueOf(w1.class, str);
    }

    public static w1[] values() {
        return (w1[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = v1.f71495a[ordinal()];
        int i14 = 1;
        if (i13 != 1) {
            i14 = 2;
            if (i13 != 2) {
                i14 = 3;
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return i14;
    }
}
