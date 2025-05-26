package zx;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    private final int description;
    public static final h ALL = new h("ALL", 0, gy1.a.analytics_filter_all);
    public static final h MOBILE = new h("MOBILE", 1, gy1.a.analytics_filter_mobile);
    public static final h WEB = new h("WEB", 2, gy1.a.analytics_filter_desktop);
    public static final h TABLET = new h("TABLET", 3, gy1.a.analytics_filter_tablet);

    private static final /* synthetic */ h[] $values() {
        return new h[]{ALL, MOBILE, WEB, TABLET};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private h(String str, int i13, int i14) {
        this.description = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final int getDescription() {
        return this.description;
    }
}
