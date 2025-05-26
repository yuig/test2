package tm2;

/* loaded from: classes2.dex */
public enum k0 implements zm2.u {
    CLASS(0, 0),
    PACKAGE(1, 1),
    LOCAL(2, 2);

    private static zm2.v internalValueMap = new re2.h(21);
    private final int value;

    k0(int i13, int i14) {
        this.value = i14;
    }

    public static k0 valueOf(int i13) {
        if (i13 == 0) {
            return CLASS;
        }
        if (i13 == 1) {
            return PACKAGE;
        }
        if (i13 != 2) {
            return null;
        }
        return LOCAL;
    }

    @Override // zm2.u
    public final int getNumber() {
        return this.value;
    }
}
