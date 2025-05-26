package cn;

/* loaded from: classes3.dex */
public enum a {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final a[] FOR_BITS;
    private final int bits;

    static {
        a aVar = L;
        a aVar2 = M;
        a aVar3 = Q;
        FOR_BITS = new a[]{aVar2, aVar, H, aVar3};
    }

    a(int i13) {
        this.bits = i13;
    }

    public static a forBits(int i13) {
        if (i13 >= 0) {
            a[] aVarArr = FOR_BITS;
            if (i13 < aVarArr.length) {
                return aVarArr[i13];
            }
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.bits;
    }
}
