package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;

    @NotNull
    public static final e0 Companion;
    public static final g0 DEFAULT = new g0("DEFAULT", 0);
    public static final g0 SNAPPING = new g0("SNAPPING", 1);
    public static final g0 PAGING = new g0("PAGING", 2);

    private static final /* synthetic */ g0[] $values() {
        return new g0[]{DEFAULT, SNAPPING, PAGING};
    }

    static {
        g0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new e0();
    }

    private g0(String str, int i13) {
    }

    public static final g0 findByValue(int i13) {
        Companion.getClass();
        return e0.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = f0.f140815a[ordinal()];
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
