package ww1;

import com.pinterest.partnerAnalytics.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ENGAGEMENT;
    public static final c ENGAGEMENT_RATE;
    public static final c ENGAGERS;
    public static final c IMPRESSION;
    public static final c OUTBOUND_CLICK;
    public static final c OUTBOUND_CLICK_RATE;
    public static final c PIN_CLICK;
    public static final c PIN_CLICK_RATE;
    public static final c PRODUCT_TAG_CLICK;
    public static final c PRODUCT_TAG_IMPRESSION;
    public static final c PRODUCT_TAG_OUTBOUND_CLICK;
    public static final c PRODUCT_TAG_SAVE;
    public static final c PROFILE_VISIT;
    public static final c QUARTILE_95_PERCENT_VIEW;
    public static final c SAVE;
    public static final c SAVE_RATE;
    public static final c TOTAL_AUDIENCE;
    public static final c USER_FOLLOW;
    public static final c VIDEO_10S_VIEW;
    public static final c VIDEO_AVG_WATCH_TIME;
    public static final c VIDEO_MRC_VIEW;
    public static final c VIDEO_V50_WATCH_TIME;
    private final int description;
    private final boolean isAVideoMetric;
    private final boolean isProductTagMetric;

    @NotNull
    private final a metricFormatType;
    private final int metricInfo;
    private final boolean showLegendValue;

    private static final /* synthetic */ c[] $values() {
        return new c[]{IMPRESSION, ENGAGEMENT, PIN_CLICK, OUTBOUND_CLICK, SAVE, ENGAGEMENT_RATE, PIN_CLICK_RATE, OUTBOUND_CLICK_RATE, SAVE_RATE, TOTAL_AUDIENCE, ENGAGERS, PROFILE_VISIT, USER_FOLLOW, VIDEO_MRC_VIEW, QUARTILE_95_PERCENT_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, VIDEO_10S_VIEW, PRODUCT_TAG_IMPRESSION, PRODUCT_TAG_CLICK, PRODUCT_TAG_SAVE, PRODUCT_TAG_OUTBOUND_CLICK};
    }

    static {
        boolean z13 = false;
        boolean z14 = false;
        IMPRESSION = new c("IMPRESSION", 0, g.impressions_label, g.about_impressions_label, null, false, z13, z14, 60, null);
        boolean z15 = false;
        boolean z16 = false;
        a aVar = null;
        boolean z17 = false;
        int i13 = 60;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ENGAGEMENT = new c("ENGAGEMENT", 1, g.engagements_label, g.about_engagements_label, aVar, z17, z15, z16, i13, defaultConstructorMarker);
        boolean z18 = false;
        a aVar2 = null;
        int i14 = 60;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        PIN_CLICK = new c("PIN_CLICK", 2, g.pin_clicks_label, g.about_pin_clicks_label, aVar2, z13, z14, z18, i14, defaultConstructorMarker2);
        OUTBOUND_CLICK = new c("OUTBOUND_CLICK", 3, g.outbound_clicks_label, g.about_outbound_clicks_label, aVar, z17, z15, z16, i13, defaultConstructorMarker);
        SAVE = new c("SAVE", 4, g.saves_label, g.about_saves_label, aVar2, z13, z14, z18, i14, defaultConstructorMarker2);
        int i15 = g.engagement_rate_label;
        int i16 = g.about_engagement_rate_label;
        a aVar3 = a.PERCENTAGE;
        ENGAGEMENT_RATE = new c("ENGAGEMENT_RATE", 5, i15, i16, aVar3, z17, z15, z16, 56, defaultConstructorMarker);
        int i17 = 56;
        PIN_CLICK_RATE = new c("PIN_CLICK_RATE", 6, g.pin_click_rate_label, g.about_pin_click_rate_label, aVar3, z13, z14, z18, i17, defaultConstructorMarker2);
        OUTBOUND_CLICK_RATE = new c("OUTBOUND_CLICK_RATE", 7, g.outboun_click_rate_label, g.about_outbound_click_rate_label, aVar3, z13, z14, z18, i17, defaultConstructorMarker2);
        SAVE_RATE = new c("SAVE_RATE", 8, g.save_rate_label, g.about_save_rate_label, aVar3, z13, z14, z18, i17, defaultConstructorMarker2);
        a aVar4 = null;
        int i18 = 60;
        TOTAL_AUDIENCE = new c("TOTAL_AUDIENCE", 9, g.total_audience_label, g.about_total_audience_label, aVar4, z17, z15, z16, i18, defaultConstructorMarker);
        a aVar5 = null;
        int i19 = 60;
        ENGAGERS = new c("ENGAGERS", 10, g.engaged_audience_label, g.about_engaged_audience_label, aVar5, z13, z14, z18, i19, defaultConstructorMarker2);
        PROFILE_VISIT = new c("PROFILE_VISIT", 11, g.pin_stats_profile_visits_label, g.pin_stats_profile_visits_description, aVar4, z17, z15, z16, i18, defaultConstructorMarker);
        USER_FOLLOW = new c("USER_FOLLOW", 12, g.pin_stats_follows_label, g.pin_stats_follows_description, aVar5, z13, z14, z18, i19, defaultConstructorMarker2);
        boolean z19 = true;
        VIDEO_MRC_VIEW = new c("VIDEO_MRC_VIEW", 13, g.video_views_label, g.video_views_description, aVar4, z17, z19, z16, 44, defaultConstructorMarker);
        boolean z23 = true;
        QUARTILE_95_PERCENT_VIEW = new c("QUARTILE_95_PERCENT_VIEW", 14, g.video_95_viewed_label, g.video_95_viewed_description, aVar5, z13, z23, z18, 44, defaultConstructorMarker2);
        VIDEO_AVG_WATCH_TIME = new c("VIDEO_AVG_WATCH_TIME", 15, g.video_avg_watch_time_label, g.video_avg_watch_time_description, a.TIME, z17, z19, z16, 40, defaultConstructorMarker);
        VIDEO_V50_WATCH_TIME = new c("VIDEO_V50_WATCH_TIME", 16, g.video_total_watch_time_label, g.video_total_watch_time_description, a.MINUTES, z13, z23, z18, 40, defaultConstructorMarker2);
        a aVar6 = null;
        VIDEO_10S_VIEW = new c("VIDEO_10S_VIEW", 17, g.video_10s_video_plays_label, g.video_10s_video_plays_description, aVar6, z17, z19, z16, 44, defaultConstructorMarker);
        boolean z24 = false;
        boolean z25 = true;
        a aVar7 = null;
        int i23 = 28;
        PRODUCT_TAG_IMPRESSION = new c("PRODUCT_TAG_IMPRESSION", 18, g.product_tag_impressions, g.product_tag_impressions_definition, aVar7, z13, z24, z25, i23, defaultConstructorMarker2);
        boolean z26 = false;
        boolean z27 = true;
        int i24 = 28;
        PRODUCT_TAG_CLICK = new c("PRODUCT_TAG_CLICK", 19, g.product_tag_clicks, g.product_tag_clicks_definition, aVar6, z17, z26, z27, i24, defaultConstructorMarker);
        PRODUCT_TAG_SAVE = new c("PRODUCT_TAG_SAVE", 20, g.product_tag_saves, g.product_tag_saves_definition, aVar7, z13, z24, z25, i23, defaultConstructorMarker2);
        PRODUCT_TAG_OUTBOUND_CLICK = new c("PRODUCT_TAG_OUTBOUND_CLICK", 21, g.product_tag_outbound_clicks, g.product_tag_outbound_clicks_definition, aVar6, z17, z26, z27, i24, defaultConstructorMarker);
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ c(String str, int i13, int i14, int i15, a aVar, boolean z13, boolean z14, boolean z15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, i14, i15, (i16 & 4) != 0 ? a.NUMBER : aVar, (i16 & 8) != 0 ? true : z13, (i16 & 16) != 0 ? false : z14, (i16 & 32) != 0 ? false : z15);
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

    @NotNull
    public final a getMetricFormatType() {
        return this.metricFormatType;
    }

    public final int getMetricInfo() {
        return this.metricInfo;
    }

    public final boolean getShowLegendValue() {
        return this.showLegendValue;
    }

    public final boolean isAVideoMetric() {
        return this.isAVideoMetric;
    }

    public final boolean isProductTagMetric() {
        return this.isProductTagMetric;
    }

    private c(String str, int i13, int i14, int i15, a aVar, boolean z13, boolean z14, boolean z15) {
        this.description = i14;
        this.metricInfo = i15;
        this.metricFormatType = aVar;
        this.showLegendValue = z13;
        this.isAVideoMetric = z14;
        this.isProductTagMetric = z15;
    }
}
