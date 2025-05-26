package z32;

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
    public static final q1 HIDDEN = new q1("HIDDEN", 0);
    public static final q1 BOTTOM_LEFT_INSIDE = new q1("BOTTOM_LEFT_INSIDE", 1);
    public static final q1 BOTTOM_LEFT_OUTSIDE = new q1("BOTTOM_LEFT_OUTSIDE", 2);
    public static final q1 BOTTOM_RIGHT_INSIDE = new q1("BOTTOM_RIGHT_INSIDE", 3);
    public static final q1 BOTTOM_RIGHT_OUTSIDE = new q1("BOTTOM_RIGHT_OUTSIDE", 4);
    public static final q1 BOTTOM_CENTER_BORDER = new q1("BOTTOM_CENTER_BORDER", 5);

    private static final /* synthetic */ q1[] $values() {
        return new q1[]{HIDDEN, BOTTOM_LEFT_INSIDE, BOTTOM_LEFT_OUTSIDE, BOTTOM_RIGHT_INSIDE, BOTTOM_RIGHT_OUTSIDE, BOTTOM_CENTER_BORDER};
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
        switch (p1.f140828a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
