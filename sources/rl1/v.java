package rl1;

/* loaded from: classes5.dex */
public final class v extends y {

    /* renamed from: b, reason: collision with root package name */
    public final int f108663b;

    public v(int i13) {
        super(i13);
        this.f108663b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f108663b == ((v) obj).f108663b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108663b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f108663b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ImageFailed(id="), this.f108663b, ")");
    }
}
