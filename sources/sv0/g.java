package sv0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    private final int size;
    public static final g ONE = new g("ONE", 0, 1);
    public static final g TWO = new g("TWO", 1, 2);
    public static final g THREE = new g("THREE", 2, 3);

    private static final /* synthetic */ g[] $values() {
        return new g[]{ONE, TWO, THREE};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private g(String str, int i13, int i14) {
        this.size = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final int getSize() {
        return this.size;
    }
}
