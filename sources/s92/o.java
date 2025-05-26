package s92;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;

    @NotNull
    public static final m Companion;
    public static final o COMPLETE = new o("COMPLETE", 0);
    public static final o ABORTED = new o("ABORTED", 1);
    public static final o ERROR = new o("ERROR", 2);

    private static final /* synthetic */ o[] $values() {
        return new o[]{COMPLETE, ABORTED, ERROR};
    }

    static {
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new m();
    }

    private o(String str, int i13) {
    }

    public static final o findByValue(int i13) {
        Companion.getClass();
        if (i13 == 1) {
            return COMPLETE;
        }
        if (i13 == 2) {
            return ABORTED;
        }
        if (i13 != 3) {
            return null;
        }
        return ERROR;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = n.f112112a[ordinal()];
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
