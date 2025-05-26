package ju;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class g {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @NotNull
    public static final f Companion;

    @NotNull
    private static final c[] VALUES;
    private final int value;
    public static final g COUNTRY = new g("COUNTRY", 0, 1);
    public static final g DATE_OF_BIRTH_MONTH = new g("DATE_OF_BIRTH_MONTH", 1, 2);

    private static final /* synthetic */ g[] $values() {
        return new g[]{COUNTRY, DATE_OF_BIRTH_MONTH};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new f();
        VALUES = c.values();
    }

    private g(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
