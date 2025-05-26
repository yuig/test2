package xq1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    private final String value;
    public static final b BLOGGER = new b("BLOGGER", 0, "blogger");
    public static final b OTHER = new b("OTHER", 1, "other");
    public static final b CONSUMER_GOOD_PRODUCT = new b("CONSUMER_GOOD_PRODUCT", 2, "consumer_good_product_or_service");
    public static final b CONSTRACTOR_OR_SERVICE = new b("CONSTRACTOR_OR_SERVICE", 3, "contractor_or_service_provider");
    public static final b PUBLISHER_OR_MEDIA = new b("PUBLISHER_OR_MEDIA", 4, "publisher_or_media");
    public static final b NOT_SURE = new b("NOT_SURE", 5, "not_sure");
    public static final b ONLINE_RETAIL = new b("ONLINE_RETAIL", 6, "online_retail_or_marketplace");
    public static final b LOCAL_RETAIL = new b("LOCAL_RETAIL", 7, "local_retail_store");
    public static final b INFLUENCER_OR_CELEBRITY = new b("INFLUENCER_OR_CELEBRITY", 8, "influencer_public_figure_or_celebrity");

    private static final /* synthetic */ b[] $values() {
        return new b[]{BLOGGER, OTHER, CONSUMER_GOOD_PRODUCT, CONSTRACTOR_OR_SERVICE, PUBLISHER_OR_MEDIA, NOT_SURE, ONLINE_RETAIL, LOCAL_RETAIL, INFLUENCER_OR_CELEBRITY};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, String str2) {
        this.value = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
