package cb2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class z {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z PIN = new z("PIN", 0);
    public static final z LIVE_STREAM = new z("LIVE_STREAM", 1);

    private static final /* synthetic */ z[] $values() {
        return new z[]{PIN, LIVE_STREAM};
    }

    static {
        z[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private z(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
