package w41;

/* loaded from: classes5.dex */
public final class t0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f128087a;

    /* renamed from: b, reason: collision with root package name */
    public final int f128088b;

    public t0(int i13, int i14) {
        this.f128087a = i13;
        this.f128088b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f128087a == t0Var.f128087a && this.f128088b == t0Var.f128088b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f128088b) + (Integer.hashCode(this.f128087a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MetadataWithFilters(numPins=");
        sb3.append(this.f128087a);
        sb3.append(", numFilters=");
        return a.a.n(sb3, this.f128088b, ")");
    }
}
