package bm1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o LARGE = new o("LARGE", 0, a0.GestaltButtonToggleText_LG, eo1.a.comp_buttontoggle_default_lg_icon_size, null, eo1.a.comp_buttontoggle_default_lg_rounding);
    public static final o SMALL = new o("SMALL", 1, a0.GestaltButtonToggleText_SM, eo1.a.comp_buttontoggle_default_sm_icon_size, Integer.valueOf(eo1.a.comp_buttontoggle_default_sm_height), eo1.a.comp_buttontoggle_default_sm_rounding);
    private final Integer buttonHeight;
    private final int cornerRadius;
    private final int iconSize;
    private final int textAppearance;

    private static final /* synthetic */ o[] $values() {
        return new o[]{LARGE, SMALL};
    }

    static {
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private o(String str, int i13, int i14, int i15, Integer num, int i16) {
        this.textAppearance = i14;
        this.iconSize = i15;
        this.buttonHeight = num;
        this.cornerRadius = i16;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final Integer getButtonHeight() {
        return this.buttonHeight;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final int getIconSize() {
        return this.iconSize;
    }

    public final int getTextAppearance() {
        return this.textAppearance;
    }
}
