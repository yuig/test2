package com.google.android.gms.internal.recaptcha;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: d, reason: collision with root package name */
    public static final c1 f31741d = new c1(0, new int[0], new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f31742a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f31743b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f31744c;

    public c1(int i13, int[] iArr, Object[] objArr) {
        this.f31742a = i13;
        this.f31743b = iArr;
        this.f31744c = objArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        int i13 = c1Var.f31742a;
        int i14 = this.f31742a;
        if (i14 == i13) {
            int i15 = 0;
            while (true) {
                if (i15 >= i14) {
                    for (int i16 = 0; i16 < i14; i16++) {
                        if (this.f31744c[i16].equals(c1Var.f31744c[i16])) {
                        }
                    }
                    return true;
                }
                if (this.f31743b[i15] != c1Var.f31743b[i15]) {
                    break;
                }
                i15++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = this.f31742a;
        int i14 = (i13 + 527) * 31;
        int i15 = 17;
        int i16 = 17;
        for (int i17 = 0; i17 < i13; i17++) {
            i16 = (i16 * 31) + this.f31743b[i17];
        }
        int i18 = (i14 + i16) * 31;
        for (int i19 = 0; i19 < i13; i19++) {
            i15 = (i15 * 31) + this.f31744c[i19].hashCode();
        }
        return i18 + i15;
    }
}
