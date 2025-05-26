package zp;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;

    @NotNull
    public static final h0 Companion;
    public static final i0 SCHEDULED_PIN = new i0("SCHEDULED_PIN", 0);

    private static final /* synthetic */ i0[] $values() {
        return new i0[]{SCHEDULED_PIN};
    }

    static {
        i0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new h0();
    }

    private i0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }
}
