package c2;

/* loaded from: classes2.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f24914a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24915b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24916c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24917d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24918e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24919f;

    /* renamed from: g, reason: collision with root package name */
    public final long f24920g;

    /* renamed from: h, reason: collision with root package name */
    public final long f24921h;

    public l1(long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j23) {
        this.f24914a = j13;
        this.f24915b = j14;
        this.f24916c = j15;
        this.f24917d = j16;
        this.f24918e = j17;
        this.f24919f = j18;
        this.f24920g = j19;
        this.f24921h = j23;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l1.class != obj.getClass()) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return b3.w.c(this.f24914a, l1Var.f24914a) && b3.w.c(this.f24915b, l1Var.f24915b) && b3.w.c(this.f24916c, l1Var.f24916c) && b3.w.c(this.f24917d, l1Var.f24917d) && b3.w.c(this.f24918e, l1Var.f24918e) && b3.w.c(this.f24919f, l1Var.f24919f) && b3.w.c(this.f24920g, l1Var.f24920g) && b3.w.c(this.f24921h, l1Var.f24921h);
    }

    public final int hashCode() {
        int i13 = b3.w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Long.hashCode(this.f24921h) + a.a.c(this.f24920g, a.a.c(this.f24919f, a.a.c(this.f24918e, a.a.c(this.f24917d, a.a.c(this.f24916c, a.a.c(this.f24915b, Long.hashCode(this.f24914a) * 31, 31), 31), 31), 31), 31), 31);
    }
}
