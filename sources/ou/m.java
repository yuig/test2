package ou;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import pu.x;

/* loaded from: classes3.dex */
public final class m implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final x f97699a;

    public m(x adsCoreVmState) {
        Intrinsics.checkNotNullParameter(adsCoreVmState, "adsCoreVmState");
        this.f97699a = adsCoreVmState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f97699a, ((m) obj).f97699a);
    }

    public final int hashCode() {
        return this.f97699a.hashCode();
    }

    public final String toString() {
        return "SbaAdsCollageVmState(adsCoreVmState=" + this.f97699a + ")";
    }
}
