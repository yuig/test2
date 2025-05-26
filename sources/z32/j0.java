package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class j0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;

    @NotNull
    public static final h0 Companion;
    public static final j0 NONE = new j0("NONE", 0);
    public static final j0 SINGLE_COLUMN = new j0("SINGLE_COLUMN", 1);
    public static final j0 FULL_SPAN = new j0("FULL_SPAN", 2);

    private static final /* synthetic */ j0[] $values() {
        return new j0[]{NONE, SINGLE_COLUMN, FULL_SPAN};
    }

    static {
        j0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new h0();
    }

    private j0(String str, int i13) {
    }

    public static final j0 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return NONE;
        }
        if (i13 == 1) {
            return SINGLE_COLUMN;
        }
        if (i13 != 2) {
            return null;
        }
        return FULL_SPAN;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = i0.f140819a[ordinal()];
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
