package bk1;

/* loaded from: classes2.dex */
public final class y implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23375a;

    public y(int i13) {
        this.f23375a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.f23375a == ((y) obj).f23375a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23375a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("OnColumnIndexChanged(columnIndex="), this.f23375a, ")");
    }
}
