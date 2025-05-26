package ou1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    public static final d Companion;

    @NotNull
    private final String value;
    public static final e UNKNOWN = new e("UNKNOWN", 0, "");
    public static final e ALL_PINS_PLUS_BUTTON = new e("ALL_PINS_PLUS_BUTTON", 1, "all_pins_plus_button");
    public static final e ANALYTICS = new e("ANALYTICS", 2, "analytics_page");
    public static final e BOARD_PLUS_BUTTON = new e("BOARD_PLUS_BUTTON", 3, "board_plus_button");
    public static final e DEEPLINK = new e("DEEPLINK", 4, "deeplink");
    public static final e HF_CREATOR_CAROUSEL = new e("HF_CREATOR_CAROUSEL", 5, "hf_creator_carousel");
    public static final e NAVBAR_PLUS_BUTTON = new e("NAVBAR_PLUS_BUTTON", 6, "navbar_plus_button");
    public static final e PROFILE_PLUS_BUTTON = new e("PROFILE_PLUS_BUTTON", 7, "profile_plus_button");
    public static final e PROFILE_CREATED_TAB = new e("PROFILE_CREATED_TAB", 8, "profile_created_tab");
    public static final e CLOSEUP_UPSELL = new e("CLOSEUP_UPSELL", 9, "closeup_upsell");
    public static final e BUSINESS_HUB_UPSELL = new e("BUSINESS_HUB_UPSELL", 10, "business_hub_upsell");
    public static final e BUSINESS_ONBOARDING = new e("BUSINESS_ONBOARDING", 11, "business_onboarding_page");
    public static final e UPLOAD_ERROR_DIALOG = new e("UPLOAD_ERROR_DIALOG", 12, "upload_error_dialog");
    public static final e IDEA_STREAM_END_CARD = new e("IDEA_STREAM_END_CARD", 13, "idea_stream_end_card");
    public static final e PIN_EDIT_MODAL = new e("PIN_EDIT_MODAL", 14, "pin_edit_modal");
    public static final e CTC_PAGE_ADD_RESPONSE_BUTTON = new e("CTC_PAGE_ADD_RESPONSE_BUTTON", 15, "call_to_create_page");
    public static final e CTC_CLOSEUP_ADD_RESPONSE_BUTTON = new e("CTC_CLOSEUP_ADD_RESPONSE_BUTTON", 16, "call_to_create_closeup");
    public static final e VIDEO_TO_SP_REDIRECT = new e("VIDEO_TO_SP_REDIRECT", 17, "video_sp_redirect");
    public static final e CREATOR_HUB_TOOLS = new e("CREATOR_HUB_TOOLS", 18, "creator_hub_button");
    public static final e CREATOR_PATHWAYS_CREATE_BUTTON = new e("CREATOR_PATHWAYS_CREATE_BUTTON", 19, "creator_pathways_create_button");
    public static final e SCHEDULED_PIN_FEED = new e("SCHEDULED_PIN_FEED", 20, "scheduled_pin_feed");

    private static final /* synthetic */ e[] $values() {
        return new e[]{UNKNOWN, ALL_PINS_PLUS_BUTTON, ANALYTICS, BOARD_PLUS_BUTTON, DEEPLINK, HF_CREATOR_CAROUSEL, NAVBAR_PLUS_BUTTON, PROFILE_PLUS_BUTTON, PROFILE_CREATED_TAB, CLOSEUP_UPSELL, BUSINESS_HUB_UPSELL, BUSINESS_ONBOARDING, UPLOAD_ERROR_DIALOG, IDEA_STREAM_END_CARD, PIN_EDIT_MODAL, CTC_PAGE_ADD_RESPONSE_BUTTON, CTC_CLOSEUP_ADD_RESPONSE_BUTTON, VIDEO_TO_SP_REDIRECT, CREATOR_HUB_TOOLS, CREATOR_PATHWAYS_CREATE_BUTTON, SCHEDULED_PIN_FEED};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new d();
    }

    private e(String str, int i13, String str2) {
        this.value = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
