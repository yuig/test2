package su1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    private final long bytesPerSecond;
    private final long initialLatencyMs;
    public static final k NO_LIMIT = new k("NO_LIMIT", 0, 0, 0);
    public static final k LOW_256_KBPS = new k("LOW_256_KBPS", 1, 32000, 100);
    public static final k LOW_512_KBPS = new k("LOW_512_KBPS", 2, 64000, 50);
    public static final k LOW_1_MBPS = new k("LOW_1_MBPS", 3, 125000, 10);
    public static final k MEDIUM_3_MBPS = new k("MEDIUM_3_MBPS", 4, 375000, 5);
    public static final k HIGH_10_MBPS = new k("HIGH_10_MBPS", 5, 1250000, 0);

    private static final /* synthetic */ k[] $values() {
        return new k[]{NO_LIMIT, LOW_256_KBPS, LOW_512_KBPS, LOW_1_MBPS, MEDIUM_3_MBPS, HIGH_10_MBPS};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private k(String str, int i13, long j13, long j14) {
        this.bytesPerSecond = j13;
        this.initialLatencyMs = j14;
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

    public final long getBytesPerSecond() {
        return this.bytesPerSecond;
    }

    public final long getInitialLatencyMs() {
        return this.initialLatencyMs;
    }
}
