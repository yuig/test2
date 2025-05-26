package a;

import ads_mobile_sdk.e21;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class b9 {
    public static String b(int i13, int i14, ByteBuffer byteBuffer) {
        if ((i13 | i14 | ((byteBuffer.limit() - i13) - i14)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i13), Integer.valueOf(i14)));
        }
        int i15 = i13 + i14;
        char[] cArr = new char[i14];
        int i16 = 0;
        while (i13 < i15) {
            byte b13 = byteBuffer.get(i13);
            if (!kh2.w.s(b13)) {
                break;
            }
            i13++;
            cArr[i16] = (char) b13;
            i16++;
        }
        int i17 = i16;
        while (i13 < i15) {
            int i18 = i13 + 1;
            byte b14 = byteBuffer.get(i13);
            if (kh2.w.s(b14)) {
                cArr[i17] = (char) b14;
                i17++;
                i13 = i18;
                while (i13 < i15) {
                    byte b15 = byteBuffer.get(i13);
                    if (!kh2.w.s(b15)) {
                        break;
                    }
                    i13++;
                    cArr[i17] = (char) b15;
                    i17++;
                }
            } else if (b14 < -32) {
                if (i18 >= i15) {
                    throw new e21("Protocol message had invalid UTF-8.");
                }
                i13 += 2;
                kh2.w.j(b14, byteBuffer.get(i18), cArr, i17);
                i17++;
            } else if (b14 < -16) {
                if (i18 >= i15 - 1) {
                    throw new e21("Protocol message had invalid UTF-8.");
                }
                int i19 = i13 + 2;
                i13 += 3;
                kh2.w.i(b14, byteBuffer.get(i18), byteBuffer.get(i19), cArr, i17);
                i17++;
            } else {
                if (i18 >= i15 - 2) {
                    throw new e21("Protocol message had invalid UTF-8.");
                }
                byte b16 = byteBuffer.get(i18);
                int i23 = i13 + 3;
                byte b17 = byteBuffer.get(i13 + 2);
                i13 += 4;
                kh2.w.h(b14, b16, b17, byteBuffer.get(i23), cArr, i17);
                i17 += 2;
            }
        }
        return new String(cArr, 0, i17);
    }

    public abstract int a(String str, byte[] bArr, int i13, int i14);

    public abstract String c(byte[] bArr, int i13, int i14);
}
