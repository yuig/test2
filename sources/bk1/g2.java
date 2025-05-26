package bk1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g2[] $VALUES;
    public static final g2 Tooltip = new g2("Tooltip", 0);
    public static final g2 Comprehensive = new g2("Comprehensive", 1);
    public static final g2 InterceptedByTouchHandler = new g2("InterceptedByTouchHandler", 2);
    public static final g2 Other = new g2("Other", 3);

    private static final /* synthetic */ g2[] $values() {
        return new g2[]{Tooltip, Comprehensive, InterceptedByTouchHandler, Other};
    }

    static {
        g2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private g2(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g2 valueOf(String str) {
        return (g2) Enum.valueOf(g2.class, str);
    }

    public static g2[] values() {
        return (g2[]) $VALUES.clone();
    }
}
