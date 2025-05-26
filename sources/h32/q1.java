package h32;

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
    public static final q1 ALL = new q1("ALL", 0);
    public static final q1 COMMENTS = new q1("COMMENTS", 1);
    public static final q1 PHOTOS = new q1("PHOTOS", 2);

    private static final /* synthetic */ q1[] $values() {
        return new q1[]{ALL, COMMENTS, PHOTOS};
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
        if (i13 == 0) {
            return ALL;
        }
        if (i13 == 1) {
            return COMMENTS;
        }
        if (i13 != 2) {
            return null;
        }
        return PHOTOS;
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
        int i13 = p1.f67175a[ordinal()];
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
