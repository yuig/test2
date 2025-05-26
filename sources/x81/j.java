package x81;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class j {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j PAUSED = new j("PAUSED", 0);
    public static final j RESUMED = new j("RESUMED", 1);

    private static final /* synthetic */ j[] $values() {
        return new j[]{PAUSED, RESUMED};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private j(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
