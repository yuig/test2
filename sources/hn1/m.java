package hn1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m FULL = new m("FULL", 0);
    public static final m PARTIAL = new m("PARTIAL", 1);

    private static final /* synthetic */ m[] $values() {
        return new m[]{FULL, PARTIAL};
    }

    static {
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private m(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
