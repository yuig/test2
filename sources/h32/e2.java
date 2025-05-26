package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e2[] $VALUES;

    @NotNull
    public static final c2 Companion;
    public static final e2 BUYABLE = new e2("BUYABLE", 0);
    public static final e2 AVAILABLE = new e2("AVAILABLE", 1);
    public static final e2 SHOP_THE_LOOK = new e2("SHOP_THE_LOOK", 2);
    public static final e2 HAS_CHIPS = new e2("HAS_CHIPS", 3);
    public static final e2 IS_SNACKBOX = new e2("IS_SNACKBOX", 4);
    public static final e2 PRODUCT_PIN_V2 = new e2("PRODUCT_PIN_V2", 5);
    public static final e2 RICH_PRODUCT_PIN = new e2("RICH_PRODUCT_PIN", 6);
    public static final e2 ADS_CAROUSEL = new e2("ADS_CAROUSEL", 7);
    public static final e2 IS_PRODUCT = new e2("IS_PRODUCT", 8);
    public static final e2 GHOST_PIN = new e2("GHOST_PIN", 9);
    public static final e2 ORGANIC_PRODUCT_CAROUSEL = new e2("ORGANIC_PRODUCT_CAROUSEL", 10);
    public static final e2 TRUSTWORTHY_PRODUCT = new e2("TRUSTWORTHY_PRODUCT", 11);

    private static final /* synthetic */ e2[] $values() {
        return new e2[]{BUYABLE, AVAILABLE, SHOP_THE_LOOK, HAS_CHIPS, IS_SNACKBOX, PRODUCT_PIN_V2, RICH_PRODUCT_PIN, ADS_CAROUSEL, IS_PRODUCT, GHOST_PIN, ORGANIC_PRODUCT_CAROUSEL, TRUSTWORTHY_PRODUCT};
    }

    static {
        e2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new c2();
    }

    private e2(String str, int i13) {
    }

    public static final e2 findByValue(int i13) {
        Companion.getClass();
        return c2.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e2 valueOf(String str) {
        return (e2) Enum.valueOf(e2.class, str);
    }

    public static e2[] values() {
        return (e2[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (d2.f66944a[ordinal()]) {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
