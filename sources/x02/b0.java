package x02;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 ORGANIC = new b0("ORGANIC", 0);
    public static final b0 AUTO_MAGICAL = new b0("AUTO_MAGICAL", 1);

    private static final /* synthetic */ b0[] $values() {
        return new b0[]{ORGANIC, AUTO_MAGICAL};
    }

    static {
        b0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private b0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}
