package ads_mobile_sdk;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class jl {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6862a;

    public jl(byte[] bArr, int i13) {
        byte[] bArr2 = new byte[i13];
        this.f6862a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i13);
    }

    public static jl a(byte[] bArr) {
        if (bArr != null) {
            return a(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jl) {
            return Arrays.equals(((jl) obj).f6862a, this.f6862a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6862a);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Bytes(");
        byte[] bArr = this.f6862a;
        StringBuilder sb4 = new StringBuilder(bArr.length * 2);
        for (byte b13 : bArr) {
            int i13 = b13 & 255;
            sb4.append("0123456789abcdef".charAt(i13 / 16));
            sb4.append("0123456789abcdef".charAt(i13 % 16));
        }
        sb3.append(sb4.toString());
        sb3.append(")");
        return sb3.toString();
    }

    public static jl a(byte[] bArr, int i13) {
        if (bArr != null) {
            if (i13 > bArr.length) {
                i13 = bArr.length;
            }
            return new jl(bArr, i13);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final byte[] a() {
        byte[] bArr = this.f6862a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
