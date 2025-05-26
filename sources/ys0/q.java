package ys0;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import o82.j0;
import zy.l0;

/* loaded from: classes5.dex */
public final class q implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f140125a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f140126b;

    public q(l0 pinalyticsVMState, j0 multiSectionVMState) {
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        this.f140125a = pinalyticsVMState;
        this.f140126b = multiSectionVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f140125a, qVar.f140125a) && Intrinsics.d(this.f140126b, qVar.f140126b);
    }

    public final int hashCode() {
        return this.f140126b.f93634a.hashCode() + (this.f140125a.hashCode() * 31);
    }

    public final String toString() {
        return "SbaHftBoardsTabVMState(pinalyticsVMState=" + this.f140125a + ", multiSectionVMState=" + this.f140126b + ")";
    }
}
