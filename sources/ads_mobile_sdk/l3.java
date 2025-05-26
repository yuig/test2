package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l3 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7630a;

    public l3(int i13) {
        this.f7630a = i13;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.adServicesExtensionVersion = this.f7630a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3) && this.f7630a == ((l3) obj).f7630a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7630a);
    }

    public final String toString() {
        return a.a.e("AdServicesExtensionVersionSignal(adServicesExtensionVersion=", this.f7630a, ")");
    }
}
