package tu1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class n0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    private final int value;
    public static final n0 UNAVAILABLE = new n0("UNAVAILABLE", 0, 0);
    public static final n0 INSTALLATION_FAILED = new n0("INSTALLATION_FAILED", 1, 2);
    public static final n0 INSTALLED = new n0("INSTALLED", 2, 3);

    private static final /* synthetic */ n0[] $values() {
        return new n0[]{UNAVAILABLE, INSTALLATION_FAILED, INSTALLED};
    }

    static {
        n0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private n0(String str, int i13, int i14) {
        this.value = i14;
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

    public final int getValue() {
        return this.value;
    }
}
