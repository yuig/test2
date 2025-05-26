package rm1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    private final int dimenAttrRes;
    public static final i XS = new i("XS", 0, eo1.a.comp_icon_size_xs);
    public static final i SM = new i("SM", 1, eo1.a.comp_icon_size_sm);
    public static final i MD = new i("MD", 2, eo1.a.comp_icon_size_md);
    public static final i LG = new i("LG", 3, eo1.a.comp_icon_size_lg);
    public static final i XL = new i("XL", 4, eo1.a.comp_icon_size_xl);

    @xk2.d
    public static final i XXL = new i("XXL", 5, eo1.a.comp_icon_size_xxl);

    private static final /* synthetic */ i[] $values() {
        return new i[]{XS, SM, MD, LG, XL, XXL};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private i(String str, int i13, int i14) {
        this.dimenAttrRes = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final int getDimenAttrRes() {
        return this.dimenAttrRes;
    }
}
