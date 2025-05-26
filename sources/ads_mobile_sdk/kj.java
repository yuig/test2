package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class kj implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final double f7333a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7334b;

    public kj(double d2, boolean z13) {
        this.f7333a = d2;
        this.f7334b = z13;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        aj.e eVar = signals.deviceSignals.batterySignals;
        eVar.isCharging = this.f7334b;
        eVar.batteryLevel = this.f7333a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj)) {
            return false;
        }
        kj kjVar = (kj) obj;
        return Double.compare(this.f7333a, kjVar.f7333a) == 0 && this.f7334b == kjVar.f7334b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = Double.hashCode(this.f7333a) * 31;
        boolean z13 = this.f7334b;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        return hashCode + i13;
    }

    public final String toString() {
        return "BatterySignal(batteryLevel=" + this.f7333a + ", isCharging=" + this.f7334b + ")";
    }
}
