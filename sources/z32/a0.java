package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;

    @NotNull
    public static final y Companion;
    public static final a0 NONE = new a0("NONE", 0);
    public static final a0 SMALL = new a0("SMALL", 1);
    public static final a0 MEDIUM = new a0("MEDIUM", 2);
    public static final a0 EXTRA_LARGE = new a0("EXTRA_LARGE", 3);
    public static final a0 EXTRA_SMALL = new a0("EXTRA_SMALL", 4);

    private static final /* synthetic */ a0[] $values() {
        return new a0[]{NONE, SMALL, MEDIUM, EXTRA_LARGE, EXTRA_SMALL};
    }

    static {
        a0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new y();
    }

    private a0(String str, int i13) {
    }

    public static final a0 findByValue(int i13) {
        Companion.getClass();
        return y.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = z.f140841a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        int i14 = 2;
        if (i13 == 2) {
            return 1;
        }
        if (i13 != 3) {
            i14 = 4;
            if (i13 == 4) {
                return 3;
            }
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i14;
    }
}
