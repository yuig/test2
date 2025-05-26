package w80;

/* loaded from: classes5.dex */
public final class e1 implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f128281a;

    public e1(int i13) {
        this.f128281a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && this.f128281a == ((e1) obj).f128281a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f128281a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Label(textResId="), this.f128281a, ")");
    }
}
