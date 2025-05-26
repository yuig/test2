package mt;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import nt.x0;

/* loaded from: classes3.dex */
public final class r implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final pu.x f88122a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f88123b;

    public r(pu.x coreVMState, x0 bottomSheetVMState) {
        Intrinsics.checkNotNullParameter(coreVMState, "coreVMState");
        Intrinsics.checkNotNullParameter(bottomSheetVMState, "bottomSheetVMState");
        this.f88122a = coreVMState;
        this.f88123b = bottomSheetVMState;
    }

    public static r b(r rVar, x0 bottomSheetVMState) {
        pu.x coreVMState = rVar.f88122a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(coreVMState, "coreVMState");
        Intrinsics.checkNotNullParameter(bottomSheetVMState, "bottomSheetVMState");
        return new r(coreVMState, bottomSheetVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f88122a, rVar.f88122a) && Intrinsics.d(this.f88123b, rVar.f88123b);
    }

    public final int hashCode() {
        return this.f88123b.hashCode() + (this.f88122a.hashCode() * 31);
    }

    public final String toString() {
        return "LeadGenVMState(coreVMState=" + this.f88122a + ", bottomSheetVMState=" + this.f88123b + ")";
    }
}
