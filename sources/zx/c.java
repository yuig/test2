package zx;

import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ALL = new c("ALL", 0, "all", gy1.a.analytics_filter_ad_format_all, null, 4, null);
    private final int description;
    private final Integer disclaimer;

    @NotNull
    private final String requestParamName;
    public static final c STANDARD = new c("STANDARD", 1, "standard", gy1.a.analytics_filter_ad_format_standard, Integer.valueOf(gy1.a.analytics_filter_ad_format_standard_disclaimer));
    public static final c VIDEO = new c("VIDEO", 2, "video", gy1.a.analytics_filter_ad_format_video, Integer.valueOf(gy1.a.analytics_filter_ad_format_video_disclaimer));
    public static final c PRODUCT = new c("PRODUCT", 3, "product", gy1.a.analytics_filter_ad_format_product, Integer.valueOf(gy1.a.analytics_filter_ad_format_product_disclaimer));
    public static final c IDEA = new c("IDEA", 4, "story", gy1.a.analytics_filter_ad_format_idea, Integer.valueOf(gy1.a.analytics_filter_ad_format_idea_disclaimer));

    private static final /* synthetic */ c[] $values() {
        return new c[]{ALL, STANDARD, VIDEO, PRODUCT, IDEA};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ c(String str, int i13, String str2, int i14, Integer num, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, str2, i14, (i15 & 4) != 0 ? null : num);
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

    public final int getDescription() {
        return this.description;
    }

    public final Integer getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final String getRequestParamName() {
        return this.requestParamName;
    }

    private c(String str, int i13, String str2, int i14, Integer num) {
        this.requestParamName = str2;
        this.description = i14;
        this.disclaimer = num;
    }
}
