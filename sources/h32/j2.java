package h32;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class j2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f67125a;

    static {
        int[] iArr = new int[k2.values().length];
        try {
            iArr[k2.HOME_FEED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k2.FEED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k2.CLOSEUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k2.DOMAIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k2.SEARCH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[k2.BOARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[k2.BOARD_SECTION.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[k2.FRIEND_FEED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[k2.RELATED_PINS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[k2.RECOMMENDATION_FEED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[k2.FOLLOWING_FEED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[k2.INTERESTS_FEED.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[k2.AGGREGATED_INTEREST_FEED.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[k2.FLASHLIGHT.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[k2.RELATED_PRODUCTS.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[k2.SHOP_THE_LOOK_CAROUSEL.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[k2.RELATED_RECIPES.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[k2.BRAND_CATALOG_FEED.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[k2.BOARD_SHOPPING_PACKAGE_FEED.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[k2.BRAND_SHOPPING_PACKAGE_FEED.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[k2.BUBBLES_SHOPPING_PACKAGE_FEED.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[k2.RELATED_MODULES.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[k2.RELATED_DIY.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[k2.CAMERA_SEARCH.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[k2.VIRTUAL_TRY_ON_PRODUCTS.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[k2.VIRTUAL_TRY_ON_LOOKS.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[k2.RELATED_CREATOR_CONTENT.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[k2.RELATED_USE_CASES_FEED.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[k2.RELATED_BROAD_INTEREST_FEED.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[k2.RELATED_STORIES.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[k2.PRICE_LIMIT_FEED.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[k2.MOST_CONSIDERED_FEED.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[k2.PRODUCT_COLLABORATIVE_FILTERING_CLICK_FEED.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[k2.SIMILAR_MERCHANT_FEED.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[k2.PRODUCT_COLLABORATIVE_FILTERING_PURCHASE_FEED.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[k2.PRODUCT_COLLABORATIVE_FILTERING_FREQUENTLY_BOUGHT_TOGETHER_FEED.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[k2.PERSONAL_BOUTIQUE.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[k2.COMPLEMENTARY_FEED.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[k2.RELATED_SIDE_CARD.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[k2.RELATED_PIVOT_TOPIC_STREAM.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[k2.RELATED_SHUFFLE_PINS.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[k2.IN_THESE_COLLAGES_PINS.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[k2.COLLAGES_FOR_YOU_PINS.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[k2.CUTOUT_SHOP_SIMILAR_PINS.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[k2.CLOSEUP_SHOPPING_MODULE.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[k2.OWN_PROFILE_PINS_FEED.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[k2.AUTO_ORG_PIN_CLUSTER_FEED.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr[k2.ALL_PINS_BOARD_FEED.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr[k2.CTL_COLLAGE_PROMPT.ordinal()] = 49;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr[k2.PROFILE_PINS_FEED.ordinal()] = 50;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr[k2.GIFT_GUIDE_PINS_FEED.ordinal()] = 51;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr[k2.FEATURED_BOARD_FEED.ordinal()] = 52;
        } catch (NoSuchFieldError unused52) {
        }
        f67125a = iArr;
    }
}
