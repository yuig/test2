package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class pd2 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9643a;

    public pd2(String signalType) {
        Intrinsics.checkNotNullParameter(signalType, "signalType");
        this.f9643a = signalType;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.signalType = this.f9643a;
        signals.isScarRequest = Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd2) && Intrinsics.d(this.f9643a, ((pd2) obj).f9643a);
    }

    public final int hashCode() {
        return this.f9643a.hashCode();
    }

    public final String toString() {
        return a.a.k("ScarSignalTypeSignal(signalType=", this.f9643a, ")");
    }
}
