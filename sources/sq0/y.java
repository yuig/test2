package sq0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y DOWN = new y("DOWN", 0);
    public static final y UP = new y("UP", 1);
    public static final y UNKNOWN = new y("UNKNOWN", 2);

    private static final /* synthetic */ y[] $values() {
        return new y[]{DOWN, UP, UNKNOWN};
    }

    static {
        y[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private y(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
