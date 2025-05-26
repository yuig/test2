package jt1;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f77588a;

    /* renamed from: b, reason: collision with root package name */
    public final long f77589b;

    public d(long j13, long j14) {
        this.f77588a = j13;
        this.f77589b = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f77588a == dVar.f77588a && this.f77589b == dVar.f77589b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f77589b) + (Long.hashCode(this.f77588a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TimeSpan(timeUs=");
        sb3.append(this.f77588a);
        sb3.append(", durationUs=");
        return a.a.o(sb3, this.f77589b, ")");
    }
}
