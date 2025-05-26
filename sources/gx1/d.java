package gx1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    private final int friendlyName;

    @NotNull
    private final String paramName;
    public static final d TOTAL_AUDIENCE = new d("TOTAL_AUDIENCE", 0, com.pinterest.partnerAnalytics.g.total_audience_label, "impression_plus_engagement");
    public static final d ENGAGED_AUDIENCE = new d("ENGAGED_AUDIENCE", 1, com.pinterest.partnerAnalytics.g.engaged_audience_label, "engagement");

    private static final /* synthetic */ d[] $values() {
        return new d[]{TOTAL_AUDIENCE, ENGAGED_AUDIENCE};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13, int i14, String str2) {
        this.friendlyName = i14;
        this.paramName = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final int getFriendlyName() {
        return this.friendlyName;
    }

    @NotNull
    public final String getParamName() {
        return this.paramName;
    }
}
