package f22;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f60976a;

    public b(boolean z13) {
        this.f60976a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f60976a == ((b) obj).f60976a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60976a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("DeactivationPermissionResponse(canDeactivate="), this.f60976a, ")");
    }
}
