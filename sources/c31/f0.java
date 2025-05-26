package c31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements i0 {
    public f0() {
        e31.a networkConnectivitySideEffect = e31.a.f57119a;
        Intrinsics.checkNotNullParameter(networkConnectivitySideEffect, "networkConnectivitySideEffect");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        e31.a aVar = e31.a.f57119a;
        ((f0) obj).getClass();
        return Intrinsics.d(aVar, aVar);
    }

    public final int hashCode() {
        return e31.a.f57119a.hashCode();
    }

    public final String toString() {
        return "WrappedNetworkConnectivitySideEffectRequest(networkConnectivitySideEffect=" + e31.a.f57119a + ")";
    }
}
