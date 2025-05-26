package yi1;

/* loaded from: classes2.dex */
public final class y implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f139169a;

    public y(int i13) {
        this.f139169a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.f139169a == ((y) obj).f139169a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139169a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("OnColumnIndexChanged(columnIndex="), this.f139169a, ")");
    }
}
