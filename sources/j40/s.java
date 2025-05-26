package j40;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f74624a;

    public s(boolean z13) {
        this.f74624a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f74624a == ((s) obj).f74624a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f74624a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("PageInfo(hasNextPage="), this.f74624a, ")");
    }
}
