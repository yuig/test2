package lh0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z3 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ z3[] $VALUES;
    public static final z3 DO_NOT_ACTIVATE_EXPERIMENT = new z3("DO_NOT_ACTIVATE_EXPERIMENT", 0);
    public static final z3 ACTIVATE_EXPERIMENT = new z3("ACTIVATE_EXPERIMENT", 1);

    private static final /* synthetic */ z3[] $values() {
        return new z3[]{DO_NOT_ACTIVATE_EXPERIMENT, ACTIVATE_EXPERIMENT};
    }

    static {
        z3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private z3(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static z3 valueOf(String str) {
        return (z3) Enum.valueOf(z3.class, str);
    }

    public static z3[] values() {
        return (z3[]) $VALUES.clone();
    }
}
