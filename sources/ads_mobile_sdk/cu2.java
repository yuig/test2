package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class cu2 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4041a;

    public cu2(String str) {
        this.f4041a = str;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.personallyIdentifiableInformation.adsId = this.f4041a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cu2) && Intrinsics.d(this.f4041a, ((cu2) obj).f4041a);
    }

    public final int hashCode() {
        String str = this.f4041a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.k("TrustlessTokenSignal(trustlessToken=", this.f4041a, ")");
    }
}
