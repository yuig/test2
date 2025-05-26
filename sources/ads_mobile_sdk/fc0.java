package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class fc0 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5098a;

    public fc0(String experimentIds) {
        Intrinsics.checkNotNullParameter(experimentIds, "experimentIds");
        this.f5098a = experimentIds;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        if (!z.j(this.f5098a)) {
            signals.experimentIds = this.f5098a;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fc0) && Intrinsics.d(this.f5098a, ((fc0) obj).f5098a);
    }

    public final int hashCode() {
        return this.f5098a.hashCode();
    }

    public final String toString() {
        return a.a.k("ExperimentIdsSignal(experimentIds=", this.f5098a, ")");
    }
}
