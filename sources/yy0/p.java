package yy0;

/* loaded from: classes5.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final int f140469a;

    public p(int i13) {
        this.f140469a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f140469a == ((p) obj).f140469a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f140469a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("LoadUseCases(minSelectedPins="), this.f140469a, ")");
    }
}
