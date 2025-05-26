package xa1;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f134496a;

    public y(int i13) {
        this.f134496a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.f134496a == ((y) obj).f134496a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f134496a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("VerticalSpacerDisplayState(spaceSizeResId="), this.f134496a, ")");
    }
}
