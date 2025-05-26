package i32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;

    @NotNull
    public static final e0 Companion;
    public static final g0 DEFAULT = new g0("DEFAULT", 0);
    public static final g0 SUBTLE = new g0("SUBTLE", 1);
    public static final g0 SUCCESS = new g0("SUCCESS", 2);
    public static final g0 ERROR = new g0("ERROR", 3);
    public static final g0 WARNING = new g0("WARNING", 4);
    public static final g0 INVERSE = new g0("INVERSE", 5);
    public static final g0 DARK = new g0("DARK", 6);
    public static final g0 LIGHT = new g0("LIGHT", 7);
    public static final g0 SHOPPING = new g0("SHOPPING", 8);

    private static final /* synthetic */ g0[] $values() {
        return new g0[]{DEFAULT, SUBTLE, SUCCESS, ERROR, WARNING, INVERSE, DARK, LIGHT, SHOPPING};
    }

    static {
        g0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new e0();
    }

    private g0(String str, int i13) {
    }

    public static final g0 findByValue(int i13) {
        Companion.getClass();
        return e0.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (f0.f71479a[ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
