package ds;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final int value;
    public static final b UNKNOWN = new b("UNKNOWN", 0, 1);
    public static final b WIFI = new b("WIFI", 1, 3);
    public static final b CELLULAR_UNKNOWN = new b("CELLULAR_UNKNOWN", 2, 4);

    private static final /* synthetic */ b[] $values() {
        return new b[]{UNKNOWN, WIFI, CELLULAR_UNKNOWN};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
