package vn0;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import sk0.y;

/* loaded from: classes5.dex */
public final class m implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final y f126265a;

    /* renamed from: b, reason: collision with root package name */
    public final tk0.i0 f126266b;

    public m(y floatingToolbarVMState, tk0.i0 organizeFloatingToolbarVMState) {
        Intrinsics.checkNotNullParameter(floatingToolbarVMState, "floatingToolbarVMState");
        Intrinsics.checkNotNullParameter(organizeFloatingToolbarVMState, "organizeFloatingToolbarVMState");
        this.f126265a = floatingToolbarVMState;
        this.f126266b = organizeFloatingToolbarVMState;
    }

    public static m b(m mVar, y floatingToolbarVMState, tk0.i0 organizeFloatingToolbarVMState, int i13) {
        if ((i13 & 1) != 0) {
            floatingToolbarVMState = mVar.f126265a;
        }
        if ((i13 & 2) != 0) {
            organizeFloatingToolbarVMState = mVar.f126266b;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(floatingToolbarVMState, "floatingToolbarVMState");
        Intrinsics.checkNotNullParameter(organizeFloatingToolbarVMState, "organizeFloatingToolbarVMState");
        return new m(floatingToolbarVMState, organizeFloatingToolbarVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f126265a, mVar.f126265a) && Intrinsics.d(this.f126266b, mVar.f126266b);
    }

    public final int hashCode() {
        return this.f126266b.hashCode() + (this.f126265a.hashCode() * 31);
    }

    public final String toString() {
        return "BoardSectionVMState(floatingToolbarVMState=" + this.f126265a + ", organizeFloatingToolbarVMState=" + this.f126266b + ")";
    }
}
