package com.google.protobuf;

/* loaded from: classes.dex */
public final class b2 implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f33858a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33859b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f33860c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33861d;

    public b2(o1 o1Var, String str, Object[] objArr) {
        this.f33858a = o1Var;
        this.f33859b = str;
        this.f33860c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f33861d = charAt;
            return;
        }
        int i13 = charAt & 8191;
        int i14 = 13;
        int i15 = 1;
        while (true) {
            int i16 = i15 + 1;
            char charAt2 = str.charAt(i15);
            if (charAt2 < 55296) {
                this.f33861d = i13 | (charAt2 << i14);
                return;
            } else {
                i13 |= (charAt2 & 8191) << i14;
                i14 += 13;
                i15 = i16;
            }
        }
    }

    public final o1 a() {
        return this.f33858a;
    }

    public final Object[] b() {
        return this.f33860c;
    }

    public final String c() {
        return this.f33859b;
    }

    public final y1 d() {
        return (this.f33861d & 1) == 1 ? y1.PROTO2 : y1.PROTO3;
    }
}
