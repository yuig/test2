package ads_mobile_sdk;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class s8 extends a.nb {

    /* renamed from: a, reason: collision with root package name */
    public final int f10994a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10995b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10996c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10997d;

    /* renamed from: e, reason: collision with root package name */
    public final r8 f10998e;

    /* renamed from: f, reason: collision with root package name */
    public final q8 f10999f;

    public s8(int i13, int i14, int i15, int i16, r8 r8Var, q8 q8Var) {
        this.f10994a = i13;
        this.f10995b = i14;
        this.f10996c = i15;
        this.f10997d = i16;
        this.f10998e = r8Var;
        this.f10999f = q8Var;
    }

    @Override // a.p6
    public final boolean a() {
        return this.f10998e != r8.f10544d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s8)) {
            return false;
        }
        s8 s8Var = (s8) obj;
        return s8Var.f10994a == this.f10994a && s8Var.f10995b == this.f10995b && s8Var.f10996c == this.f10996c && s8Var.f10997d == this.f10997d && s8Var.f10998e == this.f10998e && s8Var.f10999f == this.f10999f;
    }

    public final int hashCode() {
        return Objects.hash(s8.class, Integer.valueOf(this.f10994a), Integer.valueOf(this.f10995b), Integer.valueOf(this.f10996c), Integer.valueOf(this.f10997d), this.f10998e, this.f10999f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AesCtrHmacAead Parameters (variant: ");
        sb3.append(this.f10998e);
        sb3.append(", hashType: ");
        sb3.append(this.f10999f);
        sb3.append(", ");
        sb3.append(this.f10996c);
        sb3.append("-byte IV, and ");
        sb3.append(this.f10997d);
        sb3.append("-byte tags, and ");
        sb3.append(this.f10994a);
        sb3.append("-byte AES key, and ");
        return a.a.n(sb3, this.f10995b, "-byte HMAC key)");
    }
}
