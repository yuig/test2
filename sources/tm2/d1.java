package tm2;

/* loaded from: classes2.dex */
public enum d1 implements zm2.u {
    LANGUAGE_VERSION(0, 0),
    COMPILER_VERSION(1, 1),
    API_VERSION(2, 2);

    private static zm2.v internalValueMap = new re2.h(23);
    private final int value;

    d1(int i13, int i14) {
        this.value = i14;
    }

    public static d1 valueOf(int i13) {
        if (i13 == 0) {
            return LANGUAGE_VERSION;
        }
        if (i13 == 1) {
            return COMPILER_VERSION;
        }
        if (i13 != 2) {
            return null;
        }
        return API_VERSION;
    }

    @Override // zm2.u
    public final int getNumber() {
        return this.value;
    }
}
