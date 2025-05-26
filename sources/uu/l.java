package uu;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import pu.x;

/* loaded from: classes3.dex */
public final class l implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final x f123128a;

    public l(x adsCoreVmState) {
        Intrinsics.checkNotNullParameter(adsCoreVmState, "adsCoreVmState");
        this.f123128a = adsCoreVmState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f123128a, ((l) obj).f123128a);
    }

    public final int hashCode() {
        return this.f123128a.hashCode();
    }

    public final String toString() {
        return "SbaAdsStandardVmState(adsCoreVmState=" + this.f123128a + ")";
    }
}
