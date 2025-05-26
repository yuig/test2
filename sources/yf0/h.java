package yf0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h SYSTEM_BARS = new h("SYSTEM_BARS", 0);
    public static final h STATUS_BAR = new h("STATUS_BAR", 1);
    public static final h NAVIGATION_BAR = new h("NAVIGATION_BAR", 2);
    public static final h NONE = new h("NONE", 3);

    private static final /* synthetic */ h[] $values() {
        return new h[]{SYSTEM_BARS, STATUS_BAR, NAVIGATION_BAR, NONE};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private h(String str, int i13) {
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
}
