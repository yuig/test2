package mf;

/* loaded from: classes3.dex */
public enum f {
    AUTOMATIC("automatic", 0),
    DISPLAY_ALWAYS("display_always", 1),
    NEVER_DISPLAY("never_display", 2);

    public static f DEFAULT = AUTOMATIC;
    private int intValue;
    private String stringValue;

    f(String str, int i13) {
        this.stringValue = str;
        this.intValue = i13;
    }

    public static f fromInt(int i13) {
        for (f fVar : values()) {
            if (fVar.getValue() == i13) {
                return fVar;
            }
        }
        return null;
    }

    public int getValue() {
        return this.intValue;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.stringValue;
    }
}
