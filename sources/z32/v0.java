package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class v0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ v0[] $VALUES;

    @NotNull
    public static final t0 Companion;
    public static final v0 DEFAULT = new v0("DEFAULT", 0);
    public static final v0 SMALL = new v0("SMALL", 1);
    public static final v0 MEDIUM = new v0("MEDIUM", 2);
    public static final v0 LARGE = new v0("LARGE", 3);

    private static final /* synthetic */ v0[] $values() {
        return new v0[]{DEFAULT, SMALL, MEDIUM, LARGE};
    }

    static {
        v0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new t0();
    }

    private v0(String str, int i13) {
    }

    public static final v0 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return DEFAULT;
        }
        if (i13 == 1) {
            return SMALL;
        }
        if (i13 == 2) {
            return MEDIUM;
        }
        if (i13 != 3) {
            return null;
        }
        return LARGE;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = u0.f140835a[ordinal()];
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
