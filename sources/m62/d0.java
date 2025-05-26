package m62;

/* loaded from: classes4.dex */
public final class d0 extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f85967a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f85968b;

    public d0(int i13, boolean z13) {
        this.f85967a = i13;
        this.f85968b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f85967a == d0Var.f85967a && this.f85968b == d0Var.f85968b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85968b) + (Integer.hashCode(this.f85967a) * 31);
    }

    public final String toString() {
        return "ScrollEffectsToPosition(position=" + this.f85967a + ", smoothScroll=" + this.f85968b + ")";
    }
}
