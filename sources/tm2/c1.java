package tm2;

/* loaded from: classes2.dex */
public enum c1 implements zm2.u {
    WARNING(0, 0),
    ERROR(1, 1),
    HIDDEN(2, 2);

    private static zm2.v internalValueMap = new re2.f(23);
    private final int value;

    c1(int i13, int i14) {
        this.value = i14;
    }

    public static c1 valueOf(int i13) {
        if (i13 == 0) {
            return WARNING;
        }
        if (i13 == 1) {
            return ERROR;
        }
        if (i13 != 2) {
            return null;
        }
        return HIDDEN;
    }

    @Override // zm2.u
    public final int getNumber() {
        return this.value;
    }
}
