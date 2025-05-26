package r72;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class z0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ z0[] $VALUES;

    @NotNull
    private final String key;
    private final int width;
    public static final z0 Small = new z0("Small", 0, "70x", 70);
    public static final z0 Medium = new z0("Medium", 1, "345x", 345);
    public static final z0 Large = new z0("Large", 2, "736x", 736);
    public static final z0 OldLarge = new z0("OldLarge", 3, "750x", 750);

    private static final /* synthetic */ z0[] $values() {
        return new z0[]{Small, Medium, Large, OldLarge};
    }

    static {
        z0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private z0(String str, int i13, String str2, int i14) {
        this.key = str2;
        this.width = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getWidth() {
        return this.width;
    }
}
