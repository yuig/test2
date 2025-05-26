package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public final class o1 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final b f33671a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33672b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f33673c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33674d;

    public o1(f0 f0Var, String str, Object[] objArr) {
        this.f33671a = f0Var;
        this.f33672b = str;
        this.f33673c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f33674d = charAt;
            return;
        }
        int i13 = charAt & 8191;
        int i14 = 1;
        int i15 = 13;
        while (true) {
            int i16 = i14 + 1;
            char charAt2 = str.charAt(i14);
            if (charAt2 < 55296) {
                this.f33674d = i13 | (charAt2 << i15);
                return;
            } else {
                i13 |= (charAt2 & 8191) << i15;
                i15 += 13;
                i14 = i16;
            }
        }
    }

    public final b a() {
        return this.f33671a;
    }

    public final Object[] b() {
        return this.f33673c;
    }

    public final String c() {
        return this.f33672b;
    }

    public final l1 d() {
        int i13 = this.f33674d;
        return (i13 & 1) != 0 ? l1.PROTO2 : (i13 & 4) == 4 ? l1.EDITIONS : l1.PROTO3;
    }
}
