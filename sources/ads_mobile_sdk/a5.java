package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a5 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2256a;

    public a5(String querySignal) {
        Intrinsics.checkNotNullParameter(querySignal, "querySignal");
        this.f2256a = querySignal;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.adShieldSignal = this.f2256a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5) && Intrinsics.d(this.f2256a, ((a5) obj).f2256a);
    }

    public final int hashCode() {
        return this.f2256a.hashCode();
    }

    public final String toString() {
        return a.a.k("AdSpamSignal(querySignal=", this.f2256a, ")");
    }
}
