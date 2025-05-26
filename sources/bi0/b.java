package bi0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22824a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.REPIN_BOARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.USER_ACTIVITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.CLICKTHROUGH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c.FRESH_REPIN_BOARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[c.FRESH_CLICKTHROUGH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[c.FRESH_USER_ACTIVITY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[c.LOCAL_REPIN_BOARD.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[c.LOCAL_CLICKTHROUGH.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[c.LOCAL_USER_ACTIVITY.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[c.P2P_CLICKTHROUGH.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[c.INSTANT_PFY_NON_MATERIALIZABLE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[c.FOLLOWED_INTEREST.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[c.TOPIC_BEST_PINS.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[c.EMBEDDING_BASED_BEST_PINS.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[c.RECOMMENDED_TOPICS.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[c.RECOMMENDED_GEO_INTERESTS.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[c.USER_SEQUENCE_INTERESTS_PINS.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[c.U2I_DNN_INTERESTS_PINS.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[c.PINNERSAGE_INTERESTS_PINS.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[c.GRAPHSAGE_USER_EMBEDDINGS_TO_ORGANIC_PINS.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[c.NAVBOOST_PFY.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[c.NAVBOOST_P2P.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[c.NOTIFICATION_NEWS_HUB.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[c.GEMINI_INTERESTS_FRESH.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_USER_TO_CREATOR_STORY_PIN.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_USER_TO_CREATOR_STORY_PIN_ENGAGEMENT.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_USER_TO_CREATOR_VIDEO.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_DOMAIN.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_TOPICS_STORY_PINS.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_TOPICS_VIDEO.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[c.GRAPHSAGE_MULTI_PINS_TO_CREATOR_PINS_REALTIME.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[c.GRAPHSAGE_MULTI_PINS_TO_VIDEO_PINS_REALTIME.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[c.GRAPHSAGE_MULTI_PINS_TO_STORY_PINS_REALTIME.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_MANUAL_TAGGEED_INTERESTS_VIDEO.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_MANUAL_TAGGED_INTERESTS_STORY_PIN.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[c.CREATOR_DIRECT_INJECT.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[c.USER_INTERESTS_TO_LONGTERM_CREATOR_PINS.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[c.GRAPHSAGE_PRODUCT_PINS.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[c.GRAPHSAGE_TML_PRODUCT_PINS.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[c.GRAPHSAGE_USER_EMBEDDINGS_TO_PINS.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[c.PROMOTED_PIN.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[c.UNKNOWN.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[c.RECOMMENDED_CATEGORY.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[c.COOKIE_MONSTER.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[c.REALTIME_P2B.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[c.REALTIME_P2B_CLOSEUP.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[c.RECOMMENDED_INTEREST.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr[c.VISUALLY_SIMILAR.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr[c.BOARD_FOLLOW.ordinal()] = 49;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr[c.USER_FOLLOW.ordinal()] = 50;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr[c.RECOMMENDED_COMMERCE.ordinal()] = 51;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr[c.EVERYTHING_FEED.ordinal()] = 52;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr[c.RECOMMENDED_LOCAL_PIN.ordinal()] = 53;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr[c.SEARCH.ordinal()] = 54;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr[c.P2P_USER_COMMERCE.ordinal()] = 55;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr[c.COMMERCE_EDUCATION.ordinal()] = 56;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr[c.LANDING_PAGE_PINS.ordinal()] = 57;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr[c.FOLLOWING_FEED.ordinal()] = 58;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr[c.POPULAR_FEED.ordinal()] = 59;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr[c.P2P_DYNAMIC_GRID.ordinal()] = 60;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr[c.LANDING_PAGE_INTEREST_PINS.ordinal()] = 61;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr[c.FRESH_PIN_FROM_PIN.ordinal()] = 62;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr[c.FRESH_PIN_FROM_INTEREST.ordinal()] = 63;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr[c.FRESH_PIN_FROM_BOARD.ordinal()] = 64;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr[c.SIFTER_VIDEO_FROM_INTEREST.ordinal()] = 65;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr[c.SIFTER_PRODUCTS.ordinal()] = 66;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr[c.SIFTER_DISTRIBUTION_A.ordinal()] = 67;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr[c.SIFTER_DISTRIBUTION_B.ordinal()] = 68;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr[c.SIFTER_DISTRIBUTION_C.ordinal()] = 69;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr[c.SIFTER_DISTRIBUTION_D.ordinal()] = 70;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr[c.SIFTER_DISTRIBUTION_E.ordinal()] = 71;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr[c.SIFTER_ACTIVATION_EXPERIMENT.ordinal()] = 72;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr[c.SIFTER_FRESHMAKER_PIN_FROM_INTEREST.ordinal()] = 73;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr[c.P2P_CLOSEUP.ordinal()] = 74;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr[c.P2P_LIKE.ordinal()] = 75;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr[c.P2P_PIN_CREATE.ordinal()] = 76;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr[c.INSTANT_PFY.ordinal()] = 77;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr[c.DYNAMIC_INSERTION.ordinal()] = 78;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr[c.DYNAMIC_INSERTION_BOARD_FOLLOW.ordinal()] = 79;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr[c.HYPERLOCAL_INTEREST_BOARD.ordinal()] = 80;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr[c.NUX_BOARD_FOLLOW_P2P.ordinal()] = 81;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            iArr[c.INDIRECT_DOMAIN_PIN.ordinal()] = 82;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            iArr[c.PIXIE_PINS_FOR_BOARD.ordinal()] = 83;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            iArr[c.SCREENSHOT_SAVE.ordinal()] = 84;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            iArr[c.TEXT_EMBEDDINGS.ordinal()] = 85;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            iArr[c.FRESH_TEXT_EMBEDDINGS.ordinal()] = 86;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            iArr[c.PREFETCH_LOAD.ordinal()] = 87;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            iArr[c.DIVERSE_TOPICS.ordinal()] = 88;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            iArr[c.QUIZ_RESULTS.ordinal()] = 89;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_TOPICS.ordinal()] = 90;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_TOPICS_THIRD_PARTY.ordinal()] = 91;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_GEMINI.ordinal()] = 92;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_GEMINI_V5.ordinal()] = 93;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_SHOP_STYLE_STL.ordinal()] = 94;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_GRAPHSAGE.ordinal()] = 95;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_REPIN_BOARD.ordinal()] = 96;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_CLICKTHROUGH.ordinal()] = 97;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_USER_ACTIVITY.ordinal()] = 98;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_CREATOR_BASELINE.ordinal()] = 99;
        } catch (NoSuchFieldError unused99) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_RECOMMENDED_TOPICS.ordinal()] = 100;
        } catch (NoSuchFieldError unused100) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_RECOMMENDED_TOPICS_STORY_PIN.ordinal()] = 101;
        } catch (NoSuchFieldError unused101) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_RECOMMENDED_TOPICS_DIVERSITY.ordinal()] = 102;
        } catch (NoSuchFieldError unused102) {
        }
        try {
            iArr[c.PIXIE_RECENT_ACTION.ordinal()] = 103;
        } catch (NoSuchFieldError unused103) {
        }
        try {
            iArr[c.NATIVE_CONTENT_TOPICS.ordinal()] = 104;
        } catch (NoSuchFieldError unused104) {
        }
        try {
            iArr[c.BUBBLE_OPEN_TOPICS.ordinal()] = 105;
        } catch (NoSuchFieldError unused105) {
        }
        try {
            iArr[c.TOPIC_BEST_PINS_V2.ordinal()] = 106;
        } catch (NoSuchFieldError unused106) {
        }
        try {
            iArr[c.DAILY_BEST_PINS.ordinal()] = 107;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            iArr[c.TOPIC_BEST_PINS_V3.ordinal()] = 108;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            iArr[c.TOPIC_BEST_STORY_PINS.ordinal()] = 109;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            iArr[c.REC_SEQ_STORY_PIN_CLS.ordinal()] = 110;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            iArr[c.DARK_PROMOTED_PIN.ordinal()] = 111;
        } catch (NoSuchFieldError unused111) {
        }
        try {
            iArr[c.POST_EXPLORE_TOPICS.ordinal()] = 112;
        } catch (NoSuchFieldError unused112) {
        }
        try {
            iArr[c.GRAPHSAGE_EMBEDDINGS.ordinal()] = 113;
        } catch (NoSuchFieldError unused113) {
        }
        try {
            iArr[c.DEMOGRAPHIC_PFY.ordinal()] = 114;
        } catch (NoSuchFieldError unused114) {
        }
        try {
            iArr[c.SHOPPING_STL.ordinal()] = 115;
        } catch (NoSuchFieldError unused115) {
        }
        try {
            iArr[c.UNAUTH_PIXIE_P2B.ordinal()] = 116;
        } catch (NoSuchFieldError unused116) {
        }
        try {
            iArr[c.UNAUTH_PIXIE_P2P.ordinal()] = 117;
        } catch (NoSuchFieldError unused117) {
        }
        try {
            iArr[c.VIDEO_EMBEDDINGS.ordinal()] = 118;
        } catch (NoSuchFieldError unused118) {
        }
        try {
            iArr[c.VIDEO_EMBEDDINGS_GEMINI_V5.ordinal()] = 119;
        } catch (NoSuchFieldError unused119) {
        }
        try {
            iArr[c.GEMINI_V5_EMBEDDINGS_STATIC.ordinal()] = 120;
        } catch (NoSuchFieldError unused120) {
        }
        try {
            iArr[c.GEMINI_V5_EMBEDDINGS_FRESH.ordinal()] = 121;
        } catch (NoSuchFieldError unused121) {
        }
        try {
            iArr[c.GEMINI_V5_EMBEDDINGS_REALTIME.ordinal()] = 122;
        } catch (NoSuchFieldError unused122) {
        }
        try {
            iArr[c.GEMINI_V5_EMBEDDINGS_STORYPIN.ordinal()] = 123;
        } catch (NoSuchFieldError unused123) {
        }
        try {
            iArr[c.CURATED_VIDEO_INTEREST.ordinal()] = 124;
        } catch (NoSuchFieldError unused124) {
        }
        try {
            iArr[c.GRAPHSAGE_PRODUCT_PINS_LONGER_HISTORY.ordinal()] = 125;
        } catch (NoSuchFieldError unused125) {
        }
        try {
            iArr[c.GRAPHSAGE_SHOPPABLE_INSPIRATION.ordinal()] = 126;
        } catch (NoSuchFieldError unused126) {
        }
        try {
            iArr[c.GRAPHSAGE_PRODUCT_PINS_EXPERIMENTAL.ordinal()] = 127;
        } catch (NoSuchFieldError unused127) {
        }
        try {
            iArr[c.NUX_GRAPHSAGE.ordinal()] = 128;
        } catch (NoSuchFieldError unused128) {
        }
        try {
            iArr[c.GRAPHSAGE_USER_EMBEDDINGS_TO_PRODUCT_PINS.ordinal()] = 129;
        } catch (NoSuchFieldError unused129) {
        }
        try {
            iArr[c.GRAPHSAGE_VIDEO_PINS.ordinal()] = 130;
        } catch (NoSuchFieldError unused130) {
        }
        try {
            iArr[c.RECBOOST_REPIN_BOARD.ordinal()] = 131;
        } catch (NoSuchFieldError unused131) {
        }
        try {
            iArr[c.RECBOOST_CLICKTHROUGH.ordinal()] = 132;
        } catch (NoSuchFieldError unused132) {
        }
        try {
            iArr[c.RECBOOST_USER_ACTIVITY.ordinal()] = 133;
        } catch (NoSuchFieldError unused133) {
        }
        try {
            iArr[c.RECBOOST_CREATOR_BOARDS.ordinal()] = 134;
        } catch (NoSuchFieldError unused134) {
        }
        try {
            iArr[c.RECOMMENDED_BOARDS.ordinal()] = 135;
        } catch (NoSuchFieldError unused135) {
        }
        try {
            iArr[c.RECOMMENDED_ANNOTATION_BOARDS.ordinal()] = 136;
        } catch (NoSuchFieldError unused136) {
        }
        try {
            iArr[c.RECOMMENDED_GRAPHSAGE_BOARDS.ordinal()] = 137;
        } catch (NoSuchFieldError unused137) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_RECOMMENDED_GRAPHSAGE_BOARDS.ordinal()] = 138;
        } catch (NoSuchFieldError unused138) {
        }
        try {
            iArr[c.RECOMMENDED_CREATOR_BOARDS.ordinal()] = 139;
        } catch (NoSuchFieldError unused139) {
        }
        try {
            iArr[c.ANNOTATION_REC_CREATOR_BOARDS.ordinal()] = 140;
        } catch (NoSuchFieldError unused140) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_MANUAL_INTERESTS_VIDEO.ordinal()] = 141;
        } catch (NoSuchFieldError unused141) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_INTERESTS_VIDEO.ordinal()] = 142;
        } catch (NoSuchFieldError unused142) {
        }
        try {
            iArr[c.INTENTIONAL_DISTRIBUTION_INTERESTS_STORY_PIN.ordinal()] = 143;
        } catch (NoSuchFieldError unused143) {
        }
        try {
            iArr[c.REPIN_CREATOR_BOARD.ordinal()] = 144;
        } catch (NoSuchFieldError unused144) {
        }
        try {
            iArr[c.GRAPHSAGE_USER_EMBEDDINGS_TO_CREATOR_PINS.ordinal()] = 145;
        } catch (NoSuchFieldError unused145) {
        }
        try {
            iArr[c.GRAPHSAGE_USER_EMBEDDINGS_TO_CREATOR_PINS_REALTIME.ordinal()] = 146;
        } catch (NoSuchFieldError unused146) {
        }
        try {
            iArr[c.FRESH_SIG_FROM_BOARD.ordinal()] = 147;
        } catch (NoSuchFieldError unused147) {
        }
        try {
            iArr[c.RECENT_ENGAGED_CREATOR_BOARDS.ordinal()] = 148;
        } catch (NoSuchFieldError unused148) {
        }
        try {
            iArr[c.RECENT_ENGAGED_BOARDS.ordinal()] = 149;
        } catch (NoSuchFieldError unused149) {
        }
        try {
            iArr[c.SHOPPING_CREATOR_REALTIME.ordinal()] = 150;
        } catch (NoSuchFieldError unused150) {
        }
        try {
            iArr[c.GRAPHSAGE_BASED_RECOMMENDED_CREATOR_BOARDS.ordinal()] = 151;
        } catch (NoSuchFieldError unused151) {
        }
        try {
            iArr[c.PIXIE_P2P.ordinal()] = 152;
        } catch (NoSuchFieldError unused152) {
        }
        try {
            iArr[c.NEW_USE_CASE_PINS.ordinal()] = 153;
        } catch (NoSuchFieldError unused153) {
        }
        try {
            iArr[c.RECBOOST_NEW_USE_CASES.ordinal()] = 154;
        } catch (NoSuchFieldError unused154) {
        }
        try {
            iArr[c.SEARCHSAGE_PFY.ordinal()] = 155;
        } catch (NoSuchFieldError unused155) {
        }
        try {
            iArr[c.SEARCHSAGE_SHOPPING_PFY.ordinal()] = 156;
        } catch (NoSuchFieldError unused156) {
        }
        try {
            iArr[c.INTEREST_EXPLORATION.ordinal()] = 157;
        } catch (NoSuchFieldError unused157) {
        }
        try {
            iArr[c.INTEREST_EXPLORATION_TRENDY_QUERIES.ordinal()] = 158;
        } catch (NoSuchFieldError unused158) {
        }
        try {
            iArr[c.INTEREST_EXPLORATION_RELATED_INTERESTS.ordinal()] = 159;
        } catch (NoSuchFieldError unused159) {
        }
        try {
            iArr[c.RECBOOST_INTERESTS.ordinal()] = 160;
        } catch (NoSuchFieldError unused160) {
        }
        try {
            iArr[c.HF_STORY_SHOPPING_RETARGETING.ordinal()] = 161;
        } catch (NoSuchFieldError unused161) {
        }
        try {
            iArr[c.RECBOOST_STORY_PINS.ordinal()] = 162;
        } catch (NoSuchFieldError unused162) {
        }
        try {
            iArr[c.RECBOOST_STORY_BOARDS.ordinal()] = 163;
        } catch (NoSuchFieldError unused163) {
        }
        try {
            iArr[c.PINNABILITY_EMBEDDINGS.ordinal()] = 164;
        } catch (NoSuchFieldError unused164) {
        }
        try {
            iArr[c.PINNABILITY_FRESH_STORY_EMBEDDINGS.ordinal()] = 165;
        } catch (NoSuchFieldError unused165) {
        }
        try {
            iArr[c.PINNABILITY_STORY_EMBEDDINGS.ordinal()] = 166;
        } catch (NoSuchFieldError unused166) {
        }
        try {
            iArr[c.PINNABILITY_PRODUCT_PIN_EMBEDDINGS.ordinal()] = 167;
        } catch (NoSuchFieldError unused167) {
        }
        try {
            iArr[c.PINNABILITY_FRESH_PRODUCT_PIN_EMBEDDINGS.ordinal()] = 168;
        } catch (NoSuchFieldError unused168) {
        }
        try {
            iArr[c.PINNABILITY_TML_PRODUCT_PIN_EMBEDDINGS.ordinal()] = 169;
        } catch (NoSuchFieldError unused169) {
        }
        try {
            iArr[c.PINNABILITY_MULTI_EMBEDDINGS.ordinal()] = 170;
        } catch (NoSuchFieldError unused170) {
        }
        try {
            iArr[c.PINNABILITY_PLP_EMBEDDINGS.ordinal()] = 171;
        } catch (NoSuchFieldError unused171) {
        }
        try {
            iArr[c.PINNABILITY_CONDITIONAL_BOARD_EMBEDDINGS.ordinal()] = 172;
        } catch (NoSuchFieldError unused172) {
        }
        try {
            iArr[c.PINNABILITY_OFFSITE_TML_PRODUCT_PIN_EMBEDDINGS.ordinal()] = 173;
        } catch (NoSuchFieldError unused173) {
        }
        try {
            iArr[c.PINNABILITY_FRESH_EMBEDDINGS.ordinal()] = 174;
        } catch (NoSuchFieldError unused174) {
        }
        try {
            iArr[c.EXPLORATION_STORY_PINS.ordinal()] = 175;
        } catch (NoSuchFieldError unused175) {
        }
        try {
            iArr[c.EXPLORATION_STORY_PINS_BASELINE.ordinal()] = 176;
        } catch (NoSuchFieldError unused176) {
        }
        try {
            iArr[c.EXPLOITATION_STORY_PINS.ordinal()] = 177;
        } catch (NoSuchFieldError unused177) {
        }
        try {
            iArr[c.ANNOTATION_REC_CREATOR_STORY_PINS.ordinal()] = 178;
        } catch (NoSuchFieldError unused178) {
        }
        try {
            iArr[c.GRAPHSAGE_MULTI_PINS_TO_STORY_PINS.ordinal()] = 179;
        } catch (NoSuchFieldError unused179) {
        }
        try {
            iArr[c.IDEASTREAM_GRAPHSAGE_STORY_PINS.ordinal()] = 180;
        } catch (NoSuchFieldError unused180) {
        }
        try {
            iArr[c.HF_EDUCATION_PIN_INSERTION.ordinal()] = 181;
        } catch (NoSuchFieldError unused181) {
        }
        try {
            iArr[c.RP_EDUCATION_PIN_INSERTION.ordinal()] = 182;
        } catch (NoSuchFieldError unused182) {
        }
        try {
            iArr[c.USER_TO_CREATOR_STORY_PINS.ordinal()] = 183;
        } catch (NoSuchFieldError unused183) {
        }
        try {
            iArr[c.USER_TO_CREATOR_STORY_PINS_ENGAGEMENT.ordinal()] = 184;
        } catch (NoSuchFieldError unused184) {
        }
        try {
            iArr[c.COENGAGEMENT_STORY_PINS.ordinal()] = 185;
        } catch (NoSuchFieldError unused185) {
        }
        try {
            iArr[c.ANNOTATION_STORY_PINS.ordinal()] = 186;
        } catch (NoSuchFieldError unused186) {
        }
        try {
            iArr[c.DISCOVER_STREAM_DEMOGRAPHIC_FALLBACK.ordinal()] = 187;
        } catch (NoSuchFieldError unused187) {
        }
        try {
            iArr[c.DISCOVER_STREAM_CELEBRITY.ordinal()] = 188;
        } catch (NoSuchFieldError unused188) {
        }
        try {
            iArr[c.GRAPHSAGE_SHOPIFY_VMP_PRODUCT_PINS.ordinal()] = 189;
        } catch (NoSuchFieldError unused189) {
        }
        try {
            iArr[c.CREATOR_BEST_IDEA_PINS.ordinal()] = 190;
        } catch (NoSuchFieldError unused190) {
        }
        try {
            iArr[c.INTEREST_BEST_IDEA_PINS.ordinal()] = 191;
        } catch (NoSuchFieldError unused191) {
        }
        try {
            iArr[c.NAVBOOST_STORY_PINS.ordinal()] = 192;
        } catch (NoSuchFieldError unused192) {
        }
        try {
            iArr[c.SHOPPING_DISTRIBUTION_PINS.ordinal()] = 193;
        } catch (NoSuchFieldError unused193) {
        }
        try {
            iArr[c.WATCH_TAB_EHQ_STORIES.ordinal()] = 194;
        } catch (NoSuchFieldError unused194) {
        }
        try {
            iArr[c.NOTIF_LEARNED_RETRIEVAL.ordinal()] = 195;
        } catch (NoSuchFieldError unused195) {
        }
        try {
            iArr[c.NOTIF_DIRECT_INJECT.ordinal()] = 196;
        } catch (NoSuchFieldError unused196) {
        }
        try {
            iArr[c.LANDING_PAGE_PIN_RECOMMENDATIONS.ordinal()] = 197;
        } catch (NoSuchFieldError unused197) {
        }
        try {
            iArr[c.PINNERSAGE_LEARNED_EMBEDDINGS.ordinal()] = 198;
        } catch (NoSuchFieldError unused198) {
        }
        try {
            iArr[c.RECGPT_CG_USER_TO_PINS.ordinal()] = 199;
        } catch (NoSuchFieldError unused199) {
        }
        try {
            iArr[c.TOPIC_FEED.ordinal()] = 200;
        } catch (NoSuchFieldError unused200) {
        }
        try {
            iArr[c.ORGANIC_COENGAGEMENT.ordinal()] = 201;
        } catch (NoSuchFieldError unused201) {
        }
        try {
            iArr[c.RECBOOST_SHOPPING.ordinal()] = 202;
        } catch (NoSuchFieldError unused202) {
        }
        try {
            iArr[c.USER_OFFSITE_BRAND.ordinal()] = 203;
        } catch (NoSuchFieldError unused203) {
        }
        try {
            iArr[c.USER_OFFSITE_MERCHANT.ordinal()] = 204;
        } catch (NoSuchFieldError unused204) {
        }
        try {
            iArr[c.USER_OFFSITE_SEARCH_QUERIES.ordinal()] = 205;
        } catch (NoSuchFieldError unused205) {
        }
        try {
            iArr[c.USER_OFFSITE_PSV2_IPFY.ordinal()] = 206;
        } catch (NoSuchFieldError unused206) {
        }
        try {
            iArr[c.USER_OFFSITE_PSV2_RECBOOST.ordinal()] = 207;
        } catch (NoSuchFieldError unused207) {
        }
        try {
            iArr[c.USER_OFFSITE_PSV2_COENGAGEMENT.ordinal()] = 208;
        } catch (NoSuchFieldError unused208) {
        }
        try {
            iArr[c.HF_LAST_CHUNK_CACHE.ordinal()] = 209;
        } catch (NoSuchFieldError unused209) {
        }
        try {
            iArr[c.RTC_IMPROVEMENT_TEST_1.ordinal()] = 210;
        } catch (NoSuchFieldError unused210) {
        }
        try {
            iArr[c.RTC_IMPROVEMENT_TEST_2.ordinal()] = 211;
        } catch (NoSuchFieldError unused211) {
        }
        try {
            iArr[c.RTC_IMPROVEMENT_TEST_3.ordinal()] = 212;
        } catch (NoSuchFieldError unused212) {
        }
        try {
            iArr[c.RTC_IMPROVEMENT_TEST_4.ordinal()] = 213;
        } catch (NoSuchFieldError unused213) {
        }
        try {
            iArr[c.RTC_IMPROVEMENT_TEST_5.ordinal()] = 214;
        } catch (NoSuchFieldError unused214) {
        }
        try {
            iArr[c.RTC_IMPROVEMENT_TEST_6.ordinal()] = 215;
        } catch (NoSuchFieldError unused215) {
        }
        try {
            iArr[c.RTC_IMPROVEMENT_TEST_7.ordinal()] = 216;
        } catch (NoSuchFieldError unused216) {
        }
        try {
            iArr[c.RTC_IMPROVEMENT_TEST_8.ordinal()] = 217;
        } catch (NoSuchFieldError unused217) {
        }
        try {
            iArr[c.RTC_IMPROVEMENT_TEST_9.ordinal()] = 218;
        } catch (NoSuchFieldError unused218) {
        }
        try {
            iArr[c.RTC_IMPROVEMENT_TEST_10.ordinal()] = 219;
        } catch (NoSuchFieldError unused219) {
        }
        try {
            iArr[c.RTC_IMPROVEMENT_TEST_11.ordinal()] = 220;
        } catch (NoSuchFieldError unused220) {
        }
        try {
            iArr[c.RTC_IMPROVEMENT_TEST_12.ordinal()] = 221;
        } catch (NoSuchFieldError unused221) {
        }
        try {
            iArr[c.RTC_IMPROVEMENT_TEST_13.ordinal()] = 222;
        } catch (NoSuchFieldError unused222) {
        }
        try {
            iArr[c.RTC_IMPROVEMENT_TEST_14.ordinal()] = 223;
        } catch (NoSuchFieldError unused223) {
        }
        try {
            iArr[c.RTC_IMPROVEMENT_TEST_15.ordinal()] = 224;
        } catch (NoSuchFieldError unused224) {
        }
        try {
            iArr[c.RTC_BLENDER_TEST.ordinal()] = 225;
        } catch (NoSuchFieldError unused225) {
        }
        try {
            iArr[c.P2P_COMMERCE.ordinal()] = 226;
        } catch (NoSuchFieldError unused226) {
        }
        try {
            iArr[c.P2P.ordinal()] = 227;
        } catch (NoSuchFieldError unused227) {
        }
        try {
            iArr[c.LENS_CAMERA_VISUALLY_SIMILAR.ordinal()] = 228;
        } catch (NoSuchFieldError unused228) {
        }
        try {
            iArr[c.RECENT_FOLLOWED_INTEREST.ordinal()] = 229;
        } catch (NoSuchFieldError unused229) {
        }
        try {
            iArr[c.RECENT_FOLLOWED_BOARD.ordinal()] = 230;
        } catch (NoSuchFieldError unused230) {
        }
        try {
            iArr[c.GRAPHSAGE_SHOPIFY_VMP_MERCHANT_ACTIVATION_PRODUCT_PINS.ordinal()] = 231;
        } catch (NoSuchFieldError unused231) {
        }
        try {
            iArr[c.FOLLOWED_INTEREST_SEO_BESPIN_EXPORATION.ordinal()] = 232;
        } catch (NoSuchFieldError unused232) {
        }
        try {
            iArr[c.XPIXIE_TO_PRODUCT_PINS.ordinal()] = 233;
        } catch (NoSuchFieldError unused233) {
        }
        try {
            iArr[c.SHOPPING_RECENTLY_VIEWED_MODULE_PINS.ordinal()] = 234;
        } catch (NoSuchFieldError unused234) {
        }
        try {
            iArr[c.SHOPPING_RECENTLY_SAVED_MODULE_PINS.ordinal()] = 235;
        } catch (NoSuchFieldError unused235) {
        }
        try {
            iArr[c.SHOPPING_BEST_SELLING_RECOMMENDED_BRAND_MODULE_PINS.ordinal()] = 236;
        } catch (NoSuchFieldError unused236) {
        }
        try {
            iArr[c.SHOPPING_SHOP_THE_BOARD_MODULE_PINS.ordinal()] = 237;
        } catch (NoSuchFieldError unused237) {
        }
        try {
            iArr[c.SHOPPING_ON_SALE_MODULE_PINS.ordinal()] = 238;
        } catch (NoSuchFieldError unused238) {
        }
        try {
            iArr[c.SHOPPING_RECONSIDERATION_MODULE_PINS.ordinal()] = 239;
        } catch (NoSuchFieldError unused239) {
        }
        try {
            iArr[c.SHOPPING_PRODUCT_CATEGORY_BASED_MODULE_PINS.ordinal()] = 240;
        } catch (NoSuchFieldError unused240) {
        }
        try {
            iArr[c.SHOPPING_PRODUCT_CATEGORY_ON_SALE_MODULE_PINS.ordinal()] = 241;
        } catch (NoSuchFieldError unused241) {
        }
        try {
            iArr[c.SHOPPING_BEST_SELLING_PRODUCT_CATEGORY_MODULE_PINS.ordinal()] = 242;
        } catch (NoSuchFieldError unused242) {
        }
        try {
            iArr[c.SHOPPING_SHOP_SEARCH_MODULE_PINS.ordinal()] = 243;
        } catch (NoSuchFieldError unused243) {
        }
        try {
            iArr[c.RECENTLY_VIEWED_ORGANIC_MODULE_PINS.ordinal()] = 244;
        } catch (NoSuchFieldError unused244) {
        }
        try {
            iArr[c.RECENTLY_SAVED_ORGANIC_MODULE_PINS.ordinal()] = 245;
        } catch (NoSuchFieldError unused245) {
        }
        f22824a = iArr;
    }
}
