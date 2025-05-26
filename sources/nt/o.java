package nt;

/* loaded from: classes3.dex */
public final class o extends gh0.b {

    /* renamed from: b, reason: collision with root package name */
    public final int f92117b;

    public o(int i13) {
        this.f92117b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f92117b == ((o) obj).f92117b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92117b);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("DefaultGenderName(genderId="), this.f92117b, ")");
    }
}
