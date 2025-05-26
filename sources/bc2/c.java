package bc2;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f22648a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22649b;

    public c(int i13, int i14) {
        this.f22648a = i13;
        this.f22649b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f22648a == cVar.f22648a && this.f22649b == cVar.f22649b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22649b) + (Integer.hashCode(this.f22648a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Dimensions(width=");
        sb3.append(this.f22648a);
        sb3.append(", height=");
        return a.a.n(sb3, this.f22649b, ")");
    }
}
