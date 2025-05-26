package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rc implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10580a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f10581b;

    public rc(String str, Boolean bool) {
        this.f10580a = str;
        this.f10581b = bool;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        String str = this.f10580a;
        if (str != null) {
            aj.m mVar = signals.personallyIdentifiableInformation;
            mVar.amazonFireAdId = str;
            mVar.isAmazonFireAdIdLimitAdTracking = this.f10581b;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc)) {
            return false;
        }
        rc rcVar = (rc) obj;
        return Intrinsics.d(this.f10580a, rcVar.f10580a) && Intrinsics.d(this.f10581b, rcVar.f10581b);
    }

    public final int hashCode() {
        String str = this.f10580a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f10581b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AmazonFireAdIdSignal(advertisingId=" + this.f10580a + ", limitAdTracking=" + this.f10581b + ")";
    }
}
