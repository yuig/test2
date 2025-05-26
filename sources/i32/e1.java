package i32;

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
    public static final e1 WHITE = new e1("WHITE", 0);
    public static final e1 BLACK = new e1("BLACK", 1);

    private static final /* synthetic */ e1[] $values() {
        return new e1[]{WHITE, BLACK};
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
        if (i13 == 1) {
            return WHITE;
        }
        if (i13 != 2) {
            return null;
        }
        return BLACK;
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
        int i13 = d1.f71477a[ordinal()];
        int i14 = 1;
        if (i13 != 1) {
            i14 = 2;
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i14;
    }
}
