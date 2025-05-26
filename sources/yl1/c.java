package yl1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c LARGE;
    public static final c SMALL;
    private final int minHeight;
    private final int paddingBottom;
    private final int paddingEnd;
    private final int paddingStart;
    private final int paddingTop;
    private final int roundBackground;
    private final int textSize;
    private final int textSpacingMultiplier;

    private static final /* synthetic */ c[] $values() {
        return new c[]{LARGE, SMALL};
    }

    static {
        int i13 = eo1.a.comp_button_large_min_height;
        int i14 = eo1.a.comp_button_large_horizontal_padding;
        int i15 = eo1.a.comp_button_large_vertical_padding;
        LARGE = new c("LARGE", 0, i13, i14, i14, i15, i15, xl1.d.large_button_background_ripple, eo1.a.comp_button_large_text_size, eo1.a.comp_button_large_line_height);
        int i16 = eo1.a.comp_button_small_min_height;
        int i17 = eo1.a.comp_button_small_horizontal_padding;
        int i18 = eo1.a.comp_button_small_vertical_padding;
        SMALL = new c("SMALL", 1, i16, i17, i17, i18, i18, xl1.d.small_button_background_ripple, eo1.a.comp_button_small_text_size, eo1.a.comp_button_small_text_line_height);
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23, int i24) {
        this.minHeight = i14;
        this.paddingStart = i15;
        this.paddingEnd = i16;
        this.paddingTop = i17;
        this.paddingBottom = i18;
        this.roundBackground = i19;
        this.textSize = i23;
        this.textSpacingMultiplier = i24;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getMinHeight() {
        return this.minHeight;
    }

    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    public final int getPaddingEnd() {
        return this.paddingEnd;
    }

    public final int getPaddingStart() {
        return this.paddingStart;
    }

    public final int getPaddingTop() {
        return this.paddingTop;
    }

    public final int getRoundBackground() {
        return this.roundBackground;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final int getTextSpacingMultiplier() {
        return this.textSpacingMultiplier;
    }
}
