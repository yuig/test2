package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class q0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;

    @NotNull
    public static final o0 Companion;
    public static final q0 OTHER = new q0("OTHER", 0);
    public static final q0 KINDLE = new q0("KINDLE", 1);
    public static final q0 DROID = new q0("DROID", 2);
    public static final q0 NEXUS = new q0("NEXUS", 3);
    public static final q0 NOOK = new q0("NOOK", 4);
    public static final q0 SAMSUNG = new q0("SAMSUNG", 5);
    public static final q0 HTC = new q0("HTC", 6);
    public static final q0 GALAXY_TAB_DEPRECATED = new q0("GALAXY_TAB_DEPRECATED", 7);
    public static final q0 WINDOWS_PHONE = new q0("WINDOWS_PHONE", 8);
    public static final q0 LGE = new q0("LGE", 9);
    public static final q0 SONY = new q0("SONY", 10);
    public static final q0 ZTE = new q0("ZTE", 11);
    public static final q0 HUAWEI = new q0("HUAWEI", 12);
    public static final q0 ALCATEL = new q0("ALCATEL", 13);
    public static final q0 LENOVO = new q0("LENOVO", 14);
    public static final q0 KYOCERA = new q0("KYOCERA", 15);
    public static final q0 ACER = new q0("ACER", 16);
    public static final q0 ASUS = new q0("ASUS", 17);

    private static final /* synthetic */ q0[] $values() {
        return new q0[]{OTHER, KINDLE, DROID, NEXUS, NOOK, SAMSUNG, HTC, GALAXY_TAB_DEPRECATED, WINDOWS_PHONE, LGE, SONY, ZTE, HUAWEI, ALCATEL, LENOVO, KYOCERA, ACER, ASUS};
    }

    static {
        q0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new o0();
    }

    private q0(String str, int i13) {
    }

    public static final q0 findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 0:
                return OTHER;
            case 1:
            case 2:
            case 3:
            case 11:
            default:
                return null;
            case 4:
                return KINDLE;
            case 5:
                return DROID;
            case 6:
                return NEXUS;
            case 7:
                return NOOK;
            case 8:
                return SAMSUNG;
            case 9:
                return HTC;
            case 10:
                return GALAXY_TAB_DEPRECATED;
            case 12:
                return WINDOWS_PHONE;
            case 13:
                return LGE;
            case 14:
                return SONY;
            case 15:
                return ZTE;
            case 16:
                return HUAWEI;
            case 17:
                return ALCATEL;
            case 18:
                return LENOVO;
            case 19:
                return KYOCERA;
            case 20:
                return ACER;
            case 21:
                return ASUS;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (p0.f67174a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 12;
            case 10:
                return 13;
            case 11:
                return 14;
            case 12:
                return 15;
            case 13:
                return 16;
            case 14:
                return 17;
            case 15:
                return 18;
            case 16:
                return 19;
            case 17:
                return 20;
            case 18:
                return 21;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
