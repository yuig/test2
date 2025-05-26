package h61;

import ey.q1;
import h32.a4;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;

    @NotNull
    public static final f Companion;
    public static final h PINS = new h("PINS", 0);
    public static final h BOARDS = new h("BOARDS", 1);
    public static final h USERS = new h("USERS", 2);
    public static final h MY_PINS = new h("MY_PINS", 3);
    public static final h COMMERCE = new h("COMMERCE", 4);
    public static final h PRODUCTS = new h("PRODUCTS", 5);
    public static final h STORY_PIN_PRODUCTS = new h("STORY_PIN_PRODUCTS", 6);
    public static final h SEARCH_FOR_YOU = new h("SEARCH_FOR_YOU", 7);
    public static final h ARTICLE_FEED = new h("ARTICLE_FEED", 8);
    public static final h VIDEOS = new h("VIDEOS", 9);

    private static final /* synthetic */ h[] $values() {
        return new h[]{PINS, BOARDS, USERS, MY_PINS, COMMERCE, PRODUCTS, STORY_PIN_PRODUCTS, SEARCH_FOR_YOU, ARTICLE_FEED, VIDEOS};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new f();
    }

    private h(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    @NotNull
    public final q1 toPWTSearchType() {
        return g.f67818a[ordinal()] == 3 ? q1.USERS : q1.PINS;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        switch (g.f67818a[ordinal()]) {
            case 1:
            default:
                return "pins";
            case 2:
                return "boards";
            case 3:
                return "users";
            case 4:
                return "my_pins";
            case 5:
                return "products";
            case 6:
                return "story_pin_products";
            case 7:
                return "search_for_you";
            case 8:
                return "article_feed";
            case 9:
                return "videos";
        }
    }

    public final t32.i toUnifiedFiltersSearchType() {
        int i13 = g.f67818a[ordinal()];
        if (i13 == 1) {
            return t32.i.PINS;
        }
        if (i13 == 2) {
            return t32.i.BOARDS;
        }
        if (i13 == 3) {
            return t32.i.USERS;
        }
        if (i13 == 5) {
            return t32.i.PRODUCT_PINS;
        }
        if (i13 != 9) {
            return null;
        }
        return t32.i.VIDEO_PINS;
    }

    @NotNull
    public final a4 toViewParameterType() {
        return g.f67818a[ordinal()] == 3 ? a4.SEARCH_USERS : a4.SEARCH_PINS;
    }
}
