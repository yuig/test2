package nn1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    private final f colorPalette;
    public static final c PRIMARY = new c("PRIMARY", 0, (f) h.f91574a.getValue());
    public static final c SECONDARY = new c("SECONDARY", 1, (f) h.f91575b.getValue());
    public static final c TERTIARY = new c("TERTIARY", 2, (f) h.f91576c.getValue());
    public static final c PARTIAL_SELECTED = new c("PARTIAL_SELECTED", 3, (f) h.f91577d.getValue());
    public static final c SELECTED = new c("SELECTED", 4, (f) h.f91578e.getValue());
    public static final c ALWAYS_LIGHT = new c("ALWAYS_LIGHT", 5, (f) h.f91579f.getValue());
    public static final c ALWAYS_DARK = new c("ALWAYS_DARK", 6, (f) h.f91580g.getValue());

    private static final /* synthetic */ c[] $values() {
        return new c[]{PRIMARY, SECONDARY, TERTIARY, PARTIAL_SELECTED, SELECTED, ALWAYS_LIGHT, ALWAYS_DARK};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, f fVar) {
        this.colorPalette = fVar;
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
    public final f getColorPalette() {
        return this.colorPalette;
    }
}
