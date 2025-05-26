package bk1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class j2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j2[] $VALUES;
    public static final j2 MDL_SUCCEEDED = new j2("MDL_SUCCEEDED", 0);
    public static final j2 MDL_FAILED = new j2("MDL_FAILED", 1);
    public static final j2 MDL_PENDING = new j2("MDL_PENDING", 2);

    private static final /* synthetic */ j2[] $values() {
        return new j2[]{MDL_SUCCEEDED, MDL_FAILED, MDL_PENDING};
    }

    static {
        j2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private j2(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static j2 valueOf(String str) {
        return (j2) Enum.valueOf(j2.class, str);
    }

    public static j2[] values() {
        return (j2[]) $VALUES.clone();
    }
}
