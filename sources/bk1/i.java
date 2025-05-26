package bk1;

/* loaded from: classes5.dex */
public final class i implements n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23235a;

    public i(boolean z13) {
        this.f23235a = z13;
    }

    public final boolean a() {
        return this.f23235a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f23235a == ((i) obj).f23235a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23235a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("NavigateToCloseupComprehensive(shouldLog="), this.f23235a, ")");
    }
}
