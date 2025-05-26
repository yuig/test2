package i32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class n1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n1[] $VALUES;

    @NotNull
    public static final l1 Companion;
    public static final n1 NORMAL = new n1("NORMAL", 0);
    public static final n1 BOLD = new n1("BOLD", 1);

    private static final /* synthetic */ n1[] $values() {
        return new n1[]{NORMAL, BOLD};
    }

    static {
        n1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new l1();
    }

    private n1(String str, int i13) {
    }

    public static final n1 findByValue(int i13) {
        Companion.getClass();
        return l1.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = m1.f71486a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
