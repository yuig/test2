package ml;

import java.util.Arrays;
import l3.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f87434a;

    public a(byte[] bArr, int i13) {
        byte[] bArr2 = new byte[i13];
        this.f87434a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i13);
    }

    public static a a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new a(bArr, length);
    }

    public final byte[] b() {
        byte[] bArr = this.f87434a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f87434a, this.f87434a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f87434a);
    }

    public final String toString() {
        return "Bytes(" + c.u(this.f87434a) + ")";
    }
}
