package tm2;

/* loaded from: classes2.dex */
public enum c0 implements zm2.u {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);

    private static zm2.v internalValueMap = new re2.f(21);
    private final int value;

    c0(int i13, int i14) {
        this.value = i14;
    }

    public static c0 valueOf(int i13) {
        if (i13 == 0) {
            return FINAL;
        }
        if (i13 == 1) {
            return OPEN;
        }
        if (i13 == 2) {
            return ABSTRACT;
        }
        if (i13 != 3) {
            return null;
        }
        return SEALED;
    }

    @Override // zm2.u
    public final int getNumber() {
        return this.value;
    }
}
