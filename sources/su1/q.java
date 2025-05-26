package su1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f115245a;

    /* renamed from: b, reason: collision with root package name */
    public final long f115246b;

    /* renamed from: c, reason: collision with root package name */
    public final long f115247c;

    /* renamed from: d, reason: collision with root package name */
    public final String f115248d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f115249e;

    /* renamed from: f, reason: collision with root package name */
    public final String f115250f;

    public q(long j13, long j14, long j15, String requestUrl, boolean z13, String httpMethod) {
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        this.f115245a = j13;
        this.f115246b = j14;
        this.f115247c = j15;
        this.f115248d = requestUrl;
        this.f115249e = z13;
        this.f115250f = httpMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f115245a == qVar.f115245a && this.f115246b == qVar.f115246b && this.f115247c == qVar.f115247c && Intrinsics.d(this.f115248d, qVar.f115248d) && this.f115249e == qVar.f115249e && Intrinsics.d(this.f115250f, qVar.f115250f);
    }

    public final int hashCode() {
        return this.f115250f.hashCode() + ep.b.e(this.f115249e, cb.d(this.f115248d, a.a.c(this.f115247c, a.a.c(this.f115246b, Long.hashCode(this.f115245a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RequestMetricsData(requestSize=");
        sb3.append(this.f115245a);
        sb3.append(", requestSizeSent=");
        sb3.append(this.f115246b);
        sb3.append(", requestHeadersSizeInBytes=");
        sb3.append(this.f115247c);
        sb3.append(", requestUrl=");
        sb3.append(this.f115248d);
        sb3.append(", isRequestBodyGzipped=");
        sb3.append(this.f115249e);
        sb3.append(", httpMethod=");
        return a.a.p(sb3, this.f115250f, ")");
    }
}
