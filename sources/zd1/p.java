package zd1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;

    @NotNull
    private final String source;
    public static final p PRODUCT_FILTER_SOURCE = new p("PRODUCT_FILTER_SOURCE", 0, "source");
    public static final p PRODUCT_FILTER_SOURCE_RELATED_PRODUCTS = new p("PRODUCT_FILTER_SOURCE_RELATED_PRODUCTS", 1, "related_products");
    public static final p PRODUCT_FILTER_SOURCE_STELA = new p("PRODUCT_FILTER_SOURCE_STELA", 2, "stela");
    public static final p PRODUCT_FILTER_SOURCE_CLOSEUP_SHOP = new p("PRODUCT_FILTER_SOURCE_CLOSEUP_SHOP", 3, "closeup_shop");
    public static final p PRODUCT_FILTER_SOURCE_PINCH_TO_ZOOM = new p("PRODUCT_FILTER_SOURCE_PINCH_TO_ZOOM", 4, "pinch_to_zoom");
    public static final p PRODUCT_FILTER_SOURCE_STELA_AND_RELATED_PRODUCTS = new p("PRODUCT_FILTER_SOURCE_STELA_AND_RELATED_PRODUCTS", 5, "stela_and_related_products");
    public static final p PRODUCT_FILTER_SOURCE_CUSTOM_CROP = new p("PRODUCT_FILTER_SOURCE_CUSTOM_CROP", 6, "custom_crop");
    public static final p PRODUCT_FILTER_SOURCE_SEARCH = new p("PRODUCT_FILTER_SOURCE_SEARCH", 7, "search");
    public static final p PRODUCT_FILTER_SOURCE_VIRTUAL_TRY_ON = new p("PRODUCT_FILTER_SOURCE_VIRTUAL_TRY_ON", 8, "virtual_try_on");
    public static final p PRODUCT_FILTER_SOURCE_INVALID = new p("PRODUCT_FILTER_SOURCE_INVALID", 9, "source_invalid");

    private static final /* synthetic */ p[] $values() {
        return new p[]{PRODUCT_FILTER_SOURCE, PRODUCT_FILTER_SOURCE_RELATED_PRODUCTS, PRODUCT_FILTER_SOURCE_STELA, PRODUCT_FILTER_SOURCE_CLOSEUP_SHOP, PRODUCT_FILTER_SOURCE_PINCH_TO_ZOOM, PRODUCT_FILTER_SOURCE_STELA_AND_RELATED_PRODUCTS, PRODUCT_FILTER_SOURCE_CUSTOM_CROP, PRODUCT_FILTER_SOURCE_SEARCH, PRODUCT_FILTER_SOURCE_VIRTUAL_TRY_ON, PRODUCT_FILTER_SOURCE_INVALID};
    }

    static {
        p[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private p(String str, int i13, String str2) {
        this.source = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }
}
