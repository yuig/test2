package lh0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a1[] $VALUES;
    public static final a1 DISK_CACHE = new a1("DISK_CACHE", 0);
    public static final a1 NETWORK = new a1("NETWORK", 1);

    private static final /* synthetic */ a1[] $values() {
        return new a1[]{DISK_CACHE, NETWORK};
    }

    static {
        a1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private a1(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) $VALUES.clone();
    }
}
