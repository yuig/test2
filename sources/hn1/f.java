package hn1;

/* loaded from: classes5.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int f69651a;

    public f(int i13) {
        this.f69651a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f69651a == ((f) obj).f69651a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69651a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Custom(customLayout="), this.f69651a, ")");
    }
}
