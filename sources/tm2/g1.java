package tm2;

/* loaded from: classes2.dex */
public enum g1 implements zm2.u {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);

    private static zm2.v internalValueMap = new re2.f(24);
    private final int value;

    g1(int i13, int i14) {
        this.value = i14;
    }

    public static g1 valueOf(int i13) {
        if (i13 == 0) {
            return INTERNAL;
        }
        if (i13 == 1) {
            return PRIVATE;
        }
        if (i13 == 2) {
            return PROTECTED;
        }
        if (i13 == 3) {
            return PUBLIC;
        }
        if (i13 == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i13 != 5) {
            return null;
        }
        return LOCAL;
    }

    @Override // zm2.u
    public final int getNumber() {
        return this.value;
    }
}
