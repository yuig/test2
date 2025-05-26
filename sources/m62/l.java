package m62;

/* loaded from: classes4.dex */
public final class l extends n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f86029a;

    public l(boolean z13) {
        this.f86029a = z13;
    }

    @Override // m62.n
    public final String a() {
        return "_reset";
    }

    @Override // m62.n
    public final boolean b() {
        return this.f86029a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f86029a == ((l) obj).f86029a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86029a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("Reset(isSelected="), this.f86029a, ")");
    }
}
