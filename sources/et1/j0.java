package et1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class j0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 VIDEO = new j0("VIDEO", 0);
    public static final j0 AUDIO = new j0("AUDIO", 1);

    private static final /* synthetic */ j0[] $values() {
        return new j0[]{VIDEO, AUDIO};
    }

    static {
        j0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private j0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}
