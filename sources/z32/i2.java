package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i2[] $VALUES;

    @NotNull
    public static final g2 Companion;
    public static final i2 NONE = new i2("NONE", 0);
    public static final i2 LAST = new i2("LAST", 1);

    private static final /* synthetic */ i2[] $values() {
        return new i2[]{NONE, LAST};
    }

    static {
        i2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new g2();
    }

    private i2(String str, int i13) {
    }

    public static final i2 findByValue(int i13) {
        Companion.getClass();
        return g2.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i2 valueOf(String str) {
        return (i2) Enum.valueOf(i2.class, str);
    }

    public static i2[] values() {
        return (i2[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = h2.f140818a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
