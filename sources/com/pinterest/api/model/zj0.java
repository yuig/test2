package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class zj0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f44343a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f44344b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("action")
    private dk0 f44345c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("aux_fields")
    private Map<String, Object> f44346d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("background_colour")
    private String f44347e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("bookmarks_for_objects")
    private ya f44348f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("button_text")
    private y5 f44349g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("closeup_id")
    private String f44350h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("container_type")
    private Integer f44351i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("content_ids")
    private List<String> f44352j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("cursor")
    private String f44353k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("custom_properties")
    private Map<String, Object> f44354l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("display_options")
    private Map<String, Object> f44355m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("dynamic_insertion_options")
    private uh f44356n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("experience_extra_context")
    private Map<String, Object> f44357o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("mapped_display_options")
    private Map<String, Object> f44358p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("objects")
    private List<yj0> f44359q;

    /* renamed from: r, reason: collision with root package name */
    @om.b("promoter_id")
    private String f44360r;

    /* renamed from: s, reason: collision with root package name */
    @om.b("referring_source")
    private String f44361s;

    /* renamed from: t, reason: collision with root package name */
    @om.b("story_type")
    private a f44362t;

    /* renamed from: u, reason: collision with root package name */
    @om.b("subtitle")
    private y5 f44363u;

    /* renamed from: v, reason: collision with root package name */
    @om.b("title")
    private y5 f44364v;

    /* renamed from: w, reason: collision with root package name */
    @om.b("user")
    private wy0 f44365w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f44366x;

    /* loaded from: classes3.dex */
    public enum a {
        UNKNOWN,
        RECOMMENDED_SEARCHES,
        POST_CLOSEUP,
        SEARCH_RELATED_QUERIES,
        EXPLORE_CREATOR_AVATAR_STORY,
        SINGLE_COLUMN_CREATOR_STORY,
        SQUARE_COLUMN_CREATOR_STORY,
        HASHTAG_TOP_PINS,
        GROUPED_PIN_ARTICLE_STORY,
        GROUPED_PIN_CAROUSEL_STORY,
        PARTNER_CURATED_PINS,
        VIDEO_PINS_STORY,
        VIRTUAL_TRY_ON_UPSELL_STORY,
        VIRTUAL_TRY_ON_UPSELL_VIDEO_STORY,
        SEARCH_PRODUCT_COLLAGE_STORY,
        FRESH_PINS,
        HOMEFEED_BOARD_TAB_BANNER,
        RELATED_MODULES_HEADER,
        RELATED_STORIES_MODULE,
        EVENT_CAMPAIGN_STORY,
        FEATURED_PLACES,
        STYLE_PIVOT_USER,
        PRODUCT_CATEGORY,
        SHOP_BRAND_STORY,
        SHOP_BRAND_AFFINITY_STORY,
        PB_BUBBLE_STORY,
        PB_BOARD_STORY,
        PB_SEARCH_STORY,
        PB_BRAND_STORY,
        PB_BRAND_NEW_ARRIVALS_STORY,
        PB_BRAND_SALES_STORY,
        PB_INSPO_MIX_STORY,
        PB_INSPO_BRAND_STORY,
        PB_INSPO_SINGLE_COLUMN_STORY,
        BRAND_COLLAGE_STORY,
        BRAND_AFFINITY_COLLAGE_STORY,
        HOMEFEED_MORE_IDEAS_EDUCATIONAL_HEADER,
        RELATED_MODULES_FOOTER_SEE_MORE_P2P,
        RELATED_STYLE_IDEAS_CAROUSEL,
        TODAY_TAB_ARTICLE_BUNDLE,
        TODAY_TAB_HEADER,
        TODAY_TAB_DATE_HEADER,
        TODAY_TAB_FOOTER,
        TODAY_TAB_INTEREST_FOOTER,
        TODAY_PIN_GRID,
        TODAY_PIN_VIDEO,
        TODAY_SINGLE_PIN_TALL,
        TODAY_SINGLE_PIN_WIDE,
        TODAY_STORY_PIN,
        TODAY_ARTICLE_LIST,
        BOARD_IDEAS_DISCOVERY_CARD_COMPACT,
        BOARD_IDEAS_QUIZ_RESULT_CARD,
        BOARD_IDEAS_SHOPPING_CARD_COMPACT,
        BOARD_IDEAS_SIMILAR_BOARDS_COMPACT_CARD,
        BOARD_IDEAS_PREVIEW_DETAILED,
        BOARD_SHOP_THE_LOOK,
        BUBBLE_TRAY_CAROUSEL,
        BUBBLE_ONE_COL,
        BOARD_SECTION_SUGGESTION,
        SHOPPING_SPOTLIGHT,
        STELA_TOP_OBJECTS,
        STELA_IN_FLASHLIGHT_CARD,
        STELA_IN_FLASHLIGHT_ONECOL,
        CTL_MATCHING_CATEGORY_STORY_TYPE,
        CTL_OUTFIT_STORY_TYPE,
        MORE_FROM_CREATOR,
        MORE_FROM_PARTNER,
        PLACES_UPSELL,
        BOARD_SHOP_YOUR_BOARD_STORY_TYPE,
        BOARD_SHOP_YOUR_BOARD_EMPTY_STATE_STORY_TYPE,
        END_OF_FOLLOWING_FEED,
        CREATOR_SPOTLIGHT_EASTERCRAFTS,
        CREATOR_SPOTLIGHT_EASTERRECIPES,
        CREATOR_SPOTLIGHT_HEADER_EASTERCRAFTS,
        CREATOR_SPOTLIGHT_HEADER_EASTERRECIPES,
        CREATOR_SPOTLIGHT_FOOTER_EASTERCRAFTS,
        CREATOR_SPOTLIGHT_FOOTER_EASTERRECIPES,
        GOLD_STANDARD,
        RELATED_DOMAIN_CAROUSEL,
        RELATED_PRODUCTS_BUTTON_FOOTER,
        RELATED_PRODUCTS_FEED_HEADER,
        RELATED_PRODUCTS_COLLAGE,
        RELATED_DOMAIN_COLLAGE,
        RELATED_RECIPES_COLLAGE,
        RELATED_DIY_COLLAGE,
        RELATED_VTO_COLLAGE,
        BOARD_SHOP_RELATED_PRODUCTS_HEADER,
        BOARD_SHOP_CATEGORY,
        BOARD_SHOP_SAVED_PRODUCTS,
        UGC_PACKAGE,
        ALL_PINS,
        STOREFRONT_FOOTER_BUTTON,
        STOREFRONT_HEADER,
        STOREFRONT_CATEGORY_BUBBLES,
        STOREFRONT_CATEGORY_FOOTER_BUTTON,
        STOREFRONT_PRODUCT_GROUP_FOOTER_BUTTON,
        STOREFRONT_SIMILAR_ITEMS_FOOTER_BUTTON,
        RELATED_PRICE_CAROUSEL,
        PINNER_AUTHORITY_UNIFIED,
        RELATED_USE_CASES,
        RELATED_BROAD_INTEREST_MODULE,
        HOMEFEED_SHOPPING_RETARGETED_PRODUCTS,
        CREATOR_CLASS_PRODUCTS,
        CREATOR_CLASSES,
        RELATED_MOST_CONSIDERED_CAROUSEL,
        CLOSEUP_STELA_CATEGORY_STORY,
        RELATED_USE_CASES_CAROUSEL,
        RELATED_USE_CASES_CAROUSEL_WITH_BUTTON,
        RELATED_BROAD_INTEREST_CAROUSEL,
        RELATED_BROAD_INTEREST_CAROUSEL_WITH_BUTTON,
        RELATED_CF_CLICK_CAROUSEL,
        STORY_PIN_STICKER_FEED_FEATURED_SECTION,
        STORY_PIN_STICKER_FEED_TOP_PICKS_SECTION,
        STORY_PIN_STICKER_FEED_INTERACTIVE_SECTION,
        STORY_PIN_STICKER_FEED_CATEGORY_SECTION,
        STORY_PIN_STICKER_SEARCH_EMPTY_STATE_RECENTLY_USED,
        RELATED_PIVOT_INTEREST
    }

    public /* synthetic */ zj0(String str, String str2, dk0 dk0Var, Map map, String str3, ya yaVar, y5 y5Var, String str4, Integer num, List list, String str5, Map map2, Map map3, uh uhVar, Map map4, Map map5, List list2, String str6, String str7, a aVar, y5 y5Var2, y5 y5Var3, wy0 wy0Var, boolean[] zArr, int i13) {
        this(str, str2, dk0Var, map, str3, yaVar, y5Var, str4, num, list, str5, map2, map3, uhVar, map4, map5, list2, str6, str7, aVar, y5Var2, y5Var3, wy0Var, zArr);
    }

    public final List G() {
        return this.f44359q;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f44343a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zj0 zj0Var = (zj0) obj;
        return Objects.equals(this.f44362t, zj0Var.f44362t) && Objects.equals(this.f44351i, zj0Var.f44351i) && Objects.equals(this.f44343a, zj0Var.f44343a) && Objects.equals(this.f44344b, zj0Var.f44344b) && Objects.equals(this.f44345c, zj0Var.f44345c) && Objects.equals(this.f44346d, zj0Var.f44346d) && Objects.equals(this.f44347e, zj0Var.f44347e) && Objects.equals(this.f44348f, zj0Var.f44348f) && Objects.equals(this.f44349g, zj0Var.f44349g) && Objects.equals(this.f44350h, zj0Var.f44350h) && Objects.equals(this.f44352j, zj0Var.f44352j) && Objects.equals(this.f44353k, zj0Var.f44353k) && Objects.equals(this.f44354l, zj0Var.f44354l) && Objects.equals(this.f44355m, zj0Var.f44355m) && Objects.equals(this.f44356n, zj0Var.f44356n) && Objects.equals(this.f44357o, zj0Var.f44357o) && Objects.equals(this.f44358p, zj0Var.f44358p) && Objects.equals(this.f44359q, zj0Var.f44359q) && Objects.equals(this.f44360r, zj0Var.f44360r) && Objects.equals(this.f44361s, zj0Var.f44361s) && Objects.equals(this.f44363u, zj0Var.f44363u) && Objects.equals(this.f44364v, zj0Var.f44364v) && Objects.equals(this.f44365w, zj0Var.f44365w);
    }

    public final int hashCode() {
        return Objects.hash(this.f44343a, this.f44344b, this.f44345c, this.f44346d, this.f44347e, this.f44348f, this.f44349g, this.f44350h, this.f44351i, this.f44352j, this.f44353k, this.f44354l, this.f44355m, this.f44356n, this.f44357o, this.f44358p, this.f44359q, this.f44360r, this.f44361s, this.f44362t, this.f44363u, this.f44364v, this.f44365w);
    }

    @Override // dl1.s
    public final String o() {
        return this.f44344b;
    }

    public zj0() {
        this.f44366x = new boolean[23];
    }

    private zj0(@NonNull String str, String str2, dk0 dk0Var, Map<String, Object> map, String str3, ya yaVar, y5 y5Var, String str4, Integer num, List<String> list, String str5, Map<String, Object> map2, Map<String, Object> map3, uh uhVar, Map<String, Object> map4, Map<String, Object> map5, List<yj0> list2, String str6, String str7, a aVar, y5 y5Var2, y5 y5Var3, wy0 wy0Var, boolean[] zArr) {
        this.f44343a = str;
        this.f44344b = str2;
        this.f44345c = dk0Var;
        this.f44346d = map;
        this.f44347e = str3;
        this.f44348f = yaVar;
        this.f44349g = y5Var;
        this.f44350h = str4;
        this.f44351i = num;
        this.f44352j = list;
        this.f44353k = str5;
        this.f44354l = map2;
        this.f44355m = map3;
        this.f44356n = uhVar;
        this.f44357o = map4;
        this.f44358p = map5;
        this.f44359q = list2;
        this.f44360r = str6;
        this.f44361s = str7;
        this.f44362t = aVar;
        this.f44363u = y5Var2;
        this.f44364v = y5Var3;
        this.f44365w = wy0Var;
        this.f44366x = zArr;
    }
}
