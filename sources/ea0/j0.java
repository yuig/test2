package ea0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f57963a;

    /* renamed from: b, reason: collision with root package name */
    public final o82.j0 f57964b;

    /* renamed from: c, reason: collision with root package name */
    public final zy.l0 f57965c;

    public j0(boolean z13, o82.j0 sectionVMState, zy.l0 pinalyticsState) {
        Intrinsics.checkNotNullParameter(sectionVMState, "sectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f57963a = z13;
        this.f57964b = sectionVMState;
        this.f57965c = pinalyticsState;
    }

    public static j0 b(j0 j0Var, o82.j0 sectionVMState, zy.l0 pinalyticsState, int i13) {
        boolean z13 = j0Var.f57963a;
        if ((i13 & 2) != 0) {
            sectionVMState = j0Var.f57964b;
        }
        if ((i13 & 4) != 0) {
            pinalyticsState = j0Var.f57965c;
        }
        j0Var.getClass();
        Intrinsics.checkNotNullParameter(sectionVMState, "sectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new j0(z13, sectionVMState, pinalyticsState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f57963a == j0Var.f57963a && Intrinsics.d(this.f57964b, j0Var.f57964b) && Intrinsics.d(this.f57965c, j0Var.f57965c);
    }

    public final int hashCode() {
        return this.f57965c.hashCode() + ep.b.c(this.f57964b.f93634a, Boolean.hashCode(this.f57963a) * 31, 31);
    }

    public final String toString() {
        return "RemixBrowseVMState(isTemplatesUi=" + this.f57963a + ", sectionVMState=" + this.f57964b + ", pinalyticsState=" + this.f57965c + ")";
    }
}
