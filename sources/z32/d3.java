package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d3 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d3[] $VALUES;

    @NotNull
    public static final b3 Companion;
    public static final d3 DEFAULT = new d3("DEFAULT", 0);
    public static final d3 SEQUENTIAL = new d3("SEQUENTIAL", 1);
    public static final d3 FIRST_VISIBLE = new d3("FIRST_VISIBLE", 2);
    public static final d3 ALL_VISIBLE = new d3("ALL_VISIBLE", 3);

    private static final /* synthetic */ d3[] $values() {
        return new d3[]{DEFAULT, SEQUENTIAL, FIRST_VISIBLE, ALL_VISIBLE};
    }

    static {
        d3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new b3();
    }

    private d3(String str, int i13) {
    }

    public static final d3 findByValue(int i13) {
        Companion.getClass();
        return b3.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d3 valueOf(String str) {
        return (d3) Enum.valueOf(d3.class, str);
    }

    public static d3[] values() {
        return (d3[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = c3.f140811a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        if (i13 == 3) {
            return 2;
        }
        if (i13 == 4) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }
}
