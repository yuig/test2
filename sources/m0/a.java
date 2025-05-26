package m0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final n0.c f85248a;

    /* renamed from: b, reason: collision with root package name */
    public final n0.c f85249b;

    public a(n0.c cVar, n0.c cVar2) {
        this.f85248a = cVar;
        this.f85249b = cVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f85248a.equals(aVar.f85248a) && this.f85249b.equals(aVar.f85249b);
    }

    public final int hashCode() {
        return ((this.f85248a.hashCode() ^ 1000003) * 1000003) ^ this.f85249b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f85248a + ", secondaryOutConfig=" + this.f85249b + "}";
    }
}
