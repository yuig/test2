package zx;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f f142969a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f142970b;

    /* renamed from: c, reason: collision with root package name */
    public final long f142971c;

    /* renamed from: d, reason: collision with root package name */
    public final long f142972d;

    public g(f dateRangeType, boolean z13, long j13, long j14) {
        Intrinsics.checkNotNullParameter(dateRangeType, "dateRangeType");
        this.f142969a = dateRangeType;
        this.f142970b = z13;
        this.f142971c = j13;
        this.f142972d = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f142969a == gVar.f142969a && this.f142970b == gVar.f142970b && this.f142971c == gVar.f142971c && this.f142972d == gVar.f142972d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f142972d) + a.a.c(this.f142971c, ep.b.e(this.f142970b, this.f142969a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DateRange(dateRangeType=" + this.f142969a + ", viewRealTimeEstimates=" + this.f142970b + ", startDate=" + this.f142971c + ", endDate=" + this.f142972d + ")";
    }
}
