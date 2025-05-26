package s92;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class i extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;

    @NotNull
    public static final g Companion;
    public static final i HOME_FEED_RENDER = new i("HOME_FEED_RENDER", 0);
    public static final i SEARCH_FEED_RENDER = new i("SEARCH_FEED_RENDER", 1);
    public static final i SEARCH_PROFILES_FEED_RENDER = new i("SEARCH_PROFILES_FEED_RENDER", 2);
    public static final i PIN_CLOSEUP = new i("PIN_CLOSEUP", 3);
    public static final i GRID_IMG_PLACE_HOLDER = new i("GRID_IMG_PLACE_HOLDER", 4);
    public static final i GRID_BOTTOM_SPINNER = new i("GRID_BOTTOM_SPINNER", 5);
    public static final i PIN_CLOSEUP_DETAILS = new i("PIN_CLOSEUP_DETAILS", 6);
    public static final i OWN_PROFILE = new i("OWN_PROFILE", 7);
    public static final i OTHER_PROFILE = new i("OTHER_PROFILE", 8);
    public static final i BOARD_PICKER = new i("BOARD_PICKER", 9);
    public static final i WEBVIEW_PAGELOAD = new i("WEBVIEW_PAGELOAD", 10);
    public static final i PINCH_TO_ZOOM_FEED_RENDER = new i("PINCH_TO_ZOOM_FEED_RENDER", 11);
    public static final i FLASHLIGHT_FEED_RENDER = new i("FLASHLIGHT_FEED_RENDER", 12);
    public static final i LENS_FEED_RENDER = new i("LENS_FEED_RENDER", 13);
    public static final i SEARCH_TAB_RENDER = new i("SEARCH_TAB_RENDER", 14);
    public static final i BUSINESS_HUB = new i("BUSINESS_HUB", 15);
    public static final i FEED_VIDEO_PIN_LOAD = new i("FEED_VIDEO_PIN_LOAD", 16);
    public static final i APP_INIT = new i("APP_INIT", 17);
    public static final i FOLLOWED_USERS_FETCH = new i("FOLLOWED_USERS_FETCH", 18);
    public static final i FOLLOWED_USER_EDIT = new i("FOLLOWED_USER_EDIT", 19);
    public static final i HOME_FEED_LOAD_AND_RENDER = new i("HOME_FEED_LOAD_AND_RENDER", 20);
    public static final i YOUR_SHOP_FEED_RENDER = new i("YOUR_SHOP_FEED_RENDER", 21);
    public static final i PRODUCT_DETAILS_RENDER = new i("PRODUCT_DETAILS_RENDER", 22);
    public static final i PRODUCT_DETAILS_PLUS_RENDER = new i("PRODUCT_DETAILS_PLUS_RENDER", 23);
    public static final i ALL_PINS = new i("ALL_PINS", 24);
    public static final i VISUAL_SEARCH_PAGE_RENDER = new i("VISUAL_SEARCH_PAGE_RENDER", 25);
    public static final i OWN_PROFILE_NO_PINS = new i("OWN_PROFILE_NO_PINS", 26);
    public static final i OTHER_PROFILE_NO_PINS = new i("OTHER_PROFILE_NO_PINS", 27);
    public static final i SELF_PROFILE = new i("SELF_PROFILE", 28);
    public static final i FEED_RENDER = new i("FEED_RENDER", 29);
    public static final i NUX_PIN_PICKER_FEED_RENDER = new i("NUX_PIN_PICKER_FEED_RENDER", 30);
    public static final i RELATED_MODULES = new i("RELATED_MODULES", 31);
    public static final i RELATED_FEED = new i("RELATED_FEED", 32);
    public static final i AUTOCOMPLETE_RENDER = new i("AUTOCOMPLETE_RENDER", 33);
    public static final i OTHER_PROFILE_PAGE_LOAD = new i("OTHER_PROFILE_PAGE_LOAD", 34);
    public static final i OWN_PROFILE_PAGE_LOAD = new i("OWN_PROFILE_PAGE_LOAD", 35);
    public static final i OTHER_PROFILE_NO_PINS_PAGE_LOAD = new i("OTHER_PROFILE_NO_PINS_PAGE_LOAD", 36);
    public static final i OWN_PROFILE_NO_PINS_PAGE_LOAD = new i("OWN_PROFILE_NO_PINS_PAGE_LOAD", 37);
    public static final i SELF_PROFILE_PAGE_LOAD = new i("SELF_PROFILE_PAGE_LOAD", 38);
    public static final i STERLING_BULKEDITOR_HISTORY_PAGELOAD = new i("STERLING_BULKEDITOR_HISTORY_PAGELOAD", 39);
    public static final i STERLING_BULKEDITOR_HISTORY_USER_NAV = new i("STERLING_BULKEDITOR_HISTORY_USER_NAV", 40);
    public static final i CWV_PIN_CLOSEUP_CLS = new i("CWV_PIN_CLOSEUP_CLS", 41);
    public static final i CWV_BOARD_CLS = new i("CWV_BOARD_CLS", 42);
    public static final i CWV_PROFILE_CLS = new i("CWV_PROFILE_CLS", 43);
    public static final i CWV_TOPIC_CLS = new i("CWV_TOPIC_CLS", 44);
    public static final i BIZHUB_PAGE_RENDER = new i("BIZHUB_PAGE_RENDER", 45);
    public static final i STORY_PIN_CLOSEUP = new i("STORY_PIN_CLOSEUP", 46);
    public static final i STORY_PIN_STEP = new i("STORY_PIN_STEP", 47);
    public static final i STORY_PIN_PUBLISH = new i("STORY_PIN_PUBLISH", 48);
    public static final i IDEA_PIN_RENDER = new i("IDEA_PIN_RENDER", 49);
    public static final i STATIC_IMAGE_IDEA_PIN_CLOSEUP = new i("STATIC_IMAGE_IDEA_PIN_CLOSEUP", 50);
    public static final i IDEA_PIN_ASSET_TO_NEXT_PAGE = new i("IDEA_PIN_ASSET_TO_NEXT_PAGE", 51);
    public static final i IDEA_PIN_MEDIA_LOAD = new i("IDEA_PIN_MEDIA_LOAD", 52);

    private static final /* synthetic */ i[] $values() {
        return new i[]{HOME_FEED_RENDER, SEARCH_FEED_RENDER, SEARCH_PROFILES_FEED_RENDER, PIN_CLOSEUP, GRID_IMG_PLACE_HOLDER, GRID_BOTTOM_SPINNER, PIN_CLOSEUP_DETAILS, OWN_PROFILE, OTHER_PROFILE, BOARD_PICKER, WEBVIEW_PAGELOAD, PINCH_TO_ZOOM_FEED_RENDER, FLASHLIGHT_FEED_RENDER, LENS_FEED_RENDER, SEARCH_TAB_RENDER, BUSINESS_HUB, FEED_VIDEO_PIN_LOAD, APP_INIT, FOLLOWED_USERS_FETCH, FOLLOWED_USER_EDIT, HOME_FEED_LOAD_AND_RENDER, YOUR_SHOP_FEED_RENDER, PRODUCT_DETAILS_RENDER, PRODUCT_DETAILS_PLUS_RENDER, ALL_PINS, VISUAL_SEARCH_PAGE_RENDER, OWN_PROFILE_NO_PINS, OTHER_PROFILE_NO_PINS, SELF_PROFILE, FEED_RENDER, NUX_PIN_PICKER_FEED_RENDER, RELATED_MODULES, RELATED_FEED, AUTOCOMPLETE_RENDER, OTHER_PROFILE_PAGE_LOAD, OWN_PROFILE_PAGE_LOAD, OTHER_PROFILE_NO_PINS_PAGE_LOAD, OWN_PROFILE_NO_PINS_PAGE_LOAD, SELF_PROFILE_PAGE_LOAD, STERLING_BULKEDITOR_HISTORY_PAGELOAD, STERLING_BULKEDITOR_HISTORY_USER_NAV, CWV_PIN_CLOSEUP_CLS, CWV_BOARD_CLS, CWV_PROFILE_CLS, CWV_TOPIC_CLS, BIZHUB_PAGE_RENDER, STORY_PIN_CLOSEUP, STORY_PIN_STEP, STORY_PIN_PUBLISH, IDEA_PIN_RENDER, STATIC_IMAGE_IDEA_PIN_CLOSEUP, IDEA_PIN_ASSET_TO_NEXT_PAGE, IDEA_PIN_MEDIA_LOAD};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new g();
    }

    private i(String str, int i13) {
        super(str, i13);
    }

    public static final i findByValue(int i13) {
        Companion.getClass();
        if (i13 == 2) {
            return HOME_FEED_RENDER;
        }
        if (i13 == 3) {
            return SEARCH_FEED_RENDER;
        }
        if (i13 == 4) {
            return PIN_CLOSEUP;
        }
        if (i13 == 25) {
            return SEARCH_TAB_RENDER;
        }
        if (i13 == 26) {
            return BUSINESS_HUB;
        }
        if (i13 == 231) {
            return STERLING_BULKEDITOR_HISTORY_PAGELOAD;
        }
        if (i13 == 232) {
            return STERLING_BULKEDITOR_HISTORY_USER_NAV;
        }
        switch (i13) {
            case 11:
                return GRID_IMG_PLACE_HOLDER;
            case 12:
                return GRID_BOTTOM_SPINNER;
            case 13:
                return PIN_CLOSEUP_DETAILS;
            case 14:
                return OWN_PROFILE;
            case 15:
                return OTHER_PROFILE;
            case 16:
                return BOARD_PICKER;
            default:
                if (i13 == 18) {
                    return WEBVIEW_PAGELOAD;
                }
                if (i13 == 41) {
                    return ALL_PINS;
                }
                if (i13 == 608) {
                    return BIZHUB_PAGE_RENDER;
                }
                switch (i13) {
                    case 30:
                        return FEED_VIDEO_PIN_LOAD;
                    case 31:
                        return APP_INIT;
                    case 32:
                        return FOLLOWED_USERS_FETCH;
                    case 33:
                        return FOLLOWED_USER_EDIT;
                    case 34:
                        return SEARCH_PROFILES_FEED_RENDER;
                    case 35:
                        return HOME_FEED_LOAD_AND_RENDER;
                    case 36:
                        return YOUR_SHOP_FEED_RENDER;
                    case 37:
                        return PRODUCT_DETAILS_RENDER;
                    case 38:
                        return PRODUCT_DETAILS_PLUS_RENDER;
                    default:
                        switch (i13) {
                            case 21:
                                return PINCH_TO_ZOOM_FEED_RENDER;
                            case 22:
                                return FLASHLIGHT_FEED_RENDER;
                            case 23:
                                return LENS_FEED_RENDER;
                            default:
                                switch (i13) {
                                    case 44:
                                        return VISUAL_SEARCH_PAGE_RENDER;
                                    case 45:
                                        return OWN_PROFILE_NO_PINS;
                                    case 46:
                                        return OTHER_PROFILE_NO_PINS;
                                    case 47:
                                        return SELF_PROFILE;
                                    case 48:
                                        return FEED_RENDER;
                                    case 49:
                                        return NUX_PIN_PICKER_FEED_RENDER;
                                    case 50:
                                        return RELATED_MODULES;
                                    case 51:
                                        return RELATED_FEED;
                                    case 52:
                                        return AUTOCOMPLETE_RENDER;
                                    default:
                                        switch (i13) {
                                            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN /* 122 */:
                                                return OTHER_PROFILE_PAGE_LOAD;
                                            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL /* 123 */:
                                                return OWN_PROFILE_PAGE_LOAD;
                                            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER /* 124 */:
                                                return OTHER_PROFILE_NO_PINS_PAGE_LOAD;
                                            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED /* 125 */:
                                                return OWN_PROFILE_NO_PINS_PAGE_LOAD;
                                            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL /* 126 */:
                                                return SELF_PROFILE_PAGE_LOAD;
                                            default:
                                                switch (i13) {
                                                    case 526:
                                                        return CWV_PIN_CLOSEUP_CLS;
                                                    case 527:
                                                        return CWV_BOARD_CLS;
                                                    case 528:
                                                        return CWV_PROFILE_CLS;
                                                    case 529:
                                                        return CWV_TOPIC_CLS;
                                                    default:
                                                        switch (i13) {
                                                            case 700:
                                                                return STORY_PIN_CLOSEUP;
                                                            case 701:
                                                                return STORY_PIN_STEP;
                                                            case 702:
                                                                return STORY_PIN_PUBLISH;
                                                            case 703:
                                                                return IDEA_PIN_RENDER;
                                                            case 704:
                                                                return STATIC_IMAGE_IDEA_PIN_CLOSEUP;
                                                            case 705:
                                                                return IDEA_PIN_ASSET_TO_NEXT_PAGE;
                                                            case 706:
                                                                return IDEA_PIN_MEDIA_LOAD;
                                                            default:
                                                                return null;
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (h.f112110a[ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 34;
            case 4:
                return 4;
            case 5:
                return 11;
            case 6:
                return 12;
            case 7:
                return 13;
            case 8:
                return 14;
            case 9:
                return 15;
            case 10:
                return 16;
            case 11:
                return 18;
            case 12:
                return 21;
            case 13:
                return 22;
            case 14:
                return 23;
            case 15:
                return 25;
            case 16:
                return 26;
            case 17:
                return 30;
            case 18:
                return 31;
            case 19:
                return 32;
            case 20:
                return 33;
            case 21:
                return 35;
            case 22:
                return 36;
            case 23:
                return 37;
            case 24:
                return 38;
            case 25:
                return 41;
            case 26:
                return 44;
            case 27:
                return 45;
            case 28:
                return 46;
            case 29:
                return 47;
            case 30:
                return 48;
            case 31:
                return 49;
            case 32:
                return 50;
            case 33:
                return 51;
            case 34:
                return 52;
            case 35:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN;
            case 36:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL;
            case 37:
                return RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER;
            case 38:
                return RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED;
            case 39:
                return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL;
            case 40:
                return RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER;
            case 41:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM;
            case 42:
                return 526;
            case 43:
                return 527;
            case 44:
                return 528;
            case 45:
                return 529;
            case 46:
                return 608;
            case 47:
                return 700;
            case 48:
                return 701;
            case 49:
                return 702;
            case 50:
                return 703;
            case 51:
                return 704;
            case 52:
                return 705;
            case 53:
                return 706;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
