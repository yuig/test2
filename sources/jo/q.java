package jo;

/* loaded from: classes3.dex */
public enum q {
    LOWER("lower", 26),
    UPPER("upper", 26),
    DIGITS("digits", 10),
    UNICODE("unicode", 26);

    private final String name;
    private final int space;

    q(String str, int i13) {
        this.name = str;
        this.space = i13;
    }

    public String getName() {
        return this.name;
    }

    public int getSpace() {
        return this.space;
    }
}
