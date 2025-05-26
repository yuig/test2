package d32;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c UNKNOWN = new c("UNKNOWN", 0);
    public static final c PIN_CLOSEUP_CUTOUT_TOOL = new c("PIN_CLOSEUP_CUTOUT_TOOL", 1);
    public static final c PIN_CLOSEUP_SAVE_BUTTON = new c("PIN_CLOSEUP_SAVE_BUTTON", 2);
    public static final c PIN_CLOSEUP_LONG_PRESS_MENU = new c("PIN_CLOSEUP_LONG_PRESS_MENU", 3);
    public static final c PIN_CLOSEUP_COLLAGE_BUTTON = new c("PIN_CLOSEUP_COLLAGE_BUTTON", 4);
    public static final c PIN_CLOSEUP_FEEDBACK_MENU = new c("PIN_CLOSEUP_FEEDBACK_MENU", 5);
    public static final c APP_TAB_BAR_PLUS_BUTTON = new c("APP_TAB_BAR_PLUS_BUTTON", 6);
    public static final c PROFILE_PLUS_BUTTON = new c("PROFILE_PLUS_BUTTON", 7);
    public static final c SNAPSHOT_SHARE_SHEET_COLLAGE_BUTTON = new c("SNAPSHOT_SHARE_SHEET_COLLAGE_BUTTON", 8);
    public static final c BOARD_TOOLBAR_COLLAGE_BUTTON = new c("BOARD_TOOLBAR_COLLAGE_BUTTON", 9);
    public static final c BOARD_TOOLBAR_ACTION_SHEET_COLLAGE_BUTTON = new c("BOARD_TOOLBAR_ACTION_SHEET_COLLAGE_BUTTON", 10);
    public static final c COMPOSER_ITEM_DETAILS = new c("COMPOSER_ITEM_DETAILS", 11);
    public static final c COLLAGE_CLOSEUP_CUTOUT_DRAWER_SAVE = new c("COLLAGE_CLOSEUP_CUTOUT_DRAWER_SAVE", 12);
    public static final c FEED_PIN_LONG_PRESS_MENU = new c("FEED_PIN_LONG_PRESS_MENU", 13);
    public static final c COLLAGES_DRAFT_FEED = new c("COLLAGES_DRAFT_FEED", 14);
    public static final c DEEPLINK = new c("DEEPLINK", 15);
    public static final c COLLAGES_TAB = new c("COLLAGES_TAB", 16);
    public static final c REMIX = new c("REMIX", 17);
    public static final c MEDIA_MODAL = new c("MEDIA_MODAL", 18);
    public static final c COMPOSER_OVERFLOW_MENU = new c("COMPOSER_OVERFLOW_MENU", 19);
    public static final c AUTO_COLLAGE = new c("AUTO_COLLAGE", 20);
    public static final c PIN_CLOSEUP_FEEDBACK_MENU_REMIX_BUTTON = new c("PIN_CLOSEUP_FEEDBACK_MENU_REMIX_BUTTON", 21);
    public static final c COLLAGES_DRAFT_OVERFLOW_MENU = new c("COLLAGES_DRAFT_OVERFLOW_MENU", 22);
    public static final c COLLAGES_PIN_OVERFLOW_MENU = new c("COLLAGES_PIN_OVERFLOW_MENU", 23);
    public static final c CUTOUT_CLOSEUP_OVERFLOW_MENU = new c("CUTOUT_CLOSEUP_OVERFLOW_MENU", 24);

    private static final /* synthetic */ c[] $values() {
        return new c[]{UNKNOWN, PIN_CLOSEUP_CUTOUT_TOOL, PIN_CLOSEUP_SAVE_BUTTON, PIN_CLOSEUP_LONG_PRESS_MENU, PIN_CLOSEUP_COLLAGE_BUTTON, PIN_CLOSEUP_FEEDBACK_MENU, APP_TAB_BAR_PLUS_BUTTON, PROFILE_PLUS_BUTTON, SNAPSHOT_SHARE_SHEET_COLLAGE_BUTTON, BOARD_TOOLBAR_COLLAGE_BUTTON, BOARD_TOOLBAR_ACTION_SHEET_COLLAGE_BUTTON, COMPOSER_ITEM_DETAILS, COLLAGE_CLOSEUP_CUTOUT_DRAWER_SAVE, FEED_PIN_LONG_PRESS_MENU, COLLAGES_DRAFT_FEED, DEEPLINK, COLLAGES_TAB, REMIX, MEDIA_MODAL, COMPOSER_OVERFLOW_MENU, AUTO_COLLAGE, PIN_CLOSEUP_FEEDBACK_MENU_REMIX_BUTTON, COLLAGES_DRAFT_OVERFLOW_MENU, COLLAGES_PIN_OVERFLOW_MENU, CUTOUT_CLOSEUP_OVERFLOW_MENU};
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
        switch (b.f53666a[ordinal()]) {
            case 1:
                return -1;
            case 2:
                return 0;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 4;
            case 7:
                return 5;
            case 8:
                return 6;
            case 9:
                return 7;
            case 10:
                return 8;
            case 11:
                return 9;
            case 12:
                return 10;
            case 13:
                return 11;
            case 14:
                return 12;
            case 15:
                return 13;
            case 16:
                return 14;
            case 17:
                return 15;
            case 18:
                return 16;
            case 19:
                return 17;
            case 20:
                return 18;
            case 21:
                return 19;
            case 22:
                return 20;
            case 23:
                return 21;
            case 24:
                return 22;
            case 25:
                return 23;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
