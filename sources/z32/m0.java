package z32;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ m0[] $VALUES;

    @NotNull
    public static final k0 Companion;
    public static final m0 NONE = new m0("NONE", 0);
    public static final m0 CAROUSEL = new m0("CAROUSEL", 1);
    public static final m0 SEARCH_TYPING = new m0("SEARCH_TYPING", 2);
    public static final m0 FOLLOW_SINGLE_ITEM = new m0("FOLLOW_SINGLE_ITEM", 3);
    public static final m0 SNACKBOX = new m0("SNACKBOX", 4);
    public static final m0 RELATED_SEARCHES_PILLS = new m0("RELATED_SEARCHES_PILLS", 5);
    public static final m0 RELATED_SEARCHES_THREE_SQUARES = new m0("RELATED_SEARCHES_THREE_SQUARES", 6);
    public static final m0 SEARCH_SURVEY = new m0("SEARCH_SURVEY", 7);
    public static final m0 RELATED_SEARCHES_PILLS_ONE_COLUMN = new m0("RELATED_SEARCHES_PILLS_ONE_COLUMN", 8);
    public static final m0 VERTICAL_FLEXY_STACK = new m0("VERTICAL_FLEXY_STACK", 9);
    public static final m0 QUIZ = new m0("QUIZ", 10);
    public static final m0 THREE_COLUMN = new m0("THREE_COLUMN", 11);
    public static final m0 SIMPLE_HEADER = new m0("SIMPLE_HEADER", 12);
    public static final m0 SIMPLE_FOOTER = new m0("SIMPLE_FOOTER", 13);
    public static final m0 DINNER_TIME = new m0("DINNER_TIME", 14);
    public static final m0 TOPIC_GAME = new m0("TOPIC_GAME", 15);
    public static final m0 TOPIC_RENUX = new m0("TOPIC_RENUX", 16);
    public static final m0 PIN_GAME = new m0("PIN_GAME", 17);
    public static final m0 VARIABLE_RENUX_ONE_COL = new m0("VARIABLE_RENUX_ONE_COL", 18);
    public static final m0 VARIABLE_RENUX_ONE_COL_IMG = new m0("VARIABLE_RENUX_ONE_COL_IMG", 19);
    public static final m0 VARIABLE_RENUX_TWO_COL = new m0("VARIABLE_RENUX_TWO_COL", 20);
    public static final m0 VARIABLE_RENUX_TWO_COL_MED = new m0("VARIABLE_RENUX_TWO_COL_MED", 21);
    public static final m0 VARIABLE_RENUX_TWO_COL_SMALL = new m0("VARIABLE_RENUX_TWO_COL_SMALL", 22);
    public static final m0 VARIABLE_RENUX_TWO_COL_PROMPT = new m0("VARIABLE_RENUX_TWO_COL_PROMPT", 23);
    public static final m0 VARIABLE_RENUX_TWO_COL_PINS = new m0("VARIABLE_RENUX_TWO_COL_PINS", 24);
    public static final m0 VARIABLE_RENUX_TWO_COL_FLYING_PINS = new m0("VARIABLE_RENUX_TWO_COL_FLYING_PINS", 25);
    public static final m0 VARIABLE_RENUX_TWO_COL_MULTI_ENTRY = new m0("VARIABLE_RENUX_TWO_COL_MULTI_ENTRY", 26);
    public static final m0 VARIABLE_RENUX_TWO_COL_VIDEO = new m0("VARIABLE_RENUX_TWO_COL_VIDEO", 27);
    public static final m0 PHOTO_GALLERY_RECOMMENDATION = new m0("PHOTO_GALLERY_RECOMMENDATION", 28);
    public static final m0 SEARCH_CHUNKS_ROW = new m0("SEARCH_CHUNKS_ROW", 29);
    public static final m0 SEARCH_TILES_GRID = new m0("SEARCH_TILES_GRID", 30);
    public static final m0 SEARCH_PROMPT = new m0("SEARCH_PROMPT", 31);
    public static final m0 PHOTO_GALLERY_TOPIC_PICKER = new m0("PHOTO_GALLERY_TOPIC_PICKER", 32);
    public static final m0 RELATED_TRIED_IT_FEED = new m0("RELATED_TRIED_IT_FEED", 33);
    public static final m0 PHOTO_GALLERY_EVALUATION = new m0("PHOTO_GALLERY_EVALUATION", 34);
    public static final m0 EXPLORE_CREATOR_CAROUSEL = new m0("EXPLORE_CREATOR_CAROUSEL", 35);
    public static final m0 CREATOR_FOLLOW_PROMPT_ONE_COL = new m0("CREATOR_FOLLOW_PROMPT_ONE_COL", 36);
    public static final m0 CREATOR_FOLLOW_PROMPT_TWO_COL = new m0("CREATOR_FOLLOW_PROMPT_TWO_COL", 37);
    public static final m0 PIN_ARTICLE = new m0("PIN_ARTICLE", 38);
    public static final m0 PIN_PREVIEW = new m0("PIN_PREVIEW", 39);
    public static final m0 LANDING_PAGE = new m0("LANDING_PAGE", 40);
    public static final m0 NEW_IDEAS_PREVIEW_DETAILED = new m0("NEW_IDEAS_PREVIEW_DETAILED", 41);
    public static final m0 NEW_IDEAS_PREVIEW_FOOTER = new m0("NEW_IDEAS_PREVIEW_FOOTER", 42);
    public static final m0 SECTION_TITLE_RECOMMENDATIONS = new m0("SECTION_TITLE_RECOMMENDATIONS", 43);
    public static final m0 BANNER = new m0("BANNER", 44);
    public static final m0 USE_CASE = new m0("USE_CASE", 45);
    public static final m0 IDEAS_CARD = new m0("IDEAS_CARD", 46);
    public static final m0 SINGLE_PIN_PROMOTE = new m0("SINGLE_PIN_PROMOTE", 47);
    public static final m0 MULTIPLE_PINS_PROMOTE = new m0("MULTIPLE_PINS_PROMOTE", 48);
    public static final m0 SEASONAL_UPSELL = new m0("SEASONAL_UPSELL", 49);
    public static final m0 REDISCOVERY = new m0("REDISCOVERY", 50);
    public static final m0 APP_UPSELL = new m0("APP_UPSELL", 51);
    public static final m0 HOME_FEED_EDUCATION_STORY = new m0("HOME_FEED_EDUCATION_STORY", 52);
    public static final m0 USER_PINS = new m0("USER_PINS", 53);
    public static final m0 UPSELL_SINGLE_ITEM = new m0("UPSELL_SINGLE_ITEM", 54);
    public static final m0 ITEM_GRID = new m0("ITEM_GRID", 55);
    public static final m0 UPSELL_PACKAGED_SHOPPING_IDEA = new m0("UPSELL_PACKAGED_SHOPPING_IDEA", 56);
    public static final m0 RELATED_MODULE_COLLAGE = new m0("RELATED_MODULE_COLLAGE", 57);
    public static final m0 RELATED_MODULE_CARD = new m0("RELATED_MODULE_CARD", 58);
    public static final m0 MULTI_PRODUCTS_COLLAGE = new m0("MULTI_PRODUCTS_COLLAGE", 59);
    public static final m0 MULTI_PRODUCTS_CARD = new m0("MULTI_PRODUCTS_CARD", 60);
    public static final m0 STL_SINGLE_COLUMN_GRID = new m0("STL_SINGLE_COLUMN_GRID", 61);
    public static final m0 MULTI_BRANDS_COLLAGE = new m0("MULTI_BRANDS_COLLAGE", 62);
    public static final m0 BLOCK_PATTERN = new m0("BLOCK_PATTERN", 63);
    public static final m0 SIMPLE_ACTION = new m0("SIMPLE_ACTION", 64);
    public static final m0 FEED_CARD = new m0("FEED_CARD", 65);
    public static final m0 TODAY_ARTICLE_SECTION = new m0("TODAY_ARTICLE_SECTION", 66);
    public static final m0 SHOPPING_SQUARE_GRID = new m0("SHOPPING_SQUARE_GRID", 67);
    public static final m0 TODAY_ARTICLE = new m0("TODAY_ARTICLE", 68);
    public static final m0 UPSELL_TODAY_TAB = new m0("UPSELL_TODAY_TAB", 69);
    public static final m0 EDUCATION_BANNER = new m0("EDUCATION_BANNER", 70);
    public static final m0 PIN_STACK = new m0("PIN_STACK", 71);
    public static final m0 RELATED_MODULE_CAROUSEL = new m0("RELATED_MODULE_CAROUSEL", 72);
    public static final m0 RELATED_MODULE_CAPPED_GRID = new m0("RELATED_MODULE_CAPPED_GRID", 73);
    public static final m0 CREATORS_INTERSTITIAL = new m0("CREATORS_INTERSTITIAL", 74);
    public static final m0 CREATOR_BUBBLE_UPSELL = new m0("CREATOR_BUBBLE_UPSELL", 75);
    public static final m0 BOARD_SECTION_TEMPLATES = new m0("BOARD_SECTION_TEMPLATES", 76);
    public static final m0 CREATOR_BUBBLE_HF_PLACEHOLDER = new m0("CREATOR_BUBBLE_HF_PLACEHOLDER", 77);
    public static final m0 BOARD_ORGANIZE_SECTION_GROUPINGS = new m0("BOARD_ORGANIZE_SECTION_GROUPINGS", 78);
    public static final m0 BOARD_ORGANIZE_PINS_PREVIEW = new m0("BOARD_ORGANIZE_PINS_PREVIEW", 79);
    public static final m0 UPSELL_PACKAGE_SQUARE = new m0("UPSELL_PACKAGE_SQUARE", 80);
    public static final m0 TODAY_TAB_ARTICLE_PORTAL = new m0("TODAY_TAB_ARTICLE_PORTAL", 81);
    public static final m0 TODAY_TAB_ARTICLE_PORTAL_CARD = new m0("TODAY_TAB_ARTICLE_PORTAL_CARD", 82);
    public static final m0 DISCOVER_CREATORS_PORTAL = new m0("DISCOVER_CREATORS_PORTAL", 83);
    public static final m0 SEPARATOR = new m0("SEPARATOR", 84);
    public static final m0 PINS_PORTAL = new m0("PINS_PORTAL", 85);
    public static final m0 CREATORS_PORTAL = new m0("CREATORS_PORTAL", 86);
    public static final m0 STRUCTURED_FEED_HEADER = new m0("STRUCTURED_FEED_HEADER", 87);
    public static final m0 STRUCTURED_FEED_FOOTER = new m0("STRUCTURED_FEED_FOOTER", 88);
    public static final m0 STRUCTURED_FEED_CAROUSEL = new m0("STRUCTURED_FEED_CAROUSEL", 89);
    public static final m0 STRUCTURED_FEED_GRID_SECTION = new m0("STRUCTURED_FEED_GRID_SECTION", 90);
    public static final m0 STRUCTURED_FEED_SINGLE_IMAGE_UPSELL = new m0("STRUCTURED_FEED_SINGLE_IMAGE_UPSELL", 91);
    public static final m0 RECENTLY_ENGAGED_PINS_PREVIEW = new m0("RECENTLY_ENGAGED_PINS_PREVIEW", 92);
    public static final m0 PREVIEW_BANNER = new m0("PREVIEW_BANNER", 93);
    public static final m0 COMMUNITY_TAKES = new m0("COMMUNITY_TAKES", 94);
    public static final m0 TRENDING_CALLS_TO_CREATE = new m0("TRENDING_CALLS_TO_CREATE", 95);
    public static final m0 FEATURED_CALLS_TO_CREATE = new m0("FEATURED_CALLS_TO_CREATE", 96);
    public static final m0 IDEA_PIN_CREATION_UPSELL = new m0("IDEA_PIN_CREATION_UPSELL", 97);
    public static final m0 COMMUNITY_CREATION_MARKETING = new m0("COMMUNITY_CREATION_MARKETING", 98);
    public static final m0 ALL_CALLS_TO_CREATE = new m0("ALL_CALLS_TO_CREATE", 99);
    public static final m0 STRUCTURED_FEED_HERO = new m0("STRUCTURED_FEED_HERO", 100);
    public static final m0 WATCH_TAB_STREAM_PROMO_IDEA_PIN = new m0("WATCH_TAB_STREAM_PROMO_IDEA_PIN", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE);
    public static final m0 IDEA_PIN_STICKER_FEED_DRAWER_FEATURED = new m0("IDEA_PIN_STICKER_FEED_DRAWER_FEATURED", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE);
    public static final m0 IDEA_PIN_STICKER_FEED_DRAWER_TOP_PICKS = new m0("IDEA_PIN_STICKER_FEED_DRAWER_TOP_PICKS", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE);
    public static final m0 IDEA_PIN_STICKER_FEED_DRAWER_INTERACTIVE = new m0("IDEA_PIN_STICKER_FEED_DRAWER_INTERACTIVE", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE);
    public static final m0 IDEA_PIN_STICKER_FEED_DRAWER_CATEGORY = new m0("IDEA_PIN_STICKER_FEED_DRAWER_CATEGORY", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE);
    public static final m0 IDEA_PIN_STICKER_FEED_DRAWER_EVERGREEN = new m0("IDEA_PIN_STICKER_FEED_DRAWER_EVERGREEN", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID);
    public static final m0 RELATED_PIVOT_CREATOR_MODULE = new m0("RELATED_PIVOT_CREATOR_MODULE", RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER);
    public static final m0 IDEA_PIN_STICKER_SEARCH_RECENTLY_USED = new m0("IDEA_PIN_STICKER_SEARCH_RECENTLY_USED", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE);
    public static final m0 WATCH_TAB_STREAM_IDEA_PIN = new m0("WATCH_TAB_STREAM_IDEA_PIN", RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL);
    public static final m0 RELATED_PIVOT_MODULE = new m0("RELATED_PIVOT_MODULE", RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL);
    public static final m0 CREATOR_BUBBLE_CTC_CHALLENGE_HEADER = new m0("CREATOR_BUBBLE_CTC_CHALLENGE_HEADER", RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE);
    public static final m0 CONTENT_BUNDLE = new m0("CONTENT_BUNDLE", RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER);
    public static final m0 IDEA_PIN_AUDIO_FEED_FEATURED_PLAYLISTS = new m0("IDEA_PIN_AUDIO_FEED_FEATURED_PLAYLISTS", RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL);
    public static final m0 IDEA_PIN_AUDIO_FEED_FEATURED_MOODS = new m0("IDEA_PIN_AUDIO_FEED_FEATURED_MOODS", RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER);
    public static final m0 IDEA_PIN_AUDIO_FEED_FEATURED_GENRES = new m0("IDEA_PIN_AUDIO_FEED_FEATURED_GENRES", RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE);
    public static final m0 YOUR_SHOP_CARD_GRID = new m0("YOUR_SHOP_CARD_GRID", RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW);
    public static final m0 YOUR_SHOP_CARD_COVER_AND_PREVIEW = new m0("YOUR_SHOP_CARD_COVER_AND_PREVIEW", RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN);
    public static final m0 YOUR_SHOP_COVER_AND_PREVIEW = new m0("YOUR_SHOP_COVER_AND_PREVIEW", RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL);
    public static final m0 IDEA_PIN_AUDIO_SEARCH_ARTIST_PREVIEW = new m0("IDEA_PIN_AUDIO_SEARCH_ARTIST_PREVIEW", RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL);
    public static final m0 YOUR_SHOP_ANCHOR_PRODUCT = new m0("YOUR_SHOP_ANCHOR_PRODUCT", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
    public static final m0 YOUR_SHOP_MERCHANT_UPSELL = new m0("YOUR_SHOP_MERCHANT_UPSELL", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL);
    public static final m0 MERCHANT_PRODUCT_CAROUSEL = new m0("MERCHANT_PRODUCT_CAROUSEL", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN);
    public static final m0 YOUR_SHOP_PRODUCT_CATEGORY_CAROUSEL = new m0("YOUR_SHOP_PRODUCT_CATEGORY_CAROUSEL", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
    public static final m0 YOUR_SHOP_CATEGORY_BROWSE = new m0("YOUR_SHOP_CATEGORY_BROWSE", RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
    public static final m0 YOUR_SHOP_STELA = new m0("YOUR_SHOP_STELA", RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
    public static final m0 YOUR_SHOP_MERCHANT_CAROUSEL = new m0("YOUR_SHOP_MERCHANT_CAROUSEL", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
    public static final m0 SIMPLE_TEXT = new m0("SIMPLE_TEXT", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
    public static final m0 YOUR_SHOP_HEADER = new m0("YOUR_SHOP_HEADER", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
    public static final m0 STRUCTURED_FEED_FREEFORM = new m0("STRUCTURED_FEED_FREEFORM", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS);
    public static final m0 YOUR_SHOP_SINGLE_BRAND_DISCOVERY_MODULE = new m0("YOUR_SHOP_SINGLE_BRAND_DISCOVERY_MODULE", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN);
    public static final m0 YOUR_SHOP_BRAND_FOLLOW_BANNER = new m0("YOUR_SHOP_BRAND_FOLLOW_BANNER", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL);
    public static final m0 YOUR_SHOP_BRAND_FOLLOW = new m0("YOUR_SHOP_BRAND_FOLLOW", RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE);
    public static final m0 MORE_IDEAS_SINGLE_COLUMN_GRID = new m0("MORE_IDEAS_SINGLE_COLUMN_GRID", RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL);
    public static final m0 MORE_IDEAS_CARD = new m0("MORE_IDEAS_CARD", RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL);
    public static final m0 SEARCH_AD_ONLY_MODULE = new m0("SEARCH_AD_ONLY_MODULE", RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL);
    public static final m0 SHUFFLE_COLLAGE_MODULE = new m0("SHUFFLE_COLLAGE_MODULE", RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL);
    public static final m0 VISUAL_SHOPPING_CAROUSEL = new m0("VISUAL_SHOPPING_CAROUSEL", RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE);
    public static final m0 USER_ORGANIZE_PIN_GROUPINGS = new m0("USER_ORGANIZE_PIN_GROUPINGS", RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL);
    public static final m0 VISUAL_SHOPPING_GRID_SECTION = new m0("VISUAL_SHOPPING_GRID_SECTION", RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM);
    public static final m0 DEEPER_DIVE_TOPIC_MODULE = new m0("DEEPER_DIVE_TOPIC_MODULE", RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM);
    public static final m0 MULTI_IMAGE_UPSELL = new m0("MULTI_IMAGE_UPSELL", RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN);
    public static final m0 TAB_CAROUSEL_MODULE = new m0("TAB_CAROUSEL_MODULE", RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL);
    public static final m0 ANKET_INLINE_SURVEY = new m0("ANKET_INLINE_SURVEY", RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE);
    public static final m0 VISUAL_SHOPPING_GRID = new m0("VISUAL_SHOPPING_GRID", RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM);
    public static final m0 EXPERIENCE_CALLOUT = new m0("EXPERIENCE_CALLOUT", RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED);
    public static final m0 AUTO_ORG_ClUSTER_MODULE_CAROUSEL = new m0("AUTO_ORG_ClUSTER_MODULE_CAROUSEL", RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO);
    public static final m0 COMMENT_MODULE = new m0("COMMENT_MODULE", RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY);
    public static final m0 HYBRID_SEARCH_UPSELL = new m0("HYBRID_SEARCH_UPSELL", RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE);
    public static final m0 BOARD_ATTRIBUTION_MODULE = new m0("BOARD_ATTRIBUTION_MODULE", RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE);
    public static final m0 COLLAGE_COMPOSER_CARD = new m0("COLLAGE_COMPOSER_CARD", RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY);
    public static final m0 NEW_IDEAS_FEED = new m0("NEW_IDEAS_FEED", RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM);
    public static final m0 SEE_IT_STYLED_MODULE = new m0("SEE_IT_STYLED_MODULE", RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM);
    public static final m0 VISUAL_SHOPPING_LANDING_FILTER_CAROUSEL = new m0("VISUAL_SHOPPING_LANDING_FILTER_CAROUSEL", RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM);
    public static final m0 STRUCTURED_FEED_SINGLE_ROW = new m0("STRUCTURED_FEED_SINGLE_ROW", RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER);
    public static final m0 RELATED_QUESTIONS_CAROUSEL = new m0("RELATED_QUESTIONS_CAROUSEL", RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER);
    public static final m0 RELATED_QUESTIONS_DRILL_DOWN = new m0("RELATED_QUESTIONS_DRILL_DOWN", RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM);
    public static final m0 VISUAL_ANSWERS = new m0("VISUAL_ANSWERS", RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER);
    public static final m0 STYLE_SUMMARY_ENTRY_MODULE = new m0("STYLE_SUMMARY_ENTRY_MODULE", RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN);
    public static final m0 SHOP_YOUR_SAVES_MODULE = new m0("SHOP_YOUR_SAVES_MODULE", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER);
    public static final m0 TEXT_IMAGE_REP_WITH_PIN_CAROUSEL_DROPDOWN = new m0("TEXT_IMAGE_REP_WITH_PIN_CAROUSEL_DROPDOWN", 160);

    private static final /* synthetic */ m0[] $values() {
        return new m0[]{NONE, CAROUSEL, SEARCH_TYPING, FOLLOW_SINGLE_ITEM, SNACKBOX, RELATED_SEARCHES_PILLS, RELATED_SEARCHES_THREE_SQUARES, SEARCH_SURVEY, RELATED_SEARCHES_PILLS_ONE_COLUMN, VERTICAL_FLEXY_STACK, QUIZ, THREE_COLUMN, SIMPLE_HEADER, SIMPLE_FOOTER, DINNER_TIME, TOPIC_GAME, TOPIC_RENUX, PIN_GAME, VARIABLE_RENUX_ONE_COL, VARIABLE_RENUX_ONE_COL_IMG, VARIABLE_RENUX_TWO_COL, VARIABLE_RENUX_TWO_COL_MED, VARIABLE_RENUX_TWO_COL_SMALL, VARIABLE_RENUX_TWO_COL_PROMPT, VARIABLE_RENUX_TWO_COL_PINS, VARIABLE_RENUX_TWO_COL_FLYING_PINS, VARIABLE_RENUX_TWO_COL_MULTI_ENTRY, VARIABLE_RENUX_TWO_COL_VIDEO, PHOTO_GALLERY_RECOMMENDATION, SEARCH_CHUNKS_ROW, SEARCH_TILES_GRID, SEARCH_PROMPT, PHOTO_GALLERY_TOPIC_PICKER, RELATED_TRIED_IT_FEED, PHOTO_GALLERY_EVALUATION, EXPLORE_CREATOR_CAROUSEL, CREATOR_FOLLOW_PROMPT_ONE_COL, CREATOR_FOLLOW_PROMPT_TWO_COL, PIN_ARTICLE, PIN_PREVIEW, LANDING_PAGE, NEW_IDEAS_PREVIEW_DETAILED, NEW_IDEAS_PREVIEW_FOOTER, SECTION_TITLE_RECOMMENDATIONS, BANNER, USE_CASE, IDEAS_CARD, SINGLE_PIN_PROMOTE, MULTIPLE_PINS_PROMOTE, SEASONAL_UPSELL, REDISCOVERY, APP_UPSELL, HOME_FEED_EDUCATION_STORY, USER_PINS, UPSELL_SINGLE_ITEM, ITEM_GRID, UPSELL_PACKAGED_SHOPPING_IDEA, RELATED_MODULE_COLLAGE, RELATED_MODULE_CARD, MULTI_PRODUCTS_COLLAGE, MULTI_PRODUCTS_CARD, STL_SINGLE_COLUMN_GRID, MULTI_BRANDS_COLLAGE, BLOCK_PATTERN, SIMPLE_ACTION, FEED_CARD, TODAY_ARTICLE_SECTION, SHOPPING_SQUARE_GRID, TODAY_ARTICLE, UPSELL_TODAY_TAB, EDUCATION_BANNER, PIN_STACK, RELATED_MODULE_CAROUSEL, RELATED_MODULE_CAPPED_GRID, CREATORS_INTERSTITIAL, CREATOR_BUBBLE_UPSELL, BOARD_SECTION_TEMPLATES, CREATOR_BUBBLE_HF_PLACEHOLDER, BOARD_ORGANIZE_SECTION_GROUPINGS, BOARD_ORGANIZE_PINS_PREVIEW, UPSELL_PACKAGE_SQUARE, TODAY_TAB_ARTICLE_PORTAL, TODAY_TAB_ARTICLE_PORTAL_CARD, DISCOVER_CREATORS_PORTAL, SEPARATOR, PINS_PORTAL, CREATORS_PORTAL, STRUCTURED_FEED_HEADER, STRUCTURED_FEED_FOOTER, STRUCTURED_FEED_CAROUSEL, STRUCTURED_FEED_GRID_SECTION, STRUCTURED_FEED_SINGLE_IMAGE_UPSELL, RECENTLY_ENGAGED_PINS_PREVIEW, PREVIEW_BANNER, COMMUNITY_TAKES, TRENDING_CALLS_TO_CREATE, FEATURED_CALLS_TO_CREATE, IDEA_PIN_CREATION_UPSELL, COMMUNITY_CREATION_MARKETING, ALL_CALLS_TO_CREATE, STRUCTURED_FEED_HERO, WATCH_TAB_STREAM_PROMO_IDEA_PIN, IDEA_PIN_STICKER_FEED_DRAWER_FEATURED, IDEA_PIN_STICKER_FEED_DRAWER_TOP_PICKS, IDEA_PIN_STICKER_FEED_DRAWER_INTERACTIVE, IDEA_PIN_STICKER_FEED_DRAWER_CATEGORY, IDEA_PIN_STICKER_FEED_DRAWER_EVERGREEN, RELATED_PIVOT_CREATOR_MODULE, IDEA_PIN_STICKER_SEARCH_RECENTLY_USED, WATCH_TAB_STREAM_IDEA_PIN, RELATED_PIVOT_MODULE, CREATOR_BUBBLE_CTC_CHALLENGE_HEADER, CONTENT_BUNDLE, IDEA_PIN_AUDIO_FEED_FEATURED_PLAYLISTS, IDEA_PIN_AUDIO_FEED_FEATURED_MOODS, IDEA_PIN_AUDIO_FEED_FEATURED_GENRES, YOUR_SHOP_CARD_GRID, YOUR_SHOP_CARD_COVER_AND_PREVIEW, YOUR_SHOP_COVER_AND_PREVIEW, IDEA_PIN_AUDIO_SEARCH_ARTIST_PREVIEW, YOUR_SHOP_ANCHOR_PRODUCT, YOUR_SHOP_MERCHANT_UPSELL, MERCHANT_PRODUCT_CAROUSEL, YOUR_SHOP_PRODUCT_CATEGORY_CAROUSEL, YOUR_SHOP_CATEGORY_BROWSE, YOUR_SHOP_STELA, YOUR_SHOP_MERCHANT_CAROUSEL, SIMPLE_TEXT, YOUR_SHOP_HEADER, STRUCTURED_FEED_FREEFORM, YOUR_SHOP_SINGLE_BRAND_DISCOVERY_MODULE, YOUR_SHOP_BRAND_FOLLOW_BANNER, YOUR_SHOP_BRAND_FOLLOW, MORE_IDEAS_SINGLE_COLUMN_GRID, MORE_IDEAS_CARD, SEARCH_AD_ONLY_MODULE, SHUFFLE_COLLAGE_MODULE, VISUAL_SHOPPING_CAROUSEL, USER_ORGANIZE_PIN_GROUPINGS, VISUAL_SHOPPING_GRID_SECTION, DEEPER_DIVE_TOPIC_MODULE, MULTI_IMAGE_UPSELL, TAB_CAROUSEL_MODULE, ANKET_INLINE_SURVEY, VISUAL_SHOPPING_GRID, EXPERIENCE_CALLOUT, AUTO_ORG_ClUSTER_MODULE_CAROUSEL, COMMENT_MODULE, HYBRID_SEARCH_UPSELL, BOARD_ATTRIBUTION_MODULE, COLLAGE_COMPOSER_CARD, NEW_IDEAS_FEED, SEE_IT_STYLED_MODULE, VISUAL_SHOPPING_LANDING_FILTER_CAROUSEL, STRUCTURED_FEED_SINGLE_ROW, RELATED_QUESTIONS_CAROUSEL, RELATED_QUESTIONS_DRILL_DOWN, VISUAL_ANSWERS, STYLE_SUMMARY_ENTRY_MODULE, SHOP_YOUR_SAVES_MODULE, TEXT_IMAGE_REP_WITH_PIN_CAROUSEL_DROPDOWN};
    }

    static {
        m0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new k0();
    }

    private m0(String str, int i13) {
    }

    public static final m0 findByValue(int i13) {
        Companion.getClass();
        return k0.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (l0.f140823a[ordinal()]) {
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
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
            case 22:
                return 22;
            case 23:
                return 23;
            case 24:
                return 24;
            case 25:
                return 25;
            case 26:
                return 26;
            case 27:
                return 27;
            case 28:
                return 28;
            case 29:
                return 29;
            case 30:
                return 30;
            case 31:
                return 31;
            case 32:
                return 32;
            case 33:
                return 33;
            case 34:
                return 34;
            case 35:
                return 35;
            case 36:
                return 36;
            case 37:
                return 37;
            case 38:
                return 38;
            case 39:
                return 39;
            case 40:
                return 40;
            case 41:
                return 41;
            case 42:
                return 42;
            case 43:
                return 43;
            case 44:
                return 44;
            case 45:
                return 45;
            case 46:
                return 46;
            case 47:
                return 47;
            case 48:
                return 48;
            case 49:
                return 49;
            case 50:
                return 50;
            case 51:
                return 51;
            case 52:
                return 52;
            case 53:
                return 53;
            case 54:
                return 54;
            case 55:
                return 55;
            case 56:
                return 56;
            case 57:
                return 57;
            case 58:
                return 58;
            case 59:
                return 59;
            case 60:
                return 60;
            case 61:
                return 61;
            case 62:
                return 62;
            case 63:
                return 63;
            case 64:
                return 64;
            case 65:
                return 65;
            case 66:
                return 66;
            case 67:
                return 67;
            case 68:
                return 68;
            case 69:
                return 69;
            case 70:
                return 70;
            case 71:
                return 71;
            case 72:
                return 72;
            case 73:
                return 73;
            case 74:
                return 74;
            case 75:
                return 75;
            case 76:
                return 76;
            case 77:
                return 77;
            case 78:
                return 78;
            case 79:
                return 79;
            case 80:
                return 80;
            case 81:
                return 81;
            case 82:
                return 82;
            case 83:
                return 83;
            case 84:
                return 84;
            case 85:
                return 85;
            case 86:
                return 86;
            case 87:
                return 87;
            case 88:
                return 88;
            case 89:
                return 89;
            case 90:
                return 90;
            case 91:
                return 91;
            case 92:
                return 92;
            case 93:
                return 93;
            case 94:
                return 94;
            case 95:
                return 95;
            case 96:
                return 96;
            case 97:
                return 97;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
                return 98;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
                return 99;
            case 100:
                return 100;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE /* 105 */:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID;
            case RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER /* 107 */:
                return RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE /* 108 */:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE;
            case RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL /* 109 */:
                return RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL;
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL /* 110 */:
                return RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL;
            case RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE /* 111 */:
                return RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE;
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER /* 112 */:
                return RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL /* 113 */:
                return RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER;
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER /* 114 */:
                return RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE;
            case RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE /* 115 */:
                return RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW;
            case RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW /* 116 */:
                return RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN;
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN /* 117 */:
                return RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL;
            case RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL /* 118 */:
                return RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL;
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL /* 119 */:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL /* 120 */:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL /* 121 */:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN /* 122 */:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL /* 123 */:
                return RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER;
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER /* 124 */:
                return RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED;
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED /* 125 */:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL /* 126 */:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK /* 127 */:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN /* 128 */:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS /* 129 */:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN /* 130 */:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL /* 131 */:
                return RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE;
            case RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE /* 132 */:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL /* 133 */:
                return RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL;
            case RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL /* 134 */:
                return RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL;
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL /* 135 */:
                return RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL;
            case RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL /* 136 */:
                return RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE;
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE /* 137 */:
                return RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL /* 138 */:
                return RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM /* 139 */:
                return RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM /* 140 */:
                return RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN /* 141 */:
                return RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL /* 142 */:
                return RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE /* 143 */:
                return RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM;
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM /* 144 */:
                return RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED;
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED /* 145 */:
                return RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO /* 146 */:
                return RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY;
            case RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY /* 147 */:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE /* 148 */:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE /* 149 */:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY /* 150 */:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM /* 151 */:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM /* 152 */:
                return RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM;
            case RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM /* 153 */:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER /* 154 */:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER /* 155 */:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM /* 156 */:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER /* 157 */:
                return RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN;
            case RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN /* 158 */:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER /* 159 */:
                return 160;
            case 160:
                return RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER;
            case RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER /* 161 */:
                return RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
