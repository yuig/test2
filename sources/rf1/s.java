package rf1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class s {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s INITIAL = new s("INITIAL", 0);
    public static final s SHOULD_RESTART = new s("SHOULD_RESTART", 1);
    public static final s DO_NOT_RESTART = new s("DO_NOT_RESTART", 2);

    private static final /* synthetic */ s[] $values() {
        return new s[]{INITIAL, SHOULD_RESTART, DO_NOT_RESTART};
    }

    static {
        s[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
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
