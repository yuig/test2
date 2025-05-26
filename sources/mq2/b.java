package mq2;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final e f88068a = new e(BigInteger.valueOf(2));

    /* renamed from: b, reason: collision with root package name */
    public static final e f88069b = new e(BigInteger.valueOf(3));

    public static d a(int[] iArr) {
        if (iArr[0] != 0) {
            throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
        }
        for (int i13 = 1; i13 < iArr.length; i13++) {
            if (iArr[i13] <= iArr[i13 - 1]) {
                throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
            }
        }
        return new d(f88068a, new c(iArr));
    }
}
