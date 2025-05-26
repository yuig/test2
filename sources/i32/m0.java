package i32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class m0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ m0[] $VALUES;

    @NotNull
    public static final k0 Companion;
    public static final m0 DEFAULT = new m0("DEFAULT", 0);
    public static final m0 SUBTLE = new m0("SUBTLE", 1);
    public static final m0 DISABLED = new m0("DISABLED", 2);
    public static final m0 INVERSE = new m0("INVERSE", 3);
    public static final m0 INFO = new m0("INFO", 4);
    public static final m0 SUCCESS = new m0("SUCCESS", 5);
    public static final m0 WARNING = new m0("WARNING", 6);
    public static final m0 ERROR = new m0("ERROR", 7);
    public static final m0 RECOMMENDATION = new m0("RECOMMENDATION", 8);
    public static final m0 BRAND = new m0("BRAND", 9);
    public static final m0 LIGHT = new m0("LIGHT", 10);
    public static final m0 DARK = new m0("DARK", 11);

    private static final /* synthetic */ m0[] $values() {
        return new m0[]{DEFAULT, SUBTLE, DISABLED, INVERSE, INFO, SUCCESS, WARNING, ERROR, RECOMMENDATION, BRAND, LIGHT, DARK};
    }

    static {
        m0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new k0();
    }

    private m0(String str, int i13) {
    }

    public static final m0 findByValue(int i13) {
        Companion.getClass();
        return k0.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (l0.f71485a[ordinal()]) {
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
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
