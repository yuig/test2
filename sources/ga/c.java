package ga;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f64581a;

    /* renamed from: b, reason: collision with root package name */
    public final long f64582b;

    /* renamed from: c, reason: collision with root package name */
    public final int f64583c;

    public c(int i13, long j13, long j14) {
        this.f64581a = j13;
        this.f64582b = j14;
        this.f64583c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f64581a == cVar.f64581a && this.f64582b == cVar.f64582b && this.f64583c == cVar.f64583c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f64583c) + a.a.c(this.f64582b, Long.hashCode(this.f64581a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TaxonomyVersion=");
        sb3.append(this.f64581a);
        sb3.append(", ModelVersion=");
        sb3.append(this.f64582b);
        sb3.append(", TopicCode=");
        return a.a.j("Topic { ", a.a.n(sb3, this.f64583c, " }"));
    }
}
