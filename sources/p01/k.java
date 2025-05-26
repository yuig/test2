package p01;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k UNFILTERED = new k("UNFILTERED", 0);
    public static final k FILTERED = new k("FILTERED", 1);

    private static final /* synthetic */ k[] $values() {
        return new k[]{UNFILTERED, FILTERED};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private k(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
