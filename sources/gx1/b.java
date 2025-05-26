package gx1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final int label;

    @NotNull
    private final String mapKey;
    public static final b IPHONE = new b("IPHONE", 0, "IPHONE", com.pinterest.partnerAnalytics.g.analytics_audience_device_graph_label_iphone);
    public static final b IPAD = new b("IPAD", 1, "IPAD", com.pinterest.partnerAnalytics.g.analytics_audience_device_graph_label_ipad);
    public static final b ANDROID_MOBILE = new b("ANDROID_MOBILE", 2, "ANDROID_MOBILE", com.pinterest.partnerAnalytics.g.analytics_audience_device_graph_label_android_mobile);
    public static final b ANDROID_TABLET = new b("ANDROID_TABLET", 3, "ANDROID_TABLET", com.pinterest.partnerAnalytics.g.analytics_audience_device_graph_label_android_tablet);
    public static final b WEB_MOBILE = new b("WEB_MOBILE", 4, "WEB_MOBILE", com.pinterest.partnerAnalytics.g.analytics_audience_device_graph_label_mweb);
    public static final b WEB_DENZEL = new b("WEB_DENZEL", 5, "WEB_DENZEL", com.pinterest.partnerAnalytics.g.analytics_audience_device_graph_label_web);

    private static final /* synthetic */ b[] $values() {
        return new b[]{IPHONE, IPAD, ANDROID_MOBILE, ANDROID_TABLET, WEB_MOBILE, WEB_DENZEL};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, String str2, int i14) {
        this.mapKey = str2;
        this.label = i14;
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

    public final int getLabel() {
        return this.label;
    }

    @NotNull
    public final String getMapKey() {
        return this.mapKey;
    }
}
