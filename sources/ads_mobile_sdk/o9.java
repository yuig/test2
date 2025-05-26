package ads_mobile_sdk;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class o9 extends a.nb {

    /* renamed from: a, reason: collision with root package name */
    public final int f9183a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9184b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9185c;

    /* renamed from: d, reason: collision with root package name */
    public final n9 f9186d;

    public o9(int i13, int i14, int i15, n9 n9Var) {
        this.f9183a = i13;
        this.f9184b = i14;
        this.f9185c = i15;
        this.f9186d = n9Var;
    }

    @Override // a.p6
    public final boolean a() {
        return this.f9186d != n9.f8723d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o9)) {
            return false;
        }
        o9 o9Var = (o9) obj;
        return o9Var.f9183a == this.f9183a && o9Var.f9184b == this.f9184b && o9Var.f9185c == this.f9185c && o9Var.f9186d == this.f9186d;
    }

    public final int hashCode() {
        return Objects.hash(o9.class, Integer.valueOf(this.f9183a), Integer.valueOf(this.f9184b), Integer.valueOf(this.f9185c), this.f9186d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AesEax Parameters (variant: ");
        sb3.append(this.f9186d);
        sb3.append(", ");
        sb3.append(this.f9184b);
        sb3.append("-byte IV, ");
        sb3.append(this.f9185c);
        sb3.append("-byte tag, and ");
        return a.a.n(sb3, this.f9183a, "-byte key)");
    }
}
