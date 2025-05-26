package m81;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class s {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s SPAN_WIDTH = new s("SPAN_WIDTH", 0);
    public static final s SPAN_HEIGHT = new s("SPAN_HEIGHT", 1);

    private static final /* synthetic */ s[] $values() {
        return new s[]{SPAN_WIDTH, SPAN_HEIGHT};
    }

    static {
        s[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private s(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
