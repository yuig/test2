package b2;

/* loaded from: classes2.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f21105a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21106b;

    public a1(long j13, long j14) {
        this.f21105a = j13;
        this.f21106b = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return b3.w.c(this.f21105a, a1Var.f21105a) && b3.w.c(this.f21106b, a1Var.f21106b);
    }

    public final int hashCode() {
        int i13 = b3.w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Long.hashCode(this.f21106b) + (Long.hashCode(this.f21105a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SelectionColors(selectionHandleColor=");
        jq.b.t(this.f21105a, sb3, ", selectionBackgroundColor=");
        sb3.append((Object) b3.w.i(this.f21106b));
        sb3.append(')');
        return sb3.toString();
    }
}
