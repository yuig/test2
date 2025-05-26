package jb1;

import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class n implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f75350a;

    public n() {
        l0 pinalyticsVMState = new l0(new h32.i0(d4.PARENTAL_PASSCODE, a4.PARENTAL_PASSCODE_CODE, null, null, null, null), 2);
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f75350a = pinalyticsVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f75350a, ((n) obj).f75350a);
    }

    public final int hashCode() {
        return this.f75350a.hashCode();
    }

    public final String toString() {
        return "PasscodeSetupCodeVMState(pinalyticsVMState=" + this.f75350a + ")";
    }
}
