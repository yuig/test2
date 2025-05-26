package fn;

/* loaded from: classes3.dex */
public enum a {
    HTML("html"),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    private final String typeString;

    a(String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeString;
    }
}
