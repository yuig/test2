package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class z1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ z1[] $VALUES;

    @NotNull
    public static final x1 Companion;
    public static final z1 NONE = new z1("NONE", 0);
    public static final z1 SMALL = new z1("SMALL", 1);

    private static final /* synthetic */ z1[] $values() {
        return new z1[]{NONE, SMALL};
    }

    static {
        z1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new x1();
    }

    private z1(String str, int i13) {
    }

    public static final z1 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return NONE;
        }
        if (i13 != 1) {
            return null;
        }
        return SMALL;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static z1 valueOf(String str) {
        return (z1) Enum.valueOf(z1.class, str);
    }

    public static z1[] values() {
        return (z1[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = y1.f140840a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
