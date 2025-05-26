package rj2;

/* loaded from: classes4.dex */
public final class c implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final c f108425c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f108426d;

    /* renamed from: a, reason: collision with root package name */
    public final f f108427a;

    /* renamed from: b, reason: collision with root package name */
    public final qi2.d f108428b;

    static {
        f fVar = f.RECORD_AND_SAMPLE;
        qi2.a aVar = qi2.a.f104005d;
        f108425c = new c(fVar, aVar);
        f108426d = new c(f.DROP, aVar);
        new c(f.RECORD_ONLY, aVar);
    }

    public c(f fVar, qi2.a aVar) {
        if (fVar == null) {
            throw new NullPointerException("Null decision");
        }
        this.f108427a = fVar;
        if (aVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f108428b = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f108427a.equals(cVar.f108427a) && this.f108428b.equals(cVar.f108428b);
    }

    public final int hashCode() {
        return ((this.f108427a.hashCode() ^ 1000003) * 1000003) ^ this.f108428b.hashCode();
    }

    public final String toString() {
        return "ImmutableSamplingResult{decision=" + this.f108427a + ", attributes=" + this.f108428b + "}";
    }
}
