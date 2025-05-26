package nq2;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public abstract class a {
    static {
        BigInteger.valueOf(0L);
    }

    public static BigInteger a(byte[] bArr, int i13, int i14) {
        if (i13 != 0 || i14 != bArr.length) {
            byte[] bArr2 = new byte[i14];
            System.arraycopy(bArr, i13, bArr2, 0, i14);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }
}
