package r72;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class x1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ x1[] $VALUES;
    public static final x1 NONE = new x1("NONE", 0);
    public static final x1 UPLOADING = new x1("UPLOADING", 1);
    public static final x1 FINISHED = new x1("FINISHED", 2);
    public static final x1 FAILED = new x1("FAILED", 3);

    private static final /* synthetic */ x1[] $values() {
        return new x1[]{NONE, UPLOADING, FINISHED, FAILED};
    }

    static {
        x1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private x1(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) $VALUES.clone();
    }
}
