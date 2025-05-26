package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s82 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11005a;

    public s82(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f11005a = requestId;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.requestId = this.f11005a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s82) && Intrinsics.d(this.f11005a, ((s82) obj).f11005a);
    }

    public final int hashCode() {
        return this.f11005a.hashCode();
    }

    public final String toString() {
        return a.a.k("RequestIdSignal(requestId=", this.f11005a, ")");
    }
}
