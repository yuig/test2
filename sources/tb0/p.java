package tb0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p ACCOUNT_SETTINGS = new p("ACCOUNT_SETTINGS", 0);
    public static final p ACCOUNT_SWITCHER = new p("ACCOUNT_SWITCHER", 1);
    public static final p ADS_GMA = new p("ADS_GMA", 2);
    public static final p AMAZON_HANDSHAKE = new p("AMAZON_HANDSHAKE", 3);
    public static final p ANALYTICS_OVERVIEW = new p("ANALYTICS_OVERVIEW", 4);
    public static final p ARCHIVED_BOARDS = new p("ARCHIVED_BOARDS", 5);
    public static final p BOARD_AND_SECTION_VIEW = new p("BOARD_AND_SECTION_VIEW", 6);
    public static final p BOARD_CREATE = new p("BOARD_CREATE", 7);
    public static final p BOARD_EDIT = new p("BOARD_EDIT", 8);
    public static final p BOARD_INVITE = new p("BOARD_INVITE", 9);
    public static final p BOARD_SHOP = new p("BOARD_SHOP", 10);
    public static final p BULK_EDITOR = new p("BULK_EDITOR", 11);
    public static final p BUSINESS_HUB = new p("BUSINESS_HUB", 12);
    public static final p BUSINESS_NUX = new p("BUSINESS_NUX", 13);
    public static final p BUSINESS_SITE = new p("BUSINESS_SITE", 14);
    public static final p CAROUSEL_ADS = new p("CAROUSEL_ADS", 15);
    public static final p CATALOGS = new p("CATALOGS", 16);
    public static final p CATEGORY_INTEREST_FEEDS = new p("CATEGORY_INTEREST_FEEDS", 17);
    public static final p CHROME_TAB = new p("CHROME_TAB", 18);
    public static final p COLLAGES = new p("COLLAGES", 19);
    public static final p CLOSEUP = new p("CLOSEUP", 20);
    public static final p CLOSEUP_CLICKTHROUGH = new p("CLOSEUP_CLICKTHROUGH", 21);
    public static final p CLOSEUP_SHOP = new p("CLOSEUP_SHOP", 22);
    public static final p COLLECTIONS_ADS = new p("COLLECTIONS_ADS", 23);
    public static final p COMMENTS_AND_TRIES = new p("COMMENTS_AND_TRIES", 24);
    public static final p CONTACTS_UPLOAD = new p("CONTACTS_UPLOAD", 25);
    public static final p CONTEXT_MENU = new p("CONTEXT_MENU", 26);
    public static final p CONVERSATION_INSIGHTS = new p("CONVERSATION_INSIGHTS", 27);
    public static final p CRASH_REPORTING = new p("CRASH_REPORTING", 28);
    public static final p CREATOR_BUBBLES = new p("CREATOR_BUBBLES", 29);
    public static final p CREDENTIALS_SHARING = new p("CREDENTIALS_SHARING", 30);
    public static final p CURATED_SHOPPING = new p("CURATED_SHOPPING", 31);
    public static final p DATASTORE_PREFERENCES = new p("DATASTORE_PREFERENCES", 32);
    public static final p DEACTIVATE = new p("DEACTIVATE", 33);
    public static final p DOWNLOAD_IMAGE_MOBILE = new p("DOWNLOAD_IMAGE_MOBILE", 34);
    public static final p EMAIL_NOTIFICATIONS = new p("EMAIL_NOTIFICATIONS", 35);
    public static final p ENGAGEMENT_TAB = new p("ENGAGEMENT_TAB", 36);
    public static final p FLASHLIGHT = new p("FLASHLIGHT", 37);
    public static final p FOLLOW = new p("FOLLOW", 38);
    public static final p HASHTAGS = new p("HASHTAGS", 39);
    public static final p HIDDEN_PROFILES = new p("HIDDEN_PROFILES", 40);
    public static final p HOME_FEED = new p("HOME_FEED", 41);
    public static final p IDEA_ADS = new p("IDEA_ADS", 42);
    public static final p IDEA_PINS_CREATION = new p("IDEA_PINS_CREATION", 43);
    public static final p IDEA_PINS_DISPLAY = new p("IDEA_PINS_DISPLAY", 44);
    public static final p IMAGE_LOADING = new p("IMAGE_LOADING", 45);
    public static final p INBOX_MESSAGES = new p("INBOX_MESSAGES", 46);
    public static final p LEAD_GENERATION_UPSELLS = new p("LEAD_GENERATION_UPSELLS", 47);
    public static final p LENS = new p("LENS", 48);
    public static final p LIMITED_LOGIN = new p("LIMITED_LOGIN", 49);
    public static final p LOCALIZATION = new p("LOCALIZATION", 50);
    public static final p LOGIN_BUSINESS = new p("LOGIN_BUSINESS", 51);
    public static final p LOGIN_PINNER = new p("LOGIN_PINNER", 52);
    public static final p LOG_OUT = new p("LOG_OUT", 53);
    public static final p MEDIA_GALLERY = new p("MEDIA_GALLERY", 54);
    public static final p MERCHANTS_AND_CATALOGS = new p("MERCHANTS_AND_CATALOGS", 55);
    public static final p MERCHANT_STOREFRONT = new p("MERCHANT_STOREFRONT", 56);
    public static final p MESSAGING = new p("MESSAGING", 57);
    public static final p MOBILE_AD_TOOLS = new p("MOBILE_AD_TOOLS", 58);
    public static final p MOBILE_DEEP_LINKING_ADS = new p("MOBILE_DEEP_LINKING_ADS", 59);
    public static final p MORE_IDEAS_TAB = new p("MORE_IDEAS_TAB", 60);
    public static final p NATIVE_CHECKOUT = new p("NATIVE_CHECKOUT", 61);
    public static final p NAVBAR = new p("NAVBAR", 62);
    public static final p NAVIGATION = new p("NAVIGATION", 63);
    public static final p NOTIFICATIONS_TAB_FLYOUT = new p("NOTIFICATIONS_TAB_FLYOUT", 64);
    public static final p ONE_TAP_ADS = new p("ONE_TAP_ADS", 65);
    public static final p ORGANIZATIONAL_TOOLS = new p("ORGANIZATIONAL_TOOLS", 66);
    public static final p PASSWORD_RESET = new p("PASSWORD_RESET", 67);
    public static final p PERMISSIONS = new p("PERMISSIONS", 68);
    public static final p PERFORMANCE = new p("PERFORMANCE", 69);
    public static final p PINNER_NUX = new p("PINNER_NUX", 70);
    public static final p PDP = new p("PDP", 71);
    public static final p PINTEREST_BROWSER_BUTTON = new p("PINTEREST_BROWSER_BUTTON", 72);
    public static final p PIN_BUILDER = new p("PIN_BUILDER", 73);
    public static final p PIN_EDIT = new p("PIN_EDIT", 74);
    public static final p PIN_GRID = new p("PIN_GRID", 75);
    public static final p PIN_HIDE = new p("PIN_HIDE", 76);
    public static final p PIN_STATS_ON_CLOSEUP = new p("PIN_STATS_ON_CLOSEUP", 77);
    public static final p PLATFORM = new p("PLATFORM", 78);
    public static final p PLAY_SERVICES = new p("PLAY_SERVICES", 79);
    public static final p PREFETCH_MANAGER = new p("PREFETCH_MANAGER", 80);
    public static final p PROFILE_VIEW_BUSINESS = new p("PROFILE_VIEW_BUSINESS", 81);
    public static final p PROFILE_VIEW_PINNER = new p("PROFILE_VIEW_PINNER", 82);
    public static final p PROMOTE_ENTRY_POINTS = new p("PROMOTE_ENTRY_POINTS", 83);
    public static final p PROPEL_PAGE = new p("PROPEL_PAGE", 84);
    public static final p PUSH_NOTIFICATIONS = new p("PUSH_NOTIFICATIONS", 85);
    public static final p QUICK_PROMOTE = new p("QUICK_PROMOTE", 86);
    public static final p QUICK_PROMOTE_ENTRY_POINTS = new p("QUICK_PROMOTE_ENTRY_POINTS", 87);
    public static final p QUIZ = new p("QUIZ", 88);
    public static final p REACTIVATE = new p("REACTIVATE", 89);
    public static final p RELATED_PINS = new p("RELATED_PINS", 90);
    public static final p REMOVABLE_PINS = new p("REMOVABLE_PINS", 91);
    public static final p REPIN = new p("REPIN", 92);
    public static final p REPORT_PIN = new p("REPORT_PIN", 93);
    public static final p SEARCH_AUTOCOMPLETE = new p("SEARCH_AUTOCOMPLETE", 94);
    public static final p SEARCH_LANDING_PAGE = new p("SEARCH_LANDING_PAGE", 95);
    public static final p SEARCH_OWNS_PINS_BOARDS_USERS = new p("SEARCH_OWNS_PINS_BOARDS_USERS", 96);
    public static final p SEARCH_RESULTS = new p("SEARCH_RESULTS", 97);
    public static final p SEARCH_RESULTS_PROFILES_TAB = new p("SEARCH_RESULTS_PROFILES_TAB", 98);
    public static final p SEARCH_RESULTS_SHOP_TAB = new p("SEARCH_RESULTS_SHOP_TAB", 99);
    public static final p SHARING = new p("SHARING", 100);
    public static final p SHOPPING_LIST = new p("SHOPPING_LIST", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE);
    public static final p SHOP_THE_LOOK = new p("SHOP_THE_LOOK", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE);
    public static final p SHOWCASE_ADS = new p("SHOWCASE_ADS", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE);
    public static final p SIGNUP_BUSINESS = new p("SIGNUP_BUSINESS", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE);
    public static final p SIGNUP_PINNER = new p("SIGNUP_PINNER", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE);
    public static final p SKIN_TONE_RANGES = new p("SKIN_TONE_RANGES", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID);
    public static final p SOS_ADMIN_MODE = new p("SOS_ADMIN_MODE", RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER);
    public static final p STAGGERED_GRID = new p("STAGGERED_GRID", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE);
    public static final p TODAY_TAB = new p("TODAY_TAB", RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL);
    public static final p TOUCH_HANDLING = new p("TOUCH_HANDLING", RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL);
    public static final p TRENDS_AUDIENCE_INSIGHTS = new p("TRENDS_AUDIENCE_INSIGHTS", RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE);
    public static final p UNAUTH_PAGES = new p("UNAUTH_PAGES", RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER);
    public static final p UNSPECIFIED = new p("UNSPECIFIED", RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL);
    public static final p VERIFIED_MERCHANT_PROGRAM_STATUS_PAGE = new p("VERIFIED_MERCHANT_PROGRAM_STATUS_PAGE", RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER);
    public static final p VIDEOS_ADS = new p("VIDEOS_ADS", RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE);
    public static final p VIDEO_PLAYER = new p("VIDEO_PLAYER", RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW);
    public static final p VIRTUAL_TRY_ON = new p("VIRTUAL_TRY_ON", RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN);
    public static final p WEBSITE_VERIFICATION = new p("WEBSITE_VERIFICATION", RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL);
    public static final p CREATOR_REWARDS = new p("CREATOR_REWARDS", RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL);
    public static final p LEAD_AD = new p("LEAD_AD", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
    public static final p GESTALT_COMPONENTS = new p("GESTALT_COMPONENTS", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL);
    public static final p AD_FORMATS = new p("AD_FORMATS", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN);
    public static final p USER_SEQUENCE = new p("USER_SEQUENCE", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
    public static final p EXPERIENCES = new p("EXPERIENCES", RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);

    private static final /* synthetic */ p[] $values() {
        return new p[]{ACCOUNT_SETTINGS, ACCOUNT_SWITCHER, ADS_GMA, AMAZON_HANDSHAKE, ANALYTICS_OVERVIEW, ARCHIVED_BOARDS, BOARD_AND_SECTION_VIEW, BOARD_CREATE, BOARD_EDIT, BOARD_INVITE, BOARD_SHOP, BULK_EDITOR, BUSINESS_HUB, BUSINESS_NUX, BUSINESS_SITE, CAROUSEL_ADS, CATALOGS, CATEGORY_INTEREST_FEEDS, CHROME_TAB, COLLAGES, CLOSEUP, CLOSEUP_CLICKTHROUGH, CLOSEUP_SHOP, COLLECTIONS_ADS, COMMENTS_AND_TRIES, CONTACTS_UPLOAD, CONTEXT_MENU, CONVERSATION_INSIGHTS, CRASH_REPORTING, CREATOR_BUBBLES, CREDENTIALS_SHARING, CURATED_SHOPPING, DATASTORE_PREFERENCES, DEACTIVATE, DOWNLOAD_IMAGE_MOBILE, EMAIL_NOTIFICATIONS, ENGAGEMENT_TAB, FLASHLIGHT, FOLLOW, HASHTAGS, HIDDEN_PROFILES, HOME_FEED, IDEA_ADS, IDEA_PINS_CREATION, IDEA_PINS_DISPLAY, IMAGE_LOADING, INBOX_MESSAGES, LEAD_GENERATION_UPSELLS, LENS, LIMITED_LOGIN, LOCALIZATION, LOGIN_BUSINESS, LOGIN_PINNER, LOG_OUT, MEDIA_GALLERY, MERCHANTS_AND_CATALOGS, MERCHANT_STOREFRONT, MESSAGING, MOBILE_AD_TOOLS, MOBILE_DEEP_LINKING_ADS, MORE_IDEAS_TAB, NATIVE_CHECKOUT, NAVBAR, NAVIGATION, NOTIFICATIONS_TAB_FLYOUT, ONE_TAP_ADS, ORGANIZATIONAL_TOOLS, PASSWORD_RESET, PERMISSIONS, PERFORMANCE, PINNER_NUX, PDP, PINTEREST_BROWSER_BUTTON, PIN_BUILDER, PIN_EDIT, PIN_GRID, PIN_HIDE, PIN_STATS_ON_CLOSEUP, PLATFORM, PLAY_SERVICES, PREFETCH_MANAGER, PROFILE_VIEW_BUSINESS, PROFILE_VIEW_PINNER, PROMOTE_ENTRY_POINTS, PROPEL_PAGE, PUSH_NOTIFICATIONS, QUICK_PROMOTE, QUICK_PROMOTE_ENTRY_POINTS, QUIZ, REACTIVATE, RELATED_PINS, REMOVABLE_PINS, REPIN, REPORT_PIN, SEARCH_AUTOCOMPLETE, SEARCH_LANDING_PAGE, SEARCH_OWNS_PINS_BOARDS_USERS, SEARCH_RESULTS, SEARCH_RESULTS_PROFILES_TAB, SEARCH_RESULTS_SHOP_TAB, SHARING, SHOPPING_LIST, SHOP_THE_LOOK, SHOWCASE_ADS, SIGNUP_BUSINESS, SIGNUP_PINNER, SKIN_TONE_RANGES, SOS_ADMIN_MODE, STAGGERED_GRID, TODAY_TAB, TOUCH_HANDLING, TRENDS_AUDIENCE_INSIGHTS, UNAUTH_PAGES, UNSPECIFIED, VERIFIED_MERCHANT_PROGRAM_STATUS_PAGE, VIDEOS_ADS, VIDEO_PLAYER, VIRTUAL_TRY_ON, WEBSITE_VERIFICATION, CREATOR_REWARDS, LEAD_AD, GESTALT_COMPONENTS, AD_FORMATS, USER_SEQUENCE, EXPERIENCES};
    }

    static {
        p[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private p(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
