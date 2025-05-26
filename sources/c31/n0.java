package c31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25602a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25603b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.d0 f25604c;

    /* renamed from: d, reason: collision with root package name */
    public final f31.m0 f25605d;

    /* renamed from: e, reason: collision with root package name */
    public final o82.j0 f25606e;

    /* renamed from: f, reason: collision with root package name */
    public final zy.l0 f25607f;

    public n0(String userId, boolean z13, m60.d0 gridColumnCountProvider, f31.m0 searchVMState, o82.j0 sectionVMState, zy.l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(gridColumnCountProvider, "gridColumnCountProvider");
        Intrinsics.checkNotNullParameter(searchVMState, "searchVMState");
        Intrinsics.checkNotNullParameter(sectionVMState, "sectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f25602a = userId;
        this.f25603b = z13;
        this.f25604c = gridColumnCountProvider;
        this.f25605d = searchVMState;
        this.f25606e = sectionVMState;
        this.f25607f = pinalyticsVMState;
    }

    public static n0 b(n0 n0Var, f31.m0 m0Var, o82.j0 j0Var, zy.l0 l0Var, int i13) {
        String userId = n0Var.f25602a;
        boolean z13 = n0Var.f25603b;
        m60.d0 gridColumnCountProvider = n0Var.f25604c;
        if ((i13 & 8) != 0) {
            m0Var = n0Var.f25605d;
        }
        f31.m0 searchVMState = m0Var;
        if ((i13 & 16) != 0) {
            j0Var = n0Var.f25606e;
        }
        o82.j0 sectionVMState = j0Var;
        if ((i13 & 32) != 0) {
            l0Var = n0Var.f25607f;
        }
        zy.l0 pinalyticsVMState = l0Var;
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(gridColumnCountProvider, "gridColumnCountProvider");
        Intrinsics.checkNotNullParameter(searchVMState, "searchVMState");
        Intrinsics.checkNotNullParameter(sectionVMState, "sectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new n0(userId, z13, gridColumnCountProvider, searchVMState, sectionVMState, pinalyticsVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.d(this.f25602a, n0Var.f25602a) && this.f25603b == n0Var.f25603b && Intrinsics.d(this.f25604c, n0Var.f25604c) && Intrinsics.d(this.f25605d, n0Var.f25605d) && Intrinsics.d(this.f25606e, n0Var.f25606e) && Intrinsics.d(this.f25607f, n0Var.f25607f);
    }

    public final int hashCode() {
        return this.f25607f.hashCode() + ep.b.c(this.f25606e.f93634a, (this.f25605d.hashCode() + ((this.f25604c.hashCode() + ep.b.e(this.f25603b, this.f25602a.hashCode() * 31, 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "AllPinsVMState(userId=" + this.f25602a + ", isMe=" + this.f25603b + ", gridColumnCountProvider=" + this.f25604c + ", searchVMState=" + this.f25605d + ", sectionVMState=" + this.f25606e + ", pinalyticsVMState=" + this.f25607f + ")";
    }
}
