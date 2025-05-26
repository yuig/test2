package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class i2 extends s1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18078c;

    public static int j(int i13, int i14, long j13, byte[] bArr) {
        if (i14 == 0) {
            i2 i2Var = k2.f18088a;
            if (i13 > -12) {
                return -1;
            }
            return i13;
        }
        if (i14 == 1) {
            return k2.c(i13, h2.g(j13, bArr));
        }
        if (i14 == 2) {
            return k2.d(i13, h2.g(j13, bArr), h2.g(j13 + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String g(byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i2.g(byte[], int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(java.lang.CharSequence r26, byte[] r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i2.h(java.lang.CharSequence, byte[], int, int):int");
    }

    public final int i(int i13, int i14, byte[] bArr) {
        int i15;
        int i16 = i13;
        byte b13 = -16;
        byte b14 = -19;
        switch (this.f18078c) {
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
                    long j14 = j13;
                    i15 = 0;
                    while (true) {
                        if (i15 < i17) {
                            long j15 = j14 + 1;
                            if (h2.g(j14, bArr) >= 0) {
                                i15++;
                                j14 = j15;
                            }
                        } else {
                            i15 = i17;
                        }
                    }
                }
                int i18 = i17 - i15;
                long j16 = j13 + i15;
                while (true) {
                    byte b15 = 0;
                    while (true) {
                        if (i18 > 0) {
                            long j17 = j16 + 1;
                            b15 = h2.g(j16, bArr);
                            if (b15 >= 0) {
                                i18--;
                                j16 = j17;
                            } else {
                                j16 = j17;
                            }
                        }
                    }
                    if (i18 == 0) {
                        return 0;
                    }
                    int i19 = i18 - 1;
                    if (b15 < -32) {
                        if (i19 == 0) {
                            return b15;
                        }
                        i18 -= 2;
                        if (b15 >= -62) {
                            long j18 = j16 + 1;
                            if (h2.g(j16, bArr) <= -65) {
                                j16 = j18;
                                b13 = -16;
                                b14 = -19;
                            }
                        }
                    } else if (b15 < b13) {
                        if (i19 < 2) {
                            return j(b15, i19, j16, bArr);
                        }
                        i18 -= 3;
                        long j19 = j16 + 1;
                        byte g13 = h2.g(j16, bArr);
                        if (g13 <= -65 && ((b15 != -32 || g13 >= -96) && (b15 != b14 || g13 < -96))) {
                            j16 += 2;
                            if (h2.g(j19, bArr) <= -65) {
                                b13 = -16;
                                b14 = -19;
                            }
                        }
                    } else {
                        if (i19 < 3) {
                            return j(b15, i19, j16, bArr);
                        }
                        i18 -= 4;
                        long j23 = j16 + 1;
                        byte g14 = h2.g(j16, bArr);
                        if (g14 <= -65) {
                            if ((((g14 + 112) + (b15 << 28)) >> 30) == 0) {
                                long j24 = j16 + 2;
                                if (h2.g(j23, bArr) <= -65) {
                                    j16 += 3;
                                    if (h2.g(j24, bArr) <= -65) {
                                        b13 = -16;
                                        b14 = -19;
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
                int i23 = i16 + 1;
                byte b16 = bArr[i16];
                if (b16 < 0) {
                    if (b16 < -32) {
                        if (i23 >= i14) {
                            return b16;
                        }
                        if (b16 >= -62) {
                            i16 += 2;
                            if (bArr[i23] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b16 < -16) {
                        if (i23 >= i14 - 1) {
                            return k2.a(bArr, i23, i14);
                        }
                        int i24 = i16 + 2;
                        byte b17 = bArr[i23];
                        if (b17 <= -65 && ((b16 != -32 || b17 >= -96) && (b16 != -19 || b17 < -96))) {
                            i16 += 3;
                            if (bArr[i24] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i23 >= i14 - 2) {
                        return k2.a(bArr, i23, i14);
                    }
                    int i25 = i16 + 2;
                    byte b18 = bArr[i23];
                    if (b18 <= -65) {
                        if ((((b18 + 112) + (b16 << 28)) >> 30) == 0) {
                            int i26 = i16 + 3;
                            if (bArr[i25] <= -65) {
                                i16 += 4;
                                if (bArr[i26] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i16 = i23;
            }
        }
        return 0;
    }
}
