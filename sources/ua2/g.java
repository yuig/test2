package ua2;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g MUTED = new g("MUTED", 0);
    public static final g UNMUTED = new g("UNMUTED", 1);
    public static final g UNINITIALIZED = new g("UNINITIALIZED", 2);

    private static final /* synthetic */ g[] $values() {
        return new g[]{MUTED, UNMUTED, UNINITIALIZED};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
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
