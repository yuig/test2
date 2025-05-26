package zm2;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f142226a;

    /* renamed from: b, reason: collision with root package name */
    public final int f142227b;

    public j(c cVar, int i13) {
        this.f142226a = cVar;
        this.f142227b = i13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f142226a == jVar.f142226a && this.f142227b == jVar.f142227b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f142226a) * 65535) + this.f142227b;
    }
}
