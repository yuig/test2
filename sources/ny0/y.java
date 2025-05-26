package ny0;

/* loaded from: classes5.dex */
public final class y implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f92654a;

    public y(int i13) {
        this.f92654a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.f92654a == ((y) obj).f92654a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92654a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("BeforeMinimum(numPinsRemaining="), this.f92654a, ")");
    }
}
