package ec;

/* loaded from: classes3.dex */
public enum y {
    SIMULTANEOUSLY,
    INDIVIDUALLY;

    public static y forId(int i13) {
        if (i13 == 1) {
            return SIMULTANEOUSLY;
        }
        if (i13 == 2) {
            return INDIVIDUALLY;
        }
        throw new IllegalArgumentException(a.a.d("Unknown trim path type ", i13));
    }
}
