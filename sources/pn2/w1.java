package pn2;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class w1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ w1[] $VALUES;
    public static final w1 INVARIANT = new w1("INVARIANT", 0, "", true, true, 0);
    public static final w1 IN_VARIANCE = new w1("IN_VARIANCE", 1, "in", true, false, -1);
    public static final w1 OUT_VARIANCE = new w1("OUT_VARIANCE", 2, "out", false, true, 1);
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;

    @NotNull
    private final String label;
    private final int superpositionFactor;

    private static final /* synthetic */ w1[] $values() {
        return new w1[]{INVARIANT, IN_VARIANCE, OUT_VARIANCE};
    }

    static {
        w1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private w1(String str, int i13, String str2, boolean z13, boolean z14, int i14) {
        this.label = str2;
        this.allowsInPosition = z13;
        this.allowsOutPosition = z14;
        this.superpositionFactor = i14;
    }

    public static w1 valueOf(String str) {
        return (w1) Enum.valueOf(w1.class, str);
    }

    public static w1[] values() {
        return (w1[]) $VALUES.clone();
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.label;
    }
}
