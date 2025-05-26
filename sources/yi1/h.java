package yi1;

/* loaded from: classes2.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final int f139090a;

    public h(int i13) {
        this.f139090a = i13;
    }

    public final int e() {
        return this.f139090a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f139090a == ((h) obj).f139090a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139090a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Fixed(height="), this.f139090a, ")");
    }
}
