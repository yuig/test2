package nl;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f91204a;

    /* renamed from: b, reason: collision with root package name */
    public final long f91205b;

    /* renamed from: c, reason: collision with root package name */
    public final long f91206c;

    public a(long j13, long j14, long j15) {
        this.f91204a = j13;
        this.f91205b = j14;
        this.f91206c = j15;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f91204a == aVar.f91204a && this.f91205b == aVar.f91205b && this.f91206c == aVar.f91206c;
    }

    public final int hashCode() {
        long j13 = this.f91204a;
        long j14 = this.f91205b;
        int i13 = (((((int) (j13 ^ (j13 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003;
        long j15 = this.f91206c;
        return i13 ^ ((int) ((j15 >>> 32) ^ j15));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StartupTime{epochMillis=");
        sb3.append(this.f91204a);
        sb3.append(", elapsedRealtime=");
        sb3.append(this.f91205b);
        sb3.append(", uptimeMillis=");
        return a.a.o(sb3, this.f91206c, "}");
    }
}
