package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y5 implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final x5 f133725a;

    public y5(x5 x5Var) {
        this.f133725a = x5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y5) && Intrinsics.d(this.f133725a, ((y5) obj).f133725a);
    }

    public final int hashCode() {
        x5 x5Var = this.f133725a;
        if (x5Var == null) {
            return 0;
        }
        return x5Var.hashCode();
    }

    public final String toString() {
        return "Data(v3CreateRequestToJoinBoardMutation=" + this.f133725a + ")";
    }
}
