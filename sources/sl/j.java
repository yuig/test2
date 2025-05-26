package sl;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final q f113148a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f113149b;

    public j(q qVar, boolean z13) {
        this.f113148a = qVar;
        this.f113149b = z13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f113148a.equals(this.f113148a) && jVar.f113149b == this.f113149b;
    }

    public final int hashCode() {
        return ((this.f113148a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f113149b).hashCode();
    }
}
