package zx;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FILTER_OVERVIEW = new a("FILTER_OVERVIEW", 0, "FILTER_OVERVIEW");
    public static final a FILTER_PIN_STATS = new a("FILTER_PIN_STATS", 1, "FILTER_PIN_STATS");

    @NotNull
    private final String keyName;

    private static final /* synthetic */ a[] $values() {
        return new a[]{FILTER_OVERVIEW, FILTER_PIN_STATS};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, String str2) {
        this.keyName = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @NotNull
    public final String getKeyName() {
        return this.keyName;
    }
}
