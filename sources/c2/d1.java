package c2;

/* loaded from: classes2.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f24626a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24627b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24628c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24629d;

    public d1(long j13, long j14, long j15, long j16) {
        this.f24626a = j13;
        this.f24627b = j14;
        this.f24628c = j15;
        this.f24629d = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return b3.w.c(this.f24626a, d1Var.f24626a) && b3.w.c(this.f24627b, d1Var.f24627b) && b3.w.c(this.f24628c, d1Var.f24628c) && b3.w.c(this.f24629d, d1Var.f24629d);
    }

    public final int hashCode() {
        int i13 = b3.w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Long.hashCode(this.f24629d) + a.a.c(this.f24628c, a.a.c(this.f24627b, Long.hashCode(this.f24626a) * 31, 31), 31);
    }
}
