package ny0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.j0 f92627a;

    /* renamed from: b, reason: collision with root package name */
    public final zy.l0 f92628b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f92629c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f92630d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f92631e;

    public t0(o82.j0 multiSectionVMState, zy.l0 pinalyticsVMState, boolean z13, Integer num, Map experimentsGroupInfo) {
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        this.f92627a = multiSectionVMState;
        this.f92628b = pinalyticsVMState;
        this.f92629c = z13;
        this.f92630d = num;
        this.f92631e = experimentsGroupInfo;
    }

    public static t0 b(t0 t0Var, o82.j0 j0Var, zy.l0 l0Var, Integer num, int i13) {
        if ((i13 & 1) != 0) {
            j0Var = t0Var.f92627a;
        }
        o82.j0 multiSectionVMState = j0Var;
        if ((i13 & 2) != 0) {
            l0Var = t0Var.f92628b;
        }
        zy.l0 pinalyticsVMState = l0Var;
        boolean z13 = t0Var.f92629c;
        if ((i13 & 8) != 0) {
            num = t0Var.f92630d;
        }
        Map experimentsGroupInfo = t0Var.f92631e;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        return new t0(multiSectionVMState, pinalyticsVMState, z13, num, experimentsGroupInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.d(this.f92627a, t0Var.f92627a) && Intrinsics.d(this.f92628b, t0Var.f92628b) && this.f92629c == t0Var.f92629c && Intrinsics.d(this.f92630d, t0Var.f92630d) && Intrinsics.d(this.f92631e, t0Var.f92631e);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f92629c, jq.b.a(this.f92628b, this.f92627a.f93634a.hashCode() * 31, 31), 31);
        Integer num = this.f92630d;
        return this.f92631e.hashCode() + ((e13 + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "NuxPinFeedVMState(multiSectionVMState=" + this.f92627a + ", pinalyticsVMState=" + this.f92628b + ", inBatchRepinsExp=" + this.f92629c + ", sectionIndexAwaitingPinsFromShowMore=" + this.f92630d + ", experimentsGroupInfo=" + this.f92631e + ")";
    }
}
