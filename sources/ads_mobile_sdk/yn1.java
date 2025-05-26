package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class yn1 {

    /* renamed from: a, reason: collision with root package name */
    public final zn1 f14343a;

    public yn1(zn1 networkPingStrategy) {
        Intrinsics.checkNotNullParameter(networkPingStrategy, "networkPingStrategy");
        this.f14343a = networkPingStrategy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yn1) && Intrinsics.d(this.f14343a, ((yn1) obj).f14343a);
    }

    public final int hashCode() {
        return this.f14343a.hashCode();
    }

    public final String toString() {
        return "NetworkPingConfig(networkPingStrategy=" + this.f14343a + ")";
    }
}
