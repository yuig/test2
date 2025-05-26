package im2;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;

    @NotNull
    public static final i0 Companion;

    @NotNull
    private final String description;
    public static final j0 IGNORE = new j0("IGNORE", 0, "ignore");
    public static final j0 WARN = new j0("WARN", 1, "warn");
    public static final j0 STRICT = new j0("STRICT", 2, "strict");

    private static final /* synthetic */ j0[] $values() {
        return new j0[]{IGNORE, WARN, STRICT};
    }

    static {
        j0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new i0();
    }

    private j0(String str, int i13, String str2) {
        this.description = str2;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
