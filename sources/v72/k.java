package v72;

/* loaded from: classes4.dex */
public final class k implements p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f124442a;

    public k(boolean z13) {
        this.f124442a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f124442a == ((k) obj).f124442a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124442a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("AutoPlayStateChanged(enabled="), this.f124442a, ")");
    }
}
