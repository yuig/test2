package yi1;

/* loaded from: classes2.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final int f139104a;

    public i(int i13) {
        this.f139104a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f139104a == ((i) obj).f139104a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139104a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Maximized(maxHeightConstraint="), this.f139104a, ")");
    }
}
