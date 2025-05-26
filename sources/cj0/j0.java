package cj0;

/* loaded from: classes5.dex */
public final class j0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int f27838a;

    public j0(int i13) {
        this.f27838a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.f27838a == ((j0) obj).f27838a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27838a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("BoardViewTypeChanged(type="), this.f27838a, ")");
    }
}
