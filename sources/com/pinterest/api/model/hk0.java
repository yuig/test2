package com.pinterest.api.model;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class hk0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ hk0[] $VALUES;

    @NotNull
    public static final gk0 Companion;
    private final int value;
    public static final hk0 TRENDING = new hk0("TRENDING", 0, 2);
    public static final hk0 TRENDING_TOPIC_CATEGORY = new hk0("TRENDING_TOPIC_CATEGORY", 1, 10);
    public static final hk0 TRENDING_TOPIC_EVERYTHING = new hk0("TRENDING_TOPIC_EVERYTHING", 2, 11);
    public static final hk0 SEASONAL = new hk0("SEASONAL", 3, 21);
    public static final hk0 SEASONAL_SEARCH = new hk0("SEASONAL_SEARCH", 4, 22);
    public static final hk0 SEASONAL_UPSELL = new hk0("SEASONAL_UPSELL", 5, 23);
    public static final hk0 STYLE_PIVOT = new hk0("STYLE_PIVOT", 6, 25);
    public static final hk0 SHOPPING_SPOTLIGHT = new hk0("SHOPPING_SPOTLIGHT", 7, 26);
    public static final hk0 SOCIAL_CATEGORY = new hk0("SOCIAL_CATEGORY", 8, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE);
    public static final hk0 LOCATION = new hk0("LOCATION", 9, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE);
    public static final hk0 RECOMMENDED_BOARDS = new hk0("RECOMMENDED_BOARDS", 10, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE);
    public static final hk0 SOCIAL_TRIED_IT = new hk0("SOCIAL_TRIED_IT", 11, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE);
    public static final hk0 RANDOM = new hk0("RANDOM", 12, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE);
    public static final hk0 NEW_CONVERSATION_MESSAGE = new hk0("NEW_CONVERSATION_MESSAGE", 13, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID);
    public static final hk0 NEWS_HUB_CATEGORY_RECOMMENDED_PINS = new hk0("NEWS_HUB_CATEGORY_RECOMMENDED_PINS", 14, RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER);
    public static final hk0 NEWS_HUB_RELATED_PINS_PIN_SPREE = new hk0("NEWS_HUB_RELATED_PINS_PIN_SPREE", 15, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE);
    public static final hk0 RELATED_TOPICS = new hk0("RELATED_TOPICS", 16, RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL);
    public static final hk0 BUBBLE_DAILY_ROUNDUP = new hk0("BUBBLE_DAILY_ROUNDUP", 17, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL);
    public static final hk0 BUBBLE_VIDEO_OF_DAY = new hk0("BUBBLE_VIDEO_OF_DAY", 18, RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE);
    public static final hk0 BUBBLE_GIF_OF_DAY = new hk0("BUBBLE_GIF_OF_DAY", 19, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER);
    public static final hk0 BUBBLE_SHOPPING_RECOMMENDED_TOPIC = new hk0("BUBBLE_SHOPPING_RECOMMENDED_TOPIC", 20, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL);
    public static final hk0 NEWS_HUB_REMARKETING_SEARCH_CLOSEUP_PINS = new hk0("NEWS_HUB_REMARKETING_SEARCH_CLOSEUP_PINS", 21, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER);
    public static final hk0 BUBBLE_ANNOTATION = new hk0("BUBBLE_ANNOTATION", 22, RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE);
    public static final hk0 BUBBLE_RANDOM = new hk0("BUBBLE_RANDOM", 23, RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW);
    public static final hk0 BUBBLE_SHOP_TAB = new hk0("BUBBLE_SHOP_TAB", 24, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN);

    private static final /* synthetic */ hk0[] $values() {
        return new hk0[]{TRENDING, TRENDING_TOPIC_CATEGORY, TRENDING_TOPIC_EVERYTHING, SEASONAL, SEASONAL_SEARCH, SEASONAL_UPSELL, STYLE_PIVOT, SHOPPING_SPOTLIGHT, SOCIAL_CATEGORY, LOCATION, RECOMMENDED_BOARDS, SOCIAL_TRIED_IT, RANDOM, NEW_CONVERSATION_MESSAGE, NEWS_HUB_CATEGORY_RECOMMENDED_PINS, NEWS_HUB_RELATED_PINS_PIN_SPREE, RELATED_TOPICS, BUBBLE_DAILY_ROUNDUP, BUBBLE_VIDEO_OF_DAY, BUBBLE_GIF_OF_DAY, BUBBLE_SHOPPING_RECOMMENDED_TOPIC, NEWS_HUB_REMARKETING_SEARCH_CLOSEUP_PINS, BUBBLE_ANNOTATION, BUBBLE_RANDOM, BUBBLE_SHOP_TAB};
    }

    static {
        hk0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new gk0(null);
    }

    private hk0(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static hk0 valueOf(String str) {
        return (hk0) Enum.valueOf(hk0.class, str);
    }

    public static hk0[] values() {
        return (hk0[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
