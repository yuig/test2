package rm1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    private final int colorAttrRes;
    public static final c DEFAULT = new c("DEFAULT", 0, eo1.a.comp_icon_color_default);
    public static final c SUBTLE = new c("SUBTLE", 1, eo1.a.comp_icon_color_subtle);
    public static final c DISABLED = new c("DISABLED", 2, eo1.a.comp_icon_color_disabled);
    public static final c INVERSE = new c("INVERSE", 3, eo1.a.comp_icon_color_inverse);
    public static final c INFO = new c("INFO", 4, eo1.a.comp_icon_color_info);
    public static final c SUCCESS = new c("SUCCESS", 5, eo1.a.comp_icon_color_success);
    public static final c WARNING = new c("WARNING", 6, eo1.a.comp_icon_color_warning);
    public static final c ERROR = new c("ERROR", 7, eo1.a.comp_icon_color_error);
    public static final c RECOMMENDATION = new c("RECOMMENDATION", 8, eo1.a.comp_icon_color_recommendation);
    public static final c BRAND = new c("BRAND", 9, eo1.a.comp_icon_color_primary);
    public static final c LIGHT = new c("LIGHT", 10, eo1.a.comp_icon_color_light);
    public static final c DARK = new c("DARK", 11, eo1.a.comp_icon_color_dark);
    public static final c VERIFIED_PINNER = new c("VERIFIED_PINNER", 12, eo1.a.comp_icon_color_verified_pinner);
    public static final c VERIFIED_MERCHANT = new c("VERIFIED_MERCHANT", 13, eo1.a.comp_icon_color_verified_merchant);

    private static final /* synthetic */ c[] $values() {
        return new c[]{DEFAULT, SUBTLE, DISABLED, INVERSE, INFO, SUCCESS, WARNING, ERROR, RECOMMENDATION, BRAND, LIGHT, DARK, VERIFIED_PINNER, VERIFIED_MERCHANT};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, int i14) {
        this.colorAttrRes = i14;
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

    public final int getColorAttrRes() {
        return this.colorAttrRes;
    }
}
