package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ u2[] $VALUES;

    @NotNull
    public static final s2 Companion;
    public static final u2 ONE_LINE = new u2("ONE_LINE", 0);
    public static final u2 TWO_LINES = new u2("TWO_LINES", 1);

    private static final /* synthetic */ u2[] $values() {
        return new u2[]{ONE_LINE, TWO_LINES};
    }

    static {
        u2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new s2();
    }

    private u2(String str, int i13) {
    }

    public static final u2 findByValue(int i13) {
        Companion.getClass();
        return s2.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static u2 valueOf(String str) {
        return (u2) Enum.valueOf(u2.class, str);
    }

    public static u2[] values() {
        return (u2[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = t2.f140834a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
