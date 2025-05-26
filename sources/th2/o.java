package th2;

/* loaded from: classes4.dex */
public enum o {
    NEW(0),
    RUNNABLE(1),
    BLOCKED(2),
    WAITING(3),
    TIMED_WAITING(4),
    TERMINATED(5);

    private final int code;

    o(int i13) {
        this.code = i13;
    }

    public final int getCode() {
        return this.code;
    }
}
