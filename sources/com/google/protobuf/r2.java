package com.google.protobuf;

/* loaded from: classes.dex */
public final class r2 extends d7.b {
    public final String J0(byte[] bArr, int i13, int i14) {
        if ((i13 | i14 | ((bArr.length - i13) - i14)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i14)));
        }
        int i15 = i13 + i14;
        char[] cArr = new char[i14];
        int i16 = 0;
        while (i13 < i15) {
            byte b13 = bArr[i13];
            if (!g2.b(b13)) {
                break;
            }
            i13++;
            cArr[i16] = (char) b13;
            i16++;
        }
        int i17 = i16;
        while (i13 < i15) {
            int i18 = i13 + 1;
            byte b14 = bArr[i13];
            if (g2.b(b14)) {
                int i19 = i17 + 1;
                cArr[i17] = (char) b14;
                while (i18 < i15) {
                    byte b15 = bArr[i18];
                    if (!g2.b(b15)) {
                        break;
                    }
                    i18++;
                    cArr[i19] = (char) b15;
                    i19++;
                }
                i17 = i19;
                i13 = i18;
            } else if (b14 < -32) {
                if (i18 >= i15) {
                    throw InvalidProtocolBufferException.b();
                }
                i13 += 2;
                g2.c(b14, bArr[i18], cArr, i17);
                i17++;
            } else if (b14 < -16) {
                if (i18 >= i15 - 1) {
                    throw InvalidProtocolBufferException.b();
                }
                int i23 = i13 + 2;
                i13 += 3;
                g2.d(b14, bArr[i18], bArr[i23], cArr, i17);
                i17++;
            } else {
                if (i18 >= i15 - 2) {
                    throw InvalidProtocolBufferException.b();
                }
                byte b16 = bArr[i18];
                int i24 = i13 + 3;
                byte b17 = bArr[i13 + 2];
                i13 += 4;
                g2.a(b14, b16, b17, bArr[i24], cArr, i17);
                i17 += 2;
            }
        }
        return new String(cArr, 0, i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fb, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int K0(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.r2.K0(java.lang.CharSequence, byte[], int, int):int");
    }

    public final int L0(int i13, int i14, byte[] bArr) {
        while (i13 < i14 && bArr[i13] >= 0) {
            i13++;
        }
        if (i13 >= i14) {
            return 0;
        }
        while (i13 < i14) {
            int i15 = i13 + 1;
            byte b13 = bArr[i13];
            if (b13 < 0) {
                if (b13 < -32) {
                    if (i15 >= i14) {
                        return b13;
                    }
                    if (b13 >= -62) {
                        i13 += 2;
                        if (bArr[i15] > -65) {
                        }
                    }
                    return -1;
                }
                if (b13 < -16) {
                    if (i15 >= i14 - 1) {
                        return t2.a(bArr, i15, i14);
                    }
                    int i16 = i13 + 2;
                    byte b14 = bArr[i15];
                    if (b14 <= -65 && ((b13 != -32 || b14 >= -96) && (b13 != -19 || b14 < -96))) {
                        i13 += 3;
                        if (bArr[i16] > -65) {
                        }
                    }
                    return -1;
                }
                if (i15 >= i14 - 2) {
                    return t2.a(bArr, i15, i14);
                }
                int i17 = i13 + 2;
                byte b15 = bArr[i15];
                if (b15 <= -65) {
                    if ((((b15 + 112) + (b13 << 28)) >> 30) == 0) {
                        int i18 = i13 + 3;
                        if (bArr[i17] <= -65) {
                            i13 += 4;
                            if (bArr[i18] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i13 = i15;
        }
        return 0;
    }
}
