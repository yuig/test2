package o82;

/* loaded from: classes4.dex */
public final class a1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f93525a;

    public a1(boolean z13) {
        this.f93525a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && this.f93525a == ((a1) obj).f93525a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93525a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("Clear(hasMore="), this.f93525a, ")");
    }
}
