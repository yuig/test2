package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ep1 {

    /* renamed from: a, reason: collision with root package name */
    public final dp1 f4915a;

    /* renamed from: b, reason: collision with root package name */
    public final dp1 f4916b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4917c;

    public ep1(dp1 impressionPrerequisite, dp1 clickPrerequisite, boolean z13) {
        Intrinsics.checkNotNullParameter(impressionPrerequisite, "impressionPrerequisite");
        Intrinsics.checkNotNullParameter(clickPrerequisite, "clickPrerequisite");
        this.f4915a = impressionPrerequisite;
        this.f4916b = clickPrerequisite;
        this.f4917c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep1)) {
            return false;
        }
        ep1 ep1Var = (ep1) obj;
        return this.f4915a == ep1Var.f4915a && this.f4916b == ep1Var.f4916b && this.f4917c == ep1Var.f4917c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.f4916b.hashCode() + (this.f4915a.hashCode() * 31)) * 31;
        boolean z13 = this.f4917c;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        return hashCode + i13;
    }

    public final String toString() {
        dp1 dp1Var = this.f4915a;
        dp1 dp1Var2 = this.f4916b;
        boolean z13 = this.f4917c;
        StringBuilder sb3 = new StringBuilder("OfflineAdConfig(impressionPrerequisite=");
        sb3.append(dp1Var);
        sb3.append(", clickPrerequisite=");
        sb3.append(dp1Var2);
        sb3.append(", notificationFlowEnabled=");
        return a.a.r(sb3, z13, ")");
    }
}
