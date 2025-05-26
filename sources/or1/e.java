package or1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    private final String logValue;
    public static final e ATTEMPT = new e("ATTEMPT", 0, "attempt");
    public static final e SUCCESS = new e("SUCCESS", 1, "success");
    public static final e FAILURE = new e("FAILURE", 2, "failure");

    private static final /* synthetic */ e[] $values() {
        return new e[]{ATTEMPT, SUCCESS, FAILURE};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e(String str, int i13, String str2) {
        this.logValue = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    @NotNull
    public final String getLogValue() {
        return this.logValue;
    }
}
