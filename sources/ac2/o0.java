package ac2;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;
    public static final o0 GRID_TO_CLOSEUP_TRANSITION = new o0("GRID_TO_CLOSEUP_TRANSITION", 0);

    private static final /* synthetic */ o0[] $values() {
        return new o0[]{GRID_TO_CLOSEUP_TRANSITION};
    }

    static {
        o0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private o0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) $VALUES.clone();
    }
}
