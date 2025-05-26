package ads_mobile_sdk;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class e8 extends a.v4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4749a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4750b;

    /* renamed from: c, reason: collision with root package name */
    public final d8 f4751c;

    public e8(int i13, int i14, d8 d8Var) {
        this.f4749a = i13;
        this.f4750b = i14;
        this.f4751c = d8Var;
    }

    @Override // a.p6
    public final boolean a() {
        return this.f4751c != d8.f4194e;
    }

    public final int b() {
        return this.f4750b;
    }

    public final int c() {
        int i13;
        d8 d8Var = this.f4751c;
        if (d8Var == d8.f4194e) {
            return this.f4750b;
        }
        if (d8Var == d8.f4191b) {
            i13 = this.f4750b;
        } else if (d8Var == d8.f4192c) {
            i13 = this.f4750b;
        } else {
            if (d8Var != d8.f4193d) {
                throw new IllegalStateException("Unknown variant");
            }
            i13 = this.f4750b;
        }
        return i13 + 5;
    }

    public final d8 d() {
        return this.f4751c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) obj;
        return e8Var.f4749a == this.f4749a && e8Var.c() == c() && e8Var.f4751c == this.f4751c;
    }

    public final int hashCode() {
        return Objects.hash(e8.class, Integer.valueOf(this.f4749a), Integer.valueOf(this.f4750b), this.f4751c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb3.append(this.f4751c);
        sb3.append(", ");
        sb3.append(this.f4750b);
        sb3.append("-byte tags, and ");
        return a.a.n(sb3, this.f4749a, "-byte key)");
    }
}
