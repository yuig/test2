package rl1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m LG;
    public static final m MD;
    public static final m SM;
    public static final m XL;
    public static final m XS;
    public static final m XXL;
    private final int avatarSize;

    @NotNull
    private final lm1.g font;
    private final int textSize;

    private static final /* synthetic */ m[] $values() {
        return new m[]{XXL, XL, LG, MD, SM, XS};
    }

    static {
        int i13 = eo1.a.comp_avatar_xxl_size;
        int i14 = eo1.a.comp_avatar_xxl_non_image_text_size;
        lm1.g gVar = lm1.g.MEDIUM;
        XXL = new m("XXL", 0, i13, i14, gVar);
        XL = new m("XL", 1, eo1.a.comp_avatar_xl_size, eo1.a.comp_avatar_xl_non_image_text_size, gVar);
        LG = new m("LG", 2, eo1.a.comp_avatar_lg_size, eo1.a.comp_avatar_lg_non_image_text_size, gVar);
        MD = new m("MD", 3, eo1.a.comp_avatar_md_size, eo1.a.comp_avatar_md_non_image_text_size, gVar);
        SM = new m("SM", 4, eo1.a.comp_avatar_sm_size, eo1.a.comp_avatar_sm_non_image_text_size, gVar);
        XS = new m("XS", 5, eo1.a.comp_avatar_xs_size, eo1.a.comp_avatar_xs_non_image_text_size, gVar);
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private m(String str, int i13, int i14, int i15, lm1.g gVar) {
        this.avatarSize = i14;
        this.textSize = i15;
        this.font = gVar;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final int getAvatarSize() {
        return this.avatarSize;
    }

    @NotNull
    public final lm1.g getFont() {
        return this.font;
    }

    public final int getTextSize() {
        return this.textSize;
    }
}
