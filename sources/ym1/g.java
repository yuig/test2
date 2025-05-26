package ym1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @NotNull
    public static final f Companion;
    public static final g DEFAULT = new g("DEFAULT", 0);
    public static final g NOTIFICATION = new g("NOTIFICATION", 1);

    private static final /* synthetic */ g[] $values() {
        return new g[]{DEFAULT, NOTIFICATION};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new f();
    }

    private g(String str, int i13) {
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
}
