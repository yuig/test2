package yi1;

/* loaded from: classes2.dex */
public final class f implements k {

    /* renamed from: a, reason: collision with root package name */
    public final int f139088a;

    public f(int i13) {
        this.f139088a = i13;
    }

    public final int e() {
        return this.f139088a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f139088a == ((f) obj).f139088a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139088a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("AsMeasured(maxHeightConstraint="), this.f139088a, ")");
    }
}
