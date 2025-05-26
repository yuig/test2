package jo1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a HOMEFEED = new a("HOMEFEED", 0);
    public static final a SEARCH = new a("SEARCH", 1);
    public static final a RELATED_PINS = new a("RELATED_PINS", 2);
    public static final a FOLLOWING_FEED = new a("FOLLOWING_FEED", 3);
    public static final a VISUAL_SEARCH = new a("VISUAL_SEARCH", 4);
    public static final a BOARD = new a("BOARD", 5);
    public static final a BOARD_SECTION = new a("BOARD_SECTION", 6);
    public static final a USER_PINS = new a("USER_PINS", 7);
    public static final a PROMOTED_PIN_CLOSEUP = new a("PROMOTED_PIN_CLOSEUP", 8);
    public static final a OTHER = new a("OTHER", 9);
    public static final a INTEREST_PINS_FEED = new a("INTEREST_PINS_FEED", 10);
    public static final a SHOPPING_SURFACE = new a("SHOPPING_SURFACE", 11);
    public static final a NEWS_HUB = new a("NEWS_HUB", 12);
    public static final a PROMOTED_SPOTLIGHT = new a("PROMOTED_SPOTLIGHT", 13);
    public static final a QUIZ_PIN_RESULT_CLOSEUP = new a("QUIZ_PIN_RESULT_CLOSEUP", 14);
    public static final a SHOWCASE_PIN_CLOSEUP = new a("SHOWCASE_PIN_CLOSEUP", 15);
    public static final a MORE_IDEAS = new a("MORE_IDEAS", 16);
    public static final a COLLAGE_RETRIEVAL = new a("COLLAGE_RETRIEVAL", 17);
    public static final a REPORT_PIN = new a("REPORT_PIN", 18);
    public static final a BOARD_SHOP_TOOLS = new a("BOARD_SHOP_TOOLS", 19);

    private static final /* synthetic */ a[] $values() {
        return new a[]{HOMEFEED, SEARCH, RELATED_PINS, FOLLOWING_FEED, VISUAL_SEARCH, BOARD, BOARD_SECTION, USER_PINS, PROMOTED_PIN_CLOSEUP, OTHER, INTEREST_PINS_FEED, SHOPPING_SURFACE, NEWS_HUB, PROMOTED_SPOTLIGHT, QUIZ_PIN_RESULT_CLOSEUP, SHOWCASE_PIN_CLOSEUP, MORE_IDEAS, COLLAGE_RETRIEVAL, REPORT_PIN, BOARD_SHOP_TOOLS};
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
