package ads_mobile_sdk;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class op0 extends a.v4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9390a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9391b;

    /* renamed from: c, reason: collision with root package name */
    public final np0 f9392c;

    /* renamed from: d, reason: collision with root package name */
    public final mp0 f9393d;

    public op0(int i13, int i14, np0 np0Var, mp0 mp0Var) {
        this.f9390a = i13;
        this.f9391b = i14;
        this.f9392c = np0Var;
        this.f9393d = mp0Var;
    }

    @Override // a.p6
    public final boolean a() {
        return this.f9392c != np0.f8909e;
    }

    public final int b() {
        return this.f9391b;
    }

    public final mp0 c() {
        return this.f9393d;
    }

    public final int d() {
        int i13;
        np0 np0Var = this.f9392c;
        if (np0Var == np0.f8909e) {
            return this.f9391b;
        }
        if (np0Var == np0.f8906b) {
            i13 = this.f9391b;
        } else if (np0Var == np0.f8907c) {
            i13 = this.f9391b;
        } else {
            if (np0Var != np0.f8908d) {
                throw new IllegalStateException("Unknown variant");
            }
            i13 = this.f9391b;
        }
        return i13 + 5;
    }

    public final np0 e() {
        return this.f9392c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof op0)) {
            return false;
        }
        op0 op0Var = (op0) obj;
        return op0Var.f9390a == this.f9390a && op0Var.d() == d() && op0Var.f9392c == this.f9392c && op0Var.f9393d == this.f9393d;
    }

    public final int hashCode() {
        return Objects.hash(op0.class, Integer.valueOf(this.f9390a), Integer.valueOf(this.f9391b), this.f9392c, this.f9393d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HMAC Parameters (variant: ");
        sb3.append(this.f9392c);
        sb3.append(", hashType: ");
        sb3.append(this.f9393d);
        sb3.append(", ");
        sb3.append(this.f9391b);
        sb3.append("-byte tags, and ");
        return a.a.n(sb3, this.f9390a, "-byte key)");
    }
}
