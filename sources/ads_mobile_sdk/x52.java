package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x52 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final aj.d f13495a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13496b;

    /* renamed from: c, reason: collision with root package name */
    public final aj.b f13497c;

    public x52(aj.d appStats, int i13, aj.b adUnitQualitySignals) {
        Intrinsics.checkNotNullParameter(appStats, "appStats");
        Intrinsics.checkNotNullParameter(adUnitQualitySignals, "adUnitQualitySignals");
        this.f13495a = appStats;
        this.f13496b = i13;
        this.f13497c = adUnitQualitySignals;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        int i13 = this.f13496b;
        if (i13 > 0) {
            signals.numberOfRegisteredWebViews = Integer.valueOf(i13);
        }
        signals.qualitySignals = new aj.o(this.f13495a);
        signals.adUnitQualitySignals = this.f13497c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x52)) {
            return false;
        }
        x52 x52Var = (x52) obj;
        return Intrinsics.d(this.f13495a, x52Var.f13495a) && this.f13496b == x52Var.f13496b && Intrinsics.d(this.f13497c, x52Var.f13497c);
    }

    public final int hashCode() {
        return this.f13497c.hashCode() + kh2.n3.f(this.f13496b, this.f13495a.hashCode() * 31);
    }

    public final String toString() {
        return "QualitySignal(appStats=" + this.f13495a + ", numberOfRegisteredWebViews=" + this.f13496b + ", adUnitQualitySignals=" + this.f13497c + ")";
    }
}
