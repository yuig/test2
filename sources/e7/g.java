package e7;

import a7.m0;

/* loaded from: classes.dex */
public final class g implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f57533a;

    /* renamed from: b, reason: collision with root package name */
    public final long f57534b;

    /* renamed from: c, reason: collision with root package name */
    public final long f57535c;

    public g(long j13, long j14, long j15) {
        this.f57533a = j13;
        this.f57534b = j14;
        this.f57535c = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f57533a == gVar.f57533a && this.f57534b == gVar.f57534b && this.f57535c == gVar.f57535c;
    }

    public final int hashCode() {
        return bs1.c.W0(this.f57535c) + ((bs1.c.W0(this.f57534b) + ((bs1.c.W0(this.f57533a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f57533a + ", modification time=" + this.f57534b + ", timescale=" + this.f57535c;
    }
}
