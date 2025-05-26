package qk;

import com.google.common.io.BaseEncoding$DecodingException;

/* loaded from: classes3.dex */
public final class c extends d {
    public c(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }

    @Override // qk.d
    public final int b(byte[] bArr, CharSequence charSequence) {
        CharSequence h10 = h(charSequence);
        int length = h10.length();
        a aVar = this.f104040a;
        if (!aVar.f104034h[length % aVar.f104031e]) {
            throw new BaseEncoding$DecodingException("Invalid input length " + h10.length());
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < h10.length()) {
            int i15 = i13 + 2;
            int a13 = (aVar.a(h10.charAt(i13 + 1)) << 12) | (aVar.a(h10.charAt(i13)) << 18);
            int i16 = i14 + 1;
            bArr[i14] = (byte) (a13 >>> 16);
            if (i15 < h10.length()) {
                int i17 = i13 + 3;
                int a14 = a13 | (aVar.a(h10.charAt(i15)) << 6);
                int i18 = i14 + 2;
                bArr[i16] = (byte) ((a14 >>> 8) & 255);
                if (i17 < h10.length()) {
                    i13 += 4;
                    i14 += 3;
                    bArr[i18] = (byte) ((a14 | aVar.a(h10.charAt(i17))) & 255);
                } else {
                    i14 = i18;
                    i13 = i17;
                }
            } else {
                i14 = i16;
                i13 = i15;
            }
        }
        return i14;
    }

    @Override // qk.d
    public final void e(StringBuilder sb3, byte[] bArr, int i13) {
        int i14 = 0;
        bf.b.r(0, i13, bArr.length);
        for (int i15 = i13; i15 >= 3; i15 -= 3) {
            int i16 = i14 + 2;
            int i17 = ((bArr[i14 + 1] & 255) << 8) | ((bArr[i14] & 255) << 16);
            i14 += 3;
            int i18 = i17 | (bArr[i16] & 255);
            a aVar = this.f104040a;
            sb3.append(aVar.f104028b[i18 >>> 18]);
            char[] cArr = aVar.f104028b;
            sb3.append(cArr[(i18 >>> 12) & 63]);
            sb3.append(cArr[(i18 >>> 6) & 63]);
            sb3.append(cArr[i18 & 63]);
        }
        if (i14 < i13) {
            d(sb3, bArr, i14, i13 - i14);
        }
    }

    @Override // qk.d
    public final d g(a aVar, Character ch3) {
        return new c(aVar, ch3);
    }

    public c(a aVar, Character ch3) {
        super(aVar, ch3);
        bf.b.k(aVar.f104028b.length == 64);
    }
}
