package gi;

/* loaded from: classes3.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f65119a = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            byte[] bArr = ((t0) this).f65117b;
            if (bArr.length * 8 == ((t0) u0Var).f65117b.length * 8) {
                byte[] bArr2 = ((t0) u0Var).f65117b;
                if (bArr.length == bArr2.length) {
                    boolean z13 = true;
                    for (int i13 = 0; i13 < bArr.length; i13++) {
                        z13 &= bArr[i13] == bArr2[i13];
                    }
                    if (z13) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((t0) this).f65117b;
        if (bArr.length * 8 < 32) {
            int i13 = bArr[0] & 255;
            for (int i14 = 1; i14 < bArr.length; i14++) {
                i13 |= (bArr[i14] & 255) << (i14 * 8);
            }
            return i13;
        }
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(kh2.g0.t0("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i15 = bArr[0] & 255;
        int i16 = bArr[1] & 255;
        int i17 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i15 | (i16 << 8) | (i17 << 16);
    }

    public final String toString() {
        byte[] bArr = ((t0) this).f65117b;
        int length = bArr.length;
        StringBuilder sb3 = new StringBuilder(length + length);
        for (byte b13 : bArr) {
            char[] cArr = f65119a;
            sb3.append(cArr[(b13 >> 4) & 15]);
            sb3.append(cArr[b13 & 15]);
        }
        return sb3.toString();
    }
}
