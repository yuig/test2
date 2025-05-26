package ka0;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f78894a;

    public a(int i13) {
        this.f78894a = i13;
    }

    public final int e() {
        return this.f78894a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f78894a == ((a) obj).f78894a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f78894a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("CollageRetrievalDisplayState(selectedTabPosition="), this.f78894a, ")");
    }
}
