package y32;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @NotNull
    public static final d Companion;
    public static final f UNKNOWN = new f("UNKNOWN", 0);
    public static final f PROFILE = new f("PROFILE", 1);
    public static final f CREATOR_PROFILE = new f("CREATOR_PROFILE", 2);
    public static final f PROFILE_LONGPRESS = new f("PROFILE_LONGPRESS", 3);
    public static final f EXPLORE = new f("EXPLORE", 4);
    public static final f BOARD = new f("BOARD", 5);
    public static final f BOARD_LONGPRESS = new f("BOARD_LONGPRESS", 6);
    public static final f DID_IT_MORE = new f("DID_IT_MORE", 7);
    public static final f CLOSEUP = new f("CLOSEUP", 8);
    public static final f CLOSEUP_LONGPRESS = new f("CLOSEUP_LONGPRESS", 9);
    public static final f CLOSEOUP_OVERFLOW = new f("CLOSEOUP_OVERFLOW", 10);
    public static final f OVERFLOW = new f("OVERFLOW", 11);
    public static final f HOMEFEED_LONGPRESS = new f("HOMEFEED_LONGPRESS", 12);
    public static final f HOMEFEED_HOVER = new f("HOMEFEED_HOVER", 13);
    public static final f RELATED_PINS_HOVER = new f("RELATED_PINS_HOVER", 14);
    public static final f RELATED_PINS_LONGPRESS = new f("RELATED_PINS_LONGPRESS", 15);
    public static final f PINCH_TO_ZOOM = new f("PINCH_TO_ZOOM", 16);
    public static final f VIDEO_FINISHED = new f("VIDEO_FINISHED", 17);
    public static final f CONVERSATION_LONGPRESS = new f("CONVERSATION_LONGPRESS", 18);
    public static final f PIN_SHARE_ICON_IN_CONVERSATION = new f("PIN_SHARE_ICON_IN_CONVERSATION", 19);
    public static final f TODAY_ARTICLE_FEED = new f("TODAY_ARTICLE_FEED", 20);
    public static final f FOLLOWING_FEED = new f("FOLLOWING_FEED", 21);
    public static final f INAPP_BROWSER = new f("INAPP_BROWSER", 22);
    public static final f BOARD_MORE_IDEAS = new f("BOARD_MORE_IDEAS", 23);
    public static final f RELATED_PINS_OVERFLOW = new f("RELATED_PINS_OVERFLOW", 24);
    public static final f GIF_TRAY = new f("GIF_TRAY", 25);
    public static final f SEND_A_PIN = new f("SEND_A_PIN", 26);
    public static final f SHOPPING_FEED = new f("SHOPPING_FEED", 27);
    public static final f STORY_PIN_FEED = new f("STORY_PIN_FEED", 28);
    public static final f MESSAGE_FROM_PINTEREST = new f("MESSAGE_FROM_PINTEREST", 29);
    public static final f PINTEREST_AUTO_REPLY = new f("PINTEREST_AUTO_REPLY", 30);
    public static final f CONTEXTUAL_MENU = new f("CONTEXTUAL_MENU", 31);
    public static final f INGREDIENTS_AUTOCOPY = new f("INGREDIENTS_AUTOCOPY", 32);
    public static final f VIDEO_TAB_FEED = new f("VIDEO_TAB_FEED", 33);
    public static final f VIDEO_TAB_VIDEO_FINISHED = new f("VIDEO_TAB_VIDEO_FINISHED", 34);
    public static final f SEARCH_FEED_ONE_TAP = new f("SEARCH_FEED_ONE_TAP", 35);
    public static final f NAG_INVITER = new f("NAG_INVITER", 36);
    public static final f BOARD_ORGANIZE = new f("BOARD_ORGANIZE", 37);
    public static final f STORY_PIN_FINISHED = new f("STORY_PIN_FINISHED", 38);
    public static final f CREATOR_CLASS_LIVESTREAM = new f("CREATOR_CLASS_LIVESTREAM", 39);
    public static final f PEAR_QUIZ_RESULTS_PAGE = new f("PEAR_QUIZ_RESULTS_PAGE", 40);
    public static final f BOARD_SHARE = new f("BOARD_SHARE", 41);
    public static final f PIN_LONGPRESS = new f("PIN_LONGPRESS", 42);
    public static final f COLLAGE_OVERFLOW = new f("COLLAGE_OVERFLOW", 43);
    public static final f PEAR_INSIGHTS_PAGE = new f("PEAR_INSIGHTS_PAGE", 44);
    public static final f COLLAGE_POST_PUBLISH = new f("COLLAGE_POST_PUBLISH", 45);
    public static final f SHARE_UPSELL = new f("SHARE_UPSELL", 46);

    private static final /* synthetic */ f[] $values() {
        return new f[]{UNKNOWN, PROFILE, CREATOR_PROFILE, PROFILE_LONGPRESS, EXPLORE, BOARD, BOARD_LONGPRESS, DID_IT_MORE, CLOSEUP, CLOSEUP_LONGPRESS, CLOSEOUP_OVERFLOW, OVERFLOW, HOMEFEED_LONGPRESS, HOMEFEED_HOVER, RELATED_PINS_HOVER, RELATED_PINS_LONGPRESS, PINCH_TO_ZOOM, VIDEO_FINISHED, CONVERSATION_LONGPRESS, PIN_SHARE_ICON_IN_CONVERSATION, TODAY_ARTICLE_FEED, FOLLOWING_FEED, INAPP_BROWSER, BOARD_MORE_IDEAS, RELATED_PINS_OVERFLOW, GIF_TRAY, SEND_A_PIN, SHOPPING_FEED, STORY_PIN_FEED, MESSAGE_FROM_PINTEREST, PINTEREST_AUTO_REPLY, CONTEXTUAL_MENU, INGREDIENTS_AUTOCOPY, VIDEO_TAB_FEED, VIDEO_TAB_VIDEO_FINISHED, SEARCH_FEED_ONE_TAP, NAG_INVITER, BOARD_ORGANIZE, STORY_PIN_FINISHED, CREATOR_CLASS_LIVESTREAM, PEAR_QUIZ_RESULTS_PAGE, BOARD_SHARE, PIN_LONGPRESS, COLLAGE_OVERFLOW, PEAR_INSIGHTS_PAGE, COLLAGE_POST_PUBLISH, SHARE_UPSELL};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new d();
    }

    private f(String str, int i13) {
    }

    public static final f findByValue(int i13) {
        Companion.getClass();
        return d.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (e.f136864a[ordinal()]) {
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
            case 31:
                return 30;
            case 32:
                return 31;
            case 33:
                return 32;
            case 34:
                return 33;
            case 35:
                return 34;
            case 36:
                return 35;
            case 37:
                return 36;
            case 38:
                return 37;
            case 39:
                return 38;
            case 40:
                return 39;
            case 41:
                return 40;
            case 42:
                return 41;
            case 43:
                return 42;
            case 44:
                return 43;
            case 45:
                return 44;
            case 46:
                return 45;
            case 47:
                return 46;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
