package su1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final long f115251a;

    /* renamed from: b, reason: collision with root package name */
    public final long f115252b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f115253c;

    /* renamed from: d, reason: collision with root package name */
    public final long f115254d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f115255e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f115256f;

    public r(long j13, long j14, Long l13, long j15, boolean z13, Integer num) {
        this.f115251a = j13;
        this.f115252b = j14;
        this.f115253c = l13;
        this.f115254d = j15;
        this.f115255e = z13;
        this.f115256f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f115251a == rVar.f115251a && this.f115252b == rVar.f115252b && Intrinsics.d(this.f115253c, rVar.f115253c) && this.f115254d == rVar.f115254d && this.f115255e == rVar.f115255e && Intrinsics.d(this.f115256f, rVar.f115256f);
    }

    public final int hashCode() {
        int c13 = a.a.c(this.f115252b, Long.hashCode(this.f115251a) * 31, 31);
        Long l13 = this.f115253c;
        int e13 = ep.b.e(this.f115255e, a.a.c(this.f115254d, (c13 + (l13 == null ? 0 : l13.hashCode())) * 31, 31), 31);
        Integer num = this.f115256f;
        return e13 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ResponseMetricsData(ttfb=");
        sb3.append(this.f115251a);
        sb3.append(", taskDuration=");
        sb3.append(this.f115252b);
        sb3.append(", dnsDuration=");
        sb3.append(this.f115253c);
        sb3.append(", responseSizeReceived=");
        sb3.append(this.f115254d);
        sb3.append(", reusedConnection=");
        sb3.append(this.f115255e);
        sb3.append(", errorCode=");
        return a.c.i(sb3, this.f115256f, ")");
    }
}
