package es0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a COPY_LINK = new a("COPY_LINK", 0);
    public static final a DIVIDER_WITH_TOP_SPACE = new a("DIVIDER_WITH_TOP_SPACE", 1);
    public static final a DIVIDER_WITH_BOTTOM_SPACE = new a("DIVIDER_WITH_BOTTOM_SPACE", 2);
    public static final a DOWNLOAD = new a("DOWNLOAD", 3);
    public static final a DUPLICATE = new a("DUPLICATE", 4);
    public static final a EDIT = new a("EDIT", 5);
    public static final a HIDE = new a("HIDE", 6);
    public static final a HIDE_WRONG_HAIR_PATTERN = new a("HIDE_WRONG_HAIR_PATTERN", 7);
    public static final a HIDE_WRONG_SKIN_TONE = new a("HIDE_WRONG_SKIN_TONE", 8);
    public static final a HIDE_WRONG_BODY_TYPE = new a("HIDE_WRONG_BODY_TYPE", 9);
    public static final a WAISTA = new a("WAISTA", 10);
    public static final a GMA_WAISTA = new a("GMA_WAISTA", 11);
    public static final a CRITEO_WAISTA = new a("CRITEO_WAISTA", 12);
    public static final a REPORT = new a("REPORT", 13);
    public static final a GMA_REPORT = new a("GMA_REPORT", 14);
    public static final a CRITEO_REPORT = new a("CRITEO_REPORT", 15);
    public static final a REMOVE_MENTION = new a("REMOVE_MENTION", 16);
    public static final a REASON = new a("REASON", 17);
    public static final a GMA_REASON = new a("GMA_REASON", 18);
    public static final a CRITEO_REASON = new a("CRITEO_REASON", 19);
    public static final a GEN_AI_APPEND_REASON = new a("GEN_AI_APPEND_REASON", 20);
    public static final a GEN_AI_STANDALONE_REASON = new a("GEN_AI_STANDALONE_REASON", 21);
    public static final a SAVE = new a("SAVE", 22);
    public static final a SEND = new a("SEND", 23);
    public static final a STOP_SEEING_BOARD_PINS = new a("STOP_SEEING_BOARD_PINS", 24);
    public static final a STOP_SEEING_PIN = new a("STOP_SEEING_PIN", 25);
    public static final a STOP_SEEING_SELF_BOARD_PINS = new a("STOP_SEEING_SELF_BOARD_PINS", 26);
    public static final a STOP_SEEING_TOPIC_PINS = new a("STOP_SEEING_TOPIC_PINS", 27);
    public static final a STOP_SEEING_USER_PINS = new a("STOP_SEEING_USER_PINS", 28);
    public static final a UNFOLLOW = new a("UNFOLLOW", 29);
    public static final a CLICKTHROUGH = new a("CLICKTHROUGH", 30);
    public static final a OPEN_IN_EXTERNAL_BROWSER = new a("OPEN_IN_EXTERNAL_BROWSER", 31);
    public static final a PROMOTE = new a("PROMOTE", 32);
    public static final a SECTION_HEADER_MANAGE = new a("SECTION_HEADER_MANAGE", 33);
    public static final a SECTION_HEADER_MORE = new a("SECTION_HEADER_MORE", 34);
    public static final a FOLLOW_UNFOLLOW_PIN_CREATOR = new a("FOLLOW_UNFOLLOW_PIN_CREATOR", 35);
    public static final a SAVE_PRODUCT_TAG = new a("SAVE_PRODUCT_TAG", 36);
    public static final a REACT = new a("REACT", 37);
    public static final a ADS_DEBUGGER = new a("ADS_DEBUGGER", 38);
    public static final a ADD_TO_COLLAGE = new a("ADD_TO_COLLAGE", 39);
    public static final a REMIX_COLLAGE = new a("REMIX_COLLAGE", 40);
    public static final a SEE_FEWER_WEIGHT_LOSS_ADS = new a("SEE_FEWER_WEIGHT_LOSS_ADS", 41);
    public static final a LEARN_MORE_ABOUT_GEN_AI = new a("LEARN_MORE_ABOUT_GEN_AI", 42);
    public static final a GEN_AI_TOPICS_OPT_OUT = new a("GEN_AI_TOPICS_OPT_OUT", 43);

    private static final /* synthetic */ a[] $values() {
        return new a[]{COPY_LINK, DIVIDER_WITH_TOP_SPACE, DIVIDER_WITH_BOTTOM_SPACE, DOWNLOAD, DUPLICATE, EDIT, HIDE, HIDE_WRONG_HAIR_PATTERN, HIDE_WRONG_SKIN_TONE, HIDE_WRONG_BODY_TYPE, WAISTA, GMA_WAISTA, CRITEO_WAISTA, REPORT, GMA_REPORT, CRITEO_REPORT, REMOVE_MENTION, REASON, GMA_REASON, CRITEO_REASON, GEN_AI_APPEND_REASON, GEN_AI_STANDALONE_REASON, SAVE, SEND, STOP_SEEING_BOARD_PINS, STOP_SEEING_PIN, STOP_SEEING_SELF_BOARD_PINS, STOP_SEEING_TOPIC_PINS, STOP_SEEING_USER_PINS, UNFOLLOW, CLICKTHROUGH, OPEN_IN_EXTERNAL_BROWSER, PROMOTE, SECTION_HEADER_MANAGE, SECTION_HEADER_MORE, FOLLOW_UNFOLLOW_PIN_CREATOR, SAVE_PRODUCT_TAG, REACT, ADS_DEBUGGER, ADD_TO_COLLAGE, REMIX_COLLAGE, SEE_FEWER_WEIGHT_LOSS_ADS, LEARN_MORE_ABOUT_GEN_AI, GEN_AI_TOPICS_OPT_OUT};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
