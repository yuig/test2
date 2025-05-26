package hb0;

/* loaded from: classes.dex */
public enum a {
    PRIORITY_LOWEST(19),
    PRIORITY_BACKGROUND(10),
    PRIORITY_MAX(0);

    private final int value;

    a(int i13) {
        this.value = i13;
    }

    public static a fromValue(int i13) {
        return i13 != 0 ? i13 != 19 ? PRIORITY_BACKGROUND : PRIORITY_LOWEST : PRIORITY_MAX;
    }

    public int getValue() {
        return this.value;
    }
}
