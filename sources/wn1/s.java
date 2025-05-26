package wn1;

/* loaded from: classes5.dex */
public final class s extends z {

    /* renamed from: b, reason: collision with root package name */
    public final int f130581b;

    public s(int i13) {
        super(i13);
        this.f130581b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f130581b == ((s) obj).f130581b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130581b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f130581b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("MediaClick(id="), this.f130581b, ")");
    }
}
