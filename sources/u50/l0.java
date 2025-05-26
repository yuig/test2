package u50;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l0[] $VALUES;
    public static final l0 HOST = new l0("HOST", 0);

    private static final /* synthetic */ l0[] $values() {
        return new l0[]{HOST};
    }

    static {
        l0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private l0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }
}
