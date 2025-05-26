package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;
import wi.s;

/* loaded from: classes2.dex */
public final class mk0 extends jk0 {

    /* renamed from: c, reason: collision with root package name */
    public final s f8263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk0(s mediationAdError) {
        super(yx0.f14449g, 0);
        Intrinsics.checkNotNullParameter(mediationAdError, "mediationAdError");
        this.f8263c = mediationAdError;
    }

    public final s c() {
        return this.f8263c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mk0) && Intrinsics.d(this.f8263c, ((mk0) obj).f8263c);
    }

    public final int hashCode() {
        return this.f8263c.hashCode();
    }

    public final String toString() {
        return "InternalMediationAdError(mediationAdError=" + this.f8263c + ")";
    }
}
