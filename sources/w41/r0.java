package w41;

/* loaded from: classes5.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f128072a;

    /* renamed from: b, reason: collision with root package name */
    public final int f128073b;

    public r0(int i13, int i14) {
        this.f128072a = i13;
        this.f128073b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f128072a == r0Var.f128072a && this.f128073b == r0Var.f128073b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f128073b) + (Integer.hashCode(this.f128072a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProfilePinsMetadataArgs(numResults=");
        sb3.append(this.f128072a);
        sb3.append(", numFilters=");
        return a.a.n(sb3, this.f128073b, ")");
    }
}
