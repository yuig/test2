package tm2;

/* loaded from: classes4.dex */
public enum x implements zm2.u {
    TRUE(0, 0),
    FALSE(1, 1),
    NULL(2, 2);

    private static zm2.v internalValueMap = new rm2.i0(3);
    private final int value;

    x(int i13, int i14) {
        this.value = i14;
    }

    public static x valueOf(int i13) {
        if (i13 == 0) {
            return TRUE;
        }
        if (i13 == 1) {
            return FALSE;
        }
        if (i13 != 2) {
            return null;
        }
        return NULL;
    }

    @Override // zm2.u
    public final int getNumber() {
        return this.value;
    }
}
