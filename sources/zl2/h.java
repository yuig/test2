package zl2;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h FROM_DEPENDENCIES = new h("FROM_DEPENDENCIES", 0);
    public static final h FROM_CLASS_LOADER = new h("FROM_CLASS_LOADER", 1);
    public static final h FALLBACK = new h("FALLBACK", 2);

    private static final /* synthetic */ h[] $values() {
        return new h[]{FROM_DEPENDENCIES, FROM_CLASS_LOADER, FALLBACK};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private h(String str, int i13) {
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
