package di2;

/* loaded from: classes4.dex */
public enum k {
    NORMAL_END(true, false),
    PERIODIC_CACHE(false, true),
    JVM_CRASH(false, false);

    private final boolean endedCleanly;
    private final boolean forceQuit;

    k(boolean z13, boolean z14) {
        this.endedCleanly = z13;
        this.forceQuit = z14;
    }

    public final boolean getEndedCleanly() {
        return this.endedCleanly;
    }

    public final boolean getForceQuit() {
        return this.forceQuit;
    }
}
