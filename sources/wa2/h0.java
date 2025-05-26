package wa2;

/* loaded from: classes4.dex */
public final class h0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f128757a;

    public h0(int i13) {
        this.f128757a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && this.f128757a == ((h0) obj).f128757a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f128757a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("LoadAsync(countToLoad="), this.f128757a, ")");
    }
}
