package m62;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class x {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x UNDEFINED = new x("UNDEFINED", 0);
    public static final x HORIZONTAL = new x("HORIZONTAL", 1);
    public static final x VERTICAL = new x("VERTICAL", 2);

    private static final /* synthetic */ x[] $values() {
        return new x[]{UNDEFINED, HORIZONTAL, VERTICAL};
    }

    static {
        x[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private x(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
