package yx1;

/* loaded from: classes4.dex */
public final class b0 extends jk.v {

    /* renamed from: b, reason: collision with root package name */
    public final int f140353b;

    public b0(int i13) {
        this.f140353b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && this.f140353b == ((b0) obj).f140353b;
    }

    public final int g0() {
        return this.f140353b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f140353b);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Unavailable(message="), this.f140353b, ")");
    }
}
