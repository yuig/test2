package rb1;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import o82.j0;
import zy.l0;

/* loaded from: classes5.dex */
public final class v implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f107096a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f107097b;

    public v(l0 pinalyticsVMState, j0 multiSectionVMState) {
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f107096a = multiSectionVMState;
        this.f107097b = pinalyticsVMState;
    }

    public static v b(v vVar, j0 multiSectionVMState) {
        l0 pinalyticsVMState = vVar.f107097b;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new v(pinalyticsVMState, multiSectionVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f107096a, vVar.f107096a) && Intrinsics.d(this.f107097b, vVar.f107097b);
    }

    public final int hashCode() {
        return this.f107097b.hashCode() + (this.f107096a.f93634a.hashCode() * 31);
    }

    public final String toString() {
        return "PasscodeSettingsVMState(multiSectionVMState=" + this.f107096a + ", pinalyticsVMState=" + this.f107097b + ")";
    }
}
