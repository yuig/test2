package mu;

/* loaded from: classes3.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public final long f88207a;

    public j(long j13) {
        this.f88207a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f88207a == ((j) obj).f88207a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f88207a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnViewCreated(fragmentOnViewCreatedTime="), this.f88207a, ")");
    }
}
