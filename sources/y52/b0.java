package y52;

/* loaded from: classes4.dex */
public final class b0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f137783a;

    public b0(int i13) {
        this.f137783a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && this.f137783a == ((b0) obj).f137783a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f137783a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("SetTooltipShowCount(tooltipShowCount="), this.f137783a, ")");
    }
}
