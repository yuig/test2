package ui1;

/* loaded from: classes5.dex */
public final class m implements q {

    /* renamed from: a, reason: collision with root package name */
    public final int f122300a;

    public m(int i13) {
        this.f122300a = i13;
        int i14 = g.f122294a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f122300a == ((m) obj).f122300a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122300a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("PinChips(pressedIndex="), this.f122300a, ")");
    }
}
