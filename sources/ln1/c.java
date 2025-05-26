package ln1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    private final int[] colorAttrRes;
    public static final c GRAYSCALE = new c("GRAYSCALE", 0, eo1.a.comp_spinner_grayscale_color);
    public static final c COLORFUL = new c("COLORFUL", 1, eo1.a.comp_spinner_color_background_1, eo1.a.comp_spinner_color_background_2, eo1.a.comp_spinner_color_background_3);
    public static final c WHITE = new c("WHITE", 2, eo1.a.comp_spinner_white_color);

    private static final /* synthetic */ c[] $values() {
        return new c[]{GRAYSCALE, COLORFUL, WHITE};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, int... iArr) {
        this.colorAttrRes = iArr;
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

    @NotNull
    public final int[] getColorAttrRes() {
        return this.colorAttrRes;
    }
}
