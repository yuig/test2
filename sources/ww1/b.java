package ww1;

import com.pinterest.partnerAnalytics.g;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final int label;
    public static final b OVERALL_METRICS = new b("OVERALL_METRICS", 0, g.overall_metrics_group);
    public static final b VIDEO_METRICS = new b("VIDEO_METRICS", 1, g.video_stats_metrics_group);
    public static final b PRODUCT_TAG_METRICS = new b("PRODUCT_TAG_METRICS", 2, g.product_tag_label);

    private static final /* synthetic */ b[] $values() {
        return new b[]{OVERALL_METRICS, VIDEO_METRICS, PRODUCT_TAG_METRICS};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, int i14) {
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
}
