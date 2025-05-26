package rg0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f108024a;

    /* renamed from: b, reason: collision with root package name */
    public final rm1.c f108025b;

    /* renamed from: c, reason: collision with root package name */
    public final rm1.i f108026c;

    public h(rm1.q qVar, rm1.c cVar, rm1.i iVar) {
        this.f108024a = qVar;
        this.f108025b = cVar;
        this.f108026c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f108024a == hVar.f108024a && this.f108025b == hVar.f108025b && this.f108026c == hVar.f108026c;
    }

    public final int hashCode() {
        rm1.q qVar = this.f108024a;
        int hashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
        rm1.c cVar = this.f108025b;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        rm1.i iVar = this.f108026c;
        return hashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        return "IconData(icon=" + this.f108024a + ", color=" + this.f108025b + ", size=" + this.f108026c + ")";
    }
}
