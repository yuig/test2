package om1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    private final int backgroundColor;
    private final int iconColor;
    public static final f DEFAULT_DARK_GRAY = new f("DEFAULT_DARK_GRAY", 0, eo1.a.comp_iconbutton_dark_gray_background_color, eo1.a.comp_iconbutton_dark_gray_icon_color);
    public static final f TRANSPARENT_DARK_GRAY = new f("TRANSPARENT_DARK_GRAY", 1, eo1.a.comp_iconbutton_transparent_background_color, eo1.a.comp_iconbutton_transparent_icon_color);
    public static final f WASH_DARK_GRAY = new f("WASH_DARK_GRAY", 2, eo1.a.comp_iconbutton_dark_wash_background_color, eo1.a.comp_iconbutton_dark_wash_icon_color);
    public static final f DEFAULT_WHITE = new f("DEFAULT_WHITE", 3, eo1.a.comp_iconbutton_white_background_color, eo1.a.comp_iconbutton_white_icon_color);
    public static final f TRANSPARENT_WHITE = new f("TRANSPARENT_WHITE", 4, eo1.a.comp_iconbutton_transparent_background_color, eo1.a.comp_iconbutton_transparent_white_icon_color);
    public static final f TRANSPARENT_ALWAYS_LIGHT = new f("TRANSPARENT_ALWAYS_LIGHT", 5, eo1.a.comp_iconbutton_transparent_background_color, eo1.a.comp_iconbutton_transparent_always_light_icon_color);
    public static final f WASH_WHITE = new f("WASH_WHITE", 6, eo1.a.comp_iconbutton_white_wash_background_color, eo1.a.comp_iconbutton_white_wash_icon_color);
    public static final f DEFAULT_RED = new f("DEFAULT_RED", 7, eo1.a.comp_iconbutton_red_background_color, eo1.a.comp_iconbutton_red_icon_color);
    public static final f TRANSPARENT_RED = new f("TRANSPARENT_RED", 8, eo1.a.comp_iconbutton_transparent_background_color, eo1.a.comp_iconbutton_transparent_red_icon_color);
    public static final f DEFAULT_GRAY = new f("DEFAULT_GRAY", 9, eo1.a.comp_iconbutton_gray_background_color, eo1.a.comp_iconbutton_gray_icon_color);
    public static final f TRANSPARENT_GRAY = new f("TRANSPARENT_GRAY", 10, eo1.a.comp_iconbutton_transparent_background_color, eo1.a.comp_iconbutton_transparent_gray_icon_color);
    public static final f DEFAULT_LIGHT_GRAY = new f("DEFAULT_LIGHT_GRAY", 11, eo1.a.comp_iconbutton_light_gray_background_color, eo1.a.comp_iconbutton_light_gray_icon_color);
    public static final f DEFAULT_ALWAYS_DARK = new f("DEFAULT_ALWAYS_DARK", 12, eo1.a.comp_iconbutton_always_dark_background_color, eo1.a.comp_iconbutton_always_dark_icon_color);
    public static final f DEFAULT_ALWAYS_LIGHT = new f("DEFAULT_ALWAYS_LIGHT", 13, eo1.a.comp_iconbutton_always_light_background_color, eo1.a.comp_iconbutton_always_light_icon_color);
    public static final f TRANSPARENT_ALWAYS_DARK = new f("TRANSPARENT_ALWAYS_DARK", 14, eo1.a.comp_iconbutton_transparent_background_color, eo1.a.comp_iconbutton_transparent_always_dark_icon_color);
    public static final f WASH_50_OPACITY_LIGHT = new f("WASH_50_OPACITY_LIGHT", 15, eo1.a.custom_comp_icon_background_wash_light_opacity_50, eo1.a.comp_iconbutton_white_icon_color);

    private static final /* synthetic */ f[] $values() {
        return new f[]{DEFAULT_DARK_GRAY, TRANSPARENT_DARK_GRAY, WASH_DARK_GRAY, DEFAULT_WHITE, TRANSPARENT_WHITE, TRANSPARENT_ALWAYS_LIGHT, WASH_WHITE, DEFAULT_RED, TRANSPARENT_RED, DEFAULT_GRAY, TRANSPARENT_GRAY, DEFAULT_LIGHT_GRAY, DEFAULT_ALWAYS_DARK, DEFAULT_ALWAYS_LIGHT, TRANSPARENT_ALWAYS_DARK, WASH_50_OPACITY_LIGHT};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private f(String str, int i13, int i14, int i15) {
        this.backgroundColor = i14;
        this.iconColor = i15;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final int getBackgroundColor$iconbutton_release() {
        return this.backgroundColor;
    }

    public final int getIconColor$iconbutton_release() {
        return this.iconColor;
    }
}
