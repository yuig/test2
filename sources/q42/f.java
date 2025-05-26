package q42;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class f extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @NotNull
    public static final d Companion;
    public static final f FILTER = new f("FILTER", 0);
    public static final f SHOP_MODE = new f("SHOP_MODE", 1);
    public static final f PROFILE_MODE = new f("PROFILE_MODE", 2);
    public static final f GUIDE = new f("GUIDE", 3);
    public static final f PERSONALIZATION = new f("PERSONALIZATION", 4);
    public static final f SKIN_TONE = new f("SKIN_TONE", 5);
    public static final f HAIR_TYPE = new f("HAIR_TYPE", 6);
    public static final f STRUCTURED_GUIDE = new f("STRUCTURED_GUIDE", 7);
    public static final f SEARCH_FOR_YOU = new f("SEARCH_FOR_YOU", 8);
    public static final f SHOP_GUIDE = new f("SHOP_GUIDE", 9);
    public static final f SHOP_STRUCTURED_GUIDE = new f("SHOP_STRUCTURED_GUIDE", 10);
    public static final f BODY_TYPE = new f("BODY_TYPE", 11);
    public static final f STRUCTURED_CONTENT_TYPE_FILTER = new f("STRUCTURED_CONTENT_TYPE_FILTER", 12);
    public static final f ONE_TAP_CONTENT_TYPE_FILTER = new f("ONE_TAP_CONTENT_TYPE_FILTER", 13);
    public static final f BODY_TYPE_FILTER_OPTION = new f("BODY_TYPE_FILTER_OPTION", 14);
    public static final f STRUCTURED_GUIDE_DROPDOWN = new f("STRUCTURED_GUIDE_DROPDOWN", 15);
    public static final f CONTENT_TYPE_FILTER_DROPDOWN = new f("CONTENT_TYPE_FILTER_DROPDOWN", 16);
    public static final f SHOP_FILTER = new f("SHOP_FILTER", 17);
    public static final f PRICE_RANGE_FILTER = new f("PRICE_RANGE_FILTER", 18);
    public static final f MERCHANT_FILTER = new f("MERCHANT_FILTER", 19);
    public static final f SHOP_TO_LOOK_CATEGORY_FILTER = new f("SHOP_TO_LOOK_CATEGORY_FILTER", 20);
    public static final f HYBRID_SEARCH_REFINEMENT_GUIDE = new f("HYBRID_SEARCH_REFINEMENT_GUIDE", 21);
    public static final f COLOR_PALETTE = new f("COLOR_PALETTE", 22);
    public static final f COLOR_PALETTE_CATEGORY_OPTION = new f("COLOR_PALETTE_CATEGORY_OPTION", 23);

    private static final /* synthetic */ f[] $values() {
        return new f[]{FILTER, SHOP_MODE, PROFILE_MODE, GUIDE, PERSONALIZATION, SKIN_TONE, HAIR_TYPE, STRUCTURED_GUIDE, SEARCH_FOR_YOU, SHOP_GUIDE, SHOP_STRUCTURED_GUIDE, BODY_TYPE, STRUCTURED_CONTENT_TYPE_FILTER, ONE_TAP_CONTENT_TYPE_FILTER, BODY_TYPE_FILTER_OPTION, STRUCTURED_GUIDE_DROPDOWN, CONTENT_TYPE_FILTER_DROPDOWN, SHOP_FILTER, PRICE_RANGE_FILTER, MERCHANT_FILTER, SHOP_TO_LOOK_CATEGORY_FILTER, HYBRID_SEARCH_REFINEMENT_GUIDE, COLOR_PALETTE, COLOR_PALETTE_CATEGORY_OPTION};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new d();
    }

    private f(String str, int i13) {
        super(str, i13);
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
        switch (e.f102395a[ordinal()]) {
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
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            case 24:
                return 23;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
