package do2;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i2[] $VALUES;
    public static final i2 START = new i2("START", 0);
    public static final i2 STOP = new i2("STOP", 1);
    public static final i2 STOP_AND_RESET_REPLAY_CACHE = new i2("STOP_AND_RESET_REPLAY_CACHE", 2);

    private static final /* synthetic */ i2[] $values() {
        return new i2[]{START, STOP, STOP_AND_RESET_REPLAY_CACHE};
    }

    static {
        i2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private i2(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i2 valueOf(String str) {
        return (i2) Enum.valueOf(i2.class, str);
    }

    public static i2[] values() {
        return (i2[]) $VALUES.clone();
    }
}
