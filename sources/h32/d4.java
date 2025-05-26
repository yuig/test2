package h32;

import com.google.android.gms.ads.AdSize;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d4 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d4[] $VALUES;

    @NotNull
    public static final b4 Companion;
    public static final d4 FEED = new d4("FEED", 0);
    public static final d4 SEARCH = new d4("SEARCH", 1);
    public static final d4 PIN = new d4("PIN", 2);
    public static final d4 USER = new d4("USER", 3);
    public static final d4 BOARD = new d4("BOARD", 4);
    public static final d4 SETTINGS = new d4("SETTINGS", 5);
    public static final d4 LOGIN = new d4("LOGIN", 6);
    public static final d4 REGISTRATION = new d4("REGISTRATION", 7);
    public static final d4 BROWSER = new d4("BROWSER", 8);
    public static final d4 ANDROID_WIDGET = new d4("ANDROID_WIDGET", 9);
    public static final d4 SPLASH = new d4("SPLASH", 10);
    public static final d4 CAMERA = new d4("CAMERA", 11);
    public static final d4 REPORT = new d4("REPORT", 12);
    public static final d4 ERROR = new d4("ERROR", 13);
    public static final d4 DEEP_LINKING = new d4("DEEP_LINKING", 14);
    public static final d4 ORIENTATION = new d4("ORIENTATION", 15);
    public static final d4 BIZ_ORIENTATION = new d4("BIZ_ORIENTATION", 16);
    public static final d4 ANDROID_CUBES = new d4("ANDROID_CUBES", 17);
    public static final d4 EMAIL = new d4("EMAIL", 18);
    public static final d4 OTHER_EXTERNAL = new d4("OTHER_EXTERNAL", 19);
    public static final d4 SERVICE_ENTRY_PAID = new d4("SERVICE_ENTRY_PAID", 20);
    public static final d4 SERVICE_ENTRY_INVITE_CODE = new d4("SERVICE_ENTRY_INVITE_CODE", 21);
    public static final d4 SERVICE_ENTRY_DIRECT = new d4("SERVICE_ENTRY_DIRECT", 22);
    public static final d4 CONVERSATION = new d4("CONVERSATION", 23);
    public static final d4 ACTION_SHEET = new d4("ACTION_SHEET", 24);
    public static final d4 ALERT_SHEET = new d4("ALERT_SHEET", 25);
    public static final d4 EMPTY_STATE = new d4("EMPTY_STATE", 26);
    public static final d4 SHARE_EXTENSION = new d4("SHARE_EXTENSION", 27);
    public static final d4 SHARE_EXTENSION_IMAGE_PICKER = new d4("SHARE_EXTENSION_IMAGE_PICKER", 28);
    public static final d4 SHARE_EXTENSION_SELECT_BOARD = new d4("SHARE_EXTENSION_SELECT_BOARD", 29);
    public static final d4 PUSH_NOTIFICATION = new d4("PUSH_NOTIFICATION", 30);
    public static final d4 SEND_SHARE = new d4("SEND_SHARE", 31);
    public static final d4 CONTACT_UPLOAD = new d4("CONTACT_UPLOAD", 32);
    public static final d4 HOMEFEED_TUNER = new d4("HOMEFEED_TUNER", 33);
    public static final d4 FLASHLIGHT = new d4("FLASHLIGHT", 34);
    public static final d4 FLASHLIGHT_CAMERA = new d4("FLASHLIGHT_CAMERA", 35);
    public static final d4 FLASHLIGHT_CAMERA_ROLL = new d4("FLASHLIGHT_CAMERA_ROLL", 36);
    public static final d4 FLASHLIGHT_CAMERA_ROLL_CLOSEUP = new d4("FLASHLIGHT_CAMERA_ROLL_CLOSEUP", 37);
    public static final d4 ARTICLE = new d4("ARTICLE", 38);
    public static final d4 BUBBLE_ARTICLE = new d4("BUBBLE_ARTICLE", 39);
    public static final d4 AGGREGATED_DID_IT_FEED = new d4("AGGREGATED_DID_IT_FEED", 40);
    public static final d4 PIN_CREATE_PINMARKLET = new d4("PIN_CREATE_PINMARKLET", 41);
    public static final d4 PIN_CREATE_REPIN = new d4("PIN_CREATE_REPIN", 42);
    public static final d4 PIN_CREATE = new d4("PIN_CREATE", 43);
    public static final d4 PIN_EDIT = new d4("PIN_EDIT", 44);
    public static final d4 PIN_COMMENTS = new d4("PIN_COMMENTS", 45);
    public static final d4 PIN_DID_IT = new d4("PIN_DID_IT", 46);
    public static final d4 PIN_CREATE_INFO = new d4("PIN_CREATE_INFO", 47);
    public static final d4 PIN_VISUAL_LINKS = new d4("PIN_VISUAL_LINKS", 48);
    public static final d4 PIN_SWIPE_CONTAINER = new d4("PIN_SWIPE_CONTAINER", 49);
    public static final d4 PIN_OR_SPIN_SELECTION = new d4("PIN_OR_SPIN_SELECTION", 50);
    public static final d4 PIN_OR_SPIN_REVEAL_REWARD = new d4("PIN_OR_SPIN_REVEAL_REWARD", 51);
    public static final d4 PIN_OR_SPIN_REWARD = new d4("PIN_OR_SPIN_REWARD", 52);
    public static final d4 NEWS_HUB = new d4("NEWS_HUB", 53);
    public static final d4 PIN_CLOSEUP_FULL_SCREEN_VIDEO = new d4("PIN_CLOSEUP_FULL_SCREEN_VIDEO", 54);
    public static final d4 PIN_CLOSEUP_FULL_SCREEN_IDEA_PIN_VIDEO = new d4("PIN_CLOSEUP_FULL_SCREEN_IDEA_PIN_VIDEO", 55);
    public static final d4 EXT_VOICE_SEARCH = new d4("EXT_VOICE_SEARCH", 56);
    public static final d4 ACTION_PROMPT = new d4("ACTION_PROMPT", 57);
    public static final d4 APPLICATION = new d4("APPLICATION", 58);
    public static final d4 APP_SHORTCUT = new d4("APP_SHORTCUT", 59);
    public static final d4 MODAL = new d4("MODAL", 60);
    public static final d4 SERVICE_ENTRY_WEB = new d4("SERVICE_ENTRY_WEB", 61);
    public static final d4 ABOUT_ADS = new d4("ABOUT_ADS", 62);
    public static final d4 BOARD_SECTION = new d4("BOARD_SECTION", 63);
    public static final d4 PINCODE = new d4("PINCODE", 64);
    public static final d4 INSIGHTS_AUDIENCE = new d4("INSIGHTS_AUDIENCE", 65);
    public static final d4 PINCH_TO_ZOOM = new d4("PINCH_TO_ZOOM", 66);
    public static final d4 ONE_TAP_V3_BROWSER = new d4("ONE_TAP_V3_BROWSER", 67);
    public static final d4 OFF_PINTEREST = new d4("OFF_PINTEREST", 68);
    public static final d4 PIN_ANALYTICS = new d4("PIN_ANALYTICS", 69);
    public static final d4 UNKNOWN_VIEW = new d4("UNKNOWN_VIEW", 70);
    public static final d4 PIN_ANALYTICS_SAVED_BOARDS = new d4("PIN_ANALYTICS_SAVED_BOARDS", 71);
    public static final d4 GDPR_FLOW = new d4("GDPR_FLOW", 72);
    public static final d4 REORDER = new d4("REORDER", 73);
    public static final d4 ANALYTICS_OVERVIEW = new d4("ANALYTICS_OVERVIEW", 74);
    public static final d4 SOCIAL_MANAGER = new d4("SOCIAL_MANAGER", 75);
    public static final d4 STORY_PIN = new d4("STORY_PIN", 76);
    public static final d4 STORY_PIN_MULTI_PHOTO_PICKER = new d4("STORY_PIN_MULTI_PHOTO_PICKER", 77);
    public static final d4 STORY_PIN_MULTI_DRAFTS = new d4("STORY_PIN_MULTI_DRAFTS", 78);
    public static final d4 STORY_PIN_METADATA = new d4("STORY_PIN_METADATA", 79);
    public static final d4 STORY_PIN_DETAILS = new d4("STORY_PIN_DETAILS", 80);
    public static final d4 STORY_PIN_CAMERA = new d4("STORY_PIN_CAMERA", 81);
    public static final d4 STORY_PIN_GALLERY = new d4("STORY_PIN_GALLERY", 82);
    public static final d4 STORY_PIN_PAGE_EDIT = new d4("STORY_PIN_PAGE_EDIT", 83);
    public static final d4 STORY_PIN_PAGE_TRIMMER_TOOL = new d4("STORY_PIN_PAGE_TRIMMER_TOOL", 84);
    public static final d4 STORY_PIN_PAGE_TEXT_EDITOR_TOOL = new d4("STORY_PIN_PAGE_TEXT_EDITOR_TOOL", 85);
    public static final d4 STORY_PIN_PAGE_TEXT_DURATION_TOOL = new d4("STORY_PIN_PAGE_TEXT_DURATION_TOOL", 86);
    public static final d4 STORY_PIN_PAGE_MUSIC_SELECTION_TOOL = new d4("STORY_PIN_PAGE_MUSIC_SELECTION_TOOL", 87);
    public static final d4 STORY_PIN_PAGE_MUSIC_ADJUST_TOOL = new d4("STORY_PIN_PAGE_MUSIC_ADJUST_TOOL", 88);
    public static final d4 STORY_PIN_PAGE_VOICEOVER_TOOL = new d4("STORY_PIN_PAGE_VOICEOVER_TOOL", 89);
    public static final d4 STORY_PIN_STICKER_PICKER = new d4("STORY_PIN_STICKER_PICKER", 90);
    public static final d4 STORY_PIN_STICKER_BY_CATEGORY_PICKER = new d4("STORY_PIN_STICKER_BY_CATEGORY_PICKER", 91);
    public static final d4 STORY_PIN_SUPPORT_MODAL = new d4("STORY_PIN_SUPPORT_MODAL", 92);
    public static final d4 STORY_PIN_ADVANCED_SETTINGS = new d4("STORY_PIN_ADVANCED_SETTINGS", 93);
    public static final d4 STORY_PIN_PAGE_DRAWING_TOOL = new d4("STORY_PIN_PAGE_DRAWING_TOOL", 94);
    public static final d4 IDEA_PIN_EDUCATION = new d4("IDEA_PIN_EDUCATION", 95);
    public static final d4 IDEA_PINEDUCATION_VIEW_PAGER = new d4("IDEA_PINEDUCATION_VIEW_PAGER", 96);
    public static final d4 IDEA_PIN_PAID_PARTNERSHIP_EDIT = new d4("IDEA_PIN_PAID_PARTNERSHIP_EDIT", 97);
    public static final d4 IDEA_PIN_CANVAS_ASPECT_RATIO_TOOL = new d4("IDEA_PIN_CANVAS_ASPECT_RATIO_TOOL", 98);
    public static final d4 IDEA_PIN_IMAGE_STICKER_PHOTO_PICKER = new d4("IDEA_PIN_IMAGE_STICKER_PHOTO_PICKER", 99);
    public static final d4 STORY_PIN_DETAILS_HASHTAGS_TYPEAHEAD = new d4("STORY_PIN_DETAILS_HASHTAGS_TYPEAHEAD", 100);
    public static final d4 STORY_PIN_DETAILS_HASHTAGS_TYPEAHEAD_SELECTED = new d4("STORY_PIN_DETAILS_HASHTAGS_TYPEAHEAD_SELECTED", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE);
    public static final d4 PIN_TEMPLATE_PICKER_MODAL = new d4("PIN_TEMPLATE_PICKER_MODAL", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE);
    public static final d4 PIN_INTEREST_TAGGING = new d4("PIN_INTEREST_TAGGING", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE);
    public static final d4 CONVERT_TO_PERSONAL = new d4("CONVERT_TO_PERSONAL", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE);
    public static final d4 CONVERT_TO_BUSINESS = new d4("CONVERT_TO_BUSINESS", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE);
    public static final d4 ACCOUNT_SWITCHER = new d4("ACCOUNT_SWITCHER", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID);
    public static final d4 BUSINESS_ACCOUNT_COVER_PHOTO_PICKER = new d4("BUSINESS_ACCOUNT_COVER_PHOTO_PICKER", RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER);
    public static final d4 LIL_ADS_MANAGER_CREATE = new d4("LIL_ADS_MANAGER_CREATE", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE);
    public static final d4 PHONE_COUNTRY = new d4("PHONE_COUNTRY", RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL);
    public static final d4 HOMEFEED_CONTROL = new d4("HOMEFEED_CONTROL", RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL);
    public static final d4 IN_APP_SURVEY = new d4("IN_APP_SURVEY", RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE);
    public static final d4 HOMEFEED_RELEVANCE = new d4("HOMEFEED_RELEVANCE", RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER);
    public static final d4 VIRTUAL_TRY_ON = new d4("VIRTUAL_TRY_ON", RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL);
    public static final d4 AR_SCENE = new d4("AR_SCENE", RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER);
    public static final d4 STORY_PIN_CREATE_RESPONSE = new d4("STORY_PIN_CREATE_RESPONSE", RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE);
    public static final d4 PIN_NOTE = new d4("PIN_NOTE", RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW);
    public static final d4 CLOSEUP_SCENE_SHOP = new d4("CLOSEUP_SCENE_SHOP", RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN);
    public static final d4 COMMENT_COMPOSER = new d4("COMMENT_COMPOSER", RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL);
    public static final d4 COMMENT_STICKER_PICKER = new d4("COMMENT_STICKER_PICKER", RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL);
    public static final d4 PRODUCT_TAGGING = new d4("PRODUCT_TAGGING", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
    public static final d4 VTO_PRODUCT_TAGGING = new d4("VTO_PRODUCT_TAGGING", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL);
    public static final d4 VTO_PRODUCT_TAGGING_PREVIEW = new d4("VTO_PRODUCT_TAGGING_PREVIEW", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN);
    public static final d4 ADD_ACCOUNT = new d4("ADD_ACCOUNT", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
    public static final d4 LIVE_SESSION_PIN = new d4("LIVE_SESSION_PIN", RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
    public static final d4 REPORT_FLOW = new d4("REPORT_FLOW", RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
    public static final d4 UNLINK_ACCOUNT = new d4("UNLINK_ACCOUNT", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
    public static final d4 MODAL_SEND = new d4("MODAL_SEND", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
    public static final d4 MODAL_MORE_DETAILS = new d4("MODAL_MORE_DETAILS", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
    public static final d4 MODAL_MORE_OPTIONS = new d4("MODAL_MORE_OPTIONS", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS);
    public static final d4 CREATOR_HUB = new d4("CREATOR_HUB", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN);
    public static final d4 CREATOR_PATHWAYS = new d4("CREATOR_PATHWAYS", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL);
    public static final d4 ABOUT_DRAWER = new d4("ABOUT_DRAWER", RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE);
    public static final d4 EDIT_ABOUT_PAGE = new d4("EDIT_ABOUT_PAGE", RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL);
    public static final d4 USER_SIGNALS_COLLECTION = new d4("USER_SIGNALS_COLLECTION", RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL);
    public static final d4 COLLAGE_CONTENT_SHEET = new d4("COLLAGE_CONTENT_SHEET", RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL);
    public static final d4 COLLAGE_EDITOR_CANVAS = new d4("COLLAGE_EDITOR_CANVAS", RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL);
    public static final d4 COLLAGE_CUTOUT_SELECTOR = new d4("COLLAGE_CUTOUT_SELECTOR", RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE);
    public static final d4 MULTI_FACTOR_AUTH_ENABLE = new d4("MULTI_FACTOR_AUTH_ENABLE", RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL);
    public static final d4 MULTI_FACTOR_AUTH_DISABLE = new d4("MULTI_FACTOR_AUTH_DISABLE", RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM);
    public static final d4 MULTI_FACTOR_AUTH_BACKUP = new d4("MULTI_FACTOR_AUTH_BACKUP", RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM);
    public static final d4 MULTI_FACTOR_AUTH_LOGIN = new d4("MULTI_FACTOR_AUTH_LOGIN", RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN);
    public static final d4 BRANDED_CONTENT_TERMS = new d4("BRANDED_CONTENT_TERMS", RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL);
    public static final d4 BRANDED_CONTENT_ENROLLED = new d4("BRANDED_CONTENT_ENROLLED", RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE);
    public static final d4 LIVESTREAM_APPLICATION = new d4("LIVESTREAM_APPLICATION", RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM);
    public static final d4 PIN_SCHEDULING_DATE_TIME_PICKER = new d4("PIN_SCHEDULING_DATE_TIME_PICKER", RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED);
    public static final d4 SHUFFLE_CUTOUT = new d4("SHUFFLE_CUTOUT", RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO);
    public static final d4 REPORTS_AND_VIOLATION_CENTER = new d4("REPORTS_AND_VIOLATION_CENTER", RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY);
    public static final d4 PEAR_INSIGHT = new d4("PEAR_INSIGHT", RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE);
    public static final d4 CUTOUT_TOOL = new d4("CUTOUT_TOOL", RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE);
    public static final d4 ORGANIZE_BOARDLESS_PINS = new d4("ORGANIZE_BOARDLESS_PINS", RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY);
    public static final d4 COLLAGE_COMPOSER = new d4("COLLAGE_COMPOSER", RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM);
    public static final d4 COLLAGE_COMPOSER_CREATE_PIN = new d4("COLLAGE_COMPOSER_CREATE_PIN", RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM);
    public static final d4 COLLAGE_COMPOSER_ITEM_PICKER = new d4("COLLAGE_COMPOSER_ITEM_PICKER", RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM);
    public static final d4 COLLAGE_COMPOSER_EFFECT_PICKER = new d4("COLLAGE_COMPOSER_EFFECT_PICKER", RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER);
    public static final d4 COLLAGE_COMPOSER_LAYERING_CONTROL = new d4("COLLAGE_COMPOSER_LAYERING_CONTROL", RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER);
    public static final d4 USER_BOARD_RESTORATION = new d4("USER_BOARD_RESTORATION", RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM);
    public static final d4 WIDGET_UPSELL = new d4("WIDGET_UPSELL", RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER);
    public static final d4 PEAR_QUIZ = new d4("PEAR_QUIZ", RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN);
    public static final d4 IMAGE_VISUALIZATION = new d4("IMAGE_VISUALIZATION", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER);
    public static final d4 HALF_MODAL = new d4("HALF_MODAL", 160);
    public static final d4 FULL_MODAL = new d4("FULL_MODAL", RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER);
    public static final d4 FLOATING_BOARD_PICKER = new d4("FLOATING_BOARD_PICKER", RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER);
    public static final d4 COLLAGE = new d4("COLLAGE", RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM);
    public static final d4 COLLAGE_PREVIEW = new d4("COLLAGE_PREVIEW", RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING);
    public static final d4 SSO = new d4("SSO", RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_CLEAR);
    public static final d4 PARENTAL_PASSCODE = new d4("PARENTAL_PASSCODE", RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE);
    public static final d4 RELATED_PINS_FILTER_OPTIONS_DRAWER = new d4("RELATED_PINS_FILTER_OPTIONS_DRAWER", RecyclerViewTypes.VIEW_TRY_ON_FEED_PRODUCT_CARD);
    public static final d4 ACCOUNT_RECOVERY_RESILIENCE = new d4("ACCOUNT_RECOVERY_RESILIENCE", RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION);
    public static final d4 POST_CREATE_UPSELL_MODAL = new d4("POST_CREATE_UPSELL_MODAL", RecyclerViewTypes.VIEW_TYPE_SHOPPING_SPOTLIGHT);
    public static final d4 PROFILE_PHOTO_PICKER = new d4("PROFILE_PHOTO_PICKER", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE);
    public static final d4 EMAIL_VERIFICATON = new d4("EMAIL_VERIFICATON", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO);
    public static final d4 EMAIL_VERIFICATION = new d4("EMAIL_VERIFICATION", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE);
    public static final d4 UNIFIED_INBOX = new d4("UNIFIED_INBOX", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO);
    public static final d4 EU_PROMPT_MODAL_IMPRESSION = new d4("EU_PROMPT_MODAL_IMPRESSION", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN);
    public static final d4 UNBLOCK_SHEET = new d4("UNBLOCK_SHEET", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO_FULL_SPAN);
    public static final d4 COLLAGE_QUICK_SWAP = new d4("COLLAGE_QUICK_SWAP", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN);
    public static final d4 BOARD_LANDING_PAGE = new d4("BOARD_LANDING_PAGE", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO_FULL_SPAN);
    public static final d4 BOARD_ALL_SAVES = new d4("BOARD_ALL_SAVES", RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD);
    public static final d4 INSTAGRAM_BACKFILL_MIGRATION = new d4("INSTAGRAM_BACKFILL_MIGRATION", RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD_FULL_SPAN);
    public static final d4 VISUAL_ANSWERS_FEED = new d4("VISUAL_ANSWERS_FEED", RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP);
    public static final d4 VISUAL_ANSWERS_FEED_QUESTION = new d4("VISUAL_ANSWERS_FEED_QUESTION", RecyclerViewTypes.VIEW_TYPE_BUBBLE_NAVIGATION_REP);

    private static final /* synthetic */ d4[] $values() {
        return new d4[]{FEED, SEARCH, PIN, USER, BOARD, SETTINGS, LOGIN, REGISTRATION, BROWSER, ANDROID_WIDGET, SPLASH, CAMERA, REPORT, ERROR, DEEP_LINKING, ORIENTATION, BIZ_ORIENTATION, ANDROID_CUBES, EMAIL, OTHER_EXTERNAL, SERVICE_ENTRY_PAID, SERVICE_ENTRY_INVITE_CODE, SERVICE_ENTRY_DIRECT, CONVERSATION, ACTION_SHEET, ALERT_SHEET, EMPTY_STATE, SHARE_EXTENSION, SHARE_EXTENSION_IMAGE_PICKER, SHARE_EXTENSION_SELECT_BOARD, PUSH_NOTIFICATION, SEND_SHARE, CONTACT_UPLOAD, HOMEFEED_TUNER, FLASHLIGHT, FLASHLIGHT_CAMERA, FLASHLIGHT_CAMERA_ROLL, FLASHLIGHT_CAMERA_ROLL_CLOSEUP, ARTICLE, BUBBLE_ARTICLE, AGGREGATED_DID_IT_FEED, PIN_CREATE_PINMARKLET, PIN_CREATE_REPIN, PIN_CREATE, PIN_EDIT, PIN_COMMENTS, PIN_DID_IT, PIN_CREATE_INFO, PIN_VISUAL_LINKS, PIN_SWIPE_CONTAINER, PIN_OR_SPIN_SELECTION, PIN_OR_SPIN_REVEAL_REWARD, PIN_OR_SPIN_REWARD, NEWS_HUB, PIN_CLOSEUP_FULL_SCREEN_VIDEO, PIN_CLOSEUP_FULL_SCREEN_IDEA_PIN_VIDEO, EXT_VOICE_SEARCH, ACTION_PROMPT, APPLICATION, APP_SHORTCUT, MODAL, SERVICE_ENTRY_WEB, ABOUT_ADS, BOARD_SECTION, PINCODE, INSIGHTS_AUDIENCE, PINCH_TO_ZOOM, ONE_TAP_V3_BROWSER, OFF_PINTEREST, PIN_ANALYTICS, UNKNOWN_VIEW, PIN_ANALYTICS_SAVED_BOARDS, GDPR_FLOW, REORDER, ANALYTICS_OVERVIEW, SOCIAL_MANAGER, STORY_PIN, STORY_PIN_MULTI_PHOTO_PICKER, STORY_PIN_MULTI_DRAFTS, STORY_PIN_METADATA, STORY_PIN_DETAILS, STORY_PIN_CAMERA, STORY_PIN_GALLERY, STORY_PIN_PAGE_EDIT, STORY_PIN_PAGE_TRIMMER_TOOL, STORY_PIN_PAGE_TEXT_EDITOR_TOOL, STORY_PIN_PAGE_TEXT_DURATION_TOOL, STORY_PIN_PAGE_MUSIC_SELECTION_TOOL, STORY_PIN_PAGE_MUSIC_ADJUST_TOOL, STORY_PIN_PAGE_VOICEOVER_TOOL, STORY_PIN_STICKER_PICKER, STORY_PIN_STICKER_BY_CATEGORY_PICKER, STORY_PIN_SUPPORT_MODAL, STORY_PIN_ADVANCED_SETTINGS, STORY_PIN_PAGE_DRAWING_TOOL, IDEA_PIN_EDUCATION, IDEA_PINEDUCATION_VIEW_PAGER, IDEA_PIN_PAID_PARTNERSHIP_EDIT, IDEA_PIN_CANVAS_ASPECT_RATIO_TOOL, IDEA_PIN_IMAGE_STICKER_PHOTO_PICKER, STORY_PIN_DETAILS_HASHTAGS_TYPEAHEAD, STORY_PIN_DETAILS_HASHTAGS_TYPEAHEAD_SELECTED, PIN_TEMPLATE_PICKER_MODAL, PIN_INTEREST_TAGGING, CONVERT_TO_PERSONAL, CONVERT_TO_BUSINESS, ACCOUNT_SWITCHER, BUSINESS_ACCOUNT_COVER_PHOTO_PICKER, LIL_ADS_MANAGER_CREATE, PHONE_COUNTRY, HOMEFEED_CONTROL, IN_APP_SURVEY, HOMEFEED_RELEVANCE, VIRTUAL_TRY_ON, AR_SCENE, STORY_PIN_CREATE_RESPONSE, PIN_NOTE, CLOSEUP_SCENE_SHOP, COMMENT_COMPOSER, COMMENT_STICKER_PICKER, PRODUCT_TAGGING, VTO_PRODUCT_TAGGING, VTO_PRODUCT_TAGGING_PREVIEW, ADD_ACCOUNT, LIVE_SESSION_PIN, REPORT_FLOW, UNLINK_ACCOUNT, MODAL_SEND, MODAL_MORE_DETAILS, MODAL_MORE_OPTIONS, CREATOR_HUB, CREATOR_PATHWAYS, ABOUT_DRAWER, EDIT_ABOUT_PAGE, USER_SIGNALS_COLLECTION, COLLAGE_CONTENT_SHEET, COLLAGE_EDITOR_CANVAS, COLLAGE_CUTOUT_SELECTOR, MULTI_FACTOR_AUTH_ENABLE, MULTI_FACTOR_AUTH_DISABLE, MULTI_FACTOR_AUTH_BACKUP, MULTI_FACTOR_AUTH_LOGIN, BRANDED_CONTENT_TERMS, BRANDED_CONTENT_ENROLLED, LIVESTREAM_APPLICATION, PIN_SCHEDULING_DATE_TIME_PICKER, SHUFFLE_CUTOUT, REPORTS_AND_VIOLATION_CENTER, PEAR_INSIGHT, CUTOUT_TOOL, ORGANIZE_BOARDLESS_PINS, COLLAGE_COMPOSER, COLLAGE_COMPOSER_CREATE_PIN, COLLAGE_COMPOSER_ITEM_PICKER, COLLAGE_COMPOSER_EFFECT_PICKER, COLLAGE_COMPOSER_LAYERING_CONTROL, USER_BOARD_RESTORATION, WIDGET_UPSELL, PEAR_QUIZ, IMAGE_VISUALIZATION, HALF_MODAL, FULL_MODAL, FLOATING_BOARD_PICKER, COLLAGE, COLLAGE_PREVIEW, SSO, PARENTAL_PASSCODE, RELATED_PINS_FILTER_OPTIONS_DRAWER, ACCOUNT_RECOVERY_RESILIENCE, POST_CREATE_UPSELL_MODAL, PROFILE_PHOTO_PICKER, EMAIL_VERIFICATON, EMAIL_VERIFICATION, UNIFIED_INBOX, EU_PROMPT_MODAL_IMPRESSION, UNBLOCK_SHEET, COLLAGE_QUICK_SWAP, BOARD_LANDING_PAGE, BOARD_ALL_SAVES, INSTAGRAM_BACKFILL_MIGRATION, VISUAL_ANSWERS_FEED, VISUAL_ANSWERS_FEED_QUESTION};
    }

    static {
        d4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new b4();
    }

    private d4(String str, int i13) {
    }

    public static final d4 findByValue(int i13) {
        Companion.getClass();
        return b4.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d4 valueOf(String str) {
        return (d4) Enum.valueOf(d4.class, str);
    }

    public static d4[] values() {
        return (d4[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (c4.f66937a[ordinal()]) {
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
                return 7;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 13;
            case 11:
                return 14;
            case 12:
                return 15;
            case 13:
                return 16;
            case 14:
                return 17;
            case 15:
                return 20;
            case 16:
                return 24;
            case 17:
                return RecyclerViewTypes.VIEW_TYPE_PROTECTED_BOARD_HEADER;
            case 18:
                return 639;
            case 19:
                return 31;
            case 20:
                return 32;
            case 21:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_EDITORIAL_CARD;
            case 22:
                return RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER;
            case 23:
                return 661;
            case 24:
                return 42;
            case 25:
                return 48;
            case 26:
                return 567;
            case 27:
                return 51;
            case 28:
                return 50;
            case 29:
                return 61;
            case 30:
                return 63;
            case 31:
                return 67;
            case 32:
                return 70;
            case 33:
                return 74;
            case 34:
                return 80;
            case 35:
                return 72;
            case 36:
                return RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL;
            case 37:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL;
            case 38:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL;
            case 39:
                return 78;
            case 40:
                return RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN;
            case 41:
                return 82;
            case 42:
                return 90;
            case 43:
                return 91;
            case 44:
                return 92;
            case 45:
                return 94;
            case 46:
                return 98;
            case 47:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE;
            case 48:
                return RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_CLEAR;
            case 49:
                return RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER;
            case 50:
                return RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO;
            case 51:
                return 717;
            case 52:
                return 718;
            case 53:
                return 719;
            case 54:
                return RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER;
            case 55:
                return RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL;
            case 56:
                return 609;
            case 57:
                return RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW;
            case 58:
                return RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL;
            case 59:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL;
            case 60:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS;
            case 61:
                return RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE;
            case 62:
                return RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM;
            case 63:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER;
            case 64:
                return RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING;
            case 65:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_SPOTLIGHT;
            case 66:
                return RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE;
            case 67:
                return RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO;
            case 68:
                return RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO_FULL_SPAN;
            case 69:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_TOPIC_TILE;
            case 70:
                return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_THREE_PINS_COLLECTION;
            case 71:
                return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN;
            case 72:
                return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER;
            case 73:
                return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_HEADER;
            case 74:
                return RecyclerViewTypes.VIEW_TYPE_STYLE_HEADER;
            case 75:
                return RecyclerViewTypes.VIEW_TYPE_STYLE_DESCRIPTION;
            case 76:
                return RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER;
            case 77:
                return RecyclerViewTypes.VIEW_TYPE_STORY_GROUP_MY_PINS;
            case 78:
                return RecyclerViewTypes.VIEW_TYPE_PROFILE_BOARDLESS_PINS_HEADER;
            case 79:
                return 483;
            case 80:
                return 432;
            case 81:
                return 437;
            case 82:
                return 444;
            case 83:
                return 445;
            case 84:
                return 446;
            case 85:
                return 447;
            case 86:
                return 501;
            case 87:
                return 448;
            case 88:
                return 449;
            case 89:
                return 450;
            case 90:
                return 451;
            case 91:
                return 485;
            case 92:
                return 536;
            case 93:
                return 492;
            case 94:
                return 504;
            case 95:
                return 506;
            case 96:
                return 570;
            case 97:
                return 571;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
                return 582;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
                return 597;
            case 100:
                return 633;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                return 643;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
                return 644;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
                return 441;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                return 386;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE /* 105 */:
                return RecyclerViewTypes.VIEW_TYPE_AFFILIATE_LINK_IMAGE;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
                return 476;
            case RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER /* 107 */:
                return RecyclerViewTypes.VIEW_TYPE_SHARESHEET_APP;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE /* 108 */:
                return RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER;
            case RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL /* 109 */:
                return RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL;
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL /* 110 */:
                return 473;
            case RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE /* 111 */:
                return 255;
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER /* 112 */:
                return RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_BOARDS;
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL /* 113 */:
                return 370;
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER /* 114 */:
                return 380;
            case RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE /* 115 */:
                return 544;
            case RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW /* 116 */:
                return 419;
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN /* 117 */:
                return 478;
            case RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL /* 118 */:
                return 427;
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL /* 119 */:
                return 541;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL /* 120 */:
                return 658;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL /* 121 */:
                return 479;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN /* 122 */:
                return 508;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL /* 123 */:
                return 510;
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER /* 124 */:
                return 487;
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED /* 125 */:
                return 494;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL /* 126 */:
                return 505;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK /* 127 */:
                return 507;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN /* 128 */:
                return 527;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS /* 129 */:
                return 528;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN /* 130 */:
                return 529;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL /* 131 */:
                return 531;
            case RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE /* 132 */:
                return 545;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL /* 133 */:
                return 548;
            case RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL /* 134 */:
                return 554;
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL /* 135 */:
                return 553;
            case RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL /* 136 */:
                return 559;
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE /* 137 */:
                return 560;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL /* 138 */:
                return 561;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM /* 139 */:
                return 562;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM /* 140 */:
                return 563;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN /* 141 */:
                return 564;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL /* 142 */:
                return 565;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE /* 143 */:
                return 573;
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM /* 144 */:
                return 574;
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED /* 145 */:
                return 595;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO /* 146 */:
                return 592;
            case RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY /* 147 */:
                return 610;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE /* 148 */:
                return 613;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE /* 149 */:
                return 624;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY /* 150 */:
                return 630;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM /* 151 */:
                return 631;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM /* 152 */:
                return 635;
            case RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM /* 153 */:
                return 637;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER /* 154 */:
                return 638;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER /* 155 */:
                return 645;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM /* 156 */:
                return 698;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER /* 157 */:
                return 651;
            case RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN /* 158 */:
                return 652;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER /* 159 */:
                return 654;
            case 160:
                return 709;
            case RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER /* 161 */:
                return 656;
            case RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER /* 162 */:
                return 657;
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM /* 163 */:
                return 659;
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING /* 164 */:
                return 662;
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_CLEAR /* 165 */:
                return 663;
            case RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE /* 166 */:
                return 664;
            case RecyclerViewTypes.VIEW_TRY_ON_FEED_PRODUCT_CARD /* 167 */:
                return 666;
            case RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION /* 168 */:
                return 667;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SPOTLIGHT /* 169 */:
                return 678;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE /* 170 */:
                return 679;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO /* 171 */:
                return 699;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE /* 172 */:
                return 702;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO /* 173 */:
                return 703;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN /* 174 */:
                return 704;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO_FULL_SPAN /* 175 */:
                return 707;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN /* 176 */:
                return 708;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO_FULL_SPAN /* 177 */:
                return 713;
            case RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD /* 178 */:
                return 715;
            case RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD_FULL_SPAN /* 179 */:
                return 716;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP /* 180 */:
                return 721;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_NAVIGATION_REP /* 181 */:
                return 727;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_DEFAULT_REP /* 182 */:
                return AdSize.LEADERBOARD_WIDTH;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
