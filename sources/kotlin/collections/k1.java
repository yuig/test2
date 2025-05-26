package kotlin.collections;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k1[] $VALUES;
    public static final k1 Ready = new k1("Ready", 0);
    public static final k1 NotReady = new k1("NotReady", 1);
    public static final k1 Done = new k1("Done", 2);
    public static final k1 Failed = new k1("Failed", 3);

    private static final /* synthetic */ k1[] $values() {
        return new k1[]{Ready, NotReady, Done, Failed};
    }

    static {
        k1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private k1(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) $VALUES.clone();
    }
}
