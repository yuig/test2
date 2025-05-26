package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public abstract class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final e2 f33630a;

    static {
        f33630a = (d2.f33604e && d2.f33603d && !d.a()) ? new e2(1) : new e2(0);
    }

    public static int a(byte[] bArr, int i13, int i14) {
        byte b13 = bArr[i13 - 1];
        int i15 = i14 - i13;
        if (i15 == 0) {
            if (b13 > -12) {
                b13 = -1;
            }
            return b13;
        }
        if (i15 == 1) {
            return d(b13, bArr[i13]);
        }
        if (i15 == 2) {
            return e(b13, bArr[i13], bArr[i13 + 1]);
        }
        throw new AssertionError();
    }

    public static String b(byte[] bArr, int i13, int i14) {
        return f33630a.P(bArr, i13, i14);
    }

    public static int c(CharSequence charSequence) {
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
                                throw new f2(i14, length2);
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

    public static int d(int i13, int i14) {
        if (i13 > -12 || i14 > -65) {
            return -1;
        }
        return i13 ^ (i14 << 8);
    }

    public static int e(int i13, int i14, int i15) {
        if (i13 > -12 || i14 > -65 || i15 > -65) {
            return -1;
        }
        return (i13 ^ (i14 << 8)) ^ (i15 << 16);
    }

    public static boolean f(byte[] bArr) {
        return f33630a.R(0, bArr.length, bArr) == 0;
    }

    public static boolean g(byte[] bArr, int i13, int i14) {
        return f33630a.R(i13, i14, bArr) == 0;
    }
}
