package d0;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final l0.j f53506a;

    /* renamed from: b, reason: collision with root package name */
    public final l0.j f53507b;

    /* renamed from: c, reason: collision with root package name */
    public final int f53508c;

    /* renamed from: d, reason: collision with root package name */
    public final int f53509d;

    public e(l0.j jVar, l0.j jVar2, int i13, int i14) {
        this.f53506a = jVar;
        this.f53507b = jVar2;
        this.f53508c = i13;
        this.f53509d = i14;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f53506a.equals(eVar.f53506a) && this.f53507b.equals(eVar.f53507b) && this.f53508c == eVar.f53508c && this.f53509d == eVar.f53509d;
    }

    public final int hashCode() {
        return ((((((this.f53506a.hashCode() ^ 1000003) * 1000003) ^ this.f53507b.hashCode()) * 1000003) ^ this.f53508c) * 1000003) ^ this.f53509d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("In{edge=");
        sb3.append(this.f53506a);
        sb3.append(", postviewEdge=");
        sb3.append(this.f53507b);
        sb3.append(", inputFormat=");
        sb3.append(this.f53508c);
        sb3.append(", outputFormat=");
        return a.a.n(sb3, this.f53509d, "}");
    }
}
