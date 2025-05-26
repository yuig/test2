package ads_mobile_sdk;

import a.j9;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a70 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2296a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2297b;

    public a70(String creativePreviewToken, boolean z13) {
        Intrinsics.checkNotNullParameter(creativePreviewToken, "creativePreviewToken");
        this.f2296a = creativePreviewToken;
        this.f2297b = z13;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        if (this.f2296a.length() > 0) {
            signals.creativeToken = this.f2296a;
        }
        if (this.f2297b) {
            signals.debugSignalsEnabled = SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a70)) {
            return false;
        }
        a70 a70Var = (a70) obj;
        return Intrinsics.d(this.f2296a, a70Var.f2296a) && this.f2297b == a70Var.f2297b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f2296a.hashCode() * 31;
        boolean z13 = this.f2297b;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        return hashCode + i13;
    }

    public final String toString() {
        return "DebugSignal(creativePreviewToken=" + this.f2296a + ", isTroubleshooting=" + this.f2297b + ")";
    }
}
