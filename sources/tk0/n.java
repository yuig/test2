package tk0;

/* loaded from: classes5.dex */
public final class n implements q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f117985a;

    public n(boolean z13) {
        this.f117985a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f117985a == ((n) obj).f117985a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f117985a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("ShowDeleteConfirmationAndMaybeClearSelection(success="), this.f117985a, ")");
    }
}
