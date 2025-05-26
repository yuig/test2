package ki2;

/* loaded from: classes4.dex */
public enum f {
    CRITICAL(0),
    HIGH(5000),
    NORMAL(30000),
    LOW(60000);

    private final long delayThresholdMs;

    f(long j13) {
        this.delayThresholdMs = j13;
    }

    public final long getDelayThresholdMs() {
        return this.delayThresholdMs;
    }
}
