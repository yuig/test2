package f2;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f60862a;

    /* renamed from: b, reason: collision with root package name */
    public final long f60863b;

    /* renamed from: c, reason: collision with root package name */
    public final long f60864c;

    /* renamed from: d, reason: collision with root package name */
    public final long f60865d;

    /* renamed from: e, reason: collision with root package name */
    public final long f60866e;

    /* renamed from: f, reason: collision with root package name */
    public final long f60867f;

    /* renamed from: g, reason: collision with root package name */
    public final long f60868g;

    /* renamed from: h, reason: collision with root package name */
    public final long f60869h;

    /* renamed from: i, reason: collision with root package name */
    public final long f60870i;

    /* renamed from: j, reason: collision with root package name */
    public final long f60871j;

    public k(long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j23, long j24, long j25) {
        this.f60862a = j13;
        this.f60863b = j14;
        this.f60864c = j15;
        this.f60865d = j16;
        this.f60866e = j17;
        this.f60867f = j18;
        this.f60868g = j19;
        this.f60869h = j23;
        this.f60870i = j24;
        this.f60871j = j25;
    }

    public final long a(boolean z13, boolean z14) {
        return z13 ? z14 ? this.f60863b : this.f60865d : z14 ? this.f60868g : this.f60870i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return b3.w.c(this.f60862a, kVar.f60862a) && b3.w.c(this.f60863b, kVar.f60863b) && b3.w.c(this.f60864c, kVar.f60864c) && b3.w.c(this.f60865d, kVar.f60865d) && b3.w.c(this.f60866e, kVar.f60866e) && b3.w.c(this.f60867f, kVar.f60867f) && b3.w.c(this.f60868g, kVar.f60868g) && b3.w.c(this.f60869h, kVar.f60869h) && b3.w.c(this.f60870i, kVar.f60870i) && b3.w.c(this.f60871j, kVar.f60871j);
    }

    public final int hashCode() {
        int i13 = b3.w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Long.hashCode(this.f60871j) + a.a.c(this.f60870i, a.a.c(this.f60869h, a.a.c(this.f60868g, a.a.c(this.f60867f, a.a.c(this.f60866e, a.a.c(this.f60865d, a.a.c(this.f60864c, a.a.c(this.f60863b, Long.hashCode(this.f60862a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
