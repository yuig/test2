package rg0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 BOARD_PICKER = new h0("BOARD_PICKER", 0);
    public static final h0 BOARDLESS = new h0("BOARDLESS", 1);
    public static final h0 OTHER = new h0("OTHER", 2);

    private static final /* synthetic */ h0[] $values() {
        return new h0[]{BOARD_PICKER, BOARDLESS, OTHER};
    }

    static {
        h0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private h0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }
}
