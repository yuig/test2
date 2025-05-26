package dt0;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import o82.j0;
import zy.l0;

/* loaded from: classes5.dex */
public final class a0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ts0.b f56224a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f56225b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f56226c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f56227d;

    public a0(ts0.b currentFilterSelection, boolean z13, l0 pinalyticsVMState, j0 multiSectionVMState) {
        Intrinsics.checkNotNullParameter(currentFilterSelection, "currentFilterSelection");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        this.f56224a = currentFilterSelection;
        this.f56225b = z13;
        this.f56226c = pinalyticsVMState;
        this.f56227d = multiSectionVMState;
    }

    public static a0 b(a0 a0Var, ts0.b currentFilterSelection, j0 multiSectionVMState, int i13) {
        if ((i13 & 1) != 0) {
            currentFilterSelection = a0Var.f56224a;
        }
        boolean z13 = (i13 & 2) != 0 ? a0Var.f56225b : false;
        l0 pinalyticsVMState = a0Var.f56226c;
        if ((i13 & 8) != 0) {
            multiSectionVMState = a0Var.f56227d;
        }
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(currentFilterSelection, "currentFilterSelection");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        return new a0(currentFilterSelection, z13, pinalyticsVMState, multiSectionVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f56224a == a0Var.f56224a && this.f56225b == a0Var.f56225b && Intrinsics.d(this.f56226c, a0Var.f56226c) && Intrinsics.d(this.f56227d, a0Var.f56227d);
    }

    public final int hashCode() {
        return this.f56227d.f93634a.hashCode() + jq.b.a(this.f56226c, ep.b.e(this.f56225b, this.f56224a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "HftPinsTabVMState(currentFilterSelection=" + this.f56224a + ", isFiltersVisible=" + this.f56225b + ", pinalyticsVMState=" + this.f56226c + ", multiSectionVMState=" + this.f56227d + ")";
    }
}
