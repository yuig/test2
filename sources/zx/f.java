package zx;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    private final int description;
    public static final f HOURS_24 = new f("HOURS_24", 0, gy1.a.analytics_last_24_hours);
    public static final f DAYS_7 = new f("DAYS_7", 1, gy1.a.analytics_last_7_days);
    public static final f DAYS_14 = new f("DAYS_14", 2, gy1.a.analytics_last_14_days);
    public static final f DAYS_21 = new f("DAYS_21", 3, gy1.a.analytics_last_21_days);
    public static final f DAYS_30 = new f("DAYS_30", 4, gy1.a.analytics_last_30_days);
    public static final f DAYS_60 = new f("DAYS_60", 5, gy1.a.analytics_last_60_days);
    public static final f DAYS_90 = new f("DAYS_90", 6, gy1.a.analytics_last_90_days);
    public static final f CUSTOM = new f("CUSTOM", 7, gy1.a.filter_custom);

    private static final /* synthetic */ f[] $values() {
        return new f[]{HOURS_24, DAYS_7, DAYS_14, DAYS_21, DAYS_30, DAYS_60, DAYS_90, CUSTOM};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private f(String str, int i13, int i14) {
        this.description = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final int getDescription() {
        return this.description;
    }
}
