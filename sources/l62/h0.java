package l62;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class h0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 LOCK = new h0("LOCK", 0);
    public static final h0 DUPLICATE = new h0("DUPLICATE", 1);
    public static final h0 REPLACE = new h0("REPLACE", 2);
    public static final h0 DELETE = new h0("DELETE", 3);
    public static final h0 HIDE = new h0("HIDE", 4);

    private static final /* synthetic */ h0[] $values() {
        return new h0[]{LOCK, DUPLICATE, REPLACE, DELETE, HIDE};
    }

    static {
        h0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private h0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }
}
