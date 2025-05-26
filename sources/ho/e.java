package ho;

/* loaded from: classes3.dex */
public enum e {
    Bruteforce("bruteforce"),
    Dictionary("dictionary"),
    Spatial("spatial"),
    Repeat("repeat"),
    Sequence("sequence"),
    Regex("regex"),
    Date("date");

    private final String value;

    e(String str) {
        this.value = str;
    }

    public String value() {
        return this.value;
    }
}
