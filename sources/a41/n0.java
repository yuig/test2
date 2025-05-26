package a41;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class n0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 CONTACT_INFO = new n0("CONTACT_INFO", 0);
    public static final n0 DIRECT_MESSAGING = new n0("DIRECT_MESSAGING", 1);
    public static final n0 NONE = new n0("NONE", 2);

    private static final /* synthetic */ n0[] $values() {
        return new n0[]{CONTACT_INFO, DIRECT_MESSAGING, NONE};
    }

    static {
        n0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private n0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }
}
