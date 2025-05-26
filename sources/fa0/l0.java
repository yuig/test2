package fa0;

/* loaded from: classes5.dex */
public final class l0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f61512a;

    public l0(boolean z13) {
        this.f61512a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && this.f61512a == ((l0) obj).f61512a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61512a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("RemixStatusLoaded(enabled="), this.f61512a, ")");
    }
}
