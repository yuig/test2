package i32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @NotNull
    public static final d Companion;
    public static final f NUX_INTEREST_SELECTOR = new f("NUX_INTEREST_SELECTOR", 0);
    public static final f NUX_END_SCREEN = new f("NUX_END_SCREEN", 1);
    public static final f NUX_COUNTRY_STEP = new f("NUX_COUNTRY_STEP", 2);
    public static final f NUX_GENDER_STEP = new f("NUX_GENDER_STEP", 3);
    public static final f NUX_CREATOR_STEP = new f("NUX_CREATOR_STEP", 4);
    public static final f NUX_USE_CASE_PICKER_STEP = new f("NUX_USE_CASE_PICKER_STEP", 5);
    public static final f NUX_REVAMP_END_SCREEN = new f("NUX_REVAMP_END_SCREEN", 6);
    public static final f NUX_PIN_PICKER_STEP = new f("NUX_PIN_PICKER_STEP", 7);

    private static final /* synthetic */ f[] $values() {
        return new f[]{NUX_INTEREST_SELECTOR, NUX_END_SCREEN, NUX_COUNTRY_STEP, NUX_GENDER_STEP, NUX_CREATOR_STEP, NUX_USE_CASE_PICKER_STEP, NUX_REVAMP_END_SCREEN, NUX_PIN_PICKER_STEP};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new d();
    }

    private f(String str, int i13) {
    }

    public static final f findByValue(int i13) {
        Companion.getClass();
        if (i13 == 13) {
            return NUX_INTEREST_SELECTOR;
        }
        if (i13 == 54) {
            return NUX_END_SCREEN;
        }
        if (i13 == 62) {
            return NUX_COUNTRY_STEP;
        }
        if (i13 == 67) {
            return NUX_GENDER_STEP;
        }
        if (i13 == 68) {
            return NUX_CREATOR_STEP;
        }
        switch (i13) {
            case 70:
                return NUX_USE_CASE_PICKER_STEP;
            case 71:
                return NUX_REVAMP_END_SCREEN;
            case 72:
                return NUX_PIN_PICKER_STEP;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (e.f71478a[ordinal()]) {
            case 1:
                return 13;
            case 2:
                return 54;
            case 3:
                return 62;
            case 4:
                return 67;
            case 5:
                return 68;
            case 6:
                return 70;
            case 7:
                return 71;
            case 8:
                return 72;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
