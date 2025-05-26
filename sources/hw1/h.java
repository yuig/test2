package hw1;

/* loaded from: classes4.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public final ww1.c f70478a;

    public h(ww1.c cVar) {
        this.f70478a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f70478a == ((h) obj).f70478a;
    }

    public final int hashCode() {
        ww1.c cVar = this.f70478a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public final String toString() {
        return "NavigateToGraph(metricType=" + this.f70478a + ")";
    }
}
