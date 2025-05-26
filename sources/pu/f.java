package pu;

/* loaded from: classes3.dex */
public final class f implements r {

    /* renamed from: a, reason: collision with root package name */
    public final long f101343a;

    public f(long j13) {
        this.f101343a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f101343a == ((f) obj).f101343a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f101343a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnBottomSheetWebviewCollapsed(timestamp="), this.f101343a, ")");
    }
}
