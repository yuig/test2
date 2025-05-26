package c91;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;

    @NotNull
    private final String value;
    public static final h ALLOWED = new h("ALLOWED", 0, "ALLOWED");
    public static final h DENIED = new h("DENIED", 1, "DENIED");
    public static final h BPR = new h("BPR", 2, "BIPA_PERMISSION_REQUIRED");

    private static final /* synthetic */ h[] $values() {
        return new h[]{ALLOWED, DENIED, BPR};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private h(String str, int i13, String str2) {
        this.value = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
