package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class k2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k2[] $VALUES;

    @NotNull
    public static final i2 Companion;
    public static final k2 HOME_FEED = new k2("HOME_FEED", 0);
    public static final k2 FEED = new k2("FEED", 1);
    public static final k2 CLOSEUP = new k2("CLOSEUP", 2);
    public static final k2 DOMAIN = new k2("DOMAIN", 3);
    public static final k2 SEARCH = new k2("SEARCH", 4);
    public static final k2 BOARD = new k2("BOARD", 5);
    public static final k2 BOARD_SECTION = new k2("BOARD_SECTION", 6);
    public static final k2 FRIEND_FEED = new k2("FRIEND_FEED", 7);
    public static final k2 RELATED_PINS = new k2("RELATED_PINS", 8);
    public static final k2 RECOMMENDATION_FEED = new k2("RECOMMENDATION_FEED", 9);
    public static final k2 FOLLOWING_FEED = new k2("FOLLOWING_FEED", 10);
    public static final k2 INTERESTS_FEED = new k2("INTERESTS_FEED", 11);
    public static final k2 AGGREGATED_INTEREST_FEED = new k2("AGGREGATED_INTEREST_FEED", 12);
    public static final k2 FLASHLIGHT = new k2("FLASHLIGHT", 13);
    public static final k2 RELATED_PRODUCTS = new k2("RELATED_PRODUCTS", 14);
    public static final k2 SHOP_THE_LOOK_CAROUSEL = new k2("SHOP_THE_LOOK_CAROUSEL", 15);
    public static final k2 RELATED_RECIPES = new k2("RELATED_RECIPES", 16);
    public static final k2 BRAND_CATALOG_FEED = new k2("BRAND_CATALOG_FEED", 17);
    public static final k2 BOARD_SHOPPING_PACKAGE_FEED = new k2("BOARD_SHOPPING_PACKAGE_FEED", 18);
    public static final k2 BRAND_SHOPPING_PACKAGE_FEED = new k2("BRAND_SHOPPING_PACKAGE_FEED", 19);
    public static final k2 BUBBLES_SHOPPING_PACKAGE_FEED = new k2("BUBBLES_SHOPPING_PACKAGE_FEED", 20);
    public static final k2 RELATED_MODULES = new k2("RELATED_MODULES", 21);
    public static final k2 RELATED_DIY = new k2("RELATED_DIY", 22);
    public static final k2 CAMERA_SEARCH = new k2("CAMERA_SEARCH", 23);
    public static final k2 VIRTUAL_TRY_ON_PRODUCTS = new k2("VIRTUAL_TRY_ON_PRODUCTS", 24);
    public static final k2 VIRTUAL_TRY_ON_LOOKS = new k2("VIRTUAL_TRY_ON_LOOKS", 25);
    public static final k2 RELATED_CREATOR_CONTENT = new k2("RELATED_CREATOR_CONTENT", 26);
    public static final k2 RELATED_USE_CASES_FEED = new k2("RELATED_USE_CASES_FEED", 27);
    public static final k2 RELATED_BROAD_INTEREST_FEED = new k2("RELATED_BROAD_INTEREST_FEED", 28);
    public static final k2 RELATED_STORIES = new k2("RELATED_STORIES", 29);
    public static final k2 PRICE_LIMIT_FEED = new k2("PRICE_LIMIT_FEED", 30);
    public static final k2 MOST_CONSIDERED_FEED = new k2("MOST_CONSIDERED_FEED", 31);
    public static final k2 PRODUCT_COLLABORATIVE_FILTERING_CLICK_FEED = new k2("PRODUCT_COLLABORATIVE_FILTERING_CLICK_FEED", 32);
    public static final k2 SIMILAR_MERCHANT_FEED = new k2("SIMILAR_MERCHANT_FEED", 33);
    public static final k2 PRODUCT_COLLABORATIVE_FILTERING_PURCHASE_FEED = new k2("PRODUCT_COLLABORATIVE_FILTERING_PURCHASE_FEED", 34);
    public static final k2 PRODUCT_COLLABORATIVE_FILTERING_FREQUENTLY_BOUGHT_TOGETHER_FEED = new k2("PRODUCT_COLLABORATIVE_FILTERING_FREQUENTLY_BOUGHT_TOGETHER_FEED", 35);
    public static final k2 PERSONAL_BOUTIQUE = new k2("PERSONAL_BOUTIQUE", 36);
    public static final k2 COMPLEMENTARY_FEED = new k2("COMPLEMENTARY_FEED", 37);
    public static final k2 RELATED_SIDE_CARD = new k2("RELATED_SIDE_CARD", 38);
    public static final k2 RELATED_PIVOT_TOPIC_STREAM = new k2("RELATED_PIVOT_TOPIC_STREAM", 39);
    public static final k2 RELATED_SHUFFLE_PINS = new k2("RELATED_SHUFFLE_PINS", 40);
    public static final k2 IN_THESE_COLLAGES_PINS = new k2("IN_THESE_COLLAGES_PINS", 41);
    public static final k2 COLLAGES_FOR_YOU_PINS = new k2("COLLAGES_FOR_YOU_PINS", 42);
    public static final k2 CUTOUT_SHOP_SIMILAR_PINS = new k2("CUTOUT_SHOP_SIMILAR_PINS", 43);
    public static final k2 CLOSEUP_SHOPPING_MODULE = new k2("CLOSEUP_SHOPPING_MODULE", 44);
    public static final k2 OWN_PROFILE_PINS_FEED = new k2("OWN_PROFILE_PINS_FEED", 45);
    public static final k2 AUTO_ORG_PIN_CLUSTER_FEED = new k2("AUTO_ORG_PIN_CLUSTER_FEED", 46);
    public static final k2 ALL_PINS_BOARD_FEED = new k2("ALL_PINS_BOARD_FEED", 47);
    public static final k2 CTL_COLLAGE_PROMPT = new k2("CTL_COLLAGE_PROMPT", 48);
    public static final k2 PROFILE_PINS_FEED = new k2("PROFILE_PINS_FEED", 49);
    public static final k2 GIFT_GUIDE_PINS_FEED = new k2("GIFT_GUIDE_PINS_FEED", 50);
    public static final k2 FEATURED_BOARD_FEED = new k2("FEATURED_BOARD_FEED", 51);

    private static final /* synthetic */ k2[] $values() {
        return new k2[]{HOME_FEED, FEED, CLOSEUP, DOMAIN, SEARCH, BOARD, BOARD_SECTION, FRIEND_FEED, RELATED_PINS, RECOMMENDATION_FEED, FOLLOWING_FEED, INTERESTS_FEED, AGGREGATED_INTEREST_FEED, FLASHLIGHT, RELATED_PRODUCTS, SHOP_THE_LOOK_CAROUSEL, RELATED_RECIPES, BRAND_CATALOG_FEED, BOARD_SHOPPING_PACKAGE_FEED, BRAND_SHOPPING_PACKAGE_FEED, BUBBLES_SHOPPING_PACKAGE_FEED, RELATED_MODULES, RELATED_DIY, CAMERA_SEARCH, VIRTUAL_TRY_ON_PRODUCTS, VIRTUAL_TRY_ON_LOOKS, RELATED_CREATOR_CONTENT, RELATED_USE_CASES_FEED, RELATED_BROAD_INTEREST_FEED, RELATED_STORIES, PRICE_LIMIT_FEED, MOST_CONSIDERED_FEED, PRODUCT_COLLABORATIVE_FILTERING_CLICK_FEED, SIMILAR_MERCHANT_FEED, PRODUCT_COLLABORATIVE_FILTERING_PURCHASE_FEED, PRODUCT_COLLABORATIVE_FILTERING_FREQUENTLY_BOUGHT_TOGETHER_FEED, PERSONAL_BOUTIQUE, COMPLEMENTARY_FEED, RELATED_SIDE_CARD, RELATED_PIVOT_TOPIC_STREAM, RELATED_SHUFFLE_PINS, IN_THESE_COLLAGES_PINS, COLLAGES_FOR_YOU_PINS, CUTOUT_SHOP_SIMILAR_PINS, CLOSEUP_SHOPPING_MODULE, OWN_PROFILE_PINS_FEED, AUTO_ORG_PIN_CLUSTER_FEED, ALL_PINS_BOARD_FEED, CTL_COLLAGE_PROMPT, PROFILE_PINS_FEED, GIFT_GUIDE_PINS_FEED, FEATURED_BOARD_FEED};
    }

    static {
        k2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new i2();
    }

    private k2(String str, int i13) {
    }

    public static final k2 findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 1:
                return HOME_FEED;
            case 2:
                return FEED;
            case 3:
                return CLOSEUP;
            case 4:
                return DOMAIN;
            case 5:
                return SEARCH;
            case 6:
                return BOARD;
            case 7:
                return FRIEND_FEED;
            case 8:
                return RELATED_PINS;
            case 9:
                return RECOMMENDATION_FEED;
            case 10:
                return FOLLOWING_FEED;
            case 11:
                return INTERESTS_FEED;
            case 12:
                return AGGREGATED_INTEREST_FEED;
            case 13:
                return FLASHLIGHT;
            case 14:
                return RELATED_PRODUCTS;
            case 15:
                return SHOP_THE_LOOK_CAROUSEL;
            case 16:
                return RELATED_RECIPES;
            case 17:
                return BRAND_CATALOG_FEED;
            case 18:
                return BOARD_SHOPPING_PACKAGE_FEED;
            case 19:
                return BRAND_SHOPPING_PACKAGE_FEED;
            case 20:
                return BUBBLES_SHOPPING_PACKAGE_FEED;
            case 21:
                return RELATED_MODULES;
            case 22:
                return RELATED_DIY;
            case 23:
                return CAMERA_SEARCH;
            case 24:
                return VIRTUAL_TRY_ON_PRODUCTS;
            case 25:
                return VIRTUAL_TRY_ON_LOOKS;
            case 26:
                return RELATED_CREATOR_CONTENT;
            case 27:
                return RELATED_USE_CASES_FEED;
            case 28:
                return RELATED_BROAD_INTEREST_FEED;
            case 29:
                return RELATED_STORIES;
            case 30:
                return PRICE_LIMIT_FEED;
            case 31:
                return MOST_CONSIDERED_FEED;
            case 32:
                return PRODUCT_COLLABORATIVE_FILTERING_CLICK_FEED;
            case 33:
                return SIMILAR_MERCHANT_FEED;
            case 34:
                return PRODUCT_COLLABORATIVE_FILTERING_PURCHASE_FEED;
            case 35:
                return PERSONAL_BOUTIQUE;
            case 36:
                return PRODUCT_COLLABORATIVE_FILTERING_FREQUENTLY_BOUGHT_TOGETHER_FEED;
            case 37:
                return COMPLEMENTARY_FEED;
            case 38:
                return RELATED_SIDE_CARD;
            case 39:
                return RELATED_PIVOT_TOPIC_STREAM;
            case 40:
                return RELATED_SHUFFLE_PINS;
            case 41:
                return IN_THESE_COLLAGES_PINS;
            case 42:
                return COLLAGES_FOR_YOU_PINS;
            case 43:
                return CUTOUT_SHOP_SIMILAR_PINS;
            case 44:
                return CLOSEUP_SHOPPING_MODULE;
            case 45:
                return OWN_PROFILE_PINS_FEED;
            case 46:
                return AUTO_ORG_PIN_CLUSTER_FEED;
            case 47:
                return ALL_PINS_BOARD_FEED;
            case 48:
                return BOARD_SECTION;
            case 49:
                return CTL_COLLAGE_PROMPT;
            case 50:
                return PROFILE_PINS_FEED;
            case 51:
                return GIFT_GUIDE_PINS_FEED;
            case 52:
                return FEATURED_BOARD_FEED;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k2 valueOf(String str) {
        return (k2) Enum.valueOf(k2.class, str);
    }

    public static k2[] values() {
        return (k2[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (j2.f67125a[ordinal()]) {
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
                return 48;
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
            case 25:
                return 24;
            case 26:
                return 25;
            case 27:
                return 26;
            case 28:
                return 27;
            case 29:
                return 28;
            case 30:
                return 29;
            case 31:
                return 30;
            case 32:
                return 31;
            case 33:
                return 32;
            case 34:
                return 33;
            case 35:
                return 34;
            case 36:
                return 36;
            case 37:
                return 35;
            case 38:
                return 37;
            case 39:
                return 38;
            case 40:
                return 39;
            case 41:
                return 40;
            case 42:
                return 41;
            case 43:
                return 42;
            case 44:
                return 43;
            case 45:
                return 44;
            case 46:
                return 45;
            case 47:
                return 46;
            case 48:
                return 47;
            case 49:
                return 49;
            case 50:
                return 50;
            case 51:
                return 51;
            case 52:
                return 52;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
