package nc2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f90382a = 5000000;

    /* renamed from: b, reason: collision with root package name */
    public final int f90383b = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final int f90384c = 1000;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f90382a == aVar.f90382a && this.f90383b == aVar.f90383b && this.f90384c == aVar.f90384c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90384c) + ep.b.b(this.f90383b, Integer.hashCode(this.f90382a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DefaultCodecMaxValues(maxBitrate=");
        sb3.append(this.f90382a);
        sb3.append(", maxWidth=");
        sb3.append(this.f90383b);
        sb3.append(", maxHeight=");
        return a.a.n(sb3, this.f90384c, ")");
    }
}
