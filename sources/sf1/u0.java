package sf1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class u0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ u0[] $VALUES;

    @NotNull
    public static final t0 Companion;
    public static final u0 SAVE = new u0("SAVE", 0);
    public static final u0 FOLLOW = new u0("FOLLOW", 1);
    public static final u0 STATS = new u0("STATS", 2);

    private static final /* synthetic */ u0[] $values() {
        return new u0[]{SAVE, FOLLOW, STATS};
    }

    static {
        u0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new t0();
    }

    private u0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) $VALUES.clone();
    }
}
