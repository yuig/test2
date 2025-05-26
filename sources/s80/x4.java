package s80;

/* loaded from: classes5.dex */
public final class x4 implements b5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f111847a;

    public x4(boolean z13) {
        this.f111847a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4) && this.f111847a == ((x4) obj).f111847a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111847a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("SetLayerActionsEnabled(enabled="), this.f111847a, ")");
    }
}
