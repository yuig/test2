package ws;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import xs.g0;

/* loaded from: classes3.dex */
public final class z implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final pu.x f131076a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f131077b;

    public z(pu.x coreVMState, g0 bottomSheetVMState) {
        Intrinsics.checkNotNullParameter(coreVMState, "coreVMState");
        Intrinsics.checkNotNullParameter(bottomSheetVMState, "bottomSheetVMState");
        this.f131076a = coreVMState;
        this.f131077b = bottomSheetVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f131076a, zVar.f131076a) && Intrinsics.d(this.f131077b, zVar.f131077b);
    }

    public final int hashCode() {
        return this.f131077b.hashCode() + (this.f131076a.hashCode() * 31);
    }

    public final String toString() {
        return "CartingVMState(coreVMState=" + this.f131076a + ", bottomSheetVMState=" + this.f131077b + ")";
    }
}
