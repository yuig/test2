package df0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    private final int index;
    public static final c HUE = new c("HUE", 0, 0);
    public static final c SATURATION = new c("SATURATION", 1, 1);
    public static final c BRIGHTNESS = new c("BRIGHTNESS", 2, 2);

    private static final /* synthetic */ c[] $values() {
        return new c[]{HUE, SATURATION, BRIGHTNESS};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, int i14) {
        this.index = i14;
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

    public final int getIndex() {
        return this.index;
    }
}
