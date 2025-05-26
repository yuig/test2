package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public final class e2 extends u1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33608b;

    public static int S(int i13, int i14, long j13, byte[] bArr) {
        if (i14 == 0) {
            e2 e2Var = g2.f33630a;
            if (i13 > -12) {
                return -1;
            }
            return i13;
        }
        if (i14 == 1) {
            return g2.d(i13, d2.g(j13, bArr));
        }
        if (i14 == 2) {
            return g2.e(i13, d2.g(j13, bArr), d2.g(j13 + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String P(byte[] r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e2.P(byte[], int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int Q(java.lang.CharSequence r26, byte[] r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e2.Q(java.lang.CharSequence, byte[], int, int):int");
    }

    public final int R(int i13, int i14, byte[] bArr) {
        int i15;
        int i16 = i13;
        byte b13 = -62;
        switch (this.f33608b) {
            case 0:
                break;
            default:
                if ((i16 | i14 | (bArr.length - i14)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i14)));
                }
                long j13 = i16;
                int i17 = (int) (i14 - j13);
                if (i17 < 16) {
                    i15 = 0;
                } else {
                    int i18 = 8 - (((int) j13) & 7);
                    long j14 = j13;
                    i15 = 0;
                    while (true) {
                        if (i15 < i18) {
                            long j15 = j14 + 1;
                            if (d2.g(j14, bArr) >= 0) {
                                i15++;
                                j14 = j15;
                            }
                        } else {
                            while (true) {
                                int i19 = i15 + 8;
                                if (i19 <= i17) {
                                    if ((d2.f33602c.h(d2.f33605f + j14, bArr) & (-9187201950435737472L)) == 0) {
                                        j14 += 8;
                                        i15 = i19;
                                    }
                                }
                            }
                            while (true) {
                                if (i15 < i17) {
                                    long j16 = j14 + 1;
                                    if (d2.g(j14, bArr) >= 0) {
                                        i15++;
                                        j14 = j16;
                                    }
                                } else {
                                    i15 = i17;
                                }
                            }
                        }
                    }
                }
                int i23 = i17 - i15;
                long j17 = j13 + i15;
                while (true) {
                    byte b14 = 0;
                    while (true) {
                        if (i23 > 0) {
                            long j18 = j17 + 1;
                            b14 = d2.g(j17, bArr);
                            if (b14 >= 0) {
                                i23--;
                                j17 = j18;
                            } else {
                                j17 = j18;
                            }
                        }
                    }
                    if (i23 == 0) {
                        return 0;
                    }
                    int i24 = i23 - 1;
                    if (b14 < -32) {
                        if (i24 == 0) {
                            return b14;
                        }
                        i23 -= 2;
                        if (b14 >= b13) {
                            long j19 = j17 + 1;
                            if (d2.g(j17, bArr) <= -65) {
                                j17 = j19;
                                b13 = -62;
                            }
                        }
                    } else if (b14 < -16) {
                        if (i24 < 2) {
                            return S(b14, i24, j17, bArr);
                        }
                        i23 -= 3;
                        long j23 = j17 + 1;
                        byte g13 = d2.g(j17, bArr);
                        if (g13 <= -65 && ((b14 != -32 || g13 >= -96) && (b14 != -19 || g13 < -96))) {
                            j17 += 2;
                            if (d2.g(j23, bArr) <= -65) {
                                b13 = -62;
                            }
                        }
                    } else {
                        if (i24 < 3) {
                            return S(b14, i24, j17, bArr);
                        }
                        i23 -= 4;
                        long j24 = j17 + 1;
                        byte g14 = d2.g(j17, bArr);
                        if (g14 <= -65) {
                            if ((((g14 + 112) + (b14 << 28)) >> 30) == 0) {
                                long j25 = 2 + j17;
                                if (d2.g(j24, bArr) <= -65) {
                                    j17 += 3;
                                    if (d2.g(j25, bArr) <= -65) {
                                        b13 = -62;
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
        }
        while (i16 < i14 && bArr[i16] >= 0) {
            i16++;
        }
        if (i16 < i14) {
            while (i16 < i14) {
                int i25 = i16 + 1;
                byte b15 = bArr[i16];
                if (b15 < 0) {
                    if (b15 < -32) {
                        if (i25 >= i14) {
                            return b15;
                        }
                        if (b15 >= -62) {
                            i16 += 2;
                            if (bArr[i25] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b15 < -16) {
                        if (i25 >= i14 - 1) {
                            return g2.a(bArr, i25, i14);
                        }
                        int i26 = i16 + 2;
                        byte b16 = bArr[i25];
                        if (b16 <= -65 && ((b15 != -32 || b16 >= -96) && (b15 != -19 || b16 < -96))) {
                            i16 += 3;
                            if (bArr[i26] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i25 >= i14 - 2) {
                        return g2.a(bArr, i25, i14);
                    }
                    int i27 = i16 + 2;
                    byte b17 = bArr[i25];
                    if (b17 <= -65) {
                        if ((((b17 + 112) + (b15 << 28)) >> 30) == 0) {
                            int i28 = i16 + 3;
                            if (bArr[i27] <= -65) {
                                i16 += 4;
                                if (bArr[i28] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i16 = i25;
            }
        }
        return 0;
    }
}
