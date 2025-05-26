package e10;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;

    @NotNull
    private final String logName;
    public static final k SPAN_LOG = new k("SPAN_LOG", 0, "generic_span_log_type");
    public static final k EVENT_LOG = new k("EVENT_LOG", 1, "generic_span_log_type");
    public static final k ERROR_LOG = new k("ERROR_LOG", 2, "generic_span_log_type");

    private static final /* synthetic */ k[] $values() {
        return new k[]{SPAN_LOG, EVENT_LOG, ERROR_LOG};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private k(String str, int i13, String str2) {
        this.logName = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    @NotNull
    public final String getLogName() {
        return this.logName;
    }
}
