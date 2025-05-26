package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class v3 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ v3[] $VALUES;

    @NotNull
    public static final t3 Companion;
    public static final v3 TOTAL_WATCHTIME = new v3("TOTAL_WATCHTIME", 0);
    public static final v3 V_50_WATCHTIME = new v3("V_50_WATCHTIME", 1);
    public static final v3 V_50_WATCHTIME_AUDIBLE = new v3("V_50_WATCHTIME_AUDIBLE", 2);
    public static final v3 V_50_WATCHTIME_INAUDIBLE = new v3("V_50_WATCHTIME_INAUDIBLE", 3);
    public static final v3 MAX_QUARTILE = new v3("MAX_QUARTILE", 4);
    public static final v3 MAX_QUARTILE_AUDIBLE = new v3("MAX_QUARTILE_AUDIBLE", 5);
    public static final v3 MAX_QUARTILE_INAUDIBLE = new v3("MAX_QUARTILE_INAUDIBLE", 6);
    public static final v3 V_50_MAX_CONTINUOUS_WATCHTIME = new v3("V_50_MAX_CONTINUOUS_WATCHTIME", 7);
    public static final v3 V_50_MAX_CONTINUOUS_WATCHTIME_AUDIBLE = new v3("V_50_MAX_CONTINUOUS_WATCHTIME_AUDIBLE", 8);
    public static final v3 V_50_MAX_CONTINUOUS_WATCHTIME_INAUDIBLE = new v3("V_50_MAX_CONTINUOUS_WATCHTIME_INAUDIBLE", 9);
    public static final v3 MAX_QUARTILE_PERCENT = new v3("MAX_QUARTILE_PERCENT", 10);
    public static final v3 MAX_QUARTILE_PERCENT_AUDIBLE = new v3("MAX_QUARTILE_PERCENT_AUDIBLE", 11);
    public static final v3 MAX_QUARTILE_PERCENT_INAUDIBLE = new v3("MAX_QUARTILE_PERCENT_INAUDIBLE", 12);
    public static final v3 UNIQUE_WATCHTIME = new v3("UNIQUE_WATCHTIME", 13);

    private static final /* synthetic */ v3[] $values() {
        return new v3[]{TOTAL_WATCHTIME, V_50_WATCHTIME, V_50_WATCHTIME_AUDIBLE, V_50_WATCHTIME_INAUDIBLE, MAX_QUARTILE, MAX_QUARTILE_AUDIBLE, MAX_QUARTILE_INAUDIBLE, V_50_MAX_CONTINUOUS_WATCHTIME, V_50_MAX_CONTINUOUS_WATCHTIME_AUDIBLE, V_50_MAX_CONTINUOUS_WATCHTIME_INAUDIBLE, MAX_QUARTILE_PERCENT, MAX_QUARTILE_PERCENT_AUDIBLE, MAX_QUARTILE_PERCENT_INAUDIBLE, UNIQUE_WATCHTIME};
    }

    static {
        v3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new t3();
    }

    private v3(String str, int i13) {
    }

    public static final v3 findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 0:
                return TOTAL_WATCHTIME;
            case 1:
                return V_50_WATCHTIME;
            case 2:
                return V_50_WATCHTIME_AUDIBLE;
            case 3:
                return V_50_WATCHTIME_INAUDIBLE;
            case 4:
                return MAX_QUARTILE;
            case 5:
                return MAX_QUARTILE_AUDIBLE;
            case 6:
                return MAX_QUARTILE_INAUDIBLE;
            case 7:
                return V_50_MAX_CONTINUOUS_WATCHTIME;
            case 8:
                return V_50_MAX_CONTINUOUS_WATCHTIME_AUDIBLE;
            case 9:
                return V_50_MAX_CONTINUOUS_WATCHTIME_INAUDIBLE;
            case 10:
                return MAX_QUARTILE_PERCENT;
            case 11:
                return MAX_QUARTILE_PERCENT_AUDIBLE;
            case 12:
                return MAX_QUARTILE_PERCENT_INAUDIBLE;
            case 13:
                return UNIQUE_WATCHTIME;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static v3 valueOf(String str) {
        return (v3) Enum.valueOf(v3.class, str);
    }

    public static v3[] values() {
        return (v3[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (u3.f67276a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
