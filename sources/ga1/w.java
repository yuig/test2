package ga1;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class w implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f64657a;

    /* renamed from: b, reason: collision with root package name */
    public final e82.u f64658b;

    public w(l0 pinalyticsVMState, e82.u uVar) {
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f64657a = pinalyticsVMState;
        this.f64658b = uVar;
    }

    public static w b(w wVar, l0 pinalyticsVMState, e82.u uVar, int i13) {
        if ((i13 & 1) != 0) {
            pinalyticsVMState = wVar.f64657a;
        }
        if ((i13 & 2) != 0) {
            uVar = wVar.f64658b;
        }
        wVar.getClass();
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new w(pinalyticsVMState, uVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f64657a, wVar.f64657a) && this.f64658b == wVar.f64658b;
    }

    public final int hashCode() {
        int hashCode = this.f64657a.hashCode() * 31;
        e82.u uVar = this.f64658b;
        return hashCode + (uVar == null ? 0 : uVar.hashCode());
    }

    public final String toString() {
        return "ClaimSuccessVMState(pinalyticsVMState=" + this.f64657a + ", backfillOption=" + this.f64658b + ")";
    }
}
