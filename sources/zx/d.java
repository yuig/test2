package zx;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ALL = new d("ALL", 0, gy1.a.analytics_filter_all);
    public static final d ORGANIC = new d("ORGANIC", 1, gy1.a.analytics_filter_organic);
    public static final d PAID_AND_EARNED = new d("PAID_AND_EARNED", 2, gy1.a.analytics_filter_paid_and_earned);
    private final int description;

    private static final /* synthetic */ d[] $values() {
        return new d[]{ALL, ORGANIC, PAID_AND_EARNED};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13, int i14) {
        this.description = i14;
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

    public final int getDescription() {
        return this.description;
    }
}
