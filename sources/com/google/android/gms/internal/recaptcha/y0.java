package com.google.android.gms.internal.recaptcha;

/* loaded from: classes3.dex */
public final class y0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f31807a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31808b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f31809c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31810d;

    public y0(b0 b0Var, String str, Object[] objArr) {
        this.f31807a = b0Var;
        this.f31808b = str;
        this.f31809c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f31810d = charAt;
            return;
        }
        int i13 = charAt & 8191;
        int i14 = 1;
        int i15 = 13;
        while (true) {
            int i16 = i14 + 1;
            char charAt2 = str.charAt(i14);
            if (charAt2 < 55296) {
                this.f31810d = i13 | (charAt2 << i15);
                return;
            } else {
                i13 |= (charAt2 & 8191) << i15;
                i15 += 13;
                i14 = i16;
            }
        }
    }

    public final int a() {
        return (this.f31810d & 1) == 1 ? 1 : 2;
    }

    public final r0 b() {
        return this.f31807a;
    }

    public final String c() {
        return this.f31808b;
    }

    public final Object[] d() {
        return this.f31809c;
    }
}
