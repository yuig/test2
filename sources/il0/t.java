package il0;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import sk0.y;

/* loaded from: classes5.dex */
public final class t implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final y f72545a;

    /* renamed from: b, reason: collision with root package name */
    public final tk0.i0 f72546b;

    public t(y floatingToolbarVMState, tk0.i0 organizeFloatingToolbarVMState) {
        Intrinsics.checkNotNullParameter(floatingToolbarVMState, "floatingToolbarVMState");
        Intrinsics.checkNotNullParameter(organizeFloatingToolbarVMState, "organizeFloatingToolbarVMState");
        this.f72545a = floatingToolbarVMState;
        this.f72546b = organizeFloatingToolbarVMState;
    }

    public static t b(t tVar, y floatingToolbarVMState, tk0.i0 organizeFloatingToolbarVMState, int i13) {
        if ((i13 & 1) != 0) {
            floatingToolbarVMState = tVar.f72545a;
        }
        if ((i13 & 2) != 0) {
            organizeFloatingToolbarVMState = tVar.f72546b;
        }
        tVar.getClass();
        Intrinsics.checkNotNullParameter(floatingToolbarVMState, "floatingToolbarVMState");
        Intrinsics.checkNotNullParameter(organizeFloatingToolbarVMState, "organizeFloatingToolbarVMState");
        return new t(floatingToolbarVMState, organizeFloatingToolbarVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f72545a, tVar.f72545a) && Intrinsics.d(this.f72546b, tVar.f72546b);
    }

    public final int hashCode() {
        return this.f72546b.hashCode() + (this.f72545a.hashCode() * 31);
    }

    public final String toString() {
        return "BoardVMState(floatingToolbarVMState=" + this.f72545a + ", organizeFloatingToolbarVMState=" + this.f72546b + ")";
    }
}
