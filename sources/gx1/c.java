package gx1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c FEMALE = new c("FEMALE", 0, "Female", com.pinterest.partnerAnalytics.g.audience_insights_gender_female, com.pinterest.partnerAnalytics.b.audience_blue_color);
    public static final c MALE = new c("MALE", 1, "Male", com.pinterest.partnerAnalytics.g.audience_insights_gender_male, com.pinterest.partnerAnalytics.b.orange);
    public static final c UNKNOWN = new c("UNKNOWN", 2, "UNKNOWN", com.pinterest.partnerAnalytics.g.audience_insights_gender_others, com.pinterest.partnerAnalytics.b.purple);
    private final int color;
    private final int label;

    @NotNull
    private final String mapKey;

    private static final /* synthetic */ c[] $values() {
        return new c[]{FEMALE, MALE, UNKNOWN};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, String str2, int i14, int i15) {
        this.mapKey = str2;
        this.label = i14;
        this.color = i15;
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

    public final int getColor() {
        return this.color;
    }

    public final int getLabel() {
        return this.label;
    }

    @NotNull
    public final String getMapKey() {
        return this.mapKey;
    }
}
