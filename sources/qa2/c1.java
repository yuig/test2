package qa2;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c1[] $VALUES;
    public static final c1 CROPPED = new c1("CROPPED", 0);
    public static final c1 NONE = new c1("NONE", 1);
    public static final c1 SCALE_TO_FILL = new c1("SCALE_TO_FILL", 2);

    private static final /* synthetic */ c1[] $values() {
        return new c1[]{CROPPED, NONE, SCALE_TO_FILL};
    }

    static {
        c1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private c1(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c1 valueOf(String str) {
        return (c1) Enum.valueOf(c1.class, str);
    }

    public static c1[] values() {
        return (c1[]) $VALUES.clone();
    }
}
