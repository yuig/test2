package t32;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @NotNull
    public static final d Companion;
    public static final f PRODUCT_MERCHANT = new f("PRODUCT_MERCHANT", 0);
    public static final f PRODUCT_PRICE = new f("PRODUCT_PRICE", 1);
    public static final f PRODUCT_CURRENCY = new f("PRODUCT_CURRENCY", 2);
    public static final f PRODUCT_BRAND = new f("PRODUCT_BRAND", 3);
    public static final f PRODUCT_CONTENT_TYPE = new f("PRODUCT_CONTENT_TYPE", 4);
    public static final f PRODUCT_PRICE_BUCKET = new f("PRODUCT_PRICE_BUCKET", 5);
    public static final f PRODUCT_COLOR = new f("PRODUCT_COLOR", 6);
    public static final f PRODUCT_ON_SALE = new f("PRODUCT_ON_SALE", 7);
    public static final f PRODUCT_ON_SALE_40PERCENT = new f("PRODUCT_ON_SALE_40PERCENT", 8);
    public static final f PRODUCT_ON_SALE_60PERCENT = new f("PRODUCT_ON_SALE_60PERCENT", 9);
    public static final f PRODUCT_STYLE = new f("PRODUCT_STYLE", 10);
    public static final f PRODUCT_CATEGORY = new f("PRODUCT_CATEGORY", 11);
    public static final f PRODUCT_BRAND_VALUE = new f("PRODUCT_BRAND_VALUE", 12);
    public static final f PRODUCT_GENDER = new f("PRODUCT_GENDER", 13);
    public static final f GOOGLE_PRODUCT_CATEGORY = new f("GOOGLE_PRODUCT_CATEGORY", 14);

    private static final /* synthetic */ f[] $values() {
        return new f[]{PRODUCT_MERCHANT, PRODUCT_PRICE, PRODUCT_CURRENCY, PRODUCT_BRAND, PRODUCT_CONTENT_TYPE, PRODUCT_PRICE_BUCKET, PRODUCT_COLOR, PRODUCT_ON_SALE, PRODUCT_ON_SALE_40PERCENT, PRODUCT_ON_SALE_60PERCENT, PRODUCT_STYLE, PRODUCT_CATEGORY, PRODUCT_BRAND_VALUE, PRODUCT_GENDER, GOOGLE_PRODUCT_CATEGORY};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new d();
    }

    private f(String str, int i13) {
    }

    public static final f findByValue(int i13) {
        Companion.getClass();
        return d.a(i13);
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
        switch (e.f116322a[ordinal()]) {
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
            case 15:
                return 14;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
