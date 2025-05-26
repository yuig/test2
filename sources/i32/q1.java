package i32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class q1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ q1[] $VALUES;

    @NotNull
    public static final o1 Companion;
    public static final q1 LEFT = new q1("LEFT", 0);
    public static final q1 CENTER = new q1("CENTER", 1);
    public static final q1 RIGHT = new q1("RIGHT", 2);

    private static final /* synthetic */ q1[] $values() {
        return new q1[]{LEFT, CENTER, RIGHT};
    }

    static {
        q1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new o1();
    }

    private q1(String str, int i13) {
    }

    public static final q1 findByValue(int i13) {
        Companion.getClass();
        return o1.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static q1 valueOf(String str) {
        return (q1) Enum.valueOf(q1.class, str);
    }

    public static q1[] values() {
        return (q1[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = p1.f71489a[ordinal()];
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
