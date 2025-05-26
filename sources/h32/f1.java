package h32;

import ads_mobile_sdk.wb;
import com.google.android.gms.ads.AdSize;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.NoWhenBranchMatchedException;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f1[] $VALUES;

    @NotNull
    public static final d1 Companion;
    public static final f1 VIEW = new f1("VIEW", 0);
    public static final f1 PIN_CREATE = new f1("PIN_CREATE", 1);
    public static final f1 PIN_CREATE_FAILURE = new f1("PIN_CREATE_FAILURE", 2);
    public static final f1 PIN_CREATE_ATTEMPTED = new f1("PIN_CREATE_ATTEMPTED", 3);
    public static final f1 PIN_EDIT = new f1("PIN_EDIT", 4);
    public static final f1 PIN_DELETE = new f1("PIN_DELETE", 5);
    public static final f1 PIN_REPIN = new f1("PIN_REPIN", 6);
    public static final f1 PIN_CLICKTHROUGH = new f1("PIN_CLICKTHROUGH", 7);
    public static final f1 PIN_CLICK = new f1("PIN_CLICK", 8);
    public static final f1 PIN_ZOOM = new f1("PIN_ZOOM", 9);
    public static final f1 PIN_SEND = new f1("PIN_SEND", 10);
    public static final f1 PIN_CLOSEUP = new f1("PIN_CLOSEUP", 11);
    public static final f1 PIN_IMPRESSION_ONE_PIXEL = new f1("PIN_IMPRESSION_ONE_PIXEL", 12);
    public static final f1 PIN_CLOSEUP_NUDGE = new f1("PIN_CLOSEUP_NUDGE", 13);
    public static final f1 STORY_IMPRESSION_ONE_PIXEL = new f1("STORY_IMPRESSION_ONE_PIXEL", 14);
    public static final f1 PRODUCT_TAG_VISIT = new f1("PRODUCT_TAG_VISIT", 15);
    public static final f1 IDEA_PIN_PRODUCT_TAG_REPIN = new f1("IDEA_PIN_PRODUCT_TAG_REPIN", 16);
    public static final f1 COMMENT_REPLY_TAG_VISIT = new f1("COMMENT_REPLY_TAG_VISIT", 17);
    public static final f1 BOARD_CREATE = new f1("BOARD_CREATE", 18);
    public static final f1 BOARD_DELETE = new f1("BOARD_DELETE", 19);
    public static final f1 BOARD_FOLLOW = new f1("BOARD_FOLLOW", 20);
    public static final f1 BOARD_UNFOLLOW = new f1("BOARD_UNFOLLOW", 21);
    public static final f1 BOARD_REMOVE_COLLABORATOR = new f1("BOARD_REMOVE_COLLABORATOR", 22);
    public static final f1 BOARD_INVITE_COLLABORATOR = new f1("BOARD_INVITE_COLLABORATOR", 23);
    public static final f1 BOARD_REQUEST_APPROVAL_INVITE_COLLABORATOR = new f1("BOARD_REQUEST_APPROVAL_INVITE_COLLABORATOR", 24);
    public static final f1 BOARD_SEND = new f1("BOARD_SEND", 25);
    public static final f1 BOARD_MERGE = new f1("BOARD_MERGE", 26);
    public static final f1 BOARD_REPORT = new f1("BOARD_REPORT", 27);
    public static final f1 BOARD_END = new f1("BOARD_END", 28);
    public static final f1 USER_CREATE = new f1("USER_CREATE", 29);
    public static final f1 USER_EDIT = new f1("USER_EDIT", 30);
    public static final f1 USER_DELETE = new f1("USER_DELETE", 31);
    public static final f1 USER_REORDER_BOARDS = new f1("USER_REORDER_BOARDS", 32);
    public static final f1 USER_FOLLOW = new f1("USER_FOLLOW", 33);
    public static final f1 USER_UNFOLLOW = new f1("USER_UNFOLLOW", 34);
    public static final f1 USER_DEACTIVATED = new f1("USER_DEACTIVATED", 35);
    public static final f1 USER_DELETE_REQUEST = new f1("USER_DELETE_REQUEST", 36);
    public static final f1 USER_LOGIN_ATTEMPT = new f1("USER_LOGIN_ATTEMPT", 37);
    public static final f1 USER_PASSWORD_RESET_REQUEST = new f1("USER_PASSWORD_RESET_REQUEST", 38);
    public static final f1 USER_PASSWORD_RESET_COMPLETED = new f1("USER_PASSWORD_RESET_COMPLETED", 39);
    public static final f1 USER_BLOCK = new f1("USER_BLOCK", 40);
    public static final f1 USER_UNBLOCK = new f1("USER_UNBLOCK", 41);
    public static final f1 USER_REPORT = new f1("USER_REPORT", 42);
    public static final f1 USER_PROFILE_REMOVE = new f1("USER_PROFILE_REMOVE", 43);
    public static final f1 USER_PROFILE_OVERFLOW_ACTIONS = new f1("USER_PROFILE_OVERFLOW_ACTIONS", 44);
    public static final f1 USER_PROFILE_OVERFLOW_ACTIONS_REPORT_SPAM = new f1("USER_PROFILE_OVERFLOW_ACTIONS_REPORT_SPAM", 45);
    public static final f1 USER_PROFILE_OVERFLOW_ACTIONS_REPORT_SPAM_CONFIRM = new f1("USER_PROFILE_OVERFLOW_ACTIONS_REPORT_SPAM_CONFIRM", 46);
    public static final f1 USER_SET_DSA_OPT_OUT = new f1("USER_SET_DSA_OPT_OUT", 47);
    public static final f1 START_TYPING = new f1("START_TYPING", 48);
    public static final f1 PIN_REPORT = new f1("PIN_REPORT", 49);
    public static final f1 PIN_LINK_REPORT = new f1("PIN_LINK_REPORT", 50);
    public static final f1 SEARCH_PINS = new f1("SEARCH_PINS", 51);
    public static final f1 SEARCH_BOARDS = new f1("SEARCH_BOARDS", 52);
    public static final f1 SEARCH_USERS = new f1("SEARCH_USERS", 53);
    public static final f1 SEARCH_MY_PINS = new f1("SEARCH_MY_PINS", 54);
    public static final f1 SEARCH_VIDEOS = new f1("SEARCH_VIDEOS", 55);
    public static final f1 SEARCH_IDEA_PIN_STICKERS = new f1("SEARCH_IDEA_PIN_STICKERS", 56);
    public static final f1 SEARCH_IDEA_PIN_MUSIC = new f1("SEARCH_IDEA_PIN_MUSIC", 57);
    public static final f1 LOGIN_OPTION_ENABLED_SUCCESS = new f1("LOGIN_OPTION_ENABLED_SUCCESS", 58);
    public static final f1 LOGIN_OPTION_ENABLED_FAILURE = new f1("LOGIN_OPTION_ENABLED_FAILURE", 59);
    public static final f1 REFRESH = new f1("REFRESH", 60);
    public static final f1 PIN_SAVE_TO_DEVICE = new f1("PIN_SAVE_TO_DEVICE", 61);
    public static final f1 USER_DISABLE_FACBOOK = new f1("USER_DISABLE_FACBOOK", 62);
    public static final f1 USER_DISABLE_GPLUS = new f1("USER_DISABLE_GPLUS", 63);
    public static final f1 USER_ENABLE_INSTAGRAM = new f1("USER_ENABLE_INSTAGRAM", 64);
    public static final f1 USER_DISABLE_INSTAGRAM = new f1("USER_DISABLE_INSTAGRAM", 65);
    public static final f1 USER_ENABLE_ETSY = new f1("USER_ENABLE_ETSY", 66);
    public static final f1 USER_DISABLE_ETSY = new f1("USER_DISABLE_ETSY", 67);
    public static final f1 CLICK = new f1("CLICK", 68);
    public static final f1 TAP = new f1("TAP", 69);
    public static final f1 TAP_LEFT = new f1("TAP_LEFT", 70);
    public static final f1 TAP_RIGHT = new f1("TAP_RIGHT", 71);
    public static final f1 LONG_PRESS = new f1("LONG_PRESS", 72);
    public static final f1 DRAG = new f1("DRAG", 73);
    public static final f1 HOVER = new f1("HOVER", 74);
    public static final f1 TOGGLE_ON = new f1("TOGGLE_ON", 75);
    public static final f1 TOGGLE_OFF = new f1("TOGGLE_OFF", 76);
    public static final f1 SWIPE = new f1("SWIPE", 77);
    public static final f1 SCROLL = new f1("SCROLL", 78);
    public static final f1 DROPDOWN_CHANGE = new f1("DROPDOWN_CHANGE", 79);
    public static final f1 SCROLL_UP_FROM_RELATED_PINS = new f1("SCROLL_UP_FROM_RELATED_PINS", 80);
    public static final f1 SWIPE_UP = new f1("SWIPE_UP", 81);
    public static final f1 SWIPE_DOWN = new f1("SWIPE_DOWN", 82);
    public static final f1 SWIPE_LEFT = new f1("SWIPE_LEFT", 83);
    public static final f1 SWIPE_RIGHT = new f1("SWIPE_RIGHT", 84);
    public static final f1 INPUT_CHANGE = new f1("INPUT_CHANGE", 85);
    public static final f1 SELECT = new f1("SELECT", 86);
    public static final f1 UNSELECT = new f1("UNSELECT", 87);
    public static final f1 IDEA_PIN_VIDEO_CONTROLS_IN = new f1("IDEA_PIN_VIDEO_CONTROLS_IN", 88);
    public static final f1 IDEA_PIN_VIDEO_CONTROLS_OUT = new f1("IDEA_PIN_VIDEO_CONTROLS_OUT", 89);
    public static final f1 PUSH_NOTIFICATION_RECEIVED_BY = new f1("PUSH_NOTIFICATION_RECEIVED_BY", 90);
    public static final f1 PUSH_NOTIFICATION_OPENED_BY = new f1("PUSH_NOTIFICATION_OPENED_BY", 91);
    public static final f1 PUSH_NOTIFICATION_SOURCE_MISMATCH = new f1("PUSH_NOTIFICATION_SOURCE_MISMATCH", 92);
    public static final f1 PUSH_NOTIFICATION_BOARD_INVITE_TO_BE_CREATED = new f1("PUSH_NOTIFICATION_BOARD_INVITE_TO_BE_CREATED", 93);
    public static final f1 PUSH_NOTIFICATION_BOARD_INVITE_CREATED = new f1("PUSH_NOTIFICATION_BOARD_INVITE_CREATED", 94);
    public static final f1 CONTEXTUAL_MENU_OPEN = new f1("CONTEXTUAL_MENU_OPEN", 95);
    public static final f1 CONTEXTUAL_MENU_CLOSE = new f1("CONTEXTUAL_MENU_CLOSE", 96);
    public static final f1 RENDER = new f1("RENDER", 97);
    public static final f1 DISMISS = new f1("DISMISS", 98);
    public static final f1 PIN_SCREENSHOT = new f1("PIN_SCREENSHOT", 99);
    public static final f1 BOARD_SCREENSHOT = new f1("BOARD_SCREENSHOT", 100);
    public static final f1 USER_SEND = new f1("USER_SEND", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE);
    public static final f1 USER_SEARCH_PRIVACY_CHANGED = new f1("USER_SEARCH_PRIVACY_CHANGED", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE);
    public static final f1 USER_PERSONALIZED_RECOMMENDATIONS_CHANGED = new f1("USER_PERSONALIZED_RECOMMENDATIONS_CHANGED", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE);
    public static final f1 PULL_TO_REFRESH = new f1("PULL_TO_REFRESH", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE);
    public static final f1 USER_LOGOUT_ATTEMPT = new f1("USER_LOGOUT_ATTEMPT", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE);
    public static final f1 INITIAL_FEED_LOAD_ABORT = new f1("INITIAL_FEED_LOAD_ABORT", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID);
    public static final f1 CONVERSATION_MESSAGE_SEND = new f1("CONVERSATION_MESSAGE_SEND", RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER);
    public static final f1 CONVERSATION_HIDE = new f1("CONVERSATION_HIDE", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE);
    public static final f1 CONVERSATION_REPORT = new f1("CONVERSATION_REPORT", RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL);
    public static final f1 CONVERSATION_VIEWED = new f1("CONVERSATION_VIEWED", RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL);
    public static final f1 CONVERSATION_INBOX_VIEWED = new f1("CONVERSATION_INBOX_VIEWED", RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE);
    public static final f1 CONVERSATION_THREAD_CLOSEUP_VIEWED = new f1("CONVERSATION_THREAD_CLOSEUP_VIEWED", RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER);
    public static final f1 CONVERSATION_PIN_QUICK_REPLIES_VIEWED = new f1("CONVERSATION_PIN_QUICK_REPLIES_VIEWED", RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL);
    public static final f1 CONVERSATION_PIN_QUICK_REPLY_SEND = new f1("CONVERSATION_PIN_QUICK_REPLY_SEND", RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER);
    public static final f1 CONVERSATION_PIN_REPLY = new f1("CONVERSATION_PIN_REPLY", RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE);
    public static final f1 CONVERSATION_EMPTY_INBOX_SEARCH_BAR_TAP_TARGET = new f1("CONVERSATION_EMPTY_INBOX_SEARCH_BAR_TAP_TARGET", RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW);
    public static final f1 APP_START = new f1("APP_START", RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN);
    public static final f1 APP_BACKGROUND = new f1("APP_BACKGROUND", RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL);
    public static final f1 PULL_NOTIFICATION_OPENED_BY = new f1("PULL_NOTIFICATION_OPENED_BY", RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL);
    public static final f1 INTEREST_FOLLOW = new f1("INTEREST_FOLLOW", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
    public static final f1 INTEREST_UNFOLLOW = new f1("INTEREST_UNFOLLOW", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL);
    public static final f1 DEEP_LINK_PINTEREST = new f1("DEEP_LINK_PINTEREST", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN);
    public static final f1 DEEP_LINK_HTTP = new f1("DEEP_LINK_HTTP", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
    public static final f1 DEEP_LINK_OTHER = new f1("DEEP_LINK_OTHER", RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
    public static final f1 SERVICE_ENTRY = new f1("SERVICE_ENTRY", RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
    public static final f1 BULK_PIN_DELETE = new f1("BULK_PIN_DELETE", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
    public static final f1 BULK_PIN_MOVE = new f1("BULK_PIN_MOVE", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
    public static final f1 REFERRER_APP_LOGIN = new f1("REFERRER_APP_LOGIN", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
    public static final f1 REFERRER_APP_SIGNUP = new f1("REFERRER_APP_SIGNUP", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS);
    public static final f1 APP_START_ATTRIBUTED = new f1("APP_START_ATTRIBUTED", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN);
    public static final f1 ADDRESS_BOOK_SYNC_ALLOWED = new f1("ADDRESS_BOOK_SYNC_ALLOWED", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL);
    public static final f1 ADDRESS_BOOK_SYNC_DECLINED = new f1("ADDRESS_BOOK_SYNC_DECLINED", RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE);
    public static final f1 ADDRESS_BOOK_SYNC_DECLINED_PERMANENTLY = new f1("ADDRESS_BOOK_SYNC_DECLINED_PERMANENTLY", RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL);
    public static final f1 APP_CRASH_DETECTED = new f1("APP_CRASH_DETECTED", RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL);
    public static final f1 APP_CRASH_OOM_DETECTED = new f1("APP_CRASH_OOM_DETECTED", RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL);
    public static final f1 APP_DEADLOCK_CRASH_DETECTED = new f1("APP_DEADLOCK_CRASH_DETECTED", RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL);
    public static final f1 SAVE_BROWSER_PIN_IMAGES_FOUND = new f1("SAVE_BROWSER_PIN_IMAGES_FOUND", RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE);
    public static final f1 SAVE_BROWSER_PIN_IMAGES_NOT_FOUND = new f1("SAVE_BROWSER_PIN_IMAGES_NOT_FOUND", RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL);
    public static final f1 SAVE_BROWSER_URL_NAVIGATE = new f1("SAVE_BROWSER_URL_NAVIGATE", RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM);
    public static final f1 SAVE_BROWSER_PIN_IMAGES_REQUESTED = new f1("SAVE_BROWSER_PIN_IMAGES_REQUESTED", RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM);
    public static final f1 PIN_CARD_VIEW = new f1("PIN_CARD_VIEW", RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN);
    public static final f1 DID_IT_SHARE = new f1("DID_IT_SHARE", RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL);
    public static final f1 AGGREGATED_PIN_COMMENT_LINK_TAP = new f1("AGGREGATED_PIN_COMMENT_LINK_TAP", RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE);
    public static final f1 AGGREGATED_COMMENT_COMMUNITY_GUIDELINE_BANNER_CLICK = new f1("AGGREGATED_COMMENT_COMMUNITY_GUIDELINE_BANNER_CLICK", RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM);
    public static final f1 COMMENT_CODE_VIEWED = new f1("COMMENT_CODE_VIEWED", RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED);
    public static final f1 COMMENT_CODE_DISMISSED = new f1("COMMENT_CODE_DISMISSED", RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO);
    public static final f1 COMMENT_CODE_ACCEPTED = new f1("COMMENT_CODE_ACCEPTED", RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY);
    public static final f1 COMMENT_PUSH_NOTIFICATION_NUDGE_VIEWED = new f1("COMMENT_PUSH_NOTIFICATION_NUDGE_VIEWED", RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE);
    public static final f1 COMMENT_PUSH_NOTIFICATION_NUDGE_DISMISSED = new f1("COMMENT_PUSH_NOTIFICATION_NUDGE_DISMISSED", RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE);
    public static final f1 COMMENT_PUSH_NOTIFICATION_NUDGE_ACCEPTED = new f1("COMMENT_PUSH_NOTIFICATION_NUDGE_ACCEPTED", RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY);
    public static final f1 COMMENT_OVERFLOW_BLOCK_USER_TAP = new f1("COMMENT_OVERFLOW_BLOCK_USER_TAP", RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM);
    public static final f1 COMMENT_BLOCK_USER_CONFIRMATION_CANCEL_TAP = new f1("COMMENT_BLOCK_USER_CONFIRMATION_CANCEL_TAP", RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM);
    public static final f1 COMMENT_BLOCK_USER_TOAST_UNDO_TAP = new f1("COMMENT_BLOCK_USER_TOAST_UNDO_TAP", RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM);
    public static final f1 COMMENT_HELPER_VIEWED = new f1("COMMENT_HELPER_VIEWED", RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER);
    public static final f1 COMMENT_HELPER_SELECTED = new f1("COMMENT_HELPER_SELECTED", RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER);
    public static final f1 COMMENT_HELPER_SENT = new f1("COMMENT_HELPER_SENT", RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM);
    public static final f1 SOCIAL_PERMISSION_SETTINGS_VISIT = new f1("SOCIAL_PERMISSION_SETTINGS_VISIT", RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER);
    public static final f1 MANUAL_FILTERS_VISIT = new f1("MANUAL_FILTERS_VISIT", RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN);
    public static final f1 MENTION_SETTINGS_TOGGLE = new f1("MENTION_SETTINGS_TOGGLE", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER);
    public static final f1 MENTION_SETTINGS_VISIT = new f1("MENTION_SETTINGS_VISIT", 160);
    public static final f1 SEE_TRANSLATION_VIEWED = new f1("SEE_TRANSLATION_VIEWED", RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER);
    public static final f1 SEE_TRANSLATION_TAP = new f1("SEE_TRANSLATION_TAP", RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER);
    public static final f1 SEE_ORIGINAL_TAP = new f1("SEE_ORIGINAL_TAP", RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM);
    public static final f1 COMMENT_USER_REACTIONS_VIEWED = new f1("COMMENT_USER_REACTIONS_VIEWED", RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING);
    public static final f1 PHOTO_COMMENT_PICKER_VIEWED = new f1("PHOTO_COMMENT_PICKER_VIEWED", RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_CLEAR);
    public static final f1 PHOTO_COMMENT_PICKER_PHOTO_SELECTED = new f1("PHOTO_COMMENT_PICKER_PHOTO_SELECTED", RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE);
    public static final f1 PHOTO_COMMENT_PICKER_PHOTO_SELECTION_FAILED = new f1("PHOTO_COMMENT_PICKER_PHOTO_SELECTION_FAILED", RecyclerViewTypes.VIEW_TRY_ON_FEED_PRODUCT_CARD);
    public static final f1 PHOTO_COMMENT_PICKER_CANCELED = new f1("PHOTO_COMMENT_PICKER_CANCELED", RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION);
    public static final f1 COMMUNITY_VIEW_INTENT = new f1("COMMUNITY_VIEW_INTENT", RecyclerViewTypes.VIEW_TYPE_SHOPPING_SPOTLIGHT);
    public static final f1 COMMUNITY_CONTENT_MODULE_VIEWED = new f1("COMMUNITY_CONTENT_MODULE_VIEWED", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE);
    public static final f1 COMMENT_FEED_CLOSED = new f1("COMMENT_FEED_CLOSED", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO);
    public static final f1 PIN_OR_SPIN_VIEW_INTENT = new f1("PIN_OR_SPIN_VIEW_INTENT", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE);
    public static final f1 PIN_OR_SPIN_EXIT = new f1("PIN_OR_SPIN_EXIT", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO);
    public static final f1 PIN_OR_SPIN_REFRESH = new f1("PIN_OR_SPIN_REFRESH", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN);
    public static final f1 PIN_OR_SPIN_PIN_SELECTED = new f1("PIN_OR_SPIN_PIN_SELECTED", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO_FULL_SPAN);
    public static final f1 PIN_OR_SPIN_CHOSEN_PIN_SELECTED = new f1("PIN_OR_SPIN_CHOSEN_PIN_SELECTED", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN);
    public static final f1 PIN_OR_SPIN_EXIT_REVEAL_REWARD_PAGE = new f1("PIN_OR_SPIN_EXIT_REVEAL_REWARD_PAGE", RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO_FULL_SPAN);
    public static final f1 PIN_OR_SPIN_REVEAL_REWARD_VIEW_INTENT = new f1("PIN_OR_SPIN_REVEAL_REWARD_VIEW_INTENT", RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD);
    public static final f1 PIN_OR_SPIN_REVEAL_REWARD = new f1("PIN_OR_SPIN_REVEAL_REWARD", RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD_FULL_SPAN);
    public static final f1 PIN_OR_SPIN_REWARD_VIEW_INTENT = new f1("PIN_OR_SPIN_REWARD_VIEW_INTENT", RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP);
    public static final f1 PIN_OR_SPIN_RESTART = new f1("PIN_OR_SPIN_RESTART", RecyclerViewTypes.VIEW_TYPE_BUBBLE_NAVIGATION_REP);
    public static final f1 PIN_OR_SPIN_REWARD_SAVE_BOARD = new f1("PIN_OR_SPIN_REWARD_SAVE_BOARD", RecyclerViewTypes.VIEW_TYPE_BUBBLE_DEFAULT_REP);
    public static final f1 PIN_OR_SPIN_INSTAGRAM_SHARE = new f1("PIN_OR_SPIN_INSTAGRAM_SHARE", RecyclerViewTypes.VIEW_TYPE_BUBBLE_STYLE_REP);
    public static final f1 PIN_OR_SPIN_SHARE_SHEET_CLICKED = new f1("PIN_OR_SPIN_SHARE_SHEET_CLICKED", RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_REP);
    public static final f1 PIN_OR_SPIN_DOWNLOAD = new f1("PIN_OR_SPIN_DOWNLOAD", RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_GRID_REP);
    public static final f1 FLASHLIGHT_CAMERA_TAP_SNAP = new f1("FLASHLIGHT_CAMERA_TAP_SNAP", RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_TOPIC_TILE);
    public static final f1 FLASHLIGHT_LENS_UNIVERSE_SEARCH = new f1("FLASHLIGHT_LENS_UNIVERSE_SEARCH", RecyclerViewTypes.VIEW_TYPE_BUBBLE_EDITORIAL_CARD);
    public static final f1 FLASHLIGHT_LENS_GALLERY_SEARCH = new f1("FLASHLIGHT_LENS_GALLERY_SEARCH", RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_EDITORIAL_CARD);
    public static final f1 FLASHLIGHT_CROPPER_MOVE = new f1("FLASHLIGHT_CROPPER_MOVE", RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_WITH_TITLE_OVERLAY);
    public static final f1 FLASHLIGHT_CROPPER_RESIZE = new f1("FLASHLIGHT_CROPPER_RESIZE", RecyclerViewTypes.VIEW_TYPE_ICON_AND_TEXT_INLINE_BUBBLE);
    public static final f1 FLASHLIGHT_CROPPER_NON_OBJECT_CROP = new f1("FLASHLIGHT_CROPPER_NON_OBJECT_CROP", RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO);
    public static final f1 FLASHLIGHT_CROPPER_PIN_LEVEL_CROP = new f1("FLASHLIGHT_CROPPER_PIN_LEVEL_CROP", RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
    public static final f1 FLASHLIGHT_CROPPER_DISMISS = new f1("FLASHLIGHT_CROPPER_DISMISS", RecyclerViewTypes.VIEW_TYPE_LENS_HISTORY);
    public static final f1 VISUAL_SEARCH_IMAGE_ZOOM = new f1("VISUAL_SEARCH_IMAGE_ZOOM", RecyclerViewTypes.VIEW_TYPE_OVERSCROLL_SEARCH_CELL);
    public static final f1 VISUAL_SEARCH_IMAGE_PAN = new f1("VISUAL_SEARCH_IMAGE_PAN", RecyclerViewTypes.VIEW_TYPE_USER);
    public static final f1 BOTTOM_SHEET_SNAP_FULLY_OPEN = new f1("BOTTOM_SHEET_SNAP_FULLY_OPEN", RecyclerViewTypes.VIEW_SHOP_THE_LOOK_CLOSEUP_MODULE);
    public static final f1 BOTTOM_SHEET_SNAP_DEFAULT = new f1("BOTTOM_SHEET_SNAP_DEFAULT", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_HERO);
    public static final f1 BOTTOM_SHEET_SNAP_MINIMIZED = new f1("BOTTOM_SHEET_SNAP_MINIMIZED", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_THREE_PINS_COLLECTION);
    public static final f1 BOTTOM_SHEET_SNAP_UNKNOWN = new f1("BOTTOM_SHEET_SNAP_UNKNOWN", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_VIDEO);
    public static final f1 VIDEO_PLAYBACK = new f1("VIDEO_PLAYBACK", 200);
    public static final f1 VIDEO_PREFETCH_START = new f1("VIDEO_PREFETCH_START", 201);
    public static final f1 VIDEO_PREFETCH_END = new f1("VIDEO_PREFETCH_END", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN);
    public static final f1 VIDEO_PLAYBACK_PERFORMANCE = new f1("VIDEO_PLAYBACK_PERFORMANCE", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER);
    public static final f1 VIDEO_MANAGER_SETUP = new f1("VIDEO_MANAGER_SETUP", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR);
    public static final f1 VIDEO_START = new f1("VIDEO_START", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_HEADER);
    public static final f1 VIDEO_PLAYBACK_COMPLETION = new f1("VIDEO_PLAYBACK_COMPLETION", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER);
    public static final f1 VIDEO_PLAYBACK_INTERVAL = new f1("VIDEO_PLAYBACK_INTERVAL", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_FEED_FOOTER);
    public static final f1 VIDEO_SINGLE_QUARTILE = new f1("VIDEO_SINGLE_QUARTILE", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION);
    public static final f1 VIDEO_UPLOAD_ATTEMPTED = new f1("VIDEO_UPLOAD_ATTEMPTED", RecyclerViewTypes.VIEW_TYPE_TODAY_ARTICLE_BOARD_SECTION_HEADER);
    public static final f1 VIDEO_UPLOAD_UPLOADED = new f1("VIDEO_UPLOAD_UPLOADED", RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_RELATED_ARTICLES_HEADER);
    public static final f1 VIDEO_UPLOAD_PROCESSED = new f1("VIDEO_UPLOAD_PROCESSED", RecyclerViewTypes.VIEW_TYPE_GO_TO_HOME_FEED_FOOTER);
    public static final f1 VIDEO_UPLOAD_SUCCEEDED = new f1("VIDEO_UPLOAD_SUCCEEDED", RecyclerViewTypes.VIEW_TYPE_SIMPLE_ACTION_STORY);
    public static final f1 VIDEO_UPLOAD_FAILED = new f1("VIDEO_UPLOAD_FAILED", RecyclerViewTypes.VIEW_TYPE_CONVERSATION_GIF_REACTION);
    public static final f1 VIDEO_UPLOAD_CANCELLED = new f1("VIDEO_UPLOAD_CANCELLED", RecyclerViewTypes.VIEW_TYPE_INBOX_HEADER);
    public static final f1 BOARD_IMPRESSION_ONE_PIXEL = new f1("BOARD_IMPRESSION_ONE_PIXEL", RecyclerViewTypes.VIEW_TYPE_BOARD_INVITE_HEADER);
    public static final f1 TOPIC_IMPRESSION_ONE_PIXEL = new f1("TOPIC_IMPRESSION_ONE_PIXEL", RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER);
    public static final f1 USER_IMPRESSION_ONE_PIXEL = new f1("USER_IMPRESSION_ONE_PIXEL", RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER);
    public static final f1 PIN_CLOSEUP_IMPRESSION_ONE_PIXEL = new f1("PIN_CLOSEUP_IMPRESSION_ONE_PIXEL", RecyclerViewTypes.VIEW_TYPE_STYLE_HEADER);
    public static final f1 SEARCH_IMPRESSION_ONE_PIXEL = new f1("SEARCH_IMPRESSION_ONE_PIXEL", RecyclerViewTypes.VIEW_TYPE_STYLE_DESCRIPTION);
    public static final f1 GUIDE_IMPRESSION_ONE_PIXEL = new f1("GUIDE_IMPRESSION_ONE_PIXEL", RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER);
    public static final f1 TODAY_ARTICLE_IMPRESSION_ONE_PIXEL = new f1("TODAY_ARTICLE_IMPRESSION_ONE_PIXEL", RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_DOUBLE);
    public static final f1 COMMENT_IMPRESSION_ONE_PIXEL = new f1("COMMENT_IMPRESSION_ONE_PIXEL", RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_SINGLE);
    public static final f1 MORE_IDEAS_FEED_UPSELL_IMPRESSION_ONE_PIXEL = new f1("MORE_IDEAS_FEED_UPSELL_IMPRESSION_ONE_PIXEL", RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE);
    public static final f1 RELATED_PINS_FILTER_IMPRESSION_ONE_PIXEL = new f1("RELATED_PINS_FILTER_IMPRESSION_ONE_PIXEL", RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL);
    public static final f1 USE_CASE_IMPRESSION_ONE_PIXEL = new f1("USE_CASE_IMPRESSION_ONE_PIXEL", RecyclerViewTypes.VIEW_TYPE_STORY_SELECT_OR_REORDER_PINS);
    public static final f1 SEARCH_PINS_BUYABLE = new f1("SEARCH_PINS_BUYABLE", RecyclerViewTypes.VIEW_TYPE_STORY_GROUP_MY_PINS);
    public static final f1 LOAD_URL = new f1("LOAD_URL", RecyclerViewTypes.VIEW_TYPE_VTO_BUBBLE_CONTAINER);
    public static final f1 ARTICLE_IMPRESSION_ONE_PIXEL = new f1("ARTICLE_IMPRESSION_ONE_PIXEL", RecyclerViewTypes.VIEW_TYPE_PROFILE_BOARDLESS_PINS_HEADER);
    public static final f1 ARTICLE_SEND = new f1("ARTICLE_SEND", RecyclerViewTypes.VIEW_TYPE_IN_LINE_VTO);
    public static final f1 BUBBLE_OPEN = new f1("BUBBLE_OPEN", RecyclerViewTypes.VIEW_TYPE_AFFILIATE_LINK_IMAGE);
    public static final f1 ACCEPT_CONTACT_REQUEST_CLICK = new f1("ACCEPT_CONTACT_REQUEST_CLICK", RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER);
    public static final f1 DECLINE_CONTACT_REQUEST_CLICK = new f1("DECLINE_CONTACT_REQUEST_CLICK", RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM);
    public static final f1 PREVIEW_CONTACT_REQUEST_CLICK = new f1("PREVIEW_CONTACT_REQUEST_CLICK", RecyclerViewTypes.VIEW_TYPE_SEARCH_BOARD_CELL);
    public static final f1 REPORT_CONTACT_REQUEST_CLICK = new f1("REPORT_CONTACT_REQUEST_CLICK", RecyclerViewTypes.VIEW_TYPE_SHARESHEET_APP);
    public static final f1 BLOCK_CONTACT_REQUEST_CLICK = new f1("BLOCK_CONTACT_REQUEST_CLICK", RecyclerViewTypes.VIEW_TYPE_SHARESHEET_CONTACT);
    public static final f1 UNBLOCK_CONTACT_REQUEST_CLICK = new f1("UNBLOCK_CONTACT_REQUEST_CLICK", RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_CARD);
    public static final f1 REPORT_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK = new f1("REPORT_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK", RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_LIST_ITEM);
    public static final f1 REPORT_AND_BLOCK_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK = new f1("REPORT_AND_BLOCK_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK", RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_BOARD_NAME_HEADER);
    public static final f1 DECLINE_CONTACT_REQUEST_UNDO_CLICK = new f1("DECLINE_CONTACT_REQUEST_UNDO_CLICK", RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL);
    public static final f1 BLOCK_CONTACT_REQUEST_CONFIRM_CLICK = new f1("BLOCK_CONTACT_REQUEST_CONFIRM_CLICK", RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM);
    public static final f1 DID_IT_ACTIVITY_REPORT = new f1("DID_IT_ACTIVITY_REPORT", RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPAGE_ITEM);
    public static final f1 PIN_CLICKTHROUGH_END = new f1("PIN_CLICKTHROUGH_END", RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPIN_ITEM);
    public static final f1 PIN_IAB_DURATION = new f1("PIN_IAB_DURATION", RecyclerViewTypes.VIEW_TYPE_BRAND_MULTI_IMAGE_REP_ITEM);
    public static final f1 PIN_IAB_START = new f1("PIN_IAB_START", RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION);
    public static final f1 NUX_START = new f1("NUX_START", RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP);
    public static final f1 NUX_END = new f1("NUX_END", RecyclerViewTypes.VIEW_TYPE_BUBBLE_STACKED_COLLAGE_DISPLAY_CARD_REP);
    public static final f1 NUX_STEP_END = new f1("NUX_STEP_END", RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER);
    public static final f1 REGULAR_NUX_START = new f1("REGULAR_NUX_START", RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER);
    public static final f1 REGULAR_NUX_END = new f1("REGULAR_NUX_END", RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP);
    public static final f1 NUX_DROP_OFF = new f1("NUX_DROP_OFF", 250);
    public static final f1 NUX_VIEW_GENDER = new f1("NUX_VIEW_GENDER", RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE);
    public static final f1 NUX_DONE_GENDER = new f1("NUX_DONE_GENDER", RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
    public static final f1 NUX_VIEW_LOCALE = new f1("NUX_VIEW_LOCALE", RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER);
    public static final f1 NUX_DONE_LOCALE = new f1("NUX_DONE_LOCALE", RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN);
    public static final f1 NUX_VIEW_TOPIC_PICKER = new f1("NUX_VIEW_TOPIC_PICKER", 255);
    public static final f1 NUX_DONE_TOPIC_PICKER = new f1("NUX_DONE_TOPIC_PICKER", RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
    public static final f1 NEWS_HUB_FEED_IMPRESSION_ONE_PIXEL = new f1("NEWS_HUB_FEED_IMPRESSION_ONE_PIXEL", RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER);
    public static final f1 NEWS_HUB_DETAIL_IMPRESSION_ONE_PIXEL = new f1("NEWS_HUB_DETAIL_IMPRESSION_ONE_PIXEL", RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW);
    public static final f1 SEARCH_SOCIAL_TYPEAHEAD = new f1("SEARCH_SOCIAL_TYPEAHEAD", RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS);
    public static final f1 EXPERIENCE_VIEWED = new f1("EXPERIENCE_VIEWED", RecyclerViewTypes.VIEW_TYPE_PROTECTED_BOARD_HEADER);
    public static final f1 TIMED_APP_FOREGROUND = new f1("TIMED_APP_FOREGROUND", RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_ON_ENDLESS_SCROLL_HEADER);
    public static final f1 TIMED_APP_BACKGROUND = new f1("TIMED_APP_BACKGROUND", RecyclerViewTypes.VIEW_TYPE_PRODUCT_FILTER_DIVIDER);
    public static final f1 TIMED_PAIR_BEGIN = new f1("TIMED_PAIR_BEGIN", RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_BOARDS);
    public static final f1 TIMED_PAIR_END = new f1("TIMED_PAIR_END", RecyclerViewTypes.VIEW_TYPE_ATG_VISUALIZATION_BANNER);
    public static final f1 GRID_PIN_LEVELING_APPLIED = new f1("GRID_PIN_LEVELING_APPLIED", RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO);
    public static final f1 EXPERIENCE_COMPLETED = new f1("EXPERIENCE_COMPLETED", RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_GRID);
    public static final f1 EXPERIENCE_DISMISSED = new f1("EXPERIENCE_DISMISSED", RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_CARD);
    public static final f1 FPE_START = new f1("FPE_START", RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_THUMBNAIL);
    public static final f1 FPE_END = new f1("FPE_END", RecyclerViewTypes.VIEW_TYPE_FILTER_REMOVAL_BUTTON);
    public static final f1 PINCODE_URL_NAVIGATE = new f1("PINCODE_URL_NAVIGATE", RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF);
    public static final f1 PINCODE_CREATE = new f1("PINCODE_CREATE", RecyclerViewTypes.VIEW_TYPE_BOARD_CONVERSATION_THREAD);
    public static final f1 IMAGE_ERROR = new f1("IMAGE_ERROR", RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO_AD_EXCLUDE);
    public static final f1 SEO_LANDING_PAGE_VIEW = new f1("SEO_LANDING_PAGE_VIEW", RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS_AD_EXCLUDE);
    public static final f1 DEFERRED_DEEP_LINK_FACEBOOK = new f1("DEFERRED_DEEP_LINK_FACEBOOK", RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_VIDEO_AD_EXCLUDE);
    public static final f1 URL_LOAD_STARTED = new f1("URL_LOAD_STARTED", RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_AD_EXCLUDE);
    public static final f1 URL_LOAD_FINISHED = new f1("URL_LOAD_FINISHED", RecyclerViewTypes.VIEW_TYPE_PIN_VIDEO_AD_EXCLUDE);
    public static final f1 URL_LOAD_ERROR = new f1("URL_LOAD_ERROR", RecyclerViewTypes.VIEW_TYPE_PIN_AD_EXCLUDE);
    public static final f1 URL_LOAD_PERCENT = new f1("URL_LOAD_PERCENT", RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN_AD_EXCLUDE);
    public static final f1 BOARD_SECTION_CREATE = new f1("BOARD_SECTION_CREATE", RecyclerViewTypes.VIEW_TYPE_SHUFFLE_CAROUSEL);
    public static final f1 BOARD_SECTION_EDIT = new f1("BOARD_SECTION_EDIT", RecyclerViewTypes.VIEW_TYPE_PIN_WEBVIEW_AD);
    public static final f1 BOARD_SECTION_DELETE = new f1("BOARD_SECTION_DELETE", 281);
    public static final f1 BOARD_SECTION_REMOVE_PINS = new f1("BOARD_SECTION_REMOVE_PINS", 282);
    public static final f1 BOARD_SECTION_MERGE = new f1("BOARD_SECTION_MERGE", 283);
    public static final f1 BOARD_SECTION_SUGGESTION_COMPLETED = new f1("BOARD_SECTION_SUGGESTION_COMPLETED", 284);
    public static final f1 PIN_REORDER = new f1("PIN_REORDER", 285);
    public static final f1 SECTION_REORDER = new f1("SECTION_REORDER", 286);
    public static final f1 PIN_SELECTION = new f1("PIN_SELECTION", 287);
    public static final f1 PIN_DESELECTION = new f1("PIN_DESELECTION", 288);
    public static final f1 BULK_SELECT_ALL_PIN_MOVE = new f1("BULK_SELECT_ALL_PIN_MOVE", 289);
    public static final f1 BULK_SELECT_ALL_PIN_DELETE = new f1("BULK_SELECT_ALL_PIN_DELETE", 290);
    public static final f1 VIEW_WEBSITE_ONE_PIXEL = new f1("VIEW_WEBSITE_ONE_PIXEL", 291);
    public static final f1 VIEW_WEBSITE_100 = new f1("VIEW_WEBSITE_100", 292);
    public static final f1 DESTINATION_VIEW = new f1("DESTINATION_VIEW", 293);
    public static final f1 SEND_SHARE_OPEN = new f1("SEND_SHARE_OPEN", 294);
    public static final f1 USER_ACTIVE = new f1("USER_ACTIVE", 295);
    public static final f1 PIN_TAGS_LOAD = new f1("PIN_TAGS_LOAD", 296);
    public static final f1 BOARD_IDEAS_VIEW = new f1("BOARD_IDEAS_VIEW", 297);
    public static final f1 PIN_CAROUSEL_SLOT_IMPRESSION_ONE_PIXEL = new f1("PIN_CAROUSEL_SLOT_IMPRESSION_ONE_PIXEL", 298);
    public static final f1 PIN_CAROUSEL_SLOT_CLICKTHROUGH = new f1("PIN_CAROUSEL_SLOT_CLICKTHROUGH", 299);
    public static final f1 INVITE_APP_LAND = new f1("INVITE_APP_LAND", AdSize.MEDIUM_RECTANGLE_WIDTH);
    public static final f1 LOCATION_PERMISSIONS_PROMPT = new f1("LOCATION_PERMISSIONS_PROMPT", wb.W0);
    public static final f1 LOCATION_PERMISSIONS_DENY = new f1("LOCATION_PERMISSIONS_DENY", wb.X0);
    public static final f1 LOCATION_PERMISSIONS_ACCEPT_WHILE_IN_USE = new f1("LOCATION_PERMISSIONS_ACCEPT_WHILE_IN_USE", 303);
    public static final f1 LOCATION_PERMISSIONS_CURRENT_STATUS = new f1("LOCATION_PERMISSIONS_CURRENT_STATUS", 304);
    public static final f1 SHARE_SHEET_DISMISS_NO_SEND = new f1("SHARE_SHEET_DISMISS_NO_SEND", 305);
    public static final f1 SHARE_SHEET_DISMISS_WITH_SEND = new f1("SHARE_SHEET_DISMISS_WITH_SEND", 306);
    public static final f1 SHARE_SHEET_VIEW_WITH_CONTACTS = new f1("SHARE_SHEET_VIEW_WITH_CONTACTS", 307);
    public static final f1 SHARE_SHEET_VIEW_WITH_NO_CONTACTS = new f1("SHARE_SHEET_VIEW_WITH_NO_CONTACTS", 308);
    public static final f1 SHARE_SHEET_IG_STORIES_EXPORT_SUCCESS = new f1("SHARE_SHEET_IG_STORIES_EXPORT_SUCCESS", 309);
    public static final f1 SHARE_SHEET_IG_STORIES_EXPORT_FAILED = new f1("SHARE_SHEET_IG_STORIES_EXPORT_FAILED", 310);
    public static final f1 SHARE_SHEET_IG_STORIES_EXPORT_CANCELLED = new f1("SHARE_SHEET_IG_STORIES_EXPORT_CANCELLED", 311);
    public static final f1 SHARE_SHEET_FB_STORIES_EXPORT_SUCCESS = new f1("SHARE_SHEET_FB_STORIES_EXPORT_SUCCESS", 312);
    public static final f1 SHARE_SHEET_FB_STORIES_EXPORT_FAILED = new f1("SHARE_SHEET_FB_STORIES_EXPORT_FAILED", 313);
    public static final f1 SHARE_SHEET_FB_STORIES_EXPORT_CANCELLED = new f1("SHARE_SHEET_FB_STORIES_EXPORT_CANCELLED", 314);
    public static final f1 SHARE_SHEET_DOWNLOAD_EXPORT_SUCCESS = new f1("SHARE_SHEET_DOWNLOAD_EXPORT_SUCCESS", 315);
    public static final f1 SHARE_SHEET_DOWNLOAD_EXPORT_FAILED = new f1("SHARE_SHEET_DOWNLOAD_EXPORT_FAILED", 316);
    public static final f1 SHARE_SHEET_DOWNLOAD_EXPORT_CANCELLED = new f1("SHARE_SHEET_DOWNLOAD_EXPORT_CANCELLED", 317);
    public static final f1 SHARE_SHEET_CONTACT_SEND = new f1("SHARE_SHEET_CONTACT_SEND", 318);
    public static final f1 SHARE_SHEET_SENDING_CANCEL = new f1("SHARE_SHEET_SENDING_CANCEL", 319);
    public static final f1 SHARE_SHEET_SENDING_ERROR = new f1("SHARE_SHEET_SENDING_ERROR", 320);
    public static final f1 BACKGROUND_REFRESH_WARM_START = new f1("BACKGROUND_REFRESH_WARM_START", 321);
    public static final f1 STORY_PIN_BEGIN = new f1("STORY_PIN_BEGIN", 322);
    public static final f1 STORY_PIN_CREATE = new f1("STORY_PIN_CREATE", 323);
    public static final f1 STORY_PIN_CREATE_ATTEMPTED = new f1("STORY_PIN_CREATE_ATTEMPTED", 324);
    public static final f1 STORY_PIN_CREATE_CANCELLED = new f1("STORY_PIN_CREATE_CANCELLED", 325);
    public static final f1 STORY_PIN_CREATE_FAILURE = new f1("STORY_PIN_CREATE_FAILURE", 326);
    public static final f1 STORY_PIN_CREATE_USER_FAILURE = new f1("STORY_PIN_CREATE_USER_FAILURE", 327);
    public static final f1 IDEA_PIN_CREATE_WARN = new f1("IDEA_PIN_CREATE_WARN", 328);
    public static final f1 STORY_PIN_EDIT = new f1("STORY_PIN_EDIT", 329);
    public static final f1 STORY_PIN_EDIT_CANCELLED = new f1("STORY_PIN_EDIT_CANCELLED", 330);
    public static final f1 STORY_PIN_EDIT_FAILURE = new f1("STORY_PIN_EDIT_FAILURE", 331);
    public static final f1 STORY_PIN_CREATION_BEGIN = new f1("STORY_PIN_CREATION_BEGIN", 332);
    public static final f1 STORY_PIN_LOGGING_ERROR = new f1("STORY_PIN_LOGGING_ERROR", 333);
    public static final f1 STORY_PIN_FONT_LIST_DOWNLOAD_FAILED = new f1("STORY_PIN_FONT_LIST_DOWNLOAD_FAILED", 334);
    public static final f1 STORY_PIN_FONT_DOWNLOAD_FAILED = new f1("STORY_PIN_FONT_DOWNLOAD_FAILED", 335);
    public static final f1 STORY_PIN_VIDEO_EXPORT_ATTEMPTED = new f1("STORY_PIN_VIDEO_EXPORT_ATTEMPTED", 336);
    public static final f1 STORY_PIN_VIDEO_EXPORT_SUCCEEDED = new f1("STORY_PIN_VIDEO_EXPORT_SUCCEEDED", 337);
    public static final f1 STORY_PIN_VIDEO_EXPORT_FAILED = new f1("STORY_PIN_VIDEO_EXPORT_FAILED", 338);
    public static final f1 STORY_PIN_VIDEO_EXPORT_CANCELLED = new f1("STORY_PIN_VIDEO_EXPORT_CANCELLED", 339);
    public static final f1 STORY_PIN_VIDEO_EXPORT_INCOMPATIBLE_MEDIA = new f1("STORY_PIN_VIDEO_EXPORT_INCOMPATIBLE_MEDIA", 340);
    public static final f1 STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_ATTEMPTED = new f1("STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_ATTEMPTED", 341);
    public static final f1 STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_SUCCEEDED = new f1("STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_SUCCEEDED", 342);
    public static final f1 STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_FAILED = new f1("STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_FAILED", 343);
    public static final f1 STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_CANCELLED = new f1("STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_CANCELLED", 344);
    public static final f1 IDEA_PIN_VIDEO_STILL_PROCESSING_DISPLAYED = new f1("IDEA_PIN_VIDEO_STILL_PROCESSING_DISPLAYED", 345);
    public static final f1 IDEA_PIN_METADATA_EXTRACTION_ATTEMPTED = new f1("IDEA_PIN_METADATA_EXTRACTION_ATTEMPTED", 346);
    public static final f1 IDEA_PIN_METADATA_EXTRACTION_SUCCESS = new f1("IDEA_PIN_METADATA_EXTRACTION_SUCCESS", 347);
    public static final f1 IDEA_PIN_METADATA_EXTRACTION_FAILURE = new f1("IDEA_PIN_METADATA_EXTRACTION_FAILURE", 348);
    public static final f1 STORY_PIN_ELEMENT_MOVE = new f1("STORY_PIN_ELEMENT_MOVE", 349);
    public static final f1 STORY_PIN_ELEMENT_SCALE = new f1("STORY_PIN_ELEMENT_SCALE", 350);
    public static final f1 STORY_PIN_ELEMENT_ROTATE = new f1("STORY_PIN_ELEMENT_ROTATE", 351);
    public static final f1 STORY_PIN_ELEMENT_DELETE_ATTEMPT = new f1("STORY_PIN_ELEMENT_DELETE_ATTEMPT", 352);
    public static final f1 STORY_PIN_ELEMENT_DELETED = new f1("STORY_PIN_ELEMENT_DELETED", 353);
    public static final f1 STORY_PIN_FONT_SIZE_CHANGE = new f1("STORY_PIN_FONT_SIZE_CHANGE", 354);
    public static final f1 STORY_PIN_START_TIME_CHANGE = new f1("STORY_PIN_START_TIME_CHANGE", 355);
    public static final f1 STORY_PIN_END_TIME_CHANGE = new f1("STORY_PIN_END_TIME_CHANGE", 356);
    public static final f1 BACKEND_STORY_PIN_DELETE = new f1("BACKEND_STORY_PIN_DELETE", 357);
    public static final f1 RAW_IPD_LOG_SUCCESS = new f1("RAW_IPD_LOG_SUCCESS", 358);
    public static final f1 RAW_IPD_LOG_FAILURE = new f1("RAW_IPD_LOG_FAILURE", 359);
    public static final f1 USER_SWITCH_INTENT = new f1("USER_SWITCH_INTENT", 360);
    public static final f1 USER_SWITCH_ATTEMPT = new f1("USER_SWITCH_ATTEMPT", 361);
    public static final f1 USER_SWITCH_SUCCESS = new f1("USER_SWITCH_SUCCESS", 362);
    public static final f1 COLLECTION_ITEM_IMPRESSION_ONE_PIXEL = new f1("COLLECTION_ITEM_IMPRESSION_ONE_PIXEL", 363);
    public static final f1 COLLECTION_ITEM_CLICKTHROUGH = new f1("COLLECTION_ITEM_CLICKTHROUGH", 364);
    public static final f1 COLLECTION_PIN_CLICKTHROUGH = new f1("COLLECTION_PIN_CLICKTHROUGH", 365);
    public static final f1 COLLECTION_ITEM_CLICKTHROUGH_END = new f1("COLLECTION_ITEM_CLICKTHROUGH_END", 366);
    public static final f1 COLLECTION_PIN_CLICKTHROUGH_END = new f1("COLLECTION_PIN_CLICKTHROUGH_END", 367);
    public static final f1 COLLECTION_ITEM_REPIN = new f1("COLLECTION_ITEM_REPIN", 368);
    public static final f1 COLLECTION_ITEM_CLOSEUP = new f1("COLLECTION_ITEM_CLOSEUP", 369);
    public static final f1 SCENE_3D_ROTATE = new f1("SCENE_3D_ROTATE", 370);
    public static final f1 SCENE_3D_TRANSLATE = new f1("SCENE_3D_TRANSLATE", 371);
    public static final f1 LEAD_FORM_OPEN = new f1("LEAD_FORM_OPEN", 372);
    public static final f1 LEAD_FORM_TYPING = new f1("LEAD_FORM_TYPING", 373);
    public static final f1 LEAD_FORM_SUBMIT = new f1("LEAD_FORM_SUBMIT", 374);
    public static final f1 LEAD_FORM_CLOSE = new f1("LEAD_FORM_CLOSE", 375);
    public static final f1 LEAD_FORM_SUBMIT_ERROR = new f1("LEAD_FORM_SUBMIT_ERROR", 376);
    public static final f1 LEAD_FORM_CACHE_SAVE = new f1("LEAD_FORM_CACHE_SAVE", 377);
    public static final f1 LEAD_FORM_CACHE_LOAD_SUCCESS = new f1("LEAD_FORM_CACHE_LOAD_SUCCESS", 378);
    public static final f1 LEAD_FORM_CACHE_LOAD_EXPIRED = new f1("LEAD_FORM_CACHE_LOAD_EXPIRED", 379);
    public static final f1 LEAD_FORM_AUTOFILL = new f1("LEAD_FORM_AUTOFILL", 380);
    public static final f1 BUSINESS_ACCOUNT_CREATE_COMPLETE = new f1("BUSINESS_ACCOUNT_CREATE_COMPLETE", 381);
    public static final f1 USER_LOGOUT_SUCCESS = new f1("USER_LOGOUT_SUCCESS", 382);
    public static final f1 BRAND_SURVEY_FALLBACK_TO_LEGACY = new f1("BRAND_SURVEY_FALLBACK_TO_LEGACY", 383);
    public static final f1 UPDATE = new f1("UPDATE", 384);
    public static final f1 GROUP_BOARDS_REACTION_BAR_OPEN = new f1("GROUP_BOARDS_REACTION_BAR_OPEN", 385);
    public static final f1 GROUP_BOARDS_REACTION_SET = new f1("GROUP_BOARDS_REACTION_SET", 386);
    public static final f1 APP_THEME_CHANGED = new f1("APP_THEME_CHANGED", 387);
    public static final f1 APP_SOUND_SETTING_CHANGED = new f1("APP_SOUND_SETTING_CHANGED", 388);
    public static final f1 VIRTUAL_TRY_ON_RENDERER_INITIALIZED_SUCCESS = new f1("VIRTUAL_TRY_ON_RENDERER_INITIALIZED_SUCCESS", 389);
    public static final f1 VIRTUAL_TRY_ON_RENDERER_INITIALIZED_FAILURE = new f1("VIRTUAL_TRY_ON_RENDERER_INITIALIZED_FAILURE", 390);
    public static final f1 VIRTUAL_TRY_ON_PIN_APPLY = new f1("VIRTUAL_TRY_ON_PIN_APPLY", 391);
    public static final f1 VIRTUAL_TRY_ON_CHANGE_SWATCH = new f1("VIRTUAL_TRY_ON_CHANGE_SWATCH", 392);
    public static final f1 AR_MODEL_LOAD_REQUESTED = new f1("AR_MODEL_LOAD_REQUESTED", 393);
    public static final f1 AR_MODEL_LOAD_COMPLETE = new f1("AR_MODEL_LOAD_COMPLETE", 394);
    public static final f1 AR_MODEL_LOAD_FAILED = new f1("AR_MODEL_LOAD_FAILED", 395);
    public static final f1 AR_OBJECT_PLACED = new f1("AR_OBJECT_PLACED", 396);
    public static final f1 ANDROID_ARCORE_DOWNLOAD_REQUESTED = new f1("ANDROID_ARCORE_DOWNLOAD_REQUESTED", 397);
    public static final f1 ANDROID_ARCORE_DOWNLOAD_REJECTED = new f1("ANDROID_ARCORE_DOWNLOAD_REJECTED", 398);
    public static final f1 ANDROID_ARCORE_DOWNLOAD_COMPLETE = new f1("ANDROID_ARCORE_DOWNLOAD_COMPLETE", 399);
    public static final f1 PIN_INTEREST_TAG_SELECT = new f1("PIN_INTEREST_TAG_SELECT", 400);
    public static final f1 PIN_INTEREST_TAG_DESELECT = new f1("PIN_INTEREST_TAG_DESELECT", 401);
    public static final f1 TAG_PIN_INTERESTS_SUCCESS = new f1("TAG_PIN_INTERESTS_SUCCESS", 402);
    public static final f1 TAG_PIN_INTERESTS_FAILURE = new f1("TAG_PIN_INTERESTS_FAILURE", 403);
    public static final f1 APPSFLYER_INIT = new f1("APPSFLYER_INIT", 404);
    public static final f1 APPSFLYER_FIRST_LAUNCH = new f1("APPSFLYER_FIRST_LAUNCH", 405);
    public static final f1 APPSFLYER_COLD_START_TASK = new f1("APPSFLYER_COLD_START_TASK", 406);
    public static final f1 APPSFLYER_RUNNABLE_START = new f1("APPSFLYER_RUNNABLE_START", 407);
    public static final f1 APPSFLYER_INIT_IMMEDIATE = new f1("APPSFLYER_INIT_IMMEDIATE", 408);
    public static final f1 IMAGE_UPLOAD_ATTEMPTED = new f1("IMAGE_UPLOAD_ATTEMPTED", 409);
    public static final f1 IMAGE_UPLOAD_UPLOADED = new f1("IMAGE_UPLOAD_UPLOADED", 410);
    public static final f1 IMAGE_UPLOAD_CANCELLED = new f1("IMAGE_UPLOAD_CANCELLED", 411);
    public static final f1 IMAGE_UPLOAD_FAILED = new f1("IMAGE_UPLOAD_FAILED", 412);
    public static final f1 USE_CASES_SELECTED = new f1("USE_CASES_SELECTED", 413);
    public static final f1 BOARD_PERMISSION_SETTING_UPDATE = new f1("BOARD_PERMISSION_SETTING_UPDATE", 414);
    public static final f1 MENTION_SELECT = new f1("MENTION_SELECT", 415);
    public static final f1 MENTION_REMOVE = new f1("MENTION_REMOVE", 416);
    public static final f1 MENTION_SEARCH_BEGIN = new f1("MENTION_SEARCH_BEGIN", 417);
    public static final f1 MENTION_SEARCH_CANCEL = new f1("MENTION_SEARCH_CANCEL", 418);
    public static final f1 MENTION_UNLINK = new f1("MENTION_UNLINK", 419);
    public static final f1 STORY_PIN_MUSIC_PLAY = new f1("STORY_PIN_MUSIC_PLAY", 420);
    public static final f1 COMMENTS_COMPOSER_OPENED = new f1("COMMENTS_COMPOSER_OPENED", 421);
    public static final f1 COMMENTS_COMPOSER_CLOSED_WITH_POST = new f1("COMMENTS_COMPOSER_CLOSED_WITH_POST", 422);
    public static final f1 COMMENTS_COMPOSER_CLOSED_WITHOUT_POST = new f1("COMMENTS_COMPOSER_CLOSED_WITHOUT_POST", 423);
    public static final f1 GENERIC_STAT_LOG_EVENT = new f1("GENERIC_STAT_LOG_EVENT", 424);
    public static final f1 VIDEO_INVALID_INTERVAL = new f1("VIDEO_INVALID_INTERVAL", 425);
    public static final f1 VIDEO_INVALID_QUARTILE = new f1("VIDEO_INVALID_QUARTILE", 426);
    public static final f1 STORY_PIN_MULTI_DRAFTS_APPROACH_LIMIT = new f1("STORY_PIN_MULTI_DRAFTS_APPROACH_LIMIT", 427);
    public static final f1 STORY_PIN_MULTI_DRAFTS_REACH_LIMIT = new f1("STORY_PIN_MULTI_DRAFTS_REACH_LIMIT", 428);
    public static final f1 STORY_PIN_MULTI_DRAFTS_MISSING_COVER = new f1("STORY_PIN_MULTI_DRAFTS_MISSING_COVER", 429);
    public static final f1 STORY_PIN_MULTI_DRAFTS_SAVE_COVER = new f1("STORY_PIN_MULTI_DRAFTS_SAVE_COVER", 430);
    public static final f1 IDEA_PIN_DRAFT_COMPATIBILITY_CONVERSION = new f1("IDEA_PIN_DRAFT_COMPATIBILITY_CONVERSION", 431);
    public static final f1 IDEA_PIN_MULTI_DRAFT_EXPIRATION = new f1("IDEA_PIN_MULTI_DRAFT_EXPIRATION", 432);
    public static final f1 LENS_PERMISSIONS_REQUEST = new f1("LENS_PERMISSIONS_REQUEST", 433);
    public static final f1 FULL_SCREEN_VIEW = new f1("FULL_SCREEN_VIEW", 434);
    public static final f1 STORY_PIN_RESUME = new f1("STORY_PIN_RESUME", 435);
    public static final f1 STORY_PIN_PAUSE = new f1("STORY_PIN_PAUSE", 436);
    public static final f1 SEEK = new f1("SEEK", 437);
    public static final f1 STORY_PIN_MUTE = new f1("STORY_PIN_MUTE", 438);
    public static final f1 STORY_PIN_UNMUTE = new f1("STORY_PIN_UNMUTE", 439);
    public static final f1 MEDIA_GALLERY_PERFORMANCE_STATS = new f1("MEDIA_GALLERY_PERFORMANCE_STATS", 440);
    public static final f1 NAVIGATION = new f1("NAVIGATION", 441);
    public static final f1 STORY_PIN_VIDEO_PLAY = new f1("STORY_PIN_VIDEO_PLAY", 442);
    public static final f1 STORY_PIN_VIDEO_PAUSE = new f1("STORY_PIN_VIDEO_PAUSE", 443);
    public static final f1 STORY_PIN_REORDER = new f1("STORY_PIN_REORDER", 444);
    public static final f1 STORY_PIN_DELETE = new f1("STORY_PIN_DELETE", 445);
    public static final f1 STORY_PIN_LOAD_DRAFT_FAILED = new f1("STORY_PIN_LOAD_DRAFT_FAILED", 446);
    public static final f1 PIN_OPEN_IN_NATIVE_WEB_BROWSER = new f1("PIN_OPEN_IN_NATIVE_WEB_BROWSER", 447);
    public static final f1 IDEA_PIN_CAMERA_VIEW_APPEAR = new f1("IDEA_PIN_CAMERA_VIEW_APPEAR", 448);
    public static final f1 UNLINK_ACCOUNT = new f1("UNLINK_ACCOUNT", 449);
    public static final f1 UNLINK_ACCOUNT_FAILED = new f1("UNLINK_ACCOUNT_FAILED", 450);
    public static final f1 LOGIN_ATTEMPT_LIMIT_REACHED = new f1("LOGIN_ATTEMPT_LIMIT_REACHED", 451);
    public static final f1 MAGIC_LINK_LOGIN_SUCCESS = new f1("MAGIC_LINK_LOGIN_SUCCESS", 452);
    public static final f1 MAGIC_LINK_LOGIN_FAILURE = new f1("MAGIC_LINK_LOGIN_FAILURE", 453);
    public static final f1 PORTAL_IMPRESSION_ONE_PIXEL = new f1("PORTAL_IMPRESSION_ONE_PIXEL", 454);
    public static final f1 STORY_PIN_CREATE_EXTERNAL_DEEP_LINK_SUCCESS = new f1("STORY_PIN_CREATE_EXTERNAL_DEEP_LINK_SUCCESS", 455);
    public static final f1 STORY_PIN_CREATE_EXTERNAL_DEEP_LINK_FAILED = new f1("STORY_PIN_CREATE_EXTERNAL_DEEP_LINK_FAILED", 456);
    public static final f1 OFFSITE_SAVE_ENTER = new f1("OFFSITE_SAVE_ENTER", 457);
    public static final f1 PAID_SEARCH_LAND = new f1("PAID_SEARCH_LAND", 458);
    public static final f1 LIVE_SESSION_PRODUCT_IMPRESSION_ONE_PIXEL = new f1("LIVE_SESSION_PRODUCT_IMPRESSION_ONE_PIXEL", 459);
    public static final f1 LIVE_SESSION_COMMENT_IMPRESSION_ONE_PIXEL = new f1("LIVE_SESSION_COMMENT_IMPRESSION_ONE_PIXEL", 460);
    public static final f1 ONEBAR_IMPRESSION_ONE_PIXEL = new f1("ONEBAR_IMPRESSION_ONE_PIXEL", 461);
    public static final f1 MFA_ENABLE_SUCCESS = new f1("MFA_ENABLE_SUCCESS", 462);
    public static final f1 MFA_DISABLE_SUCCESS = new f1("MFA_DISABLE_SUCCESS", 463);
    public static final f1 MFA_LOGIN_SUCCESS = new f1("MFA_LOGIN_SUCCESS", 464);
    public static final f1 MFA_SUCCESS_EMAIL_VERIFICATION = new f1("MFA_SUCCESS_EMAIL_VERIFICATION", 465);
    public static final f1 SHUFFLE_IMPRESSION_ONE_PIXEL = new f1("SHUFFLE_IMPRESSION_ONE_PIXEL", 466);
    public static final f1 ANDROID_DFM_DOWNLOAD_STATUS = new f1("ANDROID_DFM_DOWNLOAD_STATUS", 467);
    public static final f1 ANDROID_DFM_TOAST_SHOWN = new f1("ANDROID_DFM_TOAST_SHOWN", AdSize.FULL_BANNER_WIDTH);
    public static final f1 CREATOR_ONBOARDING_LANDING_DEEPLINK = new f1("CREATOR_ONBOARDING_LANDING_DEEPLINK", 469);
    public static final f1 CREATOR_ONBOARDING_LANDING_DEEPLINK_SUCCESS = new f1("CREATOR_ONBOARDING_LANDING_DEEPLINK_SUCCESS", 470);
    public static final f1 CREATOR_ONBOARDING_LANDING_DEEPLINK_FAILURE = new f1("CREATOR_ONBOARDING_LANDING_DEEPLINK_FAILURE", 471);
    public static final f1 PERMISSIONS_REQUEST = new f1("PERMISSIONS_REQUEST", 472);
    public static final f1 PERMISSIONS_RESULT = new f1("PERMISSIONS_RESULT", 473);
    public static final f1 IDEA_PIN_CREATION_PERFORMANCE = new f1("IDEA_PIN_CREATION_PERFORMANCE", 474);
    public static final f1 IDEA_PIN_PRODUCT_TAG_ADDED = new f1("IDEA_PIN_PRODUCT_TAG_ADDED", 475);
    public static final f1 IDEA_PIN_PRODUCT_TAG_DELETED = new f1("IDEA_PIN_PRODUCT_TAG_DELETED", 476);
    public static final f1 CONVERSION_UPSELL_ACTIVE = new f1("CONVERSION_UPSELL_ACTIVE", 477);
    public static final f1 CONVERSATION_INBOX_EMPTY_STATE_VIEW_DISPLAYED = new f1("CONVERSATION_INBOX_EMPTY_STATE_VIEW_DISPLAYED", 478);
    public static final f1 CONVERSATION_EMPTY_INBOX_NEW_MESSAGE_BTN_DISPLAYED = new f1("CONVERSATION_EMPTY_INBOX_NEW_MESSAGE_BTN_DISPLAYED", 479);
    public static final f1 CONVERSATION_INBOX_CONTACT_SYNC_BTN_DISPLAYED = new f1("CONVERSATION_INBOX_CONTACT_SYNC_BTN_DISPLAYED", 480);
    public static final f1 CONTACT_SEARCH_MODAL_DISPLAYED = new f1("CONTACT_SEARCH_MODAL_DISPLAYED", 481);
    public static final f1 SHOWCASE_SUBPAGE_CLICKTHROUGH = new f1("SHOWCASE_SUBPAGE_CLICKTHROUGH", 482);
    public static final f1 SHOWCASE_SUBPAGE_CLICKTHROUGH_END = new f1("SHOWCASE_SUBPAGE_CLICKTHROUGH_END", 483);
    public static final f1 SHOWCASE_SUBPAGE_IMPRESSION_ONE_PIXEL = new f1("SHOWCASE_SUBPAGE_IMPRESSION_ONE_PIXEL", 484);
    public static final f1 SHOWCASE_SUBPAGE_CLOSEUP = new f1("SHOWCASE_SUBPAGE_CLOSEUP", 485);
    public static final f1 SHOWCASE_SUBPAGE_REPIN = new f1("SHOWCASE_SUBPAGE_REPIN", 486);
    public static final f1 SHOWCASE_SUBPAGE_SWIPE_LEFT = new f1("SHOWCASE_SUBPAGE_SWIPE_LEFT", 487);
    public static final f1 SHOWCASE_SUBPAGE_SWIPE_RIGHT = new f1("SHOWCASE_SUBPAGE_SWIPE_RIGHT", 488);
    public static final f1 SHOWCASE_SUBPIN_CLICKTHROUGH = new f1("SHOWCASE_SUBPIN_CLICKTHROUGH", 489);
    public static final f1 SHOWCASE_SUBPIN_CLICKTHROUGH_END = new f1("SHOWCASE_SUBPIN_CLICKTHROUGH_END", 490);
    public static final f1 SHOWCASE_SUBPIN_IMPRESSION_ONE_PIXEL = new f1("SHOWCASE_SUBPIN_IMPRESSION_ONE_PIXEL", 491);
    public static final f1 SHOWCASE_SUBPIN_REPIN = new f1("SHOWCASE_SUBPIN_REPIN", 492);
    public static final f1 SHOWCASE_SUBPIN_SWIPE_LEFT = new f1("SHOWCASE_SUBPIN_SWIPE_LEFT", 493);
    public static final f1 SHOWCASE_SUBPIN_SWIPE_RIGHT = new f1("SHOWCASE_SUBPIN_SWIPE_RIGHT", 494);
    public static final f1 SHOWCASE_PIN_CLICKTHROUGH = new f1("SHOWCASE_PIN_CLICKTHROUGH", 495);
    public static final f1 SHOWCASE_PIN_CLICKTHROUGH_END = new f1("SHOWCASE_PIN_CLICKTHROUGH_END", 496);
    public static final f1 SHOWCASE_SUBPAGE_THUMBNAIL_SWIPE_LEFT = new f1("SHOWCASE_SUBPAGE_THUMBNAIL_SWIPE_LEFT", 497);
    public static final f1 SHOWCASE_SUBPAGE_THUMBNAIL_SWIPE_RIGHT = new f1("SHOWCASE_SUBPAGE_THUMBNAIL_SWIPE_RIGHT", 498);
    public static final f1 SHOWCASE_SUBPAGE_NUDGE = new f1("SHOWCASE_SUBPAGE_NUDGE", 499);
    public static final f1 QUIZ_PIN_RESPONSE = new f1("QUIZ_PIN_RESPONSE", 500);
    public static final f1 QUIZ_PIN_COMPLETION = new f1("QUIZ_PIN_COMPLETION", 501);
    public static final f1 QUIZ_PIN_RESULT_OPEN = new f1("QUIZ_PIN_RESULT_OPEN", 502);
    public static final f1 QUIZ_PIN_RESULT_CLOSE = new f1("QUIZ_PIN_RESULT_CLOSE", 503);
    public static final f1 QUIZ_PIN_BACK = new f1("QUIZ_PIN_BACK", 504);
    public static final f1 AUTOMAGICAL_BOARD_PIN_IMPRESSIONS = new f1("AUTOMAGICAL_BOARD_PIN_IMPRESSIONS", 505);
    public static final f1 AUTOMAGICAL_BOARD_PIN_REPINS = new f1("AUTOMAGICAL_BOARD_PIN_REPINS", 506);
    public static final f1 AUTOMAGICAL_BOARD_PIN_5S_OUTBOUND_CLICKS = new f1("AUTOMAGICAL_BOARD_PIN_5S_OUTBOUND_CLICKS", 507);
    public static final f1 AUTOMAGICAL_BOARD_PIN_OUTBOUND_CLICKS = new f1("AUTOMAGICAL_BOARD_PIN_OUTBOUND_CLICKS", 508);
    public static final f1 AUTOMAGICAL_BOARD_PIN_CLICKS = new f1("AUTOMAGICAL_BOARD_PIN_CLICKS", 509);
    public static final f1 AUTOMAGICAL_BOARD_PIN_GRID_CLICKS = new f1("AUTOMAGICAL_BOARD_PIN_GRID_CLICKS", 510);
    public static final f1 AUTOMAGICAL_BOARD_PIN_SAVES = new f1("AUTOMAGICAL_BOARD_PIN_SAVES", 511);
    public static final f1 AUTOMAGICAL_BOARD_PIN_SHARES_COMPLETED = new f1("AUTOMAGICAL_BOARD_PIN_SHARES_COMPLETED", BitmapUtils.BITMAP_TO_JPEG_SIZE);
    public static final f1 AUTOMAGICAL_BOARD_TP_PIN_IMPRESSIONS = new f1("AUTOMAGICAL_BOARD_TP_PIN_IMPRESSIONS", 513);
    public static final f1 AUTOMAGICAL_BOARD_TP_PIN_REPINS = new f1("AUTOMAGICAL_BOARD_TP_PIN_REPINS", 514);
    public static final f1 AUTOMAGICAL_BOARD_TP_PIN_5S_OUTBOUND_CLICKS = new f1("AUTOMAGICAL_BOARD_TP_PIN_5S_OUTBOUND_CLICKS", 515);
    public static final f1 AUTOMAGICAL_BOARD_TP_PIN_OUTBOUND_CLICKS = new f1("AUTOMAGICAL_BOARD_TP_PIN_OUTBOUND_CLICKS", 516);
    public static final f1 AUTOMAGICAL_BOARD_TP_PIN_CLICKS = new f1("AUTOMAGICAL_BOARD_TP_PIN_CLICKS", 517);
    public static final f1 AUTOMAGICAL_BOARD_TP_PIN_GRID_CLICKS = new f1("AUTOMAGICAL_BOARD_TP_PIN_GRID_CLICKS", 518);
    public static final f1 AUTOMAGICAL_BOARD_TP_PIN_SAVES = new f1("AUTOMAGICAL_BOARD_TP_PIN_SAVES", 519);
    public static final f1 AUTOMAGICAL_BOARD_TP_PIN_SHARES_COMPLETED = new f1("AUTOMAGICAL_BOARD_TP_PIN_SHARES_COMPLETED", 520);
    public static final f1 AUTOMAGICAL_BOARD_SESSIONS = new f1("AUTOMAGICAL_BOARD_SESSIONS", 521);
    public static final f1 AUTOMAGICAL_BOARD_SESSIONS_REPIN = new f1("AUTOMAGICAL_BOARD_SESSIONS_REPIN", 522);
    public static final f1 AUTOMAGICAL_BOARD_SESSIONS_PIN_CLICK = new f1("AUTOMAGICAL_BOARD_SESSIONS_PIN_CLICK", 523);
    public static final f1 AUTOMAGICAL_BOARD_SESSIONS_PIN_SAVES = new f1("AUTOMAGICAL_BOARD_SESSIONS_PIN_SAVES", 524);
    public static final f1 AUTOMAGICAL_BOARD_SESSIONS_PIN_SHARES_COMPLETED = new f1("AUTOMAGICAL_BOARD_SESSIONS_PIN_SHARES_COMPLETED", 525);
    public static final f1 AUTOMAGICAL_BOARD_BOARDS_VISITED = new f1("AUTOMAGICAL_BOARD_BOARDS_VISITED", 526);
    public static final f1 AUTOMAGICAL_BOARD_BOARDS_PIN_REPIN = new f1("AUTOMAGICAL_BOARD_BOARDS_PIN_REPIN", 527);
    public static final f1 AUTOMAGICAL_BOARD_BOARDS_PIN_CLICK = new f1("AUTOMAGICAL_BOARD_BOARDS_PIN_CLICK", 528);
    public static final f1 AUTOMAGICAL_BOARD_BOARDS_PIN_5S_OUTBOUND_CLICKS = new f1("AUTOMAGICAL_BOARD_BOARDS_PIN_5S_OUTBOUND_CLICKS", 529);
    public static final f1 AUTOMAGICAL_BOARD_BOARDS_PIN_OUTBOUND_CLICKS = new f1("AUTOMAGICAL_BOARD_BOARDS_PIN_OUTBOUND_CLICKS", 530);
    public static final f1 AUTOMAGICAL_BOARD_BOARDS_PIN_SAVES = new f1("AUTOMAGICAL_BOARD_BOARDS_PIN_SAVES", 531);
    public static final f1 AUTOMAGICAL_BOARD_BOARDS_PIN_SHARES_COMPLETED = new f1("AUTOMAGICAL_BOARD_BOARDS_PIN_SHARES_COMPLETED", 532);
    public static final f1 AUTOMAGICAL_BOARD_BOARDS_TP_PIN_REPIN = new f1("AUTOMAGICAL_BOARD_BOARDS_TP_PIN_REPIN", 533);
    public static final f1 AUTOMAGICAL_BOARD_BOARDS_TP_PIN_CLICKS = new f1("AUTOMAGICAL_BOARD_BOARDS_TP_PIN_CLICKS", 534);
    public static final f1 AUTOMAGICAL_BOARD_BOARDS_TP_PIN_5S_OUTBOUND_CLICKS = new f1("AUTOMAGICAL_BOARD_BOARDS_TP_PIN_5S_OUTBOUND_CLICKS", 535);
    public static final f1 AUTOMAGICAL_BOARD_BOARDS_TP_PIN_OUTBOUND_CLICKS = new f1("AUTOMAGICAL_BOARD_BOARDS_TP_PIN_OUTBOUND_CLICKS", 536);
    public static final f1 AUTOMAGICAL_BOARD_BOARDS_TP_PIN_SAVES = new f1("AUTOMAGICAL_BOARD_BOARDS_TP_PIN_SAVES", 537);
    public static final f1 AUTOMAGICAL_BOARD_BOARDS_TP_PIN_SHARES_COMPLETED = new f1("AUTOMAGICAL_BOARD_BOARDS_TP_PIN_SHARES_COMPLETED", 538);
    public static final f1 AUTO_ORGANIZE_BUTTON_TAPPED = new f1("AUTO_ORGANIZE_BUTTON_TAPPED", 539);
    public static final f1 AUTO_CLUSTER_SELECTED = new f1("AUTO_CLUSTER_SELECTED", 540);
    public static final f1 AUTO_CLUSTERS_IMPRESSION = new f1("AUTO_CLUSTERS_IMPRESSION", 541);
    public static final f1 AUTO_REFINE_BOARD_VIEW_BEGIN = new f1("AUTO_REFINE_BOARD_VIEW_BEGIN", 542);
    public static final f1 AUTO_REFINE_BOARD_PIN_SELECTED = new f1("AUTO_REFINE_BOARD_PIN_SELECTED", 543);
    public static final f1 AUTO_REFINE_BOARD_PIN_DESELECTED = new f1("AUTO_REFINE_BOARD_PIN_DESELECTED", 544);
    public static final f1 AUTO_BOARD_NAME_INPUT_VIEW_BEGIN = new f1("AUTO_BOARD_NAME_INPUT_VIEW_BEGIN", 545);
    public static final f1 AUTO_BOARD_NAME_INPUTTED = new f1("AUTO_BOARD_NAME_INPUTTED", 546);
    public static final f1 AUTO_BOARD_CREATED = new f1("AUTO_BOARD_CREATED", 547);
    public static final f1 AUTO_SPARKLE_ORGANIZE_VIEW_BEGIN = new f1("AUTO_SPARKLE_ORGANIZE_VIEW_BEGIN", 548);
    public static final f1 AUTO_BOARD_PINS_ADD_TO_EXISTING_BOARD = new f1("AUTO_BOARD_PINS_ADD_TO_EXISTING_BOARD", 549);
    public static final f1 PASSCODE_BACKUP_EMAIL_EQUAL_TO_CURRENT = new f1("PASSCODE_BACKUP_EMAIL_EQUAL_TO_CURRENT", 550);
    public static final f1 SAVE_PASSCODE_SUCCESS = new f1("SAVE_PASSCODE_SUCCESS", 551);
    public static final f1 SAVE_SETTING_WITH_PASSCODE_ERROR = new f1("SAVE_SETTING_WITH_PASSCODE_ERROR", 552);
    public static final f1 SAVE_SETTING_WITH_PASSCODE_SUCCESS = new f1("SAVE_SETTING_WITH_PASSCODE_SUCCESS", 553);
    public static final f1 DISABLE_PASSCODE_SUCCESS = new f1("DISABLE_PASSCODE_SUCCESS", 554);
    public static final f1 DISABLE_PASSCODE_FAILURE = new f1("DISABLE_PASSCODE_FAILURE", 555);
    public static final f1 UNIDIRECTIONAL_PASSCODE_ACKNOWLEDGED = new f1("UNIDIRECTIONAL_PASSCODE_ACKNOWLEDGED", 556);
    public static final f1 UNIDIRECTIONAL_PASSCODE_CANCELED = new f1("UNIDIRECTIONAL_PASSCODE_CANCELED", 557);
    public static final f1 MUSIC_PLAYLIST_OPEN = new f1("MUSIC_PLAYLIST_OPEN", 558);
    public static final f1 MUSIC_PLAYLIST_DISMISS = new f1("MUSIC_PLAYLIST_DISMISS", 559);
    public static final f1 STORY_PIN_EMBEDDED_MUSIC_PLAY = new f1("STORY_PIN_EMBEDDED_MUSIC_PLAY", 560);
    public static final f1 PIN_EMBEDDED_MUSIC_PLAY = new f1("PIN_EMBEDDED_MUSIC_PLAY", 561);
    public static final f1 VIDEO_MUTE = new f1("VIDEO_MUTE", 562);
    public static final f1 VIDEO_NO_MUTE = new f1("VIDEO_NO_MUTE", 563);
    public static final f1 PIN_CLOSEUP_MT_TRANSLATE = new f1("PIN_CLOSEUP_MT_TRANSLATE", 564);
    public static final f1 PIN_CLOSEUP_MT_RESTORE = new f1("PIN_CLOSEUP_MT_RESTORE", 565);
    public static final f1 PIN_CLOSEUP_RICH_MT_TRANSLATE = new f1("PIN_CLOSEUP_RICH_MT_TRANSLATE", 566);
    public static final f1 PIN_CLOSEUP_RICH_MT_RESTORE = new f1("PIN_CLOSEUP_RICH_MT_RESTORE", 567);
    public static final f1 PRODUCT_SEARCH_BACK_BUTTON_EXIT = new f1("PRODUCT_SEARCH_BACK_BUTTON_EXIT", 568);
    public static final f1 VOICE_PERMISSIONS_PROMPT = new f1("VOICE_PERMISSIONS_PROMPT", 569);
    public static final f1 INSTAGRAM_ACCT_CLAIMING_RETRY = new f1("INSTAGRAM_ACCT_CLAIMING_RETRY", 570);
    public static final f1 INSTAGRAM_ACCT_CLAIMING_SUCCESS = new f1("INSTAGRAM_ACCT_CLAIMING_SUCCESS", 571);
    public static final f1 INSTAGRAM_ACCT_CLAIMING_FAILURE = new f1("INSTAGRAM_ACCT_CLAIMING_FAILURE", 572);
    public static final f1 INSTAGRAM_ACCT_RECLAIMING_SUCCESS = new f1("INSTAGRAM_ACCT_RECLAIMING_SUCCESS", 573);
    public static final f1 INSTAGRAM_ACCT_RECLAIMING_FAILURE = new f1("INSTAGRAM_ACCT_RECLAIMING_FAILURE", 574);
    public static final f1 INSTAGRAM_ACCT_UNCLAIMING_SUCCESS = new f1("INSTAGRAM_ACCT_UNCLAIMING_SUCCESS", 575);
    public static final f1 INSTAGRAM_ACCT_UNCLAIMING_FAILURE = new f1("INSTAGRAM_ACCT_UNCLAIMING_FAILURE", 576);
    public static final f1 INSTAGRAM_ACCT_CLAIMING_AUTOPUBLISH_SUCCESS = new f1("INSTAGRAM_ACCT_CLAIMING_AUTOPUBLISH_SUCCESS", 577);
    public static final f1 INSTAGRAM_ACCT_CLAIMING_AUTOPUBLISH_FAILURE = new f1("INSTAGRAM_ACCT_CLAIMING_AUTOPUBLISH_FAILURE", 578);
    public static final f1 HEADER_ACCOUNTS_CLAIM_BANNER_DISMISS = new f1("HEADER_ACCOUNTS_CLAIM_BANNER_DISMISS", 579);
    public static final f1 INSTAGRAM_ACCT_AUTO_ORG_PIN_SUCCESS = new f1("INSTAGRAM_ACCT_AUTO_ORG_PIN_SUCCESS", 580);
    public static final f1 INSTAGRAM_ACCT_AUTO_ORG_PIN_FAILURE = new f1("INSTAGRAM_ACCT_AUTO_ORG_PIN_FAILURE", 581);
    public static final f1 AMAZON_ACCT_CLAIMING_SEEN = new f1("AMAZON_ACCT_CLAIMING_SEEN", 582);
    public static final f1 AMAZON_ACCT_LINK_BUTTON = new f1("AMAZON_ACCT_LINK_BUTTON", 583);
    public static final f1 AMAZON_ACCT_CLAIMING_SUCCESS = new f1("AMAZON_ACCT_CLAIMING_SUCCESS", 584);
    public static final f1 AMAZON_ACCT_CLAIMING_FAILURE = new f1("AMAZON_ACCT_CLAIMING_FAILURE", 585);
    public static final f1 AMAZON_ACCT_UNCLAIMING_SEEN = new f1("AMAZON_ACCT_UNCLAIMING_SEEN", 586);
    public static final f1 AMAZON_ACCT_UNLINK_BUTTON = new f1("AMAZON_ACCT_UNLINK_BUTTON", 587);
    public static final f1 AMAZON_ACCT_UNCLAIMING_SUCCESS = new f1("AMAZON_ACCT_UNCLAIMING_SUCCESS", 588);
    public static final f1 AMAZON_ACCT_UNCLAIMING_FAILURE = new f1("AMAZON_ACCT_UNCLAIMING_FAILURE", 589);
    public static final f1 PIN_HANDSHAKE_WEBVIEW_ERROR = new f1("PIN_HANDSHAKE_WEBVIEW_ERROR", 590);
    public static final f1 PIN_HANDSHAKE_ERROR = new f1("PIN_HANDSHAKE_ERROR", 591);
    public static final f1 PIN_HANDSHAKE_STEP = new f1("PIN_HANDSHAKE_STEP", 592);
    public static final f1 PIN_CARTING_SHEET_LOAD = new f1("PIN_CARTING_SHEET_LOAD", 593);
    public static final f1 PIN_CARTING_API_FAILURE = new f1("PIN_CARTING_API_FAILURE", 594);
    public static final f1 PIN_CARTING_RETAILER_CLICK = new f1("PIN_CARTING_RETAILER_CLICK", 595);
    public static final f1 PIN_CARTING_MDL_SUCCEEDED = new f1("PIN_CARTING_MDL_SUCCEEDED", 596);
    public static final f1 ADS_STL_ERROR = new f1("ADS_STL_ERROR", 597);
    public static final f1 FILTER_NO_DATA = new f1("FILTER_NO_DATA", 598);
    public static final f1 SEARCH_ONE_BAR_FILTER_NO_DATA = new f1("SEARCH_ONE_BAR_FILTER_NO_DATA", 599);
    public static final f1 SEARCH_ONE_BAR_FILTER_MODULE_NO_DATA = new f1("SEARCH_ONE_BAR_FILTER_MODULE_NO_DATA", AdSize.WIDE_SKYSCRAPER_HEIGHT);
    public static final f1 DATA_REQUEST_SUCCESS = new f1("DATA_REQUEST_SUCCESS", 601);
    public static final f1 DATA_REQUEST_FAILURE = new f1("DATA_REQUEST_FAILURE", 602);
    public static final f1 INVITE_CODE_FOLLOW_SUCCESSFUL = new f1("INVITE_CODE_FOLLOW_SUCCESSFUL", 603);
    public static final f1 CLIENT_AUTH_INITIATED = new f1("CLIENT_AUTH_INITIATED", 604);
    public static final f1 CLIENT_REGISTER_ATTEMPT = new f1("CLIENT_REGISTER_ATTEMPT", 605);
    public static final f1 CLIENT_REGISTER_SUCCESS = new f1("CLIENT_REGISTER_SUCCESS", 606);
    public static final f1 CLIENT_REGISTER_FAILED = new f1("CLIENT_REGISTER_FAILED", 607);
    public static final f1 CLIENT_SIGN_IN_ATTEMPT = new f1("CLIENT_SIGN_IN_ATTEMPT", 608);
    public static final f1 CLIENT_SIGN_IN_SUCCESS = new f1("CLIENT_SIGN_IN_SUCCESS", 609);
    public static final f1 CLIENT_SIGN_IN_FAILED = new f1("CLIENT_SIGN_IN_FAILED", 610);
    public static final f1 PEAR_SCREENSHOT = new f1("PEAR_SCREENSHOT", 611);
    public static final f1 ONE_BAR_MODULE_CLICK = new f1("ONE_BAR_MODULE_CLICK", 612);
    public static final f1 ONE_BAR_MODULE_DESELECT = new f1("ONE_BAR_MODULE_DESELECT", 613);
    public static final f1 JOURNEY_BACK_BUTTON_CLICK = new f1("JOURNEY_BACK_BUTTON_CLICK", 614);
    public static final f1 COLLAGE_COMPOSER_LAYER_REORDER = new f1("COLLAGE_COMPOSER_LAYER_REORDER", 615);
    public static final f1 COLLAGE_COMPOSER_CUTOUT_ADDED = new f1("COLLAGE_COMPOSER_CUTOUT_ADDED", 616);
    public static final f1 COLLAGE_COMPOSER_TEXT_ADDED = new f1("COLLAGE_COMPOSER_TEXT_ADDED", 617);
    public static final f1 COLLAGE_COMPOSER_DRAWING_ADDED = new f1("COLLAGE_COMPOSER_DRAWING_ADDED", 618);
    public static final f1 COLLAGE_COMPOSER_DRAFT_FIRST_SAVE = new f1("COLLAGE_COMPOSER_DRAFT_FIRST_SAVE", 619);
    public static final f1 COLLAGE_COMPOSER_ITEM_SWAPPED = new f1("COLLAGE_COMPOSER_ITEM_SWAPPED", 620);
    public static final f1 COLLAGE_COMPOSER_COLLAGE_REMIXED = new f1("COLLAGE_COMPOSER_COLLAGE_REMIXED", 621);
    public static final f1 COLLAGE_COMPOSER_CAMERA_ADDED = new f1("COLLAGE_COMPOSER_CAMERA_ADDED", 622);
    public static final f1 COLLAGE_COMPOSER_USER_PHOTO_ADDED = new f1("COLLAGE_COMPOSER_USER_PHOTO_ADDED", 623);
    public static final f1 ARA_VIEW = new f1("ARA_VIEW", 624);
    public static final f1 ARA_CLICK = new f1("ARA_CLICK", 625);
    public static final f1 WIDGET_UPSELL_DISMISS = new f1("WIDGET_UPSELL_DISMISS", 626);
    public static final f1 WIDGET_UPSELL_STEPS_SHOWN = new f1("WIDGET_UPSELL_STEPS_SHOWN", 627);
    public static final f1 WIDGET_PRE_UPSELL_SHOWN = new f1("WIDGET_PRE_UPSELL_SHOWN", 628);
    public static final f1 WIDGET_UPSELL_TRY_IT_CLICK = new f1("WIDGET_UPSELL_TRY_IT_CLICK", 629);
    public static final f1 WIDGET_UPSELL_WIDGET_PINNED = new f1("WIDGET_UPSELL_WIDGET_PINNED", 630);
    public static final f1 GMA_SDK_LOAD = new f1("GMA_SDK_LOAD", 631);
    public static final f1 GMA_QUERY_INFO_FETCHED = new f1("GMA_QUERY_INFO_FETCHED", 632);
    public static final f1 GMA_QUERY_INFO_SENT = new f1("GMA_QUERY_INFO_SENT", 633);
    public static final f1 GMA_AD_LOADED = new f1("GMA_AD_LOADED", 634);
    public static final f1 GMA_AD_RENDERED = new f1("GMA_AD_RENDERED", 635);
    public static final f1 GMA_AD_LOAD_FAILED = new f1("GMA_AD_LOAD_FAILED", 636);
    public static final f1 GMA_SDK_QUARANTINE_FAILED = new f1("GMA_SDK_QUARANTINE_FAILED", 637);
    public static final f1 GMA_QUERY_INFO_FAILED = new f1("GMA_QUERY_INFO_FAILED", 638);
    public static final f1 GMA_REQUEST_HEADER_MISSING = new f1("GMA_REQUEST_HEADER_MISSING", 639);
    public static final f1 GMA_SDK_MOBILE_CRASH = new f1("GMA_SDK_MOBILE_CRASH", 640);
    public static final f1 GMA_IMP_AD_VALUES_RECEIVED = new f1("GMA_IMP_AD_VALUES_RECEIVED", 641);
    public static final f1 GMA_IMP_DATA_RECEIVED = new f1("GMA_IMP_DATA_RECEIVED", 642);
    public static final f1 GMA_AD_STEP = new f1("GMA_AD_STEP", 643);
    public static final f1 PIN_IAB_END = new f1("PIN_IAB_END", 644);
    public static final f1 BROWSER_SCREENSHOT = new f1("BROWSER_SCREENSHOT", 645);
    public static final f1 URL_TIME_SPENT = new f1("URL_TIME_SPENT", 646);
    public static final f1 OM_SDK_FUNNEL_STEP = new f1("OM_SDK_FUNNEL_STEP", 647);
    public static final f1 OM_SDK_FUNNEL_ERROR = new f1("OM_SDK_FUNNEL_ERROR", 648);
    public static final f1 PIN_AD_DELIVERED = new f1("PIN_AD_DELIVERED", 649);
    public static final f1 PIN_AD_RENDERED = new f1("PIN_AD_RENDERED", 650);
    public static final f1 PIN_IAB_INITIAL_URL_LOAD = new f1("PIN_IAB_INITIAL_URL_LOAD", 651);
    public static final f1 VOICE_SEARCH_FAILURE = new f1("VOICE_SEARCH_FAILURE", 652);
    public static final f1 HOME_FEED_INITIAL_LOAD_ERROR = new f1("HOME_FEED_INITIAL_LOAD_ERROR", 653);
    public static final f1 SAMSUNG_PRELOAD_METADATA_SUCCESS = new f1("SAMSUNG_PRELOAD_METADATA_SUCCESS", 654);
    public static final f1 SAMSUNG_PRELOAD_FAILED = new f1("SAMSUNG_PRELOAD_FAILED", 655);
    public static final f1 SAMSUNG_PRELOAD_METADATA_ATTEMPT = new f1("SAMSUNG_PRELOAD_METADATA_ATTEMPT", 656);
    public static final f1 AUTH_COLLECTION_CLICK = new f1("AUTH_COLLECTION_CLICK", 657);
    public static final f1 AUTH_COLLECTION_VIEW = new f1("AUTH_COLLECTION_VIEW", 658);
    public static final f1 AUTH_COLLECTION_DISMISS = new f1("AUTH_COLLECTION_DISMISS", 659);
    public static final f1 AUTH_COLLECTION_SUCCESS = new f1("AUTH_COLLECTION_SUCCESS", 660);
    public static final f1 AUTH_COLLECTION_REQUEST = new f1("AUTH_COLLECTION_REQUEST", 661);
    public static final f1 AUTH_COLLECTION_FAIL = new f1("AUTH_COLLECTION_FAIL", 662);
    public static final f1 AUTH_COLLECTION_EDIT = new f1("AUTH_COLLECTION_EDIT", 663);
    public static final f1 UNAUTH_ACCOUNT_RECOVERY_SUCCESS = new f1("UNAUTH_ACCOUNT_RECOVERY_SUCCESS", 664);
    public static final f1 UNAUTH_ACCOUNT_RECOVERY_FAILURE = new f1("UNAUTH_ACCOUNT_RECOVERY_FAILURE", 665);
    public static final f1 UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_EMAIL_REQUEST = new f1("UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_EMAIL_REQUEST", 666);
    public static final f1 UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_EMAIL_SUCCESS = new f1("UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_EMAIL_SUCCESS", 667);
    public static final f1 UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_NAME_REQUEST = new f1("UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_NAME_REQUEST", 668);
    public static final f1 UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_NAME_SUCCESS = new f1("UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_NAME_SUCCESS", 669);
    public static final f1 UNAUTH_ACCOUNT_RECOVERY_FB_ACCOUNT_RETRIEVAL = new f1("UNAUTH_ACCOUNT_RECOVERY_FB_ACCOUNT_RETRIEVAL", 670);
    public static final f1 UNAUTH_ACCOUNT_RECOVERY_FB_BANNER_CLICK = new f1("UNAUTH_ACCOUNT_RECOVERY_FB_BANNER_CLICK", 671);
    public static final f1 BOARD_VIEW_UPSELL_MODAL_INVITE_COLLABORATORS_DISMISS = new f1("BOARD_VIEW_UPSELL_MODAL_INVITE_COLLABORATORS_DISMISS", 672);
    public static final f1 BOARD_VIEW_UPSELL_MODAL_INVITE_COLLABORATORS_DISMISS_WITH_INVITE = new f1("BOARD_VIEW_UPSELL_MODAL_INVITE_COLLABORATORS_DISMISS_WITH_INVITE", 673);
    public static final f1 POST_SAVE_UPSELL_INVITE_COLLABORATORS_DISMISS_WITH_INVITE = new f1("POST_SAVE_UPSELL_INVITE_COLLABORATORS_DISMISS_WITH_INVITE", 674);
    public static final f1 POST_SAVE_IMAGE_UPSELL_INVITE_COLLABORATORS_DISMISS_WITH_INVITE = new f1("POST_SAVE_IMAGE_UPSELL_INVITE_COLLABORATORS_DISMISS_WITH_INVITE", 675);
    public static final f1 GRID_PIN_LEVELING_GAP = new f1("GRID_PIN_LEVELING_GAP", 676);
    public static final f1 GRID_PIN_LEVELING_GAP_150 = new f1("GRID_PIN_LEVELING_GAP_150", 677);
    public static final f1 GRID_PIN_LEVELING_GAP_FILLED = new f1("GRID_PIN_LEVELING_GAP_FILLED", 678);
    public static final f1 PIN_SUPPORTS_CLICKTHROUGH = new f1("PIN_SUPPORTS_CLICKTHROUGH", 679);
    public static final f1 SH_BOARD_ADVISORY_VIEW = new f1("SH_BOARD_ADVISORY_VIEW", 680);
    public static final f1 SH_BOARD_SECTION_ADVISORY_VIEW = new f1("SH_BOARD_SECTION_ADVISORY_VIEW", 681);
    public static final f1 ALL_FILTERS_DESELECTED = new f1("ALL_FILTERS_DESELECTED", 682);
    public static final f1 PIN_REPIN_SUCCESS = new f1("PIN_REPIN_SUCCESS", 683);
    public static final f1 BOARD_SHARE_VIDEO_EXPORT_ATTEMPTED = new f1("BOARD_SHARE_VIDEO_EXPORT_ATTEMPTED", 684);
    public static final f1 BOARD_SHARE_VIDEO_EXPORT_CODEC_CREATED = new f1("BOARD_SHARE_VIDEO_EXPORT_CODEC_CREATED", 685);
    public static final f1 BOARD_SHARE_VIDEO_EXPORT_CODEC_FAILED = new f1("BOARD_SHARE_VIDEO_EXPORT_CODEC_FAILED", 686);
    public static final f1 BOARD_SHARE_VIDEO_EXPORT_SUCCEEDED = new f1("BOARD_SHARE_VIDEO_EXPORT_SUCCEEDED", 687);
    public static final f1 END_SESSION_SUCCESS = new f1("END_SESSION_SUCCESS", 688);
    public static final f1 END_SESSION_FAILURE = new f1("END_SESSION_FAILURE", 689);
    public static final f1 CONVERSATION_SETTINGS_VIEWED = new f1("CONVERSATION_SETTINGS_VIEWED", 690);
    public static final f1 CONVERSATION_NOTIFICATIONS_SET_ALWAYS_ON = new f1("CONVERSATION_NOTIFICATIONS_SET_ALWAYS_ON", 691);
    public static final f1 CONVERSATION_NOTIFICATIONS_SET_MUTE_ONE_HOUR = new f1("CONVERSATION_NOTIFICATIONS_SET_MUTE_ONE_HOUR", 692);
    public static final f1 CONVERSATION_NOTIFICATIONS_SET_MUTE_EIGHT_HOURS = new f1("CONVERSATION_NOTIFICATIONS_SET_MUTE_EIGHT_HOURS", 693);
    public static final f1 CONVERSATION_NOTIFICATIONS_SET_MUTE_ONE_WEEK = new f1("CONVERSATION_NOTIFICATIONS_SET_MUTE_ONE_WEEK", 694);
    public static final f1 CONVERSATION_NOTIFICATIONS_SET_MUTE_INDEFINITELY = new f1("CONVERSATION_NOTIFICATIONS_SET_MUTE_INDEFINITELY", 695);
    public static final f1 UNAUTH_EX_PRELOAD_CONTROL = new f1("UNAUTH_EX_PRELOAD_CONTROL", 696);
    public static final f1 UNAUTH_EX_PRELOAD_ENABLED = new f1("UNAUTH_EX_PRELOAD_ENABLED", 697);
    public static final f1 MOVE_GOOGLE_LINK_SUCCESS = new f1("MOVE_GOOGLE_LINK_SUCCESS", 698);
    public static final f1 MOVE_GOOGLE_LINK_FAILURE = new f1("MOVE_GOOGLE_LINK_FAILURE", 699);
    public static final f1 AD_DISCLOSURE_CLICKTHROUGH = new f1("AD_DISCLOSURE_CLICKTHROUGH", 700);
    public static final f1 EMAIL_OTP_VERIFICIATION_SUCCESS = new f1("EMAIL_OTP_VERIFICIATION_SUCCESS", 701);
    public static final f1 EMAIL_OTP_VERIFICIATION_FAILURE = new f1("EMAIL_OTP_VERIFICIATION_FAILURE", 702);
    public static final f1 EMAIL_OTP_VERIFICATION_SUCCESS = new f1("EMAIL_OTP_VERIFICATION_SUCCESS", 703);
    public static final f1 EMAIL_OTP_VERIFICATION_FAILURE = new f1("EMAIL_OTP_VERIFICATION_FAILURE", 704);
    public static final f1 PIN_CLOSEUP_BOARD_CONVERSATION_THREAD_MODULE = new f1("PIN_CLOSEUP_BOARD_CONVERSATION_THREAD_MODULE", 705);
    public static final f1 COMPLETE_EU_PROMPT = new f1("COMPLETE_EU_PROMPT", 706);
    public static final f1 DISMISS_EU_PROMPT = new f1("DISMISS_EU_PROMPT", 707);
    public static final f1 PIN_SEE_MORE = new f1("PIN_SEE_MORE", 708);
    public static final f1 PIN_SEE_MORE_UNDO = new f1("PIN_SEE_MORE_UNDO", 709);
    public static final f1 PIN_SEE_LESS = new f1("PIN_SEE_LESS", 710);
    public static final f1 PIN_SEE_LESS_UNDO = new f1("PIN_SEE_LESS_UNDO", 711);
    public static final f1 STORY_SEE_MORE = new f1("STORY_SEE_MORE", 712);
    public static final f1 STORY_SEE_MORE_UNDO = new f1("STORY_SEE_MORE_UNDO", 713);
    public static final f1 STORY_SEE_LESS = new f1("STORY_SEE_LESS", 714);
    public static final f1 STORY_SEE_LESS_UNDO = new f1("STORY_SEE_LESS_UNDO", 715);
    public static final f1 WL_SUBMIT = new f1("WL_SUBMIT", 716);
    public static final f1 NRT_AUTO_ORG_VIEW = new f1("NRT_AUTO_ORG_VIEW", 717);
    public static final f1 NRT_AUTO_ORG_DISMISS = new f1("NRT_AUTO_ORG_DISMISS", 718);
    public static final f1 NRT_AUTO_ORG_TIMEOUT = new f1("NRT_AUTO_ORG_TIMEOUT", 719);
    public static final f1 NRT_AUTO_ORG_FAILURE = new f1("NRT_AUTO_ORG_FAILURE", 720);
    public static final f1 COLLAGE_CUTOUT_ITEM_CLICK = new f1("COLLAGE_CUTOUT_ITEM_CLICK", 721);
    public static final f1 COLLAGE_CUTOUT_ITEM_CLICKTHROUGH = new f1("COLLAGE_CUTOUT_ITEM_CLICKTHROUGH", 722);
    public static final f1 COLLAGE_CUTOUT_ITEM_CLICKTHROUGH_END = new f1("COLLAGE_CUTOUT_ITEM_CLICKTHROUGH_END", 723);
    public static final f1 COLLAGE_CUTOUT_ITEM_SWIPE_LEFT = new f1("COLLAGE_CUTOUT_ITEM_SWIPE_LEFT", 724);
    public static final f1 COLLAGE_CUTOUT_ITEM_SWIPE_RIGHT = new f1("COLLAGE_CUTOUT_ITEM_SWIPE_RIGHT", 725);
    public static final f1 COLLAGE_CUTOUT_DRAWER_OPEN = new f1("COLLAGE_CUTOUT_DRAWER_OPEN", 726);
    public static final f1 COLLAGE_CUTOUT_DRAWER_CLOSE = new f1("COLLAGE_CUTOUT_DRAWER_CLOSE", 727);
    public static final f1 COLLAGE_CUTOUT_ITEM_VIEW = new f1("COLLAGE_CUTOUT_ITEM_VIEW", AdSize.LEADERBOARD_WIDTH);
    public static final f1 END_OF_FEED = new f1("END_OF_FEED", 729);
    public static final f1 COMPLIANCE_REQUIREMENTS_SUCCESS = new f1("COMPLIANCE_REQUIREMENTS_SUCCESS", 730);
    public static final f1 COMPLIANCE_REQUIREMENTS_FAILURE = new f1("COMPLIANCE_REQUIREMENTS_FAILURE", 731);
    public static final f1 COMPLIANCE_REQUIREMENTS_TIMEOUT = new f1("COMPLIANCE_REQUIREMENTS_TIMEOUT", 732);
    public static final f1 COMPLIANCE_FEATURE_CHECK_NOT_LOADED = new f1("COMPLIANCE_FEATURE_CHECK_NOT_LOADED", 733);
    public static final f1 SHOPPING_SKELETON_FALSE_POSITIVE = new f1("SHOPPING_SKELETON_FALSE_POSITIVE", 734);
    public static final f1 SHOPPING_SKELETON_FALSE_NEGATIVE = new f1("SHOPPING_SKELETON_FALSE_NEGATIVE", 735);
    public static final f1 FACEBOOK_HELP_CENTER_LINK = new f1("FACEBOOK_HELP_CENTER_LINK", 736);
    public static final f1 COLLAGE_QUICK_SWAP_CAROUSEL_SWAP = new f1("COLLAGE_QUICK_SWAP_CAROUSEL_SWAP", 737);
    public static final f1 COLLAGE_QUICK_SWAP_CUTOUT_CAROUSEL_SWAP = new f1("COLLAGE_QUICK_SWAP_CUTOUT_CAROUSEL_SWAP", 738);
    public static final f1 AD_CLOSEUP_RP_VIEW = new f1("AD_CLOSEUP_RP_VIEW", 739);
    public static final f1 DL_AD_CLOSEUP_OVERLAY_IMPRESSION = new f1("DL_AD_CLOSEUP_OVERLAY_IMPRESSION", 740);
    public static final f1 DL_AD_CLOSEUP_OVERLAY_CLICKTHROUGH = new f1("DL_AD_CLOSEUP_OVERLAY_CLICKTHROUGH", 741);
    public static final f1 DL_AD_CLOSEUP_OVERLAY_CLICKTHROUGH_END = new f1("DL_AD_CLOSEUP_OVERLAY_CLICKTHROUGH_END", 742);
    public static final f1 SUBMIT_NEW_PASSWORD = new f1("SUBMIT_NEW_PASSWORD", 743);
    public static final f1 REMOTE_PASSWORD_VALIDATION_SUCCESS = new f1("REMOTE_PASSWORD_VALIDATION_SUCCESS", 744);
    public static final f1 REMOTE_PASSWORD_VALIDATION_FAILURE = new f1("REMOTE_PASSWORD_VALIDATION_FAILURE", 745);
    public static final f1 HANDSHAKE_ACCT_LINKING_SUCCESS = new f1("HANDSHAKE_ACCT_LINKING_SUCCESS", 746);
    public static final f1 HANDSHAKE_ACCT_LINKING_FAILURE = new f1("HANDSHAKE_ACCT_LINKING_FAILURE", 747);
    public static final f1 HANDSHAKE_ACCT_UNLINKING_SUCCESS = new f1("HANDSHAKE_ACCT_UNLINKING_SUCCESS", 748);
    public static final f1 HANDSHAKE_ACCT_UNLINKING_FAILURE = new f1("HANDSHAKE_ACCT_UNLINKING_FAILURE", 749);
    public static final f1 FULFILLED_BY_SEARCH_FEATURES = new f1("FULFILLED_BY_SEARCH_FEATURES", 750);
    public static final f1 USER_SEARCH_ADVISORY = new f1("USER_SEARCH_ADVISORY", 751);
    public static final f1 CLOSEUP_PIN_LOAD_CACHE_HIT = new f1("CLOSEUP_PIN_LOAD_CACHE_HIT", 752);
    public static final f1 CLOSEUP_PIN_LOAD_CACHE_MISS = new f1("CLOSEUP_PIN_LOAD_CACHE_MISS", 753);
    public static final f1 MQTT_CONNECTED_SUCCESS = new f1("MQTT_CONNECTED_SUCCESS", 754);
    public static final f1 MQTT_CONNECTED_FAILURE = new f1("MQTT_CONNECTED_FAILURE", 755);
    public static final f1 MQTT_DISCONNECTED = new f1("MQTT_DISCONNECTED", 756);
    public static final f1 MQTT_RECONNECTED = new f1("MQTT_RECONNECTED", 757);
    public static final f1 MQTT_MESSAGE_SENT = new f1("MQTT_MESSAGE_SENT", 758);
    public static final f1 QR_AUTH_VERIFY_TOKEN = new f1("QR_AUTH_VERIFY_TOKEN", 759);
    public static final f1 QR_AUTH_APPROVE = new f1("QR_AUTH_APPROVE", 760);
    public static final f1 PIN_REP_EVENT_QUEUE_FALLBACK = new f1("PIN_REP_EVENT_QUEUE_FALLBACK", 761);
    public static final f1 PIN_REP_EVENT_QUEUE_INTERRUPTED = new f1("PIN_REP_EVENT_QUEUE_INTERRUPTED", 762);
    public static final f1 PIN_REP_EVENT_QUEUE_FULL = new f1("PIN_REP_EVENT_QUEUE_FULL", 763);
    public static final f1 PIN_REP_EVENT_QUEUE_NULL = new f1("PIN_REP_EVENT_QUEUE_NULL", 764);
    public static final f1 NETWORK_OFFLINE = new f1("NETWORK_OFFLINE", 765);
    public static final f1 NETWORK_ONLINE = new f1("NETWORK_ONLINE", 766);
    public static final f1 QCM_PIN_IMPRESSION_ONE_PIEXAL = new f1("QCM_PIN_IMPRESSION_ONE_PIEXAL", 767);
    public static final f1 QCM_PIN_IMPRESSION_ONE_PIXEL = new f1("QCM_PIN_IMPRESSION_ONE_PIXEL", 768);
    public static final f1 QCM_METADATA_CLICK = new f1("QCM_METADATA_CLICK", 769);
    public static final f1 QCM_CTA_CLICK = new f1("QCM_CTA_CLICK", 770);
    public static final f1 CUSTOM_CHROME_TAB_ENGAGEMENT_SIGNAL = new f1("CUSTOM_CHROME_TAB_ENGAGEMENT_SIGNAL", 771);
    public static final f1 LOCAL_NOTIFICATION_SCHEDULE = new f1("LOCAL_NOTIFICATION_SCHEDULE", 772);
    public static final f1 LOCAL_NOTIFICATION_DELETE = new f1("LOCAL_NOTIFICATION_DELETE", 773);
    public static final f1 LOCAL_NOTIFICATION_OPEN = new f1("LOCAL_NOTIFICATION_OPEN", 774);

    private static final /* synthetic */ f1[] $values() {
        return new f1[]{VIEW, PIN_CREATE, PIN_CREATE_FAILURE, PIN_CREATE_ATTEMPTED, PIN_EDIT, PIN_DELETE, PIN_REPIN, PIN_CLICKTHROUGH, PIN_CLICK, PIN_ZOOM, PIN_SEND, PIN_CLOSEUP, PIN_IMPRESSION_ONE_PIXEL, PIN_CLOSEUP_NUDGE, STORY_IMPRESSION_ONE_PIXEL, PRODUCT_TAG_VISIT, IDEA_PIN_PRODUCT_TAG_REPIN, COMMENT_REPLY_TAG_VISIT, BOARD_CREATE, BOARD_DELETE, BOARD_FOLLOW, BOARD_UNFOLLOW, BOARD_REMOVE_COLLABORATOR, BOARD_INVITE_COLLABORATOR, BOARD_REQUEST_APPROVAL_INVITE_COLLABORATOR, BOARD_SEND, BOARD_MERGE, BOARD_REPORT, BOARD_END, USER_CREATE, USER_EDIT, USER_DELETE, USER_REORDER_BOARDS, USER_FOLLOW, USER_UNFOLLOW, USER_DEACTIVATED, USER_DELETE_REQUEST, USER_LOGIN_ATTEMPT, USER_PASSWORD_RESET_REQUEST, USER_PASSWORD_RESET_COMPLETED, USER_BLOCK, USER_UNBLOCK, USER_REPORT, USER_PROFILE_REMOVE, USER_PROFILE_OVERFLOW_ACTIONS, USER_PROFILE_OVERFLOW_ACTIONS_REPORT_SPAM, USER_PROFILE_OVERFLOW_ACTIONS_REPORT_SPAM_CONFIRM, USER_SET_DSA_OPT_OUT, START_TYPING, PIN_REPORT, PIN_LINK_REPORT, SEARCH_PINS, SEARCH_BOARDS, SEARCH_USERS, SEARCH_MY_PINS, SEARCH_VIDEOS, SEARCH_IDEA_PIN_STICKERS, SEARCH_IDEA_PIN_MUSIC, LOGIN_OPTION_ENABLED_SUCCESS, LOGIN_OPTION_ENABLED_FAILURE, REFRESH, PIN_SAVE_TO_DEVICE, USER_DISABLE_FACBOOK, USER_DISABLE_GPLUS, USER_ENABLE_INSTAGRAM, USER_DISABLE_INSTAGRAM, USER_ENABLE_ETSY, USER_DISABLE_ETSY, CLICK, TAP, TAP_LEFT, TAP_RIGHT, LONG_PRESS, DRAG, HOVER, TOGGLE_ON, TOGGLE_OFF, SWIPE, SCROLL, DROPDOWN_CHANGE, SCROLL_UP_FROM_RELATED_PINS, SWIPE_UP, SWIPE_DOWN, SWIPE_LEFT, SWIPE_RIGHT, INPUT_CHANGE, SELECT, UNSELECT, IDEA_PIN_VIDEO_CONTROLS_IN, IDEA_PIN_VIDEO_CONTROLS_OUT, PUSH_NOTIFICATION_RECEIVED_BY, PUSH_NOTIFICATION_OPENED_BY, PUSH_NOTIFICATION_SOURCE_MISMATCH, PUSH_NOTIFICATION_BOARD_INVITE_TO_BE_CREATED, PUSH_NOTIFICATION_BOARD_INVITE_CREATED, CONTEXTUAL_MENU_OPEN, CONTEXTUAL_MENU_CLOSE, RENDER, DISMISS, PIN_SCREENSHOT, BOARD_SCREENSHOT, USER_SEND, USER_SEARCH_PRIVACY_CHANGED, USER_PERSONALIZED_RECOMMENDATIONS_CHANGED, PULL_TO_REFRESH, USER_LOGOUT_ATTEMPT, INITIAL_FEED_LOAD_ABORT, CONVERSATION_MESSAGE_SEND, CONVERSATION_HIDE, CONVERSATION_REPORT, CONVERSATION_VIEWED, CONVERSATION_INBOX_VIEWED, CONVERSATION_THREAD_CLOSEUP_VIEWED, CONVERSATION_PIN_QUICK_REPLIES_VIEWED, CONVERSATION_PIN_QUICK_REPLY_SEND, CONVERSATION_PIN_REPLY, CONVERSATION_EMPTY_INBOX_SEARCH_BAR_TAP_TARGET, APP_START, APP_BACKGROUND, PULL_NOTIFICATION_OPENED_BY, INTEREST_FOLLOW, INTEREST_UNFOLLOW, DEEP_LINK_PINTEREST, DEEP_LINK_HTTP, DEEP_LINK_OTHER, SERVICE_ENTRY, BULK_PIN_DELETE, BULK_PIN_MOVE, REFERRER_APP_LOGIN, REFERRER_APP_SIGNUP, APP_START_ATTRIBUTED, ADDRESS_BOOK_SYNC_ALLOWED, ADDRESS_BOOK_SYNC_DECLINED, ADDRESS_BOOK_SYNC_DECLINED_PERMANENTLY, APP_CRASH_DETECTED, APP_CRASH_OOM_DETECTED, APP_DEADLOCK_CRASH_DETECTED, SAVE_BROWSER_PIN_IMAGES_FOUND, SAVE_BROWSER_PIN_IMAGES_NOT_FOUND, SAVE_BROWSER_URL_NAVIGATE, SAVE_BROWSER_PIN_IMAGES_REQUESTED, PIN_CARD_VIEW, DID_IT_SHARE, AGGREGATED_PIN_COMMENT_LINK_TAP, AGGREGATED_COMMENT_COMMUNITY_GUIDELINE_BANNER_CLICK, COMMENT_CODE_VIEWED, COMMENT_CODE_DISMISSED, COMMENT_CODE_ACCEPTED, COMMENT_PUSH_NOTIFICATION_NUDGE_VIEWED, COMMENT_PUSH_NOTIFICATION_NUDGE_DISMISSED, COMMENT_PUSH_NOTIFICATION_NUDGE_ACCEPTED, COMMENT_OVERFLOW_BLOCK_USER_TAP, COMMENT_BLOCK_USER_CONFIRMATION_CANCEL_TAP, COMMENT_BLOCK_USER_TOAST_UNDO_TAP, COMMENT_HELPER_VIEWED, COMMENT_HELPER_SELECTED, COMMENT_HELPER_SENT, SOCIAL_PERMISSION_SETTINGS_VISIT, MANUAL_FILTERS_VISIT, MENTION_SETTINGS_TOGGLE, MENTION_SETTINGS_VISIT, SEE_TRANSLATION_VIEWED, SEE_TRANSLATION_TAP, SEE_ORIGINAL_TAP, COMMENT_USER_REACTIONS_VIEWED, PHOTO_COMMENT_PICKER_VIEWED, PHOTO_COMMENT_PICKER_PHOTO_SELECTED, PHOTO_COMMENT_PICKER_PHOTO_SELECTION_FAILED, PHOTO_COMMENT_PICKER_CANCELED, COMMUNITY_VIEW_INTENT, COMMUNITY_CONTENT_MODULE_VIEWED, COMMENT_FEED_CLOSED, PIN_OR_SPIN_VIEW_INTENT, PIN_OR_SPIN_EXIT, PIN_OR_SPIN_REFRESH, PIN_OR_SPIN_PIN_SELECTED, PIN_OR_SPIN_CHOSEN_PIN_SELECTED, PIN_OR_SPIN_EXIT_REVEAL_REWARD_PAGE, PIN_OR_SPIN_REVEAL_REWARD_VIEW_INTENT, PIN_OR_SPIN_REVEAL_REWARD, PIN_OR_SPIN_REWARD_VIEW_INTENT, PIN_OR_SPIN_RESTART, PIN_OR_SPIN_REWARD_SAVE_BOARD, PIN_OR_SPIN_INSTAGRAM_SHARE, PIN_OR_SPIN_SHARE_SHEET_CLICKED, PIN_OR_SPIN_DOWNLOAD, FLASHLIGHT_CAMERA_TAP_SNAP, FLASHLIGHT_LENS_UNIVERSE_SEARCH, FLASHLIGHT_LENS_GALLERY_SEARCH, FLASHLIGHT_CROPPER_MOVE, FLASHLIGHT_CROPPER_RESIZE, FLASHLIGHT_CROPPER_NON_OBJECT_CROP, FLASHLIGHT_CROPPER_PIN_LEVEL_CROP, FLASHLIGHT_CROPPER_DISMISS, VISUAL_SEARCH_IMAGE_ZOOM, VISUAL_SEARCH_IMAGE_PAN, BOTTOM_SHEET_SNAP_FULLY_OPEN, BOTTOM_SHEET_SNAP_DEFAULT, BOTTOM_SHEET_SNAP_MINIMIZED, BOTTOM_SHEET_SNAP_UNKNOWN, VIDEO_PLAYBACK, VIDEO_PREFETCH_START, VIDEO_PREFETCH_END, VIDEO_PLAYBACK_PERFORMANCE, VIDEO_MANAGER_SETUP, VIDEO_START, VIDEO_PLAYBACK_COMPLETION, VIDEO_PLAYBACK_INTERVAL, VIDEO_SINGLE_QUARTILE, VIDEO_UPLOAD_ATTEMPTED, VIDEO_UPLOAD_UPLOADED, VIDEO_UPLOAD_PROCESSED, VIDEO_UPLOAD_SUCCEEDED, VIDEO_UPLOAD_FAILED, VIDEO_UPLOAD_CANCELLED, BOARD_IMPRESSION_ONE_PIXEL, TOPIC_IMPRESSION_ONE_PIXEL, USER_IMPRESSION_ONE_PIXEL, PIN_CLOSEUP_IMPRESSION_ONE_PIXEL, SEARCH_IMPRESSION_ONE_PIXEL, GUIDE_IMPRESSION_ONE_PIXEL, TODAY_ARTICLE_IMPRESSION_ONE_PIXEL, COMMENT_IMPRESSION_ONE_PIXEL, MORE_IDEAS_FEED_UPSELL_IMPRESSION_ONE_PIXEL, RELATED_PINS_FILTER_IMPRESSION_ONE_PIXEL, USE_CASE_IMPRESSION_ONE_PIXEL, SEARCH_PINS_BUYABLE, LOAD_URL, ARTICLE_IMPRESSION_ONE_PIXEL, ARTICLE_SEND, BUBBLE_OPEN, ACCEPT_CONTACT_REQUEST_CLICK, DECLINE_CONTACT_REQUEST_CLICK, PREVIEW_CONTACT_REQUEST_CLICK, REPORT_CONTACT_REQUEST_CLICK, BLOCK_CONTACT_REQUEST_CLICK, UNBLOCK_CONTACT_REQUEST_CLICK, REPORT_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK, REPORT_AND_BLOCK_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK, DECLINE_CONTACT_REQUEST_UNDO_CLICK, BLOCK_CONTACT_REQUEST_CONFIRM_CLICK, DID_IT_ACTIVITY_REPORT, PIN_CLICKTHROUGH_END, PIN_IAB_DURATION, PIN_IAB_START, NUX_START, NUX_END, NUX_STEP_END, REGULAR_NUX_START, REGULAR_NUX_END, NUX_DROP_OFF, NUX_VIEW_GENDER, NUX_DONE_GENDER, NUX_VIEW_LOCALE, NUX_DONE_LOCALE, NUX_VIEW_TOPIC_PICKER, NUX_DONE_TOPIC_PICKER, NEWS_HUB_FEED_IMPRESSION_ONE_PIXEL, NEWS_HUB_DETAIL_IMPRESSION_ONE_PIXEL, SEARCH_SOCIAL_TYPEAHEAD, EXPERIENCE_VIEWED, TIMED_APP_FOREGROUND, TIMED_APP_BACKGROUND, TIMED_PAIR_BEGIN, TIMED_PAIR_END, GRID_PIN_LEVELING_APPLIED, EXPERIENCE_COMPLETED, EXPERIENCE_DISMISSED, FPE_START, FPE_END, PINCODE_URL_NAVIGATE, PINCODE_CREATE, IMAGE_ERROR, SEO_LANDING_PAGE_VIEW, DEFERRED_DEEP_LINK_FACEBOOK, URL_LOAD_STARTED, URL_LOAD_FINISHED, URL_LOAD_ERROR, URL_LOAD_PERCENT, BOARD_SECTION_CREATE, BOARD_SECTION_EDIT, BOARD_SECTION_DELETE, BOARD_SECTION_REMOVE_PINS, BOARD_SECTION_MERGE, BOARD_SECTION_SUGGESTION_COMPLETED, PIN_REORDER, SECTION_REORDER, PIN_SELECTION, PIN_DESELECTION, BULK_SELECT_ALL_PIN_MOVE, BULK_SELECT_ALL_PIN_DELETE, VIEW_WEBSITE_ONE_PIXEL, VIEW_WEBSITE_100, DESTINATION_VIEW, SEND_SHARE_OPEN, USER_ACTIVE, PIN_TAGS_LOAD, BOARD_IDEAS_VIEW, PIN_CAROUSEL_SLOT_IMPRESSION_ONE_PIXEL, PIN_CAROUSEL_SLOT_CLICKTHROUGH, INVITE_APP_LAND, LOCATION_PERMISSIONS_PROMPT, LOCATION_PERMISSIONS_DENY, LOCATION_PERMISSIONS_ACCEPT_WHILE_IN_USE, LOCATION_PERMISSIONS_CURRENT_STATUS, SHARE_SHEET_DISMISS_NO_SEND, SHARE_SHEET_DISMISS_WITH_SEND, SHARE_SHEET_VIEW_WITH_CONTACTS, SHARE_SHEET_VIEW_WITH_NO_CONTACTS, SHARE_SHEET_IG_STORIES_EXPORT_SUCCESS, SHARE_SHEET_IG_STORIES_EXPORT_FAILED, SHARE_SHEET_IG_STORIES_EXPORT_CANCELLED, SHARE_SHEET_FB_STORIES_EXPORT_SUCCESS, SHARE_SHEET_FB_STORIES_EXPORT_FAILED, SHARE_SHEET_FB_STORIES_EXPORT_CANCELLED, SHARE_SHEET_DOWNLOAD_EXPORT_SUCCESS, SHARE_SHEET_DOWNLOAD_EXPORT_FAILED, SHARE_SHEET_DOWNLOAD_EXPORT_CANCELLED, SHARE_SHEET_CONTACT_SEND, SHARE_SHEET_SENDING_CANCEL, SHARE_SHEET_SENDING_ERROR, BACKGROUND_REFRESH_WARM_START, STORY_PIN_BEGIN, STORY_PIN_CREATE, STORY_PIN_CREATE_ATTEMPTED, STORY_PIN_CREATE_CANCELLED, STORY_PIN_CREATE_FAILURE, STORY_PIN_CREATE_USER_FAILURE, IDEA_PIN_CREATE_WARN, STORY_PIN_EDIT, STORY_PIN_EDIT_CANCELLED, STORY_PIN_EDIT_FAILURE, STORY_PIN_CREATION_BEGIN, STORY_PIN_LOGGING_ERROR, STORY_PIN_FONT_LIST_DOWNLOAD_FAILED, STORY_PIN_FONT_DOWNLOAD_FAILED, STORY_PIN_VIDEO_EXPORT_ATTEMPTED, STORY_PIN_VIDEO_EXPORT_SUCCEEDED, STORY_PIN_VIDEO_EXPORT_FAILED, STORY_PIN_VIDEO_EXPORT_CANCELLED, STORY_PIN_VIDEO_EXPORT_INCOMPATIBLE_MEDIA, STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_ATTEMPTED, STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_SUCCEEDED, STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_FAILED, STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_CANCELLED, IDEA_PIN_VIDEO_STILL_PROCESSING_DISPLAYED, IDEA_PIN_METADATA_EXTRACTION_ATTEMPTED, IDEA_PIN_METADATA_EXTRACTION_SUCCESS, IDEA_PIN_METADATA_EXTRACTION_FAILURE, STORY_PIN_ELEMENT_MOVE, STORY_PIN_ELEMENT_SCALE, STORY_PIN_ELEMENT_ROTATE, STORY_PIN_ELEMENT_DELETE_ATTEMPT, STORY_PIN_ELEMENT_DELETED, STORY_PIN_FONT_SIZE_CHANGE, STORY_PIN_START_TIME_CHANGE, STORY_PIN_END_TIME_CHANGE, BACKEND_STORY_PIN_DELETE, RAW_IPD_LOG_SUCCESS, RAW_IPD_LOG_FAILURE, USER_SWITCH_INTENT, USER_SWITCH_ATTEMPT, USER_SWITCH_SUCCESS, COLLECTION_ITEM_IMPRESSION_ONE_PIXEL, COLLECTION_ITEM_CLICKTHROUGH, COLLECTION_PIN_CLICKTHROUGH, COLLECTION_ITEM_CLICKTHROUGH_END, COLLECTION_PIN_CLICKTHROUGH_END, COLLECTION_ITEM_REPIN, COLLECTION_ITEM_CLOSEUP, SCENE_3D_ROTATE, SCENE_3D_TRANSLATE, LEAD_FORM_OPEN, LEAD_FORM_TYPING, LEAD_FORM_SUBMIT, LEAD_FORM_CLOSE, LEAD_FORM_SUBMIT_ERROR, LEAD_FORM_CACHE_SAVE, LEAD_FORM_CACHE_LOAD_SUCCESS, LEAD_FORM_CACHE_LOAD_EXPIRED, LEAD_FORM_AUTOFILL, BUSINESS_ACCOUNT_CREATE_COMPLETE, USER_LOGOUT_SUCCESS, BRAND_SURVEY_FALLBACK_TO_LEGACY, UPDATE, GROUP_BOARDS_REACTION_BAR_OPEN, GROUP_BOARDS_REACTION_SET, APP_THEME_CHANGED, APP_SOUND_SETTING_CHANGED, VIRTUAL_TRY_ON_RENDERER_INITIALIZED_SUCCESS, VIRTUAL_TRY_ON_RENDERER_INITIALIZED_FAILURE, VIRTUAL_TRY_ON_PIN_APPLY, VIRTUAL_TRY_ON_CHANGE_SWATCH, AR_MODEL_LOAD_REQUESTED, AR_MODEL_LOAD_COMPLETE, AR_MODEL_LOAD_FAILED, AR_OBJECT_PLACED, ANDROID_ARCORE_DOWNLOAD_REQUESTED, ANDROID_ARCORE_DOWNLOAD_REJECTED, ANDROID_ARCORE_DOWNLOAD_COMPLETE, PIN_INTEREST_TAG_SELECT, PIN_INTEREST_TAG_DESELECT, TAG_PIN_INTERESTS_SUCCESS, TAG_PIN_INTERESTS_FAILURE, APPSFLYER_INIT, APPSFLYER_FIRST_LAUNCH, APPSFLYER_COLD_START_TASK, APPSFLYER_RUNNABLE_START, APPSFLYER_INIT_IMMEDIATE, IMAGE_UPLOAD_ATTEMPTED, IMAGE_UPLOAD_UPLOADED, IMAGE_UPLOAD_CANCELLED, IMAGE_UPLOAD_FAILED, USE_CASES_SELECTED, BOARD_PERMISSION_SETTING_UPDATE, MENTION_SELECT, MENTION_REMOVE, MENTION_SEARCH_BEGIN, MENTION_SEARCH_CANCEL, MENTION_UNLINK, STORY_PIN_MUSIC_PLAY, COMMENTS_COMPOSER_OPENED, COMMENTS_COMPOSER_CLOSED_WITH_POST, COMMENTS_COMPOSER_CLOSED_WITHOUT_POST, GENERIC_STAT_LOG_EVENT, VIDEO_INVALID_INTERVAL, VIDEO_INVALID_QUARTILE, STORY_PIN_MULTI_DRAFTS_APPROACH_LIMIT, STORY_PIN_MULTI_DRAFTS_REACH_LIMIT, STORY_PIN_MULTI_DRAFTS_MISSING_COVER, STORY_PIN_MULTI_DRAFTS_SAVE_COVER, IDEA_PIN_DRAFT_COMPATIBILITY_CONVERSION, IDEA_PIN_MULTI_DRAFT_EXPIRATION, LENS_PERMISSIONS_REQUEST, FULL_SCREEN_VIEW, STORY_PIN_RESUME, STORY_PIN_PAUSE, SEEK, STORY_PIN_MUTE, STORY_PIN_UNMUTE, MEDIA_GALLERY_PERFORMANCE_STATS, NAVIGATION, STORY_PIN_VIDEO_PLAY, STORY_PIN_VIDEO_PAUSE, STORY_PIN_REORDER, STORY_PIN_DELETE, STORY_PIN_LOAD_DRAFT_FAILED, PIN_OPEN_IN_NATIVE_WEB_BROWSER, IDEA_PIN_CAMERA_VIEW_APPEAR, UNLINK_ACCOUNT, UNLINK_ACCOUNT_FAILED, LOGIN_ATTEMPT_LIMIT_REACHED, MAGIC_LINK_LOGIN_SUCCESS, MAGIC_LINK_LOGIN_FAILURE, PORTAL_IMPRESSION_ONE_PIXEL, STORY_PIN_CREATE_EXTERNAL_DEEP_LINK_SUCCESS, STORY_PIN_CREATE_EXTERNAL_DEEP_LINK_FAILED, OFFSITE_SAVE_ENTER, PAID_SEARCH_LAND, LIVE_SESSION_PRODUCT_IMPRESSION_ONE_PIXEL, LIVE_SESSION_COMMENT_IMPRESSION_ONE_PIXEL, ONEBAR_IMPRESSION_ONE_PIXEL, MFA_ENABLE_SUCCESS, MFA_DISABLE_SUCCESS, MFA_LOGIN_SUCCESS, MFA_SUCCESS_EMAIL_VERIFICATION, SHUFFLE_IMPRESSION_ONE_PIXEL, ANDROID_DFM_DOWNLOAD_STATUS, ANDROID_DFM_TOAST_SHOWN, CREATOR_ONBOARDING_LANDING_DEEPLINK, CREATOR_ONBOARDING_LANDING_DEEPLINK_SUCCESS, CREATOR_ONBOARDING_LANDING_DEEPLINK_FAILURE, PERMISSIONS_REQUEST, PERMISSIONS_RESULT, IDEA_PIN_CREATION_PERFORMANCE, IDEA_PIN_PRODUCT_TAG_ADDED, IDEA_PIN_PRODUCT_TAG_DELETED, CONVERSION_UPSELL_ACTIVE, CONVERSATION_INBOX_EMPTY_STATE_VIEW_DISPLAYED, CONVERSATION_EMPTY_INBOX_NEW_MESSAGE_BTN_DISPLAYED, CONVERSATION_INBOX_CONTACT_SYNC_BTN_DISPLAYED, CONTACT_SEARCH_MODAL_DISPLAYED, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH_END, SHOWCASE_SUBPAGE_IMPRESSION_ONE_PIXEL, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH_END, SHOWCASE_SUBPIN_IMPRESSION_ONE_PIXEL, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_PIN_CLICKTHROUGH_END, SHOWCASE_SUBPAGE_THUMBNAIL_SWIPE_LEFT, SHOWCASE_SUBPAGE_THUMBNAIL_SWIPE_RIGHT, SHOWCASE_SUBPAGE_NUDGE, QUIZ_PIN_RESPONSE, QUIZ_PIN_COMPLETION, QUIZ_PIN_RESULT_OPEN, QUIZ_PIN_RESULT_CLOSE, QUIZ_PIN_BACK, AUTOMAGICAL_BOARD_PIN_IMPRESSIONS, AUTOMAGICAL_BOARD_PIN_REPINS, AUTOMAGICAL_BOARD_PIN_5S_OUTBOUND_CLICKS, AUTOMAGICAL_BOARD_PIN_OUTBOUND_CLICKS, AUTOMAGICAL_BOARD_PIN_CLICKS, AUTOMAGICAL_BOARD_PIN_GRID_CLICKS, AUTOMAGICAL_BOARD_PIN_SAVES, AUTOMAGICAL_BOARD_PIN_SHARES_COMPLETED, AUTOMAGICAL_BOARD_TP_PIN_IMPRESSIONS, AUTOMAGICAL_BOARD_TP_PIN_REPINS, AUTOMAGICAL_BOARD_TP_PIN_5S_OUTBOUND_CLICKS, AUTOMAGICAL_BOARD_TP_PIN_OUTBOUND_CLICKS, AUTOMAGICAL_BOARD_TP_PIN_CLICKS, AUTOMAGICAL_BOARD_TP_PIN_GRID_CLICKS, AUTOMAGICAL_BOARD_TP_PIN_SAVES, AUTOMAGICAL_BOARD_TP_PIN_SHARES_COMPLETED, AUTOMAGICAL_BOARD_SESSIONS, AUTOMAGICAL_BOARD_SESSIONS_REPIN, AUTOMAGICAL_BOARD_SESSIONS_PIN_CLICK, AUTOMAGICAL_BOARD_SESSIONS_PIN_SAVES, AUTOMAGICAL_BOARD_SESSIONS_PIN_SHARES_COMPLETED, AUTOMAGICAL_BOARD_BOARDS_VISITED, AUTOMAGICAL_BOARD_BOARDS_PIN_REPIN, AUTOMAGICAL_BOARD_BOARDS_PIN_CLICK, AUTOMAGICAL_BOARD_BOARDS_PIN_5S_OUTBOUND_CLICKS, AUTOMAGICAL_BOARD_BOARDS_PIN_OUTBOUND_CLICKS, AUTOMAGICAL_BOARD_BOARDS_PIN_SAVES, AUTOMAGICAL_BOARD_BOARDS_PIN_SHARES_COMPLETED, AUTOMAGICAL_BOARD_BOARDS_TP_PIN_REPIN, AUTOMAGICAL_BOARD_BOARDS_TP_PIN_CLICKS, AUTOMAGICAL_BOARD_BOARDS_TP_PIN_5S_OUTBOUND_CLICKS, AUTOMAGICAL_BOARD_BOARDS_TP_PIN_OUTBOUND_CLICKS, AUTOMAGICAL_BOARD_BOARDS_TP_PIN_SAVES, AUTOMAGICAL_BOARD_BOARDS_TP_PIN_SHARES_COMPLETED, AUTO_ORGANIZE_BUTTON_TAPPED, AUTO_CLUSTER_SELECTED, AUTO_CLUSTERS_IMPRESSION, AUTO_REFINE_BOARD_VIEW_BEGIN, AUTO_REFINE_BOARD_PIN_SELECTED, AUTO_REFINE_BOARD_PIN_DESELECTED, AUTO_BOARD_NAME_INPUT_VIEW_BEGIN, AUTO_BOARD_NAME_INPUTTED, AUTO_BOARD_CREATED, AUTO_SPARKLE_ORGANIZE_VIEW_BEGIN, AUTO_BOARD_PINS_ADD_TO_EXISTING_BOARD, PASSCODE_BACKUP_EMAIL_EQUAL_TO_CURRENT, SAVE_PASSCODE_SUCCESS, SAVE_SETTING_WITH_PASSCODE_ERROR, SAVE_SETTING_WITH_PASSCODE_SUCCESS, DISABLE_PASSCODE_SUCCESS, DISABLE_PASSCODE_FAILURE, UNIDIRECTIONAL_PASSCODE_ACKNOWLEDGED, UNIDIRECTIONAL_PASSCODE_CANCELED, MUSIC_PLAYLIST_OPEN, MUSIC_PLAYLIST_DISMISS, STORY_PIN_EMBEDDED_MUSIC_PLAY, PIN_EMBEDDED_MUSIC_PLAY, VIDEO_MUTE, VIDEO_NO_MUTE, PIN_CLOSEUP_MT_TRANSLATE, PIN_CLOSEUP_MT_RESTORE, PIN_CLOSEUP_RICH_MT_TRANSLATE, PIN_CLOSEUP_RICH_MT_RESTORE, PRODUCT_SEARCH_BACK_BUTTON_EXIT, VOICE_PERMISSIONS_PROMPT, INSTAGRAM_ACCT_CLAIMING_RETRY, INSTAGRAM_ACCT_CLAIMING_SUCCESS, INSTAGRAM_ACCT_CLAIMING_FAILURE, INSTAGRAM_ACCT_RECLAIMING_SUCCESS, INSTAGRAM_ACCT_RECLAIMING_FAILURE, INSTAGRAM_ACCT_UNCLAIMING_SUCCESS, INSTAGRAM_ACCT_UNCLAIMING_FAILURE, INSTAGRAM_ACCT_CLAIMING_AUTOPUBLISH_SUCCESS, INSTAGRAM_ACCT_CLAIMING_AUTOPUBLISH_FAILURE, HEADER_ACCOUNTS_CLAIM_BANNER_DISMISS, INSTAGRAM_ACCT_AUTO_ORG_PIN_SUCCESS, INSTAGRAM_ACCT_AUTO_ORG_PIN_FAILURE, AMAZON_ACCT_CLAIMING_SEEN, AMAZON_ACCT_LINK_BUTTON, AMAZON_ACCT_CLAIMING_SUCCESS, AMAZON_ACCT_CLAIMING_FAILURE, AMAZON_ACCT_UNCLAIMING_SEEN, AMAZON_ACCT_UNLINK_BUTTON, AMAZON_ACCT_UNCLAIMING_SUCCESS, AMAZON_ACCT_UNCLAIMING_FAILURE, PIN_HANDSHAKE_WEBVIEW_ERROR, PIN_HANDSHAKE_ERROR, PIN_HANDSHAKE_STEP, PIN_CARTING_SHEET_LOAD, PIN_CARTING_API_FAILURE, PIN_CARTING_RETAILER_CLICK, PIN_CARTING_MDL_SUCCEEDED, ADS_STL_ERROR, FILTER_NO_DATA, SEARCH_ONE_BAR_FILTER_NO_DATA, SEARCH_ONE_BAR_FILTER_MODULE_NO_DATA, DATA_REQUEST_SUCCESS, DATA_REQUEST_FAILURE, INVITE_CODE_FOLLOW_SUCCESSFUL, CLIENT_AUTH_INITIATED, CLIENT_REGISTER_ATTEMPT, CLIENT_REGISTER_SUCCESS, CLIENT_REGISTER_FAILED, CLIENT_SIGN_IN_ATTEMPT, CLIENT_SIGN_IN_SUCCESS, CLIENT_SIGN_IN_FAILED, PEAR_SCREENSHOT, ONE_BAR_MODULE_CLICK, ONE_BAR_MODULE_DESELECT, JOURNEY_BACK_BUTTON_CLICK, COLLAGE_COMPOSER_LAYER_REORDER, COLLAGE_COMPOSER_CUTOUT_ADDED, COLLAGE_COMPOSER_TEXT_ADDED, COLLAGE_COMPOSER_DRAWING_ADDED, COLLAGE_COMPOSER_DRAFT_FIRST_SAVE, COLLAGE_COMPOSER_ITEM_SWAPPED, COLLAGE_COMPOSER_COLLAGE_REMIXED, COLLAGE_COMPOSER_CAMERA_ADDED, COLLAGE_COMPOSER_USER_PHOTO_ADDED, ARA_VIEW, ARA_CLICK, WIDGET_UPSELL_DISMISS, WIDGET_UPSELL_STEPS_SHOWN, WIDGET_PRE_UPSELL_SHOWN, WIDGET_UPSELL_TRY_IT_CLICK, WIDGET_UPSELL_WIDGET_PINNED, GMA_SDK_LOAD, GMA_QUERY_INFO_FETCHED, GMA_QUERY_INFO_SENT, GMA_AD_LOADED, GMA_AD_RENDERED, GMA_AD_LOAD_FAILED, GMA_SDK_QUARANTINE_FAILED, GMA_QUERY_INFO_FAILED, GMA_REQUEST_HEADER_MISSING, GMA_SDK_MOBILE_CRASH, GMA_IMP_AD_VALUES_RECEIVED, GMA_IMP_DATA_RECEIVED, GMA_AD_STEP, PIN_IAB_END, BROWSER_SCREENSHOT, URL_TIME_SPENT, OM_SDK_FUNNEL_STEP, OM_SDK_FUNNEL_ERROR, PIN_AD_DELIVERED, PIN_AD_RENDERED, PIN_IAB_INITIAL_URL_LOAD, VOICE_SEARCH_FAILURE, HOME_FEED_INITIAL_LOAD_ERROR, SAMSUNG_PRELOAD_METADATA_SUCCESS, SAMSUNG_PRELOAD_FAILED, SAMSUNG_PRELOAD_METADATA_ATTEMPT, AUTH_COLLECTION_CLICK, AUTH_COLLECTION_VIEW, AUTH_COLLECTION_DISMISS, AUTH_COLLECTION_SUCCESS, AUTH_COLLECTION_REQUEST, AUTH_COLLECTION_FAIL, AUTH_COLLECTION_EDIT, UNAUTH_ACCOUNT_RECOVERY_SUCCESS, UNAUTH_ACCOUNT_RECOVERY_FAILURE, UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_EMAIL_REQUEST, UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_EMAIL_SUCCESS, UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_NAME_REQUEST, UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_NAME_SUCCESS, UNAUTH_ACCOUNT_RECOVERY_FB_ACCOUNT_RETRIEVAL, UNAUTH_ACCOUNT_RECOVERY_FB_BANNER_CLICK, BOARD_VIEW_UPSELL_MODAL_INVITE_COLLABORATORS_DISMISS, BOARD_VIEW_UPSELL_MODAL_INVITE_COLLABORATORS_DISMISS_WITH_INVITE, POST_SAVE_UPSELL_INVITE_COLLABORATORS_DISMISS_WITH_INVITE, POST_SAVE_IMAGE_UPSELL_INVITE_COLLABORATORS_DISMISS_WITH_INVITE, GRID_PIN_LEVELING_GAP, GRID_PIN_LEVELING_GAP_150, GRID_PIN_LEVELING_GAP_FILLED, PIN_SUPPORTS_CLICKTHROUGH, SH_BOARD_ADVISORY_VIEW, SH_BOARD_SECTION_ADVISORY_VIEW, ALL_FILTERS_DESELECTED, PIN_REPIN_SUCCESS, BOARD_SHARE_VIDEO_EXPORT_ATTEMPTED, BOARD_SHARE_VIDEO_EXPORT_CODEC_CREATED, BOARD_SHARE_VIDEO_EXPORT_CODEC_FAILED, BOARD_SHARE_VIDEO_EXPORT_SUCCEEDED, END_SESSION_SUCCESS, END_SESSION_FAILURE, CONVERSATION_SETTINGS_VIEWED, CONVERSATION_NOTIFICATIONS_SET_ALWAYS_ON, CONVERSATION_NOTIFICATIONS_SET_MUTE_ONE_HOUR, CONVERSATION_NOTIFICATIONS_SET_MUTE_EIGHT_HOURS, CONVERSATION_NOTIFICATIONS_SET_MUTE_ONE_WEEK, CONVERSATION_NOTIFICATIONS_SET_MUTE_INDEFINITELY, UNAUTH_EX_PRELOAD_CONTROL, UNAUTH_EX_PRELOAD_ENABLED, MOVE_GOOGLE_LINK_SUCCESS, MOVE_GOOGLE_LINK_FAILURE, AD_DISCLOSURE_CLICKTHROUGH, EMAIL_OTP_VERIFICIATION_SUCCESS, EMAIL_OTP_VERIFICIATION_FAILURE, EMAIL_OTP_VERIFICATION_SUCCESS, EMAIL_OTP_VERIFICATION_FAILURE, PIN_CLOSEUP_BOARD_CONVERSATION_THREAD_MODULE, COMPLETE_EU_PROMPT, DISMISS_EU_PROMPT, PIN_SEE_MORE, PIN_SEE_MORE_UNDO, PIN_SEE_LESS, PIN_SEE_LESS_UNDO, STORY_SEE_MORE, STORY_SEE_MORE_UNDO, STORY_SEE_LESS, STORY_SEE_LESS_UNDO, WL_SUBMIT, NRT_AUTO_ORG_VIEW, NRT_AUTO_ORG_DISMISS, NRT_AUTO_ORG_TIMEOUT, NRT_AUTO_ORG_FAILURE, COLLAGE_CUTOUT_ITEM_CLICK, COLLAGE_CUTOUT_ITEM_CLICKTHROUGH, COLLAGE_CUTOUT_ITEM_CLICKTHROUGH_END, COLLAGE_CUTOUT_ITEM_SWIPE_LEFT, COLLAGE_CUTOUT_ITEM_SWIPE_RIGHT, COLLAGE_CUTOUT_DRAWER_OPEN, COLLAGE_CUTOUT_DRAWER_CLOSE, COLLAGE_CUTOUT_ITEM_VIEW, END_OF_FEED, COMPLIANCE_REQUIREMENTS_SUCCESS, COMPLIANCE_REQUIREMENTS_FAILURE, COMPLIANCE_REQUIREMENTS_TIMEOUT, COMPLIANCE_FEATURE_CHECK_NOT_LOADED, SHOPPING_SKELETON_FALSE_POSITIVE, SHOPPING_SKELETON_FALSE_NEGATIVE, FACEBOOK_HELP_CENTER_LINK, COLLAGE_QUICK_SWAP_CAROUSEL_SWAP, COLLAGE_QUICK_SWAP_CUTOUT_CAROUSEL_SWAP, AD_CLOSEUP_RP_VIEW, DL_AD_CLOSEUP_OVERLAY_IMPRESSION, DL_AD_CLOSEUP_OVERLAY_CLICKTHROUGH, DL_AD_CLOSEUP_OVERLAY_CLICKTHROUGH_END, SUBMIT_NEW_PASSWORD, REMOTE_PASSWORD_VALIDATION_SUCCESS, REMOTE_PASSWORD_VALIDATION_FAILURE, HANDSHAKE_ACCT_LINKING_SUCCESS, HANDSHAKE_ACCT_LINKING_FAILURE, HANDSHAKE_ACCT_UNLINKING_SUCCESS, HANDSHAKE_ACCT_UNLINKING_FAILURE, FULFILLED_BY_SEARCH_FEATURES, USER_SEARCH_ADVISORY, CLOSEUP_PIN_LOAD_CACHE_HIT, CLOSEUP_PIN_LOAD_CACHE_MISS, MQTT_CONNECTED_SUCCESS, MQTT_CONNECTED_FAILURE, MQTT_DISCONNECTED, MQTT_RECONNECTED, MQTT_MESSAGE_SENT, QR_AUTH_VERIFY_TOKEN, QR_AUTH_APPROVE, PIN_REP_EVENT_QUEUE_FALLBACK, PIN_REP_EVENT_QUEUE_INTERRUPTED, PIN_REP_EVENT_QUEUE_FULL, PIN_REP_EVENT_QUEUE_NULL, NETWORK_OFFLINE, NETWORK_ONLINE, QCM_PIN_IMPRESSION_ONE_PIEXAL, QCM_PIN_IMPRESSION_ONE_PIXEL, QCM_METADATA_CLICK, QCM_CTA_CLICK, CUSTOM_CHROME_TAB_ENGAGEMENT_SIGNAL, LOCAL_NOTIFICATION_SCHEDULE, LOCAL_NOTIFICATION_DELETE, LOCAL_NOTIFICATION_OPEN};
    }

    static {
        f1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new d1();
    }

    private f1(String str, int i13) {
    }

    public static final f1 findByValue(int i13) {
        Companion.getClass();
        return d1.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (e1.f66962a[ordinal()]) {
            case 1:
                return 13;
            case 2:
                return 1;
            case 3:
                return 7564;
            case 4:
                return 14564;
            case 5:
                return 2;
            case 6:
                return 3;
            case 7:
                return 5;
            case 8:
                return 12;
            case 9:
                return 8948;
            case 10:
                return 4101;
            case 11:
                return 14;
            case 12:
                return 16;
            case 13:
                return 18;
            case 14:
                return 14625;
            case 15:
                return RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE;
            case 16:
                return 9605;
            case 17:
                return 9612;
            case 18:
                return 9681;
            case 19:
                return 20;
            case 20:
                return 22;
            case 21:
                return 26;
            case 22:
                return 27;
            case 23:
                return 25;
            case 24:
                return 28;
            case 25:
                return 34;
            case 26:
                return 35;
            case 27:
                return 7172;
            case 28:
                return 7759;
            case 29:
                return 15145;
            case 30:
                return 40;
            case 31:
                return 41;
            case 32:
                return 42;
            case 33:
                return 44;
            case 34:
                return 45;
            case 35:
                return 46;
            case 36:
                return 48;
            case 37:
                return 7714;
            case 38:
                return 50;
            case 39:
                return 51;
            case 40:
                return 52;
            case 41:
                return 54;
            case 42:
                return 55;
            case 43:
                return 56;
            case 44:
                return 14679;
            case 45:
                return 8710;
            case 46:
                return 8711;
            case 47:
                return 8712;
            case 48:
                return 10500;
            case 49:
                return 7383;
            case 50:
                return 59;
            case 51:
                return 8210;
            case 52:
                return 60;
            case 53:
                return 61;
            case 54:
                return 62;
            case 55:
                return 63;
            case 56:
                return 64;
            case 57:
                return 9718;
            case 58:
                return 10096;
            case 59:
                return 16495;
            case 60:
                return 16496;
            case 61:
                return 81;
            case 62:
                return 82;
            case 63:
                return 87;
            case 64:
                return 93;
            case 65:
                return 7118;
            case 66:
                return 7119;
            case 67:
                return 7381;
            case 68:
                return 7382;
            case 69:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE;
            case 70:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE;
            case 71:
                return 9317;
            case 72:
                return 9318;
            case 73:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE;
            case 74:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE;
            case 75:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE;
            case 76:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID;
            case 77:
                return RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER;
            case 78:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE;
            case 79:
                return RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL;
            case 80:
                return 3828;
            case 81:
                return 6943;
            case 82:
                return 7070;
            case 83:
                return 7071;
            case 84:
                return 9315;
            case 85:
                return 9316;
            case 86:
                return 7472;
            case 87:
                return 8721;
            case 88:
                return 8722;
            case 89:
                return 14611;
            case 90:
                return 14612;
            case 91:
                return RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
            case 92:
                return RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL;
            case 93:
                return 9394;
            case 94:
                return 15454;
            case 95:
                return 15455;
            case 96:
                return RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL;
            case 97:
                return RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL;
            case 100:
                return RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                return 14925;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE /* 105 */:
                return RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
                return RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION;
            case RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER /* 107 */:
                return 16605;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE /* 108 */:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP;
            case RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL /* 109 */:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_DEFAULT_REP;
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL /* 110 */:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_STYLE_REP;
            case RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE /* 111 */:
                return 7160;
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER /* 112 */:
                return 7161;
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL /* 113 */:
                return 15818;
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER /* 114 */:
                return 8100;
            case RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE /* 115 */:
                return 8101;
            case RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW /* 116 */:
                return 8105;
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN /* 117 */:
                return 8151;
            case RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL /* 118 */:
                return 406;
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL /* 119 */:
                return 422;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL /* 120 */:
                return 408;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL /* 121 */:
                return 601;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN /* 122 */:
                return 602;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL /* 123 */:
                return 700;
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER /* 124 */:
                return 701;
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED /* 125 */:
                return 702;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL /* 126 */:
                return 801;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK /* 127 */:
                return 900;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN /* 128 */:
                return 901;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS /* 129 */:
                return 1012;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN /* 130 */:
                return 1013;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL /* 131 */:
                return 1017;
            case RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE /* 132 */:
                return 10352;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL /* 133 */:
                return 10353;
            case RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL /* 134 */:
                return 10354;
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL /* 135 */:
                return 2701;
            case RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL /* 136 */:
                return 2702;
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE /* 137 */:
                return 2716;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL /* 138 */:
                return 2900;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM /* 139 */:
                return 2901;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM /* 140 */:
                return 2905;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN /* 141 */:
                return 14563;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL /* 142 */:
                return 3400;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE /* 143 */:
                return 6905;
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM /* 144 */:
                return 14721;
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED /* 145 */:
                return 9273;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO /* 146 */:
                return 9661;
            case RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY /* 147 */:
                return 9662;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE /* 148 */:
                return 9663;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE /* 149 */:
                return 15270;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY /* 150 */:
                return 15271;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM /* 151 */:
                return 15722;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM /* 152 */:
                return 9406;
            case RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM /* 153 */:
                return 9408;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER /* 154 */:
                return 9409;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER /* 155 */:
                return 9682;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM /* 156 */:
                return 9683;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER /* 157 */:
                return 9684;
            case RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN /* 158 */:
                return 15870;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER /* 159 */:
                return 9542;
            case 160:
                return 15143;
            case RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER /* 161 */:
                return 15144;
            case RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER /* 162 */:
                return 10416;
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM /* 163 */:
                return 10417;
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING /* 164 */:
                return 10418;
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_CLEAR /* 165 */:
                return 9906;
            case RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE /* 166 */:
                return 14602;
            case RecyclerViewTypes.VIEW_TRY_ON_FEED_PRODUCT_CARD /* 167 */:
                return 14603;
            case RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION /* 168 */:
                return 14604;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SPOTLIGHT /* 169 */:
                return 14605;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE /* 170 */:
                return 10554;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO /* 171 */:
                return 16307;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE /* 172 */:
                return 16258;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO /* 173 */:
                return 16826;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN /* 174 */:
                return 16827;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO_FULL_SPAN /* 175 */:
                return 16828;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN /* 176 */:
                return 16829;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO_FULL_SPAN /* 177 */:
                return 16830;
            case RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD /* 178 */:
                return 16831;
            case RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD_FULL_SPAN /* 179 */:
                return 16832;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP /* 180 */:
                return 16833;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_NAVIGATION_REP /* 181 */:
                return 16834;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_DEFAULT_REP /* 182 */:
                return 16835;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_STYLE_REP /* 183 */:
                return 16836;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_REP /* 184 */:
                return 16837;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_GRID_REP /* 185 */:
                return 16920;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_TOPIC_TILE /* 186 */:
                return 16921;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_EDITORIAL_CARD /* 187 */:
                return 6353;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_EDITORIAL_CARD /* 188 */:
                return 6707;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_WITH_TITLE_OVERLAY /* 189 */:
                return 6716;
            case RecyclerViewTypes.VIEW_TYPE_ICON_AND_TEXT_INLINE_BUBBLE /* 190 */:
                return 7603;
            case RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO /* 191 */:
                return 7604;
            case RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY /* 192 */:
                return 16585;
            case RecyclerViewTypes.VIEW_TYPE_LENS_HISTORY /* 193 */:
                return 16586;
            case RecyclerViewTypes.VIEW_TYPE_OVERSCROLL_SEARCH_CELL /* 194 */:
                return 16316;
            case RecyclerViewTypes.VIEW_TYPE_USER /* 195 */:
                return 7606;
            case RecyclerViewTypes.VIEW_SHOP_THE_LOOK_CLOSEUP_MODULE /* 196 */:
                return 7607;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_HERO /* 197 */:
                return 8213;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_THREE_PINS_COLLECTION /* 198 */:
                return 8214;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_VIDEO /* 199 */:
                return 8215;
            case 200:
                return 8216;
            case 201:
                return 3600;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN /* 202 */:
                return 16053;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER /* 203 */:
                return 16054;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR /* 204 */:
                return 3606;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_HEADER /* 205 */:
                return 3667;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER /* 206 */:
                return 3621;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_FEED_FOOTER /* 207 */:
                return 3623;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION /* 208 */:
                return 6904;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_ARTICLE_BOARD_SECTION_HEADER /* 209 */:
                return 6906;
            case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_RELATED_ARTICLES_HEADER /* 210 */:
                return 7518;
            case RecyclerViewTypes.VIEW_TYPE_GO_TO_HOME_FEED_FOOTER /* 211 */:
                return 7519;
            case RecyclerViewTypes.VIEW_TYPE_SIMPLE_ACTION_STORY /* 212 */:
                return 7520;
            case RecyclerViewTypes.VIEW_TYPE_CONVERSATION_GIF_REACTION /* 213 */:
                return 7521;
            case RecyclerViewTypes.VIEW_TYPE_INBOX_HEADER /* 214 */:
                return 8786;
            case RecyclerViewTypes.VIEW_TYPE_BOARD_INVITE_HEADER /* 215 */:
                return 7684;
            case RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER /* 216 */:
                return 3700;
            case RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER /* 217 */:
                return 3703;
            case RecyclerViewTypes.VIEW_TYPE_STYLE_HEADER /* 218 */:
                return 3704;
            case RecyclerViewTypes.VIEW_TYPE_STYLE_DESCRIPTION /* 219 */:
                return 7188;
            case RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER /* 220 */:
                return 3803;
            case RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_DOUBLE /* 221 */:
                return 7573;
            case RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_SINGLE /* 222 */:
                return 8569;
            case RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE /* 223 */:
                return 9127;
            case RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL /* 224 */:
                return 10054;
            case RecyclerViewTypes.VIEW_TYPE_STORY_SELECT_OR_REORDER_PINS /* 225 */:
                return 14917;
            case RecyclerViewTypes.VIEW_TYPE_STORY_GROUP_MY_PINS /* 226 */:
                return 16248;
            case RecyclerViewTypes.VIEW_TYPE_VTO_BUBBLE_CONTAINER /* 227 */:
                return 3800;
            case RecyclerViewTypes.VIEW_TYPE_PROFILE_BOARDLESS_PINS_HEADER /* 228 */:
                return 3811;
            case RecyclerViewTypes.VIEW_TYPE_IN_LINE_VTO /* 229 */:
                return 3829;
            case RecyclerViewTypes.VIEW_TYPE_AFFILIATE_LINK_IMAGE /* 230 */:
                return 3832;
            case RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER /* 231 */:
                return 6940;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM /* 232 */:
                return 8152;
            case RecyclerViewTypes.VIEW_TYPE_SEARCH_BOARD_CELL /* 233 */:
                return 8153;
            case RecyclerViewTypes.VIEW_TYPE_SHARESHEET_APP /* 234 */:
                return 8788;
            case RecyclerViewTypes.VIEW_TYPE_SHARESHEET_CONTACT /* 235 */:
                return 8154;
            case RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_CARD /* 236 */:
                return 8155;
            case RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_LIST_ITEM /* 237 */:
                return 8156;
            case RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_BOARD_NAME_HEADER /* 238 */:
                return 8157;
            case RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL /* 239 */:
                return 8158;
            case RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM /* 240 */:
                return 8159;
            case RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPAGE_ITEM /* 241 */:
                return 8160;
            case RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPIN_ITEM /* 242 */:
                return 4074;
            case RecyclerViewTypes.VIEW_TYPE_BRAND_MULTI_IMAGE_REP_ITEM /* 243 */:
                return 4100;
            case RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION /* 244 */:
                return 8754;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP /* 245 */:
                return 14627;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_STACKED_COLLAGE_DISPLAY_CARD_REP /* 246 */:
                return 4104;
            case RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER /* 247 */:
                return 4105;
            case RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER /* 248 */:
                return 8900;
            case RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP /* 249 */:
                return 9073;
            case 250:
                return 9074;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE /* 251 */:
                return 15822;
            case RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN /* 252 */:
                return 9077;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER /* 253 */:
                return 9078;
            case RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN /* 254 */:
                return 9079;
            case 255:
                return 9080;
            case RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER /* 256 */:
                return 9081;
            case RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER /* 257 */:
                return 9082;
            case RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW /* 258 */:
                return 4110;
            case RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS /* 259 */:
                return 4111;
            case RecyclerViewTypes.VIEW_TYPE_PROTECTED_BOARD_HEADER /* 260 */:
                return 4113;
            case RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_ON_ENDLESS_SCROLL_HEADER /* 261 */:
                return 4503;
            case RecyclerViewTypes.VIEW_TYPE_PRODUCT_FILTER_DIVIDER /* 262 */:
                return 4700;
            case RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_BOARDS /* 263 */:
                return 4701;
            case RecyclerViewTypes.VIEW_TYPE_ATG_VISUALIZATION_BANNER /* 264 */:
                return 4702;
            case RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO /* 265 */:
                return 4703;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_GRID /* 266 */:
                return 6566;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_CARD /* 267 */:
                return 6567;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_THUMBNAIL /* 268 */:
                return 6568;
            case RecyclerViewTypes.VIEW_TYPE_FILTER_REMOVAL_BUTTON /* 269 */:
                return 6570;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF /* 270 */:
                return 6571;
            case RecyclerViewTypes.VIEW_TYPE_BOARD_CONVERSATION_THREAD /* 271 */:
                return 7076;
            case RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO_AD_EXCLUDE /* 272 */:
                return 7078;
            case RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS_AD_EXCLUDE /* 273 */:
                return 6923;
            case RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_VIDEO_AD_EXCLUDE /* 274 */:
                return 6938;
            case RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_AD_EXCLUDE /* 275 */:
                return 7000;
            case RecyclerViewTypes.VIEW_TYPE_PIN_VIDEO_AD_EXCLUDE /* 276 */:
                return 7060;
            case RecyclerViewTypes.VIEW_TYPE_PIN_AD_EXCLUDE /* 277 */:
                return 7064;
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN_AD_EXCLUDE /* 278 */:
                return 7065;
            case RecyclerViewTypes.VIEW_TYPE_SHUFFLE_CAROUSEL /* 279 */:
                return 7069;
            case RecyclerViewTypes.VIEW_TYPE_PIN_WEBVIEW_AD /* 280 */:
                return 7100;
            case 281:
                return 7101;
            case 282:
                return 7102;
            case 283:
                return 7158;
            case 284:
                return 7173;
            case 285:
                return 8606;
            case 286:
                return 7122;
            case 287:
                return 7133;
            case 288:
                return 7301;
            case 289:
                return 14667;
            case 290:
                return 7108;
            case 291:
                return 7109;
            case 292:
                return 7111;
            case 293:
                return 7114;
            case 294:
                return 7946;
            case 295:
                return 7120;
            case 296:
                return 7137;
            case 297:
                return 7579;
            case 298:
                return 7350;
            case 299:
                return 7352;
            case AdSize.MEDIUM_RECTANGLE_WIDTH /* 300 */:
                return 7362;
            case wb.W0 /* 301 */:
                return 7379;
            case wb.X0 /* 302 */:
                return 7435;
            case 303:
                return 7436;
            case 304:
                return 7438;
            case 305:
                return 7528;
            case 306:
                return 7492;
            case 307:
                return 7493;
            case 308:
                return 7511;
            case 309:
                return 7512;
            case 310:
                return 9700;
            case 311:
                return 9701;
            case 312:
                return 9702;
            case 313:
                return 9703;
            case 314:
                return 9704;
            case 315:
                return 9705;
            case 316:
                return 9706;
            case 317:
                return 9707;
            case 318:
                return 9708;
            case 319:
                return 9987;
            case 320:
                return 9988;
            case 321:
                return 9989;
            case 322:
                return 7574;
            case 323:
                return 7588;
            case 324:
                return 7590;
            case 325:
                return 8787;
            case 326:
                return 8789;
            case 327:
                return 7726;
            case 328:
                return 9454;
            case 329:
                return 15054;
            case 330:
                return 7883;
            case 331:
                return 8877;
            case 332:
                return 7884;
            case 333:
                return 8839;
            case 334:
                return 8950;
            case 335:
                return 8980;
            case 336:
                return 8981;
            case 337:
                return 9030;
            case 338:
                return 9031;
            case 339:
                return 9032;
            case 340:
                return 9033;
            case 341:
                return 9083;
            case 342:
                return 9226;
            case 343:
                return 9227;
            case 344:
                return 9228;
            case 345:
                return 9229;
            case 346:
                return 9834;
            case 347:
                return 17173;
            case 348:
                return 17174;
            case 349:
                return 17175;
            case 350:
                return 9361;
            case 351:
                return 9362;
            case 352:
                return 9363;
            case 353:
                return 9364;
            case 354:
                return 9365;
            case 355:
                return 9366;
            case 356:
                return 9565;
            case 357:
                return 9566;
            case 358:
                return 9504;
            case 359:
                return 9903;
            case 360:
                return 9904;
            case 361:
                return 7715;
            case 362:
                return 7716;
            case 363:
                return 7598;
            case 364:
                return 7760;
            case 365:
                return 7761;
            case 366:
                return 7762;
            case 367:
                return 7777;
            case 368:
                return 7843;
            case 369:
                return 8540;
            case 370:
                return 8617;
            case 371:
                return 7804;
            case 372:
                return 7806;
            case 373:
                return 10363;
            case 374:
                return 10367;
            case 375:
                return 10368;
            case 376:
                return 10369;
            case 377:
                return 10370;
            case 378:
                return 14592;
            case 379:
                return 14593;
            case 380:
                return 14594;
            case 381:
                return 14595;
            case 382:
                return 8631;
            case 383:
                return 8112;
            case 384:
                return 8212;
            case 385:
                return 8222;
            case 386:
                return 8319;
            case 387:
                return 8528;
            case 388:
                return 8363;
            case 389:
                return 9535;
            case 390:
                return 8379;
            case 391:
                return 8380;
            case 392:
                return 8433;
            case 393:
                return 9034;
            case 394:
                return 9838;
            case 395:
                return 9839;
            case 396:
                return 9840;
            case 397:
                return 9841;
            case 398:
                return 9843;
            case 399:
                return 9844;
            case 400:
                return 9845;
            case 401:
                return 8519;
            case 402:
                return 8520;
            case 403:
                return 8521;
            case 404:
                return 8522;
            case 405:
                return 8570;
            case 406:
                return 8571;
            case 407:
                return 8572;
            case 408:
                return 8573;
            case 409:
                return 8608;
            case 410:
                return 8780;
            case 411:
                return 8781;
            case 412:
                return 8784;
            case 413:
                return 8785;
            case 414:
                return 15748;
            case 415:
                return 8841;
            case 416:
                return 8905;
            case 417:
                return 8906;
            case 418:
                return 8907;
            case 419:
                return 8908;
            case 420:
                return 8909;
            case 421:
                return 8999;
            case 422:
                return 8983;
            case 423:
                return 8984;
            case 424:
                return 8985;
            case 425:
                return 8986;
            case 426:
                return 9068;
            case 427:
                return 9093;
            case 428:
                return 9099;
            case 429:
                return 9100;
            case 430:
                return 9251;
            case 431:
                return 9285;
            case 432:
                return 9949;
            case 433:
                return 10364;
            case 434:
                return 9252;
            case 435:
                return 9314;
            case 436:
                return 9323;
            case 437:
                return 9324;
            case 438:
                return 10030;
            case 439:
                return 14628;
            case 440:
                return 14629;
            case 441:
                return 9355;
            case 442:
                return 9371;
            case 443:
                return 9527;
            case 444:
                return 9528;
            case 445:
                return 9529;
            case 446:
                return 9530;
            case 447:
                return 9533;
            case 448:
                return 9569;
            case 449:
                return 10104;
            case 450:
                return 9609;
            case 451:
                return 9610;
            case 452:
                return 10039;
            case 453:
                return 10040;
            case 454:
                return 10041;
            case 455:
                return 9690;
            case 456:
                return 9848;
            case 457:
                return 9849;
            case 458:
                return 14703;
            case 459:
                return 10031;
            case 460:
                return 9972;
            case 461:
                return 9973;
            case 462:
                return 9993;
            case 463:
                return 9990;
            case 464:
                return 9991;
            case 465:
                return 9992;
            case 466:
                return 10247;
            case 467:
                return 10246;
            case AdSize.FULL_BANNER_WIDTH /* 468 */:
                return 10064;
            case 469:
                return 10065;
            case 470:
                return 10087;
            case 471:
                return 10088;
            case 472:
                return 10089;
            case 473:
                return 10101;
            case 474:
                return 10102;
            case 475:
                return 10239;
            case 476:
                return 14574;
            case 477:
                return 14575;
            case 478:
                return 10241;
            case 479:
                return 10436;
            case 480:
                return 10437;
            case 481:
                return 10438;
            case 482:
                return 10476;
            case 483:
                return 10458;
            case 484:
                return 10459;
            case 485:
                return 10460;
            case 486:
                return 10461;
            case 487:
                return 10462;
            case 488:
                return 10463;
            case 489:
                return 10464;
            case 490:
                return 10465;
            case 491:
                return 10466;
            case 492:
                return 10467;
            case 493:
                return 10469;
            case 494:
                return 10470;
            case 495:
                return 10471;
            case 496:
                return 10472;
            case 497:
                return 10473;
            case 498:
                return 10559;
            case 499:
                return 10560;
            case 500:
                return 14626;
            case 501:
                return 10485;
            case 502:
                return 10486;
            case 503:
                return 10487;
            case 504:
                return 10488;
            case 505:
                return 10491;
            case 506:
                return 16928;
            case 507:
                return 16929;
            case 508:
                return 16930;
            case 509:
                return 16931;
            case 510:
                return 16932;
            case 511:
                return 16933;
            case BitmapUtils.BITMAP_TO_JPEG_SIZE /* 512 */:
                return 16934;
            case 513:
                return 16935;
            case 514:
                return 16936;
            case 515:
                return 16937;
            case 516:
                return 16938;
            case 517:
                return 16939;
            case 518:
                return 16940;
            case 519:
                return 16941;
            case 520:
                return 16942;
            case 521:
                return 16943;
            case 522:
                return 16944;
            case 523:
                return 16945;
            case 524:
                return 16946;
            case 525:
                return 16947;
            case 526:
                return 16948;
            case 527:
                return 16949;
            case 528:
                return 16950;
            case 529:
                return 16951;
            case 530:
                return 16952;
            case 531:
                return 16953;
            case 532:
                return 16954;
            case 533:
                return 16955;
            case 534:
                return 16956;
            case 535:
                return 16957;
            case 536:
                return 16958;
            case 537:
                return 16959;
            case 538:
                return 16960;
            case 539:
                return 16961;
            case 540:
                return 14565;
            case 541:
                return 14567;
            case 542:
                return 15165;
            case 543:
                return 14568;
            case 544:
                return 14569;
            case 545:
                return 14570;
            case 546:
                return 14571;
            case 547:
                return 14572;
            case 548:
                return 14573;
            case 549:
                return 14606;
            case 550:
                return 15497;
            case 551:
                return 14588;
            case 552:
                return 14589;
            case 553:
                return 14590;
            case 554:
                return 14591;
            case 555:
                return 14660;
            case 556:
                return 14661;
            case 557:
                return 15423;
            case 558:
                return 15424;
            case 559:
                return 14596;
            case 560:
                return 14597;
            case 561:
                return 14598;
            case 562:
                return 14599;
            case 563:
                return 14600;
            case 564:
                return 14601;
            case 565:
                return 14615;
            case 566:
                return 14616;
            case 567:
                return 16263;
            case 568:
                return 16264;
            case 569:
                return 14630;
            case 570:
                return 16270;
            case 571:
                return 16269;
            case 572:
                return 14651;
            case 573:
                return 14652;
            case 574:
                return 14653;
            case 575:
                return 14654;
            case 576:
                return 14655;
            case 577:
                return 14656;
            case 578:
                return 14657;
            case 579:
                return 14658;
            case 580:
                return 16446;
            case 581:
                return 17189;
            case 582:
                return 17190;
            case 583:
                return 16606;
            case 584:
                return 16607;
            case 585:
                return 16608;
            case 586:
                return 16609;
            case 587:
                return 16610;
            case 588:
                return 16611;
            case 589:
                return 15425;
            case 590:
                return 15426;
            case 591:
                return 15484;
            case 592:
                return 15485;
            case 593:
                return 15486;
            case 594:
                return 17021;
            case 595:
                return 17022;
            case 596:
                return 17166;
            case 597:
                return 17176;
            case 598:
                return 15873;
            case 599:
                return 14704;
            case AdSize.WIDE_SKYSCRAPER_HEIGHT /* 600 */:
                return 16267;
            case 601:
                return 16268;
            case 602:
                return 14722;
            case 603:
                return 14723;
            case 604:
                return 14858;
            case 605:
                return 14860;
            case 606:
                return 14861;
            case 607:
                return 14862;
            case 608:
                return 14863;
            case 609:
                return 14864;
            case 610:
                return 14865;
            case 611:
                return 14866;
            case 612:
                return 14876;
            case 613:
                return 14887;
            case 614:
                return 15821;
            case 615:
                return 14888;
            case 616:
                return 14892;
            case 617:
                return 14893;
            case 618:
                return 14895;
            case 619:
                return 14896;
            case 620:
                return 14989;
            case 621:
                return 15453;
            case 622:
                return 15461;
            case 623:
                return 15875;
            case 624:
                return 15876;
            case 625:
                return 15074;
            case 626:
                return 15075;
            case 627:
                return 15122;
            case 628:
                return 15123;
            case 629:
                return 15125;
            case 630:
                return 16616;
            case 631:
                return 16617;
            case 632:
                return 15138;
            case 633:
                return 15139;
            case 634:
                return 15140;
            case 635:
                return 15141;
            case 636:
                return 15142;
            case 637:
                return 15146;
            case 638:
                return 15251;
            case 639:
                return 15359;
            case 640:
                return 15365;
            case 641:
                return 15559;
            case 642:
                return 15592;
            case 643:
                return 15809;
            case 644:
                return 16312;
            case 645:
                return 16431;
            case 646:
                return 16432;
            case 647:
                return 16447;
            case 648:
                return 16893;
            case 649:
                return 16894;
            case 650:
                return 17186;
            case 651:
                return 17187;
            case 652:
                return 17188;
            case 653:
                return 16683;
            case 654:
                return 15262;
            case 655:
                return 15288;
            case 656:
                return 15289;
            case 657:
                return 15339;
            case 658:
                return 15392;
            case 659:
                return 15393;
            case 660:
                return 15394;
            case 661:
                return 15395;
            case 662:
                return 15396;
            case 663:
                return 15397;
            case 664:
                return 15398;
            case 665:
                return 16291;
            case 666:
                return 16292;
            case 667:
                return 16481;
            case 668:
                return 16482;
            case 669:
                return 16483;
            case 670:
                return 16484;
            case 671:
                return 16485;
            case 672:
                return 16486;
            case 673:
                return 15377;
            case 674:
                return 15378;
            case 675:
                return 15405;
            case 676:
                return 15407;
            case 677:
                return 15408;
            case 678:
                return 15823;
            case 679:
                return 15816;
            case 680:
                return 15536;
            case 681:
                return 15549;
            case 682:
                return 15550;
            case 683:
                return 15553;
            case 684:
                return 15646;
            case 685:
                return 15658;
            case 686:
                return 15659;
            case 687:
                return 15660;
            case 688:
                return 15661;
            case 689:
                return 15745;
            case 690:
                return 15746;
            case 691:
                return 15810;
            case 692:
                return 15811;
            case 693:
                return 15812;
            case 694:
                return 15813;
            case 695:
                return 15814;
            case 696:
                return 15815;
            case 697:
                return 16244;
            case 698:
                return 16245;
            case 699:
                return 16246;
            case 700:
                return 16247;
            case 701:
                return 16260;
            case 702:
                return 16282;
            case 703:
                return 16283;
            case 704:
                return 16284;
            case 705:
                return 16285;
            case 706:
                return 16303;
            case 707:
                return 16434;
            case 708:
                return 16445;
            case 709:
                return 16487;
            case 710:
                return 16488;
            case 711:
                return 16540;
            case 712:
                return 16541;
            case 713:
                return 16489;
            case 714:
                return 16490;
            case 715:
                return 16491;
            case 716:
                return 16492;
            case 717:
                return 16493;
            case 718:
                return 16498;
            case 719:
                return 16499;
            case 720:
                return 16500;
            case 721:
                return 17004;
            case 722:
                return 16542;
            case 723:
                return 16543;
            case 724:
                return 16544;
            case 725:
                return 16545;
            case 726:
                return 16546;
            case 727:
                return 16547;
            case AdSize.LEADERBOARD_WIDTH /* 728 */:
                return 16548;
            case 729:
                return 16601;
            case 730:
                return 16567;
            case 731:
                return 16679;
            case 732:
                return 16680;
            case 733:
                return 16681;
            case 734:
                return 16682;
            case 735:
                return 16613;
            case 736:
                return 16614;
            case 737:
                return 16612;
            case 738:
                return 16673;
            case 739:
                return 16674;
            case 740:
                return 16684;
            case 741:
                return 16685;
            case 742:
                return 16686;
            case 743:
                return 16687;
            case 744:
                return 16896;
            case 745:
                return 16897;
            case 746:
                return 16898;
            case 747:
                return 16761;
            case 748:
                return 16762;
            case 749:
                return 16763;
            case 750:
                return 16764;
            case 751:
                return 16760;
            case 752:
                return 16766;
            case 753:
                return 16820;
            case 754:
                return 16821;
            case 755:
                return 16899;
            case 756:
                return 16900;
            case 757:
                return 16901;
            case 758:
                return 16902;
            case 759:
                return 16903;
            case 760:
                return 16913;
            case 761:
                return 16914;
            case 762:
                return 16962;
            case 763:
                return 16963;
            case 764:
                return 16964;
            case 765:
                return 16999;
            case 766:
                return 16965;
            case 767:
                return 16966;
            case 768:
                return 16998;
            case 769:
                return 17041;
            case 770:
                return 17171;
            case 771:
                return 17172;
            case 772:
                return 17170;
            case 773:
                return 17178;
            case 774:
                return 17179;
            case 775:
                return 17180;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
