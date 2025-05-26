package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;

    @NotNull
    public static final s Companion;
    public static final u MONTAGE = new u("MONTAGE", 0);
    public static final u STACK_IN_FRAME = new u("STACK_IN_FRAME", 1);

    private static final /* synthetic */ u[] $values() {
        return new u[]{MONTAGE, STACK_IN_FRAME};
    }

    static {
        u[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new s();
    }

    private u(String str, int i13) {
    }

    public static final u findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return MONTAGE;
        }
        if (i13 != 1) {
            return null;
        }
        return STACK_IN_FRAME;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = t.f140833a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
