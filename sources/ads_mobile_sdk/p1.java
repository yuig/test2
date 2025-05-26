package ads_mobile_sdk;

import a.j9;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p1 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final AdvertisingIdClient.Info f9519a;

    public p1(AdvertisingIdClient.Info info2) {
        this.f9519a = info2;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        AdvertisingIdClient.Info info2 = this.f9519a;
        if (info2 != null) {
            aj.m mVar = signals.personallyIdentifiableInformation;
            mVar.adId = info2.getId();
            mVar.isLimitedAdTracking = Boolean.valueOf(this.f9519a.isLimitAdTrackingEnabled());
            mVar.idTypeParameter = "adid";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1) && Intrinsics.d(this.f9519a, ((p1) obj).f9519a);
    }

    public final int hashCode() {
        AdvertisingIdClient.Info info2 = this.f9519a;
        if (info2 == null) {
            return 0;
        }
        return info2.hashCode();
    }

    public final String toString() {
        return "AdIdInfoSignal(adIdInfo=" + this.f9519a + ")";
    }
}
