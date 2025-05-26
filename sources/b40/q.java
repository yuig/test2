package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final k f21739a;

    public q(k kVar) {
        this.f21739a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f21739a, ((q) obj).f21739a);
    }

    public final int hashCode() {
        k kVar = this.f21739a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public final String toString() {
        return "Data(v3GetCurrentUserHandlerQuery=" + this.f21739a + ")";
    }
}
