package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
final class zzpv {
    static {
        if (zzps.zzx() && zzps.zzy()) {
            int i13 = zzks.zza;
        }
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i13, int i14) {
        int i15 = i14 - i13;
        byte b13 = bArr[i13 - 1];
        if (i15 == 0) {
            if (b13 <= -12) {
                return b13;
            }
            return -1;
        }
        if (i15 == 1) {
            byte b14 = bArr[i13];
            if (b13 > -12 || b14 > -65) {
                return -1;
            }
            return (b14 << 8) ^ b13;
        }
        if (i15 != 2) {
            throw new AssertionError();
        }
        byte b15 = bArr[i13];
        byte b16 = bArr[i13 + 1];
        if (b13 > -12 || b15 > -65 || b16 > -65) {
            return -1;
        }
        return (b16 << 16) ^ ((b15 << 8) ^ b13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fe, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzb(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzpv.zzb(java.lang.String, byte[], int, int):int");
    }

    public static int zzc(String str) {
        int length = str.length();
        int i13 = 0;
        int i14 = 0;
        while (i14 < length && str.charAt(i14) < 128) {
            i14++;
        }
        int i15 = length;
        while (true) {
            if (i14 >= length) {
                break;
            }
            char charAt = str.charAt(i14);
            if (charAt < 2048) {
                i15 += (127 - charAt) >>> 31;
                i14++;
            } else {
                int length2 = str.length();
                while (i14 < length2) {
                    char charAt2 = str.charAt(i14);
                    if (charAt2 < 2048) {
                        i13 += (127 - charAt2) >>> 31;
                    } else {
                        i13 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i14) < 65536) {
                                throw new zzpu(i14, length2);
                            }
                            i14++;
                        }
                    }
                    i14++;
                }
                i15 += i13;
            }
        }
        if (i15 >= length) {
            return i15;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i15 + 4294967296L));
    }

    public static String zzd(byte[] bArr, int i13, int i14) {
        int i15;
        int length = bArr.length;
        if ((((length - i13) - i14) | i13 | i14) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i13), Integer.valueOf(i14)));
        }
        int i16 = i13 + i14;
        char[] cArr = new char[i14];
        int i17 = 0;
        while (i13 < i16) {
            byte b13 = bArr[i13];
            if (!zzpt.zzd(b13)) {
                break;
            }
            i13++;
            cArr[i17] = (char) b13;
            i17++;
        }
        int i18 = i17;
        while (i13 < i16) {
            int i19 = i13 + 1;
            byte b14 = bArr[i13];
            if (zzpt.zzd(b14)) {
                cArr[i18] = (char) b14;
                i18++;
                i13 = i19;
                while (i13 < i16) {
                    byte b15 = bArr[i13];
                    if (zzpt.zzd(b15)) {
                        i13++;
                        cArr[i18] = (char) b15;
                        i18++;
                    }
                }
            } else {
                if (b14 < -32) {
                    if (i19 >= i16) {
                        throw new zznn("Protocol message had invalid UTF-8.");
                    }
                    i15 = i18 + 1;
                    i13 += 2;
                    zzpt.zzc(b14, bArr[i19], cArr, i18);
                } else if (b14 < -16) {
                    if (i19 >= i16 - 1) {
                        throw new zznn("Protocol message had invalid UTF-8.");
                    }
                    i15 = i18 + 1;
                    int i23 = i13 + 2;
                    i13 += 3;
                    zzpt.zzb(b14, bArr[i19], bArr[i23], cArr, i18);
                } else {
                    if (i19 >= i16 - 2) {
                        throw new zznn("Protocol message had invalid UTF-8.");
                    }
                    byte b16 = bArr[i19];
                    int i24 = i13 + 3;
                    byte b17 = bArr[i13 + 2];
                    i13 += 4;
                    zzpt.zza(b14, b16, b17, bArr[i24], cArr, i18);
                    i18 += 2;
                }
                i18 = i15;
            }
        }
        return new String(cArr, 0, i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zze(byte[] r6, int r7, int r8) {
        /*
        L0:
            if (r7 >= r8) goto L9
            r0 = r6[r7]
            if (r0 < 0) goto L9
            int r7 = r7 + 1
            goto L0
        L9:
            if (r7 < r8) goto Ld
            goto L7a
        Ld:
            if (r7 >= r8) goto L7a
            int r0 = r7 + 1
            r1 = r6[r7]
            if (r1 >= 0) goto L78
            r2 = -32
            r3 = -65
            if (r1 >= r2) goto L29
            if (r0 < r8) goto L1e
            goto L57
        L1e:
            r2 = -62
            if (r1 < r2) goto L76
            int r7 = r7 + 2
            r0 = r6[r0]
            if (r0 <= r3) goto Ld
            goto L76
        L29:
            r4 = -16
            if (r1 >= r4) goto L4f
            int r4 = r8 + (-1)
            if (r0 < r4) goto L36
            int r1 = zza(r6, r0, r8)
            goto L57
        L36:
            int r4 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L76
            r5 = -96
            if (r1 != r2) goto L42
            if (r0 < r5) goto L76
        L42:
            r2 = -19
            if (r1 != r2) goto L48
            if (r0 >= r5) goto L76
        L48:
            int r7 = r7 + 3
            r0 = r6[r4]
            if (r0 <= r3) goto Ld
            goto L76
        L4f:
            int r2 = r8 + (-2)
            if (r0 < r2) goto L5a
            int r1 = zza(r6, r0, r8)
        L57:
            if (r1 == 0) goto L7a
            goto L76
        L5a:
            int r2 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L76
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L76
            int r0 = r7 + 3
            r1 = r6[r2]
            if (r1 > r3) goto L76
            int r7 = r7 + 4
            r0 = r6[r0]
            if (r0 > r3) goto L76
            goto Ld
        L76:
            r6 = 0
            return r6
        L78:
            r7 = r0
            goto Ld
        L7a:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzpv.zze(byte[], int, int):boolean");
    }
}
