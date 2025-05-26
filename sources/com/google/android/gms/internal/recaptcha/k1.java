package com.google.android.gms.internal.recaptcha;

/* loaded from: classes3.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l1 f31767a;

    static {
        f31767a = (j1.f31762f && j1.f31761e && !o.a()) ? new l1(1) : new l1(0);
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
            byte b14 = bArr[i13];
            if (b13 > -12 || b14 > -65) {
                return -1;
            }
            return b13 ^ (b14 << 8);
        }
        if (i15 != 2) {
            throw new AssertionError();
        }
        byte b15 = bArr[i13];
        byte b16 = bArr[i13 + 1];
        if (b13 > -12 || b15 > -65 || b16 > -65) {
            return -1;
        }
        return ((b15 << 8) ^ b13) ^ (b16 << 16);
    }
}
