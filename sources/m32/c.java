package m32;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c ALL = new c("ALL", 0);
    public static final c COLOR = new c("COLOR", 1);
    public static final c STYLE = new c("STYLE", 2);
    public static final c OCCASION = new c("OCCASION", 3);
    public static final c ITEM_TYPE = new c("ITEM_TYPE", 4);
    public static final c BRAND = new c("BRAND", 5);
    public static final c PRICE = new c("PRICE", 6);
    public static final c MERCHANT = new c("MERCHANT", 7);
    public static final c ONSALE = new c("ONSALE", 8);
    public static final c CURRENCY = new c("CURRENCY", 9);
    public static final c SKIN_TONE = new c("SKIN_TONE", 10);
    public static final c HAIR_PATTERN = new c("HAIR_PATTERN", 11);

    private static final /* synthetic */ c[] $values() {
        return new c[]{ALL, COLOR, STYLE, OCCASION, ITEM_TYPE, BRAND, PRICE, MERCHANT, ONSALE, CURRENCY, SKIN_TONE, HAIR_PATTERN};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private c(String str, int i13) {
    }

    public static final c findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 0:
                return ALL;
            case 1:
                return COLOR;
            case 2:
                return STYLE;
            case 3:
                return OCCASION;
            case 4:
                return ITEM_TYPE;
            case 5:
                return BRAND;
            case 6:
                return PRICE;
            case 7:
                return MERCHANT;
            case 8:
                return ONSALE;
            case 9:
                return CURRENCY;
            case 10:
                return SKIN_TONE;
            case 11:
                return HAIR_PATTERN;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (b.f85782a[ordinal()]) {
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
