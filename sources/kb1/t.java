package kb1;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class t implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f79095a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f79096b;

    public t(l0 pinalyticsVMState, String confirmedCode) {
        Intrinsics.checkNotNullParameter(confirmedCode, "confirmedCode");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f79095a = confirmedCode;
        this.f79096b = pinalyticsVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f79095a, tVar.f79095a) && Intrinsics.d(this.f79096b, tVar.f79096b);
    }

    public final int hashCode() {
        return this.f79096b.hashCode() + (this.f79095a.hashCode() * 31);
    }

    public final String toString() {
        return "PasscodeSetupEmailVMState(confirmedCode=" + this.f79095a + ", pinalyticsVMState=" + this.f79096b + ")";
    }
}
