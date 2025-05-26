package ub1;

/* loaded from: classes5.dex */
public final class q implements s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f121737a;

    public q(boolean z13) {
        this.f121737a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f121737a == ((q) obj).f121737a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f121737a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("LoadUserSettings(fetchCatalog="), this.f121737a, ")");
    }
}
