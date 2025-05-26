package mu;

/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f88243a;

    public t0(int i13) {
        this.f88243a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && this.f88243a == ((t0) obj).f88243a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f88243a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ScrollingModuleDisplayState(deviceHeight="), this.f88243a, ")");
    }
}
