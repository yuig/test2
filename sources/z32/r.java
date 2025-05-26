package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class r {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;

    @NotNull
    public static final p Companion;
    public static final r NONE = new r("NONE", 0);
    public static final r PINTEREST = new r("PINTEREST", 1);
    public static final r INFO = new r("INFO", 2);
    public static final r ARROW_UP_RIGHT_PROMOTED = new r("ARROW_UP_RIGHT_PROMOTED", 3);

    private static final /* synthetic */ r[] $values() {
        return new r[]{NONE, PINTEREST, INFO, ARROW_UP_RIGHT_PROMOTED};
    }

    static {
        r[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new p();
    }

    private r(String str, int i13) {
    }

    public static final r findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return NONE;
        }
        if (i13 == 1) {
            return PINTEREST;
        }
        if (i13 == 2) {
            return INFO;
        }
        if (i13 != 3) {
            return null;
        }
        return ARROW_UP_RIGHT_PROMOTED;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = q.f140829a[ordinal()];
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
