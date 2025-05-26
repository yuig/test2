package ra0;

/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f106947a;

    /* renamed from: b, reason: collision with root package name */
    public final long f106948b;

    public i0(long j13, long j14) {
        this.f106947a = j13;
        this.f106948b = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return b3.w.c(this.f106947a, i0Var.f106947a) && b3.w.c(this.f106948b, i0Var.f106948b);
    }

    public final int hashCode() {
        int i13 = b3.w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Long.hashCode(this.f106948b) + (Long.hashCode(this.f106947a) * 31);
    }

    public final String toString() {
        return a.a.m("Colors(light=", b3.w.i(this.f106947a), ", dark=", b3.w.i(this.f106948b), ")");
    }
}
