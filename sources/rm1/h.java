package rm1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    private final int dimenAttrRes;
    public static final h XS = new h("XS", 0, eo1.a.comp_icon_compact_size_xs);
    public static final h SM = new h("SM", 1, eo1.a.comp_icon_compact_size_sm);
    public static final h MD = new h("MD", 2, eo1.a.comp_icon_compact_size_md);
    public static final h LG = new h("LG", 3, eo1.a.comp_icon_compact_size_lg);

    private static final /* synthetic */ h[] $values() {
        return new h[]{XS, SM, MD, LG};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private h(String str, int i13, int i14) {
        this.dimenAttrRes = i14;
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

    public final int getDimenAttrRes() {
        return this.dimenAttrRes;
    }
}
