package b9;

import a.cb;
import a7.k0;
import a7.m0;
import a7.o0;
import d7.d0;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f22224a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22225b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22226c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22227d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22228e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22229f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22230g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f22231h;

    public a(int i13, String str, String str2, int i14, int i15, int i16, int i17, byte[] bArr) {
        this.f22224a = i13;
        this.f22225b = str;
        this.f22226c = str2;
        this.f22227d = i14;
        this.f22228e = i15;
        this.f22229f = i16;
        this.f22230g = i17;
        this.f22231h = bArr;
    }

    public static a d(d0 d0Var) {
        int k13 = d0Var.k();
        String r13 = o0.r(d0Var.w(d0Var.k(), StandardCharsets.US_ASCII));
        String w13 = d0Var.w(d0Var.k(), StandardCharsets.UTF_8);
        int k14 = d0Var.k();
        int k15 = d0Var.k();
        int k16 = d0Var.k();
        int k17 = d0Var.k();
        int k18 = d0Var.k();
        byte[] bArr = new byte[k18];
        d0Var.i(bArr, 0, k18);
        return new a(k13, r13, w13, k14, k15, k16, k17, bArr);
    }

    @Override // a7.m0
    public final void b(k0 k0Var) {
        k0Var.a(this.f22224a, this.f22231h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f22224a == aVar.f22224a && this.f22225b.equals(aVar.f22225b) && this.f22226c.equals(aVar.f22226c) && this.f22227d == aVar.f22227d && this.f22228e == aVar.f22228e && this.f22229f == aVar.f22229f && this.f22230g == aVar.f22230g && Arrays.equals(this.f22231h, aVar.f22231h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22231h) + ((((((((cb.d(this.f22226c, cb.d(this.f22225b, (527 + this.f22224a) * 31, 31), 31) + this.f22227d) * 31) + this.f22228e) * 31) + this.f22229f) * 31) + this.f22230g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f22225b + ", description=" + this.f22226c;
    }
}
