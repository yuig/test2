package oj2;

/* loaded from: classes4.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final String f95399a;

    /* renamed from: b, reason: collision with root package name */
    public final qi2.d f95400b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95401c;

    /* renamed from: d, reason: collision with root package name */
    public final int f95402d;

    public a(int i13, long j13, qi2.d dVar, String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f95399a = str;
        this.f95400b = dVar;
        this.f95401c = j13;
        this.f95402d = i13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f95399a.equals(((a) cVar).f95399a)) {
            a aVar = (a) cVar;
            if (this.f95400b.equals(aVar.f95400b) && this.f95401c == aVar.f95401c && this.f95402d == aVar.f95402d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f95399a.hashCode() ^ 1000003) * 1000003) ^ this.f95400b.hashCode()) * 1000003;
        long j13 = this.f95401c;
        return ((hashCode ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003) ^ this.f95402d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImmutableEventData{name=");
        sb3.append(this.f95399a);
        sb3.append(", attributes=");
        sb3.append(this.f95400b);
        sb3.append(", epochNanos=");
        sb3.append(this.f95401c);
        sb3.append(", totalAttributeCount=");
        return a.a.n(sb3, this.f95402d, "}");
    }
}
