package tm2;

/* loaded from: classes4.dex */
public enum s implements zm2.u {
    AT_MOST_ONCE(0, 0),
    EXACTLY_ONCE(1, 1),
    AT_LEAST_ONCE(2, 2);

    private static zm2.v internalValueMap = new rm2.i0(2);
    private final int value;

    s(int i13, int i14) {
        this.value = i14;
    }

    public static s valueOf(int i13) {
        if (i13 == 0) {
            return AT_MOST_ONCE;
        }
        if (i13 == 1) {
            return EXACTLY_ONCE;
        }
        if (i13 != 2) {
            return null;
        }
        return AT_LEAST_ONCE;
    }

    @Override // zm2.u
    public final int getNumber() {
        return this.value;
    }
}
