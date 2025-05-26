package w21;

/* loaded from: classes5.dex */
public final class n implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f127753a;

    public n(int i13) {
        this.f127753a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f127753a == ((n) obj).f127753a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f127753a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ButtonTrayClicked(index="), this.f127753a, ")");
    }
}
