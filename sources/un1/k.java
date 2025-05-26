package un1;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final vn1.g f122889a;

    /* renamed from: b, reason: collision with root package name */
    public final vn1.e f122890b;

    /* renamed from: c, reason: collision with root package name */
    public final vn1.c f122891c;

    public k(vn1.g gVar, vn1.e eVar, vn1.c cVar) {
        this.f122889a = gVar;
        this.f122890b = eVar;
        this.f122891c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f122889a == kVar.f122889a && this.f122890b == kVar.f122890b && this.f122891c == kVar.f122891c;
    }

    public final int hashCode() {
        vn1.g gVar = this.f122889a;
        int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        vn1.e eVar = this.f122890b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        vn1.c cVar = this.f122891c;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "SuffixStyle(variant=" + this.f122889a + ", style=" + this.f122890b + ", color=" + this.f122891c + ")";
    }
}
