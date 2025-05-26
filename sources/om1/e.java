package om1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    private final int backgroundSize;
    private final int borderRadius;
    private final int iconSize;
    private final int indicatorPlacement;
    public static final e XL = new e("XL", 0, eo1.a.comp_iconbutton_xl_icon_size, eo1.a.comp_iconbutton_xl_background_size, eo1.a.comp_iconbutton_xl_rounding, eo1.a.comp_iconbutton_xl_indicator_placement);
    public static final e LG = new e("LG", 1, eo1.a.comp_iconbutton_lg_icon_size, eo1.a.comp_iconbutton_lg_background_size, eo1.a.comp_iconbutton_lg_rounding, eo1.a.comp_iconbutton_lg_indicator_placement);
    public static final e MD = new e("MD", 2, eo1.a.comp_iconbutton_md_icon_size, eo1.a.comp_iconbutton_md_background_size, eo1.a.comp_iconbutton_md_rounding, eo1.a.comp_iconbutton_md_indicator_placement);
    public static final e SM = new e("SM", 3, eo1.a.comp_iconbutton_sm_icon_size, eo1.a.comp_iconbutton_sm_background_size, eo1.a.comp_iconbutton_sm_rounding, eo1.a.comp_iconbutton_sm_indicator_placement);

    private static final /* synthetic */ e[] $values() {
        return new e[]{XL, LG, MD, SM};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e(String str, int i13, int i14, int i15, int i16, int i17) {
        this.iconSize = i14;
        this.backgroundSize = i15;
        this.borderRadius = i16;
        this.indicatorPlacement = i17;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final int getBackgroundSize() {
        return this.backgroundSize;
    }

    public final int getBorderRadius() {
        return this.borderRadius;
    }

    public final int getIconSize$iconbutton_release() {
        return this.iconSize;
    }

    public final int getIndicatorPlacement() {
        return this.indicatorPlacement;
    }
}
