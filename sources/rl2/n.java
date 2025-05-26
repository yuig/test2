package rl2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class n {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n INSTANCE = new n("INSTANCE", 0);
    public static final n EXTENSION_RECEIVER = new n("EXTENSION_RECEIVER", 1);
    public static final n VALUE = new n("VALUE", 2);

    private static final /* synthetic */ n[] $values() {
        return new n[]{INSTANCE, EXTENSION_RECEIVER, VALUE};
    }

    static {
        n[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private n(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
