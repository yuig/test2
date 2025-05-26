package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class zn1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14840a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14841b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14842c;

    /* renamed from: d, reason: collision with root package name */
    public final double f14843d;

    public zn1(int i13, int i14, boolean z13, double d2) {
        this.f14840a = i13;
        this.f14841b = i14;
        this.f14842c = z13;
        this.f14843d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn1)) {
            return false;
        }
        zn1 zn1Var = (zn1) obj;
        return this.f14840a == zn1Var.f14840a && this.f14841b == zn1Var.f14841b && this.f14842c == zn1Var.f14842c && Double.compare(this.f14843d, zn1Var.f14843d) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int f13 = kh2.n3.f(this.f14841b, Integer.hashCode(this.f14840a) * 31);
        boolean z13 = this.f14842c;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        return Double.hashCode(this.f14843d) + ((f13 + i13) * 31);
    }

    public final String toString() {
        int i13 = this.f14840a;
        int i14 = this.f14841b;
        boolean z13 = this.f14842c;
        double d2 = this.f14843d;
        StringBuilder t13 = a.a.t("NetworkPingStrategy(maxAttempts=", i13, ", initialBackoffMs=", i14, ", bufferAfterMaxAttempts=");
        t13.append(z13);
        t13.append(", backoffMultiplier=");
        t13.append(d2);
        t13.append(")");
        return t13.toString();
    }
}
