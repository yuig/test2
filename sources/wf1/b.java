package wf1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    private static final double UNAVAILABLE_STORAGE_THRESHOLD_IN_MB = 10.0d;
    private static final double WARNING_STORAGE_THRESHOLD_IN_MB = 100.0d;
    public static final b AVAILABLE = new b("AVAILABLE", 0);
    public static final b NEAR_LIMIT = new b("NEAR_LIMIT", 1);
    public static final b UNAVAILABLE = new b("UNAVAILABLE", 2);

    private static final /* synthetic */ b[] $values() {
        return new b[]{AVAILABLE, NEAR_LIMIT, UNAVAILABLE};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private b(String str, int i13) {
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
}
