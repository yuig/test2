package s80;

/* loaded from: classes5.dex */
public final class g0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f111541a;

    public g0(long j13) {
        this.f111541a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && b3.w.c(this.f111541a, ((g0) obj).f111541a);
    }

    public final int hashCode() {
        int i13 = b3.w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Long.hashCode(this.f111541a);
    }

    public final String toString() {
        return a.a.k("ColorSelectedForPreview(color=", b3.w.i(this.f111541a), ")");
    }
}
