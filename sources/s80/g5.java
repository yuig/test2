package s80;

/* loaded from: classes5.dex */
public final class g5 implements h5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f111560a;

    public g5(int i13) {
        this.f111560a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g5) && this.f111560a == ((g5) obj).f111560a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f111560a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("SimpleToast(stringId="), this.f111560a, ")");
    }
}
