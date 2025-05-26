package ed2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final int value;
    public static final b VERBOSE = new b("VERBOSE", 0, 0);
    public static final b DEBUG = new b("DEBUG", 1, 1);
    public static final b INFO = new b("INFO", 2, 2);
    public static final b WARNING = new b("WARNING", 3, 3);
    public static final b ERROR = new b("ERROR", 4, 4);
    public static final b DISABLED = new b("DISABLED", 5, 5);

    private static final /* synthetic */ b[] $values() {
        return new b[]{VERBOSE, DEBUG, INFO, WARNING, ERROR, DISABLED};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
