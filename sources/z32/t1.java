package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class t1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ t1[] $VALUES;

    @NotNull
    public static final r1 Companion;
    public static final t1 NONE = new t1("NONE", 0);
    public static final t1 REASON = new t1("REASON", 1);
    public static final t1 REACTION_COUNT = new t1("REACTION_COUNT", 2);

    private static final /* synthetic */ t1[] $values() {
        return new t1[]{NONE, REASON, REACTION_COUNT};
    }

    static {
        t1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new r1();
    }

    private t1(String str, int i13) {
    }

    public static final t1 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return NONE;
        }
        if (i13 == 1) {
            return REASON;
        }
        if (i13 != 2) {
            return null;
        }
        return REACTION_COUNT;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static t1 valueOf(String str) {
        return (t1) Enum.valueOf(t1.class, str);
    }

    public static t1[] values() {
        return (t1[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = s1.f140832a[ordinal()];
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
