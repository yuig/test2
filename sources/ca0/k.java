package ca0;

/* loaded from: classes5.dex */
public final class k implements u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27134a;

    public k(boolean z13) {
        this.f27134a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f27134a == ((k) obj).f27134a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27134a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("EnableRemixChanged(enabled="), this.f27134a, ")");
    }
}
