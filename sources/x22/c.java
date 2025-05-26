package x22;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c OTHER = new c("OTHER", 0);
    public static final c BOARD_IDEAS_TAB = new c("BOARD_IDEAS_TAB", 1);
    public static final c BOARD_FOOTER_STORY = new c("BOARD_FOOTER_STORY", 2);
    public static final c BOARD_SWIPE = new c("BOARD_SWIPE", 3);
    public static final c SECTION_IDEAS_TAB = new c("SECTION_IDEAS_TAB", 4);
    public static final c SECTION_FOOTER_STORY = new c("SECTION_FOOTER_STORY", 5);
    public static final c SECTION_SWIPE = new c("SECTION_SWIPE", 6);
    public static final c BOARD_EMPTY_STATE_STORY = new c("BOARD_EMPTY_STATE_STORY", 7);
    public static final c SECTION_EMPTY_STATE_STORY = new c("SECTION_EMPTY_STATE_STORY", 8);
    public static final c HOME_FEED_STORY = new c("HOME_FEED_STORY", 9);
    public static final c EMAIL_NOTIFICATION = new c("EMAIL_NOTIFICATION", 10);
    public static final c PUSH_NOTIFICATION = new c("PUSH_NOTIFICATION", 11);
    public static final c NEWSHUB_STORY = new c("NEWSHUB_STORY", 12);
    public static final c PIN_SEARCH_STORY = new c("PIN_SEARCH_STORY", 13);
    public static final c RELATED_PINS_STORY = new c("RELATED_PINS_STORY", 14);
    public static final c BOARD_POST_CREATE_TOAST = new c("BOARD_POST_CREATE_TOAST", 15);
    public static final c POST_REPIN_TOAST = new c("POST_REPIN_TOAST", 16);
    public static final c CONTEXTUAL_MENU_BUTTON = new c("CONTEXTUAL_MENU_BUTTON", 17);
    public static final c OTHER_BOARD_FOOTER_STORY = new c("OTHER_BOARD_FOOTER_STORY", 18);
    public static final c HOME_FEED_SWIPE = new c("HOME_FEED_SWIPE", 19);
    public static final c MWEB_UNAUTH_MORE_LIKE_THIS = new c("MWEB_UNAUTH_MORE_LIKE_THIS", 20);
    public static final c PROFILE_POST_BOARD_CREATE_BOTTOM_SHEET = new c("PROFILE_POST_BOARD_CREATE_BOTTOM_SHEET", 21);
    public static final c PROFILE_POST_BOARD_CREATE_REDIRECT = new c("PROFILE_POST_BOARD_CREATE_REDIRECT", 22);
    public static final c BOARD_TOOL = new c("BOARD_TOOL", 23);
    public static final c SECTION_TOOL = new c("SECTION_TOOL", 24);
    public static final c HF_STRUCTURED_FEED_STORY = new c("HF_STRUCTURED_FEED_STORY", 25);
    public static final c ENGAGED_TOPIC_TAB = new c("ENGAGED_TOPIC_TAB", 26);
    public static final c POST_AUTO_ORGANIZE_BOTTOM_SHEET = new c("POST_AUTO_ORGANIZE_BOTTOM_SHEET", 27);
    public static final c HF_TAB_PRELOAD = new c("HF_TAB_PRELOAD", 28);
    public static final c RELATED_STYLE_BUTTON = new c("RELATED_STYLE_BUTTON", 29);

    private static final /* synthetic */ c[] $values() {
        return new c[]{OTHER, BOARD_IDEAS_TAB, BOARD_FOOTER_STORY, BOARD_SWIPE, SECTION_IDEAS_TAB, SECTION_FOOTER_STORY, SECTION_SWIPE, BOARD_EMPTY_STATE_STORY, SECTION_EMPTY_STATE_STORY, HOME_FEED_STORY, EMAIL_NOTIFICATION, PUSH_NOTIFICATION, NEWSHUB_STORY, PIN_SEARCH_STORY, RELATED_PINS_STORY, BOARD_POST_CREATE_TOAST, POST_REPIN_TOAST, CONTEXTUAL_MENU_BUTTON, OTHER_BOARD_FOOTER_STORY, HOME_FEED_SWIPE, MWEB_UNAUTH_MORE_LIKE_THIS, PROFILE_POST_BOARD_CREATE_BOTTOM_SHEET, PROFILE_POST_BOARD_CREATE_REDIRECT, BOARD_TOOL, SECTION_TOOL, HF_STRUCTURED_FEED_STORY, ENGAGED_TOPIC_TAB, POST_AUTO_ORGANIZE_BOTTOM_SHEET, HF_TAB_PRELOAD, RELATED_STYLE_BUTTON};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private c(String str, int i13) {
    }

    public static final c findByValue(int i13) {
        Companion.getClass();
        return a.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (b.f131597a[ordinal()]) {
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
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            case 24:
                return 23;
            case 25:
                return 24;
            case 26:
                return 25;
            case 27:
                return 26;
            case 28:
                return 27;
            case 29:
                return 28;
            case 30:
                return 29;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
