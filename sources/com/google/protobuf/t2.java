package com.google.protobuf;

/* loaded from: classes.dex */
public abstract class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final r2 f33999a;

    static {
        if (q2.f33964e && q2.f33963d) {
            Class cls = d.f33867a;
        }
        f33999a = new r2();
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
            return c(b13, bArr[i13]);
        }
        if (i15 == 2) {
            return d(b13, bArr[i13], bArr[i13 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(CharSequence charSequence) {
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
                                throw new s2(i14, length2);
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

    public static int c(int i13, int i14) {
        if (i13 > -12 || i14 > -65) {
            return -1;
        }
        return i13 ^ (i14 << 8);
    }

    public static int d(int i13, int i14, int i15) {
        if (i13 > -12 || i14 > -65 || i15 > -65) {
            return -1;
        }
        return (i13 ^ (i14 << 8)) ^ (i15 << 16);
    }

    public static boolean e(byte[] bArr, int i13, int i14) {
        return f33999a.L0(i13, i14, bArr) == 0;
    }
}
