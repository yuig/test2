package x21;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h SEQUENTIAL = new h("SEQUENTIAL", 0);
    public static final h FIRST_VISIBLE = new h("FIRST_VISIBLE", 1);
    public static final h ALL_VISIBLE = new h("ALL_VISIBLE", 2);

    private static final /* synthetic */ h[] $values() {
        return new h[]{SEQUENTIAL, FIRST_VISIBLE, ALL_VISIBLE};
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
