package ads_mobile_sdk;

import a.j9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class tc2 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final List f11507a;

    public tc2(List rtbAdapterDataList) {
        Intrinsics.checkNotNullParameter(rtbAdapterDataList, "rtbAdapterDataList");
        this.f11507a = rtbAdapterDataList;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.realTimeBiddingSignals = new nm.o().k(this.f11507a);
        signals.f15394y0 = this.f11507a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc2) && Intrinsics.d(this.f11507a, ((tc2) obj).f11507a);
    }

    public final int hashCode() {
        return this.f11507a.hashCode();
    }

    public final String toString() {
        return "RtbSignal(rtbAdapterDataList=" + this.f11507a + ")";
    }
}
