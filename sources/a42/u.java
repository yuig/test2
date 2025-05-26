package a42;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;

    @NotNull
    public static final s Companion;
    public static final u STATIC = new u("STATIC", 0);
    public static final u ANIMATED = new u("ANIMATED", 1);
    public static final u DEFAULT = new u("DEFAULT", 2);
    public static final u USER_IMAGE = new u("USER_IMAGE", 3);

    private static final /* synthetic */ u[] $values() {
        return new u[]{STATIC, ANIMATED, DEFAULT, USER_IMAGE};
    }

    static {
        u[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new s();
    }

    private u(String str, int i13) {
    }

    public static final u findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return STATIC;
        }
        if (i13 == 1) {
            return ANIMATED;
        }
        if (i13 == 2) {
            return DEFAULT;
        }
        if (i13 != 3) {
            return null;
        }
        return USER_IMAGE;
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
        int i13 = t.f707a[ordinal()];
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
