package s80;

/* loaded from: classes5.dex */
public final class u0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f111808a;

    public u0(boolean z13) {
        this.f111808a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && this.f111808a == ((u0) obj).f111808a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111808a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("DoneClicked(drawingAdded="), this.f111808a, ")");
    }
}
