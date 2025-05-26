package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ci implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3918a;

    public ci(boolean z13) {
        this.f3918a = z13;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.isBannerRefreshRequest = Boolean.valueOf(this.f3918a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ci) && this.f3918a == ((ci) obj).f3918a;
    }

    public final int hashCode() {
        boolean z13 = this.f3918a;
        if (z13) {
            return 1;
        }
        return z13 ? 1 : 0;
    }

    public final String toString() {
        return "BannerRefreshSignal(isRefreshRequest=" + this.f3918a + ")";
    }
}
