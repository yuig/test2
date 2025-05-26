package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h2[] $VALUES;

    @NotNull
    public static final f2 Companion;
    public static final h2 GRID_CELL = new h2("GRID_CELL", 0);
    public static final h2 CLOSEUP = new h2("CLOSEUP", 1);
    public static final h2 COMMERCE_CAROUSEL = new h2("COMMERCE_CAROUSEL", 2);
    public static final h2 STORY_CAROUSEL = new h2("STORY_CAROUSEL", 3);
    public static final h2 COMMERCE_CAROUSEL_EXPANDED = new h2("COMMERCE_CAROUSEL_EXPANDED", 4);
    public static final h2 SEARCH_COMMERCE_FEED = new h2("SEARCH_COMMERCE_FEED", 5);
    public static final h2 SHOP_SPACE = new h2("SHOP_SPACE", 6);
    public static final h2 MERCHANT_PROFILE = new h2("MERCHANT_PROFILE", 7);
    public static final h2 COMMERCE_CLOSEUP_CAROUSEL = new h2("COMMERCE_CLOSEUP_CAROUSEL", 8);
    public static final h2 EXPLORE = new h2("EXPLORE", 9);
    public static final h2 WIDE_GRID_CELL = new h2("WIDE_GRID_CELL", 10);
    public static final h2 PINCH_TO_ZOOM_CAROUSEL = new h2("PINCH_TO_ZOOM_CAROUSEL", 11);
    public static final h2 VIRTUAL_TRY_ON_CAROUSEL = new h2("VIRTUAL_TRY_ON_CAROUSEL", 12);
    public static final h2 CLOSEUP_IMPRESSION = new h2("CLOSEUP_IMPRESSION", 13);
    public static final h2 TODAY = new h2("TODAY", 14);
    public static final h2 PRODUCT_TAG = new h2("PRODUCT_TAG", 15);
    public static final h2 COMMENT_REPLY_TAG = new h2("COMMENT_REPLY_TAG", 16);
    public static final h2 SEARCH_IMMERSIVE_HEADER = new h2("SEARCH_IMMERSIVE_HEADER", 17);

    private static final /* synthetic */ h2[] $values() {
        return new h2[]{GRID_CELL, CLOSEUP, COMMERCE_CAROUSEL, STORY_CAROUSEL, COMMERCE_CAROUSEL_EXPANDED, SEARCH_COMMERCE_FEED, SHOP_SPACE, MERCHANT_PROFILE, COMMERCE_CLOSEUP_CAROUSEL, EXPLORE, WIDE_GRID_CELL, PINCH_TO_ZOOM_CAROUSEL, VIRTUAL_TRY_ON_CAROUSEL, CLOSEUP_IMPRESSION, TODAY, PRODUCT_TAG, COMMENT_REPLY_TAG, SEARCH_IMMERSIVE_HEADER};
    }

    static {
        h2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new f2();
    }

    private h2(String str, int i13) {
    }

    public static final h2 findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 0:
                return GRID_CELL;
            case 1:
                return CLOSEUP;
            case 2:
                return COMMERCE_CAROUSEL;
            case 3:
                return STORY_CAROUSEL;
            case 4:
                return COMMERCE_CAROUSEL_EXPANDED;
            case 5:
                return SEARCH_COMMERCE_FEED;
            case 6:
                return SHOP_SPACE;
            case 7:
                return MERCHANT_PROFILE;
            case 8:
                return COMMERCE_CLOSEUP_CAROUSEL;
            case 9:
                return EXPLORE;
            case 10:
                return WIDE_GRID_CELL;
            case 11:
                return PINCH_TO_ZOOM_CAROUSEL;
            case 12:
                return VIRTUAL_TRY_ON_CAROUSEL;
            case 13:
                return CLOSEUP_IMPRESSION;
            case 14:
                return TODAY;
            case 15:
                return PRODUCT_TAG;
            case 16:
                return COMMENT_REPLY_TAG;
            case 17:
                return SEARCH_IMMERSIVE_HEADER;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static h2 valueOf(String str) {
        return (h2) Enum.valueOf(h2.class, str);
    }

    public static h2[] values() {
        return (h2[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (g2.f67014a[ordinal()]) {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
