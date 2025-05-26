package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class aw1 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final wn0 f2564a;

    public aw1(wn0 wn0Var) {
        this.f2564a = wn0Var;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        String str;
        Intrinsics.checkNotNullParameter(signals, "signals");
        wn0 wn0Var = this.f2564a;
        if (wn0Var == null || (str = wn0Var.f13123a) == null) {
            return;
        }
        long j13 = wn0Var.f13124b;
        if (j13 > 0) {
            long j14 = (j13 - 978307200000L) / 1000;
            aj.m mVar = signals.personallyIdentifiableInformation;
            mVar.perAppIdV1 = str;
            mVar.paidV1CreationTimeMilliseconds = Long.valueOf(j13);
            mVar.paidV1CreationTimeSeconds = j14 < 0 ? 0L : Long.valueOf(j14);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw1) && Intrinsics.d(this.f2564a, ((aw1) obj).f2564a);
    }

    public final int hashCode() {
        wn0 wn0Var = this.f2564a;
        if (wn0Var == null) {
            return 0;
        }
        return wn0Var.hashCode();
    }

    public final String toString() {
        return "PerAppIdV1Signal(paidV1Info=" + this.f2564a + ")";
    }
}
