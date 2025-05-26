package ac;

/* loaded from: classes3.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final int f1880a;

    public /* synthetic */ q(int i13) {
        this.f1880a = i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f1880a == ((q) obj).f1880a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1880a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("RawRes(resId="), this.f1880a, ")");
    }
}
