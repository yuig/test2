package lm0;

/* loaded from: classes5.dex */
public final class p implements y {

    /* renamed from: a, reason: collision with root package name */
    public final int f83890a;

    public p(int i13) {
        this.f83890a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f83890a == ((p) obj).f83890a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f83890a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ItemMoveStarted(position="), this.f83890a, ")");
    }
}
