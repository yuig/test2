package i32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b1[] $VALUES;

    @NotNull
    public static final z0 Companion;
    public static final b1 ANDROID_TEST_ANCHOR = new b1("ANDROID_TEST_ANCHOR", 0);
    public static final b1 ANDROID_OWN_BOARD_OVERFLOW_BUTTON = new b1("ANDROID_OWN_BOARD_OVERFLOW_BUTTON", 1);
    public static final b1 ANDROID_OWN_BOARD_MORE_IDEAS_TOOL_BUTTON = new b1("ANDROID_OWN_BOARD_MORE_IDEAS_TOOL_BUTTON", 2);
    public static final b1 ANDROID_OWN_BOARD_ORGANIZE_TOOL_BUTTON = new b1("ANDROID_OWN_BOARD_ORGANIZE_TOOL_BUTTON", 3);
    public static final b1 ANDROID_OWN_BOARD_ADD_NEW_PLUS_BUTTON = new b1("ANDROID_OWN_BOARD_ADD_NEW_PLUS_BUTTON", 4);
    public static final b1 ANDROID_PIN_IT_BUTTON = new b1("ANDROID_PIN_IT_BUTTON", 5);
    public static final b1 ANDROID_HOMEFEED_FIRST_PIN = new b1("ANDROID_HOMEFEED_FIRST_PIN", 6);
    public static final b1 ANDROID_HOMEFEED_SECOND_PIN = new b1("ANDROID_HOMEFEED_SECOND_PIN", 7);
    public static final b1 ANDROID_SEARCH_TAB_IN_NAV_BAR = new b1("ANDROID_SEARCH_TAB_IN_NAV_BAR", 8);
    public static final b1 ANDROID_PROFILE_TAB_IN_NAV_BAR = new b1("ANDROID_PROFILE_TAB_IN_NAV_BAR", 9);
    public static final b1 ANDROID_CREATE_PIN_TAB_IN_NAV_BAR = new b1("ANDROID_CREATE_PIN_TAB_IN_NAV_BAR", 10);
    public static final b1 ANDROID_CREATOR_HUB_BUTTON = new b1("ANDROID_CREATOR_HUB_BUTTON", 11);
    public static final b1 ANDROID_PIN_SEND_BUTTON = new b1("ANDROID_PIN_SEND_BUTTON", 12);
    public static final b1 ANDROID_BOARD_SHARE_BUTTON = new b1("ANDROID_BOARD_SHARE_BUTTON", 13);
    public static final b1 ANDROID_PROFILE_SETTINGS_ICON = new b1("ANDROID_PROFILE_SETTINGS_ICON", 14);
    public static final b1 ANDROID_PROFILE_AVATAR = new b1("ANDROID_PROFILE_AVATAR", 15);
    public static final b1 ANDROID_HYBRID_SEARCH_LANDING_FIRST_GUIDE = new b1("ANDROID_HYBRID_SEARCH_LANDING_FIRST_GUIDE", 16);
    public static final b1 ANDROID_PROFILE_COLLAGES_TAB = new b1("ANDROID_PROFILE_COLLAGES_TAB", 17);
    public static final b1 ANDROID_PIN_CLICKTHROUGH_BUTTON = new b1("ANDROID_PIN_CLICKTHROUGH_BUTTON", 18);
    public static final b1 ANDROID_CLOSEUP_OVERFLOW_MENU = new b1("ANDROID_CLOSEUP_OVERFLOW_MENU", 19);
    public static final b1 ANDROID_STICKER_COMMENT_BUTTON = new b1("ANDROID_STICKER_COMMENT_BUTTON", 20);
    public static final b1 ANDROID_PIN_REACTION_BUTTON = new b1("ANDROID_PIN_REACTION_BUTTON", 21);

    private static final /* synthetic */ b1[] $values() {
        return new b1[]{ANDROID_TEST_ANCHOR, ANDROID_OWN_BOARD_OVERFLOW_BUTTON, ANDROID_OWN_BOARD_MORE_IDEAS_TOOL_BUTTON, ANDROID_OWN_BOARD_ORGANIZE_TOOL_BUTTON, ANDROID_OWN_BOARD_ADD_NEW_PLUS_BUTTON, ANDROID_PIN_IT_BUTTON, ANDROID_HOMEFEED_FIRST_PIN, ANDROID_HOMEFEED_SECOND_PIN, ANDROID_SEARCH_TAB_IN_NAV_BAR, ANDROID_PROFILE_TAB_IN_NAV_BAR, ANDROID_CREATE_PIN_TAB_IN_NAV_BAR, ANDROID_CREATOR_HUB_BUTTON, ANDROID_PIN_SEND_BUTTON, ANDROID_BOARD_SHARE_BUTTON, ANDROID_PROFILE_SETTINGS_ICON, ANDROID_PROFILE_AVATAR, ANDROID_HYBRID_SEARCH_LANDING_FIRST_GUIDE, ANDROID_PROFILE_COLLAGES_TAB, ANDROID_PIN_CLICKTHROUGH_BUTTON, ANDROID_CLOSEUP_OVERFLOW_MENU, ANDROID_STICKER_COMMENT_BUTTON, ANDROID_PIN_REACTION_BUTTON};
    }

    static {
        b1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new z0();
    }

    private b1(String str, int i13) {
    }

    public static final b1 findByValue(int i13) {
        Companion.getClass();
        return z0.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (a1.f71474a[ordinal()]) {
            case 1:
                return 1000;
            case 2:
                return 1001;
            case 3:
                return 1004;
            case 4:
                return 1005;
            case 5:
                return 1006;
            case 6:
                return 1009;
            case 7:
                return 1010;
            case 8:
                return 1011;
            case 9:
                return 1012;
            case 10:
                return 1013;
            case 11:
                return 1014;
            case 12:
                return 1015;
            case 13:
                return 1016;
            case 14:
                return 1017;
            case 15:
                return 1019;
            case 16:
                return 1020;
            case 17:
                return 1021;
            case 18:
                return 1022;
            case 19:
                return 1023;
            case 20:
                return 1024;
            case 21:
                return 1025;
            case 22:
                return 1026;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
