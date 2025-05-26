package com.google.android.gms.internal.recaptcha;

/* loaded from: classes3.dex */
public final class l1 extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31769b;

    public l1(int i13) {
        this.f31769b = i13;
    }

    public static int g(int i13, int i14, long j13, byte[] bArr) {
        if (i14 == 0) {
            l1 l1Var = k1.f31767a;
            if (i13 > -12) {
                return -1;
            }
            return i13;
        }
        if (i14 == 1) {
            byte a13 = j1.a(j13, bArr);
            l1 l1Var2 = k1.f31767a;
            if (i13 > -12 || a13 > -65) {
                return -1;
            }
            return i13 ^ (a13 << 8);
        }
        if (i14 != 2) {
            throw new AssertionError();
        }
        byte a14 = j1.a(j13, bArr);
        byte a15 = j1.a(j13 + 1, bArr);
        l1 l1Var3 = k1.f31767a;
        if (i13 > -12 || a14 > -65 || a15 > -65) {
            return -1;
        }
        return (i13 ^ (a14 << 8)) ^ (a15 << 16);
    }
}
