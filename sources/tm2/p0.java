package tm2;

/* loaded from: classes2.dex */
public enum p0 implements zm2.u {
    IN(0, 0),
    OUT(1, 1),
    INV(2, 2),
    STAR(3, 3);

    private static zm2.v internalValueMap = new re2.f(22);
    private final int value;

    p0(int i13, int i14) {
        this.value = i14;
    }

    public static p0 valueOf(int i13) {
        if (i13 == 0) {
            return IN;
        }
        if (i13 == 1) {
            return OUT;
        }
        if (i13 == 2) {
            return INV;
        }
        if (i13 != 3) {
            return null;
        }
        return STAR;
    }

    @Override // zm2.u
    public final int getNumber() {
        return this.value;
    }
}
