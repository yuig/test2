package rl1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class r {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    private final int textSize;
    private final int value;
    public static final r XS = new r("XS", 0, eo1.a.comp_avatar_xs_size, eo1.a.comp_avatar_xs_non_image_text_size);
    public static final r SM = new r("SM", 1, eo1.a.comp_avatar_sm_size, eo1.a.comp_avatar_sm_non_image_text_size);
    public static final r MD = new r("MD", 2, eo1.a.comp_avatar_md_size, eo1.a.comp_avatar_md_non_image_text_size);
    public static final r LG = new r("LG", 3, eo1.a.comp_avatar_lg_size, eo1.a.comp_avatar_lg_non_image_text_size);
    public static final r XL = new r("XL", 4, eo1.a.comp_avatar_xl_size, eo1.a.comp_avatar_xl_non_image_text_size);
    public static final r XXL = new r("XXL", 5, eo1.a.comp_avatar_xxl_size, eo1.a.comp_avatar_xxl_non_image_text_size);
    public static final r CI = new r("CI", 6, eo1.a.space_500, eo1.a.comp_avatar_sm_non_image_text_size);

    private static final /* synthetic */ r[] $values() {
        return new r[]{XS, SM, MD, LG, XL, XXL, CI};
    }

    static {
        r[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private r(String str, int i13, int i14, int i15) {
        this.value = i14;
        this.textSize = i15;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final int getValue() {
        return this.value;
    }
}
