package i32;

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
    public static final u COMPLETE = new u("COMPLETE", 0);
    public static final u COMPLETE_AND_SHOW = new u("COMPLETE_AND_SHOW", 1);
    public static final u DONT_COMPLETE_AND_HIDE = new u("DONT_COMPLETE_AND_HIDE", 2);
    public static final u DONT_COMPLETE_AND_SHOW = new u("DONT_COMPLETE_AND_SHOW", 3);

    private static final /* synthetic */ u[] $values() {
        return new u[]{COMPLETE, COMPLETE_AND_SHOW, DONT_COMPLETE_AND_HIDE, DONT_COMPLETE_AND_SHOW};
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
        if (i13 == 1) {
            return COMPLETE;
        }
        if (i13 == 2) {
            return COMPLETE_AND_SHOW;
        }
        if (i13 == 3) {
            return DONT_COMPLETE_AND_HIDE;
        }
        if (i13 != 4) {
            return null;
        }
        return DONT_COMPLETE_AND_SHOW;
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
        int i13 = t.f71493a[ordinal()];
        int i14 = 1;
        if (i13 != 1) {
            i14 = 2;
            if (i13 != 2) {
                i14 = 3;
                if (i13 != 3) {
                    i14 = 4;
                    if (i13 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return i14;
    }
}
