package r0;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final r f105516a;

    /* renamed from: b, reason: collision with root package name */
    public final int f105517b;

    public g(r rVar, int i13) {
        if (rVar == null) {
            throw new NullPointerException("Null quality");
        }
        this.f105516a = rVar;
        this.f105517b = i13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f105516a.equals(gVar.f105516a) && this.f105517b == gVar.f105517b;
    }

    public final int hashCode() {
        return ((this.f105516a.hashCode() ^ 1000003) * 1000003) ^ this.f105517b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("QualityRatio{quality=");
        sb3.append(this.f105516a);
        sb3.append(", aspectRatio=");
        return a.a.n(sb3, this.f105517b, "}");
    }
}
