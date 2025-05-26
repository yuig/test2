package ym1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class u {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u DISMISSED = new u("DISMISSED", 0);
    public static final u POPOVER_POSITION_NOT_RESOLVED = new u("POPOVER_POSITION_NOT_RESOLVED", 1);

    private static final /* synthetic */ u[] $values() {
        return new u[]{DISMISSED, POPOVER_POSITION_NOT_RESOLVED};
    }

    static {
        u[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private u(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
