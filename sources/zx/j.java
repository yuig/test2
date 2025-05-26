package zx;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class j {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;

    @NotNull
    private final String requestParamName;
    public static final j ORGANIC_IMAGE = new j("ORGANIC_IMAGE", 0, "organic_image");
    public static final j ORGANIC_PRODUCT = new j("ORGANIC_PRODUCT", 1, "organic_product");
    public static final j ORGANIC_VIDEO = new j("ORGANIC_VIDEO", 2, "organic_video");
    public static final j ADS_STANDARD = new j("ADS_STANDARD", 3, "ads_standard");
    public static final j ADS_PRODUCT = new j("ADS_PRODUCT", 4, "ads_product");
    public static final j ADS_VIDEO = new j("ADS_VIDEO", 5, "ads_video");
    public static final j ADS_IDEA = new j("ADS_IDEA", 6, "ads_idea");

    private static final /* synthetic */ j[] $values() {
        return new j[]{ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private j(String str, int i13, String str2) {
        this.requestParamName = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    @NotNull
    public final String getRequestParamName() {
        return this.requestParamName;
    }
}
