package gx1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final int label;

    @NotNull
    private final String mapKey;
    public static final a AGE_18_24 = new a("AGE_18_24", 0, "18-24", com.pinterest.partnerAnalytics.g.audience_insights_age_18_24);
    public static final a AGE_25_34 = new a("AGE_25_34", 1, "25-34", com.pinterest.partnerAnalytics.g.audience_insights_age_25_34);
    public static final a AGE_35_44 = new a("AGE_35_44", 2, "35-44", com.pinterest.partnerAnalytics.g.audience_insights_age_35_44);
    public static final a AGE_45_54 = new a("AGE_45_54", 3, "45-54", com.pinterest.partnerAnalytics.g.audience_insights_age_45_54);
    public static final a AGE_45_49 = new a("AGE_45_49", 4, "45-49", com.pinterest.partnerAnalytics.g.audience_insights_age_45_49);
    public static final a AGE_50_54 = new a("AGE_50_54", 5, "50-54", com.pinterest.partnerAnalytics.g.audience_insights_age_50_54);
    public static final a AGE_55_64 = new a("AGE_55_64", 6, "55-64", com.pinterest.partnerAnalytics.g.audience_insights_age_55_64);
    public static final a AGE_65_ = new a("AGE_65_", 7, "65+", com.pinterest.partnerAnalytics.g.audience_insights_age_65);

    private static final /* synthetic */ a[] $values() {
        return new a[]{AGE_18_24, AGE_25_34, AGE_35_44, AGE_45_54, AGE_45_49, AGE_50_54, AGE_55_64, AGE_65_};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, String str2, int i14) {
        this.mapKey = str2;
        this.label = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int getLabel() {
        return this.label;
    }

    @NotNull
    public final String getMapKey() {
        return this.mapKey;
    }
}
