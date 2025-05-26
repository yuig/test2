package kj2;

import zi2.d;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final zi2.b f79856a = d.f142042a;

    /* renamed from: b, reason: collision with root package name */
    public final mj2.a f79857b;

    /* renamed from: c, reason: collision with root package name */
    public final long f79858c;

    /* renamed from: d, reason: collision with root package name */
    public final ij2.a f79859d;

    public a(long j13, ij2.b bVar, mj2.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null resource");
        }
        this.f79857b = aVar;
        this.f79858c = j13;
        if (bVar == null) {
            throw new NullPointerException("Null exemplarFilter");
        }
        this.f79859d = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f79856a.equals(aVar.f79856a) && this.f79857b.equals(aVar.f79857b) && this.f79858c == aVar.f79858c && this.f79859d.equals(aVar.f79859d);
    }

    public final int hashCode() {
        int hashCode = (((this.f79856a.hashCode() ^ 1000003) * 1000003) ^ this.f79857b.hashCode()) * 1000003;
        long j13 = this.f79858c;
        return ((hashCode ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003) ^ this.f79859d.hashCode();
    }

    public final String toString() {
        return "MeterProviderSharedState{clock=" + this.f79856a + ", resource=" + this.f79857b + ", startEpochNanos=" + this.f79858c + ", exemplarFilter=" + this.f79859d + "}";
    }
}
