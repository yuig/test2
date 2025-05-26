package cc2;

import kotlin.ranges.IntRange;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import ql2.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @NotNull
    public static final f Companion;
    private final double percentQuartile;

    @NotNull
    private final IntRange range;
    private final int traditionalQuartile;
    public static final g Q0 = new g("Q0", 0, s.q(0, 25), 0, 0.0d);
    public static final g Q1 = new g("Q1", 1, s.q(25, 50), 1, 0.25d);
    public static final g Q2 = new g("Q2", 2, s.q(50, 75), 2, 0.5d);
    public static final g Q3 = new g("Q3", 3, s.q(75, 95), 3, 0.75d);
    public static final g Q3_P95 = new g("Q3_P95", 4, s.q(95, 97), 3, 0.95d);
    public static final g Q3_P97 = new g("Q3_P97", 5, s.q(97, 100), 3, 0.97d);
    public static final g Q4 = new g("Q4", 6, new IntRange(100, 100, 1), 4, 1.0d);
    public static final g INVALID_QUARTILE = new g("INVALID_QUARTILE", 7, new IntRange(-2, -2, 1), -2, -2.0d);

    private static final /* synthetic */ g[] $values() {
        return new g[]{Q0, Q1, Q2, Q3, Q3_P95, Q3_P97, Q4, INVALID_QUARTILE};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new f();
    }

    private g(String str, int i13, IntRange intRange, int i14, double d2) {
        this.range = intRange;
        this.traditionalQuartile = i14;
        this.percentQuartile = d2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final double getPercentQuartile() {
        return this.percentQuartile;
    }

    @NotNull
    public final IntRange getRange() {
        return this.range;
    }

    public final int getTraditionalQuartile() {
        return this.traditionalQuartile;
    }
}
