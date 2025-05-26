package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fw1 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final ew1 f5295a;

    public fw1(ew1 ew1Var) {
        this.f5295a = ew1Var;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        wn0 wn0Var;
        String str;
        Intrinsics.checkNotNullParameter(signals, "signals");
        ew1 ew1Var = this.f5295a;
        if (ew1Var == null || (wn0Var = ew1Var.f4974a) == null || (str = wn0Var.f13123a) == null) {
            return;
        }
        long j13 = wn0Var.f13124b;
        if (j13 > 0) {
            aj.m mVar = signals.personallyIdentifiableInformation;
            mVar.perAppIdV2 = str;
            mVar.paidV2CreationTimeMilliseconds = Long.valueOf(j13);
            mVar.paidV2PubOption = Boolean.valueOf(this.f5295a.f4975b);
            mVar.paidV2UserOption = Boolean.valueOf(this.f5295a.f4975b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fw1) && Intrinsics.d(this.f5295a, ((fw1) obj).f5295a);
    }

    public final int hashCode() {
        ew1 ew1Var = this.f5295a;
        if (ew1Var == null) {
            return 0;
        }
        return ew1Var.hashCode();
    }

    public final String toString() {
        return "PerAppIdV2Signal(paidV2=" + this.f5295a + ")";
    }
}
