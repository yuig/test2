package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ue implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final ah.b f12043a;

    public ue(ah.b bVar) {
        this.f12043a = bVar;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        ah.b bVar = this.f12043a;
        if (bVar != null) {
            aj.m mVar = signals.personallyIdentifiableInformation;
            mVar.appSetId = bVar.f15165a;
            mVar.appSetIdScope = Integer.valueOf(bVar.f15166b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ue) && Intrinsics.d(this.f12043a, ((ue) obj).f12043a);
    }

    public final int hashCode() {
        ah.b bVar = this.f12043a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "AppSetIdInfoSignal(appSetIdInfo=" + this.f12043a + ")";
    }
}
