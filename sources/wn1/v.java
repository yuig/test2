package wn1;

/* loaded from: classes5.dex */
public final class v extends z {

    /* renamed from: b, reason: collision with root package name */
    public final int f130586b;

    public v(int i13) {
        super(i13);
        this.f130586b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f130586b == ((v) obj).f130586b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130586b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f130586b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("PrimaryIconClick(id="), this.f130586b, ")");
    }
}
