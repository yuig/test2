package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fz implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.u f5333a;

    public fz(nm.u consentStateJson) {
        Intrinsics.checkNotNullParameter(consentStateJson, "consentStateJson");
        this.f5333a = consentStateJson;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.csrbEcoData = this.f5333a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fz) && Intrinsics.d(this.f5333a, ((fz) obj).f5333a);
    }

    public final int hashCode() {
        return this.f5333a.f91366a.hashCode();
    }

    public final String toString() {
        return "CsrbEcoDataSignal(consentStateJson=" + this.f5333a + ")";
    }
}
