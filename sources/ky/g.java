package ky;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g CAROUSEL = new g("CAROUSEL", 0, 0);
    public static final g ITEM_GRID = new g("ITEM_GRID", 1, 1);
    public static final g OTHER = new g("OTHER", 2, 2);
    private final int value;

    private static final /* synthetic */ g[] $values() {
        return new g[]{CAROUSEL, ITEM_GRID, OTHER};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private g(String str, int i13, int i14) {
        this.value = i14;
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

    public final int getValue() {
        return this.value;
    }
}
