package jc0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class r {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r BTN_DONE = new r("BTN_DONE", 0);
    public static final r UNKNOWN = new r("UNKNOWN", 1);

    private static final /* synthetic */ r[] $values() {
        return new r[]{BTN_DONE, UNKNOWN};
    }

    static {
        r[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private r(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
