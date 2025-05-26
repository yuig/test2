package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class k1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k1[] $VALUES;

    @NotNull
    public static final i1 Companion;
    public static final k1 NONE = new k1("NONE", 0);
    public static final k1 BLUR = new k1("BLUR", 1);
    public static final k1 ICON_ABOVE = new k1("ICON_ABOVE", 2);

    private static final /* synthetic */ k1[] $values() {
        return new k1[]{NONE, BLUR, ICON_ABOVE};
    }

    static {
        k1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new i1();
    }

    private k1(String str, int i13) {
    }

    public static final k1 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return NONE;
        }
        if (i13 == 1) {
            return BLUR;
        }
        if (i13 != 2) {
            return null;
        }
        return ICON_ABOVE;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = j1.f140820a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        if (i13 == 3) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
