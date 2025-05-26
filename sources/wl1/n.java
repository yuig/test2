package wl1;

/* loaded from: classes5.dex */
public final class n extends q {

    /* renamed from: b, reason: collision with root package name */
    public final int f130205b;

    public n(int i13) {
        super(i13);
        this.f130205b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f130205b == ((n) obj).f130205b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130205b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f130205b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Dismiss(id="), this.f130205b, ")");
    }
}
