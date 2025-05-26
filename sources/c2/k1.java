package c2;

/* loaded from: classes2.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f24877a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24878b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24879c;

    public k1(long j13, long j14, long j15) {
        this.f24877a = j13;
        this.f24878b = j14;
        this.f24879c = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k1.class != obj.getClass()) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return b3.w.c(this.f24877a, k1Var.f24877a) && b3.w.c(this.f24878b, k1Var.f24878b) && b3.w.c(this.f24879c, k1Var.f24879c);
    }

    public final int hashCode() {
        int i13 = b3.w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Long.hashCode(this.f24879c) + a.a.c(this.f24878b, Long.hashCode(this.f24877a) * 31, 31);
    }
}
