package f31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f61020a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f61021b;

    /* renamed from: c, reason: collision with root package name */
    public final k51.v f61022c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.l0 f61023d;

    public m0(boolean z13, boolean z14, k51.v viewOptionsVMState, zy.l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(viewOptionsVMState, "viewOptionsVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f61020a = z13;
        this.f61021b = z14;
        this.f61022c = viewOptionsVMState;
        this.f61023d = pinalyticsVMState;
    }

    public static m0 b(m0 m0Var, boolean z13, k51.v viewOptionsVMState, zy.l0 pinalyticsVMState, int i13) {
        if ((i13 & 1) != 0) {
            z13 = m0Var.f61020a;
        }
        boolean z14 = m0Var.f61021b;
        if ((i13 & 4) != 0) {
            viewOptionsVMState = m0Var.f61022c;
        }
        if ((i13 & 8) != 0) {
            pinalyticsVMState = m0Var.f61023d;
        }
        m0Var.getClass();
        Intrinsics.checkNotNullParameter(viewOptionsVMState, "viewOptionsVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new m0(z13, z14, viewOptionsVMState, pinalyticsVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f61020a == m0Var.f61020a && this.f61021b == m0Var.f61021b && Intrinsics.d(this.f61022c, m0Var.f61022c) && Intrinsics.d(this.f61023d, m0Var.f61023d);
    }

    public final int hashCode() {
        return this.f61023d.hashCode() + ((this.f61022c.hashCode() + ep.b.e(this.f61021b, Boolean.hashCode(this.f61020a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "SearchBarVMState(isMe=" + this.f61020a + ", allowBoardCreateOption=" + this.f61021b + ", viewOptionsVMState=" + this.f61022c + ", pinalyticsVMState=" + this.f61023d + ")";
    }

    public /* synthetic */ m0(boolean z13, boolean z14, k51.v vVar, zy.l0 l0Var, int i13) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? false : z14, (i13 & 4) != 0 ? new k51.v(null, 7) : vVar, (i13 & 8) != 0 ? new zy.l0((h32.i0) null, 3) : l0Var);
    }
}
