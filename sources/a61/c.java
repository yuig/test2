package a61;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    private final int type;
    public static final c VIEW_TYPE_IDEAS_BUBBLES = new c("VIEW_TYPE_IDEAS_BUBBLES", 0, 4);
    public static final c VIEW_TYPE_SHOPPING_SPOTLIGHT = new c("VIEW_TYPE_SHOPPING_SPOTLIGHT", 1, 11);
    public static final c VIEW_TYPE_IMMERSIVE_HEADER = new c("VIEW_TYPE_IMMERSIVE_HEADER", 2, 19);
    public static final c VIEW_TYPE_STORY_PINS_UPSELL = new c("VIEW_TYPE_STORY_PINS_UPSELL", 3, 15);
    public static final c VIEW_TYPE_UNIFIED_COMPONENT_BUNDLED = new c("VIEW_TYPE_UNIFIED_COMPONENT_BUNDLED", 4, 20);
    public static final c VIEW_TYPE_STRUCTURED_FEED_GRID_SECTION_VIEW = new c("VIEW_TYPE_STRUCTURED_FEED_GRID_SECTION_VIEW", 5, 28);
    public static final c VIEW_TYPE_STRUCTURED_FEED_HEADER_VIEW = new c("VIEW_TYPE_STRUCTURED_FEED_HEADER_VIEW", 6, 32);
    public static final c VIEW_TYPE_STRUCTURED_FEED_FOOTER_VIEW = new c("VIEW_TYPE_STRUCTURED_FEED_FOOTER_VIEW", 7, 33);
    public static final c VIEW_TYPE_STRUCTURED_FEED_CAROUSEL_VIEW = new c("VIEW_TYPE_STRUCTURED_FEED_CAROUSEL_VIEW", 8, 30);
    public static final c VIEW_TYPE_STRUCTURED_FEED_FREEFORM = new c("VIEW_TYPE_STRUCTURED_FEED_FREEFORM", 9, 36);
    public static final c VIEW_TYPE_STRUCTURED_FEED_SINGLE_IMAGE_UPSELL_VIEW = new c("VIEW_TYPE_STRUCTURED_FEED_SINGLE_IMAGE_UPSELL_VIEW", 10, 31);
    public static final c VIEW_TYPE_INTENTIONALLY_EMPTY = new c("VIEW_TYPE_INTENTIONALLY_EMPTY", 11, -1);

    private static final /* synthetic */ c[] $values() {
        return new c[]{VIEW_TYPE_IDEAS_BUBBLES, VIEW_TYPE_SHOPPING_SPOTLIGHT, VIEW_TYPE_IMMERSIVE_HEADER, VIEW_TYPE_STORY_PINS_UPSELL, VIEW_TYPE_UNIFIED_COMPONENT_BUNDLED, VIEW_TYPE_STRUCTURED_FEED_GRID_SECTION_VIEW, VIEW_TYPE_STRUCTURED_FEED_HEADER_VIEW, VIEW_TYPE_STRUCTURED_FEED_FOOTER_VIEW, VIEW_TYPE_STRUCTURED_FEED_CAROUSEL_VIEW, VIEW_TYPE_STRUCTURED_FEED_FREEFORM, VIEW_TYPE_STRUCTURED_FEED_SINGLE_IMAGE_UPSELL_VIEW, VIEW_TYPE_INTENTIONALLY_EMPTY};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, int i14) {
        this.type = i14;
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

    public final int getType() {
        return this.type;
    }
}
