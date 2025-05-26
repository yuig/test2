package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public abstract class y7 {

    /* renamed from: a */
    public static final p0 f31712a;

    static {
        if (x7.f31703e) {
            boolean z13 = x7.f31702d;
        }
        f31712a = new p0();
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i13 = 0;
        int i14 = 0;
        while (i14 < length && charSequence.charAt(i14) < 128) {
            i14++;
        }
        int i15 = length;
        while (true) {
            if (i14 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i14);
            if (charAt < 2048) {
                i15 += (127 - charAt) >>> 31;
                i14++;
            } else {
                int length2 = charSequence.length();
                while (i14 < length2) {
                    char charAt2 = charSequence.charAt(i14);
                    if (charAt2 < 2048) {
                        i13 += (127 - charAt2) >>> 31;
                    } else {
                        i13 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i14) < 65536) {
                                throw new z7(i14, length2);
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
        throw new IllegalArgumentException(a.a.g("UTF-8 length does not fit in int: ", i15 + 4294967296L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0100, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.y7.b(java.lang.CharSequence, byte[], int, int):int");
    }

    public static /* synthetic */ int c(byte[] bArr, int i13, int i14) {
        byte b13 = bArr[i13 - 1];
        int i15 = i14 - i13;
        if (i15 == 0) {
            if (b13 > -12) {
                return -1;
            }
            return b13;
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

    public static boolean d(byte[] bArr, int i13, int i14) {
        f31712a.getClass();
        return p0.c(bArr, i13, i14);
    }
}
