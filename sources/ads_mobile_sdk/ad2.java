package ads_mobile_sdk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ad2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2368a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2369b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2370c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2371d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2372e;

    public ad2(String clickString, String reportUrl, boolean z13, boolean z14, List allowedHeaders) {
        Intrinsics.checkNotNullParameter(clickString, "clickString");
        Intrinsics.checkNotNullParameter(reportUrl, "reportUrl");
        Intrinsics.checkNotNullParameter(allowedHeaders, "allowedHeaders");
        this.f2368a = clickString;
        this.f2369b = reportUrl;
        this.f2370c = z13;
        this.f2371d = z14;
        this.f2372e = allowedHeaders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad2)) {
            return false;
        }
        ad2 ad2Var = (ad2) obj;
        return Intrinsics.d(this.f2368a, ad2Var.f2368a) && Intrinsics.d(this.f2369b, ad2Var.f2369b) && this.f2370c == ad2Var.f2370c && this.f2371d == ad2Var.f2371d && Intrinsics.d(this.f2372e, ad2Var.f2372e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int t13 = kh2.j1.t(this.f2368a.hashCode() * 31, this.f2369b);
        boolean z13 = this.f2370c;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int i14 = (t13 + i13) * 31;
        boolean z14 = this.f2371d;
        return this.f2372e.hashCode() + ((i14 + (z14 ? 1 : z14 ? 1 : 0)) * 31);
    }

    public final String toString() {
        String str = this.f2368a;
        String str2 = this.f2369b;
        boolean z13 = this.f2370c;
        boolean z14 = this.f2371d;
        List list = this.f2372e;
        StringBuilder w13 = a.a.w("SafeBrowsingConfig(clickString=", str, ", reportUrl=", str2, ", nonMaliciousReportingEnabled=");
        a.c.v(w13, z13, ", autoClickProtectionEnabled=", z14, ", allowedHeaders=");
        return a.c.j(w13, list, ")");
    }

    public ad2() {
        this("", "", false, false, kotlin.collections.q0.f80391a);
    }
}
