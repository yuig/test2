package x91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.l0 f134329a;

    /* renamed from: b, reason: collision with root package name */
    public final o82.j0 f134330b;

    public k0(zy.l0 pinalyticsVMState, o82.j0 multiSectionVMState) {
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        this.f134329a = pinalyticsVMState;
        this.f134330b = multiSectionVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.d(this.f134329a, k0Var.f134329a) && Intrinsics.d(this.f134330b, k0Var.f134330b);
    }

    public final int hashCode() {
        return this.f134330b.f93634a.hashCode() + (this.f134329a.hashCode() * 31);
    }

    public final String toString() {
        return "BlockedAccountsVMState(pinalyticsVMState=" + this.f134329a + ", multiSectionVMState=" + this.f134330b + ")";
    }
}
