package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13330a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13331b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13332c;

    public x0(int i13, int i14, boolean z13) {
        this.f13330a = i13;
        this.f13331b = i14;
        this.f13332c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f13330a == x0Var.f13330a && this.f13331b == x0Var.f13331b && this.f13332c == x0Var.f13332c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int f13 = kh2.n3.f(this.f13331b, Integer.hashCode(this.f13330a) * 31);
        boolean z13 = this.f13332c;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        return f13 + i13;
    }

    public final String toString() {
        int i13 = this.f13330a;
        int i14 = this.f13331b;
        return a.a.r(a.a.t("AdDimensions(width=", i13, ", height=", i14, ", isFluidHeight="), this.f13332c, ")");
    }
}
