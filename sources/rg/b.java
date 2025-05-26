package rg;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final b f107934f = new b(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f107935a;

    /* renamed from: b, reason: collision with root package name */
    public final int f107936b;

    /* renamed from: c, reason: collision with root package name */
    public final int f107937c;

    /* renamed from: d, reason: collision with root package name */
    public final long f107938d;

    /* renamed from: e, reason: collision with root package name */
    public final int f107939e;

    public b(long j13, int i13, int i14, long j14, int i15) {
        this.f107935a = j13;
        this.f107936b = i13;
        this.f107937c = i14;
        this.f107938d = j14;
        this.f107939e = i15;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f107935a == bVar.f107935a && this.f107936b == bVar.f107936b && this.f107937c == bVar.f107937c && this.f107938d == bVar.f107938d && this.f107939e == bVar.f107939e;
    }

    public final int hashCode() {
        long j13 = this.f107935a;
        int i13 = (((((((int) (j13 ^ (j13 >>> 32))) ^ 1000003) * 1000003) ^ this.f107936b) * 1000003) ^ this.f107937c) * 1000003;
        long j14 = this.f107938d;
        return ((i13 ^ ((int) ((j14 >>> 32) ^ j14))) * 1000003) ^ this.f107939e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb3.append(this.f107935a);
        sb3.append(", loadBatchSize=");
        sb3.append(this.f107936b);
        sb3.append(", criticalSectionEnterTimeoutMs=");
        sb3.append(this.f107937c);
        sb3.append(", eventCleanUpAge=");
        sb3.append(this.f107938d);
        sb3.append(", maxBlobByteSizePerRow=");
        return a.a.n(sb3, this.f107939e, "}");
    }
}
