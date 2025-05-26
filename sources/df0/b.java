package df0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final int index;
    public static final b HUE = new b("HUE", 0, 0);
    public static final b SATURATION = new b("SATURATION", 1, 1);
    public static final b LIGHTNESS = new b("LIGHTNESS", 2, 2);

    private static final /* synthetic */ b[] $values() {
        return new b[]{HUE, SATURATION, LIGHTNESS};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, int i14) {
        this.index = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int getIndex() {
        return this.index;
    }
}
