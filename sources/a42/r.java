package a42;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class r {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;

    @NotNull
    public static final p Companion;
    public static final r UNSATISFIED = new r("UNSATISFIED", 0);
    public static final r NEUTRAL = new r("NEUTRAL", 1);
    public static final r SATISFIED = new r("SATISFIED", 2);

    private static final /* synthetic */ r[] $values() {
        return new r[]{UNSATISFIED, NEUTRAL, SATISFIED};
    }

    static {
        r[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new p();
    }

    private r(String str, int i13) {
    }

    public static final r findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return UNSATISFIED;
        }
        if (i13 == 1) {
            return NEUTRAL;
        }
        if (i13 != 2) {
            return null;
        }
        return SATISFIED;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = q.f706a[ordinal()];
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
