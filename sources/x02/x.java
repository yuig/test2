package x02;

/* loaded from: classes4.dex */
public enum x {
    ALL_BOARDS_FILTER("all"),
    PUBLIC_BOARDS_FILTER("public"),
    PROTECTED_BOARDS_FILTER("protected");

    private final String value;

    x(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
