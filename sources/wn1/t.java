package wn1;

/* loaded from: classes5.dex */
public final class t extends z {

    /* renamed from: b, reason: collision with root package name */
    public final int f130582b;

    public t(int i13) {
        super(i13);
        this.f130582b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f130582b == ((t) obj).f130582b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130582b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f130582b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("MediaRemoveCallback(id="), this.f130582b, ")");
    }
}
