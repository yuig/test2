package fa0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ra0.c f61493a;

    /* renamed from: b, reason: collision with root package name */
    public final f30 f61494b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f61495c;

    /* renamed from: d, reason: collision with root package name */
    public final o82.j0 f61496d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.l0 f61497e;

    public j0(ra0.c sourceIds, f30 f30Var, boolean z13, o82.j0 sectionVMState, zy.l0 pinalyticsState) {
        Intrinsics.checkNotNullParameter(sourceIds, "sourceIds");
        Intrinsics.checkNotNullParameter(sectionVMState, "sectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f61493a = sourceIds;
        this.f61494b = f30Var;
        this.f61495c = z13;
        this.f61496d = sectionVMState;
        this.f61497e = pinalyticsState;
    }

    public static j0 b(j0 j0Var, f30 f30Var, o82.j0 j0Var2, zy.l0 l0Var, int i13) {
        ra0.c sourceIds = j0Var.f61493a;
        if ((i13 & 2) != 0) {
            f30Var = j0Var.f61494b;
        }
        f30 f30Var2 = f30Var;
        boolean z13 = j0Var.f61495c;
        if ((i13 & 8) != 0) {
            j0Var2 = j0Var.f61496d;
        }
        o82.j0 sectionVMState = j0Var2;
        if ((i13 & 16) != 0) {
            l0Var = j0Var.f61497e;
        }
        zy.l0 pinalyticsState = l0Var;
        j0Var.getClass();
        Intrinsics.checkNotNullParameter(sourceIds, "sourceIds");
        Intrinsics.checkNotNullParameter(sectionVMState, "sectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new j0(sourceIds, f30Var2, z13, sectionVMState, pinalyticsState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.d(this.f61493a, j0Var.f61493a) && Intrinsics.d(this.f61494b, j0Var.f61494b) && this.f61495c == j0Var.f61495c && Intrinsics.d(this.f61496d, j0Var.f61496d) && Intrinsics.d(this.f61497e, j0Var.f61497e);
    }

    public final int hashCode() {
        int hashCode = this.f61493a.hashCode() * 31;
        f30 f30Var = this.f61494b;
        return this.f61497e.hashCode() + ep.b.c(this.f61496d.f93634a, ep.b.e(this.f61495c, (hashCode + (f30Var == null ? 0 : f30Var.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        return "RemixCloseupVMState(sourceIds=" + this.f61493a + ", sourceCollage=" + this.f61494b + ", useTemplatesUi=" + this.f61495c + ", sectionVMState=" + this.f61496d + ", pinalyticsState=" + this.f61497e + ")";
    }
}
