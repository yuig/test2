package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class bx1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3636a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3637b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3638c;

    public bx1(boolean z13, String prefetchUrl, boolean z14) {
        Intrinsics.checkNotNullParameter(prefetchUrl, "prefetchUrl");
        this.f3636a = z13;
        this.f3637b = prefetchUrl;
        this.f3638c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx1)) {
            return false;
        }
        bx1 bx1Var = (bx1) obj;
        return this.f3636a == bx1Var.f3636a && Intrinsics.d(this.f3637b, bx1Var.f3637b) && this.f3638c == bx1Var.f3638c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        boolean z13 = this.f3636a;
        ?? r03 = z13;
        if (z13) {
            r03 = 1;
        }
        int t13 = kh2.j1.t(r03 * 31, this.f3637b);
        boolean z14 = this.f3638c;
        return t13 + (z14 ? 1 : z14 ? 1 : 0);
    }

    public final String toString() {
        boolean z13 = this.f3636a;
        String str = this.f3637b;
        boolean z14 = this.f3638c;
        StringBuilder sb3 = new StringBuilder("PlayPrewarmOptions(enablePrewarming=");
        sb3.append(z13);
        sb3.append(", prefetchUrl=");
        sb3.append(str);
        sb3.append(", skipOfflineNotificationFlow=");
        return a.a.r(sb3, z14, ")");
    }
}
