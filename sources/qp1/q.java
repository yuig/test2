package qp1;

/* loaded from: classes5.dex */
public final class q implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f104823a;

    public q(boolean z13) {
        this.f104823a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f104823a == ((q) obj).f104823a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104823a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("OnAuthenticationSuccess(isA2BEnabled="), this.f104823a, ")");
    }
}
