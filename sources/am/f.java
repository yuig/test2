package am;

/* loaded from: classes.dex */
public enum f {
    NONE(0),
    SDK(1),
    GLOBAL(2),
    COMBINED(3);

    private final int code;

    f(int i13) {
        this.code = i13;
    }

    public int getCode() {
        return this.code;
    }
}
