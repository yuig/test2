package mu;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 NETWORK_ALWAYS = new i0("NETWORK_ALWAYS", 0);
    public static final i0 NETWORK_IF_NOT_CACHED = new i0("NETWORK_IF_NOT_CACHED", 1);

    private static final /* synthetic */ i0[] $values() {
        return new i0[]{NETWORK_ALWAYS, NETWORK_IF_NOT_CACHED};
    }

    static {
        i0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private i0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }
}
