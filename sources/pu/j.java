package pu;

/* loaded from: classes3.dex */
public final class j implements r {

    /* renamed from: a, reason: collision with root package name */
    public final long f101355a;

    public j(long j13) {
        this.f101355a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f101355a == ((j) obj).f101355a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f101355a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnDestroyView(timestamp="), this.f101355a, ")");
    }
}
