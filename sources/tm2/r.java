package tm2;

/* loaded from: classes4.dex */
public enum r implements zm2.u {
    RETURNS_CONSTANT(0, 0),
    CALLS(1, 1),
    RETURNS_NOT_NULL(2, 2);

    private static zm2.v internalValueMap = new rm2.i0(1);
    private final int value;

    r(int i13, int i14) {
        this.value = i14;
    }

    public static r valueOf(int i13) {
        if (i13 == 0) {
            return RETURNS_CONSTANT;
        }
        if (i13 == 1) {
            return CALLS;
        }
        if (i13 != 2) {
            return null;
        }
        return RETURNS_NOT_NULL;
    }

    @Override // zm2.u
    public final int getNumber() {
        return this.value;
    }
}
