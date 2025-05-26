package w41;

/* loaded from: classes5.dex */
public final class s0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f128076a;

    public s0(int i13) {
        this.f128076a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && this.f128076a == ((s0) obj).f128076a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f128076a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("MetadataNoFilters(numPins="), this.f128076a, ")");
    }
}
