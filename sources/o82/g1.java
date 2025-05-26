package o82;

/* loaded from: classes4.dex */
public final class g1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f93599a;

    public g1(int i13) {
        this.f93599a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && this.f93599a == ((g1) obj).f93599a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f93599a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ItemDisappeared(pos="), this.f93599a, ")");
    }
}
