package com.amazonaws.util;

import a.a;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
class Base64Codec {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f29035a = CodecUtils.toBytesDirect("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    public static class LazyHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final byte[] f29036a;

        static {
            byte[] bArr = new byte[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL];
            for (int i13 = 0; i13 <= 122; i13++) {
                if (i13 >= 65 && i13 <= 90) {
                    bArr[i13] = (byte) (i13 - 65);
                } else if (i13 >= 48 && i13 <= 57) {
                    bArr[i13] = (byte) (i13 + 4);
                } else if (i13 == 43) {
                    bArr[i13] = (byte) (i13 + 19);
                } else if (i13 == 47) {
                    bArr[i13] = (byte) (i13 + 16);
                } else if (i13 < 97 || i13 > 122) {
                    bArr[i13] = -1;
                } else {
                    bArr[i13] = (byte) (i13 - 71);
                }
            }
            f29036a = bArr;
        }
    }

    public static byte[] a(int i13, byte[] bArr) {
        int i14;
        if (i13 % 4 != 0) {
            throw new IllegalArgumentException(a.d("Input is expected to be encoded in multiple of 4 bytes but found: ", i13));
        }
        int i15 = i13 - 1;
        int i16 = 0;
        int i17 = 0;
        while (i17 < 2 && i15 > -1 && bArr[i15] == 61) {
            i15--;
            i17++;
        }
        if (i17 == 0) {
            i14 = 3;
        } else if (i17 == 1) {
            i14 = 2;
        } else {
            if (i17 != 2) {
                throw new Error("Impossible");
            }
            i14 = 1;
        }
        int i18 = ((i13 / 4) * 3) - (3 - i14);
        byte[] bArr2 = new byte[i18];
        int i19 = 0;
        while (i16 < i18 - (i14 % 3)) {
            int d2 = d(bArr[i19]) << 2;
            int d13 = d(bArr[i19 + 1]);
            bArr2[i16] = (byte) (d2 | ((d13 >>> 4) & 3));
            int d14 = d(bArr[i19 + 2]);
            bArr2[i16 + 1] = (byte) ((15 & (d14 >>> 2)) | ((d13 & 15) << 4));
            bArr2[i16 + 2] = (byte) (((d14 & 3) << 6) | d(bArr[i19 + 3]));
            i19 += 4;
            i16 += 3;
        }
        if (i14 < 3) {
            int i23 = i16 + 1;
            int d15 = d(bArr[i19]) << 2;
            int i24 = i19 + 2;
            int d16 = d(bArr[i19 + 1]);
            bArr2[i16] = (byte) (d15 | ((d16 >>> 4) & 3));
            if (i14 == 1) {
                CodecUtils.sanityCheckLastPos(d16, 15);
            } else {
                int i25 = i16 + 2;
                int i26 = (d16 & 15) << 4;
                int i27 = i19 + 3;
                int d17 = d(bArr[i24]);
                bArr2[i23] = (byte) (i26 | (15 & (d17 >>> 2)));
                if (i14 == 2) {
                    CodecUtils.sanityCheckLastPos(d17, 3);
                } else {
                    bArr2[i25] = (byte) (((d17 & 3) << 6) | d(bArr[i27]));
                }
            }
        }
        return bArr2;
    }

    public static int d(byte b13) {
        byte b14 = LazyHolder.f29036a[b13];
        if (b14 > -1) {
            return b14;
        }
        throw new IllegalArgumentException("Invalid base 64 character: '" + ((char) b13) + "'");
    }

    public final byte[] b(byte[] bArr) {
        int length = bArr.length / 3;
        int length2 = bArr.length % 3;
        int i13 = 0;
        if (length2 == 0) {
            byte[] bArr2 = new byte[length * 4];
            int i14 = 0;
            while (i13 < bArr.length) {
                c(i13, i14, bArr, bArr2);
                i13 += 3;
                i14 += 4;
            }
            return bArr2;
        }
        byte[] bArr3 = new byte[(length + 1) * 4];
        int i15 = 0;
        while (i13 < bArr.length - length2) {
            c(i13, i15, bArr, bArr3);
            i13 += 3;
            i15 += 4;
        }
        byte[] bArr4 = this.f29035a;
        if (length2 == 1) {
            byte b13 = bArr[i13];
            bArr3[i15] = bArr4[(b13 >>> 2) & 63];
            bArr3[i15 + 1] = bArr4[(b13 & 3) << 4];
            bArr3[i15 + 2] = 61;
            bArr3[i15 + 3] = 61;
        } else if (length2 == 2) {
            int i16 = i13 + 1;
            byte b14 = bArr[i13];
            bArr3[i15] = bArr4[(b14 >>> 2) & 63];
            byte b15 = bArr[i16];
            bArr3[i15 + 1] = bArr4[((b14 & 3) << 4) | ((b15 >>> 4) & 15)];
            bArr3[i15 + 2] = bArr4[(b15 & 15) << 2];
            bArr3[i15 + 3] = 61;
        }
        return bArr3;
    }

    public final void c(int i13, int i14, byte[] bArr, byte[] bArr2) {
        byte b13 = bArr[i13];
        byte[] bArr3 = this.f29035a;
        bArr2[i14] = bArr3[(b13 >>> 2) & 63];
        byte b14 = bArr[i13 + 1];
        bArr2[i14 + 1] = bArr3[((b13 & 3) << 4) | ((b14 >>> 4) & 15)];
        byte b15 = bArr[i13 + 2];
        bArr2[i14 + 2] = bArr3[((b15 >>> 6) & 3) | ((b14 & 15) << 2)];
        bArr2[i14 + 3] = bArr3[b15 & 63];
    }
}
