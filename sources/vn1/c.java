package vn1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    private final int colorRes;
    public static final c DEFAULT = new c("DEFAULT", 0, eo1.a.comp_text_color_default);
    public static final c SUBTLE = new c("SUBTLE", 1, eo1.a.comp_text_color_subtle);
    public static final c DISABLED = new c("DISABLED", 2, eo1.a.comp_text_color_disabled);
    public static final c INFO = new c("INFO", 3, eo1.a.comp_text_color_info);
    public static final c SUCCESS = new c("SUCCESS", 4, eo1.a.comp_text_color_success);
    public static final c PRIMARY = new c("PRIMARY", 5, eo1.a.comp_text_color_primary);
    public static final c RECOMMENDATION = new c("RECOMMENDATION", 6, eo1.a.comp_text_color_recommendation);
    public static final c ERROR = new c("ERROR", 7, eo1.a.comp_text_color_error);
    public static final c WARNING = new c("WARNING", 8, eo1.a.comp_text_color_warning);
    public static final c INVERSE = new c("INVERSE", 9, eo1.a.comp_text_color_inverse);
    public static final c DARK = new c("DARK", 10, eo1.a.comp_text_color_dark);
    public static final c LIGHT = new c("LIGHT", 11, eo1.a.comp_text_color_light);

    @xk2.d
    public static final c SHOPPING = new c("SHOPPING", 12, eo1.a.comp_text_color_shopping);

    private static final /* synthetic */ c[] $values() {
        return new c[]{DEFAULT, SUBTLE, DISABLED, INFO, SUCCESS, PRIMARY, RECOMMENDATION, ERROR, WARNING, INVERSE, DARK, LIGHT, SHOPPING};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, int i14) {
        this.colorRes = i14;
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

    public final int getColorRes() {
        return this.colorRes;
    }
}
