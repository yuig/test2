package bi1;

/* loaded from: classes5.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22841a;

    public d(boolean z13) {
        this.f22841a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f22841a == ((d) obj).f22841a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22841a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("ClosedCaptionsClicked(isClosedCaptionsToggledOn="), this.f22841a, ")");
    }
}
