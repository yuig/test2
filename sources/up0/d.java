package up0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d NONE = new d("NONE", 0);
    public static final d UNDERLINE_BLUE = new d("UNDERLINE_BLUE", 1);
    public static final d UNDERLINE_BLACK = new d("UNDERLINE_BLACK", 2);

    private static final /* synthetic */ d[] $values() {
        return new d[]{NONE, UNDERLINE_BLUE, UNDERLINE_BLACK};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13) {
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
}
