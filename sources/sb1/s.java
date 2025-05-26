package sb1;

import h32.a4;
import h32.d4;
import h32.g0;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class s implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f112267a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f112268b;

    public s() {
        l0 pinalyticsState = new l0(new h32.i0(d4.SETTINGS, a4.PARENTAL_PASSCODE_SETTINGS, null, g0.PARENTAL_PASSCODE_SETTINGS_VIEW, null, null), 2);
        Intrinsics.checkNotNullParameter("me", "modelId");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f112267a = "me";
        this.f112268b = pinalyticsState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f112267a, sVar.f112267a) && Intrinsics.d(this.f112268b, sVar.f112268b);
    }

    public final int hashCode() {
        return this.f112268b.hashCode() + (this.f112267a.hashCode() * 31);
    }

    public final String toString() {
        return "PasscodeSummaryVMState(modelId=" + this.f112267a + ", pinalyticsState=" + this.f112268b + ")";
    }
}
