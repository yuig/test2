package ay1;

/* loaded from: classes4.dex */
public final class j implements q {

    /* renamed from: a, reason: collision with root package name */
    public final ww1.c f20676a;

    public j(ww1.c cVar) {
        this.f20676a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f20676a == ((j) obj).f20676a;
    }

    public final int hashCode() {
        ww1.c cVar = this.f20676a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public final String toString() {
        return "NavigateToGraph(metricType=" + this.f20676a + ")";
    }
}
