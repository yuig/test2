package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class y0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ y0[] $VALUES;

    @NotNull
    public static final w0 Companion;
    public static final y0 SEARCH_BUBBLE = new y0("SEARCH_BUBBLE", 0);
    public static final y0 CATEGORY_BUBBLE = new y0("CATEGORY_BUBBLE", 1);
    public static final y0 NAVIGATION_BUBBLE = new y0("NAVIGATION_BUBBLE", 2);
    public static final y0 STYLE_BUBBLE = new y0("STYLE_BUBBLE", 3);
    public static final y0 CIRCLE_COLLAGE = new y0("CIRCLE_COLLAGE", 4);
    public static final y0 CIRCLE_STACK = new y0("CIRCLE_STACK", 5);
    public static final y0 NAVIGATION_TEXT = new y0("NAVIGATION_TEXT", 6);
    public static final y0 NAVIGATION_TAB = new y0("NAVIGATION_TAB", 7);
    public static final y0 BUTTON = new y0("BUTTON", 8);
    public static final y0 MULTI_IMAGE_ARTICLE = new y0("MULTI_IMAGE_ARTICLE", 9);
    public static final y0 CATEGORY_LIST_BUBBLE = new y0("CATEGORY_LIST_BUBBLE", 10);
    public static final y0 IMAGE_GRID_ARTICLE = new y0("IMAGE_GRID_ARTICLE", 11);
    public static final y0 DEFAULT_BRAND_ARTICLE = new y0("DEFAULT_BRAND_ARTICLE", 12);
    public static final y0 WIDE_BRAND_ARTICLE = new y0("WIDE_BRAND_ARTICLE", 13);
    public static final y0 MULTI_TOPIC_SQUARE_TILE_DEFAULT = new y0("MULTI_TOPIC_SQUARE_TILE_DEFAULT", 14);
    public static final y0 MULTI_TOPIC_SQUARE_TILE_COMPACT = new y0("MULTI_TOPIC_SQUARE_TILE_COMPACT", 15);
    public static final y0 MULTI_TOPIC_RECTANGLE_TILE_DEFAULT = new y0("MULTI_TOPIC_RECTANGLE_TILE_DEFAULT", 16);
    public static final y0 MULTI_TOPIC_RECTANGLE_TILE_COMPACT = new y0("MULTI_TOPIC_RECTANGLE_TILE_COMPACT", 17);
    public static final y0 TRIPLE_PREVIEW_DISPLAY_CARD = new y0("TRIPLE_PREVIEW_DISPLAY_CARD", 18);
    public static final y0 STACKED_COLLAGE_DISPLAY_CARD = new y0("STACKED_COLLAGE_DISPLAY_CARD", 19);
    public static final y0 IMAGE_AND_TITLE = new y0("IMAGE_AND_TITLE", 20);
    public static final y0 CUTOUT_COLLAGE_PILL = new y0("CUTOUT_COLLAGE_PILL", 21);
    public static final y0 CUTOUT_COLLAGE = new y0("CUTOUT_COLLAGE", 22);
    public static final y0 QUAD_IMAGE_STYLE_BUBBLE = new y0("QUAD_IMAGE_STYLE_BUBBLE", 23);
    public static final y0 LOADING_STATE = new y0("LOADING_STATE", 24);
    public static final y0 SINGLE_COVER_IMAGE_FEED_CARD = new y0("SINGLE_COVER_IMAGE_FEED_CARD", 25);
    public static final y0 MULTI_IMAGE_EDITORIAL_CARD = new y0("MULTI_IMAGE_EDITORIAL_CARD", 26);
    public static final y0 PINFEED_CARD = new y0("PINFEED_CARD", 27);
    public static final y0 ATG_VISUALIZATION_BANNER = new y0("ATG_VISUALIZATION_BANNER", 28);
    public static final y0 DOUBLE_CARDS_STACKED_CENTERED = new y0("DOUBLE_CARDS_STACKED_CENTERED", 29);
    public static final y0 DOUBLE_CARDS_STACKED_SIDE_ALIGNED = new y0("DOUBLE_CARDS_STACKED_SIDE_ALIGNED", 30);
    public static final y0 TRIPLE_CARDS_VARIED_FANOUT = new y0("TRIPLE_CARDS_VARIED_FANOUT", 31);
    public static final y0 TRIPLE_CARDS_UNIFORM_FANOUT = new y0("TRIPLE_CARDS_UNIFORM_FANOUT", 32);
    public static final y0 ICON_AND_TEXT_INLINE_BUBBLE = new y0("ICON_AND_TEXT_INLINE_BUBBLE", 33);

    private static final /* synthetic */ y0[] $values() {
        return new y0[]{SEARCH_BUBBLE, CATEGORY_BUBBLE, NAVIGATION_BUBBLE, STYLE_BUBBLE, CIRCLE_COLLAGE, CIRCLE_STACK, NAVIGATION_TEXT, NAVIGATION_TAB, BUTTON, MULTI_IMAGE_ARTICLE, CATEGORY_LIST_BUBBLE, IMAGE_GRID_ARTICLE, DEFAULT_BRAND_ARTICLE, WIDE_BRAND_ARTICLE, MULTI_TOPIC_SQUARE_TILE_DEFAULT, MULTI_TOPIC_SQUARE_TILE_COMPACT, MULTI_TOPIC_RECTANGLE_TILE_DEFAULT, MULTI_TOPIC_RECTANGLE_TILE_COMPACT, TRIPLE_PREVIEW_DISPLAY_CARD, STACKED_COLLAGE_DISPLAY_CARD, IMAGE_AND_TITLE, CUTOUT_COLLAGE_PILL, CUTOUT_COLLAGE, QUAD_IMAGE_STYLE_BUBBLE, LOADING_STATE, SINGLE_COVER_IMAGE_FEED_CARD, MULTI_IMAGE_EDITORIAL_CARD, PINFEED_CARD, ATG_VISUALIZATION_BANNER, DOUBLE_CARDS_STACKED_CENTERED, DOUBLE_CARDS_STACKED_SIDE_ALIGNED, TRIPLE_CARDS_VARIED_FANOUT, TRIPLE_CARDS_UNIFORM_FANOUT, ICON_AND_TEXT_INLINE_BUBBLE};
    }

    static {
        y0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new w0();
    }

    private y0(String str, int i13) {
    }

    public static final y0 findByValue(int i13) {
        Companion.getClass();
        return w0.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (x0.f140839a[ordinal()]) {
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
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
            case 22:
                return 22;
            case 23:
                return 23;
            case 24:
                return 24;
            case 25:
                return 25;
            case 26:
                return 26;
            case 27:
                return 27;
            case 28:
                return 28;
            case 29:
                return 29;
            case 30:
                return 30;
            case 31:
                return 31;
            case 32:
                return 32;
            case 33:
                return 33;
            case 34:
                return 34;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
