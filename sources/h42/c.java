package h42;

/* loaded from: classes4.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f67647a;

    public c(int i13) {
        this.f67647a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f67647a == ((c) obj).f67647a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67647a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("OnPageSelected(position="), this.f67647a, ")");
    }
}
