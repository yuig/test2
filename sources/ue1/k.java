package ue1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k implements p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;

    @NotNull
    public static final j Companion;
    public static final k WIDE_BUBBLE_REP = new k("WIDE_BUBBLE_REP", 0);
    public static final k CATEGORY_BUBBLE_REP = new k("CATEGORY_BUBBLE_REP", 1);
    public static final k CATEGORY_LIST_BUBBLE_REP = new k("CATEGORY_LIST_BUBBLE_REP", 2);
    public static final k NAVIGATION_BUBBLE_REP = new k("NAVIGATION_BUBBLE_REP", 3);
    public static final k STYLE_BUBBLE_REP = new k("STYLE_BUBBLE_REP", 4);
    public static final k CIRCLE_COLLAGE_BUBBLE_REP = new k("CIRCLE_COLLAGE_BUBBLE_REP", 5);
    public static final k CIRCLE_STACK_BUBBLE_REP = new k("CIRCLE_STACK_BUBBLE_REP", 6);
    public static final k NAVIGATION_TEXT_BUBBLE_REP = new k("NAVIGATION_TEXT_BUBBLE_REP", 7);
    public static final k MULTI_IMAGE_ARTICLE = new k("MULTI_IMAGE_ARTICLE", 8);
    public static final k IMAGE_GRID_ARTICLE = new k("IMAGE_GRID_ARTICLE", 9);
    public static final k DEFAULT_BRAND_ARTICLE = new k("DEFAULT_BRAND_ARTICLE", 10);
    public static final k WIDE_BRAND_ARTICLE = new k("WIDE_BRAND_ARTICLE", 11);
    public static final k MULTI_TOPIC_SQUARE_TILE_DEFAULT = new k("MULTI_TOPIC_SQUARE_TILE_DEFAULT", 12);
    public static final k MULTI_TOPIC_SQUARE_TILE_COMPACT = new k("MULTI_TOPIC_SQUARE_TILE_COMPACT", 13);
    public static final k MULTI_TOPIC_RECTANGLE_TILE_DEFAULT = new k("MULTI_TOPIC_RECTANGLE_TILE_DEFAULT", 14);
    public static final k MULTI_TOPIC_RECTANGLE_TILE_COMPACT = new k("MULTI_TOPIC_RECTANGLE_TILE_COMPACT", 15);
    public static final k TRIPLE_PREVIEW_DISPLAY_CARD = new k("TRIPLE_PREVIEW_DISPLAY_CARD", 16);
    public static final k STACKED_COLLAGE_DISPLAY_CARD = new k("STACKED_COLLAGE_DISPLAY_CARD", 17);
    public static final k CUTOUT_COLLAGE = new k("CUTOUT_COLLAGE", 18);
    public static final k CUTOUT_COLLAGE_PILL = new k("CUTOUT_COLLAGE_PILL", 19);
    public static final k EDITORIAL_CARD = new k("EDITORIAL_CARD", 20);
    public static final k MULTI_IMAGE_EDITORIAL_CARD = new k("MULTI_IMAGE_EDITORIAL_CARD", 21);
    public static final k ATG_VISUALIZATION_BANNER = new k("ATG_VISUALIZATION_BANNER", 22);
    public static final k IMAGE_AND_TITLE = new k("IMAGE_AND_TITLE", 23);
    public static final k ICON_AND_TEXT_INLINE_BUBBLE = new k("ICON_AND_TEXT_INLINE_BUBBLE", 24);

    private static final /* synthetic */ k[] $values() {
        return new k[]{WIDE_BUBBLE_REP, CATEGORY_BUBBLE_REP, CATEGORY_LIST_BUBBLE_REP, NAVIGATION_BUBBLE_REP, STYLE_BUBBLE_REP, CIRCLE_COLLAGE_BUBBLE_REP, CIRCLE_STACK_BUBBLE_REP, NAVIGATION_TEXT_BUBBLE_REP, MULTI_IMAGE_ARTICLE, IMAGE_GRID_ARTICLE, DEFAULT_BRAND_ARTICLE, WIDE_BRAND_ARTICLE, MULTI_TOPIC_SQUARE_TILE_DEFAULT, MULTI_TOPIC_SQUARE_TILE_COMPACT, MULTI_TOPIC_RECTANGLE_TILE_DEFAULT, MULTI_TOPIC_RECTANGLE_TILE_COMPACT, TRIPLE_PREVIEW_DISPLAY_CARD, STACKED_COLLAGE_DISPLAY_CARD, CUTOUT_COLLAGE, CUTOUT_COLLAGE_PILL, EDITORIAL_CARD, MULTI_IMAGE_EDITORIAL_CARD, ATG_VISUALIZATION_BANNER, IMAGE_AND_TITLE, ICON_AND_TEXT_INLINE_BUBBLE};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new j();
    }

    private k(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
