package zx;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    private final int description;
    public static final k ALL_PINS = new k("ALL_PINS", 0, gy1.a.analytics_filter_allpins);
    public static final k YOUR_PINS = new k("YOUR_PINS", 1, gy1.a.analytics_filter_yourpins);
    public static final k OTHER_PINS = new k("OTHER_PINS", 2, gy1.a.analytics_filter_otherpins);

    private static final /* synthetic */ k[] $values() {
        return new k[]{ALL_PINS, YOUR_PINS, OTHER_PINS};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private k(String str, int i13, int i14) {
        this.description = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public final int getDescription() {
        return this.description;
    }
}
