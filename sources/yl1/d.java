package yl1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    private final g colorPalette;
    public static final d PRIMARY = new d("PRIMARY", 0, i.a());
    public static final d SECONDARY = new d("SECONDARY", 1, i.b());
    public static final d TERTIARY = new d("TERTIARY", 2, (g) i.f139337c.getValue());
    public static final d SELECTED = new d("SELECTED", 3, i.c());
    public static final d SHOPPING = new d("SHOPPING", 4, (g) i.f139339e.getValue());
    public static final d TRANSPARENT = new d("TRANSPARENT", 5, i.d());
    public static final d ALWAYS_LIGHT = new d("ALWAYS_LIGHT", 6, (g) i.f139341g.getValue());
    public static final d ALWAYS_DARK = new d("ALWAYS_DARK", 7, (g) i.f139342h.getValue());

    private static final /* synthetic */ d[] $values() {
        return new d[]{PRIMARY, SECONDARY, TERTIARY, SELECTED, SHOPPING, TRANSPARENT, ALWAYS_LIGHT, ALWAYS_DARK};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13, g gVar) {
        this.colorPalette = gVar;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @NotNull
    public final g getColorPalette() {
        return this.colorPalette;
    }
}
