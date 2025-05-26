package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class l7 implements y6 {

    /* renamed from: a, reason: collision with root package name */
    public final a7 f31507a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31508b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f31509c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31510d;

    public l7(a6 a6Var, String str, Object[] objArr) {
        this.f31507a = a6Var;
        this.f31508b = str;
        this.f31509c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f31510d = charAt;
            return;
        }
        int i13 = charAt & 8191;
        int i14 = 1;
        int i15 = 13;
        while (true) {
            int i16 = i14 + 1;
            char charAt2 = str.charAt(i14);
            if (charAt2 < 55296) {
                this.f31510d = i13 | (charAt2 << i15);
                return;
            } else {
                i13 |= (charAt2 & 8191) << i15;
                i15 += 13;
                i14 = i16;
            }
        }
    }

    public final a7 a() {
        return this.f31507a;
    }

    public final k7 b() {
        int i13 = this.f31510d;
        return (i13 & 1) != 0 ? k7.PROTO2 : (i13 & 4) == 4 ? k7.EDITIONS : k7.PROTO3;
    }

    public final String c() {
        return this.f31508b;
    }

    public final Object[] d() {
        return this.f31509c;
    }
}
