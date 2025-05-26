package h32;

import ads_mobile_sdk.wb;
import com.google.android.gms.ads.AdSize;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.NoWhenBranchMatchedException;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class a4 extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a4[] $VALUES;

    @NotNull
    public static final y3 Companion;
    public static final a4 FEED_FOLLOWING = new a4("FEED_FOLLOWING", 0);
    public static final a4 FEED_FRIENDS = new a4("FEED_FRIENDS", 1);
    public static final a4 FEED_EVERYTHING = new a4("FEED_EVERYTHING", 2);
    public static final a4 FEED_POPULAR = new a4("FEED_POPULAR", 3);
    public static final a4 FEED_SOURCE = new a4("FEED_SOURCE", 4);
    public static final a4 FEED_HOME = new a4("FEED_HOME", 5);
    public static final a4 FEED_TOP_PICKS = new a4("FEED_TOP_PICKS", 6);
    public static final a4 FEED_WELCOME = new a4("FEED_WELCOME", 7);
    public static final a4 FEED_SUBCATEGORY = new a4("FEED_SUBCATEGORY", 8);
    public static final a4 FEED_INTEREST = new a4("FEED_INTEREST", 9);
    public static final a4 FEED_FRESH = new a4("FEED_FRESH", 10);
    public static final a4 FEED_KLP = new a4("FEED_KLP", 11);
    public static final a4 FEED_PLP = new a4("FEED_PLP", 12);
    public static final a4 FEED_BLP = new a4("FEED_BLP", 13);
    public static final a4 FEED_RELATED_PINS = new a4("FEED_RELATED_PINS", 14);
    public static final a4 AMP_KLP_FEED = new a4("AMP_KLP_FEED", 15);
    public static final a4 AMP_PIN_FEED = new a4("AMP_PIN_FEED", 16);
    public static final a4 AMP_BOARD_FEED = new a4("AMP_BOARD_FEED", 17);
    public static final a4 AMP_PROFILE_FEED = new a4("AMP_PROFILE_FEED", 18);
    public static final a4 AMP_TOPIC_PAGE = new a4("AMP_TOPIC_PAGE", 19);
    public static final a4 DISCOVER_CREATORS_PICKER = new a4("DISCOVER_CREATORS_PICKER", 20);
    public static final a4 FEED_DIGEST = new a4("FEED_DIGEST", 21);
    public static final a4 FEED_DIGEST_STORY = new a4("FEED_DIGEST_STORY", 22);
    public static final a4 FEED_DYNAMIC_GRID = new a4("FEED_DYNAMIC_GRID", 23);
    public static final a4 FEED_MULTIVISIT = new a4("FEED_MULTIVISIT", 24);
    public static final a4 CATEGORY_DISCOVER = new a4("CATEGORY_DISCOVER", 25);
    public static final a4 FEED_CATEGORY_ANIMALS = new a4("FEED_CATEGORY_ANIMALS", 26);
    public static final a4 FEED_CATEGORY_ARCHITECTURE = new a4("FEED_CATEGORY_ARCHITECTURE", 27);
    public static final a4 FEED_CATEGORY_ART = new a4("FEED_CATEGORY_ART", 28);
    public static final a4 FEED_CATEGORY_CARS_MOTORCYCLES = new a4("FEED_CATEGORY_CARS_MOTORCYCLES", 29);
    public static final a4 FEED_CATEGORY_CELEBRITIES = new a4("FEED_CATEGORY_CELEBRITIES", 30);
    public static final a4 FEED_CATEGORY_DESIGN = new a4("FEED_CATEGORY_DESIGN", 31);
    public static final a4 FEED_CATEGORY_DIY_CRAFTS = new a4("FEED_CATEGORY_DIY_CRAFTS", 32);
    public static final a4 FEED_CATEGORY_EDUCATION = new a4("FEED_CATEGORY_EDUCATION", 33);
    public static final a4 FEED_CATEGORY_FILM_MUSIC_BOOKS = new a4("FEED_CATEGORY_FILM_MUSIC_BOOKS", 34);
    public static final a4 FEED_CATEGORY_FOOD_DRINK = new a4("FEED_CATEGORY_FOOD_DRINK", 35);
    public static final a4 FEED_CATEGORY_GARDENING = new a4("FEED_CATEGORY_GARDENING", 36);
    public static final a4 FEED_CATEGORY_GEEK = new a4("FEED_CATEGORY_GEEK", 37);
    public static final a4 FEED_CATEGORY_HAIR_BEAUTY = new a4("FEED_CATEGORY_HAIR_BEAUTY", 38);
    public static final a4 FEED_CATEGORY_HEALTH_FITNESS = new a4("FEED_CATEGORY_HEALTH_FITNESS", 39);
    public static final a4 FEED_CATEGORY_HISTORY = new a4("FEED_CATEGORY_HISTORY", 40);
    public static final a4 FEED_CATEGORY_HOLIDAYS_EVENTS = new a4("FEED_CATEGORY_HOLIDAYS_EVENTS", 41);
    public static final a4 FEED_CATEGORY_HOME_DECOR = new a4("FEED_CATEGORY_HOME_DECOR", 42);
    public static final a4 FEED_CATEGORY_HUMOR = new a4("FEED_CATEGORY_HUMOR", 43);
    public static final a4 FEED_CATEGORY_ILLUSTRATIONS_POSTERS = new a4("FEED_CATEGORY_ILLUSTRATIONS_POSTERS", 44);
    public static final a4 FEED_CATEGORY_KIDS = new a4("FEED_CATEGORY_KIDS", 45);
    public static final a4 FEED_CATEGORY_MENS_FASHION = new a4("FEED_CATEGORY_MENS_FASHION", 46);
    public static final a4 FEED_CATEGORY_OUTDOORS = new a4("FEED_CATEGORY_OUTDOORS", 47);
    public static final a4 FEED_CATEGORY_PHOTOGRAPHY = new a4("FEED_CATEGORY_PHOTOGRAPHY", 48);
    public static final a4 FEED_CATEGORY_PRODUCTS = new a4("FEED_CATEGORY_PRODUCTS", 49);
    public static final a4 FEED_CATEGORY_QUOTES = new a4("FEED_CATEGORY_QUOTES", 50);
    public static final a4 FEED_CATEGORY_SCIENCE_NATURE = new a4("FEED_CATEGORY_SCIENCE_NATURE", 51);
    public static final a4 FEED_CATEGORY_SPORTS = new a4("FEED_CATEGORY_SPORTS", 52);
    public static final a4 FEED_CATEGORY_TATTOOS = new a4("FEED_CATEGORY_TATTOOS", 53);
    public static final a4 FEED_CATEGORY_TECHNOLOGY = new a4("FEED_CATEGORY_TECHNOLOGY", 54);
    public static final a4 FEED_CATEGORY_TRAVEL = new a4("FEED_CATEGORY_TRAVEL", 55);
    public static final a4 FEED_CATEGORY_WEDDINGS = new a4("FEED_CATEGORY_WEDDINGS", 56);
    public static final a4 FEED_CATEGORY_WOMENS_FASHION = new a4("FEED_CATEGORY_WOMENS_FASHION", 57);
    public static final a4 FEED_CATEGORY_HOLIDAY_FOR_HIM = new a4("FEED_CATEGORY_HOLIDAY_FOR_HIM", 58);
    public static final a4 FEED_CATEGORY_HOLIDAY_FOR_HER = new a4("FEED_CATEGORY_HOLIDAY_FOR_HER", 59);
    public static final a4 FEED_CATEGORY_HOLIDAY_FOR_KIDS = new a4("FEED_CATEGORY_HOLIDAY_FOR_KIDS", 60);
    public static final a4 FEED_CATEGORY_HOLIDAY_FOR_ALL = new a4("FEED_CATEGORY_HOLIDAY_FOR_ALL", 61);
    public static final a4 FEED_CATEGORY_CHRISTMAS_SWEATER = new a4("FEED_CATEGORY_CHRISTMAS_SWEATER", 62);
    public static final a4 FEED_CATEGORY = new a4("FEED_CATEGORY", 63);
    public static final a4 FEED_CATEGORY_TOPIC = new a4("FEED_CATEGORY_TOPIC", 64);
    public static final a4 FEED_GIFTS = new a4("FEED_GIFTS", 65);
    public static final a4 FEED_GIFTS_20 = new a4("FEED_GIFTS_20", 66);
    public static final a4 FEED_GIFTS_20_50 = new a4("FEED_GIFTS_20_50", 67);
    public static final a4 FEED_GIFTS_50_100 = new a4("FEED_GIFTS_50_100", 68);
    public static final a4 FEED_GIFTS_100_200 = new a4("FEED_GIFTS_100_200", 69);
    public static final a4 FEED_GIFTS_200_500 = new a4("FEED_GIFTS_200_500", 70);
    public static final a4 FEED_GIFTS_500 = new a4("FEED_GIFTS_500", 71);
    public static final a4 FEED_VIDEOS = new a4("FEED_VIDEOS", 72);
    public static final a4 FEED_DOMAIN = new a4("FEED_DOMAIN", 73);
    public static final a4 FEED_PLACES = new a4("FEED_PLACES", 74);
    public static final a4 FEED_COMMERCE = new a4("FEED_COMMERCE", 75);
    public static final a4 FEED_COMMERCE_BUYABLE = new a4("FEED_COMMERCE_BUYABLE", 76);
    public static final a4 FEED_COMMERCE_PICKS = new a4("FEED_COMMERCE_PICKS", 77);
    public static final a4 FEED_COMMERCE_MERCHANT_PAGE = new a4("FEED_COMMERCE_MERCHANT_PAGE", 78);
    public static final a4 FEED_COMMERCE_MERCHANT_SEARCH = new a4("FEED_COMMERCE_MERCHANT_SEARCH", 79);
    public static final a4 DISCOVER_CATEGORY = new a4("DISCOVER_CATEGORY", 80);
    public static final a4 DISCOVER_INTEREST = new a4("DISCOVER_INTEREST", 81);
    public static final a4 DISCOVER_SEARCH_INTERESTS = new a4("DISCOVER_SEARCH_INTERESTS", 82);
    public static final a4 SEARCH_PINS = new a4("SEARCH_PINS", 83);
    public static final a4 SEARCH_BOARDS = new a4("SEARCH_BOARDS", 84);
    public static final a4 SEARCH_USERS = new a4("SEARCH_USERS", 85);
    public static final a4 SEARCH_AUTOCOMPLETE = new a4("SEARCH_AUTOCOMPLETE", 86);
    public static final a4 SEARCH_MY_PINS = new a4("SEARCH_MY_PINS", 87);
    public static final a4 SEARCH_MY_PINS_AND_BOARDS = new a4("SEARCH_MY_PINS_AND_BOARDS", 88);
    public static final a4 SEARCH_PLACES = new a4("SEARCH_PLACES", 89);
    public static final a4 SEARCH_PLACE_BOARDS = new a4("SEARCH_PLACE_BOARDS", 90);
    public static final a4 SEARCH_INTERESTS = new a4("SEARCH_INTERESTS", 91);
    public static final a4 SEARCH_BUYABLE = new a4("SEARCH_BUYABLE", 92);
    public static final a4 SEARCH_BUYABLE_STOREFRONT = new a4("SEARCH_BUYABLE_STOREFRONT", 93);
    public static final a4 SEARCH_PRICE_FILTER = new a4("SEARCH_PRICE_FILTER", 94);
    public static final a4 SEARCH_HASHTAGS = new a4("SEARCH_HASHTAGS", 95);
    public static final a4 SEARCH_BUBBLES = new a4("SEARCH_BUBBLES", 96);
    public static final a4 SEARCH_VIDEOS = new a4("SEARCH_VIDEOS", 97);
    public static final a4 SEARCH_GUIDE = new a4("SEARCH_GUIDE", 98);
    public static final a4 SEARCH_TRENDING_TEXT = new a4("SEARCH_TRENDING_TEXT", 99);
    public static final a4 SEARCH_STYLE_CONTENT = new a4("SEARCH_STYLE_CONTENT", 100);
    public static final a4 SEARCH_TAB = new a4("SEARCH_TAB", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE);
    public static final a4 SEARCH_STORY_LANDING_STRUCTURED_SECTION_MOST_POPULAR = new a4("SEARCH_STORY_LANDING_STRUCTURED_SECTION_MOST_POPULAR", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE);
    public static final a4 SEARCH_STORY_LANDING_STRUCTURED_BUBBLE_Q2X = new a4("SEARCH_STORY_LANDING_STRUCTURED_BUBBLE_Q2X", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE);
    public static final a4 SEARCH_STORY_LANDING_PERSONALIZATION_USER_BRAND = new a4("SEARCH_STORY_LANDING_PERSONALIZATION_USER_BRAND", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE);
    public static final a4 SEARCH_STORY_LANDING_PERSONALIZATION_USER_COLOR = new a4("SEARCH_STORY_LANDING_PERSONALIZATION_USER_COLOR", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE);
    public static final a4 SEARCH_STORY_LANDING_PERSONALIZATION_USER_STYLE = new a4("SEARCH_STORY_LANDING_PERSONALIZATION_USER_STYLE", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID);
    public static final a4 SEARCH_STORY_LANDING_PERSONALIZATION_USER_STYLE_IDEA_PIN_STREAM = new a4("SEARCH_STORY_LANDING_PERSONALIZATION_USER_STYLE_IDEA_PIN_STREAM", RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER);
    public static final a4 SEARCH_STORY_LANDING_SEARCH_FOR_YOU = new a4("SEARCH_STORY_LANDING_SEARCH_FOR_YOU", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE);
    public static final a4 SEARCH_IDEA_PIN_STREAM = new a4("SEARCH_IDEA_PIN_STREAM", RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL);
    public static final a4 SEARCH_GUIDED = new a4("SEARCH_GUIDED", RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL);
    public static final a4 SEARCH_GUIDED_RESULTS = new a4("SEARCH_GUIDED_RESULTS", RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE);
    public static final a4 SEARCH_HYBRID = new a4("SEARCH_HYBRID", RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER);
    public static final a4 REGISTRATION_LANDING = new a4("REGISTRATION_LANDING", RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL);
    public static final a4 REGISTRATION_SIGNUP = new a4("REGISTRATION_SIGNUP", RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER);
    public static final a4 REGISTRATION_BOARDS = new a4("REGISTRATION_BOARDS", RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE);
    public static final a4 REGISTRATION_SIGNUP_BUSINESS = new a4("REGISTRATION_SIGNUP_BUSINESS", RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW);
    public static final a4 REGISTRATION_LOCAL_INFO = new a4("REGISTRATION_LOCAL_INFO", RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN);
    public static final a4 REGISTRATION_AGE_GENDER = new a4("REGISTRATION_AGE_GENDER", RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL);
    public static final a4 USER_BOARDS = new a4("USER_BOARDS", RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL);
    public static final a4 USER_FOLLOWERS = new a4("USER_FOLLOWERS", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
    public static final a4 USER_FOLLOWING = new a4("USER_FOLLOWING", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL);
    public static final a4 USER_LIKES = new a4("USER_LIKES", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN);
    public static final a4 USER_ACTIVITY = new a4("USER_ACTIVITY", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
    public static final a4 USER_PINS = new a4("USER_PINS", RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
    public static final a4 USER_EDIT = new a4("USER_EDIT", RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
    public static final a4 USER_INTERESTS = new a4("USER_INTERESTS", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
    public static final a4 USER_FYP = new a4("USER_FYP", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
    public static final a4 USER_FOLLOWED_USERS = new a4("USER_FOLLOWED_USERS", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
    public static final a4 USER_SELF = new a4("USER_SELF", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS);
    public static final a4 RETRIEVAL_HUB = new a4("RETRIEVAL_HUB", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN);
    public static final a4 USER_OTHERS = new a4("USER_OTHERS", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL);
    public static final a4 USER_DECIDER = new a4("USER_DECIDER", RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE);
    public static final a4 USER_OVERVIEW = new a4("USER_OVERVIEW", RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL);
    public static final a4 BUSINESS_PROFILE = new a4("BUSINESS_PROFILE", RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL);
    public static final a4 USER_SCHEDULED_PINS = new a4("USER_SCHEDULED_PINS", RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL);
    public static final a4 USER_STORY_PINS = new a4("USER_STORY_PINS", RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL);
    public static final a4 USER_VIDEO_PINS = new a4("USER_VIDEO_PINS", RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE);
    public static final a4 USER_STOREFRONT = new a4("USER_STOREFRONT", RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL);
    public static final a4 USER_COMMUNITY = new a4("USER_COMMUNITY", RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM);
    public static final a4 BOARD_FOLLOWERS = new a4("BOARD_FOLLOWERS", RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM);
    public static final a4 BOARD_SETTINGS = new a4("BOARD_SETTINGS", RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN);
    public static final a4 BOARD_CREATE = new a4("BOARD_CREATE", RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL);
    public static final a4 BOARD_EDIT = new a4("BOARD_EDIT", RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE);
    public static final a4 BOARD_EDIT_COLLABORATORS = new a4("BOARD_EDIT_COLLABORATORS", RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM);
    public static final a4 BOARD_ADD_COLLABORATORS_TRAY = new a4("BOARD_ADD_COLLABORATORS_TRAY", RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED);
    public static final a4 BOARD_ADD_COLLABORATORS = new a4("BOARD_ADD_COLLABORATORS", RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO);
    public static final a4 BOARD_CHOOSE_COVER = new a4("BOARD_CHOOSE_COVER", RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY);
    public static final a4 BOARD_CROP_COVER = new a4("BOARD_CROP_COVER", RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE);
    public static final a4 BOARD_PLACE = new a4("BOARD_PLACE", RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE);
    public static final a4 BOARD_MAP = new a4("BOARD_MAP", RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY);
    public static final a4 BOARD_EMPTY = new a4("BOARD_EMPTY", RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM);
    public static final a4 BOARD_SELF = new a4("BOARD_SELF", RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM);
    public static final a4 BOARD_OTHERS = new a4("BOARD_OTHERS", RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM);
    public static final a4 BOARD_IDEAS = new a4("BOARD_IDEAS", RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER);
    public static final a4 BOARD_ACTIVITIES = new a4("BOARD_ACTIVITIES", RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER);
    public static final a4 BOARD_ACTIVITIES_COMPOSER = new a4("BOARD_ACTIVITIES_COMPOSER", RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM);
    public static final a4 BOARD_MERGE = new a4("BOARD_MERGE", RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER);
    public static final a4 BOARD_SELECT_PINS = new a4("BOARD_SELECT_PINS", RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN);
    public static final a4 BOARD_SEARCH_CREATE_UPSELL_PIN_PICKER = new a4("BOARD_SEARCH_CREATE_UPSELL_PIN_PICKER", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER);
    public static final a4 BOARD_PERMISSION_SETTINGS = new a4("BOARD_PERMISSION_SETTINGS", 160);
    public static final a4 BOARD_TOOLS_ALL = new a4("BOARD_TOOLS_ALL", RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER);
    public static final a4 BOARD_FOR_ME = new a4("BOARD_FOR_ME", RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER);
    public static final a4 FRIEND_INVITER_EMAIL = new a4("FRIEND_INVITER_EMAIL", RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM);
    public static final a4 FRIEND_INVITER_FACEBOOK = new a4("FRIEND_INVITER_FACEBOOK", RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING);
    public static final a4 FRIEND_INVITER_FIND_FRIENDS = new a4("FRIEND_INVITER_FIND_FRIENDS", RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_CLEAR);
    public static final a4 FRIEND_INVITER_GMAIL = new a4("FRIEND_INVITER_GMAIL", RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE);
    public static final a4 FRIEND_INVITER_INVITE = new a4("FRIEND_INVITER_INVITE", RecyclerViewTypes.VIEW_TRY_ON_FEED_PRODUCT_CARD);
    public static final a4 FRIEND_INVITER_TWITTER = new a4("FRIEND_INVITER_TWITTER", RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION);
    public static final a4 FRIEND_INVITER_YAHOO = new a4("FRIEND_INVITER_YAHOO", RecyclerViewTypes.VIEW_TYPE_SHOPPING_SPOTLIGHT);
    public static final a4 ABOUT_TERMS = new a4("ABOUT_TERMS", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE);
    public static final a4 ABOUT_SUPPORT = new a4("ABOUT_SUPPORT", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO);
    public static final a4 ABOUT_BOOKMARKLET = new a4("ABOUT_BOOKMARKLET", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE);
    public static final a4 ABOUT_ETIQUETTE = new a4("ABOUT_ETIQUETTE", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO);
    public static final a4 ABOUT_ABOUT = new a4("ABOUT_ABOUT", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN);
    public static final a4 ABOUT_GOODIES = new a4("ABOUT_GOODIES", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO_FULL_SPAN);
    public static final a4 ABOUT_CAREERS = new a4("ABOUT_CAREERS", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN);
    public static final a4 ABOUT_TEAM = new a4("ABOUT_TEAM", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO_FULL_SPAN);
    public static final a4 ABOUT_PRESS = new a4("ABOUT_PRESS", RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD);
    public static final a4 ABOUT_PRIVACY = new a4("ABOUT_PRIVACY", RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD_FULL_SPAN);
    public static final a4 ABOUT_USE = new a4("ABOUT_USE", RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP);
    public static final a4 ABOUT_COPYRIGHT = new a4("ABOUT_COPYRIGHT", RecyclerViewTypes.VIEW_TYPE_BUBBLE_NAVIGATION_REP);
    public static final a4 LOGIN_EMAIL = new a4("LOGIN_EMAIL", RecyclerViewTypes.VIEW_TYPE_BUBBLE_DEFAULT_REP);
    public static final a4 LOGIN_FACEBOOK = new a4("LOGIN_FACEBOOK", RecyclerViewTypes.VIEW_TYPE_BUBBLE_STYLE_REP);
    public static final a4 LOGIN_TWITTER = new a4("LOGIN_TWITTER", RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_REP);
    public static final a4 ERROR_NO_INTERNET = new a4("ERROR_NO_INTERNET", RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_GRID_REP);
    public static final a4 ERROR_NO_PIN = new a4("ERROR_NO_PIN", RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_TOPIC_TILE);
    public static final a4 ERROR_NO_BOARD = new a4("ERROR_NO_BOARD", RecyclerViewTypes.VIEW_TYPE_BUBBLE_EDITORIAL_CARD);
    public static final a4 ERROR_NO_USER = new a4("ERROR_NO_USER", RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_EDITORIAL_CARD);
    public static final a4 ERROR_NO_ACTIVITY = new a4("ERROR_NO_ACTIVITY", RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_WITH_TITLE_OVERLAY);
    public static final a4 REPORT_PIN = new a4("REPORT_PIN", RecyclerViewTypes.VIEW_TYPE_ICON_AND_TEXT_INLINE_BUBBLE);
    public static final a4 REPORT_USER = new a4("REPORT_USER", RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO);
    public static final a4 REPORT_COMMENT = new a4("REPORT_COMMENT", RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
    public static final a4 REPORT_BOARD = new a4("REPORT_BOARD", RecyclerViewTypes.VIEW_TYPE_LENS_HISTORY);
    public static final a4 REPORT_CONVERSATION = new a4("REPORT_CONVERSATION", RecyclerViewTypes.VIEW_TYPE_OVERSCROLL_SEARCH_CELL);
    public static final a4 USER_ABOUT = new a4("USER_ABOUT", RecyclerViewTypes.VIEW_TYPE_USER);
    public static final a4 BOARD_COLLABORATORS = new a4("BOARD_COLLABORATORS", RecyclerViewTypes.VIEW_SHOP_THE_LOOK_CLOSEUP_MODULE);
    public static final a4 EDUCATION_LONGPRESS = new a4("EDUCATION_LONGPRESS", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_HERO);
    public static final a4 EDUCATION_RELATED_PINS = new a4("EDUCATION_RELATED_PINS", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_THREE_PINS_COLLECTION);
    public static final a4 EDUCATION_SECRET_BOARD = new a4("EDUCATION_SECRET_BOARD", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_VIDEO);
    public static final a4 EDUCATION_CONTEXTUAL_MENU = new a4("EDUCATION_CONTEXTUAL_MENU", 200);
    public static final a4 EDUCATION_GUIDED_SEARCH = new a4("EDUCATION_GUIDED_SEARCH", 201);
    public static final a4 EDUCATION_FLYOUT = new a4("EDUCATION_FLYOUT", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN);
    public static final a4 EDUCATION_SAVE = new a4("EDUCATION_SAVE", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER);
    public static final a4 MOBILE_ORIENTATION_DISCOVER = new a4("MOBILE_ORIENTATION_DISCOVER", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR);
    public static final a4 MOBILE_ORIENTATION_COLLECT = new a4("MOBILE_ORIENTATION_COLLECT", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_HEADER);
    public static final a4 MOBILE_ORIENTATION_FUNCTIONAL = new a4("MOBILE_ORIENTATION_FUNCTIONAL", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER);
    public static final a4 MOBILE_ORIENTATION_STORY = new a4("MOBILE_ORIENTATION_STORY", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_FEED_FOOTER);
    public static final a4 ORIENTATION_FAST_FOLLOW = new a4("ORIENTATION_FAST_FOLLOW", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION);
    public static final a4 PICKED_FOR_YOU_FEED = new a4("PICKED_FOR_YOU_FEED", RecyclerViewTypes.VIEW_TYPE_TODAY_ARTICLE_BOARD_SECTION_HEADER);
    public static final a4 FEED_EDITOR_FOLLOW_BOARDS = new a4("FEED_EDITOR_FOLLOW_BOARDS", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_RELATED_ARTICLES_HEADER);
    public static final a4 FEED_EDITOR_UNFOLLOW_BOARDS = new a4("FEED_EDITOR_UNFOLLOW_BOARDS", RecyclerViewTypes.VIEW_TYPE_GO_TO_HOME_FEED_FOOTER);
    public static final a4 DEPRECATED_DEEP_LINKING_EMAIL = new a4("DEPRECATED_DEEP_LINKING_EMAIL", RecyclerViewTypes.VIEW_TYPE_SIMPLE_ACTION_STORY);
    public static final a4 DEPRECATED_DEEP_LINKING_WEB = new a4("DEPRECATED_DEEP_LINKING_WEB", RecyclerViewTypes.VIEW_TYPE_CONVERSATION_GIF_REACTION);
    public static final a4 DEEP_LINKING_FACEBOOK = new a4("DEEP_LINKING_FACEBOOK", RecyclerViewTypes.VIEW_TYPE_INBOX_HEADER);
    public static final a4 DEEP_LINKING_APP = new a4("DEEP_LINKING_APP", RecyclerViewTypes.VIEW_TYPE_BOARD_INVITE_HEADER);
    public static final a4 DEEP_LINKING = new a4("DEEP_LINKING", RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER);
    public static final a4 FEED_RELATED_BOARD = new a4("FEED_RELATED_BOARD", RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER);
    public static final a4 FEED_RELATED_INTEREST = new a4("FEED_RELATED_INTEREST", RecyclerViewTypes.VIEW_TYPE_STYLE_HEADER);
    public static final a4 FEED_RELATED_PIN = new a4("FEED_RELATED_PIN", RecyclerViewTypes.VIEW_TYPE_STYLE_DESCRIPTION);
    public static final a4 FEED_RELATED_PRODUCTS = new a4("FEED_RELATED_PRODUCTS", RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER);
    public static final a4 FEED_RELATED_SHOPPABLE_CONTENTS = new a4("FEED_RELATED_SHOPPABLE_CONTENTS", RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_DOUBLE);
    public static final a4 FEED_RELATED_RECIPES = new a4("FEED_RELATED_RECIPES", RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_SINGLE);
    public static final a4 FEED_RELATED_DIY = new a4("FEED_RELATED_DIY", RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE);
    public static final a4 FEED_RELATED_VIDEOS = new a4("FEED_RELATED_VIDEOS", RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL);
    public static final a4 FEED_RELATED_STORIES = new a4("FEED_RELATED_STORIES", RecyclerViewTypes.VIEW_TYPE_STORY_SELECT_OR_REORDER_PINS);
    public static final a4 FEED_RELATED_PIVOT_TOPIC_STORIES = new a4("FEED_RELATED_PIVOT_TOPIC_STORIES", RecyclerViewTypes.VIEW_TYPE_STORY_GROUP_MY_PINS);
    public static final a4 FEED_RELATED_PIVOT_CREATOR_STORIES = new a4("FEED_RELATED_PIVOT_CREATOR_STORIES", RecyclerViewTypes.VIEW_TYPE_VTO_BUBBLE_CONTAINER);
    public static final a4 FEED_RELATED_PIVOT_STORIES = new a4("FEED_RELATED_PIVOT_STORIES", RecyclerViewTypes.VIEW_TYPE_PROFILE_BOARDLESS_PINS_HEADER);
    public static final a4 FEED_RELATED_PIVOTS = new a4("FEED_RELATED_PIVOTS", RecyclerViewTypes.VIEW_TYPE_IN_LINE_VTO);
    public static final a4 FEED_RELATED_PORTAL_CREATOR_STORIES = new a4("FEED_RELATED_PORTAL_CREATOR_STORIES", RecyclerViewTypes.VIEW_TYPE_AFFILIATE_LINK_IMAGE);
    public static final a4 FEED_BRAND_CATALOG = new a4("FEED_BRAND_CATALOG", RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER);
    public static final a4 FEED_VIDEO_STORY = new a4("FEED_VIDEO_STORY", RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM);
    public static final a4 FEED_COMPLETE_THIS_LOOK = new a4("FEED_COMPLETE_THIS_LOOK", RecyclerViewTypes.VIEW_TYPE_SEARCH_BOARD_CELL);
    public static final a4 FEED_PRODUCT_GROUP = new a4("FEED_PRODUCT_GROUP", RecyclerViewTypes.VIEW_TYPE_SHARESHEET_APP);
    public static final a4 FEED_BUSINESS_PROFILE_PICKS_FOR_YOU = new a4("FEED_BUSINESS_PROFILE_PICKS_FOR_YOU", RecyclerViewTypes.VIEW_TYPE_SHARESHEET_CONTACT);
    public static final a4 FEED_BOARD_SHOPPING_PACKAGE = new a4("FEED_BOARD_SHOPPING_PACKAGE", RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_CARD);
    public static final a4 FEED_BUBBLE_SHOPPING_PACKAGE = new a4("FEED_BUBBLE_SHOPPING_PACKAGE", RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_LIST_ITEM);
    public static final a4 FEED_BRAND_SHOPPING_PACKAGE = new a4("FEED_BRAND_SHOPPING_PACKAGE", RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_BOARD_NAME_HEADER);
    public static final a4 FEED_STL_MODULE = new a4("FEED_STL_MODULE", RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL);
    public static final a4 FEED_BOARD_SHOP = new a4("FEED_BOARD_SHOP", RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM);
    public static final a4 FEED_BOARD_SHOP_SAVED_ITEMS = new a4("FEED_BOARD_SHOP_SAVED_ITEMS", RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPAGE_ITEM);
    public static final a4 FEED_BOARD_SHOP_TAB = new a4("FEED_BOARD_SHOP_TAB", RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPIN_ITEM);
    public static final a4 FEED_BOARD_SHOP_CATEGORY = new a4("FEED_BOARD_SHOP_CATEGORY", RecyclerViewTypes.VIEW_TYPE_BRAND_MULTI_IMAGE_REP_ITEM);
    public static final a4 FEED_BOARD_SAVED_PRODUCTS = new a4("FEED_BOARD_SAVED_PRODUCTS", RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION);
    public static final a4 FEED_BOARD_SHOP_PRODUCT_CATEGORY = new a4("FEED_BOARD_SHOP_PRODUCT_CATEGORY", RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP);
    public static final a4 FEED_BOARD_ALL_SAVES_PINS = new a4("FEED_BOARD_ALL_SAVES_PINS", RecyclerViewTypes.VIEW_TYPE_BUBBLE_STACKED_COLLAGE_DISPLAY_CARD_REP);
    public static final a4 STOREFRONT_SEARCH_AUTOCOMPLETE = new a4("STOREFRONT_SEARCH_AUTOCOMPLETE", RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER);
    public static final a4 FIND_FRIENDS = new a4("FIND_FRIENDS", RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER);
    public static final a4 PIN_OTHER = new a4("PIN_OTHER", RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP);
    public static final a4 PIN_REGULAR = new a4("PIN_REGULAR", 250);
    public static final a4 PIN_ARTICLE = new a4("PIN_ARTICLE", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE);
    public static final a4 PIN_MOVIE = new a4("PIN_MOVIE", RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
    public static final a4 PIN_PLACE = new a4("PIN_PLACE", RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER);
    public static final a4 PIN_PRODUCT = new a4("PIN_PRODUCT", RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN);
    public static final a4 PIN_RECIPE = new a4("PIN_RECIPE", 255);
    public static final a4 PIN_LOOKBOOK = new a4("PIN_LOOKBOOK", RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
    public static final a4 PIN_PRODUCT_MERCHANT = new a4("PIN_PRODUCT_MERCHANT", RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER);
    public static final a4 PIN_MAKE_TUTORIAL = new a4("PIN_MAKE_TUTORIAL", RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW);
    public static final a4 PIN_SHUFFLE_CUTOUT = new a4("PIN_SHUFFLE_CUTOUT", RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS);
    public static final a4 PIN_STORY_PIN = new a4("PIN_STORY_PIN", RecyclerViewTypes.VIEW_TYPE_PROTECTED_BOARD_HEADER);
    public static final a4 PIN_PDPPLUS = new a4("PIN_PDPPLUS", RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_ON_ENDLESS_SCROLL_HEADER);
    public static final a4 PIN_CLOSEUP = new a4("PIN_CLOSEUP", RecyclerViewTypes.VIEW_TYPE_PRODUCT_FILTER_DIVIDER);
    public static final a4 PIN_CLOSEUP_VISUAL_LINK_PRODUCT_LIST = new a4("PIN_CLOSEUP_VISUAL_LINK_PRODUCT_LIST", RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_BOARDS);
    public static final a4 PIN_CLOSEUP_VISUAL_LINK_FEED = new a4("PIN_CLOSEUP_VISUAL_LINK_FEED", RecyclerViewTypes.VIEW_TYPE_ATG_VISUALIZATION_BANNER);
    public static final a4 PIN_CLOSEUP_AMAZON_SHOPPING_MODULE = new a4("PIN_CLOSEUP_AMAZON_SHOPPING_MODULE", RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO);
    public static final a4 SPLASH_LOADING = new a4("SPLASH_LOADING", RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_GRID);
    public static final a4 SPLASH_INSPIRED_WALL = new a4("SPLASH_INSPIRED_WALL", RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_CARD);
    public static final a4 SPLASH_BRIO_WALL = new a4("SPLASH_BRIO_WALL", RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_THUMBNAIL);
    public static final a4 SPLASH_CONTINUE_EMAIL = new a4("SPLASH_CONTINUE_EMAIL", RecyclerViewTypes.VIEW_TYPE_FILTER_REMOVAL_BUTTON);
    public static final a4 SPLASH_MULTISTEP = new a4("SPLASH_MULTISTEP", RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF);
    public static final a4 ORIENTATION_WEBSITE = new a4("ORIENTATION_WEBSITE", RecyclerViewTypes.VIEW_TYPE_BOARD_CONVERSATION_THREAD);
    public static final a4 ORIENTATION_INTENT_TO_ADVERTISE = new a4("ORIENTATION_INTENT_TO_ADVERTISE", RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO_AD_EXCLUDE);
    public static final a4 ORIENTATION_BUSINESS_NAME = new a4("ORIENTATION_BUSINESS_NAME", RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS_AD_EXCLUDE);
    public static final a4 ORIENTATION_BUSINESS_TYPE = new a4("ORIENTATION_BUSINESS_TYPE", RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_VIDEO_AD_EXCLUDE);
    public static final a4 ORIENTATION_SALES_CONTACT = new a4("ORIENTATION_SALES_CONTACT", RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_AD_EXCLUDE);
    public static final a4 ORIENTATION_WELCOME = new a4("ORIENTATION_WELCOME", RecyclerViewTypes.VIEW_TYPE_PIN_VIDEO_AD_EXCLUDE);
    public static final a4 ORIENTATION_GENDER_STEP = new a4("ORIENTATION_GENDER_STEP", RecyclerViewTypes.VIEW_TYPE_PIN_AD_EXCLUDE);
    public static final a4 ORIENTATION_APP_UPSELL_STEP = new a4("ORIENTATION_APP_UPSELL_STEP", RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN_AD_EXCLUDE);
    public static final a4 ORIENTATION_LOCALE_COUNTRY_STEP = new a4("ORIENTATION_LOCALE_COUNTRY_STEP", RecyclerViewTypes.VIEW_TYPE_SHUFFLE_CAROUSEL);
    public static final a4 ORIENTATION_LOCALE_STEP = new a4("ORIENTATION_LOCALE_STEP", RecyclerViewTypes.VIEW_TYPE_PIN_WEBVIEW_AD);
    public static final a4 ORIENTATION_INTEREST_PICKER = new a4("ORIENTATION_INTEREST_PICKER", 281);
    public static final a4 ORIENTATION_INTEREST_REFINEMENT_CATEGORIES = new a4("ORIENTATION_INTEREST_REFINEMENT_CATEGORIES", 282);
    public static final a4 ORIENTATION_INTEREST_REFINEMENT_TOPICS = new a4("ORIENTATION_INTEREST_REFINEMENT_TOPICS", 283);
    public static final a4 ORIENTATION_TAG_PICKER = new a4("ORIENTATION_TAG_PICKER", 284);
    public static final a4 ORIENTATION_BOARD_PICKER = new a4("ORIENTATION_BOARD_PICKER", 285);
    public static final a4 ORIENTATION_PIN_PICKER = new a4("ORIENTATION_PIN_PICKER", 286);
    public static final a4 ORIENTATION_EXTENSION_UPSELL = new a4("ORIENTATION_EXTENSION_UPSELL", 287);
    public static final a4 ORIENTATION_LOADING_HOME_FEED = new a4("ORIENTATION_LOADING_HOME_FEED", 288);
    public static final a4 ORIENTATION_AFFINITY_COMPLETION_INFO = new a4("ORIENTATION_AFFINITY_COMPLETION_INFO", 289);
    public static final a4 ORIENTATION_NOTIF_UPSELL = new a4("ORIENTATION_NOTIF_UPSELL", 290);
    public static final a4 ORIENTATION_COUNTRY_STEP = new a4("ORIENTATION_COUNTRY_STEP", 291);
    public static final a4 ORIENTATION_COUNTRY_PICKER_STEP = new a4("ORIENTATION_COUNTRY_PICKER_STEP", 292);
    public static final a4 ORIENTATION_SINGLE_USE_CASE_SIGNAL_STATE = new a4("ORIENTATION_SINGLE_USE_CASE_SIGNAL_STATE", 293);
    public static final a4 ORIENTATION_SINGLE_USE_CASE_SIGNAL_STEP = new a4("ORIENTATION_SINGLE_USE_CASE_SIGNAL_STEP", 294);
    public static final a4 ORIENTATION_IS_MOBILE_NUX_PICKER = new a4("ORIENTATION_IS_MOBILE_NUX_PICKER", 295);
    public static final a4 ORIENTATION_EDUCATION_STEP = new a4("ORIENTATION_EDUCATION_STEP", 296);
    public static final a4 ORIENTATION_AGE_STEP = new a4("ORIENTATION_AGE_STEP", 297);
    public static final a4 ORIENTATION_CREATOR_PICKER = new a4("ORIENTATION_CREATOR_PICKER", 298);
    public static final a4 ORIENTATION_FIRST_AD_UPSELL_STEP = new a4("ORIENTATION_FIRST_AD_UPSELL_STEP", 299);
    public static final a4 ORIENTATION_QR_CODE_APP_UPSELL = new a4("ORIENTATION_QR_CODE_APP_UPSELL", AdSize.MEDIUM_RECTANGLE_WIDTH);
    public static final a4 USECASE_QUIZ = new a4("USECASE_QUIZ", wb.W0);
    public static final a4 ORIENTATION_USE_CASE_PICKER_STEP = new a4("ORIENTATION_USE_CASE_PICKER_STEP", wb.X0);
    public static final a4 ORIENTATION_PIN_PICKER_STEP = new a4("ORIENTATION_PIN_PICKER_STEP", 303);
    public static final a4 USE_CASE_FEED = new a4("USE_CASE_FEED", 304);
    public static final a4 SIGNUP_ACCOUNT_TYPE_STEP = new a4("SIGNUP_ACCOUNT_TYPE_STEP", 305);
    public static final a4 SIGNUP_EMAIL_PASSWORD_STEP = new a4("SIGNUP_EMAIL_PASSWORD_STEP", 306);
    public static final a4 SIGNUP_EMAIL_STEP = new a4("SIGNUP_EMAIL_STEP", 307);
    public static final a4 SIGNUP_PASSWORD_STEP = new a4("SIGNUP_PASSWORD_STEP", 308);
    public static final a4 SIGNUP_NAME_STEP = new a4("SIGNUP_NAME_STEP", 309);
    public static final a4 SIGNUP_AGE_STEP = new a4("SIGNUP_AGE_STEP", 310);
    public static final a4 SIGNUP_NAME_AGE_STEP = new a4("SIGNUP_NAME_AGE_STEP", 311);
    public static final a4 SIGNUP_AGE_GENDER_STEP = new a4("SIGNUP_AGE_GENDER_STEP", 312);
    public static final a4 SIGNUP_BIRTHDAY_STEP = new a4("SIGNUP_BIRTHDAY_STEP", 313);
    public static final a4 SIGNUP_PRIVACY_CONSENT_STEP = new a4("SIGNUP_PRIVACY_CONSENT_STEP", 314);
    public static final a4 SIGNUP_GENDER_STEP = new a4("SIGNUP_GENDER_STEP", 315);
    public static final a4 SIGNUP_EMAIL_OR_PHONE_NUMBER_STEP = new a4("SIGNUP_EMAIL_OR_PHONE_NUMBER_STEP", 316);
    public static final a4 SIGNUP_EMAIL_SENT_FOR_LOGIN_STEP = new a4("SIGNUP_EMAIL_SENT_FOR_LOGIN_STEP", 317);
    public static final a4 SIGNUP_GOOGLE_ONE_TAP_MODAL = new a4("SIGNUP_GOOGLE_ONE_TAP_MODAL", 318);
    public static final a4 SIGNUP_GOOGLE_ONE_TAP_CONFIRMATION_DIALOG = new a4("SIGNUP_GOOGLE_ONE_TAP_CONFIRMATION_DIALOG", 319);
    public static final a4 SIGNUP_EMAIL_PASSWORD = new a4("SIGNUP_EMAIL_PASSWORD", 320);
    public static final a4 SIGNUP_GPLUS = new a4("SIGNUP_GPLUS", 321);
    public static final a4 SIGNUP_FACEBOOK = new a4("SIGNUP_FACEBOOK", 322);
    public static final a4 SIGNUP_LINE = new a4("SIGNUP_LINE", 323);
    public static final a4 LOGIN_PASSWORD_STEP = new a4("LOGIN_PASSWORD_STEP", 324);
    public static final a4 SIGNUP_WEBSITE_STEP = new a4("SIGNUP_WEBSITE_STEP", 325);
    public static final a4 SIGNUP_BUSINESS_WEBSITE = new a4("SIGNUP_BUSINESS_WEBSITE", 326);
    public static final a4 SIGNUP_BUSINESS_INTENT_TO_ADVERTISE = new a4("SIGNUP_BUSINESS_INTENT_TO_ADVERTISE", 327);
    public static final a4 SIGNUP_BUSINESS_SALES_CONTACT = new a4("SIGNUP_BUSINESS_SALES_CONTACT", 328);
    public static final a4 SIGNUP_BUSINESS_TYPE = new a4("SIGNUP_BUSINESS_TYPE", 329);
    public static final a4 REBUILD_FEED_INTEREST_PICKER = new a4("REBUILD_FEED_INTEREST_PICKER", 330);
    public static final a4 REBUILD_FEED_END = new a4("REBUILD_FEED_END", 331);
    public static final a4 STORIES_RELATED_PINS = new a4("STORIES_RELATED_PINS", 332);
    public static final a4 STORIES_RELATED_USERS = new a4("STORIES_RELATED_USERS", 333);
    public static final a4 STORIES_RELATED_BOARDS = new a4("STORIES_RELATED_BOARDS", 334);
    public static final a4 STORIES_RELATED_INTERESTS = new a4("STORIES_RELATED_INTERESTS", 335);
    public static final a4 BROWSER = new a4("BROWSER", 336);
    public static final a4 OFF_PINTEREST = new a4("OFF_PINTEREST", 337);
    public static final a4 CONVERSATION_CREATE = new a4("CONVERSATION_CREATE", 338);
    public static final a4 CONVERSATION_THREAD = new a4("CONVERSATION_THREAD", 339);
    public static final a4 CONVERSATION_INBOX = new a4("CONVERSATION_INBOX", 340);
    public static final a4 CONVERSATION_ADD_PIN = new a4("CONVERSATION_ADD_PIN", 341);
    public static final a4 CONVERSATION_USERS = new a4("CONVERSATION_USERS", 342);
    public static final a4 CONVERSATION_CONTACT_REQUEST_INBOX = new a4("CONVERSATION_CONTACT_REQUEST_INBOX", 343);
    public static final a4 CONVERSATION_THREAD_CLOSEUP = new a4("CONVERSATION_THREAD_CLOSEUP", 344);
    public static final a4 CONVERSATION_SETTINGS_VIEW = new a4("CONVERSATION_SETTINGS_VIEW", 345);
    public static final a4 CONVERSATION_MESSAGES_AND_CONTACTS_INBOX = new a4("CONVERSATION_MESSAGES_AND_CONTACTS_INBOX", 346);
    public static final a4 NEWS_NETWORK_STORY = new a4("NEWS_NETWORK_STORY", 347);
    public static final a4 NEWS_YOUR_STORY = new a4("NEWS_YOUR_STORY", 348);
    public static final a4 PIN_TWINS = new a4("PIN_TWINS", 349);
    public static final a4 ACTIVITY_V2 = new a4("ACTIVITY_V2", 350);
    public static final a4 BUYABLE_MERCHANT_RETURN_POLICY = new a4("BUYABLE_MERCHANT_RETURN_POLICY", 351);
    public static final a4 BUYABLE_VARIANT_OPTIONS = new a4("BUYABLE_VARIANT_OPTIONS", 352);
    public static final a4 BUYABLE_CHECKOUT_APPLE_PAY_OPTION = new a4("BUYABLE_CHECKOUT_APPLE_PAY_OPTION", 353);
    public static final a4 BUYABLE_CHECKOUT_SUMMARY = new a4("BUYABLE_CHECKOUT_SUMMARY", 354);
    public static final a4 BUYABLE_SELECT_SHIPPING_ADDRESS = new a4("BUYABLE_SELECT_SHIPPING_ADDRESS", 355);
    public static final a4 BUYABLE_SHIPPING_ADDRESS_FORM = new a4("BUYABLE_SHIPPING_ADDRESS_FORM", 356);
    public static final a4 BUYABLE_SELECT_SHIPPING_METHOD = new a4("BUYABLE_SELECT_SHIPPING_METHOD", 357);
    public static final a4 BUYABLE_SELECT_PAYMENT = new a4("BUYABLE_SELECT_PAYMENT", 358);
    public static final a4 BUYABLE_PAYMENT_FORM = new a4("BUYABLE_PAYMENT_FORM", 359);
    public static final a4 BUYABLE_CONFIRMATION = new a4("BUYABLE_CONFIRMATION", 360);
    public static final a4 BUYABLE_ORDER_HISTORY = new a4("BUYABLE_ORDER_HISTORY", 361);
    public static final a4 BUYABLE_ORDER_DETAILS = new a4("BUYABLE_ORDER_DETAILS", 362);
    public static final a4 BUYABLE_ADDRESS_CONTACTS = new a4("BUYABLE_ADDRESS_CONTACTS", 363);
    public static final a4 BUYABLE_ADDRESS_RECENTS = new a4("BUYABLE_ADDRESS_RECENTS", 364);
    public static final a4 BUYABLE_SELECT_QUANTITY = new a4("BUYABLE_SELECT_QUANTITY", 365);
    public static final a4 BUYABLE_BAG_LIST = new a4("BUYABLE_BAG_LIST", 366);
    public static final a4 BUYABLE_BAG_DETAIL = new a4("BUYABLE_BAG_DETAIL", 367);
    public static final a4 BUYABLE_CHECKOUT_MULTI_SUMMARY = new a4("BUYABLE_CHECKOUT_MULTI_SUMMARY", 368);
    public static final a4 BUYABLE_SIMPLIFIED_CLOSEUP = new a4("BUYABLE_SIMPLIFIED_CLOSEUP", 369);
    public static final a4 BUYABLE_PRODUCT_VIEW = new a4("BUYABLE_PRODUCT_VIEW", 370);
    public static final a4 BUYABLE_EXPRESS_CHECKOUT_SHEET = new a4("BUYABLE_EXPRESS_CHECKOUT_SHEET", 371);
    public static final a4 BUYABLE_QUANTITY_SELECTION_SHEET = new a4("BUYABLE_QUANTITY_SELECTION_SHEET", 372);
    public static final a4 BUYABLE_SHOP_THE_LOOK = new a4("BUYABLE_SHOP_THE_LOOK", 373);
    public static final a4 PLACE_VIEW_HEADER = new a4("PLACE_VIEW_HEADER", 374);
    public static final a4 PLACE_VIEW_RELATED_PINS = new a4("PLACE_VIEW_RELATED_PINS", 375);
    public static final a4 EXTERNAL_SOURCE_OTHER = new a4("EXTERNAL_SOURCE_OTHER", 376);
    public static final a4 EMAIL_UNKNOWN = new a4("EMAIL_UNKNOWN", 377);
    public static final a4 EMAIL_TRANSACTIONAL = new a4("EMAIL_TRANSACTIONAL", 378);
    public static final a4 EMAIL_EDITORIAL = new a4("EMAIL_EDITORIAL", 379);
    public static final a4 EMAIL_ACTIVITY_AGGREGATION = new a4("EMAIL_ACTIVITY_AGGREGATION", 380);
    public static final a4 EMAIL_RECOMMENDATIONS_DIGEST = new a4("EMAIL_RECOMMENDATIONS_DIGEST", 381);
    public static final a4 EMAIL_SOCIAL_DIGEST = new a4("EMAIL_SOCIAL_DIGEST", 382);
    public static final a4 EMAIL_SEND_PIN = new a4("EMAIL_SEND_PIN", 383);
    public static final a4 EMAIL_SEND_BOARD = new a4("EMAIL_SEND_BOARD", 384);
    public static final a4 EMAIL_SEND_PINNER = new a4("EMAIL_SEND_PINNER", 385);
    public static final a4 EMAIL_FRIEND_JOINED = new a4("EMAIL_FRIEND_JOINED", 386);
    public static final a4 EMAIL_WELCOME = new a4("EMAIL_WELCOME", 387);
    public static final a4 EMAIL_BOARD_RECOMMENDATIONS = new a4("EMAIL_BOARD_RECOMMENDATIONS", 388);
    public static final a4 EMAIL_PIN_RECOMMENDATIONS = new a4("EMAIL_PIN_RECOMMENDATIONS", 389);
    public static final a4 EMAIL_COMMENT_AND_MENTION = new a4("EMAIL_COMMENT_AND_MENTION", 390);
    public static final a4 EMAIL_USECASES = new a4("EMAIL_USECASES", 391);
    public static final a4 EMAIL_FIREHOSE_QUESTION_CREATE = new a4("EMAIL_FIREHOSE_QUESTION_CREATE", 392);
    public static final a4 EMAIL_FIREHOSE_ANSWER_CREATE = new a4("EMAIL_FIREHOSE_ANSWER_CREATE", 393);
    public static final a4 EMAIL_FIREHOSE_REPLY_CREATE = new a4("EMAIL_FIREHOSE_REPLY_CREATE", 394);
    public static final a4 EMAIL_QUESTION_CREATE = new a4("EMAIL_QUESTION_CREATE", 395);
    public static final a4 EMAIL_ANSWER_CREATE = new a4("EMAIL_ANSWER_CREATE", 396);
    public static final a4 EMAIL_QUESTION_LIKE = new a4("EMAIL_QUESTION_LIKE", 397);
    public static final a4 EMAIL_ANSWER_LIKE = new a4("EMAIL_ANSWER_LIKE", 398);
    public static final a4 EMAIL_REPLY_CREATE = new a4("EMAIL_REPLY_CREATE", 399);
    public static final a4 EMAIL_PARTNER = new a4("EMAIL_PARTNER", 400);
    public static final a4 EMAIL_INTEREST_RECOMMENDATIONS = new a4("EMAIL_INTEREST_RECOMMENDATIONS", 401);
    public static final a4 EMAIL_HOMEFEED_NEW_PINS = new a4("EMAIL_HOMEFEED_NEW_PINS", 402);
    public static final a4 EMAIL_NETWORK_STORY_DIGEST = new a4("EMAIL_NETWORK_STORY_DIGEST", 403);
    public static final a4 EMAIL_PINVITATIONAL_ACCESS = new a4("EMAIL_PINVITATIONAL_ACCESS", 404);
    public static final a4 EMAIL_RESTART_FEED = new a4("EMAIL_RESTART_FEED", 405);
    public static final a4 EMAIL_PINVITATIONAL_RALLYING_CALL = new a4("EMAIL_PINVITATIONAL_RALLYING_CALL", 406);
    public static final a4 EMAIL_WEEK_IN_REVIEW = new a4("EMAIL_WEEK_IN_REVIEW", 407);
    public static final a4 EMAIL_NO_SIGNAL = new a4("EMAIL_NO_SIGNAL", 408);
    public static final a4 EMAIL_USER_RECOMMENDATIONS = new a4("EMAIL_USER_RECOMMENDATIONS", 409);
    public static final a4 EMAIL_BOARD_COLLABORATION = new a4("EMAIL_BOARD_COLLABORATION", 410);
    public static final a4 EMAIL_CONVERSATIONS = new a4("EMAIL_CONVERSATIONS", 411);
    public static final a4 EMAIL_LEGAL = new a4("EMAIL_LEGAL", 412);
    public static final a4 EMAIL_SECURITY = new a4("EMAIL_SECURITY", 413);
    public static final a4 SERVICE_ENTRY_SOCIAL_FACEBOOK = new a4("SERVICE_ENTRY_SOCIAL_FACEBOOK", 414);
    public static final a4 SERVICE_ENTRY_SOCIAL_TWITTER = new a4("SERVICE_ENTRY_SOCIAL_TWITTER", 415);
    public static final a4 SERVICE_ENTRY_SEO_GOOGLE = new a4("SERVICE_ENTRY_SEO_GOOGLE", 416);
    public static final a4 SERVICE_ENTRY_SEO_YAHOO = new a4("SERVICE_ENTRY_SEO_YAHOO", 417);
    public static final a4 SERVICE_ENTRY_SEO_BING = new a4("SERVICE_ENTRY_SEO_BING", 418);
    public static final a4 SERVICE_ENTRY_EXTERNAL_SHARE = new a4("SERVICE_ENTRY_EXTERNAL_SHARE", 419);
    public static final a4 SERVICE_ENTRY_BOARD_INVITE = new a4("SERVICE_ENTRY_BOARD_INVITE", 420);
    public static final a4 SERVICE_ENTRY_COMMUNITY_INVITE = new a4("SERVICE_ENTRY_COMMUNITY_INVITE", 421);
    public static final a4 SERVICE_ENTRY_WEB_UNKNOWN = new a4("SERVICE_ENTRY_WEB_UNKNOWN", 422);
    public static final a4 SERVICE_ENTRY_PAID_OTHER = new a4("SERVICE_ENTRY_PAID_OTHER", 423);
    public static final a4 SERVICE_ENTRY_PAID_INSTALL = new a4("SERVICE_ENTRY_PAID_INSTALL", 424);
    public static final a4 SERVICE_ENTRY_PAID_PRELOAD = new a4("SERVICE_ENTRY_PAID_PRELOAD", 425);
    public static final a4 SERVICE_ENTRY_PAID_WEB = new a4("SERVICE_ENTRY_PAID_WEB", 426);
    public static final a4 SERVICE_ENTRY_PAID_DEEPLINK_DIRECT = new a4("SERVICE_ENTRY_PAID_DEEPLINK_DIRECT", 427);
    public static final a4 SERVICE_ENTRY_PAID_DEEPLINK_MMP = new a4("SERVICE_ENTRY_PAID_DEEPLINK_MMP", 428);
    public static final a4 SERVICE_ENTRY_PAID_DEFERRED_DEEPLINK = new a4("SERVICE_ENTRY_PAID_DEFERRED_DEEPLINK", 429);
    public static final a4 SERVICE_ENTRY_PAID_SAMSUNG_MAPS = new a4("SERVICE_ENTRY_PAID_SAMSUNG_MAPS", 430);
    public static final a4 PINVITATIONAL_UNAUTH_EMAIL = new a4("PINVITATIONAL_UNAUTH_EMAIL", 431);
    public static final a4 PINVITATIONAL_UNAUTH_CONFIRM = new a4("PINVITATIONAL_UNAUTH_CONFIRM", 432);
    public static final a4 PINVITATIONAL_AUTH_CONFIRM = new a4("PINVITATIONAL_AUTH_CONFIRM", 433);
    public static final a4 PINVITATIONAL_SIGNUP_REDEMPTION = new a4("PINVITATIONAL_SIGNUP_REDEMPTION", 434);
    public static final a4 PINVITATIONAL_HOME_FEED_MODAL = new a4("PINVITATIONAL_HOME_FEED_MODAL", 435);
    public static final a4 PINVITATIONAL_PIN_SUMMARY = new a4("PINVITATIONAL_PIN_SUMMARY", 436);
    public static final a4 SETTINGS_SEARCH_PRIVACY = new a4("SETTINGS_SEARCH_PRIVACY", 437);
    public static final a4 SETTINGS_OFFLINE_BOARD = new a4("SETTINGS_OFFLINE_BOARD", 438);
    public static final a4 SETTINGS_EMAIL = new a4("SETTINGS_EMAIL", 439);
    public static final a4 SETTINGS_CONFIRM_EMAIL_CHANGE_MODAL = new a4("SETTINGS_CONFIRM_EMAIL_CHANGE_MODAL", 440);
    public static final a4 ACCOUNT_CLOSE = new a4("ACCOUNT_CLOSE", 441);
    public static final a4 ACCOUNT_DEACTIVATE = new a4("ACCOUNT_DEACTIVATE", 442);
    public static final a4 ACCOUNT_SETTINGS = new a4("ACCOUNT_SETTINGS", 443);
    public static final a4 PERSONAL_INFORMATION_SETTINGS = new a4("PERSONAL_INFORMATION_SETTINGS", 444);
    public static final a4 CLAIMED_ACCOUNTS_SETTINGS = new a4("CLAIMED_ACCOUNTS_SETTINGS", 445);
    public static final a4 ACCOUNT_CLAIMING_AUTO_ORGANIZE_PIN = new a4("ACCOUNT_CLAIMING_AUTO_ORGANIZE_PIN", 446);
    public static final a4 LINK_TO_PINTEREST_SETTINGS = new a4("LINK_TO_PINTEREST_SETTINGS", 447);
    public static final a4 PRIVACY_AND_DATA_SETTINGS = new a4("PRIVACY_AND_DATA_SETTINGS", 448);
    public static final a4 SECURITY_AND_LOGINS_SETTINGS = new a4("SECURITY_AND_LOGINS_SETTINGS", 449);
    public static final a4 PERMISSIONS_SETTINGS = new a4("PERMISSIONS_SETTINGS", 450);
    public static final a4 CONTENT_PERMISSIONS_SETTINGS = new a4("CONTENT_PERMISSIONS_SETTINGS", 451);
    public static final a4 BRANDED_CONTENT_SETTINGS = new a4("BRANDED_CONTENT_SETTINGS", 452);
    public static final a4 PARENTAL_PASSCODE_SETTINGS = new a4("PARENTAL_PASSCODE_SETTINGS", 453);
    public static final a4 PARENTAL_PASSCODE_INSTRUCTIONS = new a4("PARENTAL_PASSCODE_INSTRUCTIONS", 454);
    public static final a4 PARENTAL_PASSCODE_CODE = new a4("PARENTAL_PASSCODE_CODE", 455);
    public static final a4 PARENTAL_PASSCODE_BACKUP_EMAIL = new a4("PARENTAL_PASSCODE_BACKUP_EMAIL", 456);
    public static final a4 PARENTAL_PASSCODE_CONFIRMATION = new a4("PARENTAL_PASSCODE_CONFIRMATION", 457);
    public static final a4 CONNECTED_DEVICES = new a4("CONNECTED_DEVICES", 458);
    public static final a4 CONFIRM_REVOKE_SESSION = new a4("CONFIRM_REVOKE_SESSION", 459);
    public static final a4 SHARE_EXTENSION = new a4("SHARE_EXTENSION", 460);
    public static final a4 ACTION_EXTENSION = new a4("ACTION_EXTENSION", 461);
    public static final a4 MESSAGE_EXTENSION = new a4("MESSAGE_EXTENSION", 462);
    public static final a4 WIDGET_EXTENSION_SELECT_BOARD = new a4("WIDGET_EXTENSION_SELECT_BOARD", 463);
    public static final a4 WIDGET_EXTENSION_SELECT_USER = new a4("WIDGET_EXTENSION_SELECT_USER", 464);
    public static final a4 EXTENSION_UPSELL_TOAST = new a4("EXTENSION_UPSELL_TOAST", 465);
    public static final a4 EXTENSION_UPSELL_MODAL = new a4("EXTENSION_UPSELL_MODAL", 466);
    public static final a4 EXTENSION_UPSELL_NUX = new a4("EXTENSION_UPSELL_NUX", 467);
    public static final a4 EXTENSION_INSTALLED = new a4("EXTENSION_INSTALLED", AdSize.FULL_BANNER_WIDTH);
    public static final a4 EXTENSION_NOT_INSTALLED = new a4("EXTENSION_NOT_INSTALLED", 469);
    public static final a4 EXTENSION_UPSELL_NAG = new a4("EXTENSION_UPSELL_NAG", 470);
    public static final a4 EXTENSION_UPSELL_NAG_PIN_CREATE = new a4("EXTENSION_UPSELL_NAG_PIN_CREATE", 471);
    public static final a4 EXTENSION_UPSELL_CLOSEUP = new a4("EXTENSION_UPSELL_CLOSEUP", 472);
    public static final a4 FIND_FRIENDS_ADDRESS_BOOK = new a4("FIND_FRIENDS_ADDRESS_BOOK", 473);
    public static final a4 FIND_FRIENDS_FACEBOOK = new a4("FIND_FRIENDS_FACEBOOK", 474);
    public static final a4 FIND_FRIENDS_TWITTER = new a4("FIND_FRIENDS_TWITTER", 475);
    public static final a4 FIND_FRIENDS_MORE = new a4("FIND_FRIENDS_MORE", 476);
    public static final a4 FIND_FRIENDS_INVITE_ALL = new a4("FIND_FRIENDS_INVITE_ALL", 477);
    public static final a4 HOMEFEED_BUILDER = new a4("HOMEFEED_BUILDER", 478);
    public static final a4 HOMEFEED_BUILDER_SPLASH = new a4("HOMEFEED_BUILDER_SPLASH", 479);
    public static final a4 HOMEFEED_BUILDER_MY_TOPICS = new a4("HOMEFEED_BUILDER_MY_TOPICS", 480);
    public static final a4 HOMEFEED_BUILDER_MY_BOARDS = new a4("HOMEFEED_BUILDER_MY_BOARDS", 481);
    public static final a4 HOMEFEED_BUILDER_MY_USERS = new a4("HOMEFEED_BUILDER_MY_USERS", 482);
    public static final a4 HOMEFEED_BUILDER_REC_TOPICS = new a4("HOMEFEED_BUILDER_REC_TOPICS", 483);
    public static final a4 HOMEFEED_BUILDER_REC_BOARDS = new a4("HOMEFEED_BUILDER_REC_BOARDS", 484);
    public static final a4 HOMEFEED_BUILDER_REC_USERS = new a4("HOMEFEED_BUILDER_REC_USERS", 485);
    public static final a4 HOMEFEED_BUILDER_MY_PINS = new a4("HOMEFEED_BUILDER_MY_PINS", 486);
    public static final a4 CAMERA_PHOTO_PICKER = new a4("CAMERA_PHOTO_PICKER", 487);
    public static final a4 CAMERA_ALBUM_PICKER = new a4("CAMERA_ALBUM_PICKER", 488);
    public static final a4 CAMERA_MEDIA_CREATE = new a4("CAMERA_MEDIA_CREATE", 489);
    public static final a4 API_ENVIRONMENTS = new a4("API_ENVIRONMENTS", 490);
    public static final a4 FPE_CREATE_FIRST_BOARD = new a4("FPE_CREATE_FIRST_BOARD", 491);
    public static final a4 PUSH_NOTIFICATION_AGGREGATED_COMMENT = new a4("PUSH_NOTIFICATION_AGGREGATED_COMMENT", 492);
    public static final a4 PUSH_NOTIFICATION_CONVERSATION = new a4("PUSH_NOTIFICATION_CONVERSATION", 493);
    public static final a4 PUSH_NOTIFICATION_ACTION = new a4("PUSH_NOTIFICATION_ACTION", 494);
    public static final a4 PUSH_NOTIFICATION_SYSTEM_NEWS = new a4("PUSH_NOTIFICATION_SYSTEM_NEWS", 495);
    public static final a4 PUSH_NOTIFICATION_INTERACTION = new a4("PUSH_NOTIFICATION_INTERACTION", 496);
    public static final a4 PUSH_NOTIFICATION_FRIEND_NEWS = new a4("PUSH_NOTIFICATION_FRIEND_NEWS", 497);
    public static final a4 PUSH_NOTIFICATION_EDITORIAL = new a4("PUSH_NOTIFICATION_EDITORIAL", 498);
    public static final a4 PUSH_NOTIFICATION_UNKNOWN = new a4("PUSH_NOTIFICATION_UNKNOWN", 499);
    public static final a4 NOTIFICATION_PERMISSIONS_CHANGE = new a4("NOTIFICATION_PERMISSIONS_CHANGE", 500);
    public static final a4 SEND_SHARE_MAIN = new a4("SEND_SHARE_MAIN", 501);
    public static final a4 SEND_SHARE_SEARCH = new a4("SEND_SHARE_SEARCH", 502);
    public static final a4 PIN_FLASHLIGHT_RESULTS = new a4("PIN_FLASHLIGHT_RESULTS", 503);
    public static final a4 PIN_SHOPPING_RESULTS = new a4("PIN_SHOPPING_RESULTS", 504);
    public static final a4 FLASHLIGHT_CAMERA_RESULTS = new a4("FLASHLIGHT_CAMERA_RESULTS", 505);
    public static final a4 FLASHLIGHT_PINCH_TO_ZOOM = new a4("FLASHLIGHT_PINCH_TO_ZOOM", 506);
    public static final a4 VISUAL_SEARCH_PRODUCT_FEED = new a4("VISUAL_SEARCH_PRODUCT_FEED", 507);
    public static final a4 LENS_HISTORY_RESULTS = new a4("LENS_HISTORY_RESULTS", 508);
    public static final a4 FEED_SHOP_SPACE = new a4("FEED_SHOP_SPACE", 509);
    public static final a4 FEED_TODAYS_PICKS = new a4("FEED_TODAYS_PICKS", 510);
    public static final a4 FEED_BUYABLE_CATEGORY = new a4("FEED_BUYABLE_CATEGORY", 511);
    public static final a4 FEED_TOP_SHOPS = new a4("FEED_TOP_SHOPS", BitmapUtils.BITMAP_TO_JPEG_SIZE);
    public static final a4 FEED_ALL_SHOPS = new a4("FEED_ALL_SHOPS", 513);
    public static final a4 CONFIRM_WEBSITE_BY_NAG = new a4("CONFIRM_WEBSITE_BY_NAG", 514);
    public static final a4 EXPLORE_STORY = new a4("EXPLORE_STORY", 515);
    public static final a4 USER_DID_IT = new a4("USER_DID_IT", 516);
    public static final a4 EXPLORE = new a4("EXPLORE", 517);
    public static final a4 EXPLORE_KLP = new a4("EXPLORE_KLP", 518);
    public static final a4 EXPLORE_SECTION_PICKER = new a4("EXPLORE_SECTION_PICKER", 519);
    public static final a4 EXPLORE_ARTICLE = new a4("EXPLORE_ARTICLE", 520);
    public static final a4 EXPLORE_VIDEO_ARTICLE = new a4("EXPLORE_VIDEO_ARTICLE", 521);
    public static final a4 BOARD_PLUS_MODAL_HALF = new a4("BOARD_PLUS_MODAL_HALF", 522);
    public static final a4 BOARD_PLUS_MODAL_FULL = new a4("BOARD_PLUS_MODAL_FULL", 523);
    public static final a4 BOARD_BOTTOM_OF_BOARD_FULL = new a4("BOARD_BOTTOM_OF_BOARD_FULL", 524);
    public static final a4 BOARD_BOTTOM_OF_BOARD_PEEK = new a4("BOARD_BOTTOM_OF_BOARD_PEEK", 525);
    public static final a4 NEWS_HUB_FEED = new a4("NEWS_HUB_FEED", 526);
    public static final a4 NEWS_HUB_DETAIL = new a4("NEWS_HUB_DETAIL", 527);
    public static final a4 NEWS_HUB_EMPTY_STATE = new a4("NEWS_HUB_EMPTY_STATE", 528);
    public static final a4 MODAL_CREATE_CAMPAIGN = new a4("MODAL_CREATE_CAMPAIGN", 529);
    public static final a4 ADVERTISING_TOS = new a4("ADVERTISING_TOS", 530);
    public static final a4 FLASHLIGHT_CAMERA_CAPTURE_READY = new a4("FLASHLIGHT_CAMERA_CAPTURE_READY", 531);
    public static final a4 FLASHLIGHT_CAMERA_SEARCH_RESULTS = new a4("FLASHLIGHT_CAMERA_SEARCH_RESULTS", 532);
    public static final a4 FLASHLIGHT_CAMERA_ANALYZING = new a4("FLASHLIGHT_CAMERA_ANALYZING", 533);
    public static final a4 INSTANT_ARTICLE = new a4("INSTANT_ARTICLE", 534);
    public static final a4 INSTANT_CONTENT = new a4("INSTANT_CONTENT", 535);
    public static final a4 INSTANT_CONTENT_IN_APP_BROWSER = new a4("INSTANT_CONTENT_IN_APP_BROWSER", 536);
    public static final a4 INSTANT_CONTENT_COOKING_LESSON = new a4("INSTANT_CONTENT_COOKING_LESSON", 537);
    public static final a4 DID_IT_CREATE = new a4("DID_IT_CREATE", 538);
    public static final a4 DID_IT_EDIT = new a4("DID_IT_EDIT", 539);
    public static final a4 EMAIL_SEND_DID_IT = new a4("EMAIL_SEND_DID_IT", 540);
    public static final a4 SHOPPING_LIST_AGGREGATE = new a4("SHOPPING_LIST_AGGREGATE", 541);
    public static final a4 SHOPPING_LIST_BY_PIN = new a4("SHOPPING_LIST_BY_PIN", 542);
    public static final a4 QUIZZES_RESULT_OUTPUT = new a4("QUIZZES_RESULT_OUTPUT", 543);
    public static final a4 QUIZZES_QUESTION = new a4("QUIZZES_QUESTION", 544);
    public static final a4 PIN_REMINDER_ADD_NEW = new a4("PIN_REMINDER_ADD_NEW", 545);
    public static final a4 PIN_REMINDER_VIEW_EXISTING = new a4("PIN_REMINDER_VIEW_EXISTING", 546);
    public static final a4 PARTNER_CONVERT = new a4("PARTNER_CONVERT", 547);
    public static final a4 PARTNER_SIGNUP = new a4("PARTNER_SIGNUP", 548);
    public static final a4 BOARD_SECTION_EDIT = new a4("BOARD_SECTION_EDIT", 549);
    public static final a4 BOARD_SECTION_SELECT_PINS = new a4("BOARD_SECTION_SELECT_PINS", 550);
    public static final a4 BOARD_SECTION_CREATE = new a4("BOARD_SECTION_CREATE", 551);
    public static final a4 BOARD_SECTION_PICKER = new a4("BOARD_SECTION_PICKER", 552);
    public static final a4 BOARD_SECTION_REORDER_SECTIONS = new a4("BOARD_SECTION_REORDER_SECTIONS", 553);
    public static final a4 BOARD_SECTION_RECOMMENDED_PINS = new a4("BOARD_SECTION_RECOMMENDED_PINS", 554);
    public static final a4 BOARD_SECTION_IDEAS = new a4("BOARD_SECTION_IDEAS", 555);
    public static final a4 STORY_PIN_GAME = new a4("STORY_PIN_GAME", 556);
    public static final a4 STORY_TOPIC_GAME = new a4("STORY_TOPIC_GAME", 557);
    public static final a4 BUBBLE_HEADER = new a4("BUBBLE_HEADER", 558);
    public static final a4 VISUAL_TAGS_CREATE = new a4("VISUAL_TAGS_CREATE", 559);
    public static final a4 VISUAL_TAGS_EDIT = new a4("VISUAL_TAGS_EDIT", 560);
    public static final a4 CREATOR_RECOMMENDATIONS = new a4("CREATOR_RECOMMENDATIONS", 561);
    public static final a4 COMMUNITY_AGGREGATED = new a4("COMMUNITY_AGGREGATED", 562);
    public static final a4 COMMUNITY_BANNED = new a4("COMMUNITY_BANNED", 563);
    public static final a4 COMMUNITY_COMPOSER = new a4("COMMUNITY_COMPOSER", 564);
    public static final a4 COMMUNITY_CREATE = new a4("COMMUNITY_CREATE", 565);
    public static final a4 COMMUNITY_DETAIL = new a4("COMMUNITY_DETAIL", 566);
    public static final a4 COMMUNITY_DIRECTORY = new a4("COMMUNITY_DIRECTORY", 567);
    public static final a4 COMMUNITY_EDIT = new a4("COMMUNITY_EDIT", 568);
    public static final a4 COMMUNITY_INVITE = new a4("COMMUNITY_INVITE", 569);
    public static final a4 COMMUNITY_PEOPLE = new a4("COMMUNITY_PEOPLE", 570);
    public static final a4 COMMUNITY_POST_REPLIES = new a4("COMMUNITY_POST_REPLIES", 571);
    public static final a4 TASTE_REFINEMENT_INTRO = new a4("TASTE_REFINEMENT_INTRO", 572);
    public static final a4 TASTE_REFINEMENT_INTERESTS_PICKER = new a4("TASTE_REFINEMENT_INTERESTS_PICKER", 573);
    public static final a4 TASTE_REFINEMENT_L1_L2_INTERESTS_PICKER = new a4("TASTE_REFINEMENT_L1_L2_INTERESTS_PICKER", 574);
    public static final a4 BOARD_IDEAS_DISCOVERY_FEED = new a4("BOARD_IDEAS_DISCOVERY_FEED", 575);
    public static final a4 BOARD_IDEAS_SHOPPING_FEED = new a4("BOARD_IDEAS_SHOPPING_FEED", 576);
    public static final a4 BOARD_IDEAS_SIMILAR_BOARDS_FEED = new a4("BOARD_IDEAS_SIMILAR_BOARDS_FEED", 577);
    public static final a4 BOARD_IDEAS_PROFESSIONAL_SERVICES_FEED = new a4("BOARD_IDEAS_PROFESSIONAL_SERVICES_FEED", 578);
    public static final a4 BOARD_IDEAS_BIRTHDAY_FEED = new a4("BOARD_IDEAS_BIRTHDAY_FEED", 579);
    public static final a4 AMP_VIEWER = new a4("AMP_VIEWER", 580);
    public static final a4 GDPR_AGE_COLLECTION_STEP = new a4("GDPR_AGE_COLLECTION_STEP", 581);
    public static final a4 GDPR_PARENTAL_EMAIL_COLLECTION_STEP = new a4("GDPR_PARENTAL_EMAIL_COLLECTION_STEP", 582);
    public static final a4 REDISCOVERY_FEED = new a4("REDISCOVERY_FEED", 583);
    public static final a4 WEB_TOPIC_PAGE = new a4("WEB_TOPIC_PAGE", 584);
    public static final a4 WEB_TOPIC_FEED = new a4("WEB_TOPIC_FEED", 585);
    public static final a4 TOPIC_EDUCATION = new a4("TOPIC_EDUCATION", 586);
    public static final a4 REORDER_BOARDS = new a4("REORDER_BOARDS", 587);
    public static final a4 REORDER_PINS = new a4("REORDER_PINS", 588);
    public static final a4 REORDER_SECTIONS = new a4("REORDER_SECTIONS", 589);
    public static final a4 SOCIAL_MANAGER_UNREAD = new a4("SOCIAL_MANAGER_UNREAD", 590);
    public static final a4 SOCIAL_MANAGER_READ = new a4("SOCIAL_MANAGER_READ", 591);
    public static final a4 GRID_EDUCATION_STORY = new a4("GRID_EDUCATION_STORY", 592);
    public static final a4 STORY_PIN_CREATE = new a4("STORY_PIN_CREATE", 593);
    public static final a4 STORY_PIN_AD_PAGE_CREATE = new a4("STORY_PIN_AD_PAGE_CREATE", 594);
    public static final a4 STORY_PIN_COVER_PAGE_CREATE = new a4("STORY_PIN_COVER_PAGE_CREATE", 595);
    public static final a4 STORY_PIN_MEDIA_PAGE_CREATE = new a4("STORY_PIN_MEDIA_PAGE_CREATE", 596);
    public static final a4 STORY_PIN_TEXT_PAGE_CREATE = new a4("STORY_PIN_TEXT_PAGE_CREATE", 597);
    public static final a4 STORY_PIN_EDIT = new a4("STORY_PIN_EDIT", 598);
    public static final a4 STORY_PIN_MULTI_PHOTO_PICKER = new a4("STORY_PIN_MULTI_PHOTO_PICKER", 599);
    public static final a4 STORY_PIN_INGREDIENTS_PAGE_CREATE = new a4("STORY_PIN_INGREDIENTS_PAGE_CREATE", AdSize.WIDE_SKYSCRAPER_HEIGHT);
    public static final a4 STORY_PIN_SUPPLIES_PAGE_CREATE = new a4("STORY_PIN_SUPPLIES_PAGE_CREATE", 601);
    public static final a4 STORY_PIN_LIST = new a4("STORY_PIN_LIST", 602);
    public static final a4 IDEA_PIN_EDUCATION = new a4("IDEA_PIN_EDUCATION", 603);
    public static final a4 IDEA_PINEDUCATION_VIEW_PAGER = new a4("IDEA_PINEDUCATION_VIEW_PAGER", 604);
    public static final a4 STORY_PIN_PRODUCT_TAGS_LIST = new a4("STORY_PIN_PRODUCT_TAGS_LIST", 605);
    public static final a4 STORY_PIN_BULK_ACTIONS = new a4("STORY_PIN_BULK_ACTIONS", 606);
    public static final a4 CREATOR_RELATED_PINS_GRID = new a4("CREATOR_RELATED_PINS_GRID", 607);
    public static final a4 SOMETHING_WENT_WRONG = new a4("SOMETHING_WENT_WRONG", 608);
    public static final a4 SIMILAR_PINS_GRID = new a4("SIMILAR_PINS_GRID", 609);
    public static final a4 FIRST_AD_CREATE_PAGE = new a4("FIRST_AD_CREATE_PAGE", 610);
    public static final a4 FIRST_PIN_CREATE_PAGE = new a4("FIRST_PIN_CREATE_PAGE", 611);
    public static final a4 SHOPPING_BRAND_FILTER_MODAL = new a4("SHOPPING_BRAND_FILTER_MODAL", 612);
    public static final a4 SHOPPING_PRICE_FILTER_MODAL = new a4("SHOPPING_PRICE_FILTER_MODAL", 613);
    public static final a4 SHOPPING_BRAND_AFFINITY_DISCOVERY = new a4("SHOPPING_BRAND_AFFINITY_DISCOVERY", 614);
    public static final a4 FEED_REVERSE_STELA = new a4("FEED_REVERSE_STELA", 615);
    public static final a4 SHOPPING_PRODUCT_FILTER = new a4("SHOPPING_PRODUCT_FILTER", 616);
    public static final a4 SHOPPING_RELATED_PRODUCTS_FEED = new a4("SHOPPING_RELATED_PRODUCTS_FEED", 617);
    public static final a4 SHOPPING_STELA_PRODUCTS_FEED = new a4("SHOPPING_STELA_PRODUCTS_FEED", 618);
    public static final a4 SHOPPING_DOT_FEED = new a4("SHOPPING_DOT_FEED", 619);
    public static final a4 PRODUCT_DETAIL_PAGE_FEED = new a4("PRODUCT_DETAIL_PAGE_FEED", 620);
    public static final a4 FILTER_PANEL = new a4("FILTER_PANEL", 621);
    public static final a4 PRODUCT_TAGGING_SEARCH_PRODUCT_FEED = new a4("PRODUCT_TAGGING_SEARCH_PRODUCT_FEED", 622);
    public static final a4 VTO_PRODUCT_TAGGING_PRODUCT_FEED = new a4("VTO_PRODUCT_TAGGING_PRODUCT_FEED", 623);
    public static final a4 VTO_PRODUCT_TAGGING_PREVIEW_CAMERA_PERMISSIONS_REQUESTED = new a4("VTO_PRODUCT_TAGGING_PREVIEW_CAMERA_PERMISSIONS_REQUESTED", 624);
    public static final a4 VTO_PRODUCT_TAGGING_PREVIEW_CAMERA_PERMISSIONS_GRANTED = new a4("VTO_PRODUCT_TAGGING_PREVIEW_CAMERA_PERMISSIONS_GRANTED", 625);
    public static final a4 PRODUCT_TAGGING_URL = new a4("PRODUCT_TAGGING_URL", 626);
    public static final a4 PRODUCT_TAGGING_IMAGE_PICKER = new a4("PRODUCT_TAGGING_IMAGE_PICKER", 627);
    public static final a4 FEED_IDEA_PIN_STELA_PRODUCTS = new a4("FEED_IDEA_PIN_STELA_PRODUCTS", 628);
    public static final a4 FEED_PB_RECOMMENDED_SEARCH = new a4("FEED_PB_RECOMMENDED_SEARCH", 629);
    public static final a4 FEED_PB_SALE = new a4("FEED_PB_SALE", 630);
    public static final a4 FEED_PB_NEW_ARRIVALS = new a4("FEED_PB_NEW_ARRIVALS", 631);
    public static final a4 FEED_PB_BUBBLE = new a4("FEED_PB_BUBBLE", 632);
    public static final a4 FEED_PB_BOARD = new a4("FEED_PB_BOARD", 633);
    public static final a4 FEED_PB_BRAND = new a4("FEED_PB_BRAND", 634);
    public static final a4 FEED_PB_INSPO = new a4("FEED_PB_INSPO", 635);
    public static final a4 PERSONAL_BOUTIQUE = new a4("PERSONAL_BOUTIQUE", 636);
    public static final a4 PERSONAL_BOUTIQUE_BRAND_DISCOVERY = new a4("PERSONAL_BOUTIQUE_BRAND_DISCOVERY", 637);
    public static final a4 PERSONAL_BOUTIQUE_BRAND_INSPO_GROUPS = new a4("PERSONAL_BOUTIQUE_BRAND_INSPO_GROUPS", 638);
    public static final a4 PERSONAL_BOUTIQUE_SEARCH = new a4("PERSONAL_BOUTIQUE_SEARCH", 639);
    public static final a4 PERSONAL_BOUTIQUE_SEARCH_AUTOCOMPLETE = new a4("PERSONAL_BOUTIQUE_SEARCH_AUTOCOMPLETE", 640);
    public static final a4 PERSONAL_BOUTIQUE_MERCHANT_TUNER = new a4("PERSONAL_BOUTIQUE_MERCHANT_TUNER", 641);
    public static final a4 PERSONAL_BOUTIQUE_ONBOARDING_INTERESTS = new a4("PERSONAL_BOUTIQUE_ONBOARDING_INTERESTS", 642);
    public static final a4 PERSONAL_BOUTIQUE_ONBOARDING_MERCHANTS = new a4("PERSONAL_BOUTIQUE_ONBOARDING_MERCHANTS", 643);
    public static final a4 PERSONAL_BOUTIQUE_HEADER = new a4("PERSONAL_BOUTIQUE_HEADER", 644);
    public static final a4 PINTEREST_CREATE_CAMERA = new a4("PINTEREST_CREATE_CAMERA", 645);
    public static final a4 PINTEREST_CREATE_TEXT = new a4("PINTEREST_CREATE_TEXT", 646);
    public static final a4 ADS_AGE_AND_GENDER = new a4("ADS_AGE_AND_GENDER", 647);
    public static final a4 ADS_BILLING_INFO = new a4("ADS_BILLING_INFO", 648);
    public static final a4 ADS_BUSINESS_SETTINGS = new a4("ADS_BUSINESS_SETTINGS", 649);
    public static final a4 ADS_CHOOSE_PIN_TO_PROMOTE = new a4("ADS_CHOOSE_PIN_TO_PROMOTE", 650);
    public static final a4 ADS_CREATE_AD_SUCCESS = new a4("ADS_CREATE_AD_SUCCESS", 651);
    public static final a4 ADS_DURATION_AND_BUDGET = new a4("ADS_DURATION_AND_BUDGET", 652);
    public static final a4 ADS_INTERESTS = new a4("ADS_INTERESTS", 653);
    public static final a4 ADS_LOCATIONS = new a4("ADS_LOCATIONS", 654);
    public static final a4 ADS_NOTIFICATIONS = new a4("ADS_NOTIFICATIONS", 655);
    public static final a4 ADS_REVIEW_YOUR_AD = new a4("ADS_REVIEW_YOUR_AD", 656);
    public static final a4 ADS_TARGETING = new a4("ADS_TARGETING", 657);
    public static final a4 ADS_UPDATE_BILLING = new a4("ADS_UPDATE_BILLING", 658);
    public static final a4 ADS_TERMS_OF_SERVICES = new a4("ADS_TERMS_OF_SERVICES", 659);
    public static final a4 ADS_KEYWORDS = new a4("ADS_KEYWORDS", 660);
    public static final a4 HOMEFEED_CONTROL_ACTIVITY = new a4("HOMEFEED_CONTROL_ACTIVITY", 661);
    public static final a4 HOMEFEED_CONTROL_BOARDS = new a4("HOMEFEED_CONTROL_BOARDS", 662);
    public static final a4 HOMEFEED_CONTROL_INTERESTS = new a4("HOMEFEED_CONTROL_INTERESTS", 663);
    public static final a4 HOMEFEED_CONTROL_TOPICS = new a4("HOMEFEED_CONTROL_TOPICS", 664);
    public static final a4 HOMEFEED_CONTROL_QUIZ = new a4("HOMEFEED_CONTROL_QUIZ", 665);
    public static final a4 HOMEFEED_CONTROL_PROFILES = new a4("HOMEFEED_CONTROL_PROFILES", 666);
    public static final a4 HOMEFEED_CONTROL_FOLLOWING = new a4("HOMEFEED_CONTROL_FOLLOWING", 667);
    public static final a4 NAVIGATION_UNAUTH_FOLLOWING = new a4("NAVIGATION_UNAUTH_FOLLOWING", 668);
    public static final a4 NAVIGATION_UNAUTH_NOTIFICATION = new a4("NAVIGATION_UNAUTH_NOTIFICATION", 669);
    public static final a4 NAVIGATION_UNAUTH_SAVED = new a4("NAVIGATION_UNAUTH_SAVED", 670);
    public static final a4 MWEB_NUX_CHECKLIST_CLOSEUP = new a4("MWEB_NUX_CHECKLIST_CLOSEUP", 671);
    public static final a4 MWEB_NUX_CHECKLIST_SAVE = new a4("MWEB_NUX_CHECKLIST_SAVE", 672);
    public static final a4 WINDOWS_PWA_UPSELL = new a4("WINDOWS_PWA_UPSELL", 673);
    public static final a4 BRAND_SURVEY_LEGACY = new a4("BRAND_SURVEY_LEGACY", 674);
    public static final a4 BRAND_SURVEY_EXPRESS = new a4("BRAND_SURVEY_EXPRESS", 675);
    public static final a4 AD_CREDITS_OFFER = new a4("AD_CREDITS_OFFER", 676);
    public static final a4 PIN_REACTION_USERS = new a4("PIN_REACTION_USERS", 677);
    public static final a4 ONBOARDING_SHARE_IDEAS = new a4("ONBOARDING_SHARE_IDEAS", 678);
    public static final a4 ONBOARDING_GROW_AUDIENCE = new a4("ONBOARDING_GROW_AUDIENCE", 679);
    public static final a4 ONBOARDING_BUILD_PROFILE = new a4("ONBOARDING_BUILD_PROFILE", 680);
    public static final a4 ONBOARDING_COMPLETE_SCREEN = new a4("ONBOARDING_COMPLETE_SCREEN", 681);
    public static final a4 ONBOARDING_COPY_BOARD = new a4("ONBOARDING_COPY_BOARD", 682);
    public static final a4 NEW_USE_CASE_FEED = new a4("NEW_USE_CASE_FEED", 683);
    public static final a4 AD_PREVIEW_FEED = new a4("AD_PREVIEW_FEED", 684);
    public static final a4 HOMEFEED_RELEVANCE_MULTIPIN = new a4("HOMEFEED_RELEVANCE_MULTIPIN", 685);
    public static final a4 BUSINESS_ACCOUNT_LOGIN = new a4("BUSINESS_ACCOUNT_LOGIN", 686);
    public static final a4 BUSINESS_ACCOUNT_SWITCHER = new a4("BUSINESS_ACCOUNT_SWITCHER", 687);
    public static final a4 LINKED_BUSINESS_ACCOUNT_CREATE = new a4("LINKED_BUSINESS_ACCOUNT_CREATE", 688);
    public static final a4 LINKED_BUSINESS_ACCOUNT_CONFIRMATION_MODAL = new a4("LINKED_BUSINESS_ACCOUNT_CONFIRMATION_MODAL", 689);
    public static final a4 HOMEFEED_PIN_QUIZ_SELECTION = new a4("HOMEFEED_PIN_QUIZ_SELECTION", 690);
    public static final a4 HOMEFEED_PIN_QUIZ_RATING = new a4("HOMEFEED_PIN_QUIZ_RATING", 691);
    public static final a4 HOMEFEED_NUX_MULTIPIN = new a4("HOMEFEED_NUX_MULTIPIN", 692);
    public static final a4 FEED_CREATOR_SPOTLIGHT = new a4("FEED_CREATOR_SPOTLIGHT", 693);
    public static final a4 PWA_CHROME = new a4("PWA_CHROME", 694);
    public static final a4 PWA_SAFARI = new a4("PWA_SAFARI", 695);
    public static final a4 PWA_UNKNOWN = new a4("PWA_UNKNOWN", 696);
    public static final a4 PWA_TWA_TWA = new a4("PWA_TWA_TWA", 697);
    public static final a4 PWA_TWA_CCT = new a4("PWA_TWA_CCT", 698);
    public static final a4 PWA_TWA_BROWSER = new a4("PWA_TWA_BROWSER", 699);
    public static final a4 PWA_TWA_WEBVIEW = new a4("PWA_TWA_WEBVIEW", 700);
    public static final a4 LITE_TWA_UPSELL = new a4("LITE_TWA_UPSELL", 701);
    public static final a4 EXPLORE_TAB = new a4("EXPLORE_TAB", 702);
    public static final a4 TODAY_TAB = new a4("TODAY_TAB", 703);
    public static final a4 TODAY_ARTICLE_FEED = new a4("TODAY_ARTICLE_FEED", 704);
    public static final a4 TODAY_INTEREST_FEED = new a4("TODAY_INTEREST_FEED", 705);
    public static final a4 TOP_ADS_PAGE = new a4("TOP_ADS_PAGE", 706);
    public static final a4 POSTNUX_MODAL = new a4("POSTNUX_MODAL", 707);
    public static final a4 FEED_MORE_FROM_CREATOR = new a4("FEED_MORE_FROM_CREATOR", 708);
    public static final a4 PINTEREST_TAG_INSTALL_GTM = new a4("PINTEREST_TAG_INSTALL_GTM", 709);
    public static final a4 PINTEREST_TAG_INSTALL_SHOPIFY = new a4("PINTEREST_TAG_INSTALL_SHOPIFY", 710);
    public static final a4 PINTEREST_TAG_INSTALL_WOOCOMMERCE = new a4("PINTEREST_TAG_INSTALL_WOOCOMMERCE", 711);
    public static final a4 PINTEREST_TAG_INSTALL_PIXELYOURSITE_WOOCOMMERCE = new a4("PINTEREST_TAG_INSTALL_PIXELYOURSITE_WOOCOMMERCE", 712);
    public static final a4 PINTEREST_TAG_INSTALL_PIXELYOURSITE_WORDPRESS = new a4("PINTEREST_TAG_INSTALL_PIXELYOURSITE_WORDPRESS", 713);
    public static final a4 PINTEREST_TAG_INSTALL_WEEBLY = new a4("PINTEREST_TAG_INSTALL_WEEBLY", 714);
    public static final a4 PINTEREST_TAG_INSTALL_ECWID = new a4("PINTEREST_TAG_INSTALL_ECWID", 715);
    public static final a4 PINTEREST_TAG_INSTALL_APPTRAIN_MAGENTO = new a4("PINTEREST_TAG_INSTALL_APPTRAIN_MAGENTO", 716);
    public static final a4 PINTEREST_TAG_INSTALL_PREMMERCE = new a4("PINTEREST_TAG_INSTALL_PREMMERCE", 717);
    public static final a4 PINTEREST_TAG_INSTALL_BIGCOMMERCE = new a4("PINTEREST_TAG_INSTALL_BIGCOMMERCE", 718);
    public static final a4 PINTEREST_TAG_INSTALL_TEALIUM = new a4("PINTEREST_TAG_INSTALL_TEALIUM", 719);
    public static final a4 PINTEREST_TAG_INSTALL_SQUARESPACE = new a4("PINTEREST_TAG_INSTALL_SQUARESPACE", 720);
    public static final a4 PINTEREST_TAG_INSTALL_MANUAL = new a4("PINTEREST_TAG_INSTALL_MANUAL", 721);
    public static final a4 PINTEREST_TAG_MANUAL_MODAL = new a4("PINTEREST_TAG_MANUAL_MODAL", 722);
    public static final a4 PINTEREST_TAG_PARTNER_MODAL = new a4("PINTEREST_TAG_PARTNER_MODAL", 723);
    public static final a4 PINTEREST_TAG_VERIFY = new a4("PINTEREST_TAG_VERIFY", 724);
    public static final a4 PINTEREST_TAG_INSTALL_GTM_EVENTS = new a4("PINTEREST_TAG_INSTALL_GTM_EVENTS", 725);
    public static final a4 PINTEREST_TAG_INSTALL_SETUP_FLOW = new a4("PINTEREST_TAG_INSTALL_SETUP_FLOW", 726);
    public static final a4 PINTEREST_TAG_INSTALL_MODAL = new a4("PINTEREST_TAG_INSTALL_MODAL", 727);
    public static final a4 PINTEREST_TAG_INSTALL_GET_STARTED_SETUP_FLOW = new a4("PINTEREST_TAG_INSTALL_GET_STARTED_SETUP_FLOW", AdSize.LEADERBOARD_WIDTH);
    public static final a4 PINTEREST_TAG_INSTALL_GET_STARTED_MODAL = new a4("PINTEREST_TAG_INSTALL_GET_STARTED_MODAL", 729);
    public static final a4 PINTEREST_TAG_PARTNER_INTEGRATION_LED_PARTNER_MODAL = new a4("PINTEREST_TAG_PARTNER_INTEGRATION_LED_PARTNER_MODAL", 730);
    public static final a4 PINTEREST_TAG_PARTNER_INTEGRATION_LED_PARTNER_CARD = new a4("PINTEREST_TAG_PARTNER_INTEGRATION_LED_PARTNER_CARD", 731);
    public static final a4 PINTEREST_TAG_PARTNER_INTEGRATION_LED_MANUAL_SETUP = new a4("PINTEREST_TAG_PARTNER_INTEGRATION_LED_MANUAL_SETUP", 732);
    public static final a4 PINTEREST_TAG_PARTNER_INTEGRATION_LED_EMAIL_INSTRUCTIONS = new a4("PINTEREST_TAG_PARTNER_INTEGRATION_LED_EMAIL_INSTRUCTIONS", 733);
    public static final a4 PINTEREST_TAG_PARTNER_INTEGRATION_LED_NOT_ELIGIBLE = new a4("PINTEREST_TAG_PARTNER_INTEGRATION_LED_NOT_ELIGIBLE", 734);
    public static final a4 BUSINESS_SITE_CARD_CAROUSEL = new a4("BUSINESS_SITE_CARD_CAROUSEL", 735);
    public static final a4 DATE_SELECTOR_ADD = new a4("DATE_SELECTOR_ADD", 736);
    public static final a4 DATE_SELECTOR_UPDATE = new a4("DATE_SELECTOR_UPDATE", 737);
    public static final a4 FEED_ALL_STYLES = new a4("FEED_ALL_STYLES", 738);
    public static final a4 FEED_IDEA_STREAMS = new a4("FEED_IDEA_STREAMS", 739);
    public static final a4 FEED_CREATOR_BUBBLE = new a4("FEED_CREATOR_BUBBLE", 740);
    public static final a4 FEED_POPULAR_TAB = new a4("FEED_POPULAR_TAB", 741);
    public static final a4 FEED_DISCOVER_CREATORS_PORTAL = new a4("FEED_DISCOVER_CREATORS_PORTAL", 742);
    public static final a4 FEED_DISCOVER_CREATORS_BUBBLE = new a4("FEED_DISCOVER_CREATORS_BUBBLE", 743);
    public static final a4 FEED_NOTIFICATION_CREATOR_BUBBLE = new a4("FEED_NOTIFICATION_CREATOR_BUBBLE", 744);
    public static final a4 STORY_PIN_RESPONSES_GALLERY_SELF = new a4("STORY_PIN_RESPONSES_GALLERY_SELF", 745);
    public static final a4 STORY_PIN_RESPONSES_GALLERY_OTHERS = new a4("STORY_PIN_RESPONSES_GALLERY_OTHERS", 746);
    public static final a4 STORY_PIN_RESPONSE_SELF = new a4("STORY_PIN_RESPONSE_SELF", 747);
    public static final a4 STORY_PIN_RESPONSE_OTHERS = new a4("STORY_PIN_RESPONSE_OTHERS", 748);
    public static final a4 CREATOR_BUBBLE_EDUCATION = new a4("CREATOR_BUBBLE_EDUCATION", 749);
    public static final a4 BOARD_NOTE_SELECT_PINS = new a4("BOARD_NOTE_SELECT_PINS", 750);
    public static final a4 BOARD_NOTE_FEED = new a4("BOARD_NOTE_FEED", 751);
    public static final a4 PIN_FAVORITE_USER_LIST = new a4("PIN_FAVORITE_USER_LIST", 752);
    public static final a4 BOARD_SECTION_TEMPLATE_PICKER = new a4("BOARD_SECTION_TEMPLATE_PICKER", 753);
    public static final a4 BOARD_SECTION_TEMPLATE_PIN_PICKER = new a4("BOARD_SECTION_TEMPLATE_PIN_PICKER", 754);
    public static final a4 GROUP_YOUR_PINS_PIN_PICKER = new a4("GROUP_YOUR_PINS_PIN_PICKER", 755);
    public static final a4 BOARD_ORGANIZE_FEED = new a4("BOARD_ORGANIZE_FEED", 756);
    public static final a4 ADS_GUIDANCE_RECOMMENDATIONS_FEED = new a4("ADS_GUIDANCE_RECOMMENDATIONS_FEED", 757);
    public static final a4 ADS_GUIDANCE_RECOMMENDATIONS_DETAIL = new a4("ADS_GUIDANCE_RECOMMENDATIONS_DETAIL", 758);
    public static final a4 ADS_GUIDANCE_NOTIFICATIONS_FEED = new a4("ADS_GUIDANCE_NOTIFICATIONS_FEED", 759);
    public static final a4 ONE_TAP_RECOMMENDATIONS_WIDGET = new a4("ONE_TAP_RECOMMENDATIONS_WIDGET", 760);
    public static final a4 ADS_GUIDANCE_CONTEXTUAL_RECOMMENDATION = new a4("ADS_GUIDANCE_CONTEXTUAL_RECOMMENDATION", 761);
    public static final a4 FEED_VIDEO = new a4("FEED_VIDEO", 762);
    public static final a4 IDEAS_HUB_PAGE = new a4("IDEAS_HUB_PAGE", 763);
    public static final a4 VIDEOS_HUB_PAGE = new a4("VIDEOS_HUB_PAGE", 764);
    public static final a4 VIDEOS_HUB_INTEREST_MODULE = new a4("VIDEOS_HUB_INTEREST_MODULE", 765);
    public static final a4 VIDEOS_CATEGORY_INTEREST_MODULE = new a4("VIDEOS_CATEGORY_INTEREST_MODULE", 766);
    public static final a4 INTEREST_BREADCRUMBS = new a4("INTEREST_BREADCRUMBS", 767);
    public static final a4 AGGREGATED_COMMENTS = new a4("AGGREGATED_COMMENTS", 768);
    public static final a4 FEED_RELATED_USE_CASES = new a4("FEED_RELATED_USE_CASES", 769);
    public static final a4 FEED_RELATED_BROAD_INTEREST = new a4("FEED_RELATED_BROAD_INTEREST", 770);
    public static final a4 FEED_CREATOR_CLASSES = new a4("FEED_CREATOR_CLASSES", 771);
    public static final a4 FEED_MY_CREATOR_CLASSES = new a4("FEED_MY_CREATOR_CLASSES", 772);
    public static final a4 FEED_UPCOMING_CREATOR_CLASSES = new a4("FEED_UPCOMING_CREATOR_CLASSES", 773);
    public static final a4 SIGNAL_COLLECTION_HOMEFEED_INTERESTS = new a4("SIGNAL_COLLECTION_HOMEFEED_INTERESTS", 774);
    public static final a4 SIGNAL_COLLECTION_HUB_PERSONAL_INFORMATION = new a4("SIGNAL_COLLECTION_HUB_PERSONAL_INFORMATION", 775);
    public static final a4 FEED_WHATS_NEW = new a4("FEED_WHATS_NEW", 776);
    public static final a4 ADD_SECONDARY_ACCOUNT = new a4("ADD_SECONDARY_ACCOUNT", 777);
    public static final a4 ADD_PERSONAL_ACCOUNT = new a4("ADD_PERSONAL_ACCOUNT", 778);
    public static final a4 ADD_BUSINESS_ACCOUNT = new a4("ADD_BUSINESS_ACCOUNT", 779);
    public static final a4 FEED_WISHLIST = new a4("FEED_WISHLIST", 780);
    public static final a4 FEED_WISHLIST_RECENTLY_VIEWED = new a4("FEED_WISHLIST_RECENTLY_VIEWED", 781);
    public static final a4 FEED_WISHLIST_CATEGORY = new a4("FEED_WISHLIST_CATEGORY", 782);
    public static final a4 FEED_USER_PROFILE_STORY_PINS = new a4("FEED_USER_PROFILE_STORY_PINS", 783);
    public static final a4 FEED_RELATED_PRODUCTS_MOST_CONSIDERED = new a4("FEED_RELATED_PRODUCTS_MOST_CONSIDERED", 784);
    public static final a4 FEED_RELATED_PRODUCTS_PRICE_LIMIT = new a4("FEED_RELATED_PRODUCTS_PRICE_LIMIT", 785);
    public static final a4 FEED_RELATED_PRODUCTS_COLLABORATIVE_FILTERING = new a4("FEED_RELATED_PRODUCTS_COLLABORATIVE_FILTERING", 786);
    public static final a4 FEED_RELATED_PRODUCTS_COLLABORATIVE_FILTERING_CLICK = new a4("FEED_RELATED_PRODUCTS_COLLABORATIVE_FILTERING_CLICK", 787);
    public static final a4 FEED_RELATED_PRODUCTS_COLLABORATIVE_FILTERING_PURCHASE = new a4("FEED_RELATED_PRODUCTS_COLLABORATIVE_FILTERING_PURCHASE", 788);
    public static final a4 FEED_RELATED_PRODUCTS_COLLABORATIVE_FILTERING_FREQUENTLY_BOUGHT_TOGETHER = new a4("FEED_RELATED_PRODUCTS_COLLABORATIVE_FILTERING_FREQUENTLY_BOUGHT_TOGETHER", 789);
    public static final a4 FEED_RELATED_PRODUCTS_SIMILAR_MERCHANT = new a4("FEED_RELATED_PRODUCTS_SIMILAR_MERCHANT", 790);
    public static final a4 FEED_RELATED_PRODUCTS_SIMILAR_DOMAIN = new a4("FEED_RELATED_PRODUCTS_SIMILAR_DOMAIN", 791);
    public static final a4 FEED_CALL_TO_CREATE_PAGE = new a4("FEED_CALL_TO_CREATE_PAGE", 792);
    public static final a4 FEED_CALL_TO_CREATE_STREAM = new a4("FEED_CALL_TO_CREATE_STREAM", 793);
    public static final a4 LINE_EMAIL_COLLECT_STEP = new a4("LINE_EMAIL_COLLECT_STEP", 794);
    public static final a4 PROFILE_PINS_ORGANIZE = new a4("PROFILE_PINS_ORGANIZE", 795);
    public static final a4 LIVE_SESSION_PIN_LIVE_PAGE = new a4("LIVE_SESSION_PIN_LIVE_PAGE", 796);
    public static final a4 FEED_LIVE_SESSIONS = new a4("FEED_LIVE_SESSIONS", 797);
    public static final a4 FEED_MY_LIVE_SESSIONS = new a4("FEED_MY_LIVE_SESSIONS", 798);
    public static final a4 LIVE_SESSION_PIN_CLOSEUP = new a4("LIVE_SESSION_PIN_CLOSEUP", 799);
    public static final a4 FEED_LIVE_SESSION_LIVESTREAM_PRODUCTS = new a4("FEED_LIVE_SESSION_LIVESTREAM_PRODUCTS", 800);
    public static final a4 FEED_LIVE_SESSION_LIVESTREAM_PARTICIPANTS = new a4("FEED_LIVE_SESSION_LIVESTREAM_PARTICIPANTS", 801);
    public static final a4 LIVE_SESSION_PIN_DETAILS_DRAWER = new a4("LIVE_SESSION_PIN_DETAILS_DRAWER", 802);
    public static final a4 LIVE_SESSION_PIN_PRE_LIVE = new a4("LIVE_SESSION_PIN_PRE_LIVE", 803);
    public static final a4 LIVE_SESSION_PIN_LIVE = new a4("LIVE_SESSION_PIN_LIVE", 804);
    public static final a4 LIVE_SESSION_PIN_POST_LIVE = new a4("LIVE_SESSION_PIN_POST_LIVE", 805);
    public static final a4 LIVE_SESSION_PIN_UNKNOWN = new a4("LIVE_SESSION_PIN_UNKNOWN", 806);
    public static final a4 LIVE_SESSION_LIVESTREAM_PRODUCT_BROWSER = new a4("LIVE_SESSION_LIVESTREAM_PRODUCT_BROWSER", 807);
    public static final a4 LIVE_SESSION_REPLAY_PRODUCT_BROWSER = new a4("LIVE_SESSION_REPLAY_PRODUCT_BROWSER", 808);
    public static final a4 LIVE_SESSION_PRE_LIVE_CREATOR_PROFILE = new a4("LIVE_SESSION_PRE_LIVE_CREATOR_PROFILE", 809);
    public static final a4 LIVE_SESSION_LIVESTREAM_CREATOR_PROFILE = new a4("LIVE_SESSION_LIVESTREAM_CREATOR_PROFILE", 810);
    public static final a4 LIVE_SESSION_REPLAY_CREATOR_PROFILE = new a4("LIVE_SESSION_REPLAY_CREATOR_PROFILE", 811);
    public static final a4 FEED_LIVE_SESSION_PIN_DRAWER = new a4("FEED_LIVE_SESSION_PIN_DRAWER", 812);
    public static final a4 FEED_LIVE_SESSION_PLANNED_ATTENDEES = new a4("FEED_LIVE_SESSION_PLANNED_ATTENDEES", 813);
    public static final a4 FEED_LIVE_SESSION_LIVESTREAM_COMMENTS = new a4("FEED_LIVE_SESSION_LIVESTREAM_COMMENTS", 814);
    public static final a4 FEED_LIVE_SESSION_REPLAY_COMMENTS = new a4("FEED_LIVE_SESSION_REPLAY_COMMENTS", 815);
    public static final a4 FEED_LIVE_SESSION_REPLAY_PRODUCTS = new a4("FEED_LIVE_SESSION_REPLAY_PRODUCTS", 816);
    public static final a4 FEED_LIVE_SESSION_PAST_SESSION_VIEWERS = new a4("FEED_LIVE_SESSION_PAST_SESSION_VIEWERS", 817);
    public static final a4 FEED_TV_CATEGORY_PINS = new a4("FEED_TV_CATEGORY_PINS", 818);
    public static final a4 LIVE_SHOPPING_BAG = new a4("LIVE_SHOPPING_BAG", 819);
    public static final a4 LIVE_SHOPPING_CHECKOUT_BROWSER = new a4("LIVE_SHOPPING_CHECKOUT_BROWSER", 820);
    public static final a4 USER_RECENTLY_VIEWED_PINS = new a4("USER_RECENTLY_VIEWED_PINS", 821);
    public static final a4 USER_RECENTLY_SAVED_PINS = new a4("USER_RECENTLY_SAVED_PINS", 822);
    public static final a4 FEED_BOTTOM_NAV_BAR_IDEA_STREAM = new a4("FEED_BOTTOM_NAV_BAR_IDEA_STREAM", 823);
    public static final a4 FEED_HOMEFEED_TAB_IDEA_STREAM = new a4("FEED_HOMEFEED_TAB_IDEA_STREAM", 824);
    public static final a4 FEED_IDEA_STREAM_WATCH = new a4("FEED_IDEA_STREAM_WATCH", 825);
    public static final a4 FEED_IDEA_STREAM_WATCH_CLOSEUP = new a4("FEED_IDEA_STREAM_WATCH_CLOSEUP", 826);
    public static final a4 FEED_STORY_PIN_CREATION_INSPIRATION = new a4("FEED_STORY_PIN_CREATION_INSPIRATION", 827);
    public static final a4 PB_SUB_CATEOGIRES = new a4("PB_SUB_CATEOGIRES", 828);
    public static final a4 PB_CATEGORIES_FEED = new a4("PB_CATEGORIES_FEED", 829);
    public static final a4 PB_BRANDS_STORY_FEED = new a4("PB_BRANDS_STORY_FEED", 830);
    public static final a4 PB_BROWSING_HISTORY_FEED = new a4("PB_BROWSING_HISTORY_FEED", 831);
    public static final a4 PB_MERCHANT_FOLLOWING_HISTORY_FEED = new a4("PB_MERCHANT_FOLLOWING_HISTORY_FEED", 832);
    public static final a4 PB_BRANDS = new a4("PB_BRANDS", 833);
    public static final a4 PB_CATEGORIES = new a4("PB_CATEGORIES", 834);
    public static final a4 YOUR_SHOP_ANCHOR_PRODUCT_FEED = new a4("YOUR_SHOP_ANCHOR_PRODUCT_FEED", 835);
    public static final a4 YOUR_SHOP_STELA_FEED = new a4("YOUR_SHOP_STELA_FEED", 836);
    public static final a4 YOUR_SHOP_MOST_POPULAR_FROM_FOLLOWED_MERCHANTS_FEED = new a4("YOUR_SHOP_MOST_POPULAR_FROM_FOLLOWED_MERCHANTS_FEED", 837);
    public static final a4 YOUR_SHOP_MOST_POPULAR_FROM_POPULAR_MERCHANTS_FEED = new a4("YOUR_SHOP_MOST_POPULAR_FROM_POPULAR_MERCHANTS_FEED", 838);
    public static final a4 YOUR_SHOP_ON_SALE_FROM_BRANDS_YOU_FOLLOW = new a4("YOUR_SHOP_ON_SALE_FROM_BRANDS_YOU_FOLLOW", 839);
    public static final a4 YOUR_SHOP_NEW_ARRIVALS_FROM_BRANDS_YOU_FOLLOW = new a4("YOUR_SHOP_NEW_ARRIVALS_FROM_BRANDS_YOU_FOLLOW", 840);
    public static final a4 COMMUNITY_CREATION_PAGE = new a4("COMMUNITY_CREATION_PAGE", 841);
    public static final a4 TRENDING_CTC_STREAM = new a4("TRENDING_CTC_STREAM", 842);
    public static final a4 FEATURED_PLUS_TRENDING_CTC_STREAM = new a4("FEATURED_PLUS_TRENDING_CTC_STREAM", 843);
    public static final a4 RECENT_CTC_STREAM = new a4("RECENT_CTC_STREAM", 844);
    public static final a4 UNLINK_ACCOUNT_SEND_EMAIL = new a4("UNLINK_ACCOUNT_SEND_EMAIL", 845);
    public static final a4 CREATOR_ACTIVATION_IDEA_PIN_UPSELL_SWIPE_MODAL = new a4("CREATOR_ACTIVATION_IDEA_PIN_UPSELL_SWIPE_MODAL", 846);
    public static final a4 CREATOR_ACTIVATION_IDEA_PIN_UPSELL_ALERT = new a4("CREATOR_ACTIVATION_IDEA_PIN_UPSELL_ALERT", 847);
    public static final a4 CREATOR_ACTIVATION_IDEA_PIN_UPSELL_HALF_SHEET = new a4("CREATOR_ACTIVATION_IDEA_PIN_UPSELL_HALF_SHEET", 848);
    public static final a4 PIN_FEEDBACK_MODAL = new a4("PIN_FEEDBACK_MODAL", 849);
    public static final a4 CREATOR_HUB_TOOLS = new a4("CREATOR_HUB_TOOLS", 850);
    public static final a4 CREATOR_HUB_PERFORMANCE = new a4("CREATOR_HUB_PERFORMANCE", 851);
    public static final a4 CREATOR_HUB_NEWS = new a4("CREATOR_HUB_NEWS", 852);
    public static final a4 CREATOR_HUB_PINS = new a4("CREATOR_HUB_PINS", 853);
    public static final a4 FEED_HIGHLIGHTED_TAKES_STREAM = new a4("FEED_HIGHLIGHTED_TAKES_STREAM", 854);
    public static final a4 CREATION_INSPIRATION_INTEREST_LIST = new a4("CREATION_INSPIRATION_INTEREST_LIST", 855);
    public static final a4 CREATION_INSPIRATION_INTEREST_DETAIL_PAGE = new a4("CREATION_INSPIRATION_INTEREST_DETAIL_PAGE", 856);
    public static final a4 CREATION_INSPIRATION_IDEA_PAGE = new a4("CREATION_INSPIRATION_IDEA_PAGE", 857);
    public static final a4 FEED_CALL_TO_CREATE_PREVIEW = new a4("FEED_CALL_TO_CREATE_PREVIEW", 858);
    public static final a4 BUSINESS_ACCESS_BUSINESS_SETTINGS = new a4("BUSINESS_ACCESS_BUSINESS_SETTINGS", 859);
    public static final a4 BUSINESS_ACCESS_SYSTEM_USERS = new a4("BUSINESS_ACCESS_SYSTEM_USERS", 860);
    public static final a4 BUSINESS_ACCESS_APPS = new a4("BUSINESS_ACCESS_APPS", 861);
    public static final a4 BUSINESS_ACCESS_CONVERSIONS = new a4("BUSINESS_ACCESS_CONVERSIONS", 862);
    public static final a4 ITEM_REP_SECTION_DEFAULT_VIEW_PARAMETER_TYPE = new a4("ITEM_REP_SECTION_DEFAULT_VIEW_PARAMETER_TYPE", 863);
    public static final a4 STRUCTURED_FEED_DEFAULT_VIEW_PARAMETER_TYPE = new a4("STRUCTURED_FEED_DEFAULT_VIEW_PARAMETER_TYPE", 864);
    public static final a4 PROFILE_HIGHLIGHT_SELECT_PINS = new a4("PROFILE_HIGHLIGHT_SELECT_PINS", 865);
    public static final a4 PROFILE_HIGHLIGHT_EDIT_TITLE = new a4("PROFILE_HIGHLIGHT_EDIT_TITLE", 866);
    public static final a4 FEED_USER_PROFILE_HIGHLIGHT_PINS = new a4("FEED_USER_PROFILE_HIGHLIGHT_PINS", 867);
    public static final a4 AR_SCENE_TRY_ON = new a4("AR_SCENE_TRY_ON", 868);
    public static final a4 AR_3D_PREVIEW = new a4("AR_3D_PREVIEW", 869);
    public static final a4 BOARDS_CONTROLS = new a4("BOARDS_CONTROLS", 870);
    public static final a4 USER_SIGNAL_NAME = new a4("USER_SIGNAL_NAME", 871);
    public static final a4 USER_SIGNAL_AGE = new a4("USER_SIGNAL_AGE", 872);
    public static final a4 USER_SIGNAL_GENDER = new a4("USER_SIGNAL_GENDER", 873);
    public static final a4 USER_SIGNAL_PROMPT = new a4("USER_SIGNAL_PROMPT", 874);
    public static final a4 USER_SIGNAL_BIRTHDAY = new a4("USER_SIGNAL_BIRTHDAY", 875);
    public static final a4 CHALLENGE_STREAM = new a4("CHALLENGE_STREAM", 876);
    public static final a4 IDEA_PIN_OOTD_CREATION = new a4("IDEA_PIN_OOTD_CREATION", 877);
    public static final a4 CONFIRM_PASSWORD = new a4("CONFIRM_PASSWORD", 878);
    public static final a4 PHONE_NUMBER = new a4("PHONE_NUMBER", 879);
    public static final a4 VERIFICATION_CODE = new a4("VERIFICATION_CODE", 880);
    public static final a4 BACKUP_CODE = new a4("BACKUP_CODE", 881);
    public static final a4 ENFORCEMENT_MESSAGE = new a4("ENFORCEMENT_MESSAGE", 882);
    public static final a4 ENFORCEMENT_DISABLE_MESSAGE = new a4("ENFORCEMENT_DISABLE_MESSAGE", 883);
    public static final a4 DISABLE_MFA_EMPLOYER_MESSAGE = new a4("DISABLE_MFA_EMPLOYER_MESSAGE", 884);
    public static final a4 DISABLE_MFA_EMPLOYEE_MESSAGE = new a4("DISABLE_MFA_EMPLOYEE_MESSAGE", 885);
    public static final a4 CONFIRM_EMAIL = new a4("CONFIRM_EMAIL", 886);
    public static final a4 FEED_LOCATION_TAGGED_PINS = new a4("FEED_LOCATION_TAGGED_PINS", 887);
    public static final a4 LOCATION_TAGGED_PIN_STREAM = new a4("LOCATION_TAGGED_PIN_STREAM", 888);
    public static final a4 FEED_NFT_WALLET = new a4("FEED_NFT_WALLET", 889);
    public static final a4 FEED_NFT_COLLECTION = new a4("FEED_NFT_COLLECTION", 890);
    public static final a4 CLOSEUP_GUIDED_SEARCH_MODULE = new a4("CLOSEUP_GUIDED_SEARCH_MODULE", 891);
    public static final a4 CLOSEUP_GUIDED_SEARCH_STORY = new a4("CLOSEUP_GUIDED_SEARCH_STORY", 892);
    public static final a4 TOPIC_PORTAL_FULL_FEED = new a4("TOPIC_PORTAL_FULL_FEED", 893);
    public static final a4 MULTI_TOPIC_PORTAL_FULL_FEED = new a4("MULTI_TOPIC_PORTAL_FULL_FEED", 894);
    public static final a4 MULTI_SEARCH_PORTAL_FULL_FEED = new a4("MULTI_SEARCH_PORTAL_FULL_FEED", 895);
    public static final a4 MULTI_BOARD_PORTAL_FULL_FEED = new a4("MULTI_BOARD_PORTAL_FULL_FEED", 896);
    public static final a4 GEN_AI_PROJECT_MODULE_FEED = new a4("GEN_AI_PROJECT_MODULE_FEED", 897);
    public static final a4 GEN_AI_PROJECT_SUBMODULE_FEED = new a4("GEN_AI_PROJECT_SUBMODULE_FEED", 898);
    public static final a4 BRANDED_CONTENT_PIN_FEED = new a4("BRANDED_CONTENT_PIN_FEED", 899);
    public static final a4 SAVE_EDUCATION = new a4("SAVE_EDUCATION", 900);
    public static final a4 PROFILE_EDUCATION = new a4("PROFILE_EDUCATION", 901);
    public static final a4 SEARCH_EDUCATION = new a4("SEARCH_EDUCATION", 902);
    public static final a4 FEED_HOMEFEED_TAB_INTEREST = new a4("FEED_HOMEFEED_TAB_INTEREST", 903);
    public static final a4 BOARD_CANVAS = new a4("BOARD_CANVAS", 904);
    public static final a4 AUTO_ORGANIZE = new a4("AUTO_ORGANIZE", 905);
    public static final a4 FEATURED_HOLIDAY_BOARD_PREVIEW = new a4("FEATURED_HOLIDAY_BOARD_PREVIEW", 906);
    public static final a4 RVC_YOUR_ACCOUNT_TAB = new a4("RVC_YOUR_ACCOUNT_TAB", 907);
    public static final a4 RVC_YOUR_REPORTS_TAB = new a4("RVC_YOUR_REPORTS_TAB", 908);
    public static final a4 MUSIC_PLAYLIST = new a4("MUSIC_PLAYLIST", 909);
    public static final a4 SHOWREEL_ACTION_SHEET = new a4("SHOWREEL_ACTION_SHEET", 910);
    public static final a4 PEAR_INSIGHT_SELF = new a4("PEAR_INSIGHT_SELF", 911);
    public static final a4 PEAR_INSIGHT_OTHERS = new a4("PEAR_INSIGHT_OTHERS", 912);
    public static final a4 PEAR_STYLE_EXPLORER = new a4("PEAR_STYLE_EXPLORER", 913);
    public static final a4 PEAR_STYLE_SUMMARY = new a4("PEAR_STYLE_SUMMARY", 914);
    public static final a4 PEAR_STYLE_SUMMARY_SEARCH_PINS = new a4("PEAR_STYLE_SUMMARY_SEARCH_PINS", 915);
    public static final a4 PEAR_QUIZ_QUESTIONS = new a4("PEAR_QUIZ_QUESTIONS", 916);
    public static final a4 PEAR_QUIZ_RESULTS = new a4("PEAR_QUIZ_RESULTS", 917);
    public static final a4 PEAR_QUIZ_SEARCH_PINS = new a4("PEAR_QUIZ_SEARCH_PINS", 918);
    public static final a4 USER_VIBES_EDUCATION = new a4("USER_VIBES_EDUCATION", 919);
    public static final a4 USER_VIBE_CLOSEUP = new a4("USER_VIBE_CLOSEUP", 920);
    public static final a4 USER_VIBES_FEED = new a4("USER_VIBES_FEED", 921);
    public static final a4 CONVERSATIONAL_CLOSEUP = new a4("CONVERSATIONAL_CLOSEUP", 922);
    public static final a4 CONVERSATIONAL_SEARCH = new a4("CONVERSATIONAL_SEARCH", 923);
    public static final a4 PEAR_QUIZ_INTRO = new a4("PEAR_QUIZ_INTRO", 924);
    public static final a4 SHOPPING_MODULE_BEST_SELLING_FOLLOWING_BRAND = new a4("SHOPPING_MODULE_BEST_SELLING_FOLLOWING_BRAND", 925);
    public static final a4 INTERESTS_TAB_FEED = new a4("INTERESTS_TAB_FEED", 926);
    public static final a4 PROFILE_SELECT_BOARDLESS_PINS = new a4("PROFILE_SELECT_BOARDLESS_PINS", 927);
    public static final a4 BOARD_NAME_INPUT = new a4("BOARD_NAME_INPUT", 928);
    public static final a4 PROFILE_VISIBILITY_SETTINGS = new a4("PROFILE_VISIBILITY_SETTINGS", 929);
    public static final a4 ENGAGED_TOPIC_TAB = new a4("ENGAGED_TOPIC_TAB", 930);
    public static final a4 AUTO_ORGANIZE_REFINE_BOARD = new a4("AUTO_ORGANIZE_REFINE_BOARD", 931);
    public static final a4 NRT_AUTO_ORGANIZE_REFINE_BOARD = new a4("NRT_AUTO_ORGANIZE_REFINE_BOARD", 932);
    public static final a4 ANDROID_CUBES_CLUSTER = new a4("ANDROID_CUBES_CLUSTER", 933);
    public static final a4 ANDROID_CUBES_LEARNED_RETRIEVAL = new a4("ANDROID_CUBES_LEARNED_RETRIEVAL", 934);
    public static final a4 ANDROID_CUBES_HOME_FEED = new a4("ANDROID_CUBES_HOME_FEED", 935);
    public static final a4 ANDROID_CUBES_SIGN_IN = new a4("ANDROID_CUBES_SIGN_IN", 936);
    public static final a4 UNIFIED_SHOP_MODULE = new a4("UNIFIED_SHOP_MODULE", 937);
    public static final a4 UNIFIED_SHOP_FEED = new a4("UNIFIED_SHOP_FEED", 938);
    public static final a4 COLLAGES_FEED = new a4("COLLAGES_FEED", 939);
    public static final a4 COLLAGES_PICKER = new a4("COLLAGES_PICKER", 940);
    public static final a4 FEED_COLLAGE_ITEM_RELATED_ITEMS = new a4("FEED_COLLAGE_ITEM_RELATED_ITEMS", 941);
    public static final a4 COLLAGE_TOOLS_ALL = new a4("COLLAGE_TOOLS_ALL", 942);
    public static final a4 COLLAGE_COMPOSER_DISCOVER_FEED = new a4("COLLAGE_COMPOSER_DISCOVER_FEED", 943);
    public static final a4 COLLAGE_COMPOSER_YOUR_SAVES_FEED = new a4("COLLAGE_COMPOSER_YOUR_SAVES_FEED", 944);
    public static final a4 COLLAGE_COMPOSER_CUTOUTS_FOR_YOU_FEED = new a4("COLLAGE_COMPOSER_CUTOUTS_FOR_YOU_FEED", 945);
    public static final a4 COLLAGE_COMPOSER_TRENDING_FEED = new a4("COLLAGE_COMPOSER_TRENDING_FEED", 946);
    public static final a4 COLLAGE_DRAFTS = new a4("COLLAGE_DRAFTS", 947);
    public static final a4 PREVIEW_PICKER = new a4("PREVIEW_PICKER", 948);
    public static final a4 PRIVACY_BLOCKER_ALERT = new a4("PRIVACY_BLOCKER_ALERT", 949);
    public static final a4 BASED_ON_REPIN_MODULE = new a4("BASED_ON_REPIN_MODULE", 950);
    public static final a4 HF_USER_PIN_CLUSTERS = new a4("HF_USER_PIN_CLUSTERS", 951);
    public static final a4 LONG_PRESS_CONTEXTUAL_MENU = new a4("LONG_PRESS_CONTEXTUAL_MENU", 952);
    public static final a4 AUTO_PUBLISH = new a4("AUTO_PUBLISH", 953);
    public static final a4 PROFILE_PINS_INTEREST_FILTER = new a4("PROFILE_PINS_INTEREST_FILTER", 954);
    public static final a4 FLOATING_BOARD_PICKER = new a4("FLOATING_BOARD_PICKER", 955);
    public static final a4 FLOATING_BOARD_PICKER_EDIT = new a4("FLOATING_BOARD_PICKER_EDIT", 956);
    public static final a4 BOARD_PICKER_TOP_CHOICES = new a4("BOARD_PICKER_TOP_CHOICES", 957);
    public static final a4 BOARD_PICKER_ALL_BOARDS = new a4("BOARD_PICKER_ALL_BOARDS", 958);
    public static final a4 BOARD_PICKER_PROFILE_BOARD = new a4("BOARD_PICKER_PROFILE_BOARD", 959);
    public static final a4 BOARD_PICKER_COLLAGE = new a4("BOARD_PICKER_COLLAGE", 960);
    public static final a4 BOARD_PICKER_BOARD_TITLE_SUGGESTION = new a4("BOARD_PICKER_BOARD_TITLE_SUGGESTION", 961);
    public static final a4 ONEBAR_DRAWER = new a4("ONEBAR_DRAWER", 962);
    public static final a4 ONE_TAP_SAVE_TOAST = new a4("ONE_TAP_SAVE_TOAST", 963);
    public static final a4 ONE_TAP_DELETE_TOAST = new a4("ONE_TAP_DELETE_TOAST", 964);
    public static final a4 UNIDIRECTIONAL_ACKNOWLEDGEMENT_ALERT = new a4("UNIDIRECTIONAL_ACKNOWLEDGEMENT_ALERT", 965);
    public static final a4 FEATURED_COLLAGE = new a4("FEATURED_COLLAGE", 966);
    public static final a4 COLLAGE = new a4("COLLAGE", 967);
    public static final a4 FEED_COLLAGE_REMIX_UPSELL = new a4("FEED_COLLAGE_REMIX_UPSELL", 968);
    public static final a4 SSO_BUSINESS_DISCLAIMER = new a4("SSO_BUSINESS_DISCLAIMER", 969);
    public static final a4 ROOM_REPAINT_VIEW = new a4("ROOM_REPAINT_VIEW", 970);
    public static final a4 FOLLOWED_TOPIC_TAB = new a4("FOLLOWED_TOPIC_TAB", 971);
    public static final a4 PINTEREST_PICKS_TAB = new a4("PINTEREST_PICKS_TAB", 972);
    public static final a4 BOARD_CHOOSE_HEADER = new a4("BOARD_CHOOSE_HEADER", 973);
    public static final a4 FEED_BOARD_SHOP_SHOP_THE_LOOK = new a4("FEED_BOARD_SHOP_SHOP_THE_LOOK", 974);
    public static final a4 ACCOUNT_ALREADY_LINKED = new a4("ACCOUNT_ALREADY_LINKED", 975);
    public static final a4 CONFIRM_MOVE_GOOGLE_LOGIN = new a4("CONFIRM_MOVE_GOOGLE_LOGIN", 976);
    public static final a4 CLAIMED_ACCOUNTS_SETTINGS_MOBILE = new a4("CLAIMED_ACCOUNTS_SETTINGS_MOBILE", 977);
    public static final a4 CLAIMED_ACCOUNTS_SETTINGS_TABLET = new a4("CLAIMED_ACCOUNTS_SETTINGS_TABLET", 978);
    public static final a4 FEATURED_BOARDS_HOLIDAY_SHOPPING = new a4("FEATURED_BOARDS_HOLIDAY_SHOPPING", 979);
    public static final a4 EMAIL_VERIFICATION_OTP = new a4("EMAIL_VERIFICATION_OTP", 980);
    public static final a4 UNBLOCKING_SETTINGS = new a4("UNBLOCKING_SETTINGS", 981);
    public static final a4 PRODUCT_FILTERED_HOMEFEED = new a4("PRODUCT_FILTERED_HOMEFEED", 982);
    public static final a4 AD_CLOSEUP_RP = new a4("AD_CLOSEUP_RP", 983);
    public static final a4 PINNACLE_BASECAMP_BOOK_OF_BUSINESS = new a4("PINNACLE_BASECAMP_BOOK_OF_BUSINESS", 984);
    public static final a4 PINNACLE_ADVERTISER_DETAIL = new a4("PINNACLE_ADVERTISER_DETAIL", 985);
    public static final a4 PINNACLE_CAMPAIGN_PACING = new a4("PINNACLE_CAMPAIGN_PACING", 986);
    public static final a4 PINNACLE_ADVERTISER_PACING = new a4("PINNACLE_ADVERTISER_PACING", 987);
    public static final a4 AI_COMPANION_CHAT_WINDOW_CONVERSATION = new a4("AI_COMPANION_CHAT_WINDOW_CONVERSATION", 988);
    public static final a4 AI_COMPANION_CHAT_WINDOW_PROMPT_TEMPLATE = new a4("AI_COMPANION_CHAT_WINDOW_PROMPT_TEMPLATE", 989);

    private static final /* synthetic */ a4[] $values() {
        return new a4[]{FEED_FOLLOWING, FEED_FRIENDS, FEED_EVERYTHING, FEED_POPULAR, FEED_SOURCE, FEED_HOME, FEED_TOP_PICKS, FEED_WELCOME, FEED_SUBCATEGORY, FEED_INTEREST, FEED_FRESH, FEED_KLP, FEED_PLP, FEED_BLP, FEED_RELATED_PINS, AMP_KLP_FEED, AMP_PIN_FEED, AMP_BOARD_FEED, AMP_PROFILE_FEED, AMP_TOPIC_PAGE, DISCOVER_CREATORS_PICKER, FEED_DIGEST, FEED_DIGEST_STORY, FEED_DYNAMIC_GRID, FEED_MULTIVISIT, CATEGORY_DISCOVER, FEED_CATEGORY_ANIMALS, FEED_CATEGORY_ARCHITECTURE, FEED_CATEGORY_ART, FEED_CATEGORY_CARS_MOTORCYCLES, FEED_CATEGORY_CELEBRITIES, FEED_CATEGORY_DESIGN, FEED_CATEGORY_DIY_CRAFTS, FEED_CATEGORY_EDUCATION, FEED_CATEGORY_FILM_MUSIC_BOOKS, FEED_CATEGORY_FOOD_DRINK, FEED_CATEGORY_GARDENING, FEED_CATEGORY_GEEK, FEED_CATEGORY_HAIR_BEAUTY, FEED_CATEGORY_HEALTH_FITNESS, FEED_CATEGORY_HISTORY, FEED_CATEGORY_HOLIDAYS_EVENTS, FEED_CATEGORY_HOME_DECOR, FEED_CATEGORY_HUMOR, FEED_CATEGORY_ILLUSTRATIONS_POSTERS, FEED_CATEGORY_KIDS, FEED_CATEGORY_MENS_FASHION, FEED_CATEGORY_OUTDOORS, FEED_CATEGORY_PHOTOGRAPHY, FEED_CATEGORY_PRODUCTS, FEED_CATEGORY_QUOTES, FEED_CATEGORY_SCIENCE_NATURE, FEED_CATEGORY_SPORTS, FEED_CATEGORY_TATTOOS, FEED_CATEGORY_TECHNOLOGY, FEED_CATEGORY_TRAVEL, FEED_CATEGORY_WEDDINGS, FEED_CATEGORY_WOMENS_FASHION, FEED_CATEGORY_HOLIDAY_FOR_HIM, FEED_CATEGORY_HOLIDAY_FOR_HER, FEED_CATEGORY_HOLIDAY_FOR_KIDS, FEED_CATEGORY_HOLIDAY_FOR_ALL, FEED_CATEGORY_CHRISTMAS_SWEATER, FEED_CATEGORY, FEED_CATEGORY_TOPIC, FEED_GIFTS, FEED_GIFTS_20, FEED_GIFTS_20_50, FEED_GIFTS_50_100, FEED_GIFTS_100_200, FEED_GIFTS_200_500, FEED_GIFTS_500, FEED_VIDEOS, FEED_DOMAIN, FEED_PLACES, FEED_COMMERCE, FEED_COMMERCE_BUYABLE, FEED_COMMERCE_PICKS, FEED_COMMERCE_MERCHANT_PAGE, FEED_COMMERCE_MERCHANT_SEARCH, DISCOVER_CATEGORY, DISCOVER_INTEREST, DISCOVER_SEARCH_INTERESTS, SEARCH_PINS, SEARCH_BOARDS, SEARCH_USERS, SEARCH_AUTOCOMPLETE, SEARCH_MY_PINS, SEARCH_MY_PINS_AND_BOARDS, SEARCH_PLACES, SEARCH_PLACE_BOARDS, SEARCH_INTERESTS, SEARCH_BUYABLE, SEARCH_BUYABLE_STOREFRONT, SEARCH_PRICE_FILTER, SEARCH_HASHTAGS, SEARCH_BUBBLES, SEARCH_VIDEOS, SEARCH_GUIDE, SEARCH_TRENDING_TEXT, SEARCH_STYLE_CONTENT, SEARCH_TAB, SEARCH_STORY_LANDING_STRUCTURED_SECTION_MOST_POPULAR, SEARCH_STORY_LANDING_STRUCTURED_BUBBLE_Q2X, SEARCH_STORY_LANDING_PERSONALIZATION_USER_BRAND, SEARCH_STORY_LANDING_PERSONALIZATION_USER_COLOR, SEARCH_STORY_LANDING_PERSONALIZATION_USER_STYLE, SEARCH_STORY_LANDING_PERSONALIZATION_USER_STYLE_IDEA_PIN_STREAM, SEARCH_STORY_LANDING_SEARCH_FOR_YOU, SEARCH_IDEA_PIN_STREAM, SEARCH_GUIDED, SEARCH_GUIDED_RESULTS, SEARCH_HYBRID, REGISTRATION_LANDING, REGISTRATION_SIGNUP, REGISTRATION_BOARDS, REGISTRATION_SIGNUP_BUSINESS, REGISTRATION_LOCAL_INFO, REGISTRATION_AGE_GENDER, USER_BOARDS, USER_FOLLOWERS, USER_FOLLOWING, USER_LIKES, USER_ACTIVITY, USER_PINS, USER_EDIT, USER_INTERESTS, USER_FYP, USER_FOLLOWED_USERS, USER_SELF, RETRIEVAL_HUB, USER_OTHERS, USER_DECIDER, USER_OVERVIEW, BUSINESS_PROFILE, USER_SCHEDULED_PINS, USER_STORY_PINS, USER_VIDEO_PINS, USER_STOREFRONT, USER_COMMUNITY, BOARD_FOLLOWERS, BOARD_SETTINGS, BOARD_CREATE, BOARD_EDIT, BOARD_EDIT_COLLABORATORS, BOARD_ADD_COLLABORATORS_TRAY, BOARD_ADD_COLLABORATORS, BOARD_CHOOSE_COVER, BOARD_CROP_COVER, BOARD_PLACE, BOARD_MAP, BOARD_EMPTY, BOARD_SELF, BOARD_OTHERS, BOARD_IDEAS, BOARD_ACTIVITIES, BOARD_ACTIVITIES_COMPOSER, BOARD_MERGE, BOARD_SELECT_PINS, BOARD_SEARCH_CREATE_UPSELL_PIN_PICKER, BOARD_PERMISSION_SETTINGS, BOARD_TOOLS_ALL, BOARD_FOR_ME, FRIEND_INVITER_EMAIL, FRIEND_INVITER_FACEBOOK, FRIEND_INVITER_FIND_FRIENDS, FRIEND_INVITER_GMAIL, FRIEND_INVITER_INVITE, FRIEND_INVITER_TWITTER, FRIEND_INVITER_YAHOO, ABOUT_TERMS, ABOUT_SUPPORT, ABOUT_BOOKMARKLET, ABOUT_ETIQUETTE, ABOUT_ABOUT, ABOUT_GOODIES, ABOUT_CAREERS, ABOUT_TEAM, ABOUT_PRESS, ABOUT_PRIVACY, ABOUT_USE, ABOUT_COPYRIGHT, LOGIN_EMAIL, LOGIN_FACEBOOK, LOGIN_TWITTER, ERROR_NO_INTERNET, ERROR_NO_PIN, ERROR_NO_BOARD, ERROR_NO_USER, ERROR_NO_ACTIVITY, REPORT_PIN, REPORT_USER, REPORT_COMMENT, REPORT_BOARD, REPORT_CONVERSATION, USER_ABOUT, BOARD_COLLABORATORS, EDUCATION_LONGPRESS, EDUCATION_RELATED_PINS, EDUCATION_SECRET_BOARD, EDUCATION_CONTEXTUAL_MENU, EDUCATION_GUIDED_SEARCH, EDUCATION_FLYOUT, EDUCATION_SAVE, MOBILE_ORIENTATION_DISCOVER, MOBILE_ORIENTATION_COLLECT, MOBILE_ORIENTATION_FUNCTIONAL, MOBILE_ORIENTATION_STORY, ORIENTATION_FAST_FOLLOW, PICKED_FOR_YOU_FEED, FEED_EDITOR_FOLLOW_BOARDS, FEED_EDITOR_UNFOLLOW_BOARDS, DEPRECATED_DEEP_LINKING_EMAIL, DEPRECATED_DEEP_LINKING_WEB, DEEP_LINKING_FACEBOOK, DEEP_LINKING_APP, DEEP_LINKING, FEED_RELATED_BOARD, FEED_RELATED_INTEREST, FEED_RELATED_PIN, FEED_RELATED_PRODUCTS, FEED_RELATED_SHOPPABLE_CONTENTS, FEED_RELATED_RECIPES, FEED_RELATED_DIY, FEED_RELATED_VIDEOS, FEED_RELATED_STORIES, FEED_RELATED_PIVOT_TOPIC_STORIES, FEED_RELATED_PIVOT_CREATOR_STORIES, FEED_RELATED_PIVOT_STORIES, FEED_RELATED_PIVOTS, FEED_RELATED_PORTAL_CREATOR_STORIES, FEED_BRAND_CATALOG, FEED_VIDEO_STORY, FEED_COMPLETE_THIS_LOOK, FEED_PRODUCT_GROUP, FEED_BUSINESS_PROFILE_PICKS_FOR_YOU, FEED_BOARD_SHOPPING_PACKAGE, FEED_BUBBLE_SHOPPING_PACKAGE, FEED_BRAND_SHOPPING_PACKAGE, FEED_STL_MODULE, FEED_BOARD_SHOP, FEED_BOARD_SHOP_SAVED_ITEMS, FEED_BOARD_SHOP_TAB, FEED_BOARD_SHOP_CATEGORY, FEED_BOARD_SAVED_PRODUCTS, FEED_BOARD_SHOP_PRODUCT_CATEGORY, FEED_BOARD_ALL_SAVES_PINS, STOREFRONT_SEARCH_AUTOCOMPLETE, FIND_FRIENDS, PIN_OTHER, PIN_REGULAR, PIN_ARTICLE, PIN_MOVIE, PIN_PLACE, PIN_PRODUCT, PIN_RECIPE, PIN_LOOKBOOK, PIN_PRODUCT_MERCHANT, PIN_MAKE_TUTORIAL, PIN_SHUFFLE_CUTOUT, PIN_STORY_PIN, PIN_PDPPLUS, PIN_CLOSEUP, PIN_CLOSEUP_VISUAL_LINK_PRODUCT_LIST, PIN_CLOSEUP_VISUAL_LINK_FEED, PIN_CLOSEUP_AMAZON_SHOPPING_MODULE, SPLASH_LOADING, SPLASH_INSPIRED_WALL, SPLASH_BRIO_WALL, SPLASH_CONTINUE_EMAIL, SPLASH_MULTISTEP, ORIENTATION_WEBSITE, ORIENTATION_INTENT_TO_ADVERTISE, ORIENTATION_BUSINESS_NAME, ORIENTATION_BUSINESS_TYPE, ORIENTATION_SALES_CONTACT, ORIENTATION_WELCOME, ORIENTATION_GENDER_STEP, ORIENTATION_APP_UPSELL_STEP, ORIENTATION_LOCALE_COUNTRY_STEP, ORIENTATION_LOCALE_STEP, ORIENTATION_INTEREST_PICKER, ORIENTATION_INTEREST_REFINEMENT_CATEGORIES, ORIENTATION_INTEREST_REFINEMENT_TOPICS, ORIENTATION_TAG_PICKER, ORIENTATION_BOARD_PICKER, ORIENTATION_PIN_PICKER, ORIENTATION_EXTENSION_UPSELL, ORIENTATION_LOADING_HOME_FEED, ORIENTATION_AFFINITY_COMPLETION_INFO, ORIENTATION_NOTIF_UPSELL, ORIENTATION_COUNTRY_STEP, ORIENTATION_COUNTRY_PICKER_STEP, ORIENTATION_SINGLE_USE_CASE_SIGNAL_STATE, ORIENTATION_SINGLE_USE_CASE_SIGNAL_STEP, ORIENTATION_IS_MOBILE_NUX_PICKER, ORIENTATION_EDUCATION_STEP, ORIENTATION_AGE_STEP, ORIENTATION_CREATOR_PICKER, ORIENTATION_FIRST_AD_UPSELL_STEP, ORIENTATION_QR_CODE_APP_UPSELL, USECASE_QUIZ, ORIENTATION_USE_CASE_PICKER_STEP, ORIENTATION_PIN_PICKER_STEP, USE_CASE_FEED, SIGNUP_ACCOUNT_TYPE_STEP, SIGNUP_EMAIL_PASSWORD_STEP, SIGNUP_EMAIL_STEP, SIGNUP_PASSWORD_STEP, SIGNUP_NAME_STEP, SIGNUP_AGE_STEP, SIGNUP_NAME_AGE_STEP, SIGNUP_AGE_GENDER_STEP, SIGNUP_BIRTHDAY_STEP, SIGNUP_PRIVACY_CONSENT_STEP, SIGNUP_GENDER_STEP, SIGNUP_EMAIL_OR_PHONE_NUMBER_STEP, SIGNUP_EMAIL_SENT_FOR_LOGIN_STEP, SIGNUP_GOOGLE_ONE_TAP_MODAL, SIGNUP_GOOGLE_ONE_TAP_CONFIRMATION_DIALOG, SIGNUP_EMAIL_PASSWORD, SIGNUP_GPLUS, SIGNUP_FACEBOOK, SIGNUP_LINE, LOGIN_PASSWORD_STEP, SIGNUP_WEBSITE_STEP, SIGNUP_BUSINESS_WEBSITE, SIGNUP_BUSINESS_INTENT_TO_ADVERTISE, SIGNUP_BUSINESS_SALES_CONTACT, SIGNUP_BUSINESS_TYPE, REBUILD_FEED_INTEREST_PICKER, REBUILD_FEED_END, STORIES_RELATED_PINS, STORIES_RELATED_USERS, STORIES_RELATED_BOARDS, STORIES_RELATED_INTERESTS, BROWSER, OFF_PINTEREST, CONVERSATION_CREATE, CONVERSATION_THREAD, CONVERSATION_INBOX, CONVERSATION_ADD_PIN, CONVERSATION_USERS, CONVERSATION_CONTACT_REQUEST_INBOX, CONVERSATION_THREAD_CLOSEUP, CONVERSATION_SETTINGS_VIEW, CONVERSATION_MESSAGES_AND_CONTACTS_INBOX, NEWS_NETWORK_STORY, NEWS_YOUR_STORY, PIN_TWINS, ACTIVITY_V2, BUYABLE_MERCHANT_RETURN_POLICY, BUYABLE_VARIANT_OPTIONS, BUYABLE_CHECKOUT_APPLE_PAY_OPTION, BUYABLE_CHECKOUT_SUMMARY, BUYABLE_SELECT_SHIPPING_ADDRESS, BUYABLE_SHIPPING_ADDRESS_FORM, BUYABLE_SELECT_SHIPPING_METHOD, BUYABLE_SELECT_PAYMENT, BUYABLE_PAYMENT_FORM, BUYABLE_CONFIRMATION, BUYABLE_ORDER_HISTORY, BUYABLE_ORDER_DETAILS, BUYABLE_ADDRESS_CONTACTS, BUYABLE_ADDRESS_RECENTS, BUYABLE_SELECT_QUANTITY, BUYABLE_BAG_LIST, BUYABLE_BAG_DETAIL, BUYABLE_CHECKOUT_MULTI_SUMMARY, BUYABLE_SIMPLIFIED_CLOSEUP, BUYABLE_PRODUCT_VIEW, BUYABLE_EXPRESS_CHECKOUT_SHEET, BUYABLE_QUANTITY_SELECTION_SHEET, BUYABLE_SHOP_THE_LOOK, PLACE_VIEW_HEADER, PLACE_VIEW_RELATED_PINS, EXTERNAL_SOURCE_OTHER, EMAIL_UNKNOWN, EMAIL_TRANSACTIONAL, EMAIL_EDITORIAL, EMAIL_ACTIVITY_AGGREGATION, EMAIL_RECOMMENDATIONS_DIGEST, EMAIL_SOCIAL_DIGEST, EMAIL_SEND_PIN, EMAIL_SEND_BOARD, EMAIL_SEND_PINNER, EMAIL_FRIEND_JOINED, EMAIL_WELCOME, EMAIL_BOARD_RECOMMENDATIONS, EMAIL_PIN_RECOMMENDATIONS, EMAIL_COMMENT_AND_MENTION, EMAIL_USECASES, EMAIL_FIREHOSE_QUESTION_CREATE, EMAIL_FIREHOSE_ANSWER_CREATE, EMAIL_FIREHOSE_REPLY_CREATE, EMAIL_QUESTION_CREATE, EMAIL_ANSWER_CREATE, EMAIL_QUESTION_LIKE, EMAIL_ANSWER_LIKE, EMAIL_REPLY_CREATE, EMAIL_PARTNER, EMAIL_INTEREST_RECOMMENDATIONS, EMAIL_HOMEFEED_NEW_PINS, EMAIL_NETWORK_STORY_DIGEST, EMAIL_PINVITATIONAL_ACCESS, EMAIL_RESTART_FEED, EMAIL_PINVITATIONAL_RALLYING_CALL, EMAIL_WEEK_IN_REVIEW, EMAIL_NO_SIGNAL, EMAIL_USER_RECOMMENDATIONS, EMAIL_BOARD_COLLABORATION, EMAIL_CONVERSATIONS, EMAIL_LEGAL, EMAIL_SECURITY, SERVICE_ENTRY_SOCIAL_FACEBOOK, SERVICE_ENTRY_SOCIAL_TWITTER, SERVICE_ENTRY_SEO_GOOGLE, SERVICE_ENTRY_SEO_YAHOO, SERVICE_ENTRY_SEO_BING, SERVICE_ENTRY_EXTERNAL_SHARE, SERVICE_ENTRY_BOARD_INVITE, SERVICE_ENTRY_COMMUNITY_INVITE, SERVICE_ENTRY_WEB_UNKNOWN, SERVICE_ENTRY_PAID_OTHER, SERVICE_ENTRY_PAID_INSTALL, SERVICE_ENTRY_PAID_PRELOAD, SERVICE_ENTRY_PAID_WEB, SERVICE_ENTRY_PAID_DEEPLINK_DIRECT, SERVICE_ENTRY_PAID_DEEPLINK_MMP, SERVICE_ENTRY_PAID_DEFERRED_DEEPLINK, SERVICE_ENTRY_PAID_SAMSUNG_MAPS, PINVITATIONAL_UNAUTH_EMAIL, PINVITATIONAL_UNAUTH_CONFIRM, PINVITATIONAL_AUTH_CONFIRM, PINVITATIONAL_SIGNUP_REDEMPTION, PINVITATIONAL_HOME_FEED_MODAL, PINVITATIONAL_PIN_SUMMARY, SETTINGS_SEARCH_PRIVACY, SETTINGS_OFFLINE_BOARD, SETTINGS_EMAIL, SETTINGS_CONFIRM_EMAIL_CHANGE_MODAL, ACCOUNT_CLOSE, ACCOUNT_DEACTIVATE, ACCOUNT_SETTINGS, PERSONAL_INFORMATION_SETTINGS, CLAIMED_ACCOUNTS_SETTINGS, ACCOUNT_CLAIMING_AUTO_ORGANIZE_PIN, LINK_TO_PINTEREST_SETTINGS, PRIVACY_AND_DATA_SETTINGS, SECURITY_AND_LOGINS_SETTINGS, PERMISSIONS_SETTINGS, CONTENT_PERMISSIONS_SETTINGS, BRANDED_CONTENT_SETTINGS, PARENTAL_PASSCODE_SETTINGS, PARENTAL_PASSCODE_INSTRUCTIONS, PARENTAL_PASSCODE_CODE, PARENTAL_PASSCODE_BACKUP_EMAIL, PARENTAL_PASSCODE_CONFIRMATION, CONNECTED_DEVICES, CONFIRM_REVOKE_SESSION, SHARE_EXTENSION, ACTION_EXTENSION, MESSAGE_EXTENSION, WIDGET_EXTENSION_SELECT_BOARD, WIDGET_EXTENSION_SELECT_USER, EXTENSION_UPSELL_TOAST, EXTENSION_UPSELL_MODAL, EXTENSION_UPSELL_NUX, EXTENSION_INSTALLED, EXTENSION_NOT_INSTALLED, EXTENSION_UPSELL_NAG, EXTENSION_UPSELL_NAG_PIN_CREATE, EXTENSION_UPSELL_CLOSEUP, FIND_FRIENDS_ADDRESS_BOOK, FIND_FRIENDS_FACEBOOK, FIND_FRIENDS_TWITTER, FIND_FRIENDS_MORE, FIND_FRIENDS_INVITE_ALL, HOMEFEED_BUILDER, HOMEFEED_BUILDER_SPLASH, HOMEFEED_BUILDER_MY_TOPICS, HOMEFEED_BUILDER_MY_BOARDS, HOMEFEED_BUILDER_MY_USERS, HOMEFEED_BUILDER_REC_TOPICS, HOMEFEED_BUILDER_REC_BOARDS, HOMEFEED_BUILDER_REC_USERS, HOMEFEED_BUILDER_MY_PINS, CAMERA_PHOTO_PICKER, CAMERA_ALBUM_PICKER, CAMERA_MEDIA_CREATE, API_ENVIRONMENTS, FPE_CREATE_FIRST_BOARD, PUSH_NOTIFICATION_AGGREGATED_COMMENT, PUSH_NOTIFICATION_CONVERSATION, PUSH_NOTIFICATION_ACTION, PUSH_NOTIFICATION_SYSTEM_NEWS, PUSH_NOTIFICATION_INTERACTION, PUSH_NOTIFICATION_FRIEND_NEWS, PUSH_NOTIFICATION_EDITORIAL, PUSH_NOTIFICATION_UNKNOWN, NOTIFICATION_PERMISSIONS_CHANGE, SEND_SHARE_MAIN, SEND_SHARE_SEARCH, PIN_FLASHLIGHT_RESULTS, PIN_SHOPPING_RESULTS, FLASHLIGHT_CAMERA_RESULTS, FLASHLIGHT_PINCH_TO_ZOOM, VISUAL_SEARCH_PRODUCT_FEED, LENS_HISTORY_RESULTS, FEED_SHOP_SPACE, FEED_TODAYS_PICKS, FEED_BUYABLE_CATEGORY, FEED_TOP_SHOPS, FEED_ALL_SHOPS, CONFIRM_WEBSITE_BY_NAG, EXPLORE_STORY, USER_DID_IT, EXPLORE, EXPLORE_KLP, EXPLORE_SECTION_PICKER, EXPLORE_ARTICLE, EXPLORE_VIDEO_ARTICLE, BOARD_PLUS_MODAL_HALF, BOARD_PLUS_MODAL_FULL, BOARD_BOTTOM_OF_BOARD_FULL, BOARD_BOTTOM_OF_BOARD_PEEK, NEWS_HUB_FEED, NEWS_HUB_DETAIL, NEWS_HUB_EMPTY_STATE, MODAL_CREATE_CAMPAIGN, ADVERTISING_TOS, FLASHLIGHT_CAMERA_CAPTURE_READY, FLASHLIGHT_CAMERA_SEARCH_RESULTS, FLASHLIGHT_CAMERA_ANALYZING, INSTANT_ARTICLE, INSTANT_CONTENT, INSTANT_CONTENT_IN_APP_BROWSER, INSTANT_CONTENT_COOKING_LESSON, DID_IT_CREATE, DID_IT_EDIT, EMAIL_SEND_DID_IT, SHOPPING_LIST_AGGREGATE, SHOPPING_LIST_BY_PIN, QUIZZES_RESULT_OUTPUT, QUIZZES_QUESTION, PIN_REMINDER_ADD_NEW, PIN_REMINDER_VIEW_EXISTING, PARTNER_CONVERT, PARTNER_SIGNUP, BOARD_SECTION_EDIT, BOARD_SECTION_SELECT_PINS, BOARD_SECTION_CREATE, BOARD_SECTION_PICKER, BOARD_SECTION_REORDER_SECTIONS, BOARD_SECTION_RECOMMENDED_PINS, BOARD_SECTION_IDEAS, STORY_PIN_GAME, STORY_TOPIC_GAME, BUBBLE_HEADER, VISUAL_TAGS_CREATE, VISUAL_TAGS_EDIT, CREATOR_RECOMMENDATIONS, COMMUNITY_AGGREGATED, COMMUNITY_BANNED, COMMUNITY_COMPOSER, COMMUNITY_CREATE, COMMUNITY_DETAIL, COMMUNITY_DIRECTORY, COMMUNITY_EDIT, COMMUNITY_INVITE, COMMUNITY_PEOPLE, COMMUNITY_POST_REPLIES, TASTE_REFINEMENT_INTRO, TASTE_REFINEMENT_INTERESTS_PICKER, TASTE_REFINEMENT_L1_L2_INTERESTS_PICKER, BOARD_IDEAS_DISCOVERY_FEED, BOARD_IDEAS_SHOPPING_FEED, BOARD_IDEAS_SIMILAR_BOARDS_FEED, BOARD_IDEAS_PROFESSIONAL_SERVICES_FEED, BOARD_IDEAS_BIRTHDAY_FEED, AMP_VIEWER, GDPR_AGE_COLLECTION_STEP, GDPR_PARENTAL_EMAIL_COLLECTION_STEP, REDISCOVERY_FEED, WEB_TOPIC_PAGE, WEB_TOPIC_FEED, TOPIC_EDUCATION, REORDER_BOARDS, REORDER_PINS, REORDER_SECTIONS, SOCIAL_MANAGER_UNREAD, SOCIAL_MANAGER_READ, GRID_EDUCATION_STORY, STORY_PIN_CREATE, STORY_PIN_AD_PAGE_CREATE, STORY_PIN_COVER_PAGE_CREATE, STORY_PIN_MEDIA_PAGE_CREATE, STORY_PIN_TEXT_PAGE_CREATE, STORY_PIN_EDIT, STORY_PIN_MULTI_PHOTO_PICKER, STORY_PIN_INGREDIENTS_PAGE_CREATE, STORY_PIN_SUPPLIES_PAGE_CREATE, STORY_PIN_LIST, IDEA_PIN_EDUCATION, IDEA_PINEDUCATION_VIEW_PAGER, STORY_PIN_PRODUCT_TAGS_LIST, STORY_PIN_BULK_ACTIONS, CREATOR_RELATED_PINS_GRID, SOMETHING_WENT_WRONG, SIMILAR_PINS_GRID, FIRST_AD_CREATE_PAGE, FIRST_PIN_CREATE_PAGE, SHOPPING_BRAND_FILTER_MODAL, SHOPPING_PRICE_FILTER_MODAL, SHOPPING_BRAND_AFFINITY_DISCOVERY, FEED_REVERSE_STELA, SHOPPING_PRODUCT_FILTER, SHOPPING_RELATED_PRODUCTS_FEED, SHOPPING_STELA_PRODUCTS_FEED, SHOPPING_DOT_FEED, PRODUCT_DETAIL_PAGE_FEED, FILTER_PANEL, PRODUCT_TAGGING_SEARCH_PRODUCT_FEED, VTO_PRODUCT_TAGGING_PRODUCT_FEED, VTO_PRODUCT_TAGGING_PREVIEW_CAMERA_PERMISSIONS_REQUESTED, VTO_PRODUCT_TAGGING_PREVIEW_CAMERA_PERMISSIONS_GRANTED, PRODUCT_TAGGING_URL, PRODUCT_TAGGING_IMAGE_PICKER, FEED_IDEA_PIN_STELA_PRODUCTS, FEED_PB_RECOMMENDED_SEARCH, FEED_PB_SALE, FEED_PB_NEW_ARRIVALS, FEED_PB_BUBBLE, FEED_PB_BOARD, FEED_PB_BRAND, FEED_PB_INSPO, PERSONAL_BOUTIQUE, PERSONAL_BOUTIQUE_BRAND_DISCOVERY, PERSONAL_BOUTIQUE_BRAND_INSPO_GROUPS, PERSONAL_BOUTIQUE_SEARCH, PERSONAL_BOUTIQUE_SEARCH_AUTOCOMPLETE, PERSONAL_BOUTIQUE_MERCHANT_TUNER, PERSONAL_BOUTIQUE_ONBOARDING_INTERESTS, PERSONAL_BOUTIQUE_ONBOARDING_MERCHANTS, PERSONAL_BOUTIQUE_HEADER, PINTEREST_CREATE_CAMERA, PINTEREST_CREATE_TEXT, ADS_AGE_AND_GENDER, ADS_BILLING_INFO, ADS_BUSINESS_SETTINGS, ADS_CHOOSE_PIN_TO_PROMOTE, ADS_CREATE_AD_SUCCESS, ADS_DURATION_AND_BUDGET, ADS_INTERESTS, ADS_LOCATIONS, ADS_NOTIFICATIONS, ADS_REVIEW_YOUR_AD, ADS_TARGETING, ADS_UPDATE_BILLING, ADS_TERMS_OF_SERVICES, ADS_KEYWORDS, HOMEFEED_CONTROL_ACTIVITY, HOMEFEED_CONTROL_BOARDS, HOMEFEED_CONTROL_INTERESTS, HOMEFEED_CONTROL_TOPICS, HOMEFEED_CONTROL_QUIZ, HOMEFEED_CONTROL_PROFILES, HOMEFEED_CONTROL_FOLLOWING, NAVIGATION_UNAUTH_FOLLOWING, NAVIGATION_UNAUTH_NOTIFICATION, NAVIGATION_UNAUTH_SAVED, MWEB_NUX_CHECKLIST_CLOSEUP, MWEB_NUX_CHECKLIST_SAVE, WINDOWS_PWA_UPSELL, BRAND_SURVEY_LEGACY, BRAND_SURVEY_EXPRESS, AD_CREDITS_OFFER, PIN_REACTION_USERS, ONBOARDING_SHARE_IDEAS, ONBOARDING_GROW_AUDIENCE, ONBOARDING_BUILD_PROFILE, ONBOARDING_COMPLETE_SCREEN, ONBOARDING_COPY_BOARD, NEW_USE_CASE_FEED, AD_PREVIEW_FEED, HOMEFEED_RELEVANCE_MULTIPIN, BUSINESS_ACCOUNT_LOGIN, BUSINESS_ACCOUNT_SWITCHER, LINKED_BUSINESS_ACCOUNT_CREATE, LINKED_BUSINESS_ACCOUNT_CONFIRMATION_MODAL, HOMEFEED_PIN_QUIZ_SELECTION, HOMEFEED_PIN_QUIZ_RATING, HOMEFEED_NUX_MULTIPIN, FEED_CREATOR_SPOTLIGHT, PWA_CHROME, PWA_SAFARI, PWA_UNKNOWN, PWA_TWA_TWA, PWA_TWA_CCT, PWA_TWA_BROWSER, PWA_TWA_WEBVIEW, LITE_TWA_UPSELL, EXPLORE_TAB, TODAY_TAB, TODAY_ARTICLE_FEED, TODAY_INTEREST_FEED, TOP_ADS_PAGE, POSTNUX_MODAL, FEED_MORE_FROM_CREATOR, PINTEREST_TAG_INSTALL_GTM, PINTEREST_TAG_INSTALL_SHOPIFY, PINTEREST_TAG_INSTALL_WOOCOMMERCE, PINTEREST_TAG_INSTALL_PIXELYOURSITE_WOOCOMMERCE, PINTEREST_TAG_INSTALL_PIXELYOURSITE_WORDPRESS, PINTEREST_TAG_INSTALL_WEEBLY, PINTEREST_TAG_INSTALL_ECWID, PINTEREST_TAG_INSTALL_APPTRAIN_MAGENTO, PINTEREST_TAG_INSTALL_PREMMERCE, PINTEREST_TAG_INSTALL_BIGCOMMERCE, PINTEREST_TAG_INSTALL_TEALIUM, PINTEREST_TAG_INSTALL_SQUARESPACE, PINTEREST_TAG_INSTALL_MANUAL, PINTEREST_TAG_MANUAL_MODAL, PINTEREST_TAG_PARTNER_MODAL, PINTEREST_TAG_VERIFY, PINTEREST_TAG_INSTALL_GTM_EVENTS, PINTEREST_TAG_INSTALL_SETUP_FLOW, PINTEREST_TAG_INSTALL_MODAL, PINTEREST_TAG_INSTALL_GET_STARTED_SETUP_FLOW, PINTEREST_TAG_INSTALL_GET_STARTED_MODAL, PINTEREST_TAG_PARTNER_INTEGRATION_LED_PARTNER_MODAL, PINTEREST_TAG_PARTNER_INTEGRATION_LED_PARTNER_CARD, PINTEREST_TAG_PARTNER_INTEGRATION_LED_MANUAL_SETUP, PINTEREST_TAG_PARTNER_INTEGRATION_LED_EMAIL_INSTRUCTIONS, PINTEREST_TAG_PARTNER_INTEGRATION_LED_NOT_ELIGIBLE, BUSINESS_SITE_CARD_CAROUSEL, DATE_SELECTOR_ADD, DATE_SELECTOR_UPDATE, FEED_ALL_STYLES, FEED_IDEA_STREAMS, FEED_CREATOR_BUBBLE, FEED_POPULAR_TAB, FEED_DISCOVER_CREATORS_PORTAL, FEED_DISCOVER_CREATORS_BUBBLE, FEED_NOTIFICATION_CREATOR_BUBBLE, STORY_PIN_RESPONSES_GALLERY_SELF, STORY_PIN_RESPONSES_GALLERY_OTHERS, STORY_PIN_RESPONSE_SELF, STORY_PIN_RESPONSE_OTHERS, CREATOR_BUBBLE_EDUCATION, BOARD_NOTE_SELECT_PINS, BOARD_NOTE_FEED, PIN_FAVORITE_USER_LIST, BOARD_SECTION_TEMPLATE_PICKER, BOARD_SECTION_TEMPLATE_PIN_PICKER, GROUP_YOUR_PINS_PIN_PICKER, BOARD_ORGANIZE_FEED, ADS_GUIDANCE_RECOMMENDATIONS_FEED, ADS_GUIDANCE_RECOMMENDATIONS_DETAIL, ADS_GUIDANCE_NOTIFICATIONS_FEED, ONE_TAP_RECOMMENDATIONS_WIDGET, ADS_GUIDANCE_CONTEXTUAL_RECOMMENDATION, FEED_VIDEO, IDEAS_HUB_PAGE, VIDEOS_HUB_PAGE, VIDEOS_HUB_INTEREST_MODULE, VIDEOS_CATEGORY_INTEREST_MODULE, INTEREST_BREADCRUMBS, AGGREGATED_COMMENTS, FEED_RELATED_USE_CASES, FEED_RELATED_BROAD_INTEREST, FEED_CREATOR_CLASSES, FEED_MY_CREATOR_CLASSES, FEED_UPCOMING_CREATOR_CLASSES, SIGNAL_COLLECTION_HOMEFEED_INTERESTS, SIGNAL_COLLECTION_HUB_PERSONAL_INFORMATION, FEED_WHATS_NEW, ADD_SECONDARY_ACCOUNT, ADD_PERSONAL_ACCOUNT, ADD_BUSINESS_ACCOUNT, FEED_WISHLIST, FEED_WISHLIST_RECENTLY_VIEWED, FEED_WISHLIST_CATEGORY, FEED_USER_PROFILE_STORY_PINS, FEED_RELATED_PRODUCTS_MOST_CONSIDERED, FEED_RELATED_PRODUCTS_PRICE_LIMIT, FEED_RELATED_PRODUCTS_COLLABORATIVE_FILTERING, FEED_RELATED_PRODUCTS_COLLABORATIVE_FILTERING_CLICK, FEED_RELATED_PRODUCTS_COLLABORATIVE_FILTERING_PURCHASE, FEED_RELATED_PRODUCTS_COLLABORATIVE_FILTERING_FREQUENTLY_BOUGHT_TOGETHER, FEED_RELATED_PRODUCTS_SIMILAR_MERCHANT, FEED_RELATED_PRODUCTS_SIMILAR_DOMAIN, FEED_CALL_TO_CREATE_PAGE, FEED_CALL_TO_CREATE_STREAM, LINE_EMAIL_COLLECT_STEP, PROFILE_PINS_ORGANIZE, LIVE_SESSION_PIN_LIVE_PAGE, FEED_LIVE_SESSIONS, FEED_MY_LIVE_SESSIONS, LIVE_SESSION_PIN_CLOSEUP, FEED_LIVE_SESSION_LIVESTREAM_PRODUCTS, FEED_LIVE_SESSION_LIVESTREAM_PARTICIPANTS, LIVE_SESSION_PIN_DETAILS_DRAWER, LIVE_SESSION_PIN_PRE_LIVE, LIVE_SESSION_PIN_LIVE, LIVE_SESSION_PIN_POST_LIVE, LIVE_SESSION_PIN_UNKNOWN, LIVE_SESSION_LIVESTREAM_PRODUCT_BROWSER, LIVE_SESSION_REPLAY_PRODUCT_BROWSER, LIVE_SESSION_PRE_LIVE_CREATOR_PROFILE, LIVE_SESSION_LIVESTREAM_CREATOR_PROFILE, LIVE_SESSION_REPLAY_CREATOR_PROFILE, FEED_LIVE_SESSION_PIN_DRAWER, FEED_LIVE_SESSION_PLANNED_ATTENDEES, FEED_LIVE_SESSION_LIVESTREAM_COMMENTS, FEED_LIVE_SESSION_REPLAY_COMMENTS, FEED_LIVE_SESSION_REPLAY_PRODUCTS, FEED_LIVE_SESSION_PAST_SESSION_VIEWERS, FEED_TV_CATEGORY_PINS, LIVE_SHOPPING_BAG, LIVE_SHOPPING_CHECKOUT_BROWSER, USER_RECENTLY_VIEWED_PINS, USER_RECENTLY_SAVED_PINS, FEED_BOTTOM_NAV_BAR_IDEA_STREAM, FEED_HOMEFEED_TAB_IDEA_STREAM, FEED_IDEA_STREAM_WATCH, FEED_IDEA_STREAM_WATCH_CLOSEUP, FEED_STORY_PIN_CREATION_INSPIRATION, PB_SUB_CATEOGIRES, PB_CATEGORIES_FEED, PB_BRANDS_STORY_FEED, PB_BROWSING_HISTORY_FEED, PB_MERCHANT_FOLLOWING_HISTORY_FEED, PB_BRANDS, PB_CATEGORIES, YOUR_SHOP_ANCHOR_PRODUCT_FEED, YOUR_SHOP_STELA_FEED, YOUR_SHOP_MOST_POPULAR_FROM_FOLLOWED_MERCHANTS_FEED, YOUR_SHOP_MOST_POPULAR_FROM_POPULAR_MERCHANTS_FEED, YOUR_SHOP_ON_SALE_FROM_BRANDS_YOU_FOLLOW, YOUR_SHOP_NEW_ARRIVALS_FROM_BRANDS_YOU_FOLLOW, COMMUNITY_CREATION_PAGE, TRENDING_CTC_STREAM, FEATURED_PLUS_TRENDING_CTC_STREAM, RECENT_CTC_STREAM, UNLINK_ACCOUNT_SEND_EMAIL, CREATOR_ACTIVATION_IDEA_PIN_UPSELL_SWIPE_MODAL, CREATOR_ACTIVATION_IDEA_PIN_UPSELL_ALERT, CREATOR_ACTIVATION_IDEA_PIN_UPSELL_HALF_SHEET, PIN_FEEDBACK_MODAL, CREATOR_HUB_TOOLS, CREATOR_HUB_PERFORMANCE, CREATOR_HUB_NEWS, CREATOR_HUB_PINS, FEED_HIGHLIGHTED_TAKES_STREAM, CREATION_INSPIRATION_INTEREST_LIST, CREATION_INSPIRATION_INTEREST_DETAIL_PAGE, CREATION_INSPIRATION_IDEA_PAGE, FEED_CALL_TO_CREATE_PREVIEW, BUSINESS_ACCESS_BUSINESS_SETTINGS, BUSINESS_ACCESS_SYSTEM_USERS, BUSINESS_ACCESS_APPS, BUSINESS_ACCESS_CONVERSIONS, ITEM_REP_SECTION_DEFAULT_VIEW_PARAMETER_TYPE, STRUCTURED_FEED_DEFAULT_VIEW_PARAMETER_TYPE, PROFILE_HIGHLIGHT_SELECT_PINS, PROFILE_HIGHLIGHT_EDIT_TITLE, FEED_USER_PROFILE_HIGHLIGHT_PINS, AR_SCENE_TRY_ON, AR_3D_PREVIEW, BOARDS_CONTROLS, USER_SIGNAL_NAME, USER_SIGNAL_AGE, USER_SIGNAL_GENDER, USER_SIGNAL_PROMPT, USER_SIGNAL_BIRTHDAY, CHALLENGE_STREAM, IDEA_PIN_OOTD_CREATION, CONFIRM_PASSWORD, PHONE_NUMBER, VERIFICATION_CODE, BACKUP_CODE, ENFORCEMENT_MESSAGE, ENFORCEMENT_DISABLE_MESSAGE, DISABLE_MFA_EMPLOYER_MESSAGE, DISABLE_MFA_EMPLOYEE_MESSAGE, CONFIRM_EMAIL, FEED_LOCATION_TAGGED_PINS, LOCATION_TAGGED_PIN_STREAM, FEED_NFT_WALLET, FEED_NFT_COLLECTION, CLOSEUP_GUIDED_SEARCH_MODULE, CLOSEUP_GUIDED_SEARCH_STORY, TOPIC_PORTAL_FULL_FEED, MULTI_TOPIC_PORTAL_FULL_FEED, MULTI_SEARCH_PORTAL_FULL_FEED, MULTI_BOARD_PORTAL_FULL_FEED, GEN_AI_PROJECT_MODULE_FEED, GEN_AI_PROJECT_SUBMODULE_FEED, BRANDED_CONTENT_PIN_FEED, SAVE_EDUCATION, PROFILE_EDUCATION, SEARCH_EDUCATION, FEED_HOMEFEED_TAB_INTEREST, BOARD_CANVAS, AUTO_ORGANIZE, FEATURED_HOLIDAY_BOARD_PREVIEW, RVC_YOUR_ACCOUNT_TAB, RVC_YOUR_REPORTS_TAB, MUSIC_PLAYLIST, SHOWREEL_ACTION_SHEET, PEAR_INSIGHT_SELF, PEAR_INSIGHT_OTHERS, PEAR_STYLE_EXPLORER, PEAR_STYLE_SUMMARY, PEAR_STYLE_SUMMARY_SEARCH_PINS, PEAR_QUIZ_QUESTIONS, PEAR_QUIZ_RESULTS, PEAR_QUIZ_SEARCH_PINS, USER_VIBES_EDUCATION, USER_VIBE_CLOSEUP, USER_VIBES_FEED, CONVERSATIONAL_CLOSEUP, CONVERSATIONAL_SEARCH, PEAR_QUIZ_INTRO, SHOPPING_MODULE_BEST_SELLING_FOLLOWING_BRAND, INTERESTS_TAB_FEED, PROFILE_SELECT_BOARDLESS_PINS, BOARD_NAME_INPUT, PROFILE_VISIBILITY_SETTINGS, ENGAGED_TOPIC_TAB, AUTO_ORGANIZE_REFINE_BOARD, NRT_AUTO_ORGANIZE_REFINE_BOARD, ANDROID_CUBES_CLUSTER, ANDROID_CUBES_LEARNED_RETRIEVAL, ANDROID_CUBES_HOME_FEED, ANDROID_CUBES_SIGN_IN, UNIFIED_SHOP_MODULE, UNIFIED_SHOP_FEED, COLLAGES_FEED, COLLAGES_PICKER, FEED_COLLAGE_ITEM_RELATED_ITEMS, COLLAGE_TOOLS_ALL, COLLAGE_COMPOSER_DISCOVER_FEED, COLLAGE_COMPOSER_YOUR_SAVES_FEED, COLLAGE_COMPOSER_CUTOUTS_FOR_YOU_FEED, COLLAGE_COMPOSER_TRENDING_FEED, COLLAGE_DRAFTS, PREVIEW_PICKER, PRIVACY_BLOCKER_ALERT, BASED_ON_REPIN_MODULE, HF_USER_PIN_CLUSTERS, LONG_PRESS_CONTEXTUAL_MENU, AUTO_PUBLISH, PROFILE_PINS_INTEREST_FILTER, FLOATING_BOARD_PICKER, FLOATING_BOARD_PICKER_EDIT, BOARD_PICKER_TOP_CHOICES, BOARD_PICKER_ALL_BOARDS, BOARD_PICKER_PROFILE_BOARD, BOARD_PICKER_COLLAGE, BOARD_PICKER_BOARD_TITLE_SUGGESTION, ONEBAR_DRAWER, ONE_TAP_SAVE_TOAST, ONE_TAP_DELETE_TOAST, UNIDIRECTIONAL_ACKNOWLEDGEMENT_ALERT, FEATURED_COLLAGE, COLLAGE, FEED_COLLAGE_REMIX_UPSELL, SSO_BUSINESS_DISCLAIMER, ROOM_REPAINT_VIEW, FOLLOWED_TOPIC_TAB, PINTEREST_PICKS_TAB, BOARD_CHOOSE_HEADER, FEED_BOARD_SHOP_SHOP_THE_LOOK, ACCOUNT_ALREADY_LINKED, CONFIRM_MOVE_GOOGLE_LOGIN, CLAIMED_ACCOUNTS_SETTINGS_MOBILE, CLAIMED_ACCOUNTS_SETTINGS_TABLET, FEATURED_BOARDS_HOLIDAY_SHOPPING, EMAIL_VERIFICATION_OTP, UNBLOCKING_SETTINGS, PRODUCT_FILTERED_HOMEFEED, AD_CLOSEUP_RP, PINNACLE_BASECAMP_BOOK_OF_BUSINESS, PINNACLE_ADVERTISER_DETAIL, PINNACLE_CAMPAIGN_PACING, PINNACLE_ADVERTISER_PACING, AI_COMPANION_CHAT_WINDOW_CONVERSATION, AI_COMPANION_CHAT_WINDOW_PROMPT_TEMPLATE};
    }

    static {
        a4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new y3();
    }

    private a4(String str, int i13) {
        super(str, i13);
    }

    public static final a4 findByValue(int i13) {
        Companion.getClass();
        return y3.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a4 valueOf(String str) {
        return (a4) Enum.valueOf(a4.class, str);
    }

    public static a4[] values() {
        return (a4[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (z3.f67516a[ordinal()]) {
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
                return 92;
            case 7:
                return RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE;
            case 8:
                return RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL;
            case 9:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL;
            case 10:
                return RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL;
            case 11:
                return RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW;
            case 12:
                return 3085;
            case 13:
                return 3105;
            case 14:
                return 3108;
            case 15:
                return 3177;
            case 16:
                return 3159;
            case 17:
                return 3160;
            case 18:
                return 3161;
            case 19:
                return 3178;
            case 20:
                return 3185;
            case 21:
                return 3567;
            case 22:
                return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_FEED_FOOTER;
            case 23:
                return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION;
            case 24:
                return RecyclerViewTypes.VIEW_TYPE_TODAY_ARTICLE_BOARD_SECTION_HEADER;
            case 25:
                return RecyclerViewTypes.VIEW_TYPE_SIMPLE_ACTION_STORY;
            case 26:
                return 91;
            case 27:
                return 5;
            case 28:
                return 6;
            case 29:
                return 7;
            case 30:
                return 8;
            case 31:
                return 9;
            case 32:
                return 10;
            case 33:
                return 11;
            case 34:
                return 12;
            case 35:
                return 13;
            case 36:
                return 14;
            case 37:
                return 15;
            case 38:
                return 16;
            case 39:
                return 17;
            case 40:
                return 18;
            case 41:
                return 19;
            case 42:
                return 20;
            case 43:
                return 21;
            case 44:
                return 22;
            case 45:
                return 23;
            case 46:
                return 24;
            case 47:
                return 25;
            case 48:
                return 26;
            case 49:
                return 27;
            case 50:
                return 28;
            case 51:
                return 29;
            case 52:
                return 30;
            case 53:
                return 31;
            case 54:
                return 32;
            case 55:
                return 33;
            case 56:
                return 34;
            case 57:
                return 35;
            case 58:
                return 36;
            case 59:
                return RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER;
            case 60:
                return RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED;
            case 61:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL;
            case 62:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
            case 63:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN;
            case 64:
                return 400;
            case 65:
                return 401;
            case 66:
                return 85;
            case 67:
                return 37;
            case 68:
                return 38;
            case 69:
                return 39;
            case 70:
                return 40;
            case 71:
                return 41;
            case 72:
                return 42;
            case 73:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            case 74:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS;
            case 75:
                return 200;
            case 76:
                return RecyclerViewTypes.VIEW_TYPE_STORY_GROUP_MY_PINS;
            case 77:
                return RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER;
            case 78:
                return 250;
            case 79:
                return 3060;
            case 80:
                return 3061;
            case 81:
                return RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE;
            case 82:
                return RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL;
            case 83:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_GRID_REP;
            case 84:
                return 43;
            case 85:
                return 44;
            case 86:
                return 45;
            case 87:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE;
            case 88:
                return RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER;
            case 89:
                return 4016;
            case 90:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL;
            case 91:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_NAVIGATION_REP;
            case 92:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_DEFAULT_REP;
            case 93:
                return RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN;
            case 94:
                return 3781;
            case 95:
                return RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER;
            case 96:
                return 3151;
            case 97:
                return 3152;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
                return 3306;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
                return 8535;
            case 100:
                return 8537;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                return 3414;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
                return 3467;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
                return 3575;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                return 3576;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE /* 105 */:
                return 3577;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
                return 3578;
            case RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER /* 107 */:
                return 3598;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE /* 108 */:
                return 3617;
            case RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL /* 109 */:
                return 3752;
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL /* 110 */:
                return 3618;
            case RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE /* 111 */:
                return 3927;
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER /* 112 */:
                return 3928;
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL /* 113 */:
                return 4036;
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER /* 114 */:
                return 46;
            case RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE /* 115 */:
                return 47;
            case RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW /* 116 */:
                return 48;
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN /* 117 */:
                return AdSize.MEDIUM_RECTANGLE_WIDTH;
            case RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL /* 118 */:
                return wb.W0;
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL /* 119 */:
                return wb.X0;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL /* 120 */:
                return 49;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL /* 121 */:
                return 50;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN /* 122 */:
                return 51;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL /* 123 */:
                return 52;
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER /* 124 */:
                return 53;
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED /* 125 */:
                return 74;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL /* 126 */:
                return 93;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK /* 127 */:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_STYLE_REP;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN /* 128 */:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_WITH_TITLE_OVERLAY;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS /* 129 */:
                return 3080;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN /* 130 */:
                return 3106;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL /* 131 */:
                return 4047;
            case RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE /* 132 */:
                return 3107;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL /* 133 */:
                return 3210;
            case RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL /* 134 */:
                return 3211;
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL /* 135 */:
                return 3212;
            case RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL /* 136 */:
                return 3220;
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE /* 137 */:
                return 3240;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL /* 138 */:
                return 3272;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM /* 139 */:
                return 3313;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM /* 140 */:
                return 3314;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN /* 141 */:
                return 54;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL /* 142 */:
                return 55;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE /* 143 */:
                return 87;
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM /* 144 */:
                return 88;
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED /* 145 */:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO /* 146 */:
                return 3058;
            case RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY /* 147 */:
                return 3059;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE /* 148 */:
                return RecyclerViewTypes.VIEW_TYPE_PROFILE_BOARDLESS_PINS_HEADER;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE /* 149 */:
                return RecyclerViewTypes.VIEW_TYPE_IN_LINE_VTO;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY /* 150 */:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM /* 151 */:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM /* 152 */:
                return RecyclerViewTypes.VIEW_TYPE_AFFILIATE_LINK_IMAGE;
            case RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM /* 153 */:
                return 3069;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER /* 154 */:
                return 3070;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER /* 155 */:
                return 3173;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM /* 156 */:
                return 3179;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER /* 157 */:
                return 3189;
            case RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN /* 158 */:
                return 3227;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER /* 159 */:
                return 3233;
            case 160:
                return 3322;
            case RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER /* 161 */:
                return 3472;
            case RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER /* 162 */:
                return 4024;
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM /* 163 */:
                return 4110;
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING /* 164 */:
                return 56;
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_CLEAR /* 165 */:
                return 57;
            case RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE /* 166 */:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL;
            case RecyclerViewTypes.VIEW_TRY_ON_FEED_PRODUCT_CARD /* 167 */:
                return 58;
            case RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION /* 168 */:
                return RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SPOTLIGHT /* 169 */:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE /* 170 */:
                return 59;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO /* 171 */:
                return 60;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE /* 172 */:
                return 61;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO /* 173 */:
                return 62;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN /* 174 */:
                return 76;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO_FULL_SPAN /* 175 */:
                return 77;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN /* 176 */:
                return 78;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO_FULL_SPAN /* 177 */:
                return 79;
            case RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD /* 178 */:
                return 80;
            case RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD_FULL_SPAN /* 179 */:
                return 81;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP /* 180 */:
                return 82;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_NAVIGATION_REP /* 181 */:
                return 83;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_DEFAULT_REP /* 182 */:
                return 84;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_STYLE_REP /* 183 */:
                return 63;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_REP /* 184 */:
                return 64;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_GRID_REP /* 185 */:
                return 65;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_TOPIC_TILE /* 186 */:
                return 66;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_EDITORIAL_CARD /* 187 */:
                return 67;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_EDITORIAL_CARD /* 188 */:
                return 68;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_WITH_TITLE_OVERLAY /* 189 */:
                return 69;
            case RecyclerViewTypes.VIEW_TYPE_ICON_AND_TEXT_INLINE_BUBBLE /* 190 */:
                return 70;
            case RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO /* 191 */:
                return 71;
            case RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY /* 192 */:
                return 86;
            case RecyclerViewTypes.VIEW_TYPE_LENS_HISTORY /* 193 */:
                return 3595;
            case RecyclerViewTypes.VIEW_TYPE_OVERSCROLL_SEARCH_CELL /* 194 */:
                return 3846;
            case RecyclerViewTypes.VIEW_TYPE_USER /* 195 */:
                return 3981;
            case RecyclerViewTypes.VIEW_SHOP_THE_LOOK_CLOSEUP_MODULE /* 196 */:
                return 75;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_HERO /* 197 */:
                return 90;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_THREE_PINS_COLLECTION /* 198 */:
                return 94;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_VIDEO /* 199 */:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE;
            case 200:
                return 95;
            case 201:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN /* 202 */:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_REP;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER /* 203 */:
                return RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_DOUBLE;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR /* 204 */:
                return RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_HEADER /* 205 */:
                return 96;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER /* 206 */:
                return 97;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_FEED_FOOTER /* 207 */:
                return 98;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION /* 208 */:
                return 99;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_ARTICLE_BOARD_SECTION_HEADER /* 209 */:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_RELATED_ARTICLES_HEADER /* 210 */:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID;
            case RecyclerViewTypes.VIEW_TYPE_GO_TO_HOME_FEED_FOOTER /* 211 */:
                return RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL;
            case RecyclerViewTypes.VIEW_TYPE_SIMPLE_ACTION_STORY /* 212 */:
                return RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL;
            case RecyclerViewTypes.VIEW_TYPE_CONVERSATION_GIF_REACTION /* 213 */:
                return RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
            case RecyclerViewTypes.VIEW_TYPE_INBOX_HEADER /* 214 */:
                return RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL;
            case RecyclerViewTypes.VIEW_TYPE_BOARD_INVITE_HEADER /* 215 */:
                return RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER;
            case RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER /* 216 */:
                return RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE;
            case RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER /* 217 */:
                return 3844;
            case RecyclerViewTypes.VIEW_TYPE_STYLE_HEADER /* 218 */:
                return RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW;
            case RecyclerViewTypes.VIEW_TYPE_STYLE_DESCRIPTION /* 219 */:
                return RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN;
            case RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER /* 220 */:
                return 3063;
            case RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_DOUBLE /* 221 */:
                return 3166;
            case RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_SINGLE /* 222 */:
                return 3221;
            case RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE /* 223 */:
                return 3236;
            case RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL /* 224 */:
                return 3308;
            case RecyclerViewTypes.VIEW_TYPE_STORY_SELECT_OR_REORDER_PINS /* 225 */:
                return 3243;
            case RecyclerViewTypes.VIEW_TYPE_STORY_GROUP_MY_PINS /* 226 */:
                return 3539;
            case RecyclerViewTypes.VIEW_TYPE_VTO_BUBBLE_CONTAINER /* 227 */:
                return 3687;
            case RecyclerViewTypes.VIEW_TYPE_PROFILE_BOARDLESS_PINS_HEADER /* 228 */:
                return 3626;
            case RecyclerViewTypes.VIEW_TYPE_IN_LINE_VTO /* 229 */:
                return 3627;
            case RecyclerViewTypes.VIEW_TYPE_AFFILIATE_LINK_IMAGE /* 230 */:
                return 3643;
            case RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER /* 231 */:
                return 3722;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM /* 232 */:
                return 3244;
            case RecyclerViewTypes.VIEW_TYPE_SEARCH_BOARD_CELL /* 233 */:
                return 3254;
            case RecyclerViewTypes.VIEW_TYPE_SHARESHEET_APP /* 234 */:
                return 3273;
            case RecyclerViewTypes.VIEW_TYPE_SHARESHEET_CONTACT /* 235 */:
                return 3277;
            case RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_CARD /* 236 */:
                return 3278;
            case RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_LIST_ITEM /* 237 */:
                return 3281;
            case RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_BOARD_NAME_HEADER /* 238 */:
                return 3282;
            case RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL /* 239 */:
                return 3283;
            case RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM /* 240 */:
                return 3348;
            case RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPAGE_ITEM /* 241 */:
                return 3380;
            case RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPIN_ITEM /* 242 */:
                return 3381;
            case RecyclerViewTypes.VIEW_TYPE_BRAND_MULTI_IMAGE_REP_ITEM /* 243 */:
                return 3382;
            case RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION /* 244 */:
                return 3468;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP /* 245 */:
                return 4075;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_STACKED_COLLAGE_DISPLAY_CARD_REP /* 246 */:
                return 4090;
            case RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER /* 247 */:
                return 4113;
            case RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER /* 248 */:
                return 3764;
            case RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP /* 249 */:
                return RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL;
            case 250:
                return RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE /* 251 */:
                return RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM;
            case RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN /* 252 */:
                return RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER /* 253 */:
                return RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL;
            case RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN /* 254 */:
                return RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE;
            case 255:
                return RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM;
            case RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER /* 256 */:
                return RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED;
            case RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER /* 257 */:
                return RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO;
            case RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW /* 258 */:
                return RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY;
            case RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS /* 259 */:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE;
            case RecyclerViewTypes.VIEW_TYPE_PROTECTED_BOARD_HEADER /* 260 */:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE;
            case RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_ON_ENDLESS_SCROLL_HEADER /* 261 */:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER;
            case RecyclerViewTypes.VIEW_TYPE_PRODUCT_FILTER_DIVIDER /* 262 */:
                return RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN;
            case RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_BOARDS /* 263 */:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM;
            case RecyclerViewTypes.VIEW_TYPE_ATG_VISUALIZATION_BANNER /* 264 */:
                return 3118;
            case RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO /* 265 */:
                return 3119;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_GRID /* 266 */:
                return 4102;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_CARD /* 267 */:
                return 160;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_THUMBNAIL /* 268 */:
                return RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER;
            case RecyclerViewTypes.VIEW_TYPE_FILTER_REMOVAL_BUTTON /* 269 */:
                return RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF /* 270 */:
                return RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM;
            case RecyclerViewTypes.VIEW_TYPE_BOARD_CONVERSATION_THREAD /* 271 */:
                return RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING;
            case RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO_AD_EXCLUDE /* 272 */:
                return 10677;
            case RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS_AD_EXCLUDE /* 273 */:
                return 3216;
            case RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_VIDEO_AD_EXCLUDE /* 274 */:
                return 3300;
            case RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_AD_EXCLUDE /* 275 */:
                return 3301;
            case RecyclerViewTypes.VIEW_TYPE_PIN_VIDEO_AD_EXCLUDE /* 276 */:
                return 3370;
            case RecyclerViewTypes.VIEW_TYPE_PIN_AD_EXCLUDE /* 277 */:
                return RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS;
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN_AD_EXCLUDE /* 278 */:
                return 3120;
            case RecyclerViewTypes.VIEW_TYPE_SHUFFLE_CAROUSEL /* 279 */:
                return 3542;
            case RecyclerViewTypes.VIEW_TYPE_PIN_WEBVIEW_AD /* 280 */:
                return 3139;
            case 281:
                return 3305;
            case 282:
                return RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE;
            case 283:
                return 3407;
            case 284:
                return 3408;
            case 285:
                return RecyclerViewTypes.VIEW_TYPE_PRODUCT_FILTER_DIVIDER;
            case 286:
                return RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_BOARDS;
            case 287:
                return RecyclerViewTypes.VIEW_TYPE_ATG_VISUALIZATION_BANNER;
            case 288:
                return RecyclerViewTypes.VIEW_TYPE_PROTECTED_BOARD_HEADER;
            case 289:
                return RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_ON_ENDLESS_SCROLL_HEADER;
            case 290:
                return RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO;
            case 291:
                return 3138;
            case 292:
                return 3140;
            case 293:
                return 3141;
            case 294:
                return 3143;
            case 295:
                return 3144;
            case 296:
                return 3145;
            case 297:
                return 3158;
            case 298:
                return 3164;
            case 299:
                return 3238;
            case AdSize.MEDIUM_RECTANGLE_WIDTH /* 300 */:
                return 3289;
            case wb.W0 /* 301 */:
                return 3596;
            case wb.X0 /* 302 */:
                return 3395;
            case 303:
                return 4052;
            case 304:
                return 4053;
            case 305:
                return 4079;
            case 306:
                return 3521;
            case 307:
                return 3271;
            case 308:
                return 3146;
            case 309:
                return 3147;
            case 310:
                return 3148;
            case 311:
                return 3149;
            case 312:
                return 3223;
            case 313:
                return 3364;
            case 314:
                return 3737;
            case 315:
                return 4038;
            case 316:
                return 3150;
            case 317:
                return 3180;
            case 318:
                return 3181;
            case 319:
                return 3201;
            case 320:
                return 3202;
            case 321:
                return 3203;
            case 322:
                return 3204;
            case 323:
                return 3205;
            case 324:
                return 3556;
            case 325:
                return 3207;
            case 326:
                return 3280;
            case 327:
                return 3376;
            case 328:
                return 3377;
            case 329:
                return 3378;
            case 330:
                return 3406;
            case 331:
                return RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_SINGLE;
            case 332:
                return RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE;
            case 333:
                return RecyclerViewTypes.VIEW_TYPE_ICON_AND_TEXT_INLINE_BUBBLE;
            case 334:
                return RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO;
            case 335:
                return RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY;
            case 336:
                return RecyclerViewTypes.VIEW_TYPE_LENS_HISTORY;
            case 337:
                return RecyclerViewTypes.VIEW_TYPE_USER;
            case 338:
                return 3168;
            case 339:
                return 201;
            case 340:
                return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN;
            case 341:
                return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER;
            case 342:
                return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR;
            case 343:
                return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_HEADER;
            case 344:
                return 3084;
            case 345:
                return 4059;
            case 346:
                return 4060;
            case 347:
                return 4115;
            case 348:
                return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_RELATED_ARTICLES_HEADER;
            case 349:
                return RecyclerViewTypes.VIEW_TYPE_GO_TO_HOME_FEED_FOOTER;
            case 350:
                return RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL;
            case 351:
                return RecyclerViewTypes.VIEW_TYPE_STORY_SELECT_OR_REORDER_PINS;
            case 352:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM;
            case 353:
                return RecyclerViewTypes.VIEW_TYPE_SEARCH_BOARD_CELL;
            case 354:
                return RecyclerViewTypes.VIEW_TYPE_SHARESHEET_APP;
            case 355:
                return RecyclerViewTypes.VIEW_TYPE_SHARESHEET_CONTACT;
            case 356:
                return RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_CARD;
            case 357:
                return RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_LIST_ITEM;
            case 358:
                return RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_BOARD_NAME_HEADER;
            case 359:
                return RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL;
            case 360:
                return RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM;
            case 361:
                return RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPAGE_ITEM;
            case 362:
                return RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPIN_ITEM;
            case 363:
                return RecyclerViewTypes.VIEW_TYPE_BRAND_MULTI_IMAGE_REP_ITEM;
            case 364:
                return RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION;
            case 365:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP;
            case 366:
                return 3056;
            case 367:
                return 3065;
            case 368:
                return 3066;
            case 369:
                return 3067;
            case 370:
                return 3068;
            case 371:
                return 3089;
            case 372:
                return 3091;
            case 373:
                return 3092;
            case 374:
                return 3093;
            case 375:
                return RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER;
            case 376:
                return RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP;
            case 377:
                return 1900;
            case 378:
                return 2000;
            case 379:
                return 2001;
            case 380:
                return 2002;
            case 381:
                return 2003;
            case 382:
                return 2004;
            case 383:
                return 2005;
            case 384:
                return 2006;
            case 385:
                return 2007;
            case 386:
                return 2008;
            case 387:
                return 2009;
            case 388:
                return 2010;
            case 389:
                return 2011;
            case 390:
                return 2012;
            case 391:
                return 2013;
            case 392:
                return 2014;
            case 393:
                return 2015;
            case 394:
                return 2016;
            case 395:
                return 2017;
            case 396:
                return 2018;
            case 397:
                return 2019;
            case 398:
                return 2020;
            case 399:
                return 2021;
            case 400:
                return 2022;
            case 401:
                return 2023;
            case 402:
                return 2024;
            case 403:
                return 2025;
            case 404:
                return 2026;
            case 405:
                return 2027;
            case 406:
                return 2028;
            case 407:
                return 2029;
            case 408:
                return 2030;
            case 409:
                return 2031;
            case 410:
                return 2032;
            case 411:
                return 2033;
            case 412:
                return 2034;
            case 413:
                return 2035;
            case 414:
                return 2036;
            case 415:
                return 2101;
            case 416:
                return 2102;
            case 417:
                return 2110;
            case 418:
                return 2111;
            case 419:
                return 2112;
            case 420:
                return 2120;
            case 421:
                return 2121;
            case 422:
                return 2122;
            case 423:
                return 2150;
            case 424:
                return 2167;
            case 425:
                return 2168;
            case 426:
                return 2169;
            case 427:
                return 2170;
            case 428:
                return 2171;
            case 429:
                return 2172;
            case 430:
                return 2173;
            case 431:
                return 4003;
            case 432:
                return 2401;
            case 433:
                return 2402;
            case 434:
                return 2403;
            case 435:
                return 2404;
            case 436:
                return 2405;
            case 437:
                return 2406;
            case 438:
                return RecyclerViewTypes.VIEW_TYPE_VTO_BUBBLE_CONTAINER;
            case 439:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_STACKED_COLLAGE_DISPLAY_CARD_REP;
            case 440:
                return 4094;
            case 441:
                return 4097;
            case 442:
                return 3526;
            case 443:
                return 3527;
            case 444:
                return 3669;
            case 445:
                return 3705;
            case 446:
                return 3706;
            case 447:
                return 4135;
            case 448:
                return 4111;
            case 449:
                return 3707;
            case 450:
                return 3708;
            case 451:
                return 3709;
            case 452:
                return 4138;
            case 453:
                return 3757;
            case 454:
                return 3860;
            case 455:
                return 4025;
            case 456:
                return 4026;
            case 457:
                return 4027;
            case 458:
                return 4028;
            case 459:
                return 4050;
            case 460:
                return 4051;
            case 461:
                return 2500;
            case 462:
                return 3466;
            case 463:
                return 3473;
            case 464:
                return 3543;
            case 465:
                return 3544;
            case 466:
                return 2510;
            case 467:
                return 2511;
            case AdSize.FULL_BANNER_WIDTH /* 468 */:
                return 2512;
            case 469:
                return 2513;
            case 470:
                return 2514;
            case 471:
                return 2515;
            case 472:
                return 2516;
            case 473:
                return 3226;
            case 474:
                return 2601;
            case 475:
                return 2602;
            case 476:
                return 2603;
            case 477:
                return 2604;
            case 478:
                return 2605;
            case 479:
                return 2701;
            case 480:
                return 2702;
            case 481:
                return 2703;
            case 482:
                return 2704;
            case 483:
                return 2705;
            case 484:
                return 2706;
            case 485:
                return 2707;
            case 486:
                return 2708;
            case 487:
                return 3072;
            case 488:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE;
            case 489:
                return RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN;
            case 490:
                return 3245;
            case 491:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER;
            case 492:
                return 255;
            case 493:
                return 3480;
            case 494:
                return 2900;
            case 495:
                return 2901;
            case 496:
                return 2902;
            case 497:
                return 2903;
            case 498:
                return 2904;
            case 499:
                return 2905;
            case 500:
                return 2906;
            case 501:
                return 2907;
            case 502:
                return RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
            case 503:
                return 3827;
            case 504:
                return 3050;
            case 505:
                return 3373;
            case 506:
                return 3064;
            case 507:
                return 3188;
            case 508:
                return 3334;
            case 509:
                return 4054;
            case 510:
                return 3051;
            case 511:
                return 3052;
            case BitmapUtils.BITMAP_TO_JPEG_SIZE /* 512 */:
                return 3053;
            case 513:
                return 3054;
            case 514:
                return 3057;
            case 515:
                return 3055;
            case 516:
                return 3062;
            case 517:
                return 3071;
            case 518:
                return 3073;
            case 519:
                return 3098;
            case 520:
                return 3074;
            case 521:
                return 3075;
            case 522:
                return 3090;
            case 523:
                return 3076;
            case 524:
                return 3077;
            case 525:
                return 3078;
            case 526:
                return 3079;
            case 527:
                return 3081;
            case 528:
                return 3082;
            case 529:
                return 3083;
            case 530:
                return 3086;
            case 531:
                return 3088;
            case 532:
                return 3094;
            case 533:
                return 3095;
            case 534:
                return 3096;
            case 535:
                return 3097;
            case 536:
                return 3109;
            case 537:
                return 3122;
            case 538:
                return 3123;
            case 539:
                return 3110;
            case 540:
                return 3111;
            case 541:
                return 3112;
            case 542:
                return 3114;
            case 543:
                return 3115;
            case 544:
                return 3116;
            case 545:
                return 3117;
            case 546:
                return 3124;
            case 547:
                return 3125;
            case 548:
                return 3128;
            case 549:
                return 3129;
            case 550:
                return 3130;
            case 551:
                return 3131;
            case 552:
                return 3132;
            case 553:
                return 3133;
            case 554:
                return 3155;
            case 555:
                return 3156;
            case 556:
                return 3174;
            case 557:
                return 3135;
            case 558:
                return 3136;
            case 559:
                return 3137;
            case 560:
                return 3153;
            case 561:
                return 3154;
            case 562:
                return 3157;
            case 563:
                return 3234;
            case 564:
                return 3192;
            case 565:
                return 3190;
            case 566:
                return 3193;
            case 567:
                return 3163;
            case 568:
                return 3235;
            case 569:
                return 3194;
            case 570:
                return 3182;
            case 571:
                return 3191;
            case 572:
                return 3162;
            case 573:
                return 3169;
            case 574:
                return 3170;
            case 575:
                return 3171;
            case 576:
                return 3183;
            case 577:
                return 3206;
            case 578:
                return 3208;
            case 579:
                return 3209;
            case 580:
                return 3217;
            case 581:
                return 3172;
            case 582:
                return 3175;
            case 583:
                return 3176;
            case 584:
                return 3184;
            case 585:
                return 3186;
            case 586:
                return 3187;
            case 587:
                return 3197;
            case 588:
                return 3213;
            case 589:
                return 3214;
            case 590:
                return 3215;
            case 591:
                return 3218;
            case 592:
                return 3219;
            case 593:
                return 3222;
            case 594:
                return 3228;
            case 595:
                return 3229;
            case 596:
                return 3230;
            case 597:
                return 3231;
            case 598:
                return 3232;
            case 599:
                return 3279;
            case AdSize.WIDE_SKYSCRAPER_HEIGHT /* 600 */:
                return 3294;
            case 601:
                return 3360;
            case 602:
                return 3361;
            case 603:
                return 3549;
            case 604:
                return 3741;
            case 605:
                return 3742;
            case 606:
                return 3851;
            case 607:
                return 3944;
            case 608:
                return 3253;
            case 609:
                return 3237;
            case 610:
                return 3239;
            case 611:
                return 3242;
            case 612:
                return 3270;
            case 613:
                return 3303;
            case 614:
                return 3304;
            case 615:
                return 3362;
            case 616:
                return 3369;
            case 617:
                return 3396;
            case 618:
                return 3455;
            case 619:
                return 3456;
            case 620:
                return 3462;
            case 621:
                return 3470;
            case 622:
                return 3831;
            case 623:
                return 3540;
            case 624:
                return 3612;
            case 625:
                return 3613;
            case 626:
                return 3619;
            case 627:
                return 3557;
            case 628:
                return 3558;
            case 629:
                return 3633;
            case 630:
                return 3338;
            case 631:
                return 3339;
            case 632:
                return 3340;
            case 633:
                return 3341;
            case 634:
                return 3342;
            case 635:
                return 3343;
            case 636:
                return 3347;
            case 637:
                return 3344;
            case 638:
                return 3345;
            case 639:
                return 3346;
            case 640:
                return 3686;
            case 641:
                return 3688;
            case 642:
                return 3701;
            case 643:
                return 3702;
            case 644:
                return 3703;
            case 645:
                return 3733;
            case 646:
                return 3255;
            case 647:
                return 3256;
            case 648:
                return 3257;
            case 649:
                return 3258;
            case 650:
                return 3259;
            case 651:
                return 3260;
            case 652:
                return 3261;
            case 653:
                return 3262;
            case 654:
                return 3263;
            case 655:
                return 3264;
            case 656:
                return 3265;
            case 657:
                return 3266;
            case 658:
                return 3267;
            case 659:
                return 3268;
            case 660:
                return 3269;
            case 661:
                return 3276;
            case 662:
                return 3290;
            case 663:
                return 3291;
            case 664:
                return 3292;
            case 665:
                return 3293;
            case 666:
                return 3358;
            case 667:
                return 3555;
            case 668:
                return 3810;
            case 669:
                return 3295;
            case 670:
                return 3296;
            case 671:
                return 3297;
            case 672:
                return 3298;
            case 673:
                return 3299;
            case 674:
                return 3307;
            case 675:
                return 3309;
            case 676:
                return 3310;
            case 677:
                return 3311;
            case 678:
                return 3312;
            case 679:
                return 3315;
            case 680:
                return 3316;
            case 681:
                return 3317;
            case 682:
                return 3318;
            case 683:
                return 3363;
            case 684:
                return 3319;
            case 685:
                return 3320;
            case 686:
                return 3321;
            case 687:
                return 3331;
            case 688:
                return 3332;
            case 689:
                return 3333;
            case 690:
                return 3469;
            case 691:
                return 3335;
            case 692:
                return 3336;
            case 693:
                return 3337;
            case 694:
                return 3349;
            case 695:
                return 3351;
            case 696:
                return 3352;
            case 697:
                return 3353;
            case 698:
                return 3354;
            case 699:
                return 3355;
            case 700:
                return 3356;
            case 701:
                return 3357;
            case 702:
                return 3359;
            case 703:
                return 3366;
            case 704:
                return 3372;
            case 705:
                return 3375;
            case 706:
                return 3517;
            case 707:
                return 3782;
            case 708:
                return 3963;
            case 709:
                return 3374;
            case 710:
                return 3383;
            case 711:
                return 3384;
            case 712:
                return 3385;
            case 713:
                return 3386;
            case 714:
                return 3387;
            case 715:
                return 3388;
            case 716:
                return 3389;
            case 717:
                return 3390;
            case 718:
                return 3391;
            case 719:
                return 3392;
            case 720:
                return 3393;
            case 721:
                return 3394;
            case 722:
                return 3509;
            case 723:
                return 3614;
            case 724:
                return 3615;
            case 725:
                return 3458;
            case 726:
                return 3459;
            case 727:
                return 3712;
            case AdSize.LEADERBOARD_WIDTH /* 728 */:
                return 3725;
            case 729:
                return 3726;
            case 730:
                return 3727;
            case 731:
                return 3746;
            case 732:
                return 3748;
            case 733:
                return 3749;
            case 734:
                return 3750;
            case 735:
                return 3751;
            case 736:
                return 4134;
            case 737:
                return 3409;
            case 738:
                return 3410;
            case 739:
                return 3415;
            case 740:
                return 3450;
            case 741:
                return 3481;
            case 742:
                return 3482;
            case 743:
                return 3554;
            case 744:
                return 3562;
            case 745:
                return 3610;
            case 746:
                return 3451;
            case 747:
                return 3452;
            case 748:
                return 3453;
            case 749:
                return 3454;
            case 750:
                return 3568;
            case 751:
                return 3457;
            case 752:
                return 3508;
            case 753:
                return 3553;
            case 754:
                return 3460;
            case 755:
                return 3461;
            case 756:
                return 3483;
            case 757:
                return 3541;
            case 758:
                return 3463;
            case 759:
                return 3464;
            case 760:
                return 3465;
            case 761:
                return 3744;
            case 762:
                return 3756;
            case 763:
                return 3474;
            case 764:
                return 3475;
            case 765:
                return 3768;
            case 766:
                return 3912;
            case 767:
                return 3913;
            case 768:
                return 3713;
            case 769:
                return 3510;
            case 770:
                return 3511;
            case 771:
                return 3518;
            case 772:
                return 3531;
            case 773:
                return 3532;
            case 774:
                return 3533;
            case 775:
                return 3535;
            case 776:
                return 3856;
            case 777:
                return 3550;
            case 778:
                return 3559;
            case 779:
                return 3560;
            case 780:
                return 3561;
            case 781:
                return 3563;
            case 782:
                return 3564;
            case 783:
                return 3565;
            case 784:
                return 3566;
            case 785:
                return 3569;
            case 786:
                return 3570;
            case 787:
                return 3571;
            case 788:
                return 3587;
            case 789:
                return 3588;
            case 790:
                return 3625;
            case 791:
                return 3593;
            case 792:
                return 3609;
            case 793:
                return 3572;
            case 794:
                return 3573;
            case 795:
                return 3574;
            case 796:
                return 3579;
            case 797:
                return 3581;
            case 798:
                return 3582;
            case 799:
                return 3583;
            case 800:
                return 3584;
            case 801:
                return 3591;
            case 802:
                return 3592;
            case 803:
                return 3611;
            case 804:
                return 3645;
            case 805:
                return 3646;
            case 806:
                return 3647;
            case 807:
                return 3671;
            case 808:
                return 3715;
            case 809:
                return 3716;
            case 810:
                return 3717;
            case 811:
                return 3718;
            case 812:
                return 3719;
            case 813:
                return 3720;
            case 814:
                return 3721;
            case 815:
                return 3723;
            case 816:
                return 3813;
            case 817:
                return 3724;
            case 818:
                return 3728;
            case 819:
                return 3743;
            case 820:
                return 3840;
            case 821:
                return 3841;
            case 822:
                return 3585;
            case 823:
                return 3586;
            case 824:
                return 3589;
            case 825:
                return 3597;
            case 826:
                return 3623;
            case 827:
                return 3624;
            case 828:
                return 3590;
            case 829:
                return 3599;
            case 830:
                return 3600;
            case 831:
                return 3601;
            case 832:
                return 3602;
            case 833:
                return 3711;
            case 834:
                return 3603;
            case 835:
                return 3604;
            case 836:
                return 3747;
            case 837:
                return 3758;
            case 838:
                return 3759;
            case 839:
                return 3760;
            case 840:
                return 3779;
            case 841:
                return 3780;
            case 842:
                return 3605;
            case 843:
                return 3606;
            case 844:
                return 3607;
            case 845:
                return 3608;
            case 846:
                return 3616;
            case 847:
                return 3620;
            case 848:
                return 3621;
            case 849:
                return 3622;
            case 850:
                return 3632;
            case 851:
                return 3639;
            case 852:
                return 3640;
            case 853:
                return 3641;
            case 854:
                return 3642;
            case 855:
                return 3644;
            case 856:
                return 3649;
            case 857:
                return 3650;
            case 858:
                return 3651;
            case 859:
                return 3652;
            case 860:
                return 4096;
            case 861:
                return 4114;
            case 862:
                return 4118;
            case 863:
                return 4137;
            case 864:
                return 3683;
            case 865:
                return 3684;
            case 866:
                return 3690;
            case 867:
                return 3691;
            case 868:
                return 3695;
            case 869:
                return 3685;
            case 870:
                return 3778;
            case 871:
                return 3689;
            case 872:
                return 3692;
            case 873:
                return 3693;
            case 874:
                return 3694;
            case 875:
                return 3698;
            case 876:
                return 3745;
            case 877:
                return 3696;
            case 878:
                return 3710;
            case 879:
                return 3729;
            case 880:
                return 3730;
            case 881:
                return 3731;
            case 882:
                return 3732;
            case 883:
                return 3802;
            case 884:
                return 3814;
            case 885:
                return 3815;
            case 886:
                return 3816;
            case 887:
                return 3806;
            case 888:
                return 3735;
            case 889:
                return 3736;
            case 890:
                return 3739;
            case 891:
                return 3740;
            case 892:
                return 3753;
            case 893:
                return 3754;
            case 894:
                return 3761;
            case 895:
                return 3863;
            case 896:
                return 3903;
            case 897:
                return 3904;
            case 898:
                return 3971;
            case 899:
                return 3972;
            case 900:
                return 3784;
            case 901:
                return 3833;
            case 902:
                return 3834;
            case 903:
                return 3835;
            case 904:
                return 3842;
            case 905:
                return 3843;
            case 906:
                return 3847;
            case 907:
                return 4089;
            case 908:
                return 3858;
            case 909:
                return 3859;
            case 910:
                return 3868;
            case 911:
                return 3869;
            case 912:
                return 3870;
            case 913:
                return 3871;
            case 914:
                return 3926;
            case 915:
                return 3929;
            case 916:
                return 3930;
            case 917:
                return 3993;
            case 918:
                return 3994;
            case 919:
                return 3996;
            case 920:
                return 4005;
            case 921:
                return 4006;
            case 922:
                return 4029;
            case 923:
                return 4056;
            case 924:
                return 4057;
            case 925:
                return 4080;
            case 926:
                return 3877;
            case 927:
                return 3899;
            case 928:
                return 3906;
            case 929:
                return 3916;
            case 930:
                return 3907;
            case 931:
                return 3922;
            case 932:
                return 3925;
            case 933:
                return 4098;
            case 934:
                return 3936;
            case 935:
                return 3940;
            case 936:
                return 3938;
            case 937:
                return 3943;
            case 938:
                return 3931;
            case 939:
                return 3932;
            case 940:
                return 3933;
            case 941:
                return 3942;
            case 942:
                return 3964;
            case 943:
                return 4083;
            case 944:
                return 4086;
            case 945:
                return 4087;
            case 946:
                return 4088;
            case 947:
                return 4099;
            case 948:
                return 4136;
            case 949:
                return 3941;
            case 950:
                return 3945;
            case 951:
                return 3951;
            case 952:
                return 3952;
            case 953:
                return 3954;
            case 954:
                return 3962;
            case 955:
                return 3968;
            case 956:
                return 4001;
            case 957:
                return 4002;
            case 958:
                return 3988;
            case 959:
                return 3989;
            case 960:
                return 3990;
            case 961:
                return 3991;
            case 962:
                return 3992;
            case 963:
                return 3998;
            case 964:
                return 3999;
            case 965:
                return 4072;
            case 966:
                return 4004;
            case 967:
                return 4011;
            case 968:
                return 4012;
            case 969:
                return 4013;
            case 970:
                return 4014;
            case 971:
                return 4017;
            case 972:
                return 4019;
            case 973:
                return 4055;
            case 974:
                return 4037;
            case 975:
                return 4058;
            case 976:
                return 4076;
            case 977:
                return 4077;
            case 978:
                return 4081;
            case 979:
                return 4082;
            case 980:
                return 4092;
            case 981:
                return 4095;
            case 982:
                return 4103;
            case 983:
                return 4105;
            case 984:
                return 4116;
            case 985:
                return 4120;
            case 986:
                return 4121;
            case 987:
                return 4122;
            case 988:
                return 4124;
            case 989:
                return 4132;
            case 990:
                return 4133;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
