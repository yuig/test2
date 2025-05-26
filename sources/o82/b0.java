package o82;

/* loaded from: classes4.dex */
public final class b0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f93535a;

    public b0(boolean z13) {
        this.f93535a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && this.f93535a == ((b0) obj).f93535a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93535a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("Clear(canBeReloaded="), this.f93535a, ")");
    }
}
