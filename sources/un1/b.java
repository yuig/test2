package un1;

/* loaded from: classes5.dex */
public final class b extends gm1.c {

    /* renamed from: b, reason: collision with root package name */
    public final int f122862b;

    public b(int i13) {
        super(i13);
        this.f122862b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f122862b == ((b) obj).f122862b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122862b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f122862b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("SuffixClick(id="), this.f122862b, ")");
    }
}
