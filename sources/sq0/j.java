package sq0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j RELATED_PINS = new j("RELATED_PINS", 0);
    public static final j SEARCH = new j("SEARCH", 1);
    public static final j UNKNOWN = new j("UNKNOWN", 2);

    private static final /* synthetic */ j[] $values() {
        return new j[]{RELATED_PINS, SEARCH, UNKNOWN};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private j(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
