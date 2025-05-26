package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g5 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5404a;

    /* renamed from: b, reason: collision with root package name */
    public String f5405b;

    /* renamed from: c, reason: collision with root package name */
    public String f5406c;

    public /* synthetic */ g5() {
        this(false, "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj;
        return this.f5404a == g5Var.f5404a && Intrinsics.d(this.f5405b, g5Var.f5405b) && Intrinsics.d(this.f5406c, g5Var.f5406c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z13 = this.f5404a;
        ?? r03 = z13;
        if (z13) {
            r03 = 1;
        }
        return this.f5406c.hashCode() + kh2.j1.t(r03 * 31, this.f5405b);
    }

    public final String toString() {
        boolean z13 = this.f5404a;
        String str = this.f5405b;
        String str2 = this.f5406c;
        StringBuilder sb3 = new StringBuilder("AdTraceMeta(impressionEarned=");
        sb3.append(z13);
        sb3.append(", adTraceId=");
        sb3.append(str);
        sb3.append(", backendQueryId=");
        return a.a.p(sb3, str2, ")");
    }

    public g5(boolean z13, String adTraceId, String backendQueryId) {
        Intrinsics.checkNotNullParameter(adTraceId, "adTraceId");
        Intrinsics.checkNotNullParameter(backendQueryId, "backendQueryId");
        this.f5404a = z13;
        this.f5405b = adTraceId;
        this.f5406c = backendQueryId;
    }
}
