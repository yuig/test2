package ni1;

/* loaded from: classes2.dex */
public final class q1 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f90782a;

    public q1(int i13) {
        this.f90782a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1) && this.f90782a == ((q1) obj).f90782a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90782a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("PinRepOnColumnIndexChanged(columnIndex="), this.f90782a, ")");
    }
}
