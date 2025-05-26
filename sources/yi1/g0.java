package yi1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 COLLAGE_FEED_BORDER = new g0("COLLAGE_FEED_BORDER", 0);
    public static final g0 NONE = new g0("NONE", 1);

    private static final /* synthetic */ g0[] $values() {
        return new g0[]{COLLAGE_FEED_BORDER, NONE};
    }

    static {
        g0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private g0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }
}
