package nt;

/* loaded from: classes3.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f92080a;

    public k(boolean z13) {
        this.f92080a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f92080a == ((k) obj).f92080a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f92080a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("DataForDisclosure(hasCheckedDisclosure="), this.f92080a, ")");
    }
}
