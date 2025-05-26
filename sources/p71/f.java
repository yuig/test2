package p71;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f99089a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f99090b;

    public f(boolean z13, boolean z14) {
        this.f99089a = z13;
        this.f99090b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f99089a == fVar.f99089a && this.f99090b == fVar.f99090b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99090b) + (Boolean.hashCode(this.f99089a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RecentSearchesRequestParams(isSearchYourOwnPins=");
        sb3.append(this.f99089a);
        sb3.append(", isTablet=");
        return a.a.r(sb3, this.f99090b, ")");
    }
}
