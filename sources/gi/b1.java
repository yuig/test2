package gi;

/* loaded from: classes3.dex */
public final class b1 extends c1 {
    public b1(String str, String str2) {
        this(new z0(str, str2.toCharArray()), (Character) '=');
    }

    @Override // gi.c1
    public final void a(StringBuilder sb3, byte[] bArr, int i13) {
        int i14 = 0;
        kh2.b0.g2(0, i13, bArr.length);
        for (int i15 = i13; i15 >= 3; i15 -= 3) {
            int i16 = ((bArr[i14 + 1] & 255) << 8) | ((bArr[i14] & 255) << 16) | (bArr[i14 + 2] & 255);
            z0 z0Var = this.f65052a;
            sb3.append(z0Var.f65144b[i16 >>> 18]);
            char[] cArr = z0Var.f65144b;
            sb3.append(cArr[(i16 >>> 12) & 63]);
            sb3.append(cArr[(i16 >>> 6) & 63]);
            sb3.append(cArr[i16 & 63]);
            i14 += 3;
        }
        if (i14 < i13) {
            b(sb3, bArr, i14, i13 - i14);
        }
    }

    public b1(z0 z0Var, Character ch3) {
        super(z0Var, ch3);
        if (z0Var.f65144b.length != 64) {
            throw new IllegalArgumentException();
        }
    }
}
