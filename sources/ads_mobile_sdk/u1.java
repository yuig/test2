package ads_mobile_sdk;

import a.j9;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u1 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11785a;

    public u1(boolean z13) {
        this.f11785a = z13;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.adIdPermission = this.f11785a ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1) && this.f11785a == ((u1) obj).f11785a;
    }

    public final int hashCode() {
        boolean z13 = this.f11785a;
        if (z13) {
            return 1;
        }
        return z13 ? 1 : 0;
    }

    public final String toString() {
        return "AdIdPermissionSignal(adIdPermissionStatus=" + this.f11785a + ")";
    }
}
